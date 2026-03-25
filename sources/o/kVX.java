package o;

import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVX {
    public final kUU EZpvd;
    public final C28296kWd OLrzqt;
    public final InterfaceC28283kVr copydefault;

    @yCM
    public kVX(@NotNull InterfaceC28283kVr interfaceC28283kVr, @NotNull C28296kWd c28296kWd, @NotNull kUU kuu) {
        Intrinsics.checkNotNullParameter(interfaceC28283kVr, "");
        Intrinsics.checkNotNullParameter(c28296kWd, "");
        Intrinsics.checkNotNullParameter(kuu, "");
        this.copydefault = interfaceC28283kVr;
        this.OLrzqt = c28296kWd;
        this.EZpvd = kuu;
    }

    public final kVP KWHzl() {
        return this.EZpvd.EZpvd();
    }

    public final java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<java.lang.String> listAEQbTJ = this.copydefault.AEQbTJ(str, str2);
        if (listAEQbTJ != null) {
            return listAEQbTJ;
        }
        MemeCurrencyBean memeCurrencyBeanCopydefault = KWHzl().copydefault(str, "");
        if (memeCurrencyBeanCopydefault != null && (!memeCurrencyBeanCopydefault.getCurrencyDefaultBuyAmountList().isEmpty())) {
            return memeCurrencyBeanCopydefault.getCurrencyDefaultBuyAmountList();
        }
        return C28286kVu.Companion.copydefault();
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.AEQbTJ(str, str2, list);
    }

    public final java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<java.lang.String> listEZpvd = this.copydefault.EZpvd(str);
        if (listEZpvd != null) {
            return listEZpvd;
        }
        java.util.List<java.lang.String> listEZpvd2 = this.OLrzqt.EZpvd(str);
        if (!(!listEZpvd2.isEmpty())) {
            listEZpvd2 = null;
        }
        java.util.List<java.lang.String> list = listEZpvd2;
        return list == null ? C28286kVu.Companion.OLrzqt() : list;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.AEQbTJ(str, list);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.AEQbTJ(str, str2, i);
    }

    public final int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.copydefault.copydefault(str, str2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.KWHzl(str);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.EZpvd(str, str2);
    }
}
