
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubSystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArmCommands extends CommandBase {
  // The subsystem the command runs on
  private final ArmSubSystem armSubSystem;

  public ArmCommands(ArmSubSystem subsystem) {
    armSubSystem = subsystem;
    addRequirements(armSubSystem);
  }

  @Override
  public void initialize() {
    armSubSystem.setSpeed(0);
  }

  @Override
  public void execute() {
    armSubSystem.setSpeed(.1);
  }
  

  

  @Override
  public boolean isFinished() {
    return true;
  }
}