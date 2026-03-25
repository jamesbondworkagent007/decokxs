package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class CodeValidationException extends ServiceException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CodeValidationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Failed to parse code from the fetch token Uri") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:23) call: com.amplifyframework.auth.cognito.exceptions.service.CodeValidationException.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ CodeValidationException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Failed to parse code from the fetch token Uri" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeValidationException(@NotNull String str) {
        super(str, "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
