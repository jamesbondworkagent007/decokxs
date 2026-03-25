package com.okinc.web3.security.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class RetryUtilsError extends Exception {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.web3.security.utils.RetryUtilsError.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RetryUtilsError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class GenUtilsError extends RetryUtilsError {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenUtilsError(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    private RetryUtilsError(String str) {
        super(str);
    }
}
