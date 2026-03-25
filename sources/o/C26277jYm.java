package o;

import com.okinc.business.market.features.history.domain.model.HistoryTokenChange;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26277jYm implements kMU {
    public final java.lang.String AEQbTJ;
    public final java.util.List<TagWrapper> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<HistoryTokenChange> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26277jYm() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26277jYm AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<HistoryTokenChange> list, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z, @NotNull java.util.List<TagWrapper> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C26277jYm(str, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, z, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HistoryTokenChange> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TagWrapper> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26277jYm)) {
            return false;
        }
        C26277jYm c26277jYm = (C26277jYm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c26277jYm.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c26277jYm.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c26277jYm.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c26277jYm.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c26277jYm.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c26277jYm.values) && Intrinsics.EZpvd(this.OLrzqt, c26277jYm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c26277jYm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c26277jYm.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c26277jYm.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26277jYm.KWHzl) && this.gEmmrt == c26277jYm.gEmmrt && Intrinsics.EZpvd(this.AYXKKw, c26277jYm.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.values.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HistoryChangeUiModel(id=" + this.AEQbTJ + ", price=" + this.AhwBna + ", baseTokenPrice=" + this.copydefault + ", poolLogoUrl=" + this.djBIcL + ", txHashUrl=" + this.fetchVPNInfo + ", volume=" + this.values + ", changedTokenInfo=" + this.OLrzqt + ", amount=" + this.EZpvd + ", timestamp=" + this.valueOf + ", userAddress=" + this.isConnected + ", isBuy=" + this.KWHzl + ", showCountdownFormat=" + this.gEmmrt + ", newTagList=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    public C26277jYm(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<HistoryTokenChange> list, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z, @NotNull java.util.List<TagWrapper> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = str;
        this.AhwBna = str2;
        this.copydefault = str3;
        this.djBIcL = str4;
        this.fetchVPNInfo = str5;
        this.values = str6;
        this.OLrzqt = list;
        this.EZpvd = str7;
        this.valueOf = str8;
        this.isConnected = str9;
        this.KWHzl = str10;
        this.gEmmrt = z;
        this.AYXKKw = list2;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("0") : (r24v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0065: ARITH (r27v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0069: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r26v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.history.domain.model.HistoryTokenChange>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>):void (m)] (LINE:7) call: o.jYm.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C26277jYm(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) == 0 ? str9 : "", (i & 1024) != 0 ? "0" : str10, (i & 2048) != 0 ? true : z, (i & 4096) != 0 ? yDY.AhwBna() : list2);
    }
}
