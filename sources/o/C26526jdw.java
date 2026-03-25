package o;

import com.okinc.business.invest_biz.data.bean.AggregateItemRateType;
import com.okinc.business.invest_biz.data.bean.BackgroundImage;
import com.okinc.business.invest_biz.data.bean.InvestPlatformLogo;
import com.okinc.business.invest_biz.data.bean.InvestTag;
import com.okinc.business.invest_biz.data.bean.InvestmentNetworkLogo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26526jdw implements InterfaceC27436jvE {
    public final int AEQbTJ;
    public final java.util.List<InvestTag> AYXKKw;
    public final int AhwBna;
    public final java.lang.String AkhnZx;
    public final java.util.List<InvestmentNetworkLogo> DbNXlk;
    public final boolean EZpvd;
    public final BackgroundImage KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final boolean ejfBZ;
    public final java.lang.String fARcdN;
    public final boolean fIwbmz;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final InvestPlatformLogo valueOf;
    public final AggregateItemRateType values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26526jdw() {
        this(null, false, 0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, 0, 262143, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregateItemRateType DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackgroundImage EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPlatformLogo copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTag> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestmentNetworkLogo> isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.ejfBZ;
    }

    public C26526jdw(@NotNull BackgroundImage backgroundImage, boolean z, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull AggregateItemRateType aggregateItemRateType, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z2, @NotNull java.util.List<InvestmentNetworkLogo> list, @NotNull InvestPlatformLogo investPlatformLogo, @NotNull java.util.List<InvestTag> list2, boolean z3, boolean z4, @NotNull java.lang.String str7, int i2) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(aggregateItemRateType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investPlatformLogo, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.KWHzl = backgroundImage;
        this.EZpvd = z;
        this.AhwBna = i;
        this.djBIcL = str;
        this.AkhnZx = str2;
        this.gEmmrt = str3;
        this.fetchVPNInfo = str4;
        this.values = aggregateItemRateType;
        this.isConnected = str5;
        this.fARcdN = str6;
        this.ejfBZ = z2;
        this.DbNXlk = list;
        this.valueOf = investPlatformLogo;
        this.AYXKKw = list2;
        this.fIwbmz = z3;
        this.copydefault = z4;
        this.OLrzqt = str7;
        this.AEQbTJ = i2;
    }

    public /* synthetic */ C26526jdw(BackgroundImage backgroundImage, boolean z, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, AggregateItemRateType aggregateItemRateType, java.lang.String str5, java.lang.String str6, boolean z2, java.util.List list, InvestPlatformLogo investPlatformLogo, java.util.List list2, boolean z3, boolean z4, java.lang.String str7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        BackgroundImage backgroundImage2;
        if ((i3 & 1) != 0) {
            backgroundImage2 = new BackgroundImage((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            backgroundImage2 = backgroundImage;
        }
        this(backgroundImage2, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? AggregateItemRateType.APY : aggregateItemRateType, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? false : z2, (i3 & 2048) != 0 ? yDY.AhwBna() : list, (i3 & 4096) != 0 ? new InvestPlatformLogo((java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 15, (DefaultConstructorMarker) null) : investPlatformLogo, (i3 & 8192) != 0 ? yDY.AhwBna() : list2, (i3 & 16384) != 0 ? false : z3, (i3 & 32768) != 0 ? false : z4, (i3 & 65536) != 0 ? "" : str7, (i3 & 131072) != 0 ? -1 : i2);
    }
}
