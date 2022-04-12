### Final Project - Individual Assignment
> RYAN SOON HAN LU 82078023

# Conversational Agent

#### Updated README.md

### List of Incorporated APIs
-	Google Geocoding API
-	Google Street View Static API

### Project Description

The objective of this programming project is to enhance the functionality of the conversational agent by incorporating two public APIs into the project. The APIs I have chosen are the Google Geocoding API and the Google Street View Static API. The reason I have selected to incorporate these two APIs into the project is because I can combine the output of the two APIs to create a unique feature.

### API 1: Google Geocoding API
Within the conversation between the user and the dialogue agent, the user may ask the chatbot about its current location, such as “where do you live?”, then the program will output “3333 University Way, Kelowna, BC” at the same time, the program will request the Google Geocoding API to convert the address above to its corresponding geographic coordinates. The output of the API will be in JSON, so I used JSON parser to extract latitude and longitude from it. 

### API 2: Google Street View Static API
Based on the extracted geographic coordinates produced by the Geocoding API, I incorporated the Google Street View Static API to obtain a static image of the geographic location by specifying latitude and longitude parameters in a URL, which is sent through a standard HTTP request. This image is saved in the same directory as the program. By using this technique, I have incorporated an extra feature where the chatbot will ask the user for an address. If the user enters a valid address, the program will produce a corresponding street view image of the address. The image is then saved locally into the user’s computer.

#### Sample output:
Input: 3333 University Way, Kelowna, BC

Output:

![UBCO](https://user-images.githubusercontent.com/77523948/162879253-a4807a18-6785-49de-96a2-e2f68c62a349.png)


<br>
<br>

***

Project Description:


The objective of this programming project is to practice team collaboration and management principles within a software engineering environment – through the creation of an interactive program. The program’s aim is to create a dynamic conversational agent that is able to interact and respond to a user’s input. Within our chosen setup, the agent will imitate an old friend and enable the user to participate in conversations centering around topics such as favourite food, hobbies, and books. The project will be completed using project management tools such as JIRA and employ Java as the object-oriented programming language.

SDLC Overview:


The chosen Software Development Life Cycle (SDLC) model for the execution of this project is the incremental/agile model. Despite the limitations of the agile model, our team found it to be the best suited option for our requirements and team setup for the following reasons:
First and foremost, our team decided to follow an iterative approach. With this, planning is incremental and it is easier to change the process as required. Additionally the amount of analysis and documentation that has to be redone is much less than is required for the waterfall model. Lastly, we found that agile methods aligned with our team project management outlooks. Overall, making it the best choice for our team.

SDLC Breakdown:

    ● Requirements Definition and Project Planning:
        ○ Github Creation: create a github account and team repository for the project
        ○ Criteria Itemization: itemize project demands and listed criteria
        ○ SLDC: pick an appropriate SLDC that fits the team dynamic and project requirements
        ○ Workload Division (WBS part 1): divide the workload within the project team, each
          team member focusing on an area well-suited with their personal strengths
            ■ Workload Equality: within the workload division, ensure that each team member has an equal amount of work
            ■ Sector Managers: plan who will be in charge of the documentation, the project management responsibilities, the coding workload, and the final presentation
        ○ Timeline Plan (WBS part 2: according to the workload division, plan the project timeline and the estimated date of which each stage of the software development life cycle should be completed.
        ○ Gantt Chart: creation of a Gantt chart showing start and end dates for each task, andshowing dependencies across task
    ● Software Design:
        ○ Program Designing: make a design of what the program/chatbot should do, this
          includes:
            ■ a written design on the possible auto-generated responses
            ■ a document detailing the conversations the chatbot will gear the users towards
            ■ a scheme of what the overall functionality of the chatbot should be
        ○ Program Limitations: make a list of the limitations regarding the program
        ○ Program Prototype: design a prototype including the basic functionality of the final program
        ○ Prototype Feedback: ensure every team member is on board with moving forward according to the proposed prototype
    ● Code Implementation and Unit Testing
        ○ Code the Program: perform the coding of the program, following the previously agreed upon design
        ○ Testing: test the implemented code and make sure it meets all requirements
            ■ Individual Testing: ensure all team members are happy with the finalized code 
        ○ Implement Changes: if the testing stage reveals that there are faults within the code or fails to meet the requirements, implement the needed changes
    ● Project Completion and Final Steps:
        ○ Video Creation: the creation of the video showcasing the implementation of the program
            ■ Video Requirements: the video should include a live demo of our program, an overview of the team responsibilities, PM graphs of our project repository and the project management tool we used.
            ■ Video Approval: ensure all team members are satisfied with the video
        ○ Peer Evaluation: submit a peer evaluation for all team members
        ○ Project Submission: submit the finalized project on Canvas

Within our second iteration of the project, we decided to follow the same SDLC work cycle, with minor changes. The reasoning behind this is we found the new project requirements were similar to the last, and since our life cycle worked effectively for us last time, it was in our best interest to use it again.  

The WBS and Explanation are included within their own file in the Github Repository
