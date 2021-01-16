
package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.commands.ArmCommands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubSystem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  TalonFX myFalcon;

  public ArmSubSystem() {

      myFalcon = new TalonFX(11);
    
  }
  @Override
  public void periodic() {
    // TODO Auto-generated method stub
    super.periodic();
    setSpeed(0);

  }

  public void setSpeed(final double speed) {

      myFalcon.set(ControlMode.PercentOutput, speed);

  }

  

}
