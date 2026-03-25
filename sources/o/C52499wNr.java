package o;

import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.wNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52499wNr {
    public final Function1<kotlin.Pair<java.lang.String, TacticsData>, Unit> AEQbTJ;
    public final Function2<java.lang.String, java.lang.Boolean, Unit> AYXKKw;
    public final yHO<java.lang.Integer, java.lang.String, java.lang.String, Unit> AhwBna;
    public final Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> AkhnZx;
    public final Function1<TacticsData, Unit> AuCTel;
    public final yHO<TacticsData, java.lang.Integer, yHO<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, Unit>, Unit> DbNXlk;
    public final Function1<TacticsData, Unit> EZpvd;
    public final Function1<TacticsData, Unit> KWHzl;
    public final yHO<TacticsData, java.lang.Integer, Function1<? super java.lang.Integer, Unit>, Unit> OLrzqt;
    public final Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> copydefault;
    public final Function2<TacticsData, java.lang.Integer, Unit> djBIcL;
    public final yHO<TacticsVoucherInfo, TacticsType, java.lang.Boolean, Unit> fJNWhG;
    public final Function1<TacticsData, Unit> fetchVPNInfo;
    public final Function1<TacticsData, Unit> gEmmrt;
    public final Function1<TacticsData, Unit> isConnected;
    public final Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> valueOf;
    public final yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52499wNr() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.String, java.lang.Boolean, Unit> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<TacticsVoucherInfo, TacticsType, java.lang.Boolean, Unit> DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<kotlin.Pair<java.lang.String, TacticsData>, Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52499wNr EZpvd(Function1<? super TacticsData, Unit> function1, Function1<? super TacticsData, Unit> function12, Function1<? super TacticsData, Unit> function13, Function2<? super kotlin.Pair<java.lang.String, TacticsData>, ? super Function0<Unit>, Unit> function2, Function1<? super kotlin.Pair<java.lang.String, TacticsData>, Unit> function14, Function1<? super Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function15, Function1<? super TacticsData, Unit> function16, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function17, yHO<? super TacticsData, ? super java.lang.Boolean, ? super Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yho, Function1<? super TacticsData, Unit> function18, yHO<? super TacticsData, ? super java.lang.Integer, ? super Function1<? super java.lang.Integer, Unit>, Unit> yho2, yHO<? super TacticsData, ? super java.lang.Integer, ? super yHO<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, Unit>, Unit> yho3, yHO<? super TacticsVoucherInfo, ? super TacticsType, ? super java.lang.Boolean, Unit> yho4, yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, Unit> yho5, Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function22, Function1<? super TacticsData, Unit> function19, Function2<? super TacticsData, ? super java.lang.Integer, Unit> function23) {
        return new C52499wNr(function1, function12, function13, function2, function14, function15, function16, function17, yho, function18, yho2, yho3, yho4, yho5, function22, function19, function23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TacticsData, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TacticsData, Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TacticsData, Unit> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52499wNr)) {
            return false;
        }
        C52499wNr c52499wNr = (C52499wNr) obj;
        return Intrinsics.EZpvd(this.isConnected, c52499wNr.isConnected) && Intrinsics.EZpvd(this.EZpvd, c52499wNr.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c52499wNr.KWHzl) && Intrinsics.EZpvd(this.valueOf, c52499wNr.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c52499wNr.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c52499wNr.copydefault) && Intrinsics.EZpvd(this.AuCTel, c52499wNr.AuCTel) && Intrinsics.EZpvd(this.AkhnZx, c52499wNr.AkhnZx) && Intrinsics.EZpvd(this.values, c52499wNr.values) && Intrinsics.EZpvd(this.fetchVPNInfo, c52499wNr.fetchVPNInfo) && Intrinsics.EZpvd(this.OLrzqt, c52499wNr.OLrzqt) && Intrinsics.EZpvd(this.DbNXlk, c52499wNr.DbNXlk) && Intrinsics.EZpvd(this.fJNWhG, c52499wNr.fJNWhG) && Intrinsics.EZpvd(this.AhwBna, c52499wNr.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, c52499wNr.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, c52499wNr.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, c52499wNr.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<TacticsData, java.lang.Integer, Unit> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Function1<TacticsData, Unit> function1 = this.isConnected;
        int iHashCode = function1 == null ? 0 : function1.hashCode();
        Function1<TacticsData, Unit> function12 = this.EZpvd;
        int iHashCode2 = function12 == null ? 0 : function12.hashCode();
        Function1<TacticsData, Unit> function13 = this.KWHzl;
        int iHashCode3 = function13 == null ? 0 : function13.hashCode();
        Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> function2 = this.valueOf;
        int iHashCode4 = function2 == null ? 0 : function2.hashCode();
        Function1<kotlin.Pair<java.lang.String, TacticsData>, Unit> function14 = this.AEQbTJ;
        int iHashCode5 = function14 == null ? 0 : function14.hashCode();
        Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function15 = this.copydefault;
        int iHashCode6 = function15 == null ? 0 : function15.hashCode();
        Function1<TacticsData, Unit> function16 = this.AuCTel;
        int iHashCode7 = function16 == null ? 0 : function16.hashCode();
        Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function17 = this.AkhnZx;
        int iHashCode8 = function17 == null ? 0 : function17.hashCode();
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yho = this.values;
        int iHashCode9 = yho == null ? 0 : yho.hashCode();
        Function1<TacticsData, Unit> function18 = this.fetchVPNInfo;
        int iHashCode10 = function18 == null ? 0 : function18.hashCode();
        yHO<TacticsData, java.lang.Integer, Function1<? super java.lang.Integer, Unit>, Unit> yho2 = this.OLrzqt;
        int iHashCode11 = yho2 == null ? 0 : yho2.hashCode();
        yHO<TacticsData, java.lang.Integer, yHO<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, Unit>, Unit> yho3 = this.DbNXlk;
        int iHashCode12 = yho3 == null ? 0 : yho3.hashCode();
        yHO<TacticsVoucherInfo, TacticsType, java.lang.Boolean, Unit> yho4 = this.fJNWhG;
        int iHashCode13 = yho4 == null ? 0 : yho4.hashCode();
        yHO<java.lang.Integer, java.lang.String, java.lang.String, Unit> yho5 = this.AhwBna;
        int iHashCode14 = yho5 == null ? 0 : yho5.hashCode();
        Function2<java.lang.String, java.lang.Boolean, Unit> function22 = this.AYXKKw;
        int iHashCode15 = function22 == null ? 0 : function22.hashCode();
        Function1<TacticsData, Unit> function19 = this.gEmmrt;
        int iHashCode16 = function19 == null ? 0 : function19.hashCode();
        Function2<TacticsData, java.lang.Integer, Unit> function23 = this.djBIcL;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (function23 == null ? 0 : function23.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TacticsData, Unit> isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CallBacks(shareCallBack=" + this.isConnected + ", detailCallBack=" + this.EZpvd + ", goToTrade=" + this.KWHzl + ", mBtnClickCallback=" + this.valueOf + ", disableClickCallback=" + this.AEQbTJ + ", contentDrawableClick=" + this.copydefault + ", viewTradingViewInfoCallBack=" + this.AuCTel + ", subItemCallback=" + this.AkhnZx + ", reminderViewMoreCallBack=" + this.values + ", reminderViewNegativeProfitCallback=" + this.fetchVPNInfo + ", chatViewProfitCallback=" + this.OLrzqt + ", statusCallback=" + this.DbNXlk + ", voucherTagClickCallback=" + this.fJNWhG + ", onBindViewHolderCallback=" + this.AhwBna + ", onPinClick=" + this.AYXKKw + ", onEditNameClick=" + this.gEmmrt + ", onCoinMDisplaySwitchToggle=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<java.lang.Integer, java.lang.String, java.lang.String, Unit> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> values() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.yHO<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.yHO<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: o.yHO<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Integer, ? super o.yHO<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: o.yHO<? super com.okinc.unify_trade.biz.TacticsVoucherInfo, ? super com.okinc.biz.TacticsType, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super kotlin.Pair<java.lang.String, com.okinc.unify_trade.bot.data.TacticsData>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Pair<java.lang.String, com.okinc.unify_trade.bot.data.TacticsData>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Triple<java.lang.String, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52499wNr(Function1<? super TacticsData, Unit> function1, Function1<? super TacticsData, Unit> function12, Function1<? super TacticsData, Unit> function13, Function2<? super kotlin.Pair<java.lang.String, TacticsData>, ? super Function0<Unit>, Unit> function2, Function1<? super kotlin.Pair<java.lang.String, TacticsData>, Unit> function14, Function1<? super Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function15, Function1<? super TacticsData, Unit> function16, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function17, yHO<? super TacticsData, ? super java.lang.Boolean, ? super Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yho, Function1<? super TacticsData, Unit> function18, yHO<? super TacticsData, ? super java.lang.Integer, ? super Function1<? super java.lang.Integer, Unit>, Unit> yho2, yHO<? super TacticsData, ? super java.lang.Integer, ? super yHO<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, Unit>, Unit> yho3, yHO<? super TacticsVoucherInfo, ? super TacticsType, ? super java.lang.Boolean, Unit> yho4, yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, Unit> yho5, Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function22, Function1<? super TacticsData, Unit> function19, Function2<? super TacticsData, ? super java.lang.Integer, Unit> function23) {
        this.isConnected = function1;
        this.EZpvd = function12;
        this.KWHzl = function13;
        this.valueOf = function2;
        this.AEQbTJ = function14;
        this.copydefault = function15;
        this.AuCTel = function16;
        this.AkhnZx = function17;
        this.values = yho;
        this.fetchVPNInfo = function18;
        this.OLrzqt = yho2;
        this.DbNXlk = yho3;
        this.fJNWhG = yho4;
        this.AhwBna = yho5;
        this.AYXKKw = function22;
        this.gEmmrt = function19;
        this.djBIcL = function23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r19v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r20v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r21v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r22v0 kotlin.jvm.functions.Function2))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r23v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r24v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r25v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r26v0 kotlin.jvm.functions.Function1))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r27v0 o.yHO))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r28v0 kotlin.jvm.functions.Function1))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r29v0 o.yHO))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r30v0 o.yHO))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r31v0 o.yHO))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r32v0 o.yHO))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r33v0 kotlin.jvm.functions.Function2))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r34v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r35v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit>, kotlin.jvm.functions.Function2<? super kotlin.Pair<java.lang.String, com.okinc.unify_trade.bot.data.TacticsData>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>, kotlin.jvm.functions.Function1<? super kotlin.Pair<java.lang.String, com.okinc.unify_trade.bot.data.TacticsData>, kotlin.Unit>, kotlin.jvm.functions.Function1<? super kotlin.Triple<java.lang.String, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit>, o.yHO<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit>, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit>, o.yHO<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.Unit>, o.yHO<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Integer, ? super o.yHO<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit>, kotlin.Unit>, o.yHO<? super com.okinc.unify_trade.biz.TacticsVoucherInfo, ? super com.okinc.biz.TacticsType, ? super java.lang.Boolean, kotlin.Unit>, o.yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TacticsData, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.bot.data.TacticsData, ? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:362) call: o.wNr.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.yHO, kotlin.jvm.functions.Function1, o.yHO, o.yHO, o.yHO, o.yHO, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C52499wNr(Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function1 function14, Function1 function15, Function1 function16, Function1 function17, yHO yho, Function1 function18, yHO yho2, yHO yho3, yHO yho4, yHO yho5, Function2 function22, Function1 function19, Function2 function23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function2, (i & 16) != 0 ? null : function14, (i & 32) != 0 ? null : function15, (i & 64) != 0 ? null : function16, (i & 128) != 0 ? null : function17, (i & 256) != 0 ? null : yho, (i & 512) != 0 ? null : function18, (i & 1024) != 0 ? null : yho2, (i & 2048) != 0 ? null : yho3, (i & 4096) != 0 ? null : yho4, (i & 8192) != 0 ? null : yho5, (i & 16384) != 0 ? null : function22, (i & 32768) != 0 ? null : function19, (i & 65536) != 0 ? null : function23);
    }
}
