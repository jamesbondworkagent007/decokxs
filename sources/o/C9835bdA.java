package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9835bdA extends C9785bcD {
    public final C9758bbd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9758bbd copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9835bdA(boolean z, @NotNull C9758bbd c9758bbd) {
        super(z, false);
        Intrinsics.checkNotNullParameter(c9758bbd, "");
        this.OLrzqt = c9758bbd;
    }
}
