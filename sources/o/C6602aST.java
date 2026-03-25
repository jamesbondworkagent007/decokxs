package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import com.okinc.account.api.model.security.otp.OtpInputType;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel;
import com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$initView$4;
import com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faViewModel;
import com.okinc.auth.impl.twofactorauth.ui.TwoFactorAuthViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC6659aTX;
import o.AbstractC6733aUt;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aST, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6602aST extends AbstractC6600aSR {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public java.lang.String isConnected;
    public AbstractC8294azy valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.aST$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.zLjUOn;
    }

    public C6602aST() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ResetMfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(Rebind2faViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$7
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TwoFactorAuthViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$viewModels$default$10
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C6714aUa.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.linknewmfa.Rebind2faFragment$special$$inlined$activityViewModels$default$6
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.aSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6602aST.isConnected(this.KWHzl);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aSY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6602aST.AkhnZx(this.KWHzl);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6602aST.values(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.aST$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aST.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final ResetMfaViewModel AhwBna() {
        return (ResetMfaViewModel) this.AhwBna.getValue();
    }

    public final Rebind2faViewModel isConnected() {
        return (Rebind2faViewModel) this.values.getValue();
    }

    public final TwoFactorAuthViewModel values() {
        return (TwoFactorAuthViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: renamed from: o.aST$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            android.widget.ImageView imageView;
            OKEditText oKEditText;
            android.text.Editable text;
            AbstractC8294azy abstractC8294azy = C6602aST.this.valueOf;
            boolean z = (abstractC8294azy == null || (oKEditText = abstractC8294azy.OLrzqt) == null || (text = oKEditText.getText()) == null || text.length() <= 0) ? false : true;
            AbstractC8294azy abstractC8294azy2 = C6602aST.this.valueOf;
            if (abstractC8294azy2 != null && (imageView = abstractC8294azy2.AEQbTJ) != null) {
                imageView.setVisibility(z ? 0 : 8);
            }
            C6714aUa c6714aUaAYXKKw = C6602aST.this.AYXKKw();
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            c6714aUaAYXKKw.AhwBna(string);
        }
    }

    /* JADX INFO: renamed from: o.aST$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C6714aUa c6714aUaAYXKKw = C6602aST.this.AYXKKw();
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            c6714aUaAYXKKw.djBIcL(string);
        }
    }

    public final C6714aUa AYXKKw() {
        return (C6714aUa) this.DbNXlk.getValue();
    }

    public final java.lang.String DbNXlk() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public static final java.lang.String isConnected(C6602aST c6602aST) {
        java.lang.String string;
        android.os.Bundle arguments = c6602aST.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_TOKEN")) == null) ? "" : string;
    }

    public final RebindMfaEntryPoint gEmmrt() {
        return (RebindMfaEntryPoint) this.gEmmrt.getValue();
    }

    public static final RebindMfaEntryPoint AkhnZx(C6602aST c6602aST) {
        android.os.Bundle arguments = c6602aST.getArguments();
        RebindMfaEntryPoint rebindMfaEntryPoint = arguments != null ? (RebindMfaEntryPoint) arguments.getParcelable("KEY_ENTRY_POINT") : null;
        RebindMfaEntryPoint rebindMfaEntryPoint2 = rebindMfaEntryPoint instanceof RebindMfaEntryPoint ? rebindMfaEntryPoint : null;
        return rebindMfaEntryPoint2 == null ? RebindMfaEntryPoint.PostLogin.INSTANCE : rebindMfaEntryPoint2;
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String values(C6602aST c6602aST) {
        java.lang.String string;
        android.os.Bundle arguments = c6602aST.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_USER_ID")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new FragmentManager());
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("AccountReset2fa_SetNew2fa_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.aST$FragmentManager */
    public static final class FragmentManager extends OnBackPressedCallback {
        public FragmentManager() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("Reset2FA_BacktoPreviousPage_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
            NavHostFragment.Companion.findNavController(C6602aST.this).navigateUp();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C6695aUG c6695aUG;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC8294azy abstractC8294azy = (AbstractC8294azy) DataBindingUtil.bind(view);
        this.valueOf = abstractC8294azy;
        if (abstractC8294azy != null) {
            abstractC8294azy.EZpvd.setNavigationOnClickListener(new Function0() { // from class: o.aSQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6602aST.DbNXlk(this.AEQbTJ);
                }
            });
            C6695aUG c6695aUG2 = abstractC8294azy.valueOf;
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c6695aUG2.KWHzl(parentFragmentManager, viewLifecycleOwner, new Function0() { // from class: o.aTb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6602aST.djBIcL();
                }
            });
            abstractC8294azy.OLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.aTi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view2, boolean z) {
                    C6602aST.EZpvd(this.AEQbTJ, view2, z);
                }
            });
            OKEditText oKEditText = abstractC8294azy.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            oKEditText.addTextChangedListener(new ActionBar());
            AbstractC8294azy abstractC8294azy2 = this.valueOf;
            if (abstractC8294azy2 != null && (c6695aUG = abstractC8294azy2.valueOf) != null) {
                c6695aUG.setOnChangeCallback(new Function1() { // from class: o.aTf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C6602aST.OLrzqt(this.EZpvd, (java.lang.String) obj);
                    }
                });
            }
            android.widget.ImageView imageView = abstractC8294azy.AEQbTJ;
            imageView.setOnClickListener(new Application(imageView, 1000L, abstractC8294azy));
            C55001xbh c55001xbhAkhnZx = abstractC8294azy.copydefault.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setInputType(32);
            }
            C55001xbh c55001xbhAkhnZx2 = abstractC8294azy.copydefault.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.addTextChangedListener(new StateListAnimator());
            }
            C55001xbh c55001xbhAkhnZx3 = abstractC8294azy.copydefault.AkhnZx();
            if (c55001xbhAkhnZx3 != null) {
                c55001xbhAkhnZx3.setContentDescription(Web3SecurityTrackEvent.VALUE_INPUT);
            }
            C52794wYp c52794wYp = abstractC8294azy.KWHzl;
            c52794wYp.setOnClickListener(new Fragment(c52794wYp, 1000L, this));
            abstractC8294azy.copydefault.setLabelText(C33070mpX.AYXKKw(C8206ayP.Dialog.RkASWs));
            abstractC8294azy.copydefault.setHintText(getString(C8206ayP.Dialog.OLrzqt));
        }
        Rebind2faViewModel rebind2faViewModelIsConnected = isConnected();
        rebind2faViewModelIsConnected.AYXKKw().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.aTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        rebind2faViewModelIsConnected.AEQbTJ().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.aTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        rebind2faViewModelIsConnected.copydefault().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.aTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.EZpvd(this.AEQbTJ, (OtpInputType) obj);
            }
        }));
        rebind2faViewModelIsConnected.OLrzqt().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.aSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        AYXKKw().hDKMBd().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.aSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.djBIcL(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle(values().EZpvd(), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), new Rebind2faFragment$initView$4(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
        getChildFragmentManager().setFragmentResultListener("requestKeyNewPhoneSendClick", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C6602aST.copydefault(str, bundle2);
            }
        });
        getChildFragmentManager().setFragmentResultListener("requestKeyNewEmailSendClick", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C6602aST.AEQbTJ(str, bundle2);
            }
        });
        getChildFragmentManager().setFragmentResultListener("requestKeyNewPhoneTryOtherWayClick", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C6602aST.gEmmrt(str, bundle2);
            }
        });
    }

    public static final Unit DbNXlk(final C6602aST c6602aST) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Reset2FABindNew_Account_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.copydefault(this.copydefault, (EventParamsList) obj);
            }
        });
        FragmentActivity activity = c6602aST.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C6602aST c6602aST, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "back", false, 4, null);
        java.lang.String str = c6602aST.isConnected;
        if (str == null) {
            str = "email";
        }
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FA_CountryCodeDropdown_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C6602aST c6602aST, android.view.View view, boolean z) {
        android.widget.LinearLayout linearLayout;
        AbstractC8294azy abstractC8294azy = c6602aST.valueOf;
        if (abstractC8294azy == null || (linearLayout = abstractC8294azy.AhwBna) == null) {
            return;
        }
        linearLayout.setSelected(z);
    }

    public static final Unit OLrzqt(C6602aST c6602aST, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c6602aST.AYXKKw().gEmmrt(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aST$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM, false, 4, null);
            java.lang.String str = C6602aST.this.isConnected;
            if (str == null) {
                str = "email";
            }
            EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.aST$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC8294azy OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC8294azy abstractC8294azy) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = abstractC8294azy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt.setText("");
            }
        }
    }

    /* JADX INFO: renamed from: o.aST$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C6602aST OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C6602aST c6602aST) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c6602aST;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(android.view.View view) {
            C55008xbo c55008xbo;
            C55001xbh c55001xbhAkhnZx;
            android.text.Editable text;
            OKEditText oKEditText;
            android.text.Editable text2;
            java.lang.String string;
            C6695aUG c6695aUG;
            java.lang.String str;
            C55008xbo c55008xbo2;
            C55001xbh c55001xbhAkhnZx2;
            android.text.Editable text3;
            OKEditText oKEditText2;
            android.text.Editable text4;
            java.lang.String string2;
            C6695aUG c6695aUG2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("Reset2FABindNew_Account_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), this.OLrzqt.new TaskDescription());
                java.lang.String string3 = null;
                if (this.OLrzqt.gEmmrt() instanceof RebindMfaEntryPoint.ForgetPassword) {
                    RebindMfaEntryPoint rebindMfaEntryPointGEmmrt = this.OLrzqt.gEmmrt();
                    Intrinsics.copydefault(rebindMfaEntryPointGEmmrt, "");
                    java.lang.String loginName = ((RebindMfaEntryPoint.ForgetPassword) rebindMfaEntryPointGEmmrt).getLoginName();
                    if (loginName == null || !C6982aZe.KWHzl(loginName)) {
                        RebindMfaEntryPoint rebindMfaEntryPointGEmmrt2 = this.OLrzqt.gEmmrt();
                        Intrinsics.copydefault(rebindMfaEntryPointGEmmrt2, "");
                        java.lang.String areaCode = ((RebindMfaEntryPoint.ForgetPassword) rebindMfaEntryPointGEmmrt2).getAreaCode();
                        str = areaCode == null ? "" : areaCode;
                    }
                    TwoFactorAuthViewModel twoFactorAuthViewModelValues = this.OLrzqt.values();
                    java.lang.String strDbNXlk = this.OLrzqt.DbNXlk();
                    AbstractC8294azy abstractC8294azy = this.OLrzqt.valueOf;
                    java.lang.String strOLrzqt = (abstractC8294azy == null || (c6695aUG2 = abstractC8294azy.valueOf) == null) ? null : c6695aUG2.OLrzqt();
                    java.lang.String str2 = strOLrzqt == null ? "" : strOLrzqt;
                    AbstractC8294azy abstractC8294azy2 = this.OLrzqt.valueOf;
                    java.lang.String str3 = (abstractC8294azy2 == null || (oKEditText2 = abstractC8294azy2.OLrzqt) == null || (text4 = oKEditText2.getText()) == null || (string2 = text4.toString()) == null) ? "" : string2;
                    java.lang.String strAhwBna = this.OLrzqt.AYXKKw().AhwBna();
                    AbstractC8294azy abstractC8294azy3 = this.OLrzqt.valueOf;
                    if (abstractC8294azy3 != null && (c55008xbo2 = abstractC8294azy3.copydefault) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null && (text3 = c55001xbhAkhnZx2.getText()) != null) {
                        string3 = text3.toString();
                    }
                    java.lang.String str4 = string3 == null ? "" : string3;
                    java.lang.String strOLrzqt2 = this.OLrzqt.AYXKKw().OLrzqt();
                    RebindMfaEntryPoint rebindMfaEntryPointGEmmrt3 = this.OLrzqt.gEmmrt();
                    Intrinsics.copydefault(rebindMfaEntryPointGEmmrt3, "");
                    java.lang.String loginName2 = ((RebindMfaEntryPoint.ForgetPassword) rebindMfaEntryPointGEmmrt3).getLoginName();
                    twoFactorAuthViewModelValues.OLrzqt(strDbNXlk, str2, str3, strAhwBna, str4, strOLrzqt2, str, loginName2 == null ? "" : loginName2);
                    return;
                }
                TwoFactorAuthViewModel twoFactorAuthViewModelValues2 = this.OLrzqt.values();
                java.lang.String strDbNXlk2 = this.OLrzqt.DbNXlk();
                AbstractC8294azy abstractC8294azy4 = this.OLrzqt.valueOf;
                java.lang.String strOLrzqt3 = (abstractC8294azy4 == null || (c6695aUG = abstractC8294azy4.valueOf) == null) ? null : c6695aUG.OLrzqt();
                java.lang.String str5 = strOLrzqt3 == null ? "" : strOLrzqt3;
                AbstractC8294azy abstractC8294azy5 = this.OLrzqt.valueOf;
                java.lang.String str6 = (abstractC8294azy5 == null || (oKEditText = abstractC8294azy5.OLrzqt) == null || (text2 = oKEditText.getText()) == null || (string = text2.toString()) == null) ? "" : string;
                java.lang.String strAhwBna2 = this.OLrzqt.AYXKKw().AhwBna();
                AbstractC8294azy abstractC8294azy6 = this.OLrzqt.valueOf;
                if (abstractC8294azy6 != null && (c55008xbo = abstractC8294azy6.copydefault) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null && (text = c55001xbhAkhnZx.getText()) != null) {
                    string3 = text.toString();
                }
                twoFactorAuthViewModelValues2.EZpvd(strDbNXlk2, str5, str6, strAhwBna2, string3 == null ? "" : string3, this.OLrzqt.AYXKKw().OLrzqt());
            }
        }
    }

    public static final Unit copydefault(C6602aST c6602aST, java.lang.Boolean bool) {
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        AbstractC8294azy abstractC8294azy = c6602aST.valueOf;
        if (abstractC8294azy != null && (textView = abstractC8294azy.gEmmrt) != null) {
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        AbstractC8294azy abstractC8294azy2 = c6602aST.valueOf;
        if (abstractC8294azy2 != null && (linearLayout = abstractC8294azy2.AhwBna) != null) {
            linearLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C6602aST c6602aST, java.lang.Boolean bool) {
        C55008xbo c55008xbo;
        AbstractC8294azy abstractC8294azy = c6602aST.valueOf;
        if (abstractC8294azy != null && (c55008xbo = abstractC8294azy.copydefault) != null) {
            c55008xbo.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C6602aST c6602aST, OtpInputType otpInputType) {
        AbstractC6733aUt pendingIntent;
        java.lang.String str;
        C6714aUa c6714aUaAYXKKw = c6602aST.AYXKKw();
        if (c6602aST.gEmmrt() instanceof RebindMfaEntryPoint.ForgetPassword) {
            pendingIntent = new AbstractC6733aUt.Application(null, c6602aST.DbNXlk(), null, null, null, null, 61, null);
        } else {
            pendingIntent = new AbstractC6733aUt.PendingIntent(null, c6602aST.DbNXlk(), null, null, c6602aST.valueOf(), 13, null);
        }
        c6714aUaAYXKKw.EZpvd(pendingIntent);
        C6714aUa.initDisplayList$default(c6602aST.AYXKKw(), 3152, null, otpInputType, yDY.gEmmrt(new AbstractC6659aTX.TaskDescription(C8206ayP.Dialog.gEmmrt, 0, C8206ayP.Dialog.OLrzqt, 0, 0, 0, 0, 0, 0, 0, false, 0, false, false, 0, null, null, 131066, null), new AbstractC6659aTX.Activity(C8206ayP.Dialog.EZpvd, 0, C8206ayP.Dialog.OLrzqt, 0, null, null, 58, null), new AbstractC6659aTX.ActionBar(0, 0, 0, 0, 15, null)), 2, null);
        java.lang.Integer numValueOf = otpInputType != null ? java.lang.Integer.valueOf(otpInputType.getType()) : null;
        int iOrdinal = OtpInputType.EMAIL_ONLY.ordinal();
        if (numValueOf != null && numValueOf.intValue() == iOrdinal) {
            str = "email";
        } else {
            str = (numValueOf != null && numValueOf.intValue() == OtpInputType.SMS_ONLY.ordinal()) ? HintConstants.AUTOFILL_HINT_PHONE : "phoneandemail";
        }
        c6602aST.isConnected = str;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Reset2FABindNew_Account_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6602aST.KWHzl(this.copydefault, (EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C6602aST c6602aST, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str = c6602aST.isConnected;
        if (str == null) {
            str = "email";
        }
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C6602aST c6602aST, kotlin.Pair pair) {
        android.widget.TextView textView;
        AbstractC8294azy abstractC8294azy = c6602aST.valueOf;
        if (abstractC8294azy != null && (textView = abstractC8294azy.djBIcL) != null) {
            textView.setText((java.lang.CharSequence) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C6602aST c6602aST, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        AbstractC8294azy abstractC8294azy = c6602aST.valueOf;
        if (abstractC8294azy != null && (c52794wYp = abstractC8294azy.KWHzl) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FA_ResendPhoneOTP_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FA_ResendEmailOTP_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public static final void gEmmrt(java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FA_TryAnotherWay_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isConnected = null;
        this.valueOf = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AYXKKw().getNewProxyInstance();
        AYXKKw().djBIcL("");
        super.onDestroy();
    }
}
