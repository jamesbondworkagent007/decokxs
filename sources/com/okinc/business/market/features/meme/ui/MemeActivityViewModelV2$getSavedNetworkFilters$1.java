package com.okinc.business.market.features.meme.ui;

import com.okinc.core.util.SPUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$getSavedNetworkFilters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$getSavedNetworkFilters$1(MemeActivityViewModelV2 memeActivityViewModelV2, Continuation<? super MemeActivityViewModelV2$getSavedNetworkFilters$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$getSavedNetworkFilters$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$getSavedNetworkFilters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MemeSavedFilter memeSavedFilter = (MemeSavedFilter) SPUtils.getObject("key_dex_sp_meme_networkFilter", MemeSavedFilter.class, "dex_market");
            MemeActivityViewModelV2 memeActivityViewModelV2 = this.this$0;
            if (memeSavedFilter == null || memeSavedFilter.getFilters().isEmpty()) {
                memeSavedFilter = new MemeSavedFilter((List) null, 1, (DefaultConstructorMarker) null);
            }
            memeActivityViewModelV2.fetchVPNInfo = memeSavedFilter;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
