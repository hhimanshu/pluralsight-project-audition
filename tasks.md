## Task Instructions
- First, make sure that you have `sbt` installed. Please read `README.md` file on how to install `sbt`
- Second, clone this repository
```shell script
git clone git@github.com:hhimanshu/pluralsight-project-audition.git
```
## How to run
```shell script
# enter into the cloned repo
cd pluralsight-project-audition

# start sbt console
sbt

# once inside, sbt console, run
~test
```
The `~test` command will continuously monitor the changes made to the source or test file.
Once a change is identified, the all tests will run. The goal should be to make sure all the tests pass by
providing the correct implementation. 

### How to make the change to the source file
Open the repository in your your favorite IDE. The scala community usually prefers [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/#section=mac)

Inside the project, there are 2 files
- `src/main/scala/TheSource.scala`  
This is where the learner needs to write the code

- `src/test/scala/TheSourceSpec.scala`  
This is where the test for 3 tasks are written.  

You only need to make changes to `src/main/scala/TheSource.scala` file.
 

### Tasks
- [ ] The first task is to implement `getHello` function in `TheSource.scala`. 
Here, the implementation should return a *non-empty* String which ends with `lo`  
- [ ] The second task is to implement the `getTwoNumbers` function, which returns a list containing any 2 numbers.  
- [ ] The third task is to implement the `add` function that adds the `numbers` provided as the input to the list.

 