package com.okinc.kline.ui.unlock.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.okinc.uilab.stateful.StatefulView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C33546myW;
import o.C39703pxO;
import o.C39705pxQ;
import o.C39706pxR;
import o.C39708pxT;
import o.C39713pxY;
import o.C39732pxr;
import o.C52761wXj;
import o.C55173xeu;
import o.C55237xgE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.oOZ;
import o.rVN;
import o.yHS;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineUnlockTokenFragment$initView$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39732pxr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineUnlockTokenFragment$initView$4(C39732pxr c39732pxr, Continuation<? super KlineUnlockTokenFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c39732pxr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineUnlockTokenFragment$initView$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineUnlockTokenFragment$initView$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39732pxr c39732pxr = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c39732pxr, c39732pxr.KWHzl(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.KlineUnlockTokenFragment$initView$4.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).KWHzl((InterfaceC49371unL) obj3);
                }
            }, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.KlineUnlockTokenFragment$initView$4.2
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).copydefault((InterfaceC49371unL<C39705pxQ>) obj3);
                }
            }, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.KlineUnlockTokenFragment$initView$4.3
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).AYXKKw();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).OLrzqt((InterfaceC49371unL<? extends List<C39708pxT>>) obj3);
                }
            }, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.KlineUnlockTokenFragment$initView$4.4
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                }
            }, null, new AnonymousClass5(this.this$0, null), 16, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.KlineUnlockTokenFragment$initView$4$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements yHS<InterfaceC49371unL<? extends C39706pxR>, InterfaceC49371unL<? extends C39705pxQ>, InterfaceC49371unL<? extends List<? extends C39708pxT>>, InterfaceC49371unL<? extends C39703pxO>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;
        final /* synthetic */ C39732pxr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C39732pxr c39732pxr, Continuation<? super AnonymousClass5> continuation) {
            super(5, continuation);
            this.this$0 = c39732pxr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHS
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C39706pxR> interfaceC49371unL, InterfaceC49371unL<? extends C39705pxQ> interfaceC49371unL2, InterfaceC49371unL<? extends List<? extends C39708pxT>> interfaceC49371unL3, InterfaceC49371unL<? extends C39703pxO> interfaceC49371unL4, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C39706pxR>) interfaceC49371unL, (InterfaceC49371unL<C39705pxQ>) interfaceC49371unL2, (InterfaceC49371unL<? extends List<C39708pxT>>) interfaceC49371unL3, (InterfaceC49371unL<C39703pxO>) interfaceC49371unL4, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C39706pxR> interfaceC49371unL, InterfaceC49371unL<C39705pxQ> interfaceC49371unL2, InterfaceC49371unL<? extends List<C39708pxT>> interfaceC49371unL3, InterfaceC49371unL<C39703pxO> interfaceC49371unL4, Continuation<? super Unit> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
            anonymousClass5.L$0 = interfaceC49371unL;
            anonymousClass5.L$1 = interfaceC49371unL2;
            anonymousClass5.L$2 = interfaceC49371unL3;
            anonymousClass5.L$3 = interfaceC49371unL4;
            return anonymousClass5.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C55173xeu c55173xeu;
            C33546myW c33546myW;
            C55237xgE c55237xgE;
            C33546myW c33546myW2;
            C55237xgE c55237xgE2;
            C55237xgE c55237xgE3;
            C33546myW c33546myW3;
            C55173xeu c55173xeu2;
            C33546myW c33546myW4;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                InterfaceC49371unL interfaceC49371unL2 = (InterfaceC49371unL) this.L$1;
                InterfaceC49371unL interfaceC49371unL3 = (InterfaceC49371unL) this.L$2;
                InterfaceC49371unL interfaceC49371unL4 = (InterfaceC49371unL) this.L$3;
                boolean z = interfaceC49371unL instanceof InterfaceC49371unL.Application;
                boolean z2 = z && (interfaceC49371unL3 instanceof InterfaceC49371unL.Application) && (interfaceC49371unL4 instanceof InterfaceC49371unL.Application);
                boolean z3 = (interfaceC49371unL instanceof InterfaceC49371unL.Activity) && (interfaceC49371unL2 instanceof InterfaceC49371unL.Activity) && (interfaceC49371unL3 instanceof InterfaceC49371unL.Activity) && (interfaceC49371unL4 instanceof InterfaceC49371unL.Activity);
                boolean z4 = (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) || (interfaceC49371unL2 instanceof InterfaceC49371unL.ActionBar) || (interfaceC49371unL3 instanceof InterfaceC49371unL.ActionBar);
                boolean z5 = z || (interfaceC49371unL2 instanceof InterfaceC49371unL.Application) || (interfaceC49371unL3 instanceof InterfaceC49371unL.Application) || (interfaceC49371unL4 instanceof InterfaceC49371unL.Application);
                boolean z6 = (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) && (interfaceC49371unL2 instanceof InterfaceC49371unL.TaskDescription) && (interfaceC49371unL3 instanceof InterfaceC49371unL.TaskDescription) && (interfaceC49371unL4 instanceof InterfaceC49371unL.TaskDescription);
                if (z2) {
                    oOZ oozAEQbTJ = this.this$0.AEQbTJ();
                    if (oozAEQbTJ != null && (c33546myW4 = oozAEQbTJ.OLrzqt) != null) {
                        c33546myW4.AEQbTJ();
                    }
                    oOZ oozAEQbTJ2 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ2 != null) {
                        C39732pxr c39732pxr = this.this$0;
                        C55237xgE c55237xgE4 = oozAEQbTJ2.KWHzl;
                        StatefulView.Status status = StatefulView.Status.Error;
                        c55237xgE4.setStatus(status);
                        View viewAEQbTJ = oozAEQbTJ2.KWHzl.AEQbTJ(status);
                        if (viewAEQbTJ != null && (c55173xeu2 = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) != null) {
                            c39732pxr.OLrzqt(c55173xeu2);
                        }
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                } else if (z3) {
                    oOZ oozAEQbTJ3 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ3 != null && (c33546myW3 = oozAEQbTJ3.OLrzqt) != null) {
                        c33546myW3.AEQbTJ();
                    }
                    oOZ oozAEQbTJ4 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ4 != null && (c55237xgE3 = oozAEQbTJ4.KWHzl) != null) {
                        c55237xgE3.setStatus(StatefulView.Status.Content);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (z4) {
                    oOZ oozAEQbTJ5 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ5 != null && (c55237xgE2 = oozAEQbTJ5.KWHzl) != null) {
                        c55237xgE2.setStatus(StatefulView.Status.Loading);
                    }
                } else if (z5 && !z4) {
                    oOZ oozAEQbTJ6 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ6 != null && (c33546myW2 = oozAEQbTJ6.OLrzqt) != null) {
                        c33546myW2.AEQbTJ();
                    }
                    oOZ oozAEQbTJ7 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ7 != null && (c55237xgE = oozAEQbTJ7.KWHzl) != null) {
                        c55237xgE.setStatus(StatefulView.Status.Content);
                    }
                } else if (z6) {
                    oOZ oozAEQbTJ8 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ8 != null && (c33546myW = oozAEQbTJ8.OLrzqt) != null) {
                        c33546myW.AEQbTJ();
                    }
                    oOZ oozAEQbTJ9 = this.this$0.AEQbTJ();
                    if (oozAEQbTJ9 != null) {
                        C39732pxr c39732pxr2 = this.this$0;
                        C55237xgE c55237xgE5 = oozAEQbTJ9.KWHzl;
                        StatefulView.Status status2 = StatefulView.Status.Empty;
                        c55237xgE5.setStatus(status2);
                        View viewAEQbTJ2 = oozAEQbTJ9.KWHzl.AEQbTJ(status2);
                        if (viewAEQbTJ2 != null && (c55173xeu = (C55173xeu) viewAEQbTJ2.findViewById(C52761wXj.FragmentManager.gasjUx)) != null) {
                            c39732pxr2.EZpvd(c55173xeu);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
