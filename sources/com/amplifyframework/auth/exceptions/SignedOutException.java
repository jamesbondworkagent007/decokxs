package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class SignedOutException extends AuthException {
    public static final Companion Companion = new Companion(null);
    public static final String RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED = "Please sign in and reattempt the operation.";
    public static final String RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE = "If you have guest access enabled, please check that your device is online and try again. Otherwise if guest access is not enabled, you'll need to sign in and try again.";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignedOutException() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("You are currently signed out.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000a: SGET  A[WRAPPED] com.amplifyframework.auth.exceptions.SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:25) call: com.amplifyframework.auth.exceptions.SignedOutException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ SignedOutException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "You are currently signed out." : str, (i & 2) != 0 ? RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED : str2, (i & 4) != 0 ? null : th);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.exceptions.SignedOutException.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedOutException(@NotNull String str, @NotNull String str2, Throwable th) {
        super(str, str2, th);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
