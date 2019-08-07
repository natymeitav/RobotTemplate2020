package robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Examplesubsystem extends Subsystem {
    private TalonSRX rightMaster = new TalonSRX(1);
    private VictorSPX Rslave1 = new VictorSPX(3);
    private VictorSPX Rslave2 = new VictorSPX(4);

    private TalonSRX leftMaster = new TalonSRX(2);
    private VictorSPX Lslave1 = new VictorSPX(5);
    private VictorSPX Lslave2 = new VictorSPX(6);
    public Examplesubsystem(){
        Rslave1.follow(rightMaster);
        Rslave2.follow(rightMaster);
        Lslave1.follow(leftMaster);
        Lslave2.follow(leftMaster);
    }
    public void setspeed(double SpeedR, double SpeedL){
        if ((SpeedR > -1 && SpeedR < 1 )&&(SpeedL > -1 && SpeedL < 1 )){
            rightMaster.set(ControlMode.PercentOutput,SpeedR);
            leftMaster.set(ControlMode.PercentOutput,SpeedL);
        }

    }





    @Override
    protected void initDefaultCommand() {

    }
}
