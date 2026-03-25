package com.okinc.okex.center.ui.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.SupportFullSelfToolsActivity;
import com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC45033siE;
import o.AbstractC47359toZ;
import o.C32979mnm;
import o.C33097mpy;
import o.C44901sff;
import o.C45057sic;
import o.C45146skL;
import o.C45397soy;
import o.C47315tni;
import o.C55296xhK;
import o.C55298xhM;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class SupportSelfToolsCardFragment extends AbstractC45033siE implements C45057sic.Application {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public static final String valueOf;
    public AbstractC47359toZ AYXKKw;
    public boolean DbNXlk;
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public C45397soy selfServiceUseCase;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.skc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportSelfToolsCardFragment.EZpvd(this.AEQbTJ);
        }
    });
    public final int AhwBna = C47315tni.ActionBar.aKErDB;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC47359toZ abstractC47359toZ) {
        Intrinsics.checkNotNullParameter(abstractC47359toZ, "");
        this.AYXKKw = abstractC47359toZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public SupportSelfToolsCardFragment() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportCenterHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final SupportSelfToolsCardFragment KWHzl() {
            return new SupportSelfToolsCardFragment();
        }
    }

    static {
        String simpleName = SupportSelfToolsCardFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        valueOf = simpleName;
    }

    public final C45397soy valueOf() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportCenterHomeViewModel gEmmrt() {
        return (SupportCenterHomeViewModel) this.djBIcL.getValue();
    }

    public final C45057sic AhwBna() {
        return (C45057sic) this.fetchVPNInfo.getValue();
    }

    public static final C45057sic EZpvd(SupportSelfToolsCardFragment supportSelfToolsCardFragment) {
        boolean z = true;
        C45057sic c45057sic = new C45057sic(z, (C33097mpy.OLrzqt(C32979mnm.EZpvd.OLrzqt()) - C55298xhM.dpInt$default(64.0f, (Context) null, 1, (Object) null)) / 3, null, 4, null);
        c45057sic.copydefault(supportSelfToolsCardFragment);
        return c45057sic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        if (this.DbNXlk != z) {
            this.DbNXlk = z;
            View root = AEQbTJ().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(this.DbNXlk ^ true ? 8 : 0);
        }
    }

    /* JADX DEBUG: Possible override for method o.siE.AEQbTJ()V */
    public final AbstractC47359toZ AEQbTJ() {
        AbstractC47359toZ abstractC47359toZ = this.AYXKKw;
        if (abstractC47359toZ != null) {
            return abstractC47359toZ;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(AbstractC47359toZ.copydefault(view));
        View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(8);
        C45146skL c45146skL = AEQbTJ().EZpvd;
        c45146skL.setOnClickListener(new TaskDescription(c45146skL, 1000L, this));
        AYXKKw();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment$initView$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportSelfToolsCardFragment.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportSelfToolsCardFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SupportSelfToolsCardFragment supportSelfToolsCardFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = supportSelfToolsCardFragment;
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

            /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment$initView$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05401 extends SuspendLambda implements Function2<SupportCenterHomeViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SupportSelfToolsCardFragment this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05401(SupportSelfToolsCardFragment supportSelfToolsCardFragment, Continuation<? super C05401> continuation) {
                    super(2, continuation);
                    this.this$0 = supportSelfToolsCardFragment;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05401 c05401 = new C05401(this.this$0, continuation);
                    c05401.L$0 = obj;
                    return c05401;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SupportCenterHomeViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                    return ((C05401) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        SupportCenterHomeViewModel.StateListAnimator stateListAnimator = (SupportCenterHomeViewModel.StateListAnimator) this.L$0;
                        if (!(stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.Activity)) {
                            this.this$0.EZpvd(false);
                        } else {
                            SupportCenterHomeViewModel.StateListAnimator.Activity activity = (SupportCenterHomeViewModel.StateListAnimator.Activity) stateListAnimator;
                            if (activity.AEQbTJ().isEmpty()) {
                                this.this$0.EZpvd(false);
                            } else {
                                this.this$0.EZpvd(true);
                                this.this$0.AhwBna().copydefault(activity.AEQbTJ());
                                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
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
                    StateFlow<SupportCenterHomeViewModel.StateListAnimator> stateFlowDjBIcL = this.this$0.gEmmrt().djBIcL();
                    C05401 c05401 = new C05401(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowDjBIcL, c05401, this) == objCopydefault) {
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
                SupportSelfToolsCardFragment supportSelfToolsCardFragment = SupportSelfToolsCardFragment.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(supportSelfToolsCardFragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(supportSelfToolsCardFragment, state, anonymousClass1, this) == objCopydefault) {
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

    @Override // o.C45057sic.Application
    public void OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        gEmmrt().AkhnZx();
        Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportSelfToolsCardFragment$onSelfServiceItemClicked$1$1(this, context, selfServiceToolBean, null), 3, null);
        }
    }

    public final void djBIcL() {
        C44901sff.copydefault.KWHzl();
        SupportFullSelfToolsActivity.StateListAnimator stateListAnimator = SupportFullSelfToolsActivity.Companion;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        startActivity(stateListAnimator.copydefault(applicationContext));
    }

    public final void AYXKKw() {
        RecyclerView recyclerView = AEQbTJ().copydefault;
        recyclerView.setAdapter(AhwBna());
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(0);
        flexboxLayoutManager.setAlignItems(4);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.addItemDecoration(new ActionBar());
    }

    public static final class ActionBar extends RecyclerView.ItemDecoration {
        public final int EZpvd = C55298xhM.dp2px$default(8.0f, null, 1, null);

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            if (recyclerView.getChildAdapterPosition(view) != (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
                if (!C55296xhK.AEQbTJ(view)) {
                    rect.right = this.EZpvd;
                } else {
                    rect.left = this.EZpvd;
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ SupportSelfToolsCardFragment EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, SupportSelfToolsCardFragment supportSelfToolsCardFragment) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = supportSelfToolsCardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.djBIcL();
            }
        }
    }
}
