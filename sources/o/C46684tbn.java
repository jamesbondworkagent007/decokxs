package o;

import com.okinc.okmarket.home.data.po.BannerType;
import com.okinc.okmarket.home.ui.model.BannerClickType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46684tbn {
    public final BannerClickType AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final boolean AkhnZx;
    public final java.lang.Integer DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final long OLrzqt;
    public final BannerType copydefault;
    public final boolean djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final long isConnected;
    public final java.lang.String valueOf;
    public final java.util.List<java.lang.String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: o.tbn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46684tbn copy$default(C46684tbn c46684tbn, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, long j, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, boolean z2, java.lang.String str8, BannerClickType bannerClickType, java.lang.String str9, java.lang.Integer num, BannerType bannerType, int i, java.lang.Object obj) {
        return c46684tbn.copydefault((i & 1) != 0 ? c46684tbn.fetchVPNInfo : str, (i & 2) != 0 ? c46684tbn.ejfBZ : str2, (i & 4) != 0 ? c46684tbn.values : list, (i & 8) != 0 ? c46684tbn.valueOf : str3, (i & 16) != 0 ? c46684tbn.AhwBna : str4, (i & 32) != 0 ? c46684tbn.isConnected : j, (i & 64) != 0 ? c46684tbn.fARcdN : str5, (i & 128) != 0 ? c46684tbn.gEmmrt : str6, (i & 256) != 0 ? c46684tbn.AYXKKw : str7, (i & 512) != 0 ? c46684tbn.AkhnZx : z, (i & 1024) != 0 ? c46684tbn.djBIcL : z2, (i & 2048) != 0 ? c46684tbn.KWHzl : str8, (i & 4096) != 0 ? c46684tbn.AEQbTJ : bannerClickType, (i & 8192) != 0 ? c46684tbn.EZpvd : str9, (i & 16384) != 0 ? c46684tbn.DbNXlk : num, (i & 32768) != 0 ? c46684tbn.copydefault : bannerType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerClickType EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerType OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46684tbn copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<java.lang.String> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, boolean z2, @NotNull java.lang.String str8, @NotNull BannerClickType bannerClickType, java.lang.String str9, java.lang.Integer num, @NotNull BannerType bannerType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(bannerClickType, "");
        Intrinsics.checkNotNullParameter(bannerType, "");
        return new C46684tbn(str, str2, list, str3, str4, j, str5, str6, str7, z, z2, str8, bannerClickType, str9, num, bannerType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46684tbn)) {
            return false;
        }
        C46684tbn c46684tbn = (C46684tbn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c46684tbn.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c46684tbn.ejfBZ) && Intrinsics.EZpvd(this.values, c46684tbn.values) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c46684tbn.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c46684tbn.AhwBna) && this.isConnected == c46684tbn.isConnected && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c46684tbn.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46684tbn.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c46684tbn.AYXKKw) && this.AkhnZx == c46684tbn.AkhnZx && this.djBIcL == c46684tbn.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46684tbn.KWHzl) && this.AEQbTJ == c46684tbn.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46684tbn.EZpvd) && Intrinsics.EZpvd(this.DbNXlk, c46684tbn.DbNXlk) && this.copydefault == c46684tbn.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fetchVPNInfo.hashCode();
        int iHashCode2 = this.ejfBZ.hashCode();
        java.util.List<java.lang.String> list = this.values;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = this.valueOf.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = java.lang.Long.hashCode(this.isConnected);
        java.lang.String str = this.fARcdN;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.gEmmrt.hashCode();
        int iHashCode9 = this.AYXKKw.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.AkhnZx);
        int iHashCode11 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode12 = this.KWHzl.hashCode();
        int iHashCode13 = this.AEQbTJ.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.DbNXlk;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CountingBannerVo(promptMessage=" + this.fetchVPNInfo + ", title=" + this.ejfBZ + ", tags=" + this.values + ", desc=" + this.valueOf + ", iconUrl=" + this.AhwBna + ", onlineTime=" + this.isConnected + ", waitOnlineTime=" + this.fARcdN + ", instId=" + this.gEmmrt + ", instType=" + this.AYXKKw + ", isTradeReady=" + this.AkhnZx + ", isPreMarket=" + this.djBIcL + ", cardOrder=" + this.KWHzl + ", clickType=" + this.AEQbTJ + ", deeplinkUrl=" + this.EZpvd + ", okpId=" + this.DbNXlk + ", bannerType=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AkhnZx;
    }

    public C46684tbn(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<java.lang.String> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, boolean z2, @NotNull java.lang.String str8, @NotNull BannerClickType bannerClickType, java.lang.String str9, java.lang.Integer num, @NotNull BannerType bannerType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(bannerClickType, "");
        Intrinsics.checkNotNullParameter(bannerType, "");
        this.fetchVPNInfo = str;
        this.ejfBZ = str2;
        this.values = list;
        this.valueOf = str3;
        this.AhwBna = str4;
        this.isConnected = j;
        this.fARcdN = str5;
        this.gEmmrt = str6;
        this.AYXKKw = str7;
        this.AkhnZx = z;
        this.djBIcL = z2;
        this.KWHzl = str8;
        this.AEQbTJ = bannerClickType;
        this.EZpvd = str9;
        this.DbNXlk = num;
        this.copydefault = bannerType;
        this.OLrzqt = android.os.SystemClock.elapsedRealtime();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.util.List)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 long)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 boolean)
  (r32v0 boolean)
  (r33v0 java.lang.String)
  (wrap:com.okinc.okmarket.home.ui.model.BannerClickType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:25) com.okinc.okmarket.home.ui.model.BannerClickType.DEEPLINK com.okinc.okmarket.home.ui.model.BannerClickType) : (r34v0 com.okinc.okmarket.home.ui.model.BannerClickType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r36v0 java.lang.Integer))
  (r37v0 com.okinc.okmarket.home.data.po.BannerType)
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.okinc.okmarket.home.ui.model.BannerClickType, java.lang.String, java.lang.Integer, com.okinc.okmarket.home.data.po.BannerType):void (m)] (LINE:12) call: o.tbn.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.okinc.okmarket.home.ui.model.BannerClickType, java.lang.String, java.lang.Integer, com.okinc.okmarket.home.data.po.BannerType):void type: THIS */
    public /* synthetic */ C46684tbn(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, long j, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, boolean z2, java.lang.String str8, BannerClickType bannerClickType, java.lang.String str9, java.lang.Integer num, BannerType bannerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, str4, j, str5, str6, str7, z, z2, str8, (i & 4096) != 0 ? BannerClickType.DEEPLINK : bannerClickType, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : num, bannerType);
    }

    public final long KWHzl() {
        long j = 1000;
        long jValueOf = (C33129mqd.valueOf(java.lang.Long.valueOf(this.isConnected)) - java.lang.System.currentTimeMillis()) / j;
        if (java.lang.Math.abs(jValueOf - C33129mqd.valueOf(this.fARcdN)) < 100) {
            return jValueOf;
        }
        return C33129mqd.valueOf(this.fARcdN) - ((android.os.SystemClock.elapsedRealtime() - this.OLrzqt) / j);
    }

    public final long copydefault() {
        return (KWHzl() * ((long) 1000)) + java.lang.System.currentTimeMillis();
    }

    public final boolean KWHzl(@NotNull C46684tbn c46684tbn) {
        Intrinsics.checkNotNullParameter(c46684tbn, "");
        return Intrinsics.EZpvd(copy$default(this, null, null, null, null, null, 0L, c46684tbn.fARcdN, null, null, false, false, null, null, null, null, null, 65471, null), c46684tbn);
    }
}
