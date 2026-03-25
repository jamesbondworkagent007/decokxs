package com.okinc.kline.ui.unlock.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.okinc.uilab.stateful.StatefulView;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36097oPd;
import o.C39702pxN;
import o.C39703pxO;
import o.C39709pxU;
import o.C39713pxY;
import o.C39778pyk;
import o.C52761wXj;
import o.C55173xeu;
import o.C55237xgE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class UnlockTokenScheduleFragment$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39702pxN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleFragment$initView$2(C39702pxN c39702pxN, Continuation<? super UnlockTokenScheduleFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c39702pxN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokenScheduleFragment$initView$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokenScheduleFragment$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C39703pxO>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C39702pxN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C39702pxN c39702pxN, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c39702pxN;
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
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C39703pxO> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C39703pxO>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C39703pxO> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C39778pyk c39778pyk;
            C55237xgE c55237xgE;
            C55237xgE c55237xgE2;
            View viewAEQbTJ;
            C55173xeu c55173xeu;
            C55237xgE c55237xgE3;
            C39778pyk c39778pyk2;
            C55237xgE c55237xgE4;
            C55237xgE c55237xgE5;
            C39778pyk c39778pyk3;
            C55237xgE c55237xgE6;
            C39778pyk c39778pyk4;
            C55237xgE c55237xgE7;
            C55237xgE c55237xgE8;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    C36097oPd c36097oPdAEQbTJ = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ != null && (c55237xgE8 = c36097oPdAEQbTJ.AuCTel) != null) {
                        c55237xgE8.setStatus(StatefulView.Status.Content);
                    }
                    C36097oPd c36097oPdAEQbTJ2 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ2 != null && (c55237xgE7 = c36097oPdAEQbTJ2.copydefault) != null) {
                        c55237xgE7.setStatus(StatefulView.Status.Content);
                    }
                    C36097oPd c36097oPdAEQbTJ3 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ3 != null && (c39778pyk4 = c36097oPdAEQbTJ3.fetchVPNInfo) != null) {
                        c39778pyk4.setVisibility(0);
                    }
                    C39703pxO c39703pxO = (C39703pxO) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
                    C36097oPd c36097oPdAEQbTJ4 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ4 != null && (c55237xgE6 = c36097oPdAEQbTJ4.copydefault) != null) {
                        c55237xgE6.setVisibility(8);
                    }
                    C36097oPd c36097oPdAEQbTJ5 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ5 != null && (c39778pyk3 = c36097oPdAEQbTJ5.fetchVPNInfo) != null) {
                        c39778pyk3.setVisibility(0);
                    }
                    C39702pxN c39702pxN = this.this$0;
                    C36097oPd c36097oPdAEQbTJ6 = c39702pxN.AEQbTJ();
                    c39702pxN.EZpvd(c39703pxO, c36097oPdAEQbTJ6 != null ? c36097oPdAEQbTJ6.fetchVPNInfo : null);
                    C39702pxN c39702pxN2 = this.this$0;
                    try {
                        Result.Application application = Result.Companion;
                        Map<String, List<C39709pxU>> mapOLrzqt = c39703pxO.OLrzqt();
                        String strKWHzl = c39703pxO.KWHzl();
                        if (strKWHzl == null) {
                            strKWHzl = "";
                        }
                        List<C39709pxU> listAhwBna = mapOLrzqt.get(strKWHzl);
                        if (listAhwBna == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        c39702pxN2.KWHzl(listAhwBna);
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    C36097oPd c36097oPdAEQbTJ7 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ7 != null && (c55237xgE5 = c36097oPdAEQbTJ7.AuCTel) != null) {
                        c55237xgE5.setStatus(StatefulView.Status.Content);
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    C36097oPd c36097oPdAEQbTJ8 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ8 != null && (c55237xgE4 = c36097oPdAEQbTJ8.AuCTel) != null) {
                        c55237xgE4.setStatus(StatefulView.Status.Content);
                    }
                    C36097oPd c36097oPdAEQbTJ9 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ9 != null && (c39778pyk2 = c36097oPdAEQbTJ9.fetchVPNInfo) != null) {
                        c39778pyk2.setVisibility(8);
                    }
                    C36097oPd c36097oPdAEQbTJ10 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ10 != null && (c55237xgE3 = c36097oPdAEQbTJ10.copydefault) != null) {
                        c55237xgE3.setStatus(StatefulView.Status.Error);
                    }
                    C36097oPd c36097oPdAEQbTJ11 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ11 != null && (c55237xgE2 = c36097oPdAEQbTJ11.copydefault) != null && (viewAEQbTJ = c55237xgE2.AEQbTJ(StatefulView.Status.Error)) != null && (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) != null) {
                        this.this$0.copydefault(c55173xeu);
                    }
                    this.this$0.KWHzl((List<C39709pxU>) yDY.AhwBna());
                    C36097oPd c36097oPdAEQbTJ12 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ12 != null && (c55237xgE = c36097oPdAEQbTJ12.copydefault) != null) {
                        c55237xgE.setVisibility(0);
                    }
                    C36097oPd c36097oPdAEQbTJ13 = this.this$0.AEQbTJ();
                    if (c36097oPdAEQbTJ13 != null && (c39778pyk = c36097oPdAEQbTJ13.fetchVPNInfo) != null) {
                        c39778pyk.setVisibility(8);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39702pxN c39702pxN = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c39702pxN, c39702pxN.valueOf(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
