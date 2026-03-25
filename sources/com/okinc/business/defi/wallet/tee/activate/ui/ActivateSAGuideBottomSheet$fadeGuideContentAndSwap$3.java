package com.okinc.business.defi.wallet.tee.activate.ui;

import android.view.View;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C16485ekn;
import o.C56391yDq;
import o.C56442yFn;
import o.fST;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16485ekn $binding;
    final /* synthetic */ int $nextIndex;
    final /* synthetic */ List<View> $targets;
    int label;
    final /* synthetic */ fST this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends android.view.View> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3(fST fst, C16485ekn c16485ekn, int i, List<? extends View> list, Continuation<? super ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3> continuation) {
        super(2, continuation);
        this.this$0 = fst;
        this.$binding = c16485ekn;
        this.$nextIndex = i;
        this.$targets = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3(this.this$0, this.$binding, this.$nextIndex, this.$targets, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.this$0.AEQbTJ;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!this.this$0.isAdded()) {
            return Unit.INSTANCE;
        }
        this.this$0.AEQbTJ(this.$binding, this.$nextIndex);
        Iterator<T> it = this.$targets.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(0.0f);
        }
        List<View> list = this.$targets;
        final fST fst = this.this$0;
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).animate().alpha(1.0f).setDuration(fst.AEQbTJ).withEndAction(new Runnable() { // from class: o.fTh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3.invokeSuspend$lambda$2$lambda$1(fst);
                }
            }).start();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1(fST fst) {
        if (fst.isAdded()) {
            fst.valueOf = false;
        }
    }
}
