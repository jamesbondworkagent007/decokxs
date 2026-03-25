package o;

import android.view.View;
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
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
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.material.button.MaterialButton;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
import com.okinc.auth.api.passkey.PasskeyRegisterConfig;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$19$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$2$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$22$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$3$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$4$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$5$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$initView$9$1;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolViewModel;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C6019aHT;
import o.C6020aHU;
import o.C8206ayP;
import o.InterfaceC8196ayF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aAO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5643aAO extends AbstractC5641aAM {
    public final InterfaceC56387yDm AYXKKw;
    public C8289azt AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt = C8206ayP.Application.AubY;
    public java.lang.String valueOf = "PasskeyDebugToolFragment";

    /* JADX INFO: renamed from: o.aAO$ActionBar */
    /* JADX INFO: loaded from: classes22.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyDebugTool.PasskeyVersionStatus.values().length];
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO1_V1_V2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_INCOMPATIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[PasskeyDebugTool.PasskeyDebugSdk.values().length];
            try {
                iArr2[PasskeyDebugTool.PasskeyDebugSdk.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[PasskeyDebugTool.PasskeyDebugSdk.DEBUG_ONLY_FORCE_FIDO2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[PasskeyDebugTool.PasskeyDebugSdk.DEBUG_ONLY_FORCE_CRED_MAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    public C5643aAO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyDebugToolViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.debugtool.passkey.PasskeyDebugToolFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5643aAO.KWHzl(this.KWHzl);
            }
        });
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C8289azt c8289aztCopydefault = C8289azt.copydefault(layoutInflater, viewGroup, false);
        this.AhwBna = c8289aztCopydefault;
        if (c8289aztCopydefault != null) {
            return c8289aztCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        super.onDestroyView();
    }

    public final RegistrationStartResponse valueOf() {
        android.widget.EditText editText;
        android.text.Editable text;
        C8289azt c8289azt = this.AhwBna;
        RegistrationStartResponse.PublicKey.Rp rp = new RegistrationStartResponse.PublicKey.Rp("Sample passkey", (c8289azt == null || (editText = c8289azt.RJOkX) == null || (text = editText.getText()) == null) ? null : text.toString());
        return new RegistrationStartResponse(new RegistrationStartResponse.PublicKey(new RegistrationStartResponse.PublicKey.Extensions(true), DevicePublicKeyStringDef.DIRECT, "1lPJTUOGACtxvd5c3n1VRK9wGK-gXmdvSD8zfT-Y8IY", new RegistrationStartResponse.PublicKey.AuthenticatorSelection("required", java.lang.Boolean.FALSE, "preferred"), new RegistrationStartResponse.PublicKey.User("Passkey", "email@gmail.com", "zVhLeF2FAMEfY2HRbG48OyJSYg-LiMsHKArgn9KeG8w"), rp, 300000, yDY.AhwBna(), yDY.gEmmrt(new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -7), new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -8), new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -35), new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -36), new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -257), new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -258), new RegistrationStartResponse.PublicKey.PubKeyCredParam("public-key", -259))));
    }

    public final AuthenticationStartResponse AhwBna() {
        android.widget.EditText editText;
        android.text.Editable text;
        C8289azt c8289azt = this.AhwBna;
        return new AuthenticationStartResponse(new AuthenticationStartResponse.PublicKey((AuthenticationStartResponse.Extensions) null, (java.lang.String) null, "vzhVr0ytIvylLECfHZTWYQbvGpQYrWJbzBLi-qBvPrQ", (c8289azt == null || (editText = c8289azt.RJOkX) == null || (text = editText.getText()) == null) ? null : text.toString(), C56402yEa.EZpvd(new AuthenticationStartResponse.CredentialDescriptor("ZAwwH1Ho42aj7UWwKyt8hg", "public-key", yDY.gEmmrt("hybrid", "internal"))), 2, (DefaultConstructorMarker) null), (java.util.List) null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Possible override for method o.aAM.EZpvd()V */
    public final Fido2ApiClient EZpvd() {
        return (Fido2ApiClient) this.AYXKKw.getValue();
    }

    public static final Fido2ApiClient KWHzl(C5643aAO c5643aAO) {
        Fido2ApiClient fido2ApiClient = Fido.getFido2ApiClient((android.app.Activity) c5643aAO.requireActivity());
        Intrinsics.checkNotNullExpressionValue(fido2ApiClient, "");
        return fido2ApiClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01ec  */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.RadioGroup radioGroup;
        android.widget.RadioButton radioButton;
        android.widget.RadioButton radioButton2;
        android.widget.RadioButton radioButton3;
        android.widget.RadioGroup radioGroup2;
        android.widget.RadioButton radioButton4;
        int id;
        android.widget.RadioButton radioButton5;
        android.widget.RadioButton radioButton6;
        android.widget.RadioButton radioButton7;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        C52794wYp c52794wYp5;
        C52794wYp c52794wYp6;
        C52794wYp c52794wYp7;
        C52794wYp c52794wYp8;
        C52794wYp c52794wYp9;
        C52794wYp c52794wYp10;
        C52794wYp c52794wYp11;
        C52794wYp c52794wYp12;
        C52794wYp c52794wYp13;
        C52794wYp c52794wYp14;
        C52794wYp c52794wYp15;
        C52794wYp c52794wYp16;
        C52794wYp c52794wYp17;
        C52794wYp c52794wYp18;
        C52794wYp c52794wYp19;
        C52794wYp c52794wYp20;
        C52794wYp c52794wYp21;
        C52794wYp c52794wYp22;
        MaterialButton materialButton;
        Intrinsics.checkNotNullParameter(view, "");
        C8289azt c8289azt = this.AhwBna;
        if (c8289azt != null && (materialButton = c8289azt.AubY) != null) {
            materialButton.setOnClickListener(new Application(materialButton, 1000L, this));
        }
        C8289azt c8289azt2 = this.AhwBna;
        if (c8289azt2 != null && (c52794wYp22 = c8289azt2.zuBGHE) != null) {
            c52794wYp22.setOnClickListener(new PictureInPictureParams(c52794wYp22, 1000L, this));
        }
        C8289azt c8289azt3 = this.AhwBna;
        if (c8289azt3 != null && (c52794wYp21 = c8289azt3.AEQbTJ) != null) {
            c52794wYp21.setOnClickListener(new ComponentName(c52794wYp21, 1000L, this));
        }
        C8289azt c8289azt4 = this.AhwBna;
        if (c8289azt4 != null && (c52794wYp20 = c8289azt4.AwvSrB) != null) {
            c52794wYp20.setOnClickListener(new ClipData(c52794wYp20, 1000L, this));
        }
        C8289azt c8289azt5 = this.AhwBna;
        if (c8289azt5 != null && (c52794wYp19 = c8289azt5.copydefault) != null) {
            c52794wYp19.setOnClickListener(new ContextWrapper(c52794wYp19, 1000L, this));
        }
        C8289azt c8289azt6 = this.AhwBna;
        if (c8289azt6 != null && (c52794wYp18 = c8289azt6.QUSxYX) != null) {
            c52794wYp18.setOnClickListener(new Context(c52794wYp18, 1000L, this));
        }
        C8289azt c8289azt7 = this.AhwBna;
        if (c8289azt7 != null && (c52794wYp17 = c8289azt7.DTwDnp) != null) {
            c52794wYp17.setOnClickListener(new ContentResolver(c52794wYp17, 1000L, this));
        }
        C8289azt c8289azt8 = this.AhwBna;
        if (c8289azt8 != null && (c52794wYp16 = c8289azt8.QKVWgx) != null) {
            c52794wYp16.setOnClickListener(new DialogInterface(c52794wYp16, 1000L, this));
        }
        C8289azt c8289azt9 = this.AhwBna;
        if (c8289azt9 != null && (c52794wYp15 = c8289azt9.AkhnZx) != null) {
            c52794wYp15.setOnClickListener(new Intent(c52794wYp15, 1000L, this));
        }
        C8289azt c8289azt10 = this.AhwBna;
        if (c8289azt10 != null && (c52794wYp14 = c8289azt10.QOLQEE) != null) {
            c52794wYp14.setOnClickListener(new TaskDescription(c52794wYp14, 1000L, this));
        }
        C8289azt c8289azt11 = this.AhwBna;
        if (c8289azt11 != null && (c52794wYp13 = c8289azt11.EZpvd) != null) {
            c52794wYp13.setOnClickListener(new StateListAnimator(c52794wYp13, 1000L, this));
        }
        C8289azt c8289azt12 = this.AhwBna;
        if (c8289azt12 != null && (c52794wYp12 = c8289azt12.AuCTelauCTel) != null) {
            c52794wYp12.setOnClickListener(new Dialog(c52794wYp12, 1000L, this));
        }
        C8289azt c8289azt13 = this.AhwBna;
        if (c8289azt13 != null && (c52794wYp11 = c8289azt13.wlaJM) != null) {
            c52794wYp11.setOnClickListener(new FragmentManager(c52794wYp11, 1000L, this));
        }
        C8289azt c8289azt14 = this.AhwBna;
        if (c8289azt14 != null && (c52794wYp10 = c8289azt14.values) != null) {
            c52794wYp10.setOnClickListener(new Fragment(c52794wYp10, 1000L, this));
        }
        C8289azt c8289azt15 = this.AhwBna;
        if (c8289azt15 != null && (c52794wYp9 = c8289azt15.AYXKKw) != null) {
            c52794wYp9.setOnClickListener(new LoaderManager(c52794wYp9, 1000L, this));
        }
        C8289azt c8289azt16 = this.AhwBna;
        if (c8289azt16 != null && (c52794wYp8 = c8289azt16.AhwBna) != null) {
            c52794wYp8.setOnClickListener(new PendingIntent(c52794wYp8, 1000L, this));
        }
        C8289azt c8289azt17 = this.AhwBna;
        if (c8289azt17 != null && (c52794wYp7 = c8289azt17.djBIcL) != null) {
            c52794wYp7.setOnClickListener(new VoiceInteractor(c52794wYp7, 1000L, this));
        }
        C8289azt c8289azt18 = this.AhwBna;
        if (c8289azt18 != null && (c52794wYp6 = c8289azt18.valueOf) != null) {
            c52794wYp6.setOnClickListener(new TaskStackBuilder(c52794wYp6, 1000L, this));
        }
        C8289azt c8289azt19 = this.AhwBna;
        if (c8289azt19 != null && (c52794wYp5 = c8289azt19.gEmmrt) != null) {
            c52794wYp5.setOnClickListener(new AssistContent(c52794wYp5, 1000L, this));
        }
        C8289azt c8289azt20 = this.AhwBna;
        if (c8289azt20 != null && (c52794wYp4 = c8289azt20.DbNXlk) != null) {
            c52794wYp4.setOnClickListener(new SharedElementCallback(c52794wYp4, 1000L, this));
        }
        C8289azt c8289azt21 = this.AhwBna;
        if (c8289azt21 != null) {
            C52794wYp c52794wYp23 = c8289azt21.fetchVPNInfo;
            c52794wYp23.setOnClickListener(new TypedArray(c52794wYp23, 1000L, this));
            C52794wYp c52794wYp24 = c8289azt21.isConnected;
            c52794wYp24.setOnClickListener(new Resources(c52794wYp24, 1000L, this));
        }
        C8289azt c8289azt22 = this.AhwBna;
        if (c8289azt22 != null && (c52794wYp3 = c8289azt22.zsXlph) != null) {
            c52794wYp3.setOnClickListener(new BroadcastReceiver(c52794wYp3, 1000L, this));
        }
        C8289azt c8289azt23 = this.AhwBna;
        if (c8289azt23 != null && (c52794wYp2 = c8289azt23.sSMYrx) != null) {
            c52794wYp2.setOnClickListener(new ComponentCallbacks2(c52794wYp2, 1000L, this));
        }
        C8289azt c8289azt24 = this.AhwBna;
        if (c8289azt24 != null && (c52794wYp = c8289azt24.AxsJAY) != null) {
            c52794wYp.setOnClickListener(new ComponentCallbacks(c52794wYp, 1000L, this));
        }
        C8289azt c8289azt25 = this.AhwBna;
        int id2 = -1;
        if (c8289azt25 != null && (radioGroup2 = c8289azt25.fJNWhG) != null) {
            int i = ActionBar.KWHzl[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
            if (i == 1) {
                C8289azt c8289azt26 = this.AhwBna;
                if (c8289azt26 != null && (radioButton4 = c8289azt26.OLrzqt) != null) {
                    id = radioButton4.getId();
                }
                radioGroup2.check(id);
                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.aAT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.RadioGroup radioGroup3, int i2) {
                        C5643aAO.EZpvd(this.OLrzqt, radioGroup3, i2);
                    }
                });
            } else if (i == 2) {
                C8289azt c8289azt27 = this.AhwBna;
                if (c8289azt27 != null && (radioButton5 = c8289azt27.getNewProxyInstance) != null) {
                    id = radioButton5.getId();
                }
                radioGroup2.check(id);
                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.aAT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.RadioGroup radioGroup3, int i2) {
                        C5643aAO.EZpvd(this.OLrzqt, radioGroup3, i2);
                    }
                });
            } else if (i == 3) {
                C8289azt c8289azt28 = this.AhwBna;
                if (c8289azt28 != null && (radioButton6 = c8289azt28.iwGUEr) != null) {
                    id = radioButton6.getId();
                }
                radioGroup2.check(id);
                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.aAT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.RadioGroup radioGroup3, int i2) {
                        C5643aAO.EZpvd(this.OLrzqt, radioGroup3, i2);
                    }
                });
            } else if (i == 4) {
                C8289azt c8289azt29 = this.AhwBna;
                id = (c8289azt29 == null || (radioButton7 = c8289azt29.AuCTel) == null) ? -1 : radioButton7.getId();
                radioGroup2.check(id);
                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.aAT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.RadioGroup radioGroup3, int i2) {
                        C5643aAO.EZpvd(this.OLrzqt, radioGroup3, i2);
                    }
                });
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        C8289azt c8289azt30 = this.AhwBna;
        if (c8289azt30 != null && (radioGroup = c8289azt30.zLjUOn) != null) {
            int i2 = ActionBar.AEQbTJ[PasskeyDebugTool.EZpvd.AEQbTJ().ordinal()];
            if (i2 == 1) {
                C8289azt c8289azt31 = this.AhwBna;
                if (c8289azt31 != null && (radioButton = c8289azt31.uzCIH) != null) {
                    id2 = radioButton.getId();
                }
            } else if (i2 == 2) {
                C8289azt c8289azt32 = this.AhwBna;
                if (c8289azt32 != null && (radioButton2 = c8289azt32.getFieldNames) != null) {
                    id2 = radioButton2.getId();
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C8289azt c8289azt33 = this.AhwBna;
                if (c8289azt33 != null && (radioButton3 = c8289azt33.hDKMBd) != null) {
                    id2 = radioButton3.getId();
                }
            }
            radioGroup.check(id2);
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.aAU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.RadioGroup radioGroup3, int i3) {
                    C5643aAO.copydefault(this.EZpvd, radioGroup3, i3);
                }
            });
        }
        C8289azt c8289azt34 = this.AhwBna;
        if (c8289azt34 != null && (textView4 = c8289azt34.fARcdN) != null) {
            AEQbTJ(textView4);
        }
        C8289azt c8289azt35 = this.AhwBna;
        if (c8289azt35 != null && (textView3 = c8289azt35.gHZMYf) != null) {
            AEQbTJ(textView3);
        }
        C8289azt c8289azt36 = this.AhwBna;
        if (c8289azt36 != null && (textView2 = c8289azt36.fIwbmz) != null) {
            AEQbTJ(textView2);
        }
        C8289azt c8289azt37 = this.AhwBna;
        if (c8289azt37 == null || (textView = c8289azt37.ejfBZ) == null) {
            return;
        }
        AEQbTJ(textView);
    }

    /* JADX INFO: renamed from: o.aAO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.widget.TextView AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.widget.TextView textView) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                java.lang.Object systemService = this.AEQbTJ.getContext().getSystemService("clipboard");
                Intrinsics.copydefault(systemService, "");
                ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("test", this.AEQbTJ.getText()));
                C55326xho.toast$default("copied\n\n" + ((java.lang.Object) this.AEQbTJ.getText()), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5643aAO KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C5643aAO c5643aAO) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.startActivity(new android.content.Intent(this.KWHzl.requireContext(), (java.lang.Class<?>) ActivityC5718aBk.class));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5643aAO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.OLrzqt.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PasskeyDebugToolFragment$initView$19$1(null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$BroadcastReceiver */
    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ C5643aAO AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(android.view.View view, long j, C5643aAO c5643aAO) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ).launchWhenStarted(new PasskeyDebugToolFragment$initView$22$1(this.AEQbTJ, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$ClipData */
    public static final class ClipData implements View.OnClickListener {
        public final /* synthetic */ C5643aAO AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.AEQbTJ.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PasskeyDebugToolFragment$initView$4$1(this.AEQbTJ, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$ComponentCallbacks */
    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, C5643aAO c5643aAO) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.startActivity(new android.content.Intent(this.EZpvd.requireContext(), (java.lang.Class<?>) ActivityC5653aAY.class));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ReceiveCrossDeviceVerificationRequestActivity.Input input = new ReceiveCrossDeviceVerificationRequestActivity.Input("session id");
                C5643aAO c5643aAO = this.EZpvd;
                ReceiveCrossDeviceVerificationRequestActivity.Application application = ReceiveCrossDeviceVerificationRequestActivity.Companion;
                android.content.Context contextRequireContext = c5643aAO.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c5643aAO.startActivity(application.copydefault(contextRequireContext, input));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$ComponentName */
    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C5643aAO OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(android.view.View view, long j, C5643aAO c5643aAO) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.OLrzqt.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PasskeyDebugToolFragment$initView$3$1(this.OLrzqt, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$ContentResolver */
    public static final class ContentResolver implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5643aAO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.OLrzqt.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                java.lang.String simpleName = InterfaceC8196ayF.class.getSimpleName();
                InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                activityResultRegistry.register(simpleName, interfaceC8196ayF.KWHzl(contextRequireContext), this.OLrzqt.new Theme()).launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchReset.EZpvd, false, null, false, false, 30, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Context */
    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).djBIcL(), this.EZpvd.new Cursor()).launch(Unit.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$ContextWrapper */
    public static final class ContextWrapper implements View.OnClickListener {
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.EZpvd.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PasskeyDebugToolFragment$initView$5$1(this.EZpvd, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C5643aAO KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).AhwBna(), IntentSender.copydefault).launch(Unit.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$DialogInterface */
    public static final class DialogInterface implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C5643aAO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                java.lang.String simpleName = InterfaceC8196ayF.class.getSimpleName();
                InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                activityResultRegistry.register(simpleName, interfaceC8196ayF.KWHzl(contextRequireContext), this.copydefault.new DatabaseErrorHandler()).launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchRemove.AEQbTJ, false, null, false, false, 30, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5643aAO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), null, null, 3, null), this.copydefault.new ApplicationInfo()).launch(new PasskeyRegisterScenarioRequest(new PasskeyScenario.CedefiWallet(null, false, 3, null), new PasskeyRegisterConfig(false, null, null, null, null, false, false, 127, null)));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C5643aAO AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(), ServiceConnection.copydefault).launch(new PasskeyAuthenticateRequest(new PasskeyAuthenticateRequest.Extensions(java.lang.Boolean.TRUE), "qwer", "okex.org", yDY.AhwBna()));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Intent */
    public static final class Intent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5643aAO KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(android.view.View view, long j, C5643aAO c5643aAO) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LifecycleOwnerKt.getLifecycleScope(this.KWHzl).launchWhenStarted(new PasskeyDebugToolFragment$initView$9$1(null));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C5643aAO AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5643aAO KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.EZpvd.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PasskeyDebugToolFragment$initView$2$1(this.EZpvd, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Resources */
    public static final class Resources implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5643aAO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Resources(android.view.View view, long j, C5643aAO c5643aAO) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                C6019aHT c6019aHTNewInstance$default = C6019aHT.Application.newInstance$default(C6019aHT.Companion, null, null, 3, null);
                c6019aHTNewInstance$default.EZpvd(PackageItemInfo.copydefault);
                c6019aHTNewInstance$default.copydefault(Configuration.KWHzl);
                c6019aHTNewInstance$default.show(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5643aAO KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C5643aAO c5643aAO) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).gEmmrt(), AssetManager.KWHzl).launch(Unit.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C5643aAO AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C5643aAO c5643aAO) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), SharedPreferences.AEQbTJ).launch(new PasskeyAuthenticateScenarioRequest(PasskeyScenario.Account.AEQbTJ, true, null, 4, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C5643aAO KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5643aAO c5643aAO) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultRegistry activityResultRegistry;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
                    return;
                }
                activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), null, null, 3, null), IntentFilter.copydefault).launch(new PasskeyRegisterScenarioRequest(PasskeyScenario.Account.AEQbTJ, new PasskeyRegisterConfig(false, null, null, null, null, false, true, 63, null)));
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C5643aAO c5643aAO) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$TypedArray */
    public static final class TypedArray implements View.OnClickListener {
        public final /* synthetic */ C5643aAO EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TypedArray(android.view.View view, long j, C5643aAO c5643aAO) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                C6020aHU c6020aHUNewInstance$default = C6020aHU.Activity.newInstance$default(C6020aHU.Companion, "this is custom message", null, 2, null);
                c6020aHUNewInstance$default.KWHzl(PackageManager.EZpvd);
                c6020aHUNewInstance$default.AEQbTJ(ColorStateList.KWHzl);
                c6020aHUNewInstance$default.show(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5643aAO OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C5643aAO c5643aAO) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c5643aAO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.aAO$Cursor */
    public static final class Cursor<O> implements ActivityResultCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Cursor() {
        }

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyAuthenticateState passkeyAuthenticateState) {
            android.widget.TextView textView;
            C8289azt c8289azt = C5643aAO.this.AhwBna;
            if (c8289azt == null || (textView = c8289azt.QVAiDq) == null) {
                return;
            }
            textView.setText(passkeyAuthenticateState.toString());
        }
    }

    /* JADX INFO: renamed from: o.aAO$Theme */
    public static final class Theme<O> implements ActivityResultCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Theme() {
        }

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyResetRemoveState passkeyResetRemoveState) {
            android.widget.TextView textView;
            C8289azt c8289azt = C5643aAO.this.AhwBna;
            if (c8289azt == null || (textView = c8289azt.QfsBiF) == null) {
                return;
            }
            textView.setText(passkeyResetRemoveState.toString());
        }
    }

    /* JADX INFO: renamed from: o.aAO$DatabaseErrorHandler */
    public static final class DatabaseErrorHandler<O> implements ActivityResultCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DatabaseErrorHandler() {
        }

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyResetRemoveState passkeyResetRemoveState) {
            android.widget.TextView textView;
            C8289azt c8289azt = C5643aAO.this.AhwBna;
            if (c8289azt == null || (textView = c8289azt.ORxRYg) == null) {
                return;
            }
            textView.setText(passkeyResetRemoveState.toString());
        }
    }

    /* JADX INFO: renamed from: o.aAO$IntentFilter */
    public static final class IntentFilter<O> implements ActivityResultCallback {
        public static final IntentFilter<O> copydefault = new IntentFilter<>();

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyRegisterState passkeyRegisterState) {
            C55326xho.toast$default(passkeyRegisterState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$SharedPreferences */
    public static final class SharedPreferences<O> implements ActivityResultCallback {
        public static final SharedPreferences<O> AEQbTJ = new SharedPreferences<>();

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyAuthenticateState passkeyAuthenticateState) {
            C55326xho.toast$default(passkeyAuthenticateState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$IntentSender */
    public static final class IntentSender<O> implements ActivityResultCallback {
        public static final IntentSender<O> copydefault = new IntentSender<>();

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyState passkeyState) {
            C55326xho.toast$default(passkeyState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$ServiceConnection */
    public static final class ServiceConnection<O> implements ActivityResultCallback {
        public static final ServiceConnection<O> copydefault = new ServiceConnection<>();

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyState passkeyState) {
            C55326xho.toast$default(passkeyState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$ApplicationInfo */
    public static final class ApplicationInfo<O> implements ActivityResultCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ApplicationInfo() {
        }

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyRegisterState passkeyRegisterState) {
            pUU.EZpvd(C5643aAO.this.getTAG(), "Registration passkeyState: result " + passkeyRegisterState);
            C55326xho.toast$default(passkeyRegisterState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$AssetManager */
    public static final class AssetManager<O> implements ActivityResultCallback {
        public static final AssetManager<O> KWHzl = new AssetManager<>();

        /* JADX DEBUG: Method merged with bridge method: onActivityResult(Ljava/lang/Object;)V */
        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(PasskeyRecoverState passkeyRecoverState) {
            C55326xho.toast$default(passkeyRecoverState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$PackageManager */
    public static final class PackageManager implements Function0<Unit> {
        public static final PackageManager EZpvd = new PackageManager();

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            C55326xho.toast$default("primary clicked", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$ColorStateList */
    public static final class ColorStateList implements Function0<Unit> {
        public static final ColorStateList KWHzl = new ColorStateList();

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C55326xho.toast$default("cancelled", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$PackageItemInfo */
    public static final class PackageItemInfo implements Function0<Unit> {
        public static final PackageItemInfo copydefault = new PackageItemInfo();

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            C55326xho.toast$default("primary clicked", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.aAO$Configuration */
    public static final class Configuration implements Function0<Unit> {
        public static final Configuration KWHzl = new Configuration();

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C55326xho.toast$default("cancelled", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final void EZpvd(C5643aAO c5643aAO, android.widget.RadioGroup radioGroup, int i) {
        android.widget.RadioButton radioButton;
        PasskeyDebugTool.PasskeyVersionStatus passkeyVersionStatus;
        android.widget.RadioButton radioButton2;
        android.widget.RadioButton radioButton3;
        android.widget.RadioButton radioButton4;
        PasskeyDebugTool passkeyDebugTool = PasskeyDebugTool.EZpvd;
        C8289azt c8289azt = c5643aAO.AhwBna;
        if (c8289azt == null || (radioButton4 = c8289azt.getNewProxyInstance) == null || i != radioButton4.getId()) {
            C8289azt c8289azt2 = c5643aAO.AhwBna;
            if (c8289azt2 == null || (radioButton3 = c8289azt2.iwGUEr) == null || i != radioButton3.getId()) {
                C8289azt c8289azt3 = c5643aAO.AhwBna;
                if (c8289azt3 == null || (radioButton2 = c8289azt3.AuCTel) == null || i != radioButton2.getId()) {
                    C8289azt c8289azt4 = c5643aAO.AhwBna;
                    passkeyVersionStatus = (c8289azt4 == null || (radioButton = c8289azt4.OLrzqt) == null || i == radioButton.getId()) ? PasskeyDebugTool.PasskeyVersionStatus.AUTO : PasskeyDebugTool.PasskeyVersionStatus.AUTO;
                } else {
                    passkeyVersionStatus = PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_INCOMPATIBLE;
                }
            } else {
                passkeyVersionStatus = PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO2;
            }
        } else {
            passkeyVersionStatus = PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO1_V1_V2;
        }
        passkeyDebugTool.AEQbTJ(passkeyVersionStatus);
    }

    public static final void copydefault(C5643aAO c5643aAO, android.widget.RadioGroup radioGroup, int i) {
        PasskeyDebugTool.PasskeyDebugSdk passkeyDebugSdk;
        android.widget.RadioButton radioButton;
        android.widget.RadioButton radioButton2;
        android.widget.RadioButton radioButton3;
        PasskeyDebugTool passkeyDebugTool = PasskeyDebugTool.EZpvd;
        C8289azt c8289azt = c5643aAO.AhwBna;
        if (c8289azt == null || (radioButton3 = c8289azt.uzCIH) == null || i != radioButton3.getId()) {
            C8289azt c8289azt2 = c5643aAO.AhwBna;
            if (c8289azt2 == null || (radioButton2 = c8289azt2.getFieldNames) == null || i != radioButton2.getId()) {
                C8289azt c8289azt3 = c5643aAO.AhwBna;
                passkeyDebugSdk = (c8289azt3 == null || (radioButton = c8289azt3.hDKMBd) == null || i != radioButton.getId()) ? PasskeyDebugTool.PasskeyDebugSdk.AUTO : PasskeyDebugTool.PasskeyDebugSdk.DEBUG_ONLY_FORCE_CRED_MAN;
            } else {
                passkeyDebugSdk = PasskeyDebugTool.PasskeyDebugSdk.DEBUG_ONLY_FORCE_FIDO2;
            }
        } else {
            passkeyDebugSdk = PasskeyDebugTool.PasskeyDebugSdk.AUTO;
        }
        passkeyDebugTool.AEQbTJ(passkeyDebugSdk);
    }

    public final void AEQbTJ(boolean z) {
        ActivityResultRegistry activityResultRegistry;
        FragmentActivity activity = getActivity();
        if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
            return;
        }
        activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.aAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5643aAO.copydefault((PasskeyAuthenticateState) obj);
            }
        }).launch(new PasskeyAuthenticateScenarioRequest(new PasskeyScenario.CedefiWallet(null, false, 3, null), z, new PasskeyAuthenticateRequest(new PasskeyAuthenticateRequest.Extensions(java.lang.Boolean.TRUE), "eYEZU6s4rxd76vbNi7fcvy", "okex.org", C56402yEa.EZpvd(new PasskeyAuthenticateRequest.AllowCredential(yDY.gEmmrt("hybrid", "internal"), "2OnS3Ugt04NakOKnvSe4vQ", "public-key")))));
    }

    public static final void copydefault(PasskeyAuthenticateState passkeyAuthenticateState) {
        C55326xho.toast$default(passkeyAuthenticateState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public final void KWHzl(boolean z) {
        ActivityResultRegistry activityResultRegistry;
        FragmentActivity activity = getActivity();
        if (activity == null || (activityResultRegistry = activity.getActivityResultRegistry()) == null) {
            return;
        }
        activityResultRegistry.register(InterfaceC8196ayF.class.getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).EZpvd(), new ActivityResultCallback() { // from class: o.aAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5643aAO.OLrzqt((PasskeyLinkState) obj);
            }
        }).launch(new PasskeyLinkScenarioRequest(new PasskeyScenario.CedefiWallet(null, false, 3, null), z));
    }

    public static final void OLrzqt(PasskeyLinkState passkeyLinkState) {
        C55326xho.toast$default(passkeyLinkState.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    @Override // o.AbstractC5926aFg
    public void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        C8289azt c8289azt = this.AhwBna;
        if (c8289azt == null || (textView = c8289azt.fIwbmz) == null) {
            return;
        }
        textView.setText(passkeySdkResult.toString());
    }

    @Override // o.AbstractC5926aFg
    public void copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        C8289azt c8289azt = this.AhwBna;
        if (c8289azt == null || (textView = c8289azt.fIwbmz) == null) {
            return;
        }
        textView.setText(passkeySdkResult.toString());
    }

    public final void AEQbTJ(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setOnClickListener(new Activity(textView, 1000L, textView));
    }
}
