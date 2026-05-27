# Slack Clone - Scalable System Design Project

A Slack clone built to learn and implement real-world scalable system design concepts using Spring Boot.

The goal of this project is not just to clone Slack features, but to understand how scalable distributed systems are designed and evolved over time.

---

# Tech Stack

## Backend

- Java
- Spring Boot

## Frontend

- React

## Database

- PostgreSQL

## Planned Infrastructure & Scaling Tools

- Redis
- WebSockets
- Redis Pub/Sub
- Docker
- Load Balancer

---

# Core Features (MVP)

- User Authentication
- Workspaces
- Channels
- Real-time Messaging
- Message History

---

# System Design Concepts Planned

- Horizontal Scaling
- Stateless Servers
- Redis Caching
- Rate Limiting
- Database Indexing
- Database Sharding Concepts
- Pub/Sub Architecture
- Distributed Communication
- Load Balancing
- Real-time Systems

---

# High-Level Architecture

```text
Client (React)
      ↓
Spring Boot API
      ↓
PostgreSQL
```

Future Architecture:

```text
Client
   ↓
Load Balancer
   ↓
Multiple Spring Boot Instances
   ↓
Redis Cache
   ↓
PostgreSQL
```

---

# Project Goals

- Learn scalable backend architecture
- Understand distributed system challenges
- Practice real-world backend engineering
- Explore system design concepts practically

---

# Current Status

Phase 0 — Planning & Architecture
