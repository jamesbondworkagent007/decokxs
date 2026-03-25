package o;

import com.okinc.business.invest_biz.data.bean.BorrowInfo;
import com.okinc.business.invest_biz.data.bean.InvestDetailRate;
import com.okinc.business.invest_biz.data.bean.SupplyInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23673iFb {
    public final C23680iFi AEQbTJ;
    public final java.util.List<InvestDetailRate> AYXKKw;
    public final java.util.List<C23623iDf> AhwBna;
    public final C23685iFn AkhnZx;
    public final C23678iFg EZpvd;
    public final C23679iFh KWHzl;
    public final java.util.List<BorrowInfo> OLrzqt;
    public final C23676iFe copydefault;
    public final C23686iFo djBIcL;
    public final boolean gEmmrt;
    public final java.util.List<SupplyInfo> isConnected;
    public final C23684iFm valueOf;
    public final C23687iFp values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23673iFb() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23673iFb AEQbTJ(@NotNull C23679iFh c23679iFh, boolean z, @NotNull java.util.List<C23623iDf> list, @NotNull C23684iFm c23684iFm, @NotNull C23680iFi c23680iFi, @NotNull C23687iFp c23687iFp, @NotNull C23676iFe c23676iFe, @NotNull C23686iFo c23686iFo, @NotNull C23678iFg c23678iFg, @NotNull C23685iFn c23685iFn, @NotNull java.util.List<InvestDetailRate> list2, @NotNull java.util.List<BorrowInfo> list3, @NotNull java.util.List<SupplyInfo> list4) {
        Intrinsics.checkNotNullParameter(c23679iFh, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c23684iFm, "");
        Intrinsics.checkNotNullParameter(c23680iFi, "");
        Intrinsics.checkNotNullParameter(c23687iFp, "");
        Intrinsics.checkNotNullParameter(c23676iFe, "");
        Intrinsics.checkNotNullParameter(c23686iFo, "");
        Intrinsics.checkNotNullParameter(c23678iFg, "");
        Intrinsics.checkNotNullParameter(c23685iFn, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new C23673iFb(c23679iFh, z, list, c23684iFm, c23680iFi, c23687iFp, c23676iFe, c23686iFo, c23678iFg, c23685iFn, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23686iFo AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23687iFp AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23684iFm EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23679iFh KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23676iFe OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23678iFg copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestDetailRate> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23673iFb)) {
            return false;
        }
        C23673iFb c23673iFb = (C23673iFb) obj;
        return Intrinsics.EZpvd(this.KWHzl, c23673iFb.KWHzl) && this.gEmmrt == c23673iFb.gEmmrt && Intrinsics.EZpvd(this.AhwBna, c23673iFb.AhwBna) && Intrinsics.EZpvd(this.valueOf, c23673iFb.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c23673iFb.AEQbTJ) && Intrinsics.EZpvd(this.values, c23673iFb.values) && Intrinsics.EZpvd(this.copydefault, c23673iFb.copydefault) && Intrinsics.EZpvd(this.djBIcL, c23673iFb.djBIcL) && Intrinsics.EZpvd(this.EZpvd, c23673iFb.EZpvd) && Intrinsics.EZpvd(this.AkhnZx, c23673iFb.AkhnZx) && Intrinsics.EZpvd(this.AYXKKw, c23673iFb.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, c23673iFb.OLrzqt) && Intrinsics.EZpvd(this.isConnected, c23673iFb.isConnected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C23623iDf> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.values.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.isConnected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductDetails(ids=" + this.KWHzl + ", isInternal=" + this.gEmmrt + ", relevantTokens=" + this.AhwBna + ", investingInfo=" + this.valueOf + ", earningInfo=" + this.AEQbTJ + ", riskInfo=" + this.values + ", availability=" + this.copydefault + ", onChainMetadata=" + this.djBIcL + ", displayInfo=" + this.EZpvd + ", visibilityInfo=" + this.AkhnZx + ", rateDetails=" + this.AYXKKw + ", borrowInfoList=" + this.OLrzqt + ", supplyInfoList=" + this.isConnected + ")";
    }

    public C23673iFb(@NotNull C23679iFh c23679iFh, boolean z, @NotNull java.util.List<C23623iDf> list, @NotNull C23684iFm c23684iFm, @NotNull C23680iFi c23680iFi, @NotNull C23687iFp c23687iFp, @NotNull C23676iFe c23676iFe, @NotNull C23686iFo c23686iFo, @NotNull C23678iFg c23678iFg, @NotNull C23685iFn c23685iFn, @NotNull java.util.List<InvestDetailRate> list2, @NotNull java.util.List<BorrowInfo> list3, @NotNull java.util.List<SupplyInfo> list4) {
        Intrinsics.checkNotNullParameter(c23679iFh, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c23684iFm, "");
        Intrinsics.checkNotNullParameter(c23680iFi, "");
        Intrinsics.checkNotNullParameter(c23687iFp, "");
        Intrinsics.checkNotNullParameter(c23676iFe, "");
        Intrinsics.checkNotNullParameter(c23686iFo, "");
        Intrinsics.checkNotNullParameter(c23678iFg, "");
        Intrinsics.checkNotNullParameter(c23685iFn, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.KWHzl = c23679iFh;
        this.gEmmrt = z;
        this.AhwBna = list;
        this.valueOf = c23684iFm;
        this.AEQbTJ = c23680iFi;
        this.values = c23687iFp;
        this.copydefault = c23676iFe;
        this.djBIcL = c23686iFo;
        this.EZpvd = c23678iFg;
        this.AkhnZx = c23685iFn;
        this.AYXKKw = list2;
        this.OLrzqt = list3;
        this.isConnected = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b6: CONSTRUCTOR 
  (wrap:o.iFh:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE (wrap:o.iFh$ActionBar:0x0006: SGET  A[WRAPPED] (LINE:23) o.iFh.Companion o.iFh$ActionBar) VIRTUAL call: o.iFh.ActionBar.EZpvd():o.iFh A[MD:():o.iFh (m), WRAPPED] (LINE:23)) : (r14v0 o.iFh))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r16v0 java.util.List))
  (wrap:o.iFm:?: TERNARY null = ((wrap:int:0x0020: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE (wrap:o.iFm$ActionBar:0x0024: SGET  A[WRAPPED] (LINE:26) o.iFm.Companion o.iFm$ActionBar) VIRTUAL call: o.iFm.ActionBar.KWHzl():o.iFm A[MD:():o.iFm (m), WRAPPED] (LINE:26)) : (r17v0 o.iFm))
  (wrap:o.iFi:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: INVOKE (wrap:o.iFi$ActionBar:0x0031: SGET  A[WRAPPED] (LINE:27) o.iFi.Companion o.iFi$ActionBar) VIRTUAL call: o.iFi.ActionBar.copydefault():o.iFi A[MD:():o.iFi (m), WRAPPED] (LINE:27)) : (r18v0 o.iFi))
  (wrap:o.iFp:?: TERNARY null = ((wrap:int:0x003a: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE (wrap:o.iFp$StateListAnimator:0x003e: SGET  A[WRAPPED] (LINE:28) o.iFp.Companion o.iFp$StateListAnimator) VIRTUAL call: o.iFp.StateListAnimator.copydefault():o.iFp A[MD:():o.iFp (m), WRAPPED] (LINE:28)) : (r19v0 o.iFp))
  (wrap:o.iFe:?: TERNARY null = ((wrap:int:0x0047: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: INVOKE (wrap:o.iFe$Activity:0x004b: SGET  A[WRAPPED] (LINE:29) o.iFe.Companion o.iFe$Activity) VIRTUAL call: o.iFe.Activity.OLrzqt():o.iFe A[MD:():o.iFe (m), WRAPPED] (LINE:29)) : (r20v0 o.iFe))
  (wrap:o.iFo:?: TERNARY null = ((wrap:int:0x0054: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: INVOKE (wrap:o.iFo$Activity:0x0058: SGET  A[WRAPPED] (LINE:30) o.iFo.Companion o.iFo$Activity) VIRTUAL call: o.iFo.Activity.KWHzl():o.iFo A[MD:():o.iFo (m), WRAPPED] (LINE:30)) : (r21v0 o.iFo))
  (wrap:o.iFg:?: TERNARY null = ((wrap:int:0x0061: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0067: INVOKE (wrap:o.iFg$StateListAnimator:0x0065: SGET  A[WRAPPED] (LINE:31) o.iFg.Companion o.iFg$StateListAnimator) VIRTUAL call: o.iFg.StateListAnimator.EZpvd():o.iFg A[MD:():o.iFg (m), WRAPPED] (LINE:31)) : (r22v0 o.iFg))
  (wrap:o.iFn:?: TERNARY null = ((wrap:int:0x006e: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: INVOKE (wrap:o.iFn$Activity:0x0072: SGET  A[WRAPPED] (LINE:32) o.iFn.Companion o.iFn$Activity) VIRTUAL call: o.iFn.Activity.OLrzqt():o.iFn A[MD:():o.iFn (m), WRAPPED] (LINE:32)) : (r23v0 o.iFn))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r24v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0086: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r25v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0091: ARITH (r27v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0095: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r26v0 java.util.List))
 A[MD:(o.iFh, boolean, java.util.List<o.iDf>, o.iFm, o.iFi, o.iFp, o.iFe, o.iFo, o.iFg, o.iFn, java.util.List<com.okinc.business.invest_biz.data.bean.InvestDetailRate>, java.util.List<com.okinc.business.invest_biz.data.bean.BorrowInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.SupplyInfo>):void (m)] (LINE:22) call: o.iFb.<init>(o.iFh, boolean, java.util.List, o.iFm, o.iFi, o.iFp, o.iFe, o.iFo, o.iFg, o.iFn, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C23673iFb(C23679iFh c23679iFh, boolean z, java.util.List list, C23684iFm c23684iFm, C23680iFi c23680iFi, C23687iFp c23687iFp, C23676iFe c23676iFe, C23686iFo c23686iFo, C23678iFg c23678iFg, C23685iFn c23685iFn, java.util.List list2, java.util.List list3, java.util.List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C23679iFh.Companion.EZpvd() : c23679iFh, (i & 2) != 0 ? true : z, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? C23684iFm.Companion.KWHzl() : c23684iFm, (i & 16) != 0 ? C23680iFi.Companion.copydefault() : c23680iFi, (i & 32) != 0 ? C23687iFp.Companion.copydefault() : c23687iFp, (i & 64) != 0 ? C23676iFe.Companion.OLrzqt() : c23676iFe, (i & 128) != 0 ? C23686iFo.Companion.KWHzl() : c23686iFo, (i & 256) != 0 ? C23678iFg.Companion.EZpvd() : c23678iFg, (i & 512) != 0 ? C23685iFn.Companion.OLrzqt() : c23685iFn, (i & 1024) != 0 ? yDY.AhwBna() : list2, (i & 2048) != 0 ? yDY.AhwBna() : list3, (i & 4096) != 0 ? yDY.AhwBna() : list4);
    }
}
