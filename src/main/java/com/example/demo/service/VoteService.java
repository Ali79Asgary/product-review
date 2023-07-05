package com.example.demo.service;

import com.example.demo.model.Vote;

import java.util.List;

public interface VoteService {

    List<Vote> getAllVotes();

    Vote getVoteById(Long id);

    Vote saveVote(Vote vote);

    Vote updateVote(Long id, Vote newVote);

    void deleteVoteById(Long id);
}
