package o;

import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28307kWo implements InterfaceC28301kWi {
    public final C28308kWp KWHzl;
    public final C28304kWl copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC28301kWi KWHzl(boolean z) {
        return z ? this.copydefault : this.KWHzl;
    }

    @yCM
    public C28307kWo(@NotNull C28304kWl c28304kWl, @NotNull C28308kWp c28308kWp) {
        Intrinsics.checkNotNullParameter(c28304kWl, "");
        Intrinsics.checkNotNullParameter(c28308kWp, "");
        this.copydefault = c28304kWl;
        this.KWHzl = c28308kWp;
    }

    @Override // o.InterfaceC28301kWi
    public java.util.List<PrioritySelectionBean> copydefault(@NotNull java.util.List<FeeOption> list, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(interfaceC30984llU.KWHzl().getSupportEip1559()).copydefault(list, interfaceC30984llU, z, str);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(interfaceC30984llU.KWHzl().getSupportEip1559()).AEQbTJ(i, interfaceC30984llU, z, str);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(interfaceC30984llU.KWHzl().getSupportEip1559()).OLrzqt(i, interfaceC30984llU, z, str);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return KWHzl(interfaceC30984llU.KWHzl().getSupportEip1559()).OLrzqt(i, interfaceC30984llU, z, str, str2, str3, str4);
    }
}
