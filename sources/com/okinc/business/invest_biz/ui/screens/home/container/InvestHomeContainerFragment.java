package com.okinc.business.invest_biz.ui.screens.home.container;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC32996moC;
import o.ActivityC26554jeX;
import o.C25493ixk;
import o.C26517jdn;
import o.C26518jdo;
import o.C27494jwJ;
import o.C27508jwX;
import o.C27569jxf;
import o.C27570jxg;
import o.C27589jxz;
import o.C43251rlk;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.iHC;
import o.iNB;
import o.iNI;
import o.rVN;
import o.xWN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeContainerFragment extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final Map<Integer, Integer> OLrzqt = C56423yEv.EZpvd(C56390yDp.OLrzqt(0, Integer.valueOf(C25493ixk.FragmentManager.DcMfJKdMCrTj)));
    public final int AEQbTJ;
    public iHC KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jdi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return InvestHomeContainerFragment.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm valueOf;

    @yCM
    public iNB viewModelFactory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Map<Integer, Integer> AEQbTJ() {
            return InvestHomeContainerFragment.OLrzqt;
        }

        public static /* synthetic */ InvestHomeContainerFragment newInstance$default(ActionBar actionBar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return actionBar.copydefault(z);
        }

        public final InvestHomeContainerFragment copydefault(boolean z) {
            InvestHomeContainerFragment investHomeContainerFragment = new InvestHomeContainerFragment();
            investHomeContainerFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("isSingleActivity", Boolean.valueOf(z))));
            return investHomeContainerFragment;
        }
    }

    public InvestHomeContainerFragment() {
        Function0 function0 = new Function0() { // from class: o.jdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeContainerFragment.AYXKKw(this.EZpvd);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C26518jdo.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.AEQbTJ = C25493ixk.Activity.gHZMYf;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jdk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeContainerFragment.djBIcL(this.AEQbTJ);
            }
        });
    }

    public final iHC AEQbTJ() {
        iHC ihc = this.KWHzl;
        if (ihc != null) {
            return ihc;
        }
        throw new IllegalStateException("binding is only available between onCreateView() and onDestroyView()".toString());
    }

    public final SharedPreferences.OnSharedPreferenceChangeListener KWHzl() {
        return (SharedPreferences.OnSharedPreferenceChangeListener) this.djBIcL.getValue();
    }

    public static final SharedPreferences.OnSharedPreferenceChangeListener gEmmrt(final InvestHomeContainerFragment investHomeContainerFragment) {
        return new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.jdh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                InvestHomeContainerFragment.KWHzl(this.AEQbTJ, sharedPreferences, str);
            }
        };
    }

    public static final void KWHzl(InvestHomeContainerFragment investHomeContainerFragment, SharedPreferences sharedPreferences, String str) {
        if (str != null && str.hashCode() == -99330082 && str.equals("tabPosition")) {
            investHomeContainerFragment.AEQbTJ().djBIcL.setCurrentItem(sharedPreferences.getInt(str, 0));
        }
    }

    public static final ViewModelProvider.Factory AYXKKw(InvestHomeContainerFragment investHomeContainerFragment) {
        return investHomeContainerFragment.valueOf();
    }

    public final C26518jdo OLrzqt() {
        return (C26518jdo) this.valueOf.getValue();
    }

    public final iNB valueOf() {
        iNB inb = this.viewModelFactory;
        if (inb != null) {
            return inb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean djBIcL() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isSingleActivity", false);
        }
        return false;
    }

    public final C26517jdn copydefault() {
        return (C26517jdn) this.copydefault.getValue();
    }

    public static final C26517jdn djBIcL(InvestHomeContainerFragment investHomeContainerFragment) {
        return new C26517jdn(investHomeContainerFragment);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = iHC.KWHzl(view);
        EZpvd(AEQbTJ());
        OLrzqt(AEQbTJ());
        AEQbTJ(AEQbTJ());
        SPUtils.registerOnSPChangeListener("InvestHomeContainerFragment", KWHzl());
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        iNI.KWHzl(context).copydefault(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        SharedPreferences sharedPreferences;
        this.KWHzl = null;
        Context context = getContext();
        if (context != null && (sharedPreferences = context.getSharedPreferences("InvestHomeContainerFragment", 0)) != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(KWHzl());
        }
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C27494jwJ.AEQbTJ.EZpvd(this, new Function0() { // from class: o.jde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestHomeContainerFragment.AhwBna(this.OLrzqt);
            }
        });
        C27589jxz.collectOnViewLifecycle$default(this, OLrzqt().copydefault(), null, new TaskDescription(), 2, null);
    }

    public static final Unit AhwBna(InvestHomeContainerFragment investHomeContainerFragment) {
        investHomeContainerFragment.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OLrzqt(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            ImageView imageView = InvestHomeContainerFragment.this.AEQbTJ().copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(z ^ true ? 0 : 8);
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(iHC ihc) {
        ImageView imageView = ihc.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(djBIcL() ? 0 : 8);
        ihc.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jdm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestHomeContainerFragment.EZpvd(this.AEQbTJ, view);
            }
        });
        TextView textView = ihc.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(djBIcL() ? 0 : 8);
        TextView textView2 = ihc.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(djBIcL() ^ true ? 0 : 8);
    }

    public static final void EZpvd(InvestHomeContainerFragment investHomeContainerFragment, View view) {
        investHomeContainerFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public final void OLrzqt(iHC ihc) {
        ihc.djBIcL.setAdapter(copydefault());
        ihc.djBIcL.setOffscreenPageLimit(OLrzqt.size());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        ViewPager2 viewPager2 = ihc.djBIcL;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        c27569jxf.EZpvd(viewPager2);
        Integer num = SPUtils.getInt("tabPosition", 0, "InvestHomeContainerFragment");
        ViewPager2 viewPager22 = ihc.djBIcL;
        Intrinsics.copydefault(num);
        viewPager22.setCurrentItem(num.intValue(), false);
        ihc.djBIcL.registerOnPageChangeCallback(new Application());
    }

    public static final class Application extends ViewPager2.OnPageChangeCallback {
        public Application() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            SPUtils.put("tabPosition", Integer.valueOf(i), "InvestHomeContainerFragment");
            ImageView imageView = InvestHomeContainerFragment.this.AEQbTJ().copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(InvestHomeContainerFragment.this.OLrzqt().copydefault().getValue().booleanValue() ^ true ? 0 : 8);
        }
    }

    public final void AEQbTJ(iHC ihc) {
        ImageView imageView = ihc.KWHzl;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        ImageView imageView2 = ihc.copydefault;
        imageView2.setOnClickListener(new Activity(imageView2, 1000L, this));
        AYXKKw();
    }

    public final void AYXKKw() {
        iHC ihcAEQbTJ = AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestHomeContainerFragment$updateActionButtons$1$1(this, ihcAEQbTJ, null), 3, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ InvestHomeContainerFragment KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, InvestHomeContainerFragment investHomeContainerFragment) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = investHomeContainerFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.KWHzl("search_bar");
                ActivityC26554jeX.StateListAnimator stateListAnimator = ActivityC26554jeX.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                stateListAnimator.copydefault(fragmentActivityRequireActivity);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ InvestHomeContainerFragment KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, InvestHomeContainerFragment investHomeContainerFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = investHomeContainerFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ImageView imageView = (ImageView) this.OLrzqt;
                this.KWHzl.KWHzl("order_history_icon");
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c27508jwX.OLrzqt(context);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jxg.investEvent$default(java.lang.String, com.okinc.components.track.TrackChannel[], kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final String str) {
        C27570jxg.investEvent$default("YieldHome_Header_Button_Click", null, new Function1() { // from class: o.jdd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestHomeContainerFragment.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestHomeContainerFragment$updateTabVisibilityOnWalletChange$1(this, null), 3, null);
        AYXKKw();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
    }
}
