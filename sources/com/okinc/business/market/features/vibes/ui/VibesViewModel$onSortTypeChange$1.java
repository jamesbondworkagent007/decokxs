package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27750kBz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$onSortTypeChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ VibesSortType $sortType;
    final /* synthetic */ String $source;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$onSortTypeChange$1(String str, VibesViewModel vibesViewModel, long j, String str2, VibesSortType vibesSortType, Continuation<? super VibesViewModel$onSortTypeChange$1> continuation) {
        super(2, continuation);
        this.$source = str;
        this.this$0 = vibesViewModel;
        this.$chainId = j;
        this.$tokenContractAddress = str2;
        this.$sortType = vibesSortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$onSortTypeChange$1(this.$source, this.this$0, this.$chainId, this.$tokenContractAddress, this.$sortType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$onSortTypeChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$source;
            if (Intrinsics.EZpvd((Object) str, (Object) "source.treemap")) {
                VibesViewModel vibesViewModel = this.this$0;
                long j = this.$chainId;
                vibesViewModel.copydefault(String.valueOf(j), this.$tokenContractAddress, this.$sortType, vibesViewModel.OLrzqt().getValue().copydefault());
                MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                C27750kBz c27750kBzCopy$default = C27750kBz.copy$default(this.this$0.OLrzqt().getValue(), null, 0, this.$sortType, null, false, 27, null);
                this.label = 1;
                if (mutableStateFlow.emit(c27750kBzCopy$default, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (Intrinsics.EZpvd((Object) str, (Object) "source.list")) {
                VibesViewModel vibesViewModel2 = this.this$0;
                long j2 = this.$chainId;
                vibesViewModel2.AEQbTJ(String.valueOf(j2), this.$tokenContractAddress, this.$sortType, vibesViewModel2.OLrzqt().getValue().copydefault());
                MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
                C27750kBz c27750kBzCopy$default2 = C27750kBz.copy$default(this.this$0.OLrzqt().getValue(), null, 0, null, this.$sortType, false, 23, null);
                this.label = 2;
                if (mutableStateFlow2.emit(c27750kBzCopy$default2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
