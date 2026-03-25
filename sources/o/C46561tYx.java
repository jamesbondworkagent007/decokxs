package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.preference.ui.apperance.DayNightSettingViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46526tXp;
import org.jetbrains.annotations.NotNull;
import uniffi.settings.DayNightMode;

/* JADX INFO: renamed from: o.tYx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46561tYx extends tYE {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public tXA OLrzqt;

    /* JADX INFO: renamed from: o.tYx$Activity */
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

    /* JADX INFO: renamed from: o.tYx$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DayNightMode.values().length];
            try {
                iArr[DayNightMode.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightMode.DAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DayNightMode.NIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public C46561tYx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.preference.ui.apperance.DayNightModeSettingBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.preference.ui.apperance.DayNightModeSettingBottomSheet$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DayNightSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.preference.ui.apperance.DayNightModeSettingBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.preference.ui.apperance.DayNightModeSettingBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.preference.ui.apperance.DayNightModeSettingBottomSheet$special$$inlined$viewModels$default$5
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
    }

    /* JADX DEBUG: Possible override for method o.tYE.AEQbTJ()V */
    public final DayNightSettingViewModel AEQbTJ() {
        return (DayNightSettingViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
        java.lang.String string = getString(C46526tXp.TaskDescription.values);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.OLrzqt = tXA.OLrzqt(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        valueOf();
        AhwBna();
        AEQbTJ().EZpvd();
    }

    private final void valueOf() {
        tXA txa = this.OLrzqt;
        if (txa != null) {
            android.widget.TextView textView = txa.OLrzqt;
            textView.setOnClickListener(new ActionBar(textView, 1000L, this));
            android.widget.TextView textView2 = txa.AEQbTJ;
            textView2.setOnClickListener(new Application(textView2, 1000L, this));
            android.widget.TextView textView3 = txa.KWHzl;
            textView3.setOnClickListener(new Dialog(textView3, 1000L, this));
        }
    }

    private final void AhwBna() {
        AEQbTJ().copydefault().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.tYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46561tYx.copydefault(this.KWHzl, (DayNightMode) obj);
            }
        }));
    }

    public static final Unit copydefault(C46561tYx c46561tYx, DayNightMode dayNightMode) {
        android.content.Context context;
        tXA txa = c46561tYx.OLrzqt;
        if (txa != null) {
            txa.OLrzqt.setSelected(dayNightMode == DayNightMode.AUTO);
            txa.AEQbTJ.setSelected(dayNightMode == DayNightMode.DAY);
            txa.KWHzl.setSelected(dayNightMode == DayNightMode.NIGHT);
        }
        Intrinsics.copydefault(dayNightMode);
        if (c46561tYx.KWHzl(dayNightMode) != C33492mxV.EZpvd() && (context = c46561tYx.getContext()) != null) {
            c46561tYx.startActivity(ActivityC46558tYu.Companion.KWHzl(context, c46561tYx.KWHzl(dayNightMode)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, C33492mxV.OLrzqt() ? "system_dark" : "system_light", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(int i) {
        if (i == -1) {
            C32866mlf.KWHzl("AppearanceSetting_Mid_Button_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tYA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46561tYx.AEQbTJ((EventParamsList) obj);
                }
            });
        } else if (i == 1) {
            C32866mlf.KWHzl("AppearanceSetting_Mid_Button_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tYy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46561tYx.AYXKKw((EventParamsList) obj);
                }
            });
        } else {
            if (i != 2) {
                return;
            }
            C32866mlf.KWHzl("AppearanceSetting_Mid_Button_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tYw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46561tYx.EZpvd((EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "dark", true);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "light", true);
        return Unit.INSTANCE;
    }

    public final int KWHzl(DayNightMode dayNightMode) {
        int i = TaskDescription.EZpvd[dayNightMode.ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        FragmentKt.setFragmentResult(this, "request_update_night_mode", BundleKt.bundleOf(C56390yDp.OLrzqt("bundle_result_night_mode", java.lang.Integer.valueOf(C33492mxV.EZpvd()))));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    /* JADX INFO: renamed from: o.tYx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tYx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new C46561tYx().show(fragmentManager, "DayNightModeSettingBottomSheet");
        }
    }

    /* JADX INFO: renamed from: o.tYx$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C46561tYx KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C46561tYx c46561tYx) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c46561tYx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ().OLrzqt();
                this.KWHzl.copydefault(-1);
            }
        }
    }

    /* JADX INFO: renamed from: o.tYx$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C46561tYx AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C46561tYx c46561tYx) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c46561tYx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ().KWHzl();
                this.AEQbTJ.copydefault(1);
            }
        }
    }

    /* JADX INFO: renamed from: o.tYx$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C46561tYx EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C46561tYx c46561tYx) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c46561tYx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ().AEQbTJ();
                this.EZpvd.copydefault(2);
            }
        }
    }
}
