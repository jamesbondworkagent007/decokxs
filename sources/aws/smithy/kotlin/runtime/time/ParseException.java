package aws.smithy.kotlin.runtime.time;

import aws.smithy.kotlin.runtime.SdkBaseException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class ParseException extends SdkBaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseException(@NotNull String str, @NotNull String str2, int i) {
        super("parse `" + str + "`: error at " + i + ": " + str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
