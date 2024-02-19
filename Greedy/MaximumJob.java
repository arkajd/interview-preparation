// There are N jobs to be done, but you can do only one job at a time.
// Given an array A denoting the start time of the jobs and an array B denoting the finish time of the jobs.
// Your aim is to select jobs in such a way so that you can finish the maximum number of jobs.

// Return the maximum number of jobs you can finish.

package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumJob {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 6));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(9, 8, 9));
        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int length = A.size();

        if(length<=1){
            return length;
        }

        // create list of jobs, will be easier to sort Object
        List<Job> jobs = new ArrayList<>();
        for(int i=0; i<length; i++){
            jobs.add(new Job(A.get(i), B.get(i)));
        }

        // sort jobs based on their start times
        Collections.sort(jobs, (job1, job2)->job1.startTime-job2.startTime);

        Job currentJob = jobs.get(0);
        int count = 1;

        for(int i=1; i<length; i++){
            Job newJob = jobs.get(i);

            // update current job with new job since it is getting finished before the current job
            if(newJob.endTime<currentJob.endTime){
                currentJob = newJob;
            }
            else{
                // overlapping intervals, can not consider this job
                if(newJob.startTime<currentJob.endTime){
                    continue;
                }
                // non overlapping interval, make this as current job as this is doable
                // increase count by 1
                else{
                    currentJob = newJob;
                    count++;
                }
            }
        }
        return count;

    }
}

class Job {
    int startTime;
    int endTime;

    public Job(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
}