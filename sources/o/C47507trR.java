package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C47512trW;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47507trR extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final boolean EZpvd;
    public C46311tPq OLrzqt;
    public final C43316rmw copydefault;
    public Function1<? super DraftDataInfo, Unit> gEmmrt;

    /* JADX INFO: renamed from: o.trR$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.trR$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Loading.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super DraftDataInfo, Unit> function1) {
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.EZpvd;
    }

    public C47507trR() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.draft.PublisherDraftBottomSheet$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.draft.PublisherDraftBottomSheet$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47512trW.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.draft.PublisherDraftBottomSheet$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.draft.PublisherDraftBottomSheet$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.draft.PublisherDraftBottomSheet$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.copydefault = new C43316rmw();
        this.EZpvd = true;
    }

    /* JADX INFO: renamed from: o.trR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.trR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.trR$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C47507trR show$default(TaskDescription taskDescription, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return taskDescription.copydefault(fragmentManager, function1);
        }

        public final C47507trR copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super DraftDataInfo, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C47507trR c47507trR = new C47507trR();
            c47507trR.AEQbTJ(function1);
            c47507trR.show(fragmentManager, "PublisherDraftBottomSheet");
            return c47507trR;
        }
    }

    public final C47512trW KWHzl() {
        return (C47512trW) this.AYXKKw.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C47501trL.Fragment.OxVOHk));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        setCancelable(false);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.OLrzqt = C46311tPq.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
        bottomSheetBehavior.setHideable(false);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
        AEQbTJ();
    }

    private final void EZpvd() {
        final C46311tPq c46311tPq = this.OLrzqt;
        if (c46311tPq != null) {
            this.copydefault.register(DraftDataInfo.class, new C47515trZ(new Function1() { // from class: o.trT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47507trR.KWHzl(this.copydefault, (DraftDataInfo) obj);
                }
            }));
            c46311tPq.KWHzl.setLayoutManager(new LinearLayoutManager(requireContext()));
            c46311tPq.KWHzl.setAdapter(this.copydefault);
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.gwwfep);
            Intrinsics.copydefault(drawable);
            c46311tPq.KWHzl.addItemDecoration(new C31684mAb(drawable, false, false));
            c46311tPq.EZpvd.djBIcL(false);
            c46311tPq.EZpvd.KWHzl(new InterfaceC57900yrD() { // from class: o.trU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C47507trR.EZpvd(this.EZpvd, c46311tPq, interfaceC57934yrl);
                }
            });
        }
    }

    public static final Unit KWHzl(C47507trR c47507trR, DraftDataInfo draftDataInfo) {
        Intrinsics.checkNotNullParameter(draftDataInfo, "");
        pUU.EZpvd("PublisherDraftBottomSheet", "Draft selected: " + draftDataInfo.getDraftId());
        Function1<? super DraftDataInfo, Unit> function1 = c47507trR.gEmmrt;
        if (function1 != null) {
            function1.invoke(draftDataInfo);
        }
        c47507trR.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C47507trR c47507trR, C46311tPq c46311tPq, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (c47507trR.KWHzl().EZpvd()) {
            return;
        }
        c46311tPq.EZpvd.AYXKKw();
    }

    private final void AEQbTJ() {
        KWHzl().copydefault().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.trV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47507trR.copydefault(this.OLrzqt, (C47512trW.TaskDescription) obj);
            }
        }));
        KWHzl().AEQbTJ().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.trS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47507trR.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit copydefault(C47507trR c47507trR, C47512trW.TaskDescription taskDescription) {
        Intrinsics.copydefault(taskDescription);
        c47507trR.OLrzqt(taskDescription);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47507trR c47507trR, java.lang.String str) {
        C33546myW c33546myW;
        if (str != null) {
            C46311tPq c46311tPq = c47507trR.OLrzqt;
            if (c46311tPq != null && (c33546myW = c46311tPq.EZpvd) != null) {
                c33546myW.valueOf();
            }
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C47512trW.TaskDescription taskDescription) {
        C55173xeu c55173xeu;
        FrameLayout.LayoutParams layoutParams;
        C55173xeu c55173xeu2;
        C46311tPq c46311tPq = this.OLrzqt;
        if (c46311tPq != null) {
            C55237xgE c55237xgE = c46311tPq.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
            C33546myW c33546myW = c46311tPq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c55237xgE.setStatus(taskDescription.AEQbTJ());
            int i = Application.KWHzl[taskDescription.AEQbTJ().ordinal()];
            if (i == 2) {
                c33546myW.AhwBna(false);
                c33546myW.AEQbTJ();
                android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(StatefulView.Status.Error);
                if (viewAEQbTJ == null || (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C47501trL.TaskDescription.vLaW)) == null) {
                    return;
                }
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.tsa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C47507trR.OLrzqt(this.OLrzqt, view);
                    }
                });
                ViewGroup.LayoutParams layoutParams2 = c55173xeu.getLayoutParams();
                layoutParams = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    layoutParams.gravity = 17;
                    layoutParams.topMargin = 0;
                    return;
                }
                return;
            }
            if (i == 3) {
                c33546myW.AhwBna(false);
                c33546myW.AEQbTJ();
                android.view.View viewAEQbTJ2 = c55237xgE.AEQbTJ(StatefulView.Status.Empty);
                if (viewAEQbTJ2 == null || (c55173xeu2 = (C55173xeu) viewAEQbTJ2.findViewById(C47501trL.TaskDescription.swzYdv)) == null) {
                    return;
                }
                c55173xeu2.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.fjfviF));
                ViewGroup.LayoutParams layoutParams3 = c55173xeu2.getLayoutParams();
                layoutParams = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams != null) {
                    layoutParams.gravity = 17;
                    layoutParams.topMargin = 0;
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            if (taskDescription.KWHzl()) {
                if (taskDescription.EZpvd()) {
                    c33546myW.AhwBna(true);
                    c33546myW.AEQbTJ();
                } else {
                    c33546myW.AhwBna(false);
                    c33546myW.OLrzqt();
                }
            } else if (taskDescription.EZpvd()) {
                c33546myW.AhwBna(true);
                c33546myW.valueOf();
            } else {
                c33546myW.AhwBna(false);
                c33546myW.AYXKKw();
            }
            this.copydefault.setItems(taskDescription.copydefault());
            this.copydefault.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o.trR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C47507trR EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C47507trR c47507trR) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c47507trR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    public static final void OLrzqt(C47507trR c47507trR, android.view.View view) {
        c47507trR.KWHzl().OLrzqt(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
