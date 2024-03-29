package robot.subsystems.Commands;

import edu.wpi.first.wpilibj.command.Command;
import robot.Robot;

public class Examplecommand extends Command {


    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.example.setSpeed(-0.1,0.1);
        }

    @Override
    protected boolean isFinished() {
        double turnLeft = Robot.example.getLeftDistance();
        double turnRight = Robot.example.getRightDistance();
        return (turnLeft == 3.3319 && turnRight == -3.3319);
    }

    @Override
    protected void interrupted() {


    }

    @Override
    protected void end() {
        Robot.example.setSpeed(0,0);

    }
}
