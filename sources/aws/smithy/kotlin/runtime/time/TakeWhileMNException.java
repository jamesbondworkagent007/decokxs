package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class TakeWhileMNException extends ParseException {
    private final int expected;
    private final int matched;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExpected() {
        return this.expected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMatched() {
        return this.matched;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeWhileMNException(@NotNull String str, int i, int i2, int i3) {
        super(str, "expected at least " + i2 + " matches of predicate; only matched " + i3, i);
        Intrinsics.checkNotNullParameter(str, "");
        this.expected = i2;
        this.matched = i3;
    }
}
