package com.okinc.kline.features.kline.indexcomponents.ui;

import android.view.View;
import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.kline.features.kline.indexcomponents.ui.IndexComponentsFragment$subscribeOnUiChange$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36237oUi;
import o.C55237xgE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.oRE;
import o.oRM;

/* JADX INFO: loaded from: classes8.dex */
public final class IndexComponentsFragment$subscribeOnUiChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ oRE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexComponentsFragment$subscribeOnUiChange$1(oRE ore, Continuation<? super IndexComponentsFragment$subscribeOnUiChange$1> continuation) {
        super(2, continuation);
        this.this$0 = ore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndexComponentsFragment$subscribeOnUiChange$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndexComponentsFragment$subscribeOnUiChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.features.kline.indexcomponents.ui.IndexComponentsFragment$subscribeOnUiChange$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends IndexComponentsResp>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ oRE this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(oRE ore, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends IndexComponentsResp> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<IndexComponentsResp>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<IndexComponentsResp> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C55237xgE c55237xgE;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    C55237xgE c55237xgE2 = this.this$0.djBIcL;
                    if (c55237xgE2 != null) {
                        C36237oUi.copydefault(c55237xgE2);
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    this.this$0.djBIcL().submitList(((IndexComponentsResp) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getComponents());
                    C55237xgE c55237xgE3 = this.this$0.djBIcL;
                    if (c55237xgE3 != null) {
                        C36237oUi.AEQbTJ(c55237xgE3);
                    }
                } else if ((interfaceC49371unL instanceof InterfaceC49371unL.Application) && (c55237xgE = this.this$0.djBIcL) != null) {
                    final oRE ore = this.this$0;
                    C36237oUi.showError$default(c55237xgE, null, null, null, 0, 0, new View.OnClickListener() { // from class: o.oRJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            IndexComponentsFragment$subscribeOnUiChange$1.AnonymousClass2.invokeSuspend$lambda$0(ore, view);
                        }
                    }, 31, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(oRE ore, View view) {
            ore.gEmmrt().OLrzqt(ore.AhwBna());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            oRE ore = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(ore, ore.gEmmrt(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.indexcomponents.ui.IndexComponentsFragment$subscribeOnUiChange$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((oRM) obj2).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((oRM) obj2).copydefault((InterfaceC49371unL<IndexComponentsResp>) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
