package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iFI;

/* JADX INFO: loaded from: classes6.dex */
public final class GetAggregateListUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AggregateData>>, Object> {
    final /* synthetic */ V2ProductQuery $query;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ iFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAggregateListUseCaseImpl$invoke$2(iFI ifi, V2ProductQuery v2ProductQuery, Continuation<? super GetAggregateListUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ifi;
        this.$query = v2ProductQuery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetAggregateListUseCaseImpl$invoke$2(this.this$0, this.$query, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AggregateData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<AggregateData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<AggregateData>> continuation) {
        return ((GetAggregateListUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        V2ProductQuery v2ProductQuery;
        iFI ifi;
        Object objOLrzqt;
        V2ProductQuery v2ProductQuery2;
        iFI ifi2;
        String str;
        String str2;
        Object objOLrzqt2;
        AggregateData aggregateData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strCopydefault = this.this$0.copydefault.copydefault();
                v2ProductQuery = this.$query;
                ifi = this.this$0;
                Result.Application application = Result.Companion;
                if (!Intrinsics.EZpvd(v2ProductQuery.isSearch(), C56443yFo.KWHzl(true))) {
                    InterfaceC25472ixP interfaceC25472ixPOLrzqt = ifi.EZpvd.OLrzqt();
                    int tabId = v2ProductQuery.getTabId();
                    String itemKey = v2ProductQuery.getItemKey();
                    Integer pageNum = v2ProductQuery.getPageNum();
                    Integer subTabId = v2ProductQuery.getSubTabId();
                    String network = v2ProductQuery.getNetwork();
                    String filterTypeId = v2ProductQuery.getFilterTypeId();
                    String property = v2ProductQuery.getProperty();
                    String riskFilterId = v2ProductQuery.getRiskFilterId();
                    this.label = 3;
                    objOLrzqt = interfaceC25472ixPOLrzqt.OLrzqt(tabId, itemKey, pageNum, subTabId, network, filterTypeId, property, strCopydefault, riskFilterId, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
                    Intrinsics.copydefault(objUnwrapResponseData$default);
                    aggregateData = (AggregateData) objUnwrapResponseData$default;
                } else {
                    Integer pageNum2 = v2ProductQuery.getPageNum();
                    if (pageNum2 != null && pageNum2.intValue() == 1) {
                        this.L$0 = strCopydefault;
                        this.L$1 = v2ProductQuery;
                        this.L$2 = ifi;
                        this.label = 1;
                        if (ifi.EZpvd(v2ProductQuery, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        v2ProductQuery2 = v2ProductQuery;
                        ifi2 = ifi;
                        str = strCopydefault;
                        str2 = str;
                        ifi = ifi2;
                        v2ProductQuery = v2ProductQuery2;
                        InterfaceC25472ixP interfaceC25472ixPOLrzqt2 = ifi.EZpvd.OLrzqt();
                        int tabId2 = v2ProductQuery.getTabId();
                        Integer pageNum3 = v2ProductQuery.getPageNum();
                        String strKWHzl = ifi.KWHzl(v2ProductQuery.getKeyword());
                        String network2 = v2ProductQuery.getNetwork();
                        String investType = v2ProductQuery.getInvestType();
                        String property2 = v2ProductQuery.getProperty();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        objOLrzqt2 = interfaceC25472ixPOLrzqt2.OLrzqt(tabId2, strKWHzl, pageNum3, network2, investType, property2, str2, this);
                        if (objOLrzqt2 == objCopydefault) {
                        }
                        Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt2, null, 1, null);
                        Intrinsics.copydefault(objUnwrapResponseData$default2);
                        aggregateData = (AggregateData) objUnwrapResponseData$default2;
                    }
                    str2 = strCopydefault;
                    InterfaceC25472ixP interfaceC25472ixPOLrzqt22 = ifi.EZpvd.OLrzqt();
                    int tabId22 = v2ProductQuery.getTabId();
                    Integer pageNum32 = v2ProductQuery.getPageNum();
                    String strKWHzl2 = ifi.KWHzl(v2ProductQuery.getKeyword());
                    String network22 = v2ProductQuery.getNetwork();
                    String investType2 = v2ProductQuery.getInvestType();
                    String property22 = v2ProductQuery.getProperty();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    objOLrzqt2 = interfaceC25472ixPOLrzqt22.OLrzqt(tabId22, strKWHzl2, pageNum32, network22, investType2, property22, str2, this);
                    if (objOLrzqt2 == objCopydefault) {
                    }
                    Object objUnwrapResponseData$default22 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt2, null, 1, null);
                    Intrinsics.copydefault(objUnwrapResponseData$default22);
                    aggregateData = (AggregateData) objUnwrapResponseData$default22;
                }
            } else if (i == 1) {
                ifi2 = (iFI) this.L$2;
                v2ProductQuery2 = (V2ProductQuery) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str;
                ifi = ifi2;
                v2ProductQuery = v2ProductQuery2;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt222 = ifi.EZpvd.OLrzqt();
                int tabId222 = v2ProductQuery.getTabId();
                Integer pageNum322 = v2ProductQuery.getPageNum();
                String strKWHzl22 = ifi.KWHzl(v2ProductQuery.getKeyword());
                String network222 = v2ProductQuery.getNetwork();
                String investType22 = v2ProductQuery.getInvestType();
                String property222 = v2ProductQuery.getProperty();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                objOLrzqt2 = interfaceC25472ixPOLrzqt222.OLrzqt(tabId222, strKWHzl22, pageNum322, network222, investType22, property222, str2, this);
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                Object objUnwrapResponseData$default222 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt2, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default222);
                aggregateData = (AggregateData) objUnwrapResponseData$default222;
            } else if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                objOLrzqt2 = obj;
                Object objUnwrapResponseData$default2222 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt2, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default2222);
                aggregateData = (AggregateData) objUnwrapResponseData$default2222;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                Object objUnwrapResponseData$default3 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default3);
                aggregateData = (AggregateData) objUnwrapResponseData$default3;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(aggregateData);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
