package com.okinc.business.market.features.scanner.surge.ui;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29296kqv;
import o.C29299kqy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29359ksE;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabViewModel$fetchTrendingSection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SurgeTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeTabViewModel$fetchTrendingSection$1(SurgeTabViewModel surgeTabViewModel, Continuation<? super SurgeTabViewModel$fetchTrendingSection$1> continuation) {
        super(2, continuation);
        this.this$0 = surgeTabViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurgeTabViewModel$fetchTrendingSection$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurgeTabViewModel$fetchTrendingSection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String strEZpvd;
        ChainInfoData chainInfoData;
        Object obj2;
        Object objM7386unboximpl;
        SurgeTabViewModel surgeTabViewModel;
        TrendingConfigData trendingConfigData;
        Object next;
        String str;
        SurgeTrendingChainFilterData surgeTrendingChainFilterData;
        String str2;
        Object objM7386unboximpl2;
        SurgeTabViewModel surgeTabViewModel2;
        List<ChainInfoData> listCopydefault;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29296kqv c29296kqv = this.this$0.AYXKKw;
            this.label = 1;
            objOLrzqt = c29296kqv.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$3;
                    trendingConfigData = (TrendingConfigData) this.L$2;
                    surgeTabViewModel2 = (SurgeTabViewModel) this.L$1;
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                        objM7386unboximpl2 = null;
                    }
                    surgeTabViewModel = surgeTabViewModel2;
                    String str3 = str2;
                    surgeTrendingChainFilterData = (SurgeTrendingChainFilterData) objM7386unboximpl2;
                    str = str3;
                    surgeTabViewModel.KWHzl(trendingConfigData, str, surgeTrendingChainFilterData);
                    surgeTabViewModel.djBIcL = true;
                    SurgeTabViewModel.fetchTrendingTokens$default(surgeTabViewModel, false, 1, null);
                    objOLrzqt = obj2;
                    SurgeTabViewModel surgeTabViewModel3 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
                        MutableStateFlow mutableStateFlow = surgeTabViewModel3.AEQbTJ;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, InterfaceC29359ksE.Activity.OLrzqt));
                        surgeTabViewModel3.djBIcL = true;
                    }
                    return Unit.INSTANCE;
                }
                String str4 = (String) this.L$3;
                TrendingConfigData trendingConfigData2 = (TrendingConfigData) this.L$2;
                surgeTabViewModel = (SurgeTabViewModel) this.L$1;
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                strEZpvd = str4;
                trendingConfigData = trendingConfigData2;
                obj2 = obj3;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                str = (String) objM7386unboximpl;
                if (str != null || (listCopydefault = trendingConfigData.copydefault()) == null || listCopydefault.isEmpty()) {
                    str = strEZpvd;
                    if (str.length() > 0) {
                        C29299kqy c29299kqy = surgeTabViewModel.fetchVPNInfo;
                        this.L$0 = obj2;
                        this.L$1 = surgeTabViewModel;
                        this.L$2 = trendingConfigData;
                        this.L$3 = str;
                        this.label = 3;
                        Object objOLrzqt2 = c29299kqy.OLrzqt(str, this);
                        if (objOLrzqt2 == objCopydefault) {
                            return objCopydefault;
                        }
                        str2 = str;
                        objM7386unboximpl2 = objOLrzqt2;
                        surgeTabViewModel2 = surgeTabViewModel;
                        if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                        }
                        surgeTabViewModel = surgeTabViewModel2;
                        String str32 = str2;
                        surgeTrendingChainFilterData = (SurgeTrendingChainFilterData) objM7386unboximpl2;
                        str = str32;
                        surgeTabViewModel.KWHzl(trendingConfigData, str, surgeTrendingChainFilterData);
                        surgeTabViewModel.djBIcL = true;
                        SurgeTabViewModel.fetchTrendingTokens$default(surgeTabViewModel, false, 1, null);
                        objOLrzqt = obj2;
                    } else {
                        surgeTrendingChainFilterData = null;
                        surgeTabViewModel.KWHzl(trendingConfigData, str, surgeTrendingChainFilterData);
                        surgeTabViewModel.djBIcL = true;
                        SurgeTabViewModel.fetchTrendingTokens$default(surgeTabViewModel, false, 1, null);
                        objOLrzqt = obj2;
                    }
                } else {
                    Iterator<T> it = listCopydefault.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((ChainInfoData) it.next()).EZpvd(), (Object) str)) {
                            break;
                        }
                    }
                    str = strEZpvd;
                    if (str.length() > 0) {
                    }
                }
                SurgeTabViewModel surgeTabViewModel32 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        SurgeTabViewModel surgeTabViewModel4 = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            TrendingConfigData trendingConfigData3 = (TrendingConfigData) objOLrzqt;
            surgeTabViewModel4.fARcdN = trendingConfigData3;
            List<ChainInfoData> listCopydefault2 = trendingConfigData3.copydefault();
            if (listCopydefault2 != null) {
                Iterator<T> it2 = listCopydefault2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((ChainInfoData) next).AYXKKw() == StringBooleanType.TRUE) {
                        break;
                    }
                }
                ChainInfoData chainInfoData2 = (ChainInfoData) next;
                if (chainInfoData2 == null || (strEZpvd = chainInfoData2.EZpvd()) == null) {
                    List<ChainInfoData> listCopydefault3 = trendingConfigData3.copydefault();
                    strEZpvd = (listCopydefault3 == null || (chainInfoData = (ChainInfoData) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault3)) == null) ? null : chainInfoData.EZpvd();
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                }
                C29299kqy c29299kqy2 = surgeTabViewModel4.fetchVPNInfo;
                this.L$0 = objOLrzqt;
                this.L$1 = surgeTabViewModel4;
                this.L$2 = trendingConfigData3;
                this.L$3 = strEZpvd;
                this.label = 2;
                Object objKWHzl = c29299kqy2.KWHzl(this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objOLrzqt;
                objM7386unboximpl = objKWHzl;
                surgeTabViewModel = surgeTabViewModel4;
                trendingConfigData = trendingConfigData3;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                str = (String) objM7386unboximpl;
                if (str != null) {
                    str = strEZpvd;
                    if (str.length() > 0) {
                    }
                }
            }
        }
        SurgeTabViewModel surgeTabViewModel322 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
        }
        return Unit.INSTANCE;
    }
}
