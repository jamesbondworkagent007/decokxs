package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.domain.usecase.RequestTradingCalendarDetailUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41013qim extends AbstractC49400uno<java.util.List<? extends C41054qja>, InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>>> {
    public final C40889qgU AEQbTJ;
    public final C40890qgV EZpvd;
    public final C40892qgX KWHzl;
    public final C40893qgY OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((java.util.List<C41054qja>) obj, (Continuation<? super InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>>>) continuation);
    }

    @yCM
    public C41013qim(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40889qgU c40889qgU, @NotNull C40890qgV c40890qgV, @NotNull C40892qgX c40892qgX, @NotNull C40893qgY c40893qgY) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40889qgU, "");
        Intrinsics.checkNotNullParameter(c40890qgV, "");
        Intrinsics.checkNotNullParameter(c40892qgX, "");
        Intrinsics.checkNotNullParameter(c40893qgY, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c40889qgU;
        this.EZpvd = c40890qgV;
        this.KWHzl = c40892qgX;
        this.OLrzqt = c40893qgY;
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a6) to fix multi-entry loop: BACK_EDGE: B:76:0x01a6 -> B:77:0x01a9 */
    /* JADX WARN: Path cross not found for [B:10:0x002d, B:29:0x009c], limit reached: 106 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01e8 -> B:88:0x01e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.util.List<C41054qja> list, @NotNull Continuation<? super InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>>> continuation) throws java.lang.Throwable {
        RequestTradingCalendarDetailUseCase$onExecute$1 requestTradingCalendarDetailUseCase$onExecute$1;
        C41013qim c41013qim;
        C41013qim c41013qim2;
        java.lang.String str;
        C40889qgU c40889qgU;
        java.lang.String str2;
        java.lang.String str3;
        C41013qim c41013qim3;
        java.lang.Object objM7377constructorimpl;
        C41013qim c41013qim4;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.ArrayList arrayList2;
        if (continuation instanceof RequestTradingCalendarDetailUseCase$onExecute$1) {
            requestTradingCalendarDetailUseCase$onExecute$1 = (RequestTradingCalendarDetailUseCase$onExecute$1) continuation;
            int i = requestTradingCalendarDetailUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestTradingCalendarDetailUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                requestTradingCalendarDetailUseCase$onExecute$1 = new RequestTradingCalendarDetailUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = requestTradingCalendarDetailUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = requestTradingCalendarDetailUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            try {
                Result.Application application = Result.Companion;
                C40889qgU c40889qgU2 = this.AEQbTJ;
                java.lang.String requestValue = TradingCalendarType.ALL.getRequestValue();
                java.lang.String strValueOf = java.lang.String.valueOf(((C41054qja) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).AEQbTJ());
                C40890qgV c40890qgV = this.EZpvd;
                java.lang.Long lKWHzl = C56443yFo.KWHzl(((C41054qja) CollectionsKt___CollectionsKt.AubY(list)).AEQbTJ());
                requestTradingCalendarDetailUseCase$onExecute$1.L$0 = this;
                requestTradingCalendarDetailUseCase$onExecute$1.L$1 = strValueOf;
                requestTradingCalendarDetailUseCase$onExecute$1.L$2 = "";
                requestTradingCalendarDetailUseCase$onExecute$1.L$3 = requestValue;
                requestTradingCalendarDetailUseCase$onExecute$1.L$4 = c40889qgU2;
                requestTradingCalendarDetailUseCase$onExecute$1.label = 1;
                java.lang.Object objEZpvd = c40890qgV.EZpvd(lKWHzl, requestTradingCalendarDetailUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c41013qim2 = this;
                str = requestValue;
                c40889qgU = c40889qgU2;
                objOLrzqt = objEZpvd;
                str2 = strValueOf;
                str3 = "";
                java.lang.String str4 = str;
                long jLongValue = ((java.lang.Number) objOLrzqt).longValue();
                requestTradingCalendarDetailUseCase$onExecute$1.L$0 = c41013qim2;
                requestTradingCalendarDetailUseCase$onExecute$1.L$1 = null;
                requestTradingCalendarDetailUseCase$onExecute$1.L$2 = null;
                requestTradingCalendarDetailUseCase$onExecute$1.L$3 = null;
                requestTradingCalendarDetailUseCase$onExecute$1.L$4 = null;
                requestTradingCalendarDetailUseCase$onExecute$1.label = 2;
                objOLrzqt = c40889qgU.OLrzqt(str4, str3, str2, java.lang.String.valueOf(jLongValue), requestTradingCalendarDetailUseCase$onExecute$1);
                if (objOLrzqt != objCopydefault) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                c41013qim = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                c41013qim3 = c41013qim;
                if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    c41013qim3 = (C41013qim) requestTradingCalendarDetailUseCase$onExecute$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objOLrzqt);
                        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        c41013qim = c41013qim3;
                        Result.Application application22 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        c41013qim3 = c41013qim;
                    }
                    if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
                        return new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null);
                    }
                    java.util.Collection collection = (java.util.Collection) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (collection == null || collection.isEmpty()) {
                        return new InterfaceC49371unL.TaskDescription(null, 1, null);
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.Object obj = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
                    Intrinsics.copydefault(obj);
                    c41013qim4 = c41013qim3;
                    arrayList = arrayList3;
                    it = ((java.lang.Iterable) obj).iterator();
                    while (it.hasNext()) {
                    }
                    return new InterfaceC49371unL.Activity(arrayList);
                }
                if (i2 == 3) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) requestTradingCalendarDetailUseCase$onExecute$1.L$4;
                    it = (java.util.Iterator) requestTradingCalendarDetailUseCase$onExecute$1.L$2;
                    arrayList2 = (java.util.ArrayList) requestTradingCalendarDetailUseCase$onExecute$1.L$1;
                    c41013qim4 = (C41013qim) requestTradingCalendarDetailUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    arrayList4.add(objOLrzqt);
                    arrayList = arrayList2;
                    while (it.hasNext()) {
                    }
                    return new InterfaceC49371unL.Activity(arrayList);
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = (java.util.ArrayList) requestTradingCalendarDetailUseCase$onExecute$1.L$4;
                it = (java.util.Iterator) requestTradingCalendarDetailUseCase$onExecute$1.L$2;
                arrayList2 = (java.util.ArrayList) requestTradingCalendarDetailUseCase$onExecute$1.L$1;
                c41013qim4 = (C41013qim) requestTradingCalendarDetailUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayList.add(objOLrzqt);
                arrayList = arrayList2;
                while (it.hasNext()) {
                    TradingCalendarPo tradingCalendarPo = (TradingCalendarPo) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) tradingCalendarPo.getType(), (java.lang.Object) TradingCalendarType.ECONOMIC.getRequestValue()) && tradingCalendarPo.getEconomicData() != null && C33129mqd.OLrzqt((java.lang.CharSequence) tradingCalendarPo.getEconomicData().valueOf())) {
                        C40888qgT economicData = tradingCalendarPo.getEconomicData();
                        C40892qgX c40892qgX = c41013qim4.KWHzl;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$0 = c41013qim4;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$1 = arrayList;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$2 = it;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$3 = economicData;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$4 = arrayList;
                        requestTradingCalendarDetailUseCase$onExecute$1.label = 3;
                        java.lang.Object objEZpvd2 = c40892qgX.EZpvd(economicData, requestTradingCalendarDetailUseCase$onExecute$1);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        arrayList2 = arrayList;
                        arrayList.add(objEZpvd2);
                        arrayList = arrayList2;
                        while (it.hasNext()) {
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) tradingCalendarPo.getType(), (java.lang.Object) TradingCalendarType.TOKEN_UNLOCK.getRequestValue()) && tradingCalendarPo.getTokenUnlockData() != null && C33129mqd.OLrzqt((java.lang.CharSequence) tradingCalendarPo.getTokenUnlockData().AYXKKw())) {
                        C40885qgQ tokenUnlockData = tradingCalendarPo.getTokenUnlockData();
                        C40893qgY c40893qgY = c41013qim4.OLrzqt;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$0 = c41013qim4;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$1 = arrayList;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$2 = it;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$3 = tokenUnlockData;
                        requestTradingCalendarDetailUseCase$onExecute$1.L$4 = arrayList;
                        requestTradingCalendarDetailUseCase$onExecute$1.label = 4;
                        objOLrzqt = c40893qgY.EZpvd(tokenUnlockData, (Continuation) requestTradingCalendarDetailUseCase$onExecute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        arrayList2 = arrayList;
                        arrayList.add(objOLrzqt);
                        arrayList = arrayList2;
                        while (it.hasNext()) {
                        }
                    }
                }
                return new InterfaceC49371unL.Activity(arrayList);
            }
            C40889qgU c40889qgU3 = (C40889qgU) requestTradingCalendarDetailUseCase$onExecute$1.L$4;
            java.lang.String str5 = (java.lang.String) requestTradingCalendarDetailUseCase$onExecute$1.L$3;
            str3 = (java.lang.String) requestTradingCalendarDetailUseCase$onExecute$1.L$2;
            str2 = (java.lang.String) requestTradingCalendarDetailUseCase$onExecute$1.L$1;
            c41013qim = (C41013qim) requestTradingCalendarDetailUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                c41013qim2 = c41013qim;
                str = str5;
                c40889qgU = c40889qgU3;
                java.lang.String str42 = str;
                try {
                    long jLongValue2 = ((java.lang.Number) objOLrzqt).longValue();
                    requestTradingCalendarDetailUseCase$onExecute$1.L$0 = c41013qim2;
                    requestTradingCalendarDetailUseCase$onExecute$1.L$1 = null;
                    requestTradingCalendarDetailUseCase$onExecute$1.L$2 = null;
                    requestTradingCalendarDetailUseCase$onExecute$1.L$3 = null;
                    requestTradingCalendarDetailUseCase$onExecute$1.L$4 = null;
                    requestTradingCalendarDetailUseCase$onExecute$1.label = 2;
                    objOLrzqt = c40889qgU.OLrzqt(str42, str3, str2, java.lang.String.valueOf(jLongValue2), requestTradingCalendarDetailUseCase$onExecute$1);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c41013qim = c41013qim2;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c41013qim3 = c41013qim;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application2222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                c41013qim3 = c41013qim;
                if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
            }
            if (objOLrzqt != objCopydefault) {
                return objCopydefault;
            }
            c41013qim3 = c41013qim2;
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
            if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
        }
    }
}
