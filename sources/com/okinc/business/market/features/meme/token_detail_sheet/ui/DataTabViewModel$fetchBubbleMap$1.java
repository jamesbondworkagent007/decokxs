package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27629jym;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class DataTabViewModel$fetchBubbleMap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ DataTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataTabViewModel$fetchBubbleMap$1(DataTabViewModel dataTabViewModel, String str, String str2, Continuation<? super DataTabViewModel$fetchBubbleMap$1> continuation) {
        super(2, continuation);
        this.this$0 = dataTabViewModel;
        this.$tokenAddress = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataTabViewModel$fetchBubbleMap$1(this.this$0, this.$tokenAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataTabViewModel$fetchBubbleMap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27629jym c27629jym = this.this$0.AhwBna;
            String str = this.$tokenAddress;
            String str2 = this.$chainId;
            this.label = 1;
            objAEQbTJ = c27629jym.AEQbTJ(str, str2, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        DataTabViewModel dataTabViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) objAEQbTJ;
            MutableStateFlow mutableStateFlow = dataTabViewModel.EZpvd;
            String okxWebSiteUrl = latestMarketInfoBean.getBubbleMapInfo().getOkxWebSiteUrl();
            String thirdPartyWebSiteUrl = latestMarketInfoBean.getBubbleMapInfo().getThirdPartyWebSiteUrl();
            if (okxWebSiteUrl == null || okxWebSiteUrl.length() == 0) {
                okxWebSiteUrl = thirdPartyWebSiteUrl;
            }
            mutableStateFlow.setValue(okxWebSiteUrl);
        }
        DataTabViewModel dataTabViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            dataTabViewModel2.EZpvd.setValue("");
        }
        return Unit.INSTANCE;
    }
}
