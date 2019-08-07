package robot.subsystems.Commands;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.command.Command;
import robot.Robot;

public class distanceDrive extends Command {
private Robot robot = new Robot();

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        robot.example.setspeed(0.4,0.4);
    }

    @Override
    protected boolean isFinished() {
        return robot.example.getLeftDistance() > 1 && robot.example.getRightDistance() > 1;
    }

    @Override
    protected void interrupted() {

    }

    @Override
    protected void end() {
        robot.example.setspeed(0,0);
    }

}
