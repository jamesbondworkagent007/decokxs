package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28634keV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$modifyTabFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $blacklistRefresh;
    final /* synthetic */ String $chainId;
    final /* synthetic */ MemeProtocolFilterUiData $currentProtocols;
    final /* synthetic */ MemeFilter $localFilter;
    final /* synthetic */ C28634keV $state;
    final /* synthetic */ int $tabIndex;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$modifyTabFilter$1(MemeActivityViewModelV2 memeActivityViewModelV2, int i, String str, MemeProtocolFilterUiData memeProtocolFilterUiData, MemeFilter memeFilter, C28634keV c28634keV, boolean z, Continuation<? super MemeActivityViewModelV2$modifyTabFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$tabIndex = i;
        this.$chainId = str;
        this.$currentProtocols = memeProtocolFilterUiData;
        this.$localFilter = memeFilter;
        this.$state = c28634keV;
        this.$blacklistRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$modifyTabFilter$1(this.this$0, this.$tabIndex, this.$chainId, this.$currentProtocols, this.$localFilter, this.$state, this.$blacklistRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$modifyTabFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemePumpUseCase memePumpUseCase = this.this$0.values;
            int i2 = this.$tabIndex;
            String str = this.$chainId;
            List<String> listOLrzqt = this.$currentProtocols.OLrzqt();
            String strCopydefault = this.this$0.fJNWhG.copydefault();
            MemeFilter memeFilterKWHzl = this.$localFilter;
            if (memeFilterKWHzl == null) {
                memeFilterKWHzl = this.$state.KWHzl();
            }
            boolean z = this.$blacklistRefresh;
            this.label = 1;
            if (memePumpUseCase.AEQbTJ(i2, str, listOLrzqt, strCopydefault, memeFilterKWHzl, z, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
