package com.okinc.preference.ui.theme;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.preference.ui.theme.ColorPreferenceBottomSheet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.C46526tXp;
import o.C46590tZz;
import o.C4661Bmi;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.tXB;
import o.tXD;
import o.tZC;
import o.wXQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ColorPreferenceBottomSheet extends tZC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public tXB AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public tXD colorPreferenceUseCase;

    @yCM
    public C46590tZz preferenceTracking;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public ColorPreferenceBottomSheet() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.preference.ui.theme.ColorPreferenceBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.preference.ui.theme.ColorPreferenceBottomSheet$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ColorPreferenceCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.preference.ui.theme.ColorPreferenceBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.preference.ui.theme.ColorPreferenceBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.preference.ui.theme.ColorPreferenceBottomSheet$special$$inlined$viewModels$default$5
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
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tZr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ColorPreferenceBottomSheet.valueOf(this.AEQbTJ));
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tZq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ColorPreferenceBottomSheet.AhwBna(this.KWHzl));
            }
        });
    }

    public final ColorPreferenceCoreViewModel EZpvd() {
        return (ColorPreferenceCoreViewModel) this.KWHzl.getValue();
    }

    public final boolean djBIcL() {
        return ((Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean valueOf(ColorPreferenceBottomSheet colorPreferenceBottomSheet) {
        Bundle arguments = colorPreferenceBottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_palette", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AkhnZx() {
        return ((Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean AhwBna(ColorPreferenceBottomSheet colorPreferenceBottomSheet) {
        Bundle arguments = colorPreferenceBottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("EXTRA_IS_WEB3", false);
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.tZC.AEQbTJ()V */
    public final tXD AEQbTJ() {
        tXD txd = this.colorPreferenceUseCase;
        if (txd != null) {
            return txd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C46590tZz KWHzl() {
        C46590tZz c46590tZz = this.preferenceTracking;
        if (c46590tZz != null) {
            return c46590tZz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.preference.ui.theme.ColorPreferenceBottomSheet.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull FragmentManager fragmentManager, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            ColorPreferenceBottomSheet colorPreferenceBottomSheet = new ColorPreferenceBottomSheet();
            colorPreferenceBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("EXTRA_IS_WEB3", Boolean.valueOf(z)), C56390yDp.OLrzqt("show_palette", Boolean.valueOf(z2))));
            colorPreferenceBottomSheet.show(fragmentManager, "ColorPreferenceBottomSheet");
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        String string;
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
        if (AkhnZx()) {
            string = getString(C46526tXp.TaskDescription.fIwbmz);
        } else {
            string = getString(C46526tXp.TaskDescription.DbNXlk);
        }
        Intrinsics.copydefault((Object) string);
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.AEQbTJ = tXB.EZpvd(LayoutInflater.from(getContext()), constraintLayout, true);
        EZpvd().copydefault();
        OLrzqt();
        fetchVPNInfo();
        DbNXlk();
        KWHzl().OLrzqt();
    }

    public final void OLrzqt() {
        tXB txb = this.AEQbTJ;
        if (txb != null) {
            if (AkhnZx()) {
                txb.EZpvd.setText(getString(C46526tXp.TaskDescription.isConnected));
                txb.gEmmrt.setText(getString(C46526tXp.TaskDescription.AkhnZx));
                txb.AhwBna.setText(getString(C46526tXp.TaskDescription.fetchVPNInfo));
            }
            Group group = txb.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(djBIcL() ? 0 : 8);
        }
    }

    private final void DbNXlk() {
        EZpvd().KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.tZy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ColorPreferenceBottomSheet.EZpvd(this.KWHzl, (C4661Bmi) obj);
            }
        }));
    }

    public static final Unit EZpvd(ColorPreferenceBottomSheet colorPreferenceBottomSheet, C4661Bmi c4661Bmi) {
        Intrinsics.copydefault(c4661Bmi);
        colorPreferenceBottomSheet.AEQbTJ(c4661Bmi);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C4661Bmi c4661Bmi) {
        tXB txb = this.AEQbTJ;
        if (txb != null) {
            txb.gEmmrt.setSelected(c4661Bmi.AEQbTJ() == 0);
            txb.AhwBna.setSelected(c4661Bmi.AEQbTJ() == 1);
            txb.AYXKKw.setSelected(c4661Bmi.copydefault() == 1);
            txb.AEQbTJ.setSelected(c4661Bmi.copydefault() == 0);
            txb.djBIcL.setImageResource(tXD.getChartResource$default(AEQbTJ(), 0, 1, 1, null));
            txb.KWHzl.setImageResource(tXD.getChartResource$default(AEQbTJ(), 0, 0, 1, null));
            txb.gEmmrt.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, tXD.getArrowResource$default(AEQbTJ(), 0, 0, 2, null), 0);
            txb.AhwBna.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, tXD.getArrowResource$default(AEQbTJ(), 1, 0, 2, null), 0);
        }
    }

    private final void fetchVPNInfo() {
        tXB txb = this.AEQbTJ;
        if (txb != null) {
            txb.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.tZp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ColorPreferenceBottomSheet.OLrzqt(this.EZpvd, view);
                }
            });
            txb.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.tZt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ColorPreferenceBottomSheet.AhwBna(this.AEQbTJ, view);
                }
            });
            txb.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.tZs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ColorPreferenceBottomSheet.gEmmrt(this.EZpvd, view);
                }
            });
            txb.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tZv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ColorPreferenceBottomSheet.AYXKKw(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void OLrzqt(ColorPreferenceBottomSheet colorPreferenceBottomSheet, View view) {
        colorPreferenceBottomSheet.values();
        LifecycleOwner viewLifecycleOwner = colorPreferenceBottomSheet.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ColorPreferenceBottomSheet$initClick$1$1$1(colorPreferenceBottomSheet, null), 3, null);
    }

    public static final void AhwBna(ColorPreferenceBottomSheet colorPreferenceBottomSheet, View view) {
        colorPreferenceBottomSheet.values();
        LifecycleOwner viewLifecycleOwner = colorPreferenceBottomSheet.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ColorPreferenceBottomSheet$initClick$1$2$1(colorPreferenceBottomSheet, null), 3, null);
    }

    public static final void gEmmrt(ColorPreferenceBottomSheet colorPreferenceBottomSheet, View view) {
        colorPreferenceBottomSheet.values();
        LifecycleOwner viewLifecycleOwner = colorPreferenceBottomSheet.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ColorPreferenceBottomSheet$initClick$1$3$1(colorPreferenceBottomSheet, null), 3, null);
    }

    public static final void AYXKKw(ColorPreferenceBottomSheet colorPreferenceBottomSheet, View view) {
        colorPreferenceBottomSheet.values();
        LifecycleOwner viewLifecycleOwner = colorPreferenceBottomSheet.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ColorPreferenceBottomSheet$initClick$1$4$1(colorPreferenceBottomSheet, null), 3, null);
    }

    private final void values() {
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoading(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        FragmentKt.setFragmentResult(this, "REQUEST_UPDATE_COLOR", BundleKt.bundleOf(C56390yDp.OLrzqt("REQUEST_UPDATE_COLOR", Boolean.TRUE)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AEQbTJ = null;
    }
}
