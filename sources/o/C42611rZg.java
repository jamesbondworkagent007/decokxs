package o;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C42611rZg implements rYZ {
    public final CopyOnWriteArrayList<rXM> KWHzl = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<rXP> copydefault = new CopyOnWriteArrayList<>();

    @yCM
    public C42611rZg() {
    }

    @Override // o.rYZ
    public void copydefault(@NotNull rXP rxp) {
        Intrinsics.checkNotNullParameter(rxp, "");
        this.copydefault.add(rxp);
    }

    @Override // o.rYZ
    public void KWHzl(@NotNull rXP rxp) {
        Intrinsics.checkNotNullParameter(rxp, "");
        this.copydefault.remove(rxp);
    }

    @Override // o.rYZ
    public void AEQbTJ(@NotNull rXM rxm) {
        Intrinsics.checkNotNullParameter(rxm, "");
        this.KWHzl.add(rxm);
    }
}
