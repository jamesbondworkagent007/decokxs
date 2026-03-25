package o;

import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import kotlin.jvm.internal.Intrinsics;
import o.C25235isr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25018iom implements InterfaceC25348iuy {
    public final androidx.fragment.app.FragmentManager AEQbTJ;
    public CacheStatus KWHzl;
    public final java.lang.String OLrzqt;
    public boolean copydefault;

    public C25018iom(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.OLrzqt = str;
        this.AEQbTJ = fragmentManager;
        this.KWHzl = CacheStatus.NONE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.isr.ActionBar.newInstance$default(o.isr$ActionBar, java.lang.String, boolean, int, boolean, java.util.List, kotlin.jvm.functions.Function1, int, java.lang.Object):o.isr */
    @Override // o.InterfaceC25348iuy
    public void copydefault() {
        C25235isr.ActionBar.newInstance$default(C25235isr.Companion, this.OLrzqt, false, 0, false, null, null, 32, null).show(this.AEQbTJ, "javaClass");
    }

    @Override // o.InterfaceC25348iuy
    public void KWHzl(boolean z) {
        this.copydefault = z;
        this.KWHzl = z ? CacheStatus.YES : CacheStatus.NO;
    }
}
