package com.okinc.business.market.features.meme.ui;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2$hideToken$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C25389ivm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$hideToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ MemeUiModel $token;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$hideToken$1(MemeActivityViewModelV2 memeActivityViewModelV2, MemeUiModel memeUiModel, Function0<Unit> function0, Continuation<? super MemeActivityViewModelV2$hideToken$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$token = memeUiModel;
        this.$onSuccess = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$hideToken$1(this.this$0, this.$token, this.$onSuccess, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$hideToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemePumpUseCase memePumpUseCase = this.this$0.values;
            MemeUiModel memeUiModel = this.$token;
            final MemeActivityViewModelV2 memeActivityViewModelV2 = this.this$0;
            final Function0<Unit> function0 = this.$onSuccess;
            Function0<Unit> function02 = new Function0() { // from class: o.kiY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeActivityViewModelV2$hideToken$1.invokeSuspend$lambda$0(memeActivityViewModelV2, function0);
                }
            };
            this.label = 1;
            if (memePumpUseCase.OLrzqt(memeUiModel, function02, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MemeActivityViewModelV2 memeActivityViewModelV2, Function0 function0) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(memeActivityViewModelV2), Dispatchers.getMain(), null, new MemeActivityViewModelV2$hideToken$1$1$1(function0, null), 2, null);
        return Unit.INSTANCE;
    }
}
