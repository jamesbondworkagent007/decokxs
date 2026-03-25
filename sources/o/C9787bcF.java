package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bcF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9787bcF extends C9785bcD {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9787bcF(boolean z, @NotNull java.lang.String str) {
        super(z, true);
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }
}
