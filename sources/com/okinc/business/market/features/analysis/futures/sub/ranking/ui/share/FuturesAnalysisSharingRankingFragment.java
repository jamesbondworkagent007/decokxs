package com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisSharingRankingFragment;
import com.okinc.trade.arch.util.Quartet;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C25932jLs;
import o.C25937jLx;
import o.C33070mpX;
import o.C33129mqd;
import o.C42874ree;
import o.C42905rfI;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.InterfaceC56387yDm;
import o.jIJ;
import o.pTD;
import o.qZH;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisSharingRankingFragment extends jIJ<C42905rfI> {
    private static final int MAX_COUNT = 3;
    private final InterfaceC56387yDm adapter$delegate = C56392yDr.copydefault(new Function0() { // from class: o.jLu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FuturesAnalysisSharingRankingFragment.adapter_delegate$lambda$3(this.OLrzqt);
        }
    });
    private static final Application Companion = new Application(null);
    public static final int $stable = 8;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FuturesAnalysisRankingPnlType.values().length];
            try {
                iArr[FuturesAnalysisRankingPnlType.NET_PNL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesAnalysisRankingPnlType.LONG_PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesAnalysisRankingPnlType.SHORT_PNL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    public static final /* synthetic */ C42905rfI access$getContentBinding(FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment) {
        return futuresAnalysisSharingRankingFragment.getContentBinding();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisSharingRankingFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final C25932jLs getAdapter() {
        return (C25932jLs) this.adapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C25932jLs adapter_delegate$lambda$3(final FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment) {
        return new C25932jLs(new Function1() { // from class: o.jLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FuturesAnalysisSharingRankingFragment.adapter_delegate$lambda$3$lambda$0(this.OLrzqt, (android.view.ViewGroup) obj);
            }
        }, new Function1() { // from class: o.jLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FuturesAnalysisSharingRankingFragment.adapter_delegate$lambda$3$lambda$2((ViewBinding) obj);
            }
        }, false, true, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewBinding adapter_delegate$lambda$3$lambda$0(FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42874ree c42874reeAEQbTJ = C42874ree.AEQbTJ(futuresAnalysisSharingRankingFragment.getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42874reeAEQbTJ, "");
        return c42874reeAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Quartet adapter_delegate$lambda$3$lambda$2(ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "");
        C42874ree c42874ree = (C42874ree) viewBinding;
        return new Quartet(c42874ree.copydefault, c42874ree.KWHzl, c42874ree.OLrzqt, c42874ree.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindContent(Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.jIJ
    public C42905rfI onBindContent(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42905rfI c42905rfIAEQbTJ = C42905rfI.AEQbTJ(getLayoutInflater(), viewGroup);
        Intrinsics.checkNotNullExpressionValue(c42905rfIAEQbTJ, "");
        c42905rfIAEQbTJ.KWHzl.setAdapter(getAdapter());
        c42905rfIAEQbTJ.KWHzl.setItemAnimator(null);
        c42905rfIAEQbTJ.KWHzl.setLayoutManager(new LinearLayoutManager(requireContext()));
        int i = Activity.copydefault[getViewModel().valueOf().ordinal()];
        if (i == 1) {
            onBindContent$lambda$4$setTitle(c42905rfIAEQbTJ, this, qZH.Dialog.copydefault, qZH.PendingIntent.DTg);
        } else if (i == 2) {
            onBindContent$lambda$4$setTitle(c42905rfIAEQbTJ, this, qZH.Dialog.OLrzqt, qZH.PendingIntent.getLabel);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onBindContent$lambda$4$setTitle(c42905rfIAEQbTJ, this, qZH.Dialog.djBIcL, qZH.PendingIntent.zSsVtY);
        }
        return c42905rfIAEQbTJ;
    }

    private static final void onBindContent$lambda$4$setTitle(C42905rfI c42905rfI, FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment, @PluralsRes int i, @StringRes int i2) {
        String strEZpvd;
        AppCompatTextView appCompatTextView = c42905rfI.AEQbTJ;
        int num = futuresAnalysisSharingRankingFragment.getViewModel().copydefault().getNum();
        if (num == FuturesAnalysisRankingPeriod.PERIOD_ALL.getNum()) {
            strEZpvd = C33070mpX.AYXKKw(i2);
        } else {
            Context context = futuresAnalysisSharingRankingFragment.getContext();
            strEZpvd = context != null ? pTD.EZpvd(context, i, num, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, String.valueOf(num)))) : null;
        }
        appCompatTextView.setText(strEZpvd);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisSharingRankingFragment$setListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAnalysisSharingRankingFragment.this.new AnonymousClass1(continuation);
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
                FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment = FuturesAnalysisSharingRankingFragment.this;
                futuresAnalysisSharingRankingFragment.collectLatestOnLifecycle(futuresAnalysisSharingRankingFragment.getViewModel(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisSharingRankingFragment.setListener.1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((FuturesAnalysisViewModel.StateListAnimator) obj2).copydefault();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((FuturesAnalysisViewModel.StateListAnimator) obj2).EZpvd((InterfaceC49371unL<? extends List<C25937jLx>>) obj3);
                    }
                }, Lifecycle.State.CREATED, new AnonymousClass2(FuturesAnalysisSharingRankingFragment.this, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisSharingRankingFragment$setListener$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends C25937jLx>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesAnalysisSharingRankingFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresAnalysisSharingRankingFragment;
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
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends C25937jLx>> interfaceC49371unL, Continuation<? super Unit> continuation) {
                return invoke2((InterfaceC49371unL<? extends List<C25937jLx>>) interfaceC49371unL, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC49371unL<? extends List<C25937jLx>> interfaceC49371unL, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                List<C25937jLx> listAhwBna;
                List list;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                    boolean z = interfaceC49371unL instanceof InterfaceC49371unL.Activity;
                    InterfaceC49371unL.Activity activity = z ? (InterfaceC49371unL.Activity) interfaceC49371unL : null;
                    if (activity == null || (list = (List) activity.copydefault()) == null) {
                        listAhwBna = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((C25937jLx) obj2).valueOf().compareTo(BigDecimal.ZERO) > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, 3);
                    }
                    if (listAhwBna == null || listAhwBna.isEmpty()) {
                        FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment = this.this$0;
                        futuresAnalysisSharingRankingFragment.showContentEmpty(FuturesAnalysisSharingRankingFragment.access$getContentBinding(futuresAnalysisSharingRankingFragment));
                    } else {
                        Iterator it = listAhwBna.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        BigDecimal bigDecimalValueOf = ((C25937jLx) it.next()).valueOf();
                        while (it.hasNext()) {
                            BigDecimal bigDecimalValueOf2 = ((C25937jLx) it.next()).valueOf();
                            if (bigDecimalValueOf.compareTo(bigDecimalValueOf2) < 0) {
                                bigDecimalValueOf = bigDecimalValueOf2;
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                        for (C25937jLx c25937jLx : listAhwBna) {
                            BigDecimal bigDecimalMultiply = c25937jLx.valueOf().multiply(C33129mqd.EZpvd(C56443yFo.AEQbTJ(100)));
                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
                            BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN);
                            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
                            arrayList2.add(c25937jLx.OLrzqt((479 & 1) != 0 ? c25937jLx.EZpvd : null, (479 & 2) != 0 ? c25937jLx.KWHzl : null, (479 & 4) != 0 ? c25937jLx.AEQbTJ : null, (479 & 8) != 0 ? c25937jLx.gEmmrt : null, (479 & 16) != 0 ? c25937jLx.OLrzqt : null, (479 & 32) != 0 ? c25937jLx.AYXKKw : bigDecimalDivide.intValue(), (479 & 64) != 0 ? c25937jLx.valueOf : null, (479 & 128) != 0 ? c25937jLx.copydefault : null, (479 & 256) != 0 ? c25937jLx.AhwBna : null));
                        }
                        FuturesAnalysisSharingRankingFragment futuresAnalysisSharingRankingFragment2 = this.this$0;
                        futuresAnalysisSharingRankingFragment2.showContentList(FuturesAnalysisSharingRankingFragment.access$getContentBinding(futuresAnalysisSharingRankingFragment2), arrayList2);
                    }
                    if ((interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) || z) {
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                    }
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
    public final void showContentList(C42905rfI c42905rfI, List<C25937jLx> list) {
        jIJ.showEmpty$default(this, false, 0, 2, null);
        Group group = c42905rfI.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        getAdapter().copydefault(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContentEmpty(C42905rfI c42905rfI) {
        showEmpty(true, 1);
        Group group = c42905rfI.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
    }
}
