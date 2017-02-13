package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by admin on 11/29/16. Edited by Haze and rewritten by Henry on 12/14/16.
 */
@TeleOp(name = "control_period", group = "hi")
public class MainRoboticsController extends OpMode {
    DcMotor rightFront;
    DcMotor leftFront;
    DcMotor rightBack;
    DcMotor leftBack;
    //Servo leftArm;
  //  Servo rightArm;
/*
    @Override
    public void runOpMode() throws InterruptedException {
        c

        waitForStart();

        while (opModeIsActive()) {
            //Left Forward
            leftBack.setPower(-gamepad1.left_stick_y);
            leftFront.setPower(-gamepad1.left_stick_y);

            //Left Backward
  /*          leftBack.setPower(gamepad1.left_stick_y);
            leftFront.setPower(gamepad1.left_stick_y);
    */        //Right Forward
  //          rightBack.setPower(gamepad1.right_stick_y);
    //        rightFront.setPower(gamepad1.right_stick_y);

            //Right Backward
            /*
            rightBack.setPower(-gamepad1.right_stick_y);
            rightFront.setPower(-gamepad1.right_stick_y);
*/

    @Override
    public void init() {
        rightFront = hardwareMap.dcMotor.get("right_drive");
        leftFront = hardwareMap.dcMotor.get("left_drive");
        rightBack = hardwareMap.dcMotor.get("right_drive2");
        leftBack = hardwareMap.dcMotor.get("left_drive2");
    //    leftArm = hardwareMap.servo.get("left_arm");
      //  rightArm = hardwareMap.servo.get("right_arm");
    }

    @Override
    public void loop() {
        leftBack.setPower(-gamepad1.right_stick_y);
        leftFront.setPower(-gamepad1.right_stick_y);

        //Left Backward
  /*          leftBack.setPower(gamepad1.left_stick_y);
            leftFront.setPower(gamepad1.left_stick_y);
    */        //Right Forward
        rightBack.setPower(gamepad1.left_stick_y);
        rightFront.setPower(gamepad1.left_stick_y);
    }
}

