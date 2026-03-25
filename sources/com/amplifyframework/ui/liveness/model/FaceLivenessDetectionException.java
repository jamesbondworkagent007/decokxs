package com.amplifyframework.ui.liveness.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class FaceLivenessDetectionException {
    public static final int $stable = 8;
    private String livenessCheckState;
    private final String message;
    private final String recoverySuggestion;
    private Boolean runningFreshness;
    private final Throwable throwable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLivenessCheckState() {
        return this.livenessCheckState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecoverySuggestion() {
        return this.recoverySuggestion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRunningFreshness() {
        return this.runningFreshness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLivenessCheckState(String str) {
        this.livenessCheckState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunningFreshness(Boolean bool) {
        this.runningFreshness = bool;
    }

    public FaceLivenessDetectionException(@NotNull String str, @NotNull String str2, Throwable th, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.message = str;
        this.recoverySuggestion = str2;
        this.throwable = th;
        this.livenessCheckState = str3;
        this.runningFreshness = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Retry the face liveness check.") : (r8v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r9v0 java.lang.Throwable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable, java.lang.String, java.lang.Boolean):void (m)] (LINE:18) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.<init>(java.lang.String, java.lang.String, java.lang.Throwable, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FaceLivenessDetectionException(String str, String str2, Throwable th, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "Retry the face liveness check." : str2, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }

    public static final class SessionNotFoundException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SessionNotFoundException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Session not found.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Enter a valid session ID.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:25) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.SessionNotFoundException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ SessionNotFoundException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Session not found." : str, (i & 2) != 0 ? "Enter a valid session ID." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionNotFoundException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class AccessDeniedException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AccessDeniedException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Not authorized to perform a face liveness check.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Valid credentials are required for the face liveness check.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:31) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.AccessDeniedException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ AccessDeniedException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Not authorized to perform a face liveness check." : str, (i & 2) != 0 ? "Valid credentials are required for the face liveness check." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccessDeniedException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class CameraPermissionDeniedException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CameraPermissionDeniedException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Camera permissions have not been granted.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Prompt the user to grant camera permission.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:37) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.CameraPermissionDeniedException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ CameraPermissionDeniedException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Camera permissions have not been granted." : str, (i & 2) != 0 ? "Prompt the user to grant camera permission." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraPermissionDeniedException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class SessionTimedOutException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SessionTimedOutException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Session timed out.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Retry the face liveness check and prompt the user to follow the on screen instructions.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:43) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.SessionTimedOutException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ SessionTimedOutException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Session timed out." : str, (i & 2) != 0 ? "Retry the face liveness check and prompt the user to follow the on screen instructions." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionTimedOutException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class UserCancelledException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UserCancelledException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("User cancelled the face liveness check.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Retry the face liveness check.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:50) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.UserCancelledException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ UserCancelledException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "User cancelled the face liveness check." : str, (i & 2) != 0 ? "Retry the face liveness check." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserCancelledException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class VideoEncodingException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VideoEncodingException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Video encoding failed.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("The device may not support video encoding. Please try again or use a different device.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:56) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.VideoEncodingException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ VideoEncodingException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Video encoding failed." : str, (i & 2) != 0 ? "The device may not support video encoding. Please try again or use a different device." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoEncodingException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class VideoMuxingException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VideoMuxingException() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Video muxer creation failed.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Retry the face liveness check.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:63) call: com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException.VideoMuxingException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ VideoMuxingException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Video muxer creation failed." : str, (i & 2) != 0 ? "Retry the face liveness check." : str2, (i & 4) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoMuxingException(@NotNull String str, @NotNull String str2, Throwable th) {
            super(str, str2, th, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    public static final class FaceInOvalMatchExceededTimeLimitException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        public FaceInOvalMatchExceededTimeLimitException() {
            super("Face did not match oval within time limit.", null, null, null, null, 30, null);
        }
    }

    public static final class CrashCatchException extends FaceLivenessDetectionException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CrashCatchException(@NotNull String str, Throwable th) {
            super(str, null, th, null, null, 26, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
