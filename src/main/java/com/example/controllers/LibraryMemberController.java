package com.example.controllers;

import com.example.models.LibraryMember;
import com.example.repositories.LibraryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class LibraryMemberController {

    @Autowired
    private LibraryMemberRepository memberRepository;

    @GetMapping
    public List<LibraryMember> getAllMembers() {
        return memberRepository.findAll();
    }

    @PostMapping
    public LibraryMember addMember(@RequestBody LibraryMember member) {
        return memberRepository.save(member);
    }

    @GetMapping("/{id}")
    public LibraryMember getMemberById(@PathVariable Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
    }

    @DeleteMapping("/{id}")
    public String deleteMember(@PathVariable Long id) {
        memberRepository.deleteById(id);
        return "Member deleted!";
    }
}