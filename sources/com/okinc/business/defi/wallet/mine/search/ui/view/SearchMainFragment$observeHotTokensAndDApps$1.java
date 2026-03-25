package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16686eoc;
import o.C18981fsf;
import o.C19003ftA;
import o.C33129mqd;
import o.C55113xdn;
import o.C55254xgV;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchMainFragment$observeHotTokensAndDApps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19003ftA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMainFragment$observeHotTokensAndDApps$1(C19003ftA c19003ftA, Continuation<? super SearchMainFragment$observeHotTokensAndDApps$1> continuation) {
        super(2, continuation);
        this.this$0 = c19003ftA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchMainFragment$observeHotTokensAndDApps$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchMainFragment$observeHotTokensAndDApps$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeHotTokensAndDApps$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C19003ftA this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19003ftA c19003ftA, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19003ftA;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeHotTokensAndDApps$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02911 extends SuspendLambda implements Function2<C18981fsf, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C19003ftA this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02911(C19003ftA c19003ftA, Continuation<? super C02911> continuation) {
                super(2, continuation);
                this.this$0 = c19003ftA;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02911 c02911 = new C02911(this.this$0, continuation);
                c02911.L$0 = obj;
                return c02911;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C18981fsf c18981fsf, Continuation<? super Unit> continuation) {
                return ((C02911) create(c18981fsf, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C55113xdn c55113xdn;
                C55113xdn c55113xdn2;
                C55113xdn c55113xdn3;
                C55113xdn c55113xdn4;
                ViewPager2 viewPager2;
                C55254xgV c55254xgV;
                C55113xdn c55113xdn5;
                C55113xdn c55113xdn6;
                ViewPager2 viewPager22;
                C55254xgV c55254xgV2;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C18981fsf c18981fsf = (C18981fsf) this.L$0;
                    if (c18981fsf == null) {
                        return Unit.INSTANCE;
                    }
                    if (c18981fsf.AEQbTJ()) {
                        C16686eoc c16686eoc = this.this$0.KWHzl;
                        if (c16686eoc != null && (c55254xgV2 = c16686eoc.OLrzqt) != null) {
                            c55254xgV2.setVisibility(8);
                        }
                        C16686eoc c16686eoc2 = this.this$0.KWHzl;
                        if (c16686eoc2 != null && (viewPager22 = c16686eoc2.KWHzl) != null) {
                            viewPager22.setVisibility(8);
                        }
                        C16686eoc c16686eoc3 = this.this$0.KWHzl;
                        if (c16686eoc3 != null && (c55113xdn6 = c16686eoc3.EZpvd) != null) {
                            c55113xdn6.KWHzl(0L);
                        }
                        C16686eoc c16686eoc4 = this.this$0.KWHzl;
                        if (c16686eoc4 != null && (c55113xdn5 = c16686eoc4.EZpvd) != null) {
                            c55113xdn5.setVisibility(0);
                        }
                    } else if (C33129mqd.KWHzl((Collection) c18981fsf.OLrzqt()) || C33129mqd.KWHzl((Collection) c18981fsf.copydefault())) {
                        this.this$0.OLrzqt(C33129mqd.KWHzl((Collection) c18981fsf.OLrzqt()), C33129mqd.KWHzl((Collection) c18981fsf.copydefault()));
                        C16686eoc c16686eoc5 = this.this$0.KWHzl;
                        if (c16686eoc5 != null && (c55113xdn2 = c16686eoc5.EZpvd) != null) {
                            c55113xdn2.copydefault();
                        }
                        C16686eoc c16686eoc6 = this.this$0.KWHzl;
                        if (c16686eoc6 != null && (c55113xdn = c16686eoc6.EZpvd) != null) {
                            c55113xdn.setVisibility(8);
                        }
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    } else {
                        C16686eoc c16686eoc7 = this.this$0.KWHzl;
                        if (c16686eoc7 != null && (c55254xgV = c16686eoc7.OLrzqt) != null) {
                            c55254xgV.setVisibility(8);
                        }
                        C16686eoc c16686eoc8 = this.this$0.KWHzl;
                        if (c16686eoc8 != null && (viewPager2 = c16686eoc8.KWHzl) != null) {
                            viewPager2.setVisibility(8);
                        }
                        C16686eoc c16686eoc9 = this.this$0.KWHzl;
                        if (c16686eoc9 != null && (c55113xdn4 = c16686eoc9.EZpvd) != null) {
                            c55113xdn4.copydefault();
                        }
                        C16686eoc c16686eoc10 = this.this$0.KWHzl;
                        if (c16686eoc10 != null && (c55113xdn3 = c16686eoc10.EZpvd) != null) {
                            c55113xdn3.setVisibility(8);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<C18981fsf> stateFlowEZpvd = this.this$0.AkhnZx().EZpvd();
                C02911 c02911 = new C02911(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowEZpvd, c02911, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19003ftA c19003ftA = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c19003ftA, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c19003ftA, state, anonymousClass1, this) == objCopydefault) {
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
