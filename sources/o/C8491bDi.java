package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8491bDi extends C8486bDd {
    public static final int $stable = 0;
    private final int feeType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeType() {
        return this.feeType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8491bDi(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i) {
        super(c10854bwM, str, str2, str3, str4, 0, 32, null);
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.feeType = i;
    }
}
