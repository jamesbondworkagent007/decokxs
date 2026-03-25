package com.okinc.business.market.features.analysis.futures.sub.overview.ui.share;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C25915jLb;
import o.C33070mpX;
import o.C41431qqg;
import o.C42903rfG;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jIJ;
import o.pTD;
import o.qZH;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisVipSharingOverviewFragment extends jIJ<C42903rfG> {
    public static final int $stable = 0;
    private final boolean isVip = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.jIJ
    public boolean isVip() {
        return this.isVip;
    }

    public static final /* synthetic */ C42903rfG access$getContentBinding(FuturesAnalysisVipSharingOverviewFragment futuresAnalysisVipSharingOverviewFragment) {
        return futuresAnalysisVipSharingOverviewFragment.getContentBinding();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindContent(Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.jIJ
    public C42903rfG onBindContent(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42903rfG c42903rfGCopydefault = C42903rfG.copydefault(getLayoutInflater(), viewGroup);
        Intrinsics.checkNotNullExpressionValue(c42903rfGCopydefault, "");
        int num = getViewModel().OLrzqt().getNum();
        if (num == AnalysisOverviewPeriod.PERIOD_ALL.getNum()) {
            c42903rfGCopydefault.EZpvd.setText(C33070mpX.AYXKKw(qZH.PendingIntent.DGUQLIOvDItG));
        } else {
            AppCompatTextView appCompatTextView = c42903rfGCopydefault.EZpvd;
            Context context = getContext();
            appCompatTextView.setText(context != null ? pTD.EZpvd(context, qZH.Dialog.EZpvd, num, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, String.valueOf(num)))) : null);
        }
        return c42903rfGCopydefault;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.overview.ui.share.FuturesAnalysisVipSharingOverviewFragment$setListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAnalysisVipSharingOverviewFragment.this.new AnonymousClass1(continuation);
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
                FuturesAnalysisVipSharingOverviewFragment futuresAnalysisVipSharingOverviewFragment = FuturesAnalysisVipSharingOverviewFragment.this;
                futuresAnalysisVipSharingOverviewFragment.collectLatestOnLifecycle(futuresAnalysisVipSharingOverviewFragment.getViewModel(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.share.FuturesAnalysisVipSharingOverviewFragment.setListener.1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((FuturesAnalysisViewModel.StateListAnimator) obj2).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((FuturesAnalysisViewModel.StateListAnimator) obj2).OLrzqt((InterfaceC49371unL<C25915jLb>) obj3);
                    }
                }, Lifecycle.State.CREATED, new AnonymousClass2(FuturesAnalysisVipSharingOverviewFragment.this, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.overview.ui.share.FuturesAnalysisVipSharingOverviewFragment$setListener$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C25915jLb>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesAnalysisVipSharingOverviewFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FuturesAnalysisVipSharingOverviewFragment futuresAnalysisVipSharingOverviewFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresAnalysisVipSharingOverviewFragment;
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
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C25915jLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
                return invoke2((InterfaceC49371unL<C25915jLb>) interfaceC49371unL, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC49371unL<C25915jLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                    FuturesAnalysisVipSharingOverviewFragment futuresAnalysisVipSharingOverviewFragment = this.this$0;
                    futuresAnalysisVipSharingOverviewFragment.updateOverviewUiState(FuturesAnalysisVipSharingOverviewFragment.access$getContentBinding(futuresAnalysisVipSharingOverviewFragment), interfaceC49371unL);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOverviewUiState(C42903rfG c42903rfG, InterfaceC49371unL<C25915jLb> interfaceC49371unL) {
        boolean z = interfaceC49371unL instanceof InterfaceC49371unL.Activity;
        if (z) {
            Group group = c42903rfG.KWHzl;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            jIJ.showEmpty$default(this, false, 0, 2, null);
            updateContentUi(c42903rfG, (C25915jLb) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
        } else {
            Group group2 = c42903rfG.KWHzl;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(8);
            showEmpty(true, 1);
        }
        if ((interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) || z) {
            rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
        } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            rVN.reportFullyDrawn$default((Fragment) this, false, (String) null, 2, (Object) null);
        }
    }

    private final void updateContentUi(C42903rfG c42903rfG, C25915jLb c25915jLb) {
        if (getContext() != null) {
            c42903rfG.AYXKKw.setText(c25915jLb.iwGUEr());
            AppCompatTextView appCompatTextView = c42903rfG.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setTextColor(C41431qqg.getModernColor$default(appCompatTextView, c25915jLb.hDKMBd(), false, 2, null));
            c42903rfG.AhwBna.setText(c25915jLb.getNewProxyInstance());
        }
        c42903rfG.valueOf.setText(C33070mpX.AYXKKw(qZH.PendingIntent.zFtALg));
        c42903rfG.isConnected.setText(c25915jLb.AubY());
        c42903rfG.gEmmrt.setText(C33070mpX.AYXKKw(qZH.PendingIntent.GcnicV));
        c42903rfG.djBIcL.setText(c25915jLb.uzCIH());
        c42903rfG.copydefault.setData(c25915jLb.EZpvd());
    }
}
