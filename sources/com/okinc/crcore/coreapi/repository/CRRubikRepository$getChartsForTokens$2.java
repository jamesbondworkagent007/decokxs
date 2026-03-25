package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.repository.CRRubikRepository$getChartsForTokens$2;
import com.okinc.crcore.shared.net.responsebean.TokenChartBeans;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31747mCk;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31771mDh;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRRubikRepository$getChartsForTokens$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends TokenChartBeans>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $fiat;
    final /* synthetic */ List<String> $tokenList;
    final /* synthetic */ boolean $useCache;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31747mCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRRubikRepository$getChartsForTokens$2(C31747mCk c31747mCk, List<String> list, String str, boolean z, Continuation<? super CRRubikRepository$getChartsForTokens$2> continuation) {
        super(2, continuation);
        this.this$0 = c31747mCk;
        this.$tokenList = list;
        this.$fiat = str;
        this.$useCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRRubikRepository$getChartsForTokens$2 cRRubikRepository$getChartsForTokens$2 = new CRRubikRepository$getChartsForTokens$2(this.this$0, this.$tokenList, this.$fiat, this.$useCache, continuation);
        cRRubikRepository$getChartsForTokens$2.L$0 = obj;
        return cRRubikRepository$getChartsForTokens$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends TokenChartBeans>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<TokenChartBeans>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<TokenChartBeans>, OKServerException>> continuation) {
        return ((CRRubikRepository$getChartsForTokens$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object chartsForTokens$default;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31747mCk c31747mCk = this.this$0;
                List<String> list = this.$tokenList;
                String str = this.$fiat;
                boolean z = this.$useCache;
                InterfaceC31771mDh interfaceC31771mDh = c31747mCk.OLrzqt;
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
                String str2 = z ? "FIRST_CACHE" : "NO_CACHE";
                this.label = 1;
                chartsForTokens$default = InterfaceC31771mDh.Application.getChartsForTokens$default(interfaceC31771mDh, strJoinToString$default, str, str2, 0, this, 8, null);
                if (chartsForTokens$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                chartsForTokens$default = obj;
            }
            responseData = (ResponseData) chartsForTokens$default;
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mCx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CRRubikRepository$getChartsForTokens$2.invokeSuspend$lambda$1((java.util.List) obj2);
                }
            });
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRRubikRepository$getChartsForTokens$2.invokeSuspend$lambda$1((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(List list) {
        return TokenChartBeans.Companion.copydefault(list);
    }
}
