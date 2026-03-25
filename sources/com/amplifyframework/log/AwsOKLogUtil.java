package com.amplifyframework.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AwsOKLogUtil {
    public static final AwsOKLogUtil INSTANCE = new AwsOKLogUtil();
    private static Function1<? super String, Unit> report;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<String, Unit> getReport() {
        return report;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReport(Function1<? super String, Unit> function1) {
        report = function1;
    }

    private AwsOKLogUtil() {
    }

    public final void okLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function1<? super String, Unit> function1 = report;
        if (function1 != null) {
            function1.invoke(str);
        }
    }
}
