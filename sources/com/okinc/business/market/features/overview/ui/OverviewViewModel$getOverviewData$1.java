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
import o.C28986klC;
import o.C29063kma;
import o.C29116kna;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class OverviewViewModel$getOverviewData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ OverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewModel$getOverviewData$1(OverviewViewModel overviewViewModel, boolean z, Continuation<? super OverviewViewModel$getOverviewData$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewViewModel;
        this.$showLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewViewModel$getOverviewData$1(this.this$0, this.$showLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewViewModel$getOverviewData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        List<Social> listValueOf;
        Social socialAEQbTJ;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(new C29063kma(this.$showLoading, false, null, 6, null));
            C28986klC c28986klC = this.this$0.values;
            String tokenContractAddress = this.this$0.AEQbTJ().getTokenContractAddress();
            String chainId = this.this$0.AEQbTJ().getChainId();
            this.label = 1;
            objCopydefault = c28986klC.copydefault(tokenContractAddress, chainId, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        OverviewViewModel overviewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            overviewViewModel.EZpvd.setValue(new C29063kma(false, false, (Overview) objCopydefault, 3, null));
            MutableStateFlow mutableStateFlow = overviewViewModel.KWHzl;
            C29116kna value = overviewViewModel.AhwBna().getValue();
            Object objCopy$default = null;
            if (value != null) {
                Overview overviewAEQbTJ = overviewViewModel.copydefault().getValue().AEQbTJ();
                if (overviewAEQbTJ != null && (listValueOf = overviewAEQbTJ.valueOf()) != null && (socialAEQbTJ = Social.Companion.AEQbTJ(listValueOf, SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER)) != null) {
                    objCopy$default = socialAEQbTJ.AEQbTJ();
                }
                objCopy$default = C29116kna.copy$default(value, null, null, null, null, objCopy$default == null ? "" : objCopy$default, null, 47, null);
            }
            mutableStateFlow.setValue(objCopy$default);
        }
        OverviewViewModel overviewViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            overviewViewModel2.EZpvd.setValue(new C29063kma(false, true, null, 5, null));
        }
        return Unit.INSTANCE;
    }
}
