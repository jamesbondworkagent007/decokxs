package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.mfa.ui.MfaViewModel;
import com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$initView$2;
import com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$initView$3;
import com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$initView$4;
import com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$initView$5;
import com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$initView$7;
import com.okinc.auth.impl.mfa.ui.password.VerifyPasswordViewModel;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5850aEJ extends AbstractC5844aED {
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public C5680aAz gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5850aEJ() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.DCJXGO int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:24) call: o.aEJ.<init>(int):void type: THIS */
    public /* synthetic */ C5850aEJ(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.DCJXGO : i);
    }

    public C5850aEJ(int i) {
        this.valueOf = i;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerifyPasswordViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.password.VerifyPasswordFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aED.KWHzl()V */
    public final VerifyPasswordViewModel KWHzl() {
        return (VerifyPasswordViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaViewModel AhwBna() {
        return (MfaViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C5680aAz c5680aAzCopydefault = C5680aAz.copydefault(layoutInflater, viewGroup, false);
        this.gEmmrt = c5680aAzCopydefault;
        if (c5680aAzCopydefault != null) {
            return c5680aAzCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final C5680aAz c5680aAz = this.gEmmrt;
        if (c5680aAz != null) {
            AhwBna().uzCIH();
            android.widget.LinearLayout linearLayoutAuCTel = c5680aAz.EZpvd.AuCTel();
            if (linearLayoutAuCTel != null) {
                linearLayoutAuCTel.performClick();
            }
            C55001xbh c55001xbhAkhnZx = c5680aAz.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setContentDescription(Web3SecurityTrackEvent.VALUE_INPUT);
            }
            C55001xbh c55001xbhAkhnZx2 = c5680aAz.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.aEM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C5850aEJ.KWHzl(c5680aAz, (java.lang.CharSequence) obj);
                    }
                });
            }
            android.widget.TextView textView = c5680aAz.gEmmrt;
            textView.setOnClickListener(new Activity(textView, 1000L, view, this));
            C52794wYp c52794wYp = c5680aAz.KWHzl;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this, c5680aAz));
            android.widget.TextView textView2 = c5680aAz.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(AhwBna().getFieldNames() ? 0 : 8);
        }
        C6690aUB.KWHzl(KWHzl().copydefault(), this, new VerifyPasswordFragment$initView$2(this, null));
        C6690aUB.KWHzl(KWHzl().KWHzl(), this, new VerifyPasswordFragment$initView$3(this, null));
        C6690aUB.KWHzl(KWHzl().EZpvd(), this, new VerifyPasswordFragment$initView$4(this, null));
        C6690aUB.KWHzl(KWHzl().OLrzqt(), this, new VerifyPasswordFragment$initView$5(this, null));
        view.post(new java.lang.Runnable() { // from class: o.aEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C5850aEJ.KWHzl(this.AEQbTJ);
            }
        });
        AhwBna().QfsBiF();
        C6690aUB.KWHzl(AhwBna().fetchVPNInfo(), this, new VerifyPasswordFragment$initView$7(this, null));
        VerifyPasswordViewModel verifyPasswordViewModelKWHzl = KWHzl();
        java.lang.String value = AhwBna().values().getValue();
        verifyPasswordViewModelKWHzl.OLrzqt(value != null ? value : "", AhwBna().fIwbmz());
    }

    public static final Unit KWHzl(C5680aAz c5680aAz, java.lang.CharSequence charSequence) {
        c5680aAz.KWHzl.setEnabled(charSequence != null && charSequence.length() >= 6);
        c5680aAz.EZpvd.values();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aEJ$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5850aEJ.this.AhwBna().copydefault(OTP.PASSWORD);
        }
    }

    public static final void KWHzl(C5850aEJ c5850aEJ) {
        C55019xbz c55019xbz;
        android.content.Context contextRequireContext = c5850aEJ.requireContext();
        C5680aAz c5680aAz = c5850aEJ.gEmmrt;
        C33570myu.AEQbTJ(contextRequireContext, (android.widget.EditText) ((c5680aAz == null || (c55019xbz = c5680aAz.EZpvd) == null) ? null : c55019xbz.AkhnZx()));
    }

    /* JADX INFO: renamed from: o.aEJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5850aEJ OLrzqt;
        public final /* synthetic */ C5680aAz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C5850aEJ c5850aEJ, C5680aAz c5680aAz) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c5850aEJ;
            this.copydefault = c5680aAz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                VerifyPasswordViewModel verifyPasswordViewModelKWHzl = this.OLrzqt.KWHzl();
                java.lang.String value = this.OLrzqt.AhwBna().values().getValue();
                if (value == null) {
                    value = "";
                }
                C55001xbh c55001xbhAkhnZx = this.copydefault.EZpvd.AkhnZx();
                verifyPasswordViewModelKWHzl.EZpvd(value, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), this.OLrzqt.AhwBna().DbNXlk());
                this.OLrzqt.AhwBna().zuBGHE();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEJ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5850aEJ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.view.View view2, C5850aEJ c5850aEJ) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = view2;
            this.EZpvd = c5850aEJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.post(this.EZpvd.new TaskDescription());
                this.EZpvd.AhwBna().DTwDnp();
            }
        }
    }
}
