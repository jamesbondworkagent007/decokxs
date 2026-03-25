package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5169Hj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IncompleteException extends ParseException {
    private final AbstractC5169Hj needed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5169Hj getNeeded() {
        return this.needed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompleteException(@NotNull String str, @NotNull AbstractC5169Hj abstractC5169Hj) {
        super(str, abstractC5169Hj.toString(), str.length() - 1);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC5169Hj, "");
        this.needed = abstractC5169Hj;
    }
}
