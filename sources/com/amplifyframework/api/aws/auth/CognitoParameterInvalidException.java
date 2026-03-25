package com.amplifyframework.api.aws.auth;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class CognitoParameterInvalidException extends RuntimeException {
    public CognitoParameterInvalidException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:85) call: com.amplifyframework.api.aws.auth.CognitoParameterInvalidException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ CognitoParameterInvalidException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
