package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceActivity;
import com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6038aHm;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6038aHm extends AbstractC6033aHh {
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt;
    public C8263azT valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6038aHm() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg
    public void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.dNCPSb int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:23) call: o.aHm.<init>(int):void type: THIS */
    public /* synthetic */ C6038aHm(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.dNCPSb : i);
    }

    public C6038aHm(int i) {
        this.gEmmrt = i;
        this.AhwBna = "PasskeyAuthenticateWithoutUiServiceFragment";
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6038aHm.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.aHm$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aHm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C6038aHm EZpvd(@NotNull PasskeyAuthenticateWithoutUiServiceActivity.Request request) {
            Intrinsics.checkNotNullParameter(request, "");
            C6038aHm c6038aHm = new C6038aHm(0, 1, null);
            c6038aHm.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REQUEST_REQUEST", request)));
            return c6038aHm;
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super PasskeySdkResult, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(function1, "");
            fragmentManager.setFragmentResultListener("KEY_FRAGMENT_RESULT", lifecycleOwner, new FragmentResultListener() { // from class: o.aHk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C6038aHm.Activity.OLrzqt(function1, str, bundle);
                }
            });
        }

        public static final void OLrzqt(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            PasskeySdkResult passkeySdkResult = (PasskeySdkResult) bundle.getParcelable("KEY_RESPONSE_CREDENTIAL");
            if (passkeySdkResult != null) {
                function1.invoke(passkeySdkResult);
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.aHh.OLrzqt()V */
    public final PasskeyAuthenticateWithoutUiServiceActivity.Request OLrzqt() {
        return (PasskeyAuthenticateWithoutUiServiceActivity.Request) this.djBIcL.getValue();
    }

    public static final PasskeyAuthenticateWithoutUiServiceActivity.Request copydefault(C6038aHm c6038aHm) {
        android.os.Bundle arguments = c6038aHm.getArguments();
        PasskeyAuthenticateWithoutUiServiceActivity.Request request = arguments != null ? (PasskeyAuthenticateWithoutUiServiceActivity.Request) arguments.getParcelable("KEY_REQUEST_REQUEST") : null;
        if (request instanceof PasskeyAuthenticateWithoutUiServiceActivity.Request) {
            return request;
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C8263azT c8263azTCopydefault = C8263azT.copydefault(layoutInflater);
        this.valueOf = c8263azTCopydefault;
        if (c8263azTCopydefault != null) {
            return c8263azTCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.Object objLaunchWhenStarted;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        PasskeyAuthenticateWithoutUiServiceActivity.Request requestOLrzqt = OLrzqt();
        if (requestOLrzqt != null) {
            if (requestOLrzqt instanceof PasskeyAuthenticateWithoutUiServiceActivity.Request.FIDO2) {
                EZpvd(((PasskeyAuthenticateWithoutUiServiceActivity.Request.FIDO2) requestOLrzqt).AEQbTJ());
                objLaunchWhenStarted = Unit.INSTANCE;
            } else {
                if (!(requestOLrzqt instanceof PasskeyAuthenticateWithoutUiServiceActivity.Request.CredentialManager)) {
                    throw new NoWhenBranchMatchedException();
                }
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                objLaunchWhenStarted = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1(this, requestOLrzqt, null));
            }
            if (objLaunchWhenStarted != null) {
                return;
            }
        }
        copydefault(new PasskeySdkResult.Failure(ErrorCode.UNKNOWN_ERR, "pendingIntent is null at fragment", false));
        Unit unit = Unit.INSTANCE;
    }

    @Override // o.AbstractC5926aFg
    public void copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        C5922aFc.log$default(C5922aFc.KWHzl, "[AUTHENTICATE]", null, getTAG() + " finish with: " + passkeySdkResult.EZpvd(), 2, null);
        FragmentKt.setFragmentResult(this, "KEY_FRAGMENT_RESULT", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_RESPONSE_CREDENTIAL", passkeySdkResult)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }
}
