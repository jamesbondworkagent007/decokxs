package com.okinc.kline.ui.unlock.ui;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33070mpX;
import o.C35964oKf;
import o.C36094oPa;
import o.C39729pxo;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class KlineUnlockAllocationFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C39729pxo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineUnlockAllocationFragment$initView$3(C39729pxo c39729pxo, Continuation<? super KlineUnlockAllocationFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c39729pxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineUnlockAllocationFragment$initView$3 klineUnlockAllocationFragment$initView$3 = new KlineUnlockAllocationFragment$initView$3(this.this$0, continuation);
        klineUnlockAllocationFragment$initView$3.L$0 = obj;
        return klineUnlockAllocationFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineUnlockAllocationFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.KlineUnlockAllocationFragment$initView$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launchWhenResumed;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C39729pxo this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C39729pxo c39729pxo, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c39729pxo;
            this.$$this$launchWhenResumed = coroutineScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launchWhenResumed, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RecyclerView recyclerView;
            ImageView imageView;
            TextView textView;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                C36094oPa c36094oPaAYXKKw = this.this$0.AYXKKw();
                if (c36094oPaAYXKKw != null && (textView = c36094oPaAYXKKw.copydefault) != null) {
                    textView.setText(C33070mpX.AYXKKw(z ? C35964oKf.Fragment.QezThh : C35964oKf.Fragment.QVMIlxQVMIlx));
                }
                C36094oPa c36094oPaAYXKKw2 = this.this$0.AYXKKw();
                if (c36094oPaAYXKKw2 != null && (imageView = c36094oPaAYXKKw2.AEQbTJ) != null) {
                    imageView.setImageResource(z ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call);
                }
                this.this$0.gEmmrt.notifyDataSetChanged();
                C36094oPa c36094oPaAYXKKw3 = this.this$0.AYXKKw();
                if (c36094oPaAYXKKw3 != null && (recyclerView = c36094oPaAYXKKw3.KWHzl) != null) {
                    recyclerView.requestLayout();
                }
                BuildersKt__Builders_commonKt.launch$default(this.$$this$launchWhenResumed, null, null, new C04991(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.KlineUnlockAllocationFragment$initView$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C39729pxo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04991(C39729pxo c39729pxo, Continuation<? super C04991> continuation) {
                super(2, continuation);
                this.this$0 = c39729pxo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04991(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                RecyclerView recyclerView;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.label = 1;
                    if (DelayKt.delay(20L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                C36094oPa c36094oPaAYXKKw = this.this$0.AYXKKw();
                if (c36094oPaAYXKKw != null && (recyclerView = c36094oPaAYXKKw.KWHzl) != null) {
                    recyclerView.requestLayout();
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MutableStateFlow<Boolean> mutableStateFlowCopydefault = this.this$0.KWHzl().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
}
