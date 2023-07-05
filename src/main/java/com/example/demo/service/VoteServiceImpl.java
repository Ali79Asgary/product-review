package com.example.demo.service;

import com.example.demo.model.Vote;
import com.example.demo.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService {

    private final VoteRepository voteRepository;

    @Override
    public List<Vote> getAllVotes() {
        return null;
    }

    @Override
    public Vote getVoteById(Long id) {
        return null;
    }

    @Override
    public Vote saveVote(Vote vote) {
        return null;
    }

    @Override
    public Vote updateVote(Long id, Vote newVote) {
        return null;
    }

    @Override
    public void deleteVoteById(Long id) {

    }
}
