package com.okinc.planet.service;

import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.im.bean.ChatOrigin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;
import o.tTJ;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTabPageService$getOrCreateMenuItem$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavigationBarView $navigationBarView;
    final /* synthetic */ MenuItem $this_apply;
    int label;
    final /* synthetic */ tTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetTabPageService$getOrCreateMenuItem$1$3(NavigationBarView navigationBarView, tTJ ttj, MenuItem menuItem, Continuation<? super PlanetTabPageService$getOrCreateMenuItem$1$3> continuation) {
        super(2, continuation);
        this.$navigationBarView = navigationBarView;
        this.this$0 = ttj;
        this.$this_apply = menuItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetTabPageService$getOrCreateMenuItem$1$3(this.$navigationBarView, this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTabPageService$getOrCreateMenuItem$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.$navigationBarView);
            if (lifecycleOwner != null) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$navigationBarView, this.$this_apply, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.planet.service.PlanetTabPageService$getOrCreateMenuItem$1$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavigationBarView $navigationBarView;
        final /* synthetic */ MenuItem $this_apply;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ tTJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tTJ ttj, NavigationBarView navigationBarView, MenuItem menuItem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ttj;
            this.$navigationBarView = navigationBarView;
            this.$this_apply = menuItem;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$navigationBarView, this.$this_apply, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C06191(this.this$0, this.$navigationBarView, this.$this_apply, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.planet.service.PlanetTabPageService$getOrCreateMenuItem$1$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NavigationBarView $navigationBarView;
            final /* synthetic */ MenuItem $this_apply;
            int label;
            final /* synthetic */ tTJ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06191(tTJ ttj, NavigationBarView navigationBarView, MenuItem menuItem, Continuation<? super C06191> continuation) {
                super(2, continuation);
                this.this$0 = ttj;
                this.$navigationBarView = navigationBarView;
                this.$this_apply = menuItem;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06191(this.this$0, this.$navigationBarView, this.$this_apply, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Flow<Integer> flowAEQbTJ;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                    if (interfaceC35180nqU != null && (flowAEQbTJ = interfaceC35180nqU.AEQbTJ(ChatOrigin.PLANET)) != null) {
                        C06201 c06201 = new C06201(this.this$0, this.$navigationBarView, this.$this_apply, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowAEQbTJ, c06201, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.planet.service.PlanetTabPageService$getOrCreateMenuItem$1$3$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C06201 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final /* synthetic */ NavigationBarView $navigationBarView;
                final /* synthetic */ MenuItem $this_apply;
                /* synthetic */ int I$0;
                int label;
                final /* synthetic */ tTJ this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06201(tTJ ttj, NavigationBarView navigationBarView, MenuItem menuItem, Continuation<? super C06201> continuation) {
                    super(2, continuation);
                    this.this$0 = ttj;
                    this.$navigationBarView = navigationBarView;
                    this.$this_apply = menuItem;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06201 c06201 = new C06201(this.this$0, this.$navigationBarView, this.$this_apply, continuation);
                    c06201.I$0 = ((Number) obj).intValue();
                    return c06201;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Object invoke(int i, Continuation<? super Unit> continuation) {
                    return ((C06201) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return invoke(num.intValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        int i = this.I$0;
                        pUU.KWHzl("qjf", "imUnreadCount = " + i);
                        if (i > 0) {
                            this.this$0.copydefault(this.$navigationBarView, this.$this_apply.getItemId());
                        } else {
                            this.$navigationBarView.removeBadge(this.$this_apply.getItemId());
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }
}
