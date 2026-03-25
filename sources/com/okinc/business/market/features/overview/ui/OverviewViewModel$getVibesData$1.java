package com.okinc.business.market.features.overview.ui;

import com.okinc.business.market.domain.model.coininfo.Social;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.search.bean.SearchResultContentPo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29116kna;
import o.C56391yDq;
import o.C56442yFn;
import o.kAN;
import o.kKG;

/* JADX INFO: loaded from: classes7.dex */
public final class OverviewViewModel$getVibesData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewModel$getVibesData$1(OverviewViewModel overviewViewModel, Continuation<? super OverviewViewModel$getVibesData$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewViewModel$getVibesData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewViewModel$getVibesData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        C29116kna c29116kna;
        MutableStateFlow mutableStateFlow;
        String str;
        List<Social> listValueOf;
        Social socialAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kAN kan = this.this$0.gEmmrt;
            String chainId = this.this$0.AEQbTJ().getChainId();
            String tokenContractAddress = this.this$0.AEQbTJ().getTokenContractAddress();
            this.label = 1;
            objAEQbTJ = kan.AEQbTJ(chainId, tokenContractAddress, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$3;
                c29116kna = (C29116kna) this.L$2;
                String str2 = (String) this.L$1;
                C56391yDq.AEQbTJ(obj);
                str = str2;
                mutableStateFlow.setValue(C29116kna.copy$default(c29116kna, null, null, null, null, str, (String) obj, 15, null));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        OverviewViewModel overviewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            C29116kna c29116kna2 = (C29116kna) objAEQbTJ;
            MutableStateFlow mutableStateFlow2 = overviewViewModel.KWHzl;
            Overview overviewAEQbTJ = overviewViewModel.copydefault().getValue().AEQbTJ();
            String strAEQbTJ = (overviewAEQbTJ == null || (listValueOf = overviewAEQbTJ.valueOf()) == null || (socialAEQbTJ = Social.Companion.AEQbTJ(listValueOf, SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER)) == null) ? null : socialAEQbTJ.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            kKG kkg = overviewViewModel.fJNWhG;
            this.L$0 = objAEQbTJ;
            this.L$1 = strAEQbTJ;
            this.L$2 = c29116kna2;
            this.L$3 = mutableStateFlow2;
            this.label = 2;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            c29116kna = c29116kna2;
            mutableStateFlow = mutableStateFlow2;
            str = strAEQbTJ;
            mutableStateFlow.setValue(C29116kna.copy$default(c29116kna, null, null, null, null, str, (String) obj, 15, null));
        }
        return Unit.INSTANCE;
    }
}
