package o;

import dagger.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38085pLr implements InterfaceC38084pLq {
    public static final int copydefault = ATM.$stable;
    public final C38083pLp KWHzl;
    public final Lazy<ATM> OLrzqt;

    @yCM
    public C38085pLr(@NotNull C38083pLp c38083pLp, @NotNull Lazy<ATM> lazy) {
        Intrinsics.checkNotNullParameter(c38083pLp, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        this.KWHzl = c38083pLp;
        this.OLrzqt = lazy;
    }

    public final boolean AEQbTJ() {
        return C38174pOz.copydefault.EZpvd();
    }

    @Override // o.InterfaceC38084pLq
    public void KWHzl() {
        if (AEQbTJ()) {
            this.OLrzqt.get().copydefault();
        } else {
            this.KWHzl.KWHzl();
        }
    }

    @Override // o.InterfaceC38084pLq
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (AEQbTJ()) {
            this.OLrzqt.get().EZpvd(str, str2);
        } else {
            this.KWHzl.KWHzl(str, str2);
        }
    }

    @Override // o.InterfaceC38084pLq
    public void EZpvd() {
        if (AEQbTJ()) {
            this.OLrzqt.get().OLrzqt();
        } else {
            this.KWHzl.EZpvd();
        }
    }

    @Override // o.InterfaceC38084pLq
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (AEQbTJ()) {
            this.OLrzqt.get().OLrzqt(str, str2);
        } else {
            this.KWHzl.copydefault(str, str2);
        }
    }

    @Override // o.InterfaceC38084pLq
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ()) {
            this.OLrzqt.get().copydefault(str);
        } else {
            this.KWHzl.KWHzl(str);
        }
    }

    @Override // o.InterfaceC38084pLq
    public void copydefault() {
        if (AEQbTJ()) {
            this.OLrzqt.get().KWHzl();
        } else {
            this.KWHzl.copydefault();
        }
    }
}
