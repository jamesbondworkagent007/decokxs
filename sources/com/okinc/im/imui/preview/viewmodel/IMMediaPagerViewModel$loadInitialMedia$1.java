package com.okinc.im.imui.preview.viewmodel;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class IMMediaPagerViewModel$loadInitialMedia$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $anchorMessage;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ IMMediaPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerViewModel$loadInitialMedia$1(IMMediaPagerViewModel iMMediaPagerViewModel, OKMessage oKMessage, Continuation<? super IMMediaPagerViewModel$loadInitialMedia$1> continuation) {
        super(2, continuation);
        this.this$0 = iMMediaPagerViewModel;
        this.$anchorMessage = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMMediaPagerViewModel$loadInitialMedia$1(this.this$0, this.$anchorMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMMediaPagerViewModel$loadInitialMedia$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IMMediaPagerViewModel iMMediaPagerViewModel;
        Mutex mutex;
        OKMessage oKMessage;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.this$0.fetchVPNInfo;
            iMMediaPagerViewModel = this.this$0;
            OKMessage oKMessage2 = this.$anchorMessage;
            this.L$0 = mutex2;
            this.L$1 = iMMediaPagerViewModel;
            this.L$2 = oKMessage2;
            this.label = 1;
            if (mutex2.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            oKMessage = oKMessage2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oKMessage = (OKMessage) this.L$2;
            iMMediaPagerViewModel = (IMMediaPagerViewModel) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            iMMediaPagerViewModel.EZpvd.setValue(iMMediaPagerViewModel.djBIcL.copydefault(oKMessage));
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            this.this$0.OLrzqt();
            this.this$0.AEQbTJ();
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
