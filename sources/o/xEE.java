package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.biz.TacticsType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.DexPrivateSummary;
import com.okinc.unify_trade.biz.NormalDexOrderAmtData;
import com.okinc.unify_trade.biz.NormalOrderAmtData;
import com.okinc.unify_trade.biz.OrderLeadPosSize;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.biz.OrderPositions;
import com.okinc.unify_trade.biz.StrategyAmtData;
import com.okinc.unify_trade.biz.StrtagyOrders;
import com.okinc.unify_trade.biz.VirtualAccountPosData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54407xHg;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xEE extends xGQ<java.lang.Object> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public volatile boolean AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public AbstractC57556yke AkhnZx;
    public final OrderPositionData AuCTel;
    public final java.util.ArrayList<VirtualAccountPosData> AuCTelauCTel;
    public java.util.ArrayList<OrderLeadPosSize> AubY;
    public final LinkedBlockingDeque<java.lang.String> AwvSrB;
    public InterfaceC58217yxC AxsJAY;
    public final C54253xBo DbNXlk;
    public final java.lang.String KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public final C56249xzJ copydefault;
    public volatile boolean djBIcL;
    public AbstractC57556yke ejfBZ;
    public AbstractC57556yke fARcdN;
    public AbstractC57556yke fIwbmz;
    public AbstractC55680xoX fJNWhG;
    public AbstractC57556yke fetchVPNInfo;
    public volatile boolean gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public final LinkedBlockingDeque<java.lang.String> getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public final C54435xIh isConnected;
    public final java.util.ArrayList<DexPrivateSummary> iwGUEr;
    public InterfaceC58217yxC uzCIH;
    public volatile boolean valueOf;
    public volatile boolean values;
    public OrderPositions wlaJM;
    public final java.util.ArrayList<StrtagyOrders> zLjUOn;
    public final LinkedBlockingDeque<java.lang.String> zsXlph;
    public final java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public xEE(@NotNull java.lang.String str, AbstractC55680xoX abstractC55680xoX) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zuBGHE = str;
        this.fJNWhG = abstractC55680xoX;
        this.isConnected = new C54435xIh();
        this.AEQbTJ = new LinkedBlockingDeque<>();
        this.zsXlph = new LinkedBlockingDeque<>();
        this.AwvSrB = new LinkedBlockingDeque<>();
        this.getNewProxyInstance = new LinkedBlockingDeque<>();
        this.OLrzqt = new LinkedBlockingDeque<>();
        this.copydefault = new C56249xzJ();
        this.DbNXlk = new C54253xBo();
        this.getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.xEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xEE.KWHzl();
            }
        });
        getFieldNames();
        this.zLjUOn = new java.util.ArrayList<>();
        this.AuCTelauCTel = new java.util.ArrayList<>();
        this.AubY = new java.util.ArrayList<>();
        this.iwGUEr = new java.util.ArrayList<>();
        this.AuCTel = new OrderPositionData(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
        this.KWHzl = "0";
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xEE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean EZpvd() {
            C56084xwD fieldNames;
            C56084xwD fieldNames2;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (fieldNames2 = interfaceC54581xNrOLrzqt.getFieldNames()) != null && fieldNames2.djBIcL()) {
                return true;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            return (interfaceC54581xNrOLrzqt2 == null || (fieldNames = interfaceC54581xNrOLrzqt2.getFieldNames()) == null || !fieldNames.valueOf()) ? false : true;
        }
    }

    public static final xND KWHzl() {
        return (xND) C43251rlk.copydefault(xND.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        java.lang.Object next;
        java.lang.String posAmt;
        java.lang.String posAmt2;
        java.lang.Throwable th;
        int i;
        int i2;
        java.lang.String detailsPosSize;
        java.lang.String summaryPosSize;
        java.lang.String spotDetailsPosSize;
        java.lang.Object next2;
        java.lang.String orderAmt;
        java.lang.Object next3;
        java.lang.String orderAmt2;
        java.lang.Object next4;
        java.lang.String orderAmt3;
        java.lang.Object next5;
        java.lang.String orderAmt4;
        OrderPositions orderPositions;
        OrderPositions orderPositions2;
        OrderPositions orderPositions3;
        OrderPositions orderPositions4;
        OrderPositions orderPositions5;
        OrderPositions orderPositions6;
        java.util.ArrayList<StrtagyOrders> orderTypeData;
        java.util.Iterator<T> it;
        java.lang.Object next6;
        StrtagyOrders strtagyOrders;
        java.util.ArrayList<StrtagyOrders> orderTypeData2;
        java.util.Iterator<T> it2;
        java.lang.Object next7;
        StrtagyOrders strtagyOrders2;
        java.util.ArrayList<StrtagyOrders> orderTypeData3;
        java.util.Iterator<T> it3;
        java.lang.Object next8;
        StrtagyOrders strtagyOrders3;
        java.util.ArrayList<StrtagyOrders> orderTypeData4;
        java.lang.Object next9;
        java.util.ArrayList<StrtagyOrders> orderTypeData5;
        java.lang.Object next10;
        java.util.ArrayList<StrtagyOrders> orderTypeData6;
        java.lang.Object next11;
        java.util.ArrayList<StrtagyOrders> orderTypeData7;
        java.lang.Object next12;
        java.util.Iterator<T> it4 = this.AuCTelauCTel.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((VirtualAccountPosData) next).getBizRefType(), (java.lang.Object) "growth_coupon")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        VirtualAccountPosData virtualAccountPosData = (VirtualAccountPosData) next;
        if (virtualAccountPosData == null || (posAmt = virtualAccountPosData.getPosAmt()) == null) {
            posAmt = this.KWHzl;
        }
        OrderPositions orderPositions7 = this.wlaJM;
        if (orderPositions7 == null || (posAmt2 = orderPositions7.getPosAmt()) == null) {
            posAmt2 = this.KWHzl;
        }
        try {
            Result.Application application = Result.Companion;
            i2 = posAmt2.length() > 0 ? java.lang.Integer.parseInt(posAmt2) : 0;
            try {
                i = posAmt.length() > 0 ? java.lang.Integer.parseInt(posAmt) : 0;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i = 0;
            }
            try {
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            i = 0;
            i2 = 0;
        }
        this.AuCTel.setPosTotalAmt(java.lang.String.valueOf(i2 + i));
        this.AuCTel.setPosAssetAmt(this.KWHzl);
        if (this.AuCTel.getType() == 1) {
            NormalOrderAmtData normalOrderAmtData = this.AuCTel.getNormalOrderAmtData();
            OrderPositions orderPositions8 = this.wlaJM;
            if (orderPositions8 == null || (orderTypeData7 = orderPositions8.getOrderTypeData()) == null) {
                java.lang.String orderAmt5 = this.KWHzl;
                normalOrderAmtData.setLimitMarketAmt(orderAmt5);
                orderPositions = this.wlaJM;
                if (orderPositions != null || (orderTypeData6 = orderPositions.getOrderTypeData()) == null) {
                    java.lang.String orderAmt6 = this.KWHzl;
                    normalOrderAmtData.setAdvanceLimitAmt(orderAmt6);
                    orderPositions2 = this.wlaJM;
                    if (orderPositions2 == null || (orderTypeData5 = orderPositions2.getOrderTypeData()) == null) {
                        java.lang.String orderAmt7 = this.KWHzl;
                        normalOrderAmtData.setStopAmt(orderAmt7);
                        orderPositions3 = this.wlaJM;
                        if (orderPositions3 == null || (orderTypeData4 = orderPositions3.getOrderTypeData()) == null) {
                            java.lang.String orderAmt8 = this.KWHzl;
                            normalOrderAmtData.setTriggerAmt(orderAmt8);
                            NormalDexOrderAmtData dexOrderAmtData = this.AuCTel.getDexOrderAmtData();
                            orderPositions4 = this.wlaJM;
                            if (orderPositions4 != null && (orderTypeData3 = orderPositions4.getOrderTypeData()) != null) {
                                it3 = orderTypeData3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next8 = it3.next();
                                        if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next8).getOrdType(), (java.lang.Object) "dexMarket")) {
                                            break;
                                        }
                                    } else {
                                        next8 = null;
                                        break;
                                    }
                                }
                                strtagyOrders3 = (StrtagyOrders) next8;
                                if (strtagyOrders3 != null) {
                                    dexOrderAmtData.setDexPendingMarketOrderNum(strtagyOrders3.getOrderAmt());
                                }
                            }
                            orderPositions5 = this.wlaJM;
                            if (orderPositions5 != null && (orderTypeData2 = orderPositions5.getOrderTypeData()) != null) {
                                it2 = orderTypeData2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next7 = it2.next();
                                        if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next7).getOrdType(), (java.lang.Object) "dexLimit")) {
                                            break;
                                        }
                                    } else {
                                        next7 = null;
                                        break;
                                    }
                                }
                                strtagyOrders2 = (StrtagyOrders) next7;
                                if (strtagyOrders2 != null) {
                                    dexOrderAmtData.setDexPendingLimitOrderNum(strtagyOrders2.getOrderAmt());
                                }
                            }
                            orderPositions6 = this.wlaJM;
                            if (orderPositions6 != null && (orderTypeData = orderPositions6.getOrderTypeData()) != null) {
                                it = orderTypeData.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next6 = it.next();
                                        if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next6).getOrdType(), (java.lang.Object) "dexTpsl")) {
                                            break;
                                        }
                                    } else {
                                        next6 = null;
                                        break;
                                    }
                                }
                                strtagyOrders = (StrtagyOrders) next6;
                                if (strtagyOrders != null) {
                                    dexOrderAmtData.setDexTPSLPendingOrderNum(strtagyOrders.getOrderAmt());
                                }
                            }
                            dexOrderAmtData.setDexPendingOrderNum(C33129mqd.addS$default(dexOrderAmtData.getDexPendingMarketOrderNum(), dexOrderAmtData.getDexPendingLimitOrderNum(), null, null, null, 14, null));
                            pUU.KWHzl("DexPendingFlow", "convertResultData dexPendingOrderNum = " + dexOrderAmtData.getDexPendingOrderNum() + ",dexTPSLPendingOrderNum = " + dexOrderAmtData.getDexTPSLPendingOrderNum() + " ");
                        } else {
                            java.util.Iterator<T> it5 = orderTypeData4.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next9 = it5.next();
                                    if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next9).getOrdType(), (java.lang.Object) "trigger")) {
                                        break;
                                    }
                                } else {
                                    next9 = null;
                                    break;
                                }
                            }
                            StrtagyOrders strtagyOrders4 = (StrtagyOrders) next9;
                            if (strtagyOrders4 == null || (orderAmt8 = strtagyOrders4.getOrderAmt()) == null) {
                            }
                            normalOrderAmtData.setTriggerAmt(orderAmt8);
                            NormalDexOrderAmtData dexOrderAmtData2 = this.AuCTel.getDexOrderAmtData();
                            orderPositions4 = this.wlaJM;
                            if (orderPositions4 != null) {
                                it3 = orderTypeData3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                strtagyOrders3 = (StrtagyOrders) next8;
                                if (strtagyOrders3 != null) {
                                }
                            }
                            orderPositions5 = this.wlaJM;
                            if (orderPositions5 != null) {
                                it2 = orderTypeData2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                    }
                                }
                                strtagyOrders2 = (StrtagyOrders) next7;
                                if (strtagyOrders2 != null) {
                                }
                            }
                            orderPositions6 = this.wlaJM;
                            if (orderPositions6 != null) {
                                it = orderTypeData.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                }
                                strtagyOrders = (StrtagyOrders) next6;
                                if (strtagyOrders != null) {
                                }
                            }
                            dexOrderAmtData2.setDexPendingOrderNum(C33129mqd.addS$default(dexOrderAmtData2.getDexPendingMarketOrderNum(), dexOrderAmtData2.getDexPendingLimitOrderNum(), null, null, null, 14, null));
                            pUU.KWHzl("DexPendingFlow", "convertResultData dexPendingOrderNum = " + dexOrderAmtData2.getDexPendingOrderNum() + ",dexTPSLPendingOrderNum = " + dexOrderAmtData2.getDexTPSLPendingOrderNum() + " ");
                        }
                    } else {
                        java.util.Iterator<T> it6 = orderTypeData5.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next10 = it6.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next10).getOrdType(), (java.lang.Object) "stop")) {
                                    break;
                                }
                            } else {
                                next10 = null;
                                break;
                            }
                        }
                        StrtagyOrders strtagyOrders5 = (StrtagyOrders) next10;
                        if (strtagyOrders5 == null || (orderAmt7 = strtagyOrders5.getOrderAmt()) == null) {
                        }
                        normalOrderAmtData.setStopAmt(orderAmt7);
                        orderPositions3 = this.wlaJM;
                        if (orderPositions3 == null) {
                            java.lang.String orderAmt82 = this.KWHzl;
                            normalOrderAmtData.setTriggerAmt(orderAmt82);
                            NormalDexOrderAmtData dexOrderAmtData22 = this.AuCTel.getDexOrderAmtData();
                            orderPositions4 = this.wlaJM;
                            if (orderPositions4 != null) {
                            }
                            orderPositions5 = this.wlaJM;
                            if (orderPositions5 != null) {
                            }
                            orderPositions6 = this.wlaJM;
                            if (orderPositions6 != null) {
                            }
                            dexOrderAmtData22.setDexPendingOrderNum(C33129mqd.addS$default(dexOrderAmtData22.getDexPendingMarketOrderNum(), dexOrderAmtData22.getDexPendingLimitOrderNum(), null, null, null, 14, null));
                            pUU.KWHzl("DexPendingFlow", "convertResultData dexPendingOrderNum = " + dexOrderAmtData22.getDexPendingOrderNum() + ",dexTPSLPendingOrderNum = " + dexOrderAmtData22.getDexTPSLPendingOrderNum() + " ");
                        }
                    }
                } else {
                    java.util.Iterator<T> it7 = orderTypeData6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next11 = it7.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next11).getOrdType(), (java.lang.Object) "advanced_limit")) {
                                break;
                            }
                        } else {
                            next11 = null;
                            break;
                        }
                    }
                    StrtagyOrders strtagyOrders6 = (StrtagyOrders) next11;
                    if (strtagyOrders6 == null || (orderAmt6 = strtagyOrders6.getOrderAmt()) == null) {
                    }
                    normalOrderAmtData.setAdvanceLimitAmt(orderAmt6);
                    orderPositions2 = this.wlaJM;
                    if (orderPositions2 == null) {
                        java.lang.String orderAmt72 = this.KWHzl;
                        normalOrderAmtData.setStopAmt(orderAmt72);
                        orderPositions3 = this.wlaJM;
                        if (orderPositions3 == null) {
                        }
                    }
                }
            } else {
                java.util.Iterator<T> it8 = orderTypeData7.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next12 = it8.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next12).getOrdType(), (java.lang.Object) "limit_market")) {
                            break;
                        }
                    } else {
                        next12 = null;
                        break;
                    }
                }
                StrtagyOrders strtagyOrders7 = (StrtagyOrders) next12;
                if (strtagyOrders7 == null || (orderAmt5 = strtagyOrders7.getOrderAmt()) == null) {
                }
                normalOrderAmtData.setLimitMarketAmt(orderAmt5);
                orderPositions = this.wlaJM;
                if (orderPositions != null) {
                    java.lang.String orderAmt62 = this.KWHzl;
                    normalOrderAmtData.setAdvanceLimitAmt(orderAmt62);
                    orderPositions2 = this.wlaJM;
                    if (orderPositions2 == null) {
                    }
                }
            }
        }
        if (this.AuCTel.getType() == 2) {
            StrategyAmtData strategyOrderAmtData = this.AuCTel.getStrategyOrderAmtData();
            java.util.Iterator<T> it9 = this.zLjUOn.iterator();
            while (true) {
                if (it9.hasNext()) {
                    next2 = it9.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next2).getOrdType(), (java.lang.Object) "stop")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            StrtagyOrders strtagyOrders8 = (StrtagyOrders) next2;
            if (strtagyOrders8 == null || (orderAmt = strtagyOrders8.getOrderAmt()) == null) {
                orderAmt = this.KWHzl;
            }
            strategyOrderAmtData.setStopAmt(orderAmt);
            java.util.Iterator<T> it10 = this.zLjUOn.iterator();
            while (true) {
                if (it10.hasNext()) {
                    next3 = it10.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next3).getOrdType(), (java.lang.Object) "trigger")) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            StrtagyOrders strtagyOrders9 = (StrtagyOrders) next3;
            if (strtagyOrders9 == null || (orderAmt2 = strtagyOrders9.getOrderAmt()) == null) {
                orderAmt2 = this.KWHzl;
            }
            strategyOrderAmtData.setTriggerAmt(orderAmt2);
            java.util.Iterator<T> it11 = this.zLjUOn.iterator();
            while (true) {
                if (it11.hasNext()) {
                    next4 = it11.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next4).getOrdType(), (java.lang.Object) "move_order_stop")) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            StrtagyOrders strtagyOrders10 = (StrtagyOrders) next4;
            if (strtagyOrders10 == null || (orderAmt3 = strtagyOrders10.getOrderAmt()) == null) {
                orderAmt3 = this.KWHzl;
            }
            strategyOrderAmtData.setMoveStopAmt(orderAmt3);
            for (java.lang.String str : TacticsType.Companion.OLrzqt()) {
                java.util.Iterator<T> it12 = this.zLjUOn.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next5 = it12.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next5).getOrdType(), (java.lang.Object) str)) {
                            break;
                        }
                    } else {
                        next5 = null;
                        break;
                    }
                }
                StrtagyOrders strtagyOrders11 = (StrtagyOrders) next5;
                if (strtagyOrders11 == null || (orderAmt4 = strtagyOrders11.getOrderAmt()) == null) {
                    orderAmt4 = this.KWHzl;
                }
                pUU.KWHzl("BottomTabRunningAmt", "botType:" + str + " -> " + orderAmt4);
                this.AuCTel.getBotAmtData().getCountMap().put(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(orderAmt4)));
            }
        }
        if (this.AuCTel.getType() == 5) {
            OrderLeadPosSize orderLeadAmtNew = this.AuCTel.getOrderLeadAmtNew();
            if (C33129mqd.KWHzl((java.util.Collection) this.AubY)) {
                OrderLeadPosSize orderLeadPosSize = this.AubY.get(0);
                if (orderLeadPosSize == null || (detailsPosSize = orderLeadPosSize.getDetailsPosSize()) == null) {
                    detailsPosSize = this.KWHzl;
                }
                orderLeadAmtNew.setDetailsPosSize(detailsPosSize);
                OrderLeadPosSize orderLeadPosSize2 = this.AubY.get(0);
                if (orderLeadPosSize2 == null || (summaryPosSize = orderLeadPosSize2.getSummaryPosSize()) == null) {
                    summaryPosSize = this.KWHzl;
                }
                orderLeadAmtNew.setSummaryPosSize(summaryPosSize);
                OrderLeadPosSize orderLeadPosSize3 = this.AubY.get(0);
                if (orderLeadPosSize3 == null || (spotDetailsPosSize = orderLeadPosSize3.getSpotDetailsPosSize()) == null) {
                    spotDetailsPosSize = this.KWHzl;
                }
                orderLeadAmtNew.setSpotDetailsPosSize(spotDetailsPosSize);
            }
        }
    }

    public final void OLrzqt(OrderPositions orderPositions) {
        C55754xps.AEQbTJ.copydefault("mainSummary");
        this.AuCTel.setType(1);
        this.wlaJM = orderPositions;
        copydefault();
        AbstractC55680xoX abstractC55680xoX = this.fJNWhG;
        if (abstractC55680xoX != null) {
            abstractC55680xoX.KWHzl(this.AuCTel);
        }
        AbstractC57556yke abstractC57556ykeEjfBZ = ejfBZ();
        this.fIwbmz = abstractC57556ykeEjfBZ;
        if (abstractC57556ykeEjfBZ != null) {
            abstractC57556ykeEjfBZ.AhwBna();
        }
    }

    public final void OLrzqt(@NotNull ResponseData<java.util.List<StrtagyOrders>> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C55754xps.AEQbTJ.copydefault("algoSummary");
        this.AuCTel.setType(2);
        this.zLjUOn.clear();
        java.util.List<StrtagyOrders> data = responseData.getData();
        if (data != null) {
            this.zLjUOn.addAll(data);
        }
        copydefault();
        AbstractC55680xoX abstractC55680xoX = this.fJNWhG;
        if (abstractC55680xoX != null) {
            abstractC55680xoX.KWHzl(this.AuCTel);
        }
    }

    public final void AEQbTJ(java.util.ArrayList<VirtualAccountPosData> arrayList) {
        C55754xps.AEQbTJ.copydefault("subSummary");
        this.AuCTel.setType(4);
        this.AuCTelauCTel.clear();
        if (arrayList != null) {
            this.AuCTelauCTel.addAll(arrayList);
        }
        copydefault();
        AbstractC55680xoX abstractC55680xoX = this.fJNWhG;
        if (abstractC55680xoX != null) {
            abstractC55680xoX.KWHzl(this.AuCTel);
        }
    }

    public final void copydefault(java.util.ArrayList<OrderLeadPosSize> arrayList) {
        C55754xps.AEQbTJ.copydefault("leadSummary");
        this.AuCTel.setType(5);
        this.AubY.clear();
        if (arrayList != null) {
            this.AubY.addAll(arrayList);
        }
        copydefault();
        AbstractC55680xoX abstractC55680xoX = this.fJNWhG;
        if (abstractC55680xoX != null) {
            abstractC55680xoX.KWHzl(this.AuCTel);
        }
    }

    private final void getFieldNames() {
        C55754xps.AEQbTJ.AEQbTJ();
        RxBus.KWHzl("TAB_INIT");
        if (C54586xNw.OLrzqt.EZpvd()) {
            C54253xBo c54253xBo = this.DbNXlk;
            c54253xBo.KWHzl(new Function1() { // from class: o.xEH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xEE.OLrzqt(this.EZpvd, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c54253xBo, 0L, 1, null);
        } else {
            InterfaceC58217yxC interfaceC58217yxC = this.uzCIH;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.uzCIH = this.isConnected.EZpvd(new TaskDescription());
        }
        C56249xzJ c56249xzJ = this.copydefault;
        c56249xzJ.KWHzl(new Function1() { // from class: o.xEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.KWHzl(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56249xzJ, 0L, 1, null);
        InterfaceC58217yxC interfaceC58217yxC2 = this.AxsJAY;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        this.AxsJAY = this.isConnected.copydefault(new Application());
        if (Companion.EZpvd()) {
            InterfaceC58217yxC interfaceC58217yxC3 = this.hDKMBd;
            if (interfaceC58217yxC3 != null) {
                interfaceC58217yxC3.dispose();
            }
            this.hDKMBd = this.isConnected.AEQbTJ(new Activity());
        }
    }

    public static final Unit OLrzqt(xEE xee, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List list = (java.util.List) responseData.getData();
        pUU.KWHzl("OrderPositionTask", "getOrdersAndPositions cedefi:" + (list != null ? (OrderPositions) CollectionsKt___CollectionsKt.firstOrNull(list) : null));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list2 = (java.util.List) responseData.getData();
            xee.OLrzqt(list2 != null ? (OrderPositions) list2.get(0) : null);
        } else {
            pUU.KWHzl("OrderPositionTask", "getOrdersAndPositions fail: " + responseData.getMsg());
            AbstractC55680xoX abstractC55680xoX = xee.fJNWhG;
            if (abstractC55680xoX != null) {
                abstractC55680xoX.KWHzl(new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
            }
        }
        AbstractC57556yke abstractC57556ykeValues = xee.values();
        xee.fetchVPNInfo = abstractC57556ykeValues;
        if (abstractC57556ykeValues != null) {
            abstractC57556ykeValues.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends OrderPositions>> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<OrderPositions> list, java.lang.Exception exc) {
            AbstractC55680xoX abstractC55680xoX;
            pUU.KWHzl("OrderPositionTask", "getOrdersAndPositions cex:" + (list != null ? (OrderPositions) CollectionsKt___CollectionsKt.firstOrNull(list) : null) + " " + exc);
            if (z) {
                xEE.this.OLrzqt(list != null ? list.get(0) : null);
            } else {
                if (exc == null || (abstractC55680xoX = xEE.this.fJNWhG) == null) {
                    return;
                }
                abstractC55680xoX.KWHzl(exc);
            }
        }
    }

    public static final class Application implements InterfaceC55701xos<java.util.ArrayList<VirtualAccountPosData>> {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        public void EZpvd(boolean z, java.util.ArrayList<VirtualAccountPosData> arrayList, java.lang.Exception exc) {
            pUU.KWHzl("OrderPositionTask", "getVirtualAccountPosAmt:" + arrayList + " " + exc);
            if (z) {
                xEE.this.AEQbTJ(arrayList);
            }
            xEE xee = xEE.this;
            xee.ejfBZ = xee.fARcdN();
            AbstractC57556yke abstractC57556yke = xEE.this.ejfBZ;
            if (abstractC57556yke != null) {
                abstractC57556yke.AhwBna();
            }
        }
    }

    public static final class Activity implements InterfaceC55701xos<java.util.ArrayList<OrderLeadPosSize>> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.ArrayList<OrderLeadPosSize> arrayList, java.lang.Exception exc) {
            if (z) {
                xEE.this.copydefault(arrayList);
            } else {
                pUU.KWHzl("OrderPositionTask", "getOrderLeadPositions:" + arrayList + " " + exc);
            }
            xEE xee = xEE.this;
            xee.AkhnZx = xee.AuCTel();
            AbstractC57556yke abstractC57556yke = xEE.this.AkhnZx;
            if (abstractC57556yke != null) {
                abstractC57556yke.AhwBna();
            }
        }
    }

    public final AbstractC57556yke AuCTel() {
        this.AkhnZx = KWHzl("copy-private-corner", new WsArgV5("copy-private-corner", null, null, null, null, null, null, null, 254, null), new Function1() { // from class: o.xEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.valueOf(this.OLrzqt, (java.lang.String) obj);
            }
        });
        hDKMBd();
        return this.AkhnZx;
    }

    public static final Unit valueOf(xEE xee, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xee.copydefault(str);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = true;
        this.getNewProxyInstance.put(str);
        C43296rmc.EZpvd("amt_test", "orderLead: " + str);
        pUU.KWHzl("OrderPositionTask", "mOrderLeadWsCallback:" + str);
    }

    public AbstractC57556yke ejfBZ() {
        this.fIwbmz = KWHzl("private-summary", new WsArgV5("private-summary", null, null, null, null, null, null, null, 254, null), new Function1() { // from class: o.xEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.djBIcL(this.copydefault, (java.lang.String) obj);
            }
        });
        hDKMBd();
        return this.fIwbmz;
    }

    public static final Unit djBIcL(xEE xee, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xee.KWHzl(str);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        fJNWhG();
        this.gEmmrt = true;
        this.AEQbTJ.put(str);
        pUU.KWHzl("OrderPositionTask", "mOrderPositionWsCallback:" + str);
        C43296rmc.AEQbTJ("amt_test", "private-summary: " + str);
    }

    public final void fJNWhG() {
        C55749xpn c55749xpn = C55749xpn.OLrzqt;
        c55749xpn.copydefault(c55749xpn.EZpvd());
        c55749xpn.AEQbTJ(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    private final void hDKMBd() {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 700L, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.AEQbTJ(this.copydefault, (java.lang.Long) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgInterval.map(new InterfaceC58229yxO() { // from class: o.xEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xEE.OLrzqt(function1, obj);
            }
        }).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        };
        this.AhwBna = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xEE.KWHzl(function12, obj);
            }
        });
    }

    public static final kotlin.Pair OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(xEE xee, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        boolean z = xee.gEmmrt || xee.AYXKKw || xee.values || xee.valueOf || xee.djBIcL;
        pUU.KWHzl("DexPendingFlow", "[2] startCheckCacheValid timer check - isDexPendingUpdate: " + xee.djBIcL + ", wsUpdate: " + z);
        if (xee.gEmmrt) {
            xee.valueOf();
        }
        if (xee.AYXKKw) {
            xee.isConnected();
        }
        if (xee.values) {
            xee.DbNXlk();
        }
        if (xee.valueOf) {
            xee.djBIcL();
        }
        if (xee.djBIcL) {
            pUU.KWHzl("DexPendingFlow", "[2] startCheckCacheValid - calling copyDexPendingDataAndConvert()");
            xee.gEmmrt();
        }
        if (z) {
            pUU.KWHzl("DexPendingFlow", "[2] startCheckCacheValid - wsUpdate=true, returning OrderPositionData with dexOrderAmtData: " + xee.AuCTel.getDexOrderAmtData().getDexPendingOrderNum());
            return new kotlin.Pair(java.lang.Boolean.TRUE, xee.AuCTel);
        }
        return new kotlin.Pair(java.lang.Boolean.FALSE, null);
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(xEE xee, kotlin.Pair pair) {
        AbstractC55680xoX abstractC55680xoX;
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && pair.getSecond() != null && (abstractC55680xoX = xee.fJNWhG) != null) {
            java.lang.Object second = pair.getSecond();
            Intrinsics.copydefault(second);
            abstractC55680xoX.KWHzl((OrderPositionData) second);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        C43296rmc.AEQbTJ("amt_test", "init " + this.AYXKKw);
        this.AYXKKw = true;
        this.zsXlph.put(str);
        pUU.KWHzl("OrderPositionTask", "mStrategyOrderWsCallback:" + str);
    }

    public final AbstractC57556yke fetchVPNInfo() {
        C43296rmc.AEQbTJ("amt_test", "initAlgoWsCallback");
        this.fARcdN = KWHzl("algo-private-summary", new WsArgV5("algo-private-summary", null, null, "ANY", null, null, null, null, 246, null), new Function1() { // from class: o.xEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.AhwBna(this.EZpvd, (java.lang.String) obj);
            }
        });
        if (this.AhwBna == null) {
            hDKMBd();
        }
        return this.fARcdN;
    }

    public static final Unit AhwBna(xEE xee, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xee.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void AhwBna(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        C43296rmc.AEQbTJ("amt_test", "incomingData = " + str);
        this.values = true;
        this.AwvSrB.put(str);
        pUU.KWHzl("OrderPositionTask", "mVirtualAccountPosWsCallback:" + str);
    }

    public final AbstractC57556yke fARcdN() {
        this.ejfBZ = KWHzl("virtual-account-private-summary", new WsArgV5("virtual-account-private-summary", null, null, null, null, null, null, null, 254, null), new Function1() { // from class: o.xED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.AYXKKw(this.EZpvd, (java.lang.String) obj);
            }
        });
        if (this.AhwBna == null) {
            hDKMBd();
        }
        return this.ejfBZ;
    }

    public static final Unit AYXKKw(xEE xee, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xee.AhwBna(str);
        return Unit.INSTANCE;
    }

    public final AbstractC57556yke values() {
        this.fetchVPNInfo = KWHzl("dex-orders-pending-num", new WsArgV5("dex-orders-pending-num", null, null, null, null, null, null, null, 254, null), new Function1() { // from class: o.xEG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEE.gEmmrt(this.OLrzqt, (java.lang.String) obj);
            }
        });
        if (this.AhwBna == null) {
            hDKMBd();
        }
        return this.fetchVPNInfo;
    }

    public static final Unit gEmmrt(xEE xee, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xee.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) throws java.lang.InterruptedException {
        this.djBIcL = true;
        this.OLrzqt.put(str);
        pUU.KWHzl("DexPendingFlow", "dexAmtCallback:" + str + ", queue size: " + this.OLrzqt.size());
    }

    public final void valueOf() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.AEQbTJ.isEmpty()) {
            arrayList.add(this.AEQbTJ.take());
        }
        this.gEmmrt = false;
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            OrderPositions orderPositionsKWHzl = OrderPositions.Companion.KWHzl((java.lang.String) next);
            if (orderPositionsKWHzl != null) {
                this.AuCTel.setType(1);
                this.wlaJM = orderPositionsKWHzl;
                copydefault();
            }
        }
    }

    public final void isConnected() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.zsXlph.isEmpty()) {
            arrayList.add(this.zsXlph.take());
        }
        this.AYXKKw = false;
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<StrtagyOrders> listEZpvd = StrtagyOrders.Companion.EZpvd((java.lang.String) next);
            this.zLjUOn.clear();
            if (listEZpvd != null) {
                this.zLjUOn.addAll(listEZpvd);
            }
            this.AuCTel.setType(2);
            copydefault();
        }
    }

    public final void DbNXlk() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.AwvSrB.isEmpty()) {
            arrayList.add(this.AwvSrB.take());
        }
        this.values = false;
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<VirtualAccountPosData> listEZpvd = VirtualAccountPosData.Companion.EZpvd((java.lang.String) next);
            this.AuCTelauCTel.clear();
            if (listEZpvd != null) {
                this.AuCTelauCTel.addAll(listEZpvd);
            }
            this.AuCTel.setType(4);
            copydefault();
        }
    }

    public final void djBIcL() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.getNewProxyInstance.isEmpty()) {
            arrayList.add(this.getNewProxyInstance.take());
        }
        this.valueOf = false;
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<OrderLeadPosSize> listKWHzl = OrderLeadPosSize.Companion.KWHzl((java.lang.String) next);
            this.AubY.clear();
            if (listKWHzl != null) {
                this.AubY.addAll(listKWHzl);
                this.AuCTel.setType(5);
                copydefault();
            }
        }
    }

    public final void gEmmrt() {
        pUU.KWHzl("DexPendingFlow", "copyDexPendingDataAndConvert called, queue size = " + this.OLrzqt.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.OLrzqt.isEmpty()) {
            arrayList.add(this.OLrzqt.take());
        }
        this.djBIcL = false;
        pUU.KWHzl("DexPendingFlow", "copyDexPendingDataAndConvert processing " + arrayList.size() + " messages");
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            this.iwGUEr.clear();
            DexPrivateSummary dexPrivateSummaryCopydefault = DexPrivateSummary.Companion.copydefault((java.lang.String) next);
            if (dexPrivateSummaryCopydefault != null) {
                this.iwGUEr.add(dexPrivateSummaryCopydefault);
                NormalDexOrderAmtData dexOrderAmtData = this.AuCTel.getDexOrderAmtData();
                pUU.KWHzl("DexPendingFlow", "copyDexPendingDataAndConvert dexPendingOrderNum = " + dexPrivateSummaryCopydefault.getDexPendingOrderNum() + ",dexTPSLPendingOrderNum = " + dexPrivateSummaryCopydefault.getDexTpslPendingOrderNum() + " ");
                dexOrderAmtData.setDexPendingOrderNum(dexPrivateSummaryCopydefault.getDexPendingOrderNum());
                dexOrderAmtData.setDexTPSLPendingOrderNum(dexPrivateSummaryCopydefault.getDexTpslPendingOrderNum());
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55680xoX) {
            java.lang.String strCopydefault = ((AbstractC55680xoX) obj).copydefault();
            AbstractC55680xoX abstractC55680xoX = this.fJNWhG;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55680xoX != null ? abstractC55680xoX.copydefault() : null))) {
                return false;
            }
        }
        fIwbmz();
        return true;
    }

    public final void fIwbmz() {
        C55754xps.AEQbTJ.EZpvd();
        AbstractC57556yke abstractC57556yke = this.fIwbmz;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        AbstractC57556yke abstractC57556yke2 = this.fARcdN;
        if (abstractC57556yke2 != null) {
            abstractC57556yke2.djBIcL();
        }
        AbstractC57556yke abstractC57556yke3 = this.ejfBZ;
        if (abstractC57556yke3 != null) {
            abstractC57556yke3.djBIcL();
        }
        AbstractC57556yke abstractC57556yke4 = this.AkhnZx;
        if (abstractC57556yke4 != null) {
            abstractC57556yke4.djBIcL();
        }
        AbstractC57556yke abstractC57556yke5 = this.fetchVPNInfo;
        if (abstractC57556yke5 != null) {
            abstractC57556yke5.djBIcL();
        }
        C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
        stateListAnimator.EZpvd("private-summary", this.fIwbmz);
        stateListAnimator.EZpvd("algo-private-summary", this.fARcdN);
        stateListAnimator.EZpvd("virtual-account-private-summary", this.ejfBZ);
        stateListAnimator.EZpvd("copy-private-corner", this.AkhnZx);
        stateListAnimator.EZpvd("dex-orders-pending-num", this.fetchVPNInfo);
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.DbNXlk.AYXKKw();
        this.copydefault.AYXKKw();
        InterfaceC58217yxC interfaceC58217yxC2 = this.AxsJAY;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.hDKMBd;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        C55749xpn.OLrzqt.AEQbTJ(null);
    }

    public static final Unit KWHzl(xEE xee, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            xee.OLrzqt((ResponseData<java.util.List<StrtagyOrders>>) responseData);
        } else {
            pUU.KWHzl("OrderPositionTask", "Get bot count fail: " + responseData.getMsg());
        }
        AbstractC57556yke abstractC57556ykeFetchVPNInfo = xee.fetchVPNInfo();
        xee.fARcdN = abstractC57556ykeFetchVPNInfo;
        if (abstractC57556ykeFetchVPNInfo != null) {
            abstractC57556ykeFetchVPNInfo.AhwBna();
        }
        return Unit.INSTANCE;
    }
}
