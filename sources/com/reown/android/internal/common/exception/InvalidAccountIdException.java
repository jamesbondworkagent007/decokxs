package com.reown.android.internal.common.exception;

import com.reown.android.internal.common.model.AccountId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class InvalidAccountIdException extends WalletConnectException {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.reown.android.internal.common.exception.InvalidAccountIdException.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidAccountIdException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAccountIdException(String str) {
        super("AccountId: " + AccountId.m7216toStringimpl(str) + " is not CAIP-10 complaint");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
