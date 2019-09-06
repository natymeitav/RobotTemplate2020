package robot.subsystems.Commands;
import edu.wpi.first.wpilibj.command.Command;
import org.apache.commons.math3.analysis.function.Abs;
import robot.Robot;

import static java.lang.Math.abs;

public class PIDXD extends Command {
    final static double Kp = 0.5;
    final static double Ki = 0.25;
    final static double Kd = 0.75;
    static double targetDistance = 2.0;
    final static double deltaTime = 0.02;
    static double error;
    static double Integral = 0;
    static double lastError = error;
    static double derivative;
    public PIDXD(){
    }

    @Override
    protected void initialize() {
        targetDistance = Robot.example.getLeftDistance()+2;
    }

    @Override
    protected void execute() {
        error = targetDistance- Robot.example.getLeftDistance();
        Integral += error* deltaTime;
        derivative = (error-lastError)/ deltaTime;
        double run = Kp*error+Ki*derivative+Kd*Integral;
        Robot.example.setSpeed(run,run);
    }

    @Override
    protected boolean isFinished() {
        return abs(error) < 0.1;
    }

    @Override
    protected void interrupted() {


    }

    @Override
    protected void end() {
        Robot.example.setSpeed(0,0 );

    }
}
