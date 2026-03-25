package o;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$Companion$show$1;
import com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$onFooterCreated$2$2;
import com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$onFooterCreated$3;
import com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$onViewCreated$2$2;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C52761wXj;
import o.InterfaceC8224ayh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tAB extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public tNP AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public final boolean OLrzqt;
    public OrbitBeanResp copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    public final Function1<java.lang.Boolean, Unit> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.Boolean, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull FragmentActivity fragmentActivity, android.view.View view, boolean z, Function1<? super kotlin.Pair<java.lang.Boolean, java.lang.String>, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OrbitUpgradeBottomSheet$Companion$show$1(fragmentActivity, function1, z, view, null), 3, null);
        }
    }

    public tAB() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tAH.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$special$$inlined$viewModels$default$5
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
        this.OLrzqt = true;
    }

    public final tAH EZpvd() {
        return (tAH) this.valueOf.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.copydefault = C46388tSm.Companion.KWHzl().EZpvd();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.AEQbTJ = tNP.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.graphics.drawable.Drawable drawableMutate;
        CardView cardView;
        android.widget.TextView textView;
        android.widget.ProgressBar progressBar;
        android.widget.TextView textView2;
        android.widget.ProgressBar progressBar2;
        android.widget.ProgressBar progressBar3;
        CardView cardView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.lang.String strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.gtdfxv, C56423yEv.EZpvd(C56390yDp.OLrzqt("postContent", C33070mpX.AYXKKw(C47501trL.Fragment.DKtBnz))));
        tNP tnp = this.AEQbTJ;
        if (tnp != null && (textView7 = tnp.djBIcL) != null) {
            textView7.setText(strCopydefault);
        }
        java.lang.String strCopydefault2 = C33069mpW.copydefault(C47501trL.Fragment.gwwfep, C56423yEv.EZpvd(C56390yDp.OLrzqt("createGroups", C33070mpX.AYXKKw(C47501trL.Fragment.hrjNmC))));
        tNP tnp2 = this.AEQbTJ;
        if (tnp2 != null && (textView6 = tnp2.valueOf) != null) {
            textView6.setText(strCopydefault2);
        }
        java.lang.String strCopydefault3 = C33069mpW.copydefault(C47501trL.Fragment.cBPFI, C56423yEv.EZpvd(C56390yDp.OLrzqt("shareTrades", C33070mpX.AYXKKw(C47501trL.Fragment.iKEqwx))));
        tNP tnp3 = this.AEQbTJ;
        if (tnp3 != null && (textView5 = tnp3.gEmmrt) != null) {
            textView5.setText(strCopydefault3);
        }
        tNP tnp4 = this.AEQbTJ;
        if (tnp4 != null && (textView4 = tnp4.OLrzqt) != null) {
            textView4.setOnClickListener(new StateListAnimator(textView4, 1000L, this));
        }
        tNP tnp5 = this.AEQbTJ;
        if (tnp5 != null && (textView3 = tnp5.AhwBna) != null) {
            textView3.setVisibility(C46437tUh.OLrzqt.AEQbTJ() ? 0 : 8);
        }
        OrbitBeanResp orbitBeanResp = this.copydefault;
        if (orbitBeanResp != null) {
            if (Intrinsics.EZpvd(orbitBeanResp.getNeedBalanceVerification(), java.lang.Boolean.TRUE)) {
                C32866mlf.onEvent$default("Orbit_Upgrade_View_View", (TrackChannel[]) null, new Function1() { // from class: o.tAA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return tAB.AEQbTJ((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                tNP tnp6 = this.AEQbTJ;
                if (tnp6 != null && (cardView2 = tnp6.EZpvd) != null) {
                    cardView2.setVisibility(0);
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OrbitUpgradeBottomSheet$onViewCreated$2$2(orbitBeanResp, this, null), 3, null);
                tNP tnp7 = this.AEQbTJ;
                if (tnp7 != null && (progressBar3 = tnp7.copydefault) != null) {
                    progressBar3.setMax(C33129mqd.AhwBna(java.lang.Float.valueOf(C33129mqd.djBIcL(orbitBeanResp.getTargetBalance()) * 100)));
                }
                if (C33129mqd.djBIcL(orbitBeanResp.getBalance()) < C33129mqd.djBIcL(orbitBeanResp.getTargetBalance())) {
                    tNP tnp8 = this.AEQbTJ;
                    if (tnp8 != null && (progressBar2 = tnp8.copydefault) != null) {
                        progressBar2.setProgress(C33129mqd.AhwBna(java.lang.Float.valueOf(C33129mqd.djBIcL(orbitBeanResp.getBalance()) * 100)));
                    }
                    tNP tnp9 = this.AEQbTJ;
                    if (tnp9 != null && (textView2 = tnp9.OLrzqt) != null) {
                        textView2.setVisibility(0);
                    }
                } else {
                    tNP tnp10 = this.AEQbTJ;
                    if (tnp10 != null && (progressBar = tnp10.copydefault) != null) {
                        progressBar.setProgress(C33129mqd.AhwBna(java.lang.Float.valueOf(C33129mqd.djBIcL(orbitBeanResp.getTargetBalance()) * 100)));
                    }
                    tNP tnp11 = this.AEQbTJ;
                    if (tnp11 != null && (textView = tnp11.OLrzqt) != null) {
                        textView.setVisibility(8);
                    }
                }
            } else {
                C32866mlf.onEvent$default("Orbit_Upgrade_View_View", (TrackChannel[]) null, new Function1() { // from class: o.tAz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return tAB.OLrzqt((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                tNP tnp12 = this.AEQbTJ;
                if (tnp12 != null && (cardView = tnp12.EZpvd) != null) {
                    cardView.setVisibility(8);
                }
            }
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C47501trL.ActionBar.AubY);
        if (drawableKWHzl != null && (drawableMutate = drawableKWHzl.mutate()) != null) {
            drawableMutate.setAlpha(102);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new android.graphics.drawable.Drawable[]{background, drawableKWHzl});
        layerDrawable.setLayerGravity(1, 55);
        view.setBackground(layerDrawable);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ tAB EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, tAB tab) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = tab;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_Upgrade_UpgradeAddFunds_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                InterfaceC8224ayh.TaskDescription.goToDeposit$default(interfaceC8224ayh, fragmentActivityRequireActivity, new DepositEntryPoint.SelectMethods(new DepositEntryPoint.P2P(true), null, yDY.gEmmrt(DepositEntryPoint.Option.DepositCrypto, DepositEntryPoint.Option.DepositCash, DepositEntryPoint.Option.P2P, DepositEntryPoint.Option.Buy), null, null, null, 58, null), null, null, null, null, 60, null);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ wYF AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ tAB OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, tAB tab, wYF wyf) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = tab;
            this.AEQbTJ = wyf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_Upgrade_UpgradeButton_Click", (TrackChannel[]) null, this.OLrzqt.new Application(), 1, (java.lang.Object) null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new OrbitUpgradeBottomSheet$onFooterCreated$2$2(this.AEQbTJ, this.OLrzqt, null), 3, null);
            }
        }
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "conditional", true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "unconditional", true);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setVisibility(0);
        wyf.setType(5);
        OrbitBeanResp orbitBeanResp = this.copydefault;
        if (orbitBeanResp != null) {
            if (!Intrinsics.EZpvd(orbitBeanResp.getNeedBalanceVerification(), java.lang.Boolean.TRUE)) {
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setEnabled(true);
                }
            } else if (C33129mqd.djBIcL(orbitBeanResp.getBalance()) < C33129mqd.djBIcL(orbitBeanResp.getTargetBalance())) {
                C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setEnabled(false);
                }
            } else {
                C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
                if (c52794wYpCopydefault3 != null) {
                    c52794wYpCopydefault3.setEnabled(true);
                }
            }
        }
        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
        if (c52794wYpCopydefault4 != null) {
            c52794wYpCopydefault4.setOKDSType(257);
        }
        wyf.setPrimaryText(C33070mpX.AYXKKw(C47501trL.Fragment.zzQwtT));
        C52794wYp c52794wYpCopydefault5 = wyf.copydefault();
        if (c52794wYpCopydefault5 != null) {
            c52794wYpCopydefault5.setOnClickListener(new TaskDescription(c52794wYpCopydefault5, 1000L, this, wyf));
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OrbitUpgradeBottomSheet$onFooterCreated$3(this, null), 3, null);
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            OrbitBeanResp orbitBeanResp = tAB.this.copydefault;
            eventParamsList.put("type", (orbitBeanResp == null || !Intrinsics.EZpvd(orbitBeanResp.getNeedBalanceVerification(), java.lang.Boolean.TRUE)) ? "unconditional" : "conditional", true);
        }
    }
}
