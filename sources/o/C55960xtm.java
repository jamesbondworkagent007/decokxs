package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.config.SpotDcaDealRecordStateData;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55960xtm implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>>, java.util.List<? extends TransDetailsData>> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static final java.util.Set<java.lang.String> copydefault = yEE.AhwBna(SpotDcaDealRecordStateData.FILLED.getState(), SpotDcaDealRecordStateData.CANCELED.getState());
    public int AhwBna;
    public int gEmmrt;
    public java.lang.String EZpvd = "";
    public java.lang.String KWHzl = "";
    public java.lang.String valueOf = "";
    public final java.util.List<java.lang.String> AEQbTJ = yDY.gEmmrt("manual_add_order", "market_manual_order", "limit_manual_order");
    public final java.util.List<java.lang.String> djBIcL = yDY.gEmmrt("recurring", "smart_iceberg", "twap");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ java.util.List<? extends TransDetailsData> KWHzl(C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>> c55804xqp) {
        return EZpvd((C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    /* JADX INFO: renamed from: o.xtm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [98=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0682, code lost:
    
        r2 = o.C56033xvF.getBotPrice$default(r4.getInstType(), r4.getInstId(), r4.getPx(), false, false, null, null, 120, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x069e, code lost:
    
        r7.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(r19, r2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r2 = o.C33070mpX.AYXKKw(o.C55688xof.Application.ComponentActivityKt);
        r39 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x06dd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getOrdType(), (java.lang.Object) "market") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x06df, code lost:
    
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x06e1, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x06e2, code lost:
    
        r40 = r14;
        r19 = r2 + " (" + r13 + ")";
        r20 = r4.getInstType();
        r21 = r4.getInstId();
        r22 = r4.getSz();
        r23 = r4.getCtVal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0711, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getOrdType(), (java.lang.Object) "market") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0713, code lost:
    
        r25 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0716, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0718, code lost:
    
        r7.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(r19, o.C56033xvF.getBotAmount$default(r20, r21, r22, r23, false, r25, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r7.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(o.C33070mpX.AYXKKw(o.C55688xof.Application.validateAndPutInMap) + " (" + r6 + ")", o.C56033xvF.getBotPrice$default(r4.getInstType(), r4.getInstId(), r4.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r7.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(o.C33070mpX.AYXKKw(o.C55688xof.Application.validateSHA256) + " (" + r5 + ")", o.C56033xvF.getBotAmount$default(r4.getInstType(), r4.getInstId(), r4.getAccFillSz(), r4.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x07dd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r52.valueOf, (java.lang.Object) "grid") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x07df, code lost:
    
        r2 = o.C33070mpX.AYXKKw(o.C55688xof.Application.DMb) + " (" + o.C56033xvF.copydefault(r4.getInstType(), r4.getInstId(), "", r4.getSide(), r4) + ")";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x080b, code lost:
    
        r2 = o.C33070mpX.AYXKKw(o.C55688xof.Application.DMb) + " (" + o.C56033xvF.getBotFeeUnit$default(r4.getInstType(), r4.getInstId(), "", r4.getSide(), null, 16, null) + ")";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x083e, code lost:
    
        r7.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(r2, o.C56033xvF.getBotFee$default(r4.getInstType(), r4.getInstId(), r17, o.C56033xvF.EZpvd(r4.getInstType(), r4.getInstId(), "", r4.getSide(), r9), false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r14 = o.C33070mpX.AYXKKw(o.C55688xof.Application.PickVisualMediaRequest) + " (" + r4.getRebateCcy() + ")";
        r2 = r4.getInstType();
        r5 = r4.getInstId();
        r6 = r4.getRebate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x08b8, code lost:
    
        if (r6 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x08ba, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x08bb, code lost:
    
        r7.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(r14, o.C56033xvF.gEmmrt(r2, r5, r6, r10), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r3.add(new com.okinc.unify_trade.bot.data.TransDetailsData(o.C56033xvF.getCoinTitle$default(r4.getInstType(), r4.getInstId(), true, null, r4.getDisplayId(), 8, null), o.C56033xvF.AYXKKw(r4.getInstType(), r4.getSide(), r4.getPosSide()).getFirst(), o.pTA.format$default(new java.util.Date(o.C33129mqd.valueOf(r4.getUTime())), com.okinc.localization.util.format.OKDateEnum.DATE_FORMAT_SIMPLE, com.okinc.localization.util.format.OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), r7, null, null, null, null, 0, false, null, null, null, null, r4.getGroupId(), null, false, o.C56033xvF.AEQbTJ(o.C56033xvF.AYXKKw(r4.getInstType(), r4.getSide(), r4.getPosSide()).getSecond().booleanValue()), 114672, null));
        r2 = r53;
        r13 = r39;
        r14 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x097f, code lost:
    
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0317, code lost:
    
        if (r4.equals("moon_grid") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0321, code lost:
    
        if (r4.equals("smart_portfolio") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0325, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x032d, code lost:
    
        if (r2.hasNext() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x032f, code lost:
    
        r4 = (com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse) r2.next();
        r5 = o.C56033xvF.getAmountSymbolWithFallback$default(r4.getInstType(), r4.getInstId(), r9, 4, r9);
        r8 = o.C56033xvF.AhwBna(r4.getInstType(), r4.getInstId(), r4.getDisplayId());
        r14 = r4.takeNonBlankTradeQuoteCcy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0356, code lost:
    
        if (r14 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0358, code lost:
    
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0359, code lost:
    
        r6 = o.C56033xvF.copydefault(r4.getInstType(), r4.getInstId(), "", r4.getSide(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0371, code lost:
    
        if (r52.djBIcL.contains(r52.valueOf) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0373, code lost:
    
        r7 = r4.getFee();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0380, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getSide(), (java.lang.Object) "buy") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0382, code lost:
    
        r7 = r4.getBaseFee();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0387, code lost:
    
        r7 = r4.getQuoteFee();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x038b, code lost:
    
        r15 = new java.util.ArrayList();
        r51 = r2;
        r15.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(o.C33070mpX.AYXKKw(o.C55688xof.Application.resultCodeToString) + " (" + r14 + ")", o.C56033xvF.fmtBotValueBySymbol$default(r8, o.C33129mqd.mulS$default(r4.getAccFillSz(), r4.getAvgPx(), null, null, null, 14, null), java.math.RoundingMode.UP, false, null, false, r4.getInstType(), r4.getInstId(), null, null, null, 1848, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r15.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(o.C33070mpX.AYXKKw(o.C55688xof.Application.validateAndPutInMap) + " (" + r8 + ")", o.C56033xvF.getBotPrice$default(r4.getInstType(), r4.getInstId(), r4.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r15.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(o.C33070mpX.AYXKKw(o.C55688xof.Application.getAction) + " (" + r5 + ")", o.C56033xvF.getBotAmount$default(r4.getInstType(), r4.getInstId(), r4.getAccFillSz(), r4.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        r15.add(new com.okinc.unify_trade.bot.data.TacticsInsideItemData(o.C33070mpX.AYXKKw(o.C55688xof.Application.DMb) + " (" + r6 + ")", o.C56033xvF.getBotFee$default(r4.getInstType(), r4.getInstId(), r7, r6, false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r52.valueOf, (java.lang.Object) "recurring") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04c9, code lost:
    
        r2 = o.pTA.format$default(new java.util.Date(o.C33129mqd.valueOf(r4.getCTime())), com.okinc.localization.util.format.OKDateEnum.DATE_FORMAT_SIMPLE_MD, com.okinc.localization.util.format.OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04eb, code lost:
    
        r2 = o.pTA.format$default(new java.util.Date(o.C33129mqd.valueOf(r4.getCTime())), com.okinc.localization.util.format.OKDateEnum.DATE_FORMAT_SIMPLE, com.okinc.localization.util.format.OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x050c, code lost:
    
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0514, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r52.valueOf, (java.lang.Object) "recurring") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0516, code lost:
    
        r36 = o.C55957xtj.EZpvd(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0521, code lost:
    
        r36 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0529, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r52.valueOf, (java.lang.Object) "recurring") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0535, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getStrategyOrderType(), (java.lang.Object) "manually_add_investment") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0537, code lost:
    
        r47 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x053a, code lost:
    
        r47 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x053c, code lost:
    
        r3.add(new com.okinc.unify_trade.bot.data.TransDetailsData(o.C56033xvF.getCoinTitle$default(r4.getInstType(), r4.getInstId(), true, null, r4.getDisplayId(), 8, null), o.C56033xvF.AYXKKw(r4.getInstType(), r4.getSide(), r4.getPosSide()).getFirst(), r33, r15, null, r36, null, null, 0, false, null, null, null, null, null, null, r47, o.C56033xvF.AEQbTJ(o.C56033xvF.AYXKKw(r4.getInstType(), r4.getSide(), r4.getPosSide()).getSecond().booleanValue()), 65488, null));
        r2 = r51;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r4.equals("recurring") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x05b8, code lost:
    
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x05c2, code lost:
    
        if (r4.equals("contract_dca") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05cb, code lost:
    
        if (r4.equals("infinite_grid") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x05d3, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05db, code lost:
    
        if (r2.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05dd, code lost:
    
        r4 = (com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse) r2.next();
        r5 = o.C56033xvF.EZpvd(r4.getInstType(), r4.getInstId(), r4.getCtVal());
        r6 = o.C56033xvF.AhwBna(r4.getInstType(), r4.getInstId(), r4.getDisplayId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0609, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r52.valueOf, (java.lang.Object) r14) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x060b, code lost:
    
        r7 = r4.getQuoteFee();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x060f, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x061a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getSide(), (java.lang.Object) r13) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x061c, code lost:
    
        r7 = r4.getBaseFee();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0621, code lost:
    
        r7 = r4.getQuoteFee();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0626, code lost:
    
        r7 = new java.util.ArrayList();
        r10 = "USDT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0637, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getInstId(), (java.lang.Object) r52.EZpvd) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0639, code lost:
    
        r6 = "USDT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0644, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getInstId(), (java.lang.Object) r52.EZpvd) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0647, code lost:
    
        r10 = r4.getRebateCcy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x064b, code lost:
    
        if (r10 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x064d, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x064e, code lost:
    
        r9 = r4.takeNonBlankTradeQuoteCcy();
        r53 = r2;
        r19 = o.C33070mpX.AYXKKw(o.C55688xof.Application.getThemedContext) + " (" + r6 + ")";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0679, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4.getOrdType(), (java.lang.Object) "market") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x067b, code lost:
    
        r2 = o.C33070mpX.AYXKKw(o.C55688xof.Application.getOnBackPressedDispatcherannotations);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r4.equals("grid") == false) goto L76;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a0f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<TransDetailsData> EZpvd(@NotNull C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>> c55804xqp) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String baseFee;
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.List<StrategyOrderBillDetailsResponse> listCopydefault = c55804xqp.copydefault();
        java.util.ArrayList<TransDetailsData> arrayList = new java.util.ArrayList<>();
        java.lang.String str = this.valueOf;
        java.lang.String str2 = null;
        java.lang.String str3 = "buy";
        java.lang.String str4 = "contract_grid";
        switch (str.hashCode()) {
            case -1831183611:
                obj = "buy";
                obj2 = "contract_grid";
                if (str.equals("spot_dca")) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : listCopydefault) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((StrategyOrderBillDetailsResponse) obj5).getDcaOrdType(), (java.lang.Object) "safety_order")) {
                            arrayList2.add(obj5);
                        }
                    }
                    this.gEmmrt = arrayList2.size();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj6 : listCopydefault) {
                        if (this.AEQbTJ.contains(((StrategyOrderBillDetailsResponse) obj6).getDcaOrdType())) {
                            arrayList3.add(obj6);
                        }
                    }
                    this.AhwBna = arrayList3.size();
                    java.util.Iterator<T> it = listCopydefault.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AEQbTJ((StrategyOrderBillDetailsResponse) it.next()));
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : listCopydefault) {
                        java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getCtVal(), null, 8, null);
                        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId());
                        if (this.djBIcL.contains(this.valueOf)) {
                            baseFee = strategyOrderBillDetailsResponse.getFee();
                            obj4 = obj;
                            obj3 = obj2;
                        } else {
                            obj3 = obj2;
                            if (Intrinsics.EZpvd(this.valueOf, obj3)) {
                                baseFee = strategyOrderBillDetailsResponse.getQuoteFee();
                                obj4 = obj;
                            } else {
                                obj4 = obj;
                                baseFee = Intrinsics.EZpvd(strategyOrderBillDetailsResponse.getSide(), obj4) ? strategyOrderBillDetailsResponse.getBaseFee() : strategyOrderBillDetailsResponse.getQuoteFee();
                            }
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAccFillSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        if (Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getInstType(), (java.lang.Object) "SPOT")) {
                            java.lang.String strCopydefault = C56033xvF.copydefault(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), "", strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse);
                            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + strCopydefault + ")", strCopydefault);
                        } else {
                            java.lang.String botFeeUnit$default = C56033xvF.getBotFeeUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), "", strategyOrderBillDetailsResponse.getSide(), null, 16, null);
                            java.lang.String instType = strategyOrderBillDetailsResponse.getInstType();
                            java.lang.String instId = strategyOrderBillDetailsResponse.getInstId();
                            java.lang.String side = strategyOrderBillDetailsResponse.getSide();
                            java.lang.String feeCcy = strategyOrderBillDetailsResponse.getFeeCcy();
                            java.lang.String ccy = strategyOrderBillDetailsResponse.getCcy();
                            if (feeCcy == null || feeCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) feeCcy)) {
                                feeCcy = ccy;
                            }
                            java.lang.String strEZpvd = C56033xvF.EZpvd(instType, instId, "", side, feeCcy);
                            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + strEZpvd + ")", botFeeUnit$default);
                        }
                        arrayList4.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt.component1(), C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), baseFee, (java.lang.String) pairOLrzqt.component2(), false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList.add(new TransDetailsData(C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), true, null, strategyOrderBillDetailsResponse.getDisplayId(), 8, null), C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getFirst(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getUTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayList4, null, null, null, null, 0, false, null, null, null, null, null, null, false, C56033xvF.AEQbTJ(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getSecond().booleanValue()), 131056, null));
                        obj2 = obj3;
                        obj = obj4;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                return arrayList;
            case -1574173039:
                break;
            case -1402017003:
                break;
            case -1216369070:
                break;
            case -591806012:
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2 : listCopydefault) {
                        java.lang.String strEZpvd2 = C56033xvF.EZpvd(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getCtVal());
                        java.lang.String strAhwBna = C56033xvF.AhwBna(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getDisplayId());
                        java.lang.String quoteFee = (!(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyOrderBillDetailsResponse2.getBaseFee()) ^ true) || C33129mqd.OLrzqt((java.lang.Object) strategyOrderBillDetailsResponse2.getBaseFee(), (java.lang.Object) 0)) ? strategyOrderBillDetailsResponse2.getQuoteFee() : strategyOrderBillDetailsResponse2.getBaseFee();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAhwBna + ")", Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse2.getPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor) : C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + strEZpvd2 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getSz(), strategyOrderBillDetailsResponse2.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAhwBna + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + strEZpvd2 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getAccFillSz(), strategyOrderBillDetailsResponse2.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse2.getFeeType(), (java.lang.Object) "MAKER_FEE");
                        java.lang.String strEZpvd3 = C56033xvF.EZpvd(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), "", strategyOrderBillDetailsResponse2.getSide(), strategyOrderBillDetailsResponse2.getFeeCcy());
                        if (strEZpvd3.length() == 0) {
                            strEZpvd3 = strategyOrderBillDetailsResponse2.getFeeCcy();
                        }
                        arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + strEZpvd3 + ")", C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), quoteFee, strEZpvd3, false, 16, null), C33070mpX.AYXKKw(C55688xof.Application.getValue), 0, 0, 0, 0, 0, null, zEZpvd ? TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl : TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl, null, C33070mpX.AYXKKw(C55688xof.Application.dHAKvv), null, null, null, null, null, 128504, null));
                        arrayList.add(new TransDetailsData(C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), true, null, null, 24, null), C56033xvF.AYXKKw(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getSide(), strategyOrderBillDetailsResponse2.getPosSide()).getFirst(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse2.getUTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayList5, null, null, null, null, 0, false, null, null, null, null, strategyOrderBillDetailsResponse2.getGroupId(), null, false, C56033xvF.AEQbTJ(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getSide(), strategyOrderBillDetailsResponse2.getPosSide()).getSecond().booleanValue()), 114672, null));
                    }
                    Unit unit3 = Unit.INSTANCE;
                    return arrayList;
                }
                obj = "buy";
                obj2 = "contract_grid";
                while (r2.hasNext()) {
                }
                Unit unit22 = Unit.INSTANCE;
                return arrayList;
            case 3181382:
                break;
            case 1165749981:
                break;
            default:
                obj = "buy";
                obj2 = "contract_grid";
                while (r2.hasNext()) {
                }
                Unit unit222 = Unit.INSTANCE;
                return arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [532=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        int i;
        switch (str.hashCode()) {
            case -2039370855:
                if (str.equals("limit_manual_order")) {
                    int i2 = this.AhwBna;
                    if (i2 > 0) {
                        this.AhwBna--;
                        return C33069mpW.copydefault(C55688xof.Application.DcMfJKsgNvtZ, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(java.lang.String.valueOf(i2)))));
                    }
                }
                return "";
            case -1665529609:
                if (str.equals("manual_add_order")) {
                }
                return "";
            case -1548348952:
                if (str.equals("sl_order")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.OuxcSI);
                }
                return "";
            case -550491189:
                if (str.equals("tp_order")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.zuWLRA);
                }
                return "";
            case 597902175:
                if (str.equals("init_order")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.getPostValueLengthLimit);
                }
                return "";
            case 1361050808:
                if (str.equals("market_manual_order")) {
                }
                return "";
            case 1862280097:
                if (str.equals("safety_order") && (i = this.gEmmrt) > 0) {
                    this.gEmmrt--;
                    return C33069mpW.copydefault(C55688xof.Application.ffGIBT, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(java.lang.String.valueOf(i)))));
                }
                return "";
            default:
                return "";
        }
    }

    public final TransDetailsData AEQbTJ(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse) {
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        java.lang.String amountSymbolWithFallback$default = C56033xvF.getAmountSymbolWithFallback$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), null, 4, null);
        java.lang.String strAhwBna = C56033xvF.AhwBna(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getDisplayId());
        java.lang.String strCopydefault = C56033xvF.copydefault(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), "", strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse);
        java.lang.String state = strategyOrderBillDetailsResponse.getState();
        if (Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.FILLED.getState()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.PARTIALLY_FILLED.getState())) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hide), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyOrderBillDetailsResponse.getUTime()) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getUTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAhwBna + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), copydefault(strategyOrderBillDetailsResponse), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String botAmount$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyOrderBillDetailsResponse.getAccFillSz()) ? "--" : C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAccFillSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null);
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.gwTjWJ) + " (" + amountSymbolWithFallback$default + ")", botAmount$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String baseFee = (!Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "contract_dca") && Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getSide(), (java.lang.Object) "buy")) ? strategyOrderBillDetailsResponse.getBaseFee() : strategyOrderBillDetailsResponse.getQuoteFee();
            java.lang.String str = baseFee;
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanionCREATOR1) + " (" + strCopydefault + ")", C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) ? "--" : C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), str, strCopydefault, false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        } else if (Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.LIVE.getState()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.STOPPING.getState()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.CANCELING.getState()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.CANCELED.getState()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) SpotDcaDealRecordStateData.FAILED.getState())) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyOrderBillDetailsResponse.getCTime()) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getSerial) + " (" + strAhwBna + ")", (Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrdType(), (java.lang.Object) "market") && Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) ? C33070mpX.AYXKKw(C55688xof.Application.ExKek) : C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String botAmount$default2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyOrderBillDetailsResponse.getSz()) ? "--" : C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null);
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.dmfpNf) + " (" + amountSymbolWithFallback$default + ")", botAmount$default2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null));
        }
        return EZpvd(strategyOrderBillDetailsResponse, arrayList);
    }

    public final java.lang.String copydefault(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse) {
        return copydefault.contains(strategyOrderBillDetailsResponse.getState()) ? strategyOrderBillDetailsResponse.getAvgPx() : strategyOrderBillDetailsResponse.getPx();
    }

    public final TransDetailsData EZpvd(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse, java.util.ArrayList<TacticsInsideItemData> arrayList) {
        java.lang.String strEZpvd;
        int iCopydefault;
        boolean z = this.AEQbTJ.contains(strategyOrderBillDetailsResponse.getDcaOrdType()) && Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getState(), (java.lang.Object) SpotDcaDealRecordStateData.LIVE.getState());
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairAYXKKw = C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide());
        java.lang.String strComponent1 = pairAYXKKw.component1();
        int iAEQbTJ = C56033xvF.AEQbTJ(pairAYXKKw.component2().booleanValue());
        java.lang.String strCopydefault = copydefault(strategyOrderBillDetailsResponse.getDcaOrdType());
        if (Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrderTag(), (java.lang.Object) "orderRetry")) {
            strEZpvd = C33070mpX.AYXKKw(C55688xof.Application.RdAHlO);
        } else if (Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrderTag(), (java.lang.Object) "orderFail")) {
            strEZpvd = C33070mpX.AYXKKw(C55688xof.Application.QkdxfA);
        } else {
            strEZpvd = z ? "" : SpotDcaDealRecordStateData.Companion.EZpvd(strategyOrderBillDetailsResponse.getState());
        }
        java.lang.String str = strEZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrderTag(), (java.lang.Object) "orderRetry") || Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrderTag(), (java.lang.Object) "orderFail")) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gdmIOq);
        } else if (Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getState(), (java.lang.Object) SpotDcaDealRecordStateData.FILLED.getState()) || Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getState(), (java.lang.Object) SpotDcaDealRecordStateData.CANCELED.getState())) {
            iCopydefault = C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr);
        } else {
            iCopydefault = C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
        }
        return new TransDetailsData("", strComponent1, "", arrayList, strCopydefault, str, strategyOrderBillDetailsResponse.getOrdId(), this.KWHzl, iCopydefault, z, null, null, null, null, null, strategyOrderBillDetailsResponse.getOrderTag(), false, iAEQbTJ, 97280, null);
    }
}
