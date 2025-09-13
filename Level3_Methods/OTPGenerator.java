//7 Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same

import java.util.Arrays;

public class OTPGenerator {
    public static int generateOTP() {
    return 100000 + (int)(Math.random() * 900000);
}

public static boolean areUnique(int[] otps) {
    for (int i = 0; i < otps.length; i++) {
        for (int j = i + 1; j < otps.length; j++) {
            if (otps[i] == otps[j]) return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    int[] otpArray = new int[10];
    for (int i = 0; i < 10; i++) {
        otpArray[i] = generateOTP();
    }

    System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
    if (areUnique(otpArray)) {
        System.out.println("All OTPs are unique.");
    } else {
        System.out.println("Some OTPs are repeated.");
    }
}

}