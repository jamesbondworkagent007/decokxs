package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$2;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractActivityC33041mov;
import o.C33070mpX;
import o.C47988uAv;
import o.C48033uCm;
import o.C48338uNu;
import o.C49968uyZ;
import o.C50503vQv;
import o.C55284xgz;
import o.C55326xho;
import o.C55688xof;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.vQB;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheet$startCollection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartEarnAllocationBottomSheet$startCollection$2(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, Continuation<? super SmartEarnAllocationBottomSheet$startCollection$2> continuation) {
        super(2, continuation);
        this.this$0 = smartEarnAllocationBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartEarnAllocationBottomSheet$startCollection$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartEarnAllocationBottomSheet$startCollection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = smartEarnAllocationBottomSheet;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<C50503vQv.Activity> sharedFlowOLrzqt = this.this$0.AYXKKw().OLrzqt();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
                this.label = 1;
                if (sharedFlowOLrzqt.collect(anonymousClass4, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$2$1$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ SmartEarnAllocationBottomSheet KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet) {
                this.KWHzl = smartEarnAllocationBottomSheet;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final Object emit(C50503vQv.Activity activity, Continuation<? super Unit> continuation) {
                Window window;
                C55284xgz c55284xgzKWHzl;
                View view;
                C47988uAv c47988uAv;
                C47988uAv c47988uAv2;
                FragmentActivity activity2 = this.KWHzl.getActivity();
                decorView = null;
                View decorView = null;
                AbstractActivityC33041mov abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.dismissLoading();
                }
                if (Intrinsics.EZpvd(activity, C50503vQv.Activity.ActionBar.KWHzl)) {
                    C48338uNu c48338uNu = this.KWHzl.values;
                    if (c48338uNu != null && (c47988uAv2 = c48338uNu.AYXKKw) != null) {
                        c47988uAv2.zsXlph();
                    }
                } else if (Intrinsics.EZpvd(activity, C50503vQv.Activity.Application.EZpvd)) {
                    C48338uNu c48338uNu2 = this.KWHzl.values;
                    if (c48338uNu2 != null && (c47988uAv = c48338uNu2.EZpvd) != null) {
                        c47988uAv.zsXlph();
                    }
                } else if (Intrinsics.EZpvd(activity, C50503vQv.Activity.C0981Activity.copydefault)) {
                    this.KWHzl.dismiss();
                } else if (activity instanceof C50503vQv.Activity.StateListAnimator) {
                    C50503vQv.Activity.StateListAnimator stateListAnimator = (C50503vQv.Activity.StateListAnimator) activity;
                    FragmentKt.setFragmentResult(this.KWHzl, "SmartEarnRequest", BundleKt.bundleOf(C56390yDp.OLrzqt(SmartEarnRequestParam.Key, new SmartEarnRequestParam(stateListAnimator.AEQbTJ(), stateListAnimator.OLrzqt(), stateListAnimator.EZpvd(), stateListAnimator.copydefault(), (String) null, 16, (DefaultConstructorMarker) null))));
                    this.KWHzl.dismiss();
                } else if (activity instanceof C50503vQv.Activity.Dialog) {
                    C50503vQv.Activity.Dialog dialog = (C50503vQv.Activity.Dialog) activity;
                    vQB.Companion.EZpvd(this.KWHzl.djBIcL(), dialog.EZpvd(), dialog.AEQbTJ()).show(this.KWHzl.getChildFragmentManager(), vQB.class.getSimpleName());
                    FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                    LifecycleOwner viewLifecycleOwner = this.KWHzl.getViewLifecycleOwner();
                    final SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.KWHzl;
                    childFragmentManager.setFragmentResultListener("result_key", viewLifecycleOwner, new FragmentResultListener() { // from class: o.vQs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.fragment.app.FragmentResultListener
                        public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                            SmartEarnAllocationBottomSheet$startCollection$2.AnonymousClass1.AnonymousClass4.KWHzl(smartEarnAllocationBottomSheet, str, bundle);
                        }
                    });
                } else if (activity instanceof C50503vQv.Activity.TaskDescription) {
                    Fragment parentFragment = this.KWHzl.getParentFragment();
                    if (parentFragment == null || (view = parentFragment.getView()) == null) {
                        FragmentActivity activity3 = this.KWHzl.getActivity();
                        if (activity3 != null && (window = activity3.getWindow()) != null) {
                            decorView = window.getDecorView();
                        }
                    } else {
                        decorView = view;
                    }
                    String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onCaptioningEnabledChanged);
                    if (decorView != null && (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(decorView, strAYXKKw)) != null) {
                        c55284xgzKWHzl.isConnected(3);
                        c55284xgzKWHzl.djBIcL(0);
                        c55284xgzKWHzl.AEQbTJ(strAYXKKw);
                        c55284xgzKWHzl.hDKMBd();
                    }
                    this.KWHzl.dismiss();
                } else if (activity instanceof C50503vQv.Activity.PendingIntent) {
                    C55326xho.toastWithFailedIcon$default(C49968uyZ.OLrzqt(((C50503vQv.Activity.PendingIntent) activity).EZpvd(), C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT)), 0, 1, (Object) null);
                } else {
                    if (!(activity instanceof C50503vQv.Activity.FragmentManager)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity activity4 = this.KWHzl.getActivity();
                    AbstractActivityC33041mov abstractActivityC33041mov2 = activity4 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity4 : null;
                    if (abstractActivityC33041mov2 != null) {
                        abstractActivityC33041mov2.showLoading();
                    }
                }
                return Unit.INSTANCE;
            }

            public static final void KWHzl(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, String str, Bundle bundle) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(bundle, "");
                FragmentActivity activity = smartEarnAllocationBottomSheet.getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.showLoading();
                }
                smartEarnAllocationBottomSheet.AYXKKw().copydefault(C50503vQv.Application.PendingIntent.OLrzqt);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(smartEarnAllocationBottomSheet, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(smartEarnAllocationBottomSheet, state, anonymousClass1, this) == objCopydefault) {
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
