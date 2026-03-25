package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22976hpX extends AbstractC22977hpY {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22976hpX(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.AbstractC22977hpY
    public AbstractC22974hpV copydefault() {
        return new C23094hrj(fetchVPNInfo(), this);
    }
}
