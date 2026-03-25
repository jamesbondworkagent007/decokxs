package o;

import androidx.camera.video.AudioStats;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.subscribe.TickerDataGroup;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C6777aVl;
import o.xMJ;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xoj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55692xoj {
    public static final C55692xoj KWHzl = new C55692xoj();

    private C55692xoj() {
    }

    public static /* synthetic */ kotlin.Pair calApplies$default(C55692xoj c55692xoj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return c55692xoj.AEQbTJ(str, str2, str3, str4, z);
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (z) {
            strCopydefault = str2;
        } else {
            InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            strCopydefault = interfaceC43033rhe != null ? interfaceC43033rhe.copydefault(str2, str3, str4) : null;
        }
        if (strCopydefault != null && strCopydefault.length() != 0) {
            new BigDecimal(strCopydefault).doubleValue();
        }
        java.lang.String strSubS$default = C33129mqd.subS$default(str, strCopydefault, null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        double dDivD$default = C33129mqd.divD$default(strSubS$default, strCopydefault, 4, null, roundingMode, 4, null);
        java.lang.String str5 = dDivD$default > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "";
        java.lang.String str6 = str5 + pTB.KWHzl(pTB.OLrzqt(java.lang.Double.valueOf(dDivD$default)), 2, roundingMode);
        if (str.length() == 0) {
            str6 = "--";
        }
        if (dDivD$default == AudioStats.AUDIO_AMPLITUDE_NONE && ((strCopydefault == null || strCopydefault.length() == 0) && str.length() > 0)) {
            pUU.EZpvd("WMYYYY", "calApplies: price is null, last = " + str);
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("cal result is wrong");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("last", str);
            linkedHashMap.put("price24before", str2);
            linkedHashMap.put("utc0Price", str3);
            linkedHashMap.put("utc8Price", str4);
            linkedHashMap.put(FirebaseAnalytics.Param.PRICE, strCopydefault != null ? strCopydefault : "");
            linkedHashMap.put("value", java.lang.String.valueOf(dDivD$default));
            linkedHashMap.put(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, str6);
            Unit unit = Unit.INSTANCE;
            taskDescription.copydefault(illegalStateException, linkedHashMap, null);
        }
        return C56390yDp.OLrzqt(java.lang.Double.valueOf(dDivD$default), str6);
    }

    public final java.lang.String OLrzqt() {
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        java.lang.String strDjBIcL = interfaceC43033rhe != null ? interfaceC43033rhe.djBIcL() : null;
        return strDjBIcL == null ? "" : strDjBIcL;
    }

    public final xMJ.Application AEQbTJ(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        xMJ.Application application = new xMJ.Application();
        application.AhwBna(tickersData.getLast());
        application.KWHzl(tickersData.getLastSz());
        application.djBIcL(tickersData.getOpen24h());
        application.AkhnZx(tickersData.getSodUtc0());
        application.values(tickersData.getSodUtc8());
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        java.lang.String strCopydefault = interfaceC43033rhe != null ? interfaceC43033rhe.copydefault(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()) : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        application.isConnected(strCopydefault);
        application.AYXKKw(tickersData.getHigh24h());
        application.valueOf(tickersData.getLow24h());
        application.DbNXlk(tickersData.getVolCcy24h());
        application.fetchVPNInfo(tickersData.getVol24h());
        java.lang.String askPx = tickersData.getAskPx();
        if (askPx == null) {
            askPx = "";
        }
        application.OLrzqt(askPx);
        java.lang.String bidPx = tickersData.getBidPx();
        application.AEQbTJ(bidPx != null ? bidPx : "");
        application.EZpvd((java.lang.String) calApplies$default(this, tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), false, 16, null).getSecond());
        return application;
    }

    public static /* synthetic */ InterfaceC58217yxC getMarkPriceTicker$default(C55692xoj c55692xoj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
        if ((i & 4) != 0 && (str3 = c55692xoj.OLrzqt()) == null) {
            str3 = "";
        }
        return c55692xoj.EZpvd(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, interfaceC55701xos);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarkPriceTicker(str, str2, str3, str4, str5), new Function1() { // from class: o.xok
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55692xoj.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xoq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55692xoj.copydefault(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final ResponseData<java.util.List<TickersData>> AEQbTJ() {
        return new ResponseData<>(0, null, null, null, yDY.AhwBna(), null, 46, null);
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull final InterfaceC55701xos<java.util.List<TickerDataGroup>> interfaceC55701xos) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        AbstractC58185ywX abstractC58185ywXKWHzl2;
        AbstractC58185ywX<ResponseData<java.util.List<TickersData>>> abstractC58185ywXKWHzl3;
        java.lang.Boolean boolDbNXlk;
        java.lang.Boolean boolAhwBna;
        java.lang.Boolean boolDbNXlk2;
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (xndAEQbTJ == null || (boolDbNXlk2 = xndAEQbTJ.DbNXlk()) == null) ? false : boolDbNXlk2.booleanValue();
        boolean zBooleanValue3 = (xndAEQbTJ == null || (boolAhwBna = xndAEQbTJ.AhwBna()) == null) ? false : boolAhwBna.booleanValue();
        if (xndAEQbTJ != null && (boolDbNXlk = xndAEQbTJ.DbNXlk()) != null) {
            zBooleanValue = boolDbNXlk.booleanValue();
        }
        AbstractC58185ywX marketTickers$default = BizApiService.TaskDescription.getMarketTickers$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "SPOT", null, 2, null);
        if (zBooleanValue2) {
            abstractC58185ywXKWHzl = BizApiService.TaskDescription.getMarketTickers$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "SWAP", null, 2, null);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        if (zBooleanValue3) {
            abstractC58185ywXKWHzl2 = BizApiService.TaskDescription.getMarketTickers$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "FUTURES", null, 2, null);
        } else {
            abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        }
        if (zBooleanValue) {
            BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
            java.lang.String strOLrzqt = OLrzqt();
            abstractC58185ywXKWHzl3 = bizApiService.getMarkPriceTicker("OPTION", null, strOLrzqt == null ? "" : strOLrzqt, null, null);
        } else {
            abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault(marketTickers$default, abstractC58185ywXKWHzl, abstractC58185ywXKWHzl2, abstractC58185ywXKWHzl3);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return C33024moe.copydefault(abstractC58185ywXCopydefault, (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.xom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55692xoj.copydefault(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0<Unit>) new Function0() { // from class: o.xoi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55692xoj.copydefault(arrayList, interfaceC55701xos);
            }
        }, new Function1() { // from class: o.xol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55692xoj.AEQbTJ(arrayList, (ResponseData) obj);
            }
        });
    }

    public static final Unit copydefault(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C43296rmc.KWHzl("MarketLoader", "sys error");
        interfaceC55701xos.EZpvd(false, null, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.util.ArrayList arrayList, InterfaceC55701xos interfaceC55701xos) {
        if (arrayList.size() == 4) {
            interfaceC55701xos.EZpvd(true, arrayList, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.util.ArrayList arrayList, ResponseData responseData) {
        java.lang.String instType;
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.String instType2 = ((TickersData) ((java.util.List) data).get(0)).getInstType();
            if (instType2 == null || instType2.length() == 0) {
                instType = "OPTION";
            } else {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                instType = ((TickersData) ((java.util.List) data2).get(0)).getInstType();
            }
            java.lang.Object data3 = responseData.getData();
            Intrinsics.copydefault(data3);
            arrayList.add(new TickerDataGroup(instType, (java.util.List) data3));
        } else {
            arrayList.add(new TickerDataGroup(Constants.IPC_BUNDLE_KEY_SEND_ERROR, null));
        }
        return Unit.INSTANCE;
    }
}
