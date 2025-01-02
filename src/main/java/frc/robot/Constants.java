package frc.robot;

public class Constants {
    
    public static final int kSparkMaxId = 0;
    public static final int kTalonFXId = 0;

    public static final boolean kSparkMaxInverted = true;
    public static final boolean kTalonFXInverted = true;
    
    public static final double kGearRatio = 1.0;

    public static final double kWheelDiameterMeters = 1.0;

    public static final double kMaxNeoRPM = 5676.0;

    //Radians
    public static final double kPositionConversionFactor = 2 * Math.PI * kGearRatio;

    //Meters
    //public static final double kPositionConversionFactor = kWheelDiameterMeters * Math.PI * kGearRatio;

    public static final double kVelocityConversionFactor = kPositionConversionFactor / 60;

    public static final double kMaxVelocity = kMaxNeoRPM*kVelocityConversionFactor;

    public static final double kMaxDistanceMeters = 5.0;
    
    public static final double kmaxVoltsNeo = 12;

    public static double kP = 0;
    public static double kI = 0;
    public static double kD = 0;

    public static final double kS = 0;
    public static final double kV = 0.26;
    public static final double kA = 1.11;
}

