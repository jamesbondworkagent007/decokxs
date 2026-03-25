package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders;

import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C21951hSj;
import o.C21961hSt;
import o.C56391yDq;
import o.C56442yFn;
import o.kMM;

/* JADX INFO: loaded from: classes6.dex */
public final class HolderInfoBottomSheet$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C21951hSj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderInfoBottomSheet$initView$2(C21951hSj c21951hSj, Continuation<? super HolderInfoBottomSheet$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c21951hSj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderInfoBottomSheet$initView$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderInfoBottomSheet$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C21951hSj c21951hSj = this.this$0;
            List<TagWrapper> listAEQbTJ = c21951hSj.djBIcL().AEQbTJ();
            this.label = 1;
            obj = c21951hSj.EZpvd((List<TagWrapper>) listAEQbTJ, (Continuation<? super List<C21961hSt>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        kMM.setData$default(this.this$0.gEmmrt(), (List) obj, null, 2, null);
        return Unit.INSTANCE;
    }
}
