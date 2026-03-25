package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ActivityC17837fUc;
import o.C16434ejp;
import o.C17862fVa;
import o.C33064mpR;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.fTZ;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterActivity$onCreate$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17837fUc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterActivity$onCreate$11(ActivityC17837fUc activityC17837fUc, Continuation<? super SmallAssetsConverterActivity$onCreate$11> continuation) {
        super(2, continuation);
        this.this$0 = activityC17837fUc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterActivity$onCreate$11(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterActivity$onCreate$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.AYXKKw().ejfBZ());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$11$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C17862fVa.TaskDescription, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17837fUc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17837fUc activityC17837fUc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17837fUc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C17862fVa.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C17862fVa.TaskDescription taskDescription = (C17862fVa.TaskDescription) this.L$0;
                C16434ejp c16434ejp = this.this$0.valueOf;
                C16434ejp c16434ejp2 = null;
                if (c16434ejp == null) {
                    Intrinsics.gEmmrt("");
                    c16434ejp = null;
                }
                c16434ejp.AkhnZx.AEQbTJ();
                if (taskDescription.copydefault().EZpvd()) {
                    C16434ejp c16434ejp3 = this.this$0.valueOf;
                    if (c16434ejp3 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp3 = null;
                    }
                    c16434ejp3.EZpvd.setVisibility(0);
                    if (taskDescription.copydefault().AEQbTJ().isEmpty()) {
                        C16434ejp c16434ejp4 = this.this$0.valueOf;
                        if (c16434ejp4 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp4 = null;
                        }
                        c16434ejp4.isConnected.setVisibility(8);
                        C16434ejp c16434ejp5 = this.this$0.valueOf;
                        if (c16434ejp5 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp5 = null;
                        }
                        c16434ejp5.fetchVPNInfo.setVisibility(0);
                        C16434ejp c16434ejp6 = this.this$0.valueOf;
                        if (c16434ejp6 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp6 = null;
                        }
                        c16434ejp6.fJNWhG.setVisibility(4);
                        C33064mpR.OLrzqt(this.this$0.djBIcL, (List<? extends Object>) C56402yEa.EZpvd(new fTZ.StateListAnimator(false, 0, 2, null)));
                        C16434ejp c16434ejp7 = this.this$0.valueOf;
                        if (c16434ejp7 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp7 = null;
                        }
                        c16434ejp7.AkhnZx.djBIcL(true);
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    } else {
                        C16434ejp c16434ejp8 = this.this$0.valueOf;
                        if (c16434ejp8 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c16434ejp2 = c16434ejp8;
                        }
                        c16434ejp2.AkhnZx.djBIcL(true);
                    }
                } else {
                    C16434ejp c16434ejp9 = this.this$0.valueOf;
                    if (c16434ejp9 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp9 = null;
                    }
                    c16434ejp9.isConnected.setVisibility(8);
                    C16434ejp c16434ejp10 = this.this$0.valueOf;
                    if (c16434ejp10 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp10 = null;
                    }
                    c16434ejp10.fetchVPNInfo.setVisibility(0);
                    C16434ejp c16434ejp11 = this.this$0.valueOf;
                    if (c16434ejp11 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp11 = null;
                    }
                    c16434ejp11.fJNWhG.setVisibility(4);
                    C33064mpR.OLrzqt(this.this$0.djBIcL, (List<? extends Object>) C56402yEa.EZpvd(new fTZ.ActionBar(null, null, false, 7, null)));
                    C16434ejp c16434ejp12 = this.this$0.valueOf;
                    if (c16434ejp12 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp12 = null;
                    }
                    c16434ejp12.AkhnZx.djBIcL(false);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
