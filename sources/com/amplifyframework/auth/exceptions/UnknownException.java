package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class UnknownException extends AuthException {
    public static final Companion Companion = new Companion(null);
    public static final String RECOVERY_SUGGESTION_WITHOUT_THROWABLE = "Sorry, we don't have a suggested fix for this error yet.";
    public static final String RECOVERY_SUGGESTION_WITH_THROWABLE = "See the attached exception for more details";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnknownException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("An unclassified error prevented this operation.") : (r1v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:24) call: com.amplifyframework.auth.exceptions.UnknownException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ UnknownException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "An unclassified error prevented this operation." : str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownException(@NotNull String str, Throwable th) {
        super(str, th == null ? RECOVERY_SUGGESTION_WITH_THROWABLE : "Sorry, we don't have a suggested fix for this error yet.", th);
        Intrinsics.checkNotNullParameter(str, "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.exceptions.UnknownException.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
