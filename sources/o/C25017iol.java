package o;

import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import kotlin.jvm.internal.Intrinsics;
import o.C25235isr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25017iol implements InterfaceC25348iuy {
    public boolean AEQbTJ;
    public CacheStatus EZpvd;
    public final androidx.fragment.app.FragmentManager KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheStatus KWHzl() {
        return this.EZpvd;
    }

    public C25017iol(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.copydefault = str;
        this.KWHzl = fragmentManager;
        this.EZpvd = CacheStatus.NONE;
    }

    @Override // o.InterfaceC25348iuy
    public void copydefault() {
        C25235isr.ActionBar.newInstance$default(C25235isr.Companion, this.copydefault, false, 0, false, null, null, 32, null).show(this.KWHzl, "javaClass");
    }

    @Override // o.InterfaceC25348iuy
    public void KWHzl(boolean z) {
        this.AEQbTJ = z;
        this.EZpvd = z ? CacheStatus.YES : CacheStatus.NO;
    }
}
