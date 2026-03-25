package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$setupObservers$1$1;
import com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$setupObservers$1$2;
import com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C52761wXj;
import o.oHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34323nZs extends AbstractC34316nZl {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public C33934nLg AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public nJY gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.DLWbHP;
    }

    public C34323nZs() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MembershipSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsFragment$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.nZl.KWHzl()V */
    public final MembershipSettingsViewModel KWHzl() {
        return (MembershipSettingsViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJY njyEZpvd = nJY.EZpvd(layoutInflater, viewGroup, false);
        this.gEmmrt = njyEZpvd;
        if (njyEZpvd == null) {
            Intrinsics.gEmmrt("");
            njyEZpvd = null;
        }
        android.widget.LinearLayout linearLayoutEZpvd = njyEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(linearLayoutEZpvd, "");
        return linearLayoutEZpvd;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna();
        AYXKKw();
        KWHzl().copydefault();
    }

    private final void AYXKKw() {
        C33934nLg c33934nLgAEQbTJ = C33934nLg.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c33934nLgAEQbTJ, "");
        c33934nLgAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nZr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34323nZs.copydefault(this.OLrzqt, view);
            }
        });
        this.AYXKKw = c33934nLgAEQbTJ;
        final nJY njy = this.gEmmrt;
        C33934nLg c33934nLg = null;
        if (njy == null) {
            Intrinsics.gEmmrt("");
            njy = null;
        }
        C55001xbh c55001xbh = njy.djBIcL;
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.nZq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C34323nZs.OLrzqt(njy, view, z);
            }
        });
        Intrinsics.copydefault(c55001xbh);
        c55001xbh.addTextChangedListener(new StateListAnimator(njy, this));
        C52794wYp c52794wYp = njy.isConnected;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C55173xeu c55173xeu = njy.copydefault;
        java.lang.String string = c55173xeu.getContext().getString(C35399nuc.LoaderManager.djBIcL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.nZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34323nZs.OLrzqt(this.OLrzqt, view);
            }
        });
        android.widget.FrameLayout frameLayout = njy.valueOf;
        frameLayout.removeAllViews();
        C33934nLg c33934nLg2 = this.AYXKKw;
        if (c33934nLg2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33934nLg = c33934nLg2;
        }
        frameLayout.addView(c33934nLg.getRoot());
    }

    public static final void copydefault(C34323nZs c34323nZs, android.view.View view) {
        pUU.KWHzl(c34323nZs.getTAG(), "Filter chip clicked");
    }

    public static final void OLrzqt(nJY njy, android.view.View view, boolean z) {
        if (z) {
            njy.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            njy.EZpvd.setError(false);
            android.widget.ScrollView scrollView = njy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            android.view.ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ActionBar(viewTreeObserver, scrollView, njy));
        }
    }

    /* JADX INFO: renamed from: o.nZs$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ nJY AEQbTJ;
        public final /* synthetic */ C34323nZs copydefault;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(nJY njy, C34323nZs c34323nZs) {
            this.AEQbTJ = njy;
            this.copydefault = c34323nZs;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.copydefault.KWHzl().copydefault(C59443zhD.AuCTel(this.AEQbTJ.djBIcL.isConnected()));
        }
    }

    /* JADX INFO: renamed from: o.nZs$Activity */
    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            MembershipSettingsViewModel membershipSettingsViewModelKWHzl = C34323nZs.this.KWHzl();
            nJY njy = C34323nZs.this.gEmmrt;
            if (njy == null) {
                Intrinsics.gEmmrt("");
                njy = null;
            }
            membershipSettingsViewModelKWHzl.OLrzqt(njy.djBIcL.isConnected());
            nJY njy2 = C34323nZs.this.gEmmrt;
            if (njy2 == null) {
                Intrinsics.gEmmrt("");
                njy2 = null;
            }
            njy2.djBIcL.setEnabled(false);
            C52794wYp.startLoading$default(njy2.isConnected, 0L, 1, null);
        }
    }

    public static final void OLrzqt(C34323nZs c34323nZs, android.view.View view) {
        pUU.EZpvd(c34323nZs.getTAG(), "Retry button clicked");
        c34323nZs.KWHzl().copydefault();
    }

    private final void AhwBna() {
        MembershipSettingsViewModel membershipSettingsViewModelKWHzl = KWHzl();
        StateFlow<MembershipSettingsViewModel.ActionBar> stateFlowOLrzqt = membershipSettingsViewModelKWHzl.OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowOLrzqt, viewLifecycleOwner, (Lifecycle.State) null, new MembershipSettingsFragment$setupObservers$1$1(this, null), 2, (java.lang.Object) null);
        SharedFlow<MembershipSettingsViewModel.Activity> sharedFlowKWHzl = membershipSettingsViewModelKWHzl.KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowKWHzl, viewLifecycleOwner2, (Lifecycle.State) null, new MembershipSettingsFragment$setupObservers$1$2(this, null), 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nZs$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ nJY OLrzqt;
        public final /* synthetic */ android.view.ViewTreeObserver copydefault;

        public ActionBar(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, nJY njy) {
            this.copydefault = viewTreeObserver;
            this.EZpvd = view;
            this.OLrzqt = njy;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.copydefault.isAlive() ? this.copydefault : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.OLrzqt.AkhnZx.fullScroll(130);
        }
    }

    /* JADX INFO: renamed from: o.nZs$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C34323nZs AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C34323nZs c34323nZs) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c34323nZs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                oHT.ActionBar actionBar = oHT.Companion;
                java.lang.String string = this.AEQbTJ.getString(C35399nuc.LoaderManager.zAGdSp);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = this.AEQbTJ.getString(C35399nuc.LoaderManager.znKlvJ);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                oHT ohtNewInstance$default = oHT.ActionBar.newInstance$default(actionBar, string, string2, null, 4, null);
                ohtNewInstance$default.copydefault(this.AEQbTJ.new Activity());
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                ohtNewInstance$default.show(parentFragmentManager);
            }
        }
    }

    public final void copydefault(boolean z, boolean z2) {
        int iCopydefault;
        nJY njy = this.gEmmrt;
        if (njy == null) {
            Intrinsics.gEmmrt("");
            njy = null;
        }
        njy.isConnected.setEnabled(z2);
        android.widget.TextView textView = njy.gEmmrt;
        if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DQzvGN);
        }
        textView.setTextColor(iCopydefault);
        njy.EZpvd.setError(!z);
    }

    /* JADX INFO: renamed from: o.nZs$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34323nZs EZpvd(long j) {
            C34323nZs c34323nZs = new C34323nZs();
            c34323nZs.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("GROUP_ID", java.lang.Long.valueOf(j))));
            return c34323nZs;
        }
    }
}
