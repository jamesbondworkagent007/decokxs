package com.okinc.business.market.features.analysis.futures.sub.calendar.ui.share;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C25876jJq;
import o.C33069mpW;
import o.C41431qqg;
import o.C42901rfE;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jIJ;
import o.pTA;
import o.qYH;
import o.qZH;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisVipSharingCalendarFragment extends jIJ<C42901rfE> {
    public static final int $stable = 0;
    private final boolean isVip = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.jIJ
    public boolean isVip() {
        return this.isVip;
    }

    public static final /* synthetic */ C42901rfE access$getContentBinding(FuturesAnalysisVipSharingCalendarFragment futuresAnalysisVipSharingCalendarFragment) {
        return futuresAnalysisVipSharingCalendarFragment.getContentBinding();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindContent(Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.jIJ
    public C42901rfE onBindContent(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42901rfE c42901rfEAEQbTJ = C42901rfE.AEQbTJ(getLayoutInflater(), viewGroup);
        Intrinsics.checkNotNullExpressionValue(c42901rfEAEQbTJ, "");
        c42901rfEAEQbTJ.copydefault.setText(C33069mpW.copydefault(qZH.PendingIntent.zOIQXb, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatDate$default(getViewModel().EZpvd(), OKDateEnum.DATE_FORMAT_STANDARD_YM, null, null, 6, null)))));
        return c42901rfEAEQbTJ;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.share.FuturesAnalysisVipSharingCalendarFragment$setListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAnalysisVipSharingCalendarFragment.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.share.FuturesAnalysisVipSharingCalendarFragment$setListener$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03481 extends SuspendLambda implements Function2<FuturesAnalysisViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ FuturesAnalysisVipSharingCalendarFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03481(FuturesAnalysisVipSharingCalendarFragment futuresAnalysisVipSharingCalendarFragment, Continuation<? super C03481> continuation) {
                super(2, continuation);
                this.this$0 = futuresAnalysisVipSharingCalendarFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03481 c03481 = new C03481(this.this$0, continuation);
                c03481.L$0 = obj;
                return c03481;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesAnalysisViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                return ((C03481) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                FuturesAnalysisViewModel.StateListAnimator stateListAnimator;
                C25876jJq c25876jJq;
                C25876jJq c25876jJq2;
                InterfaceC49371unL<C25876jJq> interfaceC49371unLKWHzl;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    stateListAnimator = (FuturesAnalysisViewModel.StateListAnimator) this.L$0;
                    if (stateListAnimator.KWHzl() instanceof InterfaceC49371unL.Activity) {
                        Group group = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(this.this$0).EZpvd;
                        Intrinsics.checkNotNullExpressionValue(group, "");
                        group.setVisibility(0);
                        jIJ.showEmpty$default(this.this$0, false, 0, 2, null);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(this.this$0.getViewModel().EZpvd());
                        qYH qyh = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(this.this$0).KWHzl;
                        Date time = calendar.getTime();
                        Intrinsics.checkNotNullExpressionValue(time, "");
                        Date time2 = calendar.getTime();
                        Intrinsics.checkNotNullExpressionValue(time2, "");
                        qYH.setMonthRange$default(qyh, time, time2, null, 4, null);
                        InterfaceC49371unL<C25876jJq> interfaceC49371unLKWHzl2 = stateListAnimator.KWHzl();
                        InterfaceC49371unL.Activity activity = interfaceC49371unLKWHzl2 instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) interfaceC49371unLKWHzl2 : null;
                        if (activity == null || (c25876jJq = (C25876jJq) activity.copydefault()) == null) {
                            return Unit.INSTANCE;
                        }
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1 futuresAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1 = new FuturesAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1(c25876jJq, this.this$0, null);
                        this.L$0 = stateListAnimator;
                        this.L$1 = c25876jJq;
                        this.label = 1;
                        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, futuresAnalysisVipSharingCalendarFragment$setListener$1$1$dayItemExtras$1, this);
                        if (objWithContext == objCopydefault) {
                            return objCopydefault;
                        }
                        c25876jJq2 = c25876jJq;
                        obj = objWithContext;
                    } else {
                        Group group2 = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(this.this$0).EZpvd;
                        Intrinsics.checkNotNullExpressionValue(group2, "");
                        group2.setVisibility(8);
                        this.this$0.showEmpty(true, 2);
                        interfaceC49371unLKWHzl = stateListAnimator.KWHzl();
                        if (!(interfaceC49371unLKWHzl instanceof InterfaceC49371unL.TaskDescription) || (interfaceC49371unLKWHzl instanceof InterfaceC49371unL.Activity)) {
                            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                        } else if (interfaceC49371unLKWHzl instanceof InterfaceC49371unL.Application) {
                            rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c25876jJq2 = (C25876jJq) this.L$1;
                    stateListAnimator = (FuturesAnalysisViewModel.StateListAnimator) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(this.this$0).KWHzl.setMonthExtra(c25876jJq2.copydefault(), (List) obj);
                if (this.this$0.getContext() != null) {
                    C42901rfE c42901rfEAccess$getContentBinding = FuturesAnalysisVipSharingCalendarFragment.access$getContentBinding(this.this$0);
                    c42901rfEAccess$getContentBinding.gEmmrt.setText(c25876jJq2.AEQbTJ());
                    AppCompatTextView appCompatTextView = c42901rfEAccess$getContentBinding.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    appCompatTextView.setTextColor(C41431qqg.getModernColor$default(appCompatTextView, c25876jJq2.EZpvd(), false, 2, null));
                    c42901rfEAccess$getContentBinding.djBIcL.setText(c25876jJq2.OLrzqt());
                }
                interfaceC49371unLKWHzl = stateListAnimator.KWHzl();
                if (!(interfaceC49371unLKWHzl instanceof InterfaceC49371unL.TaskDescription)) {
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FuturesAnalysisVipSharingCalendarFragment futuresAnalysisVipSharingCalendarFragment = FuturesAnalysisVipSharingCalendarFragment.this;
                futuresAnalysisVipSharingCalendarFragment.collectLatestOnLifecycle(futuresAnalysisVipSharingCalendarFragment.getViewModel(), Lifecycle.State.CREATED, new C03481(FuturesAnalysisVipSharingCalendarFragment.this, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
