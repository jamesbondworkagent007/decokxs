package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheetViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C29817lBk extends AbstractC29812lBf {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public AbstractC31492luz AYXKKw;
    public java.lang.String AhwBna;
    public yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.Boolean, Unit> AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public Function0<Unit> gEmmrt;
    public boolean isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.lBf.EZpvd()V */
    public final Function0<Unit> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.Boolean, Unit> yho) {
        this.AkhnZx = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit>, o.yHO<android.content.Context, java.lang.String, java.lang.Boolean, kotlin.Unit> */
    public final yHO<android.content.Context, java.lang.String, java.lang.Boolean, Unit> valueOf() {
        return this.AkhnZx;
    }

    public C29817lBk() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lzS.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PayPalPreloadBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PayPalPreloadBottomSheet$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AhwBna = "";
    }

    private final lzS djBIcL() {
        return (lzS) this.valueOf.getValue();
    }

    public final PayPalPreloadBottomSheetViewModel AYXKKw() {
        return (PayPalPreloadBottomSheetViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: renamed from: o.lBk$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lBk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lBk$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C29817lBk newInstance$default(TaskDescription taskDescription, java.lang.String str, yHO yho, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            return taskDescription.OLrzqt(str, yho, z, function0);
        }

        public final C29817lBk OLrzqt(@NotNull java.lang.String str, @NotNull yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.Boolean, Unit> yho, boolean z, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(yho, "");
            C29817lBk c29817lBk = new C29817lBk();
            c29817lBk.AhwBna = str;
            c29817lBk.OLrzqt(yho);
            c29817lBk.copydefault(function0);
            c29817lBk.isConnected = z;
            return c29817lBk;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(3);
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        if (linearLayoutCompatEZpvd != null) {
            linearLayoutCompatEZpvd.setVisibility(8);
        }
        android.widget.ImageView imageViewKWHzl = c52781wYc.KWHzl();
        if (imageViewKWHzl != null) {
            imageViewKWHzl.setVisibility(0);
        }
        android.widget.ImageView imageViewKWHzl2 = c52781wYc.KWHzl();
        if (imageViewKWHzl2 != null) {
            imageViewKWHzl2.setOnClickListener(new View.OnClickListener() { // from class: o.lBh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29817lBk.EZpvd(this.copydefault, view);
                }
            });
        }
    }

    public static final void EZpvd(C29817lBk c29817lBk, android.view.View view) {
        c29817lBk.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = AbstractC31492luz.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        lzS.initialize$default(djBIcL(), C33070mpX.AYXKKw(C31351lsQ.Activity.OqFWZa), C33070mpX.AYXKKw(C31351lsQ.Activity.DCJXGO), true, false, false, null, null, 24, null);
        AbstractC31492luz abstractC31492luz = this.AYXKKw;
        AbstractC31492luz abstractC31492luz2 = null;
        if (abstractC31492luz == null) {
            Intrinsics.gEmmrt("");
            abstractC31492luz = null;
        }
        abstractC31492luz.AYXKKw.AEQbTJ(djBIcL());
        AbstractC31492luz abstractC31492luz3 = this.AYXKKw;
        if (abstractC31492luz3 == null) {
            Intrinsics.gEmmrt("");
            abstractC31492luz3 = null;
        }
        C52794wYp c52794wYp = abstractC31492luz3.AYXKKw.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        AbstractC31492luz abstractC31492luz4 = this.AYXKKw;
        if (abstractC31492luz4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31492luz2 = abstractC31492luz4;
        }
        C52794wYp c52794wYp2 = abstractC31492luz2.AYXKKw.OLrzqt;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
        AhwBna();
        AYXKKw().EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        super.onPause();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        dismiss();
    }

    private final void AhwBna() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<UserInfoBean>> liveDataKWHzl = AYXKKw().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataKWHzl, viewLifecycleOwner, new Function1() { // from class: o.lBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29817lBk.copydefault(this.OLrzqt, (UserInfoBean) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataOLrzqt = AYXKKw().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataOLrzqt, viewLifecycleOwner2, new Function1() { // from class: o.lBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29817lBk.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAEQbTJ = AYXKKw().AEQbTJ();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataAEQbTJ, viewLifecycleOwner3, new Function1() { // from class: o.lBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29817lBk.EZpvd(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C29817lBk c29817lBk, UserInfoBean userInfoBean) {
        Intrinsics.checkNotNullParameter(userInfoBean, "");
        android.content.Context contextRequireContext = c29817lBk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String str = "•  " + C33069mpW.KWHzl(contextRequireContext, C31351lsQ.Activity.ggKfIT, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("fullName", userInfoBean.getFullName())));
        android.content.Context contextRequireContext2 = c29817lBk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        AbstractC31492luz abstractC31492luz = null;
        java.lang.String str2 = "•  " + C33069mpW.getFormattedString$default(contextRequireContext2, C31351lsQ.Activity.invokespecialROgMPW, (java.util.Map) null, 2, (java.lang.Object) null);
        android.content.Context contextRequireContext3 = c29817lBk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        java.lang.String str3 = "•  " + C33069mpW.getFormattedString$default(contextRequireContext3, C31351lsQ.Activity.invokespecialODCBUN, (java.util.Map) null, 2, (java.lang.Object) null);
        AbstractC31492luz abstractC31492luz2 = c29817lBk.AYXKKw;
        if (abstractC31492luz2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31492luz = abstractC31492luz2;
        }
        abstractC31492luz.AEQbTJ.setText(str);
        abstractC31492luz.EZpvd.setText(str2);
        abstractC31492luz.OLrzqt.setText(str3);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C29817lBk c29817lBk, boolean z) {
        AbstractC31492luz abstractC31492luz = null;
        if (z) {
            c29817lBk.gEmmrt();
            AbstractC31492luz abstractC31492luz2 = c29817lBk.AYXKKw;
            if (abstractC31492luz2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31492luz = abstractC31492luz2;
            }
            android.view.View root = abstractC31492luz.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55418xja.AEQbTJ(root);
        } else {
            AbstractC31492luz abstractC31492luz3 = c29817lBk.AYXKKw;
            if (abstractC31492luz3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31492luz = abstractC31492luz3;
            }
            android.view.View root2 = abstractC31492luz.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            C55418xja.EZpvd(root2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C29817lBk c29817lBk, boolean z) {
        if (z) {
            AbstractC31492luz abstractC31492luz = c29817lBk.AYXKKw;
            if (abstractC31492luz == null) {
                Intrinsics.gEmmrt("");
                abstractC31492luz = null;
            }
            abstractC31492luz.djBIcL.setVisibility(8);
            abstractC31492luz.KWHzl.setVisibility(8);
            abstractC31492luz.AYXKKw.getRoot().setVisibility(8);
            abstractC31492luz.valueOf.setVisibility(0);
            C55173xeu c55173xeu = abstractC31492luz.gEmmrt;
            c55173xeu.setEmptyTypeImage(9);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.gasjUx));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.flVtFt));
            c55173xeu.AEQbTJ().setVisibility(0);
            c55173xeu.AEQbTJ().setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fvQaOB));
            c55173xeu.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lBi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29817lBk.copydefault(this.OLrzqt, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C29817lBk c29817lBk, android.view.View view) {
        c29817lBk.isConnected();
    }

    public final void gEmmrt() {
        AbstractC31492luz abstractC31492luz = this.AYXKKw;
        if (abstractC31492luz == null) {
            Intrinsics.gEmmrt("");
            abstractC31492luz = null;
        }
        ConstraintLayout constraintLayout = abstractC31492luz.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        C55418xja.KWHzl(constraintLayout, new C55363xiY(false, false, true, 102, 340, false, 8, false, false, 0, null, null, MTAnalysisConstants.MainWhat.ON_ACCOUNT, null));
        C52794wYp c52794wYp = abstractC31492luz.AYXKKw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        C55418xja.KWHzl(c52794wYp, new C55363xiY(false, false, false, null, null, false, 24, false, false, 0, null, null, 4031, null));
        C52794wYp c52794wYp2 = abstractC31492luz.AYXKKw.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        C55418xja.KWHzl(c52794wYp2, new C55363xiY(false, false, false, null, null, false, 24, false, false, 0, null, null, 4031, null));
    }

    /* JADX INFO: renamed from: o.lBk$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29817lBk OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C29817lBk c29817lBk) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c29817lBk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.lBk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29817lBk KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29817lBk c29817lBk) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c29817lBk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                Function0<Unit> function0EZpvd = this.KWHzl.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
                yHO<android.content.Context, java.lang.String, java.lang.Boolean, Unit> yhoValueOf = this.KWHzl.valueOf();
                if (yhoValueOf != null) {
                    android.content.Context contextRequireContext = this.KWHzl.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    yhoValueOf.invoke(contextRequireContext, this.KWHzl.AhwBna, java.lang.Boolean.valueOf(this.KWHzl.isConnected));
                }
            }
        }
    }

    private final void isConnected() {
        AYXKKw().EZpvd(false);
        AbstractC31492luz abstractC31492luz = this.AYXKKw;
        if (abstractC31492luz == null) {
            Intrinsics.gEmmrt("");
            abstractC31492luz = null;
        }
        abstractC31492luz.valueOf.setVisibility(8);
        abstractC31492luz.djBIcL.setVisibility(0);
        abstractC31492luz.KWHzl.setVisibility(0);
        abstractC31492luz.AYXKKw.getRoot().setVisibility(0);
        AYXKKw().EZpvd();
    }
}
