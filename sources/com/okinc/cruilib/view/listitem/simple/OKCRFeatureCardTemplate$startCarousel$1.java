package com.okinc.cruilib.view.listitem.simple;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C31929mJd;
import o.C31935mJj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRFeatureCardTemplate$startCarousel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C31929mJd $animationState;
    final /* synthetic */ RecyclerView $recyclerView;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31935mJj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCRFeatureCardTemplate$startCarousel$1(C31929mJd c31929mJd, C31935mJj c31935mJj, RecyclerView recyclerView, Continuation<? super OKCRFeatureCardTemplate$startCarousel$1> continuation) {
        super(2, continuation);
        this.$animationState = c31929mJd;
        this.this$0 = c31935mJj;
        this.$recyclerView = recyclerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKCRFeatureCardTemplate$startCarousel$1 oKCRFeatureCardTemplate$startCarousel$1 = new OKCRFeatureCardTemplate$startCarousel$1(this.$animationState, this.this$0, this.$recyclerView, continuation);
        oKCRFeatureCardTemplate$startCarousel$1.L$0 = obj;
        return oKCRFeatureCardTemplate$startCarousel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCRFeatureCardTemplate$startCarousel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:14:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = 3;
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (i >= this.$animationState.OLrzqt().size()) {
                C31935mJj c31935mJj = this.this$0;
                RecyclerView recyclerView = this.$recyclerView;
                C31929mJd c31929mJd = this.$animationState;
                c31935mJj.copydefault(recyclerView, c31929mJd, c31929mJd.OLrzqt().get(i));
                C56443yFo.AEQbTJ(i);
                i++;
            } else {
                i = 0;
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                this.L$0 = coroutineScope;
                this.I$0 = i;
                this.label = 1;
                if (DelayKt.delay(1250L, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (i >= this.$animationState.OLrzqt().size()) {
                }
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
