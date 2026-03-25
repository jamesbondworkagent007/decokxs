package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C42603rYz;
import o.C44637sag;
import o.C44646sap;
import o.C44656saz;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationCenterFragment$setupViewModelListeners$3 extends SuspendLambda implements yHO<CoroutineScope, List<? extends C44646sap>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44656saz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterFragment$setupViewModelListeners$3(C44656saz c44656saz, Continuation<? super NotificationCenterFragment$setupViewModelListeners$3> continuation) {
        super(3, continuation);
        this.this$0 = c44656saz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, List<? extends C44646sap> list, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (List<C44646sap>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, List<C44646sap> list, Continuation<? super Unit> continuation) {
        NotificationCenterFragment$setupViewModelListeners$3 notificationCenterFragment$setupViewModelListeners$3 = new NotificationCenterFragment$setupViewModelListeners$3(this.this$0, continuation);
        notificationCenterFragment$setupViewModelListeners$3.L$0 = list;
        return notificationCenterFragment$setupViewModelListeners$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C44637sag c44637sag;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<C44646sap> list = (List) this.L$0;
            C42603rYz c42603rYz = this.this$0.djBIcL;
            if (c42603rYz == null) {
                return Unit.INSTANCE;
            }
            RecyclerView recyclerView = c42603rYz.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(list.size() > 1 ? 0 : 8);
            if (list.size() > 1 && (c44637sag = this.this$0.AYXKKw) != null) {
                c44637sag.EZpvd(list);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
