package com.okinc.auth.impl.passkey.ui.sync.stepper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperFragment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC6497aQU;
import o.C3082AfI;
import o.C33069mpW;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56423yEv;
import o.C56524yIo;
import o.C5664aAj;
import o.C58893zTh;
import o.C8206ayP;
import o.InterfaceC56387yDm;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.account.StepOneButtonName;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeySyncStepperFragment extends AbstractC6497aQU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public C5664aAj AhwBna;
    public final int djBIcL;
    public String gEmmrt;

    @yCM
    public C58893zTh passkeyTracker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeySyncStepperFragment() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public String getTAG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.iRxXKY int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:28) call: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperFragment.<init>(int):void type: THIS */
    public /* synthetic */ PasskeySyncStepperFragment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.iRxXKY : i);
    }

    public PasskeySyncStepperFragment(int i) {
        this.djBIcL = i;
        this.gEmmrt = "PasskeySyncStepperFragment";
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeySyncStepperViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperFragment$special$$inlined$activityViewModels$default$3
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

    public final C58893zTh valueOf() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.aQU.EZpvd()V */
    public final PasskeySyncStepperViewModel EZpvd() {
        return (PasskeySyncStepperViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final PasskeySyncStepperFragment copydefault() {
            return new PasskeySyncStepperFragment(0, 1, null);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C5664aAj c5664aAjCopydefault = C5664aAj.copydefault(view);
        c5664aAjCopydefault.copydefault.setRightIconVisible(false);
        c5664aAjCopydefault.copydefault.setNavigationOnClickListener(new Function0() { // from class: o.aRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeySyncStepperFragment.AEQbTJ(this.KWHzl);
            }
        });
        C52794wYp c52794wYp = c5664aAjCopydefault.KWHzl;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        this.AhwBna = c5664aAjCopydefault;
        AhwBna();
        valueOf().AhwBna();
    }

    public static final Unit AEQbTJ(PasskeySyncStepperFragment passkeySyncStepperFragment) {
        passkeySyncStepperFragment.valueOf().KWHzl(StepOneButtonName.BACK);
        FragmentActivity activity = passkeySyncStepperFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PasskeySyncStepperFragment$observeViewModel$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new PasskeySyncStepperFragment$observeViewModel$2(this, null), 3, null);
    }

    public final void KWHzl(List<C3082AfI> list) {
        LinearLayout linearLayout;
        C5664aAj c5664aAj = this.AhwBna;
        if (c5664aAj == null || (linearLayout = c5664aAj.AEQbTJ) == null) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        linearLayout.removeAllViews();
        if (list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        for (C3082AfI c3082AfI : list) {
            View viewInflate = layoutInflaterFrom.inflate(C8206ayP.Application.fJNWhG, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(C8206ayP.StateListAnimator.isReflectionWorking);
            if (textView != null) {
                textView.setText(c3082AfI.AEQbTJ());
            }
            String strOLrzqt = OLrzqt(c3082AfI.copydefault());
            TextView textView2 = (TextView) viewInflate.findViewById(C8206ayP.StateListAnimator.gGvvIC);
            if (textView2 != null) {
                textView2.setText(C33069mpW.copydefault(this, C8206ayP.Dialog.DBxZfM, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strOLrzqt))));
            }
            linearLayout.addView(viewInflate);
        }
        pUU.KWHzl(getTAG(), "Added " + list.size() + " device items to container");
    }

    public final String OLrzqt(long j) {
        try {
            String str = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.getDefault()).format(new Date(j));
            Intrinsics.copydefault((Object) str);
            return str;
        } catch (Exception e) {
            pUU.AEQbTJ(getTAG(), "Failed to format timestamp: " + j, e);
            return "Unknown";
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ PasskeySyncStepperFragment KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, PasskeySyncStepperFragment passkeySyncStepperFragment) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = passkeySyncStepperFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.valueOf().KWHzl(StepOneButtonName.START);
                pUU.KWHzl(this.KWHzl.getTAG(), "Get Started button clicked");
                this.KWHzl.EZpvd().djBIcL();
            }
        }
    }
}
