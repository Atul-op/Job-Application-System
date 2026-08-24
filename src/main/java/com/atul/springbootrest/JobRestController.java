package com.atul.springbootrest;

import com.atul.springbootrest.model.JobPost;
import com.atul.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class JobRestController
{

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs()
    {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId)
    {
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost)
    {
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost)
    {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public void deleteJob(@PathVariable int postId)
    {
        jobService.deleteJob(postId);
    }

    @GetMapping("load")
    public String load()
    {
        jobService.load();
        return "success";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyboard(@PathVariable("keyword") String keyword)
    {
        return jobService.search(keyword);
    }
}
