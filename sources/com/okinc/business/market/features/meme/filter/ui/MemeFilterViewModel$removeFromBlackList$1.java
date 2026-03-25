package com.okinc.business.market.features.meme.filter.ui;

import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28669kfD;
import o.C28714kfw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28693kfb;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeFilterViewModel$removeFromBlackList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C28714kfw $meme;
    int label;
    final /* synthetic */ MemeFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeFilterViewModel$removeFromBlackList$1(MemeFilterViewModel memeFilterViewModel, C28714kfw c28714kfw, Continuation<? super MemeFilterViewModel$removeFromBlackList$1> continuation) {
        super(2, continuation);
        this.this$0 = memeFilterViewModel;
        this.$meme = c28714kfw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeFilterViewModel$removeFromBlackList$1(this.this$0, this.$meme, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeFilterViewModel$removeFromBlackList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AhwBna;
            List<C28714kfw> value = this.this$0.gEmmrt().getValue();
            mutableStateFlow.setValue(value != null ? CollectionsKt___CollectionsKt.AhwBna((Iterable<? extends C28714kfw>) ((Iterable<? extends Object>) value), this.$meme) : null);
            InterfaceC28693kfb interfaceC28693kfb = this.this$0.gHZMYf;
            MemeBlacklist memeBlacklistKWHzl = C28669kfD.KWHzl(this.$meme);
            this.label = 1;
            if (interfaceC28693kfb.copydefault(memeBlacklistKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.AubY = true;
        return Unit.INSTANCE;
    }
}
