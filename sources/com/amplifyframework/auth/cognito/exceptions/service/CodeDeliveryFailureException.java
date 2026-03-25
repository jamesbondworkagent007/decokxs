package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public class CodeDeliveryFailureException extends ServiceException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CodeDeliveryFailureException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r1v0 java.lang.Throwable))
 A[MD:(java.lang.Throwable):void (m)] (LINE:23) call: com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException.<init>(java.lang.Throwable):void type: THIS */
    public /* synthetic */ CodeDeliveryFailureException(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    public CodeDeliveryFailureException(Throwable th) {
        super("Error in delivering the confirmation code.", "Retry operation and send another confirmation code.", th);
    }
}
