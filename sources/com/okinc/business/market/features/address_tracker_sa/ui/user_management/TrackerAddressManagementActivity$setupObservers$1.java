package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC25772jFu;
import o.C33546myW;
import o.C52794wYp;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.jEN;
import o.jEV;
import o.kMM;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class TrackerAddressManagementActivity$setupObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jEV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementActivity$setupObservers$1(jEV jev, Continuation<? super TrackerAddressManagementActivity$setupObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = jev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementActivity$setupObservers$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementActivity$setupObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementActivity$setupObservers$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC25772jFu, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ jEV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jEV jev, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jev;
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
        public final Object invoke(AbstractC25772jFu abstractC25772jFu, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC25772jFu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC25772jFu abstractC25772jFu = (AbstractC25772jFu) this.L$0;
                this.this$0.isConnected();
                if (abstractC25772jFu instanceof AbstractC25772jFu.StateListAnimator) {
                    C55113xdn c55113xdn = this.this$0.AhwBna().djBIcL;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(0);
                    C55173xeu c55173xeu = this.this$0.AhwBna().valueOf;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(8);
                    FragmentContainerView fragmentContainerView = this.this$0.AhwBna().gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
                    fragmentContainerView.setVisibility(8);
                    kMM.setData$default(this.this$0.ejfBZ(), yDY.AhwBna(), null, 2, null);
                } else if (!(abstractC25772jFu instanceof AbstractC25772jFu.ActionBar)) {
                    if (abstractC25772jFu instanceof AbstractC25772jFu.TaskDescription) {
                        C55113xdn c55113xdn2 = this.this$0.AhwBna().djBIcL;
                        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                        c55113xdn2.setVisibility(8);
                        TextView textView = this.this$0.AhwBna().AhwBna;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        textView.setVisibility(8);
                        C52794wYp c52794wYp = this.this$0.AhwBna().AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                        c52794wYp.setVisibility(8);
                        jEN jen = this.this$0.AhwBna().AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(jen, "");
                        jen.setVisibility(8);
                        LinearLayout linearLayout = this.this$0.AhwBna().copydefault;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        linearLayout.setVisibility(8);
                        C33546myW c33546myW = this.this$0.AhwBna().AkhnZx;
                        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                        c33546myW.setVisibility(8);
                        this.this$0.fIwbmz();
                        rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                    } else if (abstractC25772jFu instanceof AbstractC25772jFu.Activity) {
                        this.this$0.AhwBna().AkhnZx.AEQbTJ();
                        C52794wYp c52794wYp2 = this.this$0.AhwBna().AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                        c52794wYp2.setVisibility(0);
                        TextView textView2 = this.this$0.AhwBna().AhwBna;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(0);
                        jEN jen2 = this.this$0.AhwBna().AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(jen2, "");
                        jen2.setVisibility(0);
                        LinearLayout linearLayout2 = this.this$0.AhwBna().copydefault;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                        linearLayout2.setVisibility(0);
                        C33546myW c33546myW2 = this.this$0.AhwBna().AkhnZx;
                        Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                        c33546myW2.setVisibility(0);
                        C55113xdn c55113xdn3 = this.this$0.AhwBna().djBIcL;
                        Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                        c55113xdn3.setVisibility(8);
                        AbstractC25772jFu.Activity activity = (AbstractC25772jFu.Activity) abstractC25772jFu;
                        this.this$0.KWHzl(activity.AEQbTJ());
                        if (activity.EZpvd().isEmpty()) {
                            this.this$0.getFieldNames();
                        } else {
                            kMM.setData$default(this.this$0.ejfBZ(), activity.EZpvd(), null, 2, null);
                        }
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (abstractC25772jFu instanceof AbstractC25772jFu.Application) {
                        C55113xdn c55113xdn4 = this.this$0.AhwBna().djBIcL;
                        Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                        c55113xdn4.setVisibility(8);
                        this.this$0.AuCTel();
                        rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                    } else {
                        throw new NoWhenBranchMatchedException();
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
            StateFlow<AbstractC25772jFu> stateFlowAYXKKw = this.this$0.DbNXlk().AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAYXKKw, anonymousClass1, this) == objCopydefault) {
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
