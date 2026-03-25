package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28293kWa {
    public final kVX EZpvd;
    public final kUU KWHzl;

    @yCM
    public C28293kWa(@NotNull kVX kvx, @NotNull kUU kuu) {
        Intrinsics.checkNotNullParameter(kvx, "");
        Intrinsics.checkNotNullParameter(kuu, "");
        this.EZpvd = kvx;
        this.KWHzl = kuu;
    }

    public final kVP copydefault() {
        return this.KWHzl.EZpvd();
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.AEQbTJ(str);
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.AEQbTJ(str, str2);
    }

    public static /* synthetic */ DexMultiTokenInfoBean getCurrentMemeCurrency$default(C28293kWa c28293kWa, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return c28293kWa.OLrzqt(str, str2);
    }

    public final DexMultiTokenInfoBean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MemeCurrencyBean memeCurrencyBeanCopydefault = copydefault().copydefault(str, str2);
        if (memeCurrencyBeanCopydefault != null) {
            return memeCurrencyBeanCopydefault.getCurrencyTokenInfo();
        }
        return null;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.EZpvd(str, str2, list);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.EZpvd(str, list);
    }

    public final int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.copydefault(str, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd.EZpvd(str, str2, i);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.copydefault(str);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd.OLrzqt(str, str2);
    }
}
