package org.firstinspires.ftc.teamcode;


        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
        import com.qualcomm.robotcore.eventloop.opmode.Disabled;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.util.ElapsedTime;

        import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

@Autonomous (name="AutonomousPeriod", group="hi")
//dde@Disabled
public class PushbotAutoDriveByTime_Linear extends LinearOpMode {

    /* Declare OpMode members. */
    HardwarePushbot robot = new HardwarePushbot();   // Use a Pushbot's hardware
    private ElapsedTime runtime = new ElapsedTime();


    static final double FORWARD_SPEED = 0.6;
    static final double TURN_SPEED = 0.5;

    @Override
    public void runOpMode() {

        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class do.0s all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Step through each leg of the path, ensuring that the Auto mode has not been stopped along the way

        // Motors
        DcMotor rightFront;
        DcMotor leftFront;
        DcMotor rightBack;
        DcMotor leftBack;

        rightFront = hardwareMap.dcMotor.get("right_drive");
        leftFront = hardwareMap.dcMotor.get("left_drive");
        rightBack = hardwareMap.dcMotor.get("right_drive2");
        leftBack = hardwareMap.dcMotor.get("left_drive2");
//    leftArm = hardwareMap.servo.get("left_arm");
        //  rightArm = hardwareMap.servo.get("right_arm");

        // Step 1:  Drive forward for 10 seconds
        leftFront.setPower(FORWARD_SPEED);
        rightFront.setPower(FORWARD_SPEED);
        leftBack.setPower(FORWARD_SPEED);
        rightBack.setPower(FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 10.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


    }
}

