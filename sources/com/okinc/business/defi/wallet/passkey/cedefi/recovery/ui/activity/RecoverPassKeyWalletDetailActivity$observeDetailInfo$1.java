package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity;

import android.app.Activity;
import android.content.Intent;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC17029evA;
import o.ActivityC17625fMg;
import o.C17628fMj;
import o.C17631fMm;
import o.C33064mpR;
import o.C43316rmw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class RecoverPassKeyWalletDetailActivity$observeDetailInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17625fMg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletDetailActivity$observeDetailInfo$1(ActivityC17625fMg activityC17625fMg, Continuation<? super RecoverPassKeyWalletDetailActivity$observeDetailInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17625fMg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletDetailActivity$observeDetailInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletDetailActivity$observeDetailInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletDetailActivity$observeDetailInfo$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C17628fMj>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17625fMg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17625fMg activityC17625fMg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17625fMg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C17628fMj> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C17628fMj>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C17628fMj> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strAEQbTJ;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    this.this$0.isConnected();
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    this.this$0.AhwBna();
                    C43316rmw c43316rmw = null;
                    AbstractC17029evA abstractC17029evA = null;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    List<C17631fMm> listKWHzl = ((C17628fMj) activity.copydefault()).KWHzl();
                    String str = "";
                    if (listKWHzl.size() <= 1) {
                        AbstractC17029evA abstractC17029evA2 = this.this$0.djBIcL;
                        if (abstractC17029evA2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17029evA2 = null;
                        }
                        abstractC17029evA2.valueOf.setVisibility(8);
                        AbstractC17029evA abstractC17029evA3 = this.this$0.djBIcL;
                        if (abstractC17029evA3 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17029evA3 = null;
                        }
                        abstractC17029evA3.gEmmrt.setVisibility(0);
                        AbstractC17029evA abstractC17029evA4 = this.this$0.djBIcL;
                        if (abstractC17029evA4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC17029evA = abstractC17029evA4;
                        }
                        abstractC17029evA.OLrzqt.setVisibility(0);
                        ActivityC17625fMg activityC17625fMg = this.this$0;
                        C17631fMm c17631fMm = (C17631fMm) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
                        if (c17631fMm != null && (strAEQbTJ = c17631fMm.AEQbTJ()) != null) {
                            str = strAEQbTJ;
                        }
                        activityC17625fMg.OLrzqt(true, str, (C17628fMj) activity.copydefault());
                    } else {
                        AbstractC17029evA abstractC17029evA5 = this.this$0.djBIcL;
                        if (abstractC17029evA5 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17029evA5 = null;
                        }
                        abstractC17029evA5.valueOf.setVisibility(0);
                        AbstractC17029evA abstractC17029evA6 = this.this$0.djBIcL;
                        if (abstractC17029evA6 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17029evA6 = null;
                        }
                        abstractC17029evA6.gEmmrt.setVisibility(8);
                        AbstractC17029evA abstractC17029evA7 = this.this$0.djBIcL;
                        if (abstractC17029evA7 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17029evA7 = null;
                        }
                        abstractC17029evA7.OLrzqt.setVisibility(8);
                        this.this$0.OLrzqt(false, "", (C17628fMj) activity.copydefault());
                        C43316rmw c43316rmw2 = this.this$0.valueOf;
                        if (c43316rmw2 == null) {
                            Intrinsics.gEmmrt("");
                            c43316rmw2 = null;
                        }
                        C33064mpR.OLrzqt(c43316rmw2, (List<? extends Object>) listKWHzl);
                        C43316rmw c43316rmw3 = this.this$0.valueOf;
                        if (c43316rmw3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c43316rmw = c43316rmw3;
                        }
                        c43316rmw.notifyDataSetChanged();
                    }
                    ActivityC17625fMg activityC17625fMg2 = this.this$0;
                    Intent intent = new Intent();
                    intent.putExtra("recover_detail_result", EmailRecoveryResult.Cancelled.KWHzl);
                    Unit unit = Unit.INSTANCE;
                    activityC17625fMg2.setResult(-1, intent);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    this.this$0.AkhnZx();
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
            StateFlow<InterfaceC49371unL<C17628fMj>> stateFlowCopydefault = this.this$0.AEQbTJ().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
