package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.CategoryRespData;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.TradeGreeksData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xIy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54452xIy {
    public final InterfaceC58217yxC OLrzqt(@NotNull final InterfaceC55701xos<java.util.List<ChargeGroupData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getCoinGroup(), new Function1() { // from class: o.xIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54452xIy.djBIcL(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54452xIy.EZpvd(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit djBIcL(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull java.lang.String str, @NotNull final InterfaceC55701xos<java.util.List<TradeGroupData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getCategoryList(str), new Function1() { // from class: o.xIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54452xIy.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54452xIy.EZpvd(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final java.util.List<TradeGroupData> AEQbTJ(java.util.List<CategoryRespData> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CategoryRespData categoryRespData : list) {
            arrayList.add(new TradeGroupData(categoryRespData.getCode(), categoryRespData.getMessage(), categoryRespData.getType(), categoryRespData.isNew(), false, 16, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public static /* synthetic */ InterfaceC58217yxC requestTradeGreeksList$default(C54452xIy c54452xIy, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c54452xIy.KWHzl(str, (InterfaceC55701xos<java.util.List<TradeGreeksData>>) interfaceC55701xos);
    }

    public final InterfaceC58217yxC KWHzl(java.lang.String str, @NotNull final InterfaceC55701xos<java.util.List<TradeGreeksData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getTradeGreeksList(str), new Function1() { // from class: o.xIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54452xIy.AEQbTJ(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54452xIy.copydefault(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC55701xos interfaceC55701xos, C54452xIy c54452xIy, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, c54452xIy.AEQbTJ((java.util.List) responseData.getData()), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
