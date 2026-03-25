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
import o.C36097oPd;
import o.C39702pxN;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class UnlockTokenScheduleFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C39702pxN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleFragment$initView$3(C39702pxN c39702pxN, Continuation<? super UnlockTokenScheduleFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c39702pxN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnlockTokenScheduleFragment$initView$3 unlockTokenScheduleFragment$initView$3 = new UnlockTokenScheduleFragment$initView$3(this.this$0, continuation);
        unlockTokenScheduleFragment$initView$3.L$0 = obj;
        return unlockTokenScheduleFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokenScheduleFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launchWhenResumed;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C39702pxN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C39702pxN c39702pxN, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c39702pxN;
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
            RecyclerView recyclerView2;
            RecyclerView.Adapter adapter;
            ImageView imageView;
            TextView textView;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                C36097oPd c36097oPdAEQbTJ = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (textView = c36097oPdAEQbTJ.djBIcL) != null) {
                    textView.setText(C33070mpX.AYXKKw(z ? C35964oKf.Fragment.QezThh : C35964oKf.Fragment.QVMIlxQVMIlx));
                }
                C36097oPd c36097oPdAEQbTJ2 = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ2 != null && (imageView = c36097oPdAEQbTJ2.AhwBna) != null) {
                    imageView.setImageResource(z ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call);
                }
                C36097oPd c36097oPdAEQbTJ3 = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ3 != null && (recyclerView2 = c36097oPdAEQbTJ3.KWHzl) != null && (adapter = recyclerView2.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                C36097oPd c36097oPdAEQbTJ4 = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ4 != null && (recyclerView = c36097oPdAEQbTJ4.KWHzl) != null) {
                    recyclerView.requestLayout();
                }
                BuildersKt__Builders_commonKt.launch$default(this.$$this$launchWhenResumed, null, null, new C05001(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C39702pxN this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05001(C39702pxN c39702pxN, Continuation<? super C05001> continuation) {
                super(2, continuation);
                this.this$0 = c39702pxN;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05001(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C36097oPd c36097oPdAEQbTJ = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (recyclerView = c36097oPdAEQbTJ.KWHzl) != null) {
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
            MutableStateFlow<Boolean> mutableStateFlowKWHzl = this.this$0.gEmmrt().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
