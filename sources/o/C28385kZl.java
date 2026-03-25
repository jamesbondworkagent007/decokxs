package o;

import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28385kZl {
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final TradingBizType valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingBizType valueOf() {
        return this.valueOf;
    }

    public C28385kZl(@NotNull TradingBizType tradingBizType, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.lang.String str3, java.util.List<java.lang.String> list, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(tradingBizType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = tradingBizType;
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.OLrzqt = z;
        this.AEQbTJ = z2;
        this.copydefault = str3;
        this.KWHzl = list;
        this.AhwBna = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r12v0 com.okinc.business.trade.features.home.domain.model.TradingBizType)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(com.okinc.business.trade.features.home.domain.model.TradingBizType, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:5) call: o.kZl.<init>(com.okinc.business.trade.features.home.domain.model.TradingBizType, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C28385kZl(TradingBizType tradingBizType, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, java.util.List list, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradingBizType, str, str2, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str4);
    }
}
