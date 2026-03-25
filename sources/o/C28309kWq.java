package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28301kWi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28309kWq implements InterfaceC28301kWi {
    @yCM
    public C28309kWq() {
    }

    @Override // o.InterfaceC28301kWi
    public java.util.List<PrioritySelectionBean> copydefault(@NotNull java.util.List<FeeOption> list, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(interfaceC30984llU, z);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return copydefault(z, interfaceC30984llU);
    }

    public final java.lang.String AEQbTJ(InterfaceC30984llU interfaceC30984llU, boolean z) {
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getBaseFee();
        }
        return interfaceC30981llROLrzqt.KWHzl().getBaseFee();
    }

    public final java.lang.String copydefault(boolean z, InterfaceC30984llU interfaceC30984llU) {
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getBaseFeeUsd();
        }
        return interfaceC30981llROLrzqt.KWHzl().getBaseFeeUsd();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        java.lang.String strCopydefault = interfaceC30981llROLrzqt != null ? interfaceC30981llROLrzqt.copydefault() : null;
        return InterfaceC28301kWi.TaskDescription.getPriorityFeeUsd$default(this, i, interfaceC30984llU, z, str, null, null, strCopydefault == null ? "" : strCopydefault, 48, null);
    }
}
