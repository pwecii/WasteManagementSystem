# Automated Waste Management System

A simple Java project that demonstrates the **Chain of Responsibility design pattern** through an automated waste collection and disposal process.

## Description

This system simulates how municipalities can automate waste management by assigning different waste collectors to handle specific types of waste. When a waste container reaches its capacity, the system triggers a collection request. The request passes through a chain of collectors until the appropriate collector processes the waste.

The system supports the following waste types:

- Organic Waste
- Recyclable Waste
- Hazardous Waste

Each waste type is handled by a corresponding waste collector in the chain.


## How It Works

1. Waste containers store information about waste type and capacity.
2. When a container becomes full, the system triggers the waste collection process.
3. The request is passed through a chain of waste collectors.
4. The collector responsible for the specific waste type handles the disposal.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Chain of Responsibility Design Pattern

## Purpose

This project demonstrates how the Chain of Responsibility pattern can be applied to automate and organize waste collection processes in a structured and scalable way.
