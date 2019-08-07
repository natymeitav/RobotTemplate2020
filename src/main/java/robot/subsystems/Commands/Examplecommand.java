package robot.subsystems.Commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import static robot.Robot.example;

public class Examplecommand extends Command {
    Timer timer = new Timer();

    @Override
    protected void initialize() {
        example.setspeed(0.2,0.2);
        timer.start();
    }

    @Override
    protected void execute() {
        if (timer.get() > 1){
            example.setspeed(-0.2,-0.2);
        }

    }

    @Override
    protected boolean isFinished() {
        return timer.get() > 2;
    }

    @Override
    protected void interrupted() {

    }

    @Override
    protected void end() {
        example.setspeed(0,0);
    }
}
