package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32904mmQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32901mmN implements InterfaceC32904mmQ.StateListAnimator {
    public final C32900mmM AEQbTJ;
    public final InterfaceC32874mln EZpvd;
    public final int KWHzl;
    public int OLrzqt;
    public final java.util.List<InterfaceC32904mmQ> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32904mmQ.StateListAnimator
    public C32900mmM KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32904mmQ.StateListAnimator
    public InterfaceC32874mln OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.mmQ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32901mmN(@NotNull InterfaceC32874mln interfaceC32874mln, @NotNull C32900mmM c32900mmM, @NotNull java.util.List<? extends InterfaceC32904mmQ> list, int i) {
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(c32900mmM, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = interfaceC32874mln;
        this.AEQbTJ = c32900mmM;
        this.copydefault = list;
        this.KWHzl = i;
    }

    public static /* synthetic */ C32901mmN copy$OKAnalytics_track$default(C32901mmN c32901mmN, int i, C32900mmM c32900mmM, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c32901mmN.KWHzl;
        }
        if ((i2 & 2) != 0) {
            c32900mmM = c32901mmN.AEQbTJ;
        }
        return c32901mmN.copydefault(i, c32900mmM);
    }

    public final C32901mmN copydefault(int i, @NotNull C32900mmM c32900mmM) {
        Intrinsics.checkNotNullParameter(c32900mmM, "");
        return new C32901mmN(this.EZpvd, c32900mmM, this.copydefault, i);
    }

    @Override // o.InterfaceC32904mmQ.StateListAnimator
    public void AEQbTJ(@NotNull C32900mmM c32900mmM) {
        Intrinsics.checkNotNullParameter(c32900mmM, "");
        if (this.KWHzl >= this.copydefault.size()) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.OLrzqt++;
        this.copydefault.get(this.KWHzl).AEQbTJ(copydefault(this.KWHzl + 1, c32900mmM));
    }
}
