package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6347aNd;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6347aNd extends AbstractC6349aNf {
    public C5670aAp AhwBna;
    public final int djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public java.lang.String valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6347aNd() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg
    public void copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.AxsJAYaxsJAY int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:18) call: o.aNd.<init>(int):void type: THIS */
    public /* synthetic */ C6347aNd(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.AxsJAYaxsJAY : i);
    }

    public C6347aNd(int i) {
        this.djBIcL = i;
        this.valueOf = "RegisterPasskeyWithPendingIntentFragment";
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aNe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6347aNd.EZpvd(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.aNd$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C6347aNd KWHzl(@NotNull android.app.PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "");
            C6347aNd c6347aNd = new C6347aNd(0, 1, null);
            c6347aNd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REQUEST_PENDING_INTENT", pendingIntent)));
            return c6347aNd;
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super PasskeySdkResult, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(function1, "");
            fragmentManager.setFragmentResultListener("KEY_FRAGMENT_RESULT", lifecycleOwner, new FragmentResultListener() { // from class: o.aNb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C6347aNd.ActionBar.copydefault(function1, str, bundle);
                }
            });
        }

        public static final void copydefault(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            PasskeySdkResult passkeySdkResult = (PasskeySdkResult) bundle.getParcelable("KEY_RESPONSE_CREDENTIAL");
            if (passkeySdkResult != null) {
                function1.invoke(passkeySdkResult);
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.aNf.EZpvd()V */
    public final android.app.PendingIntent EZpvd() {
        return (android.app.PendingIntent) this.gEmmrt.getValue();
    }

    public static final android.app.PendingIntent EZpvd(C6347aNd c6347aNd) {
        android.os.Bundle arguments = c6347aNd.getArguments();
        android.app.PendingIntent pendingIntent = arguments != null ? (android.app.PendingIntent) arguments.getParcelable("KEY_REQUEST_PENDING_INTENT") : null;
        if (pendingIntent instanceof android.app.PendingIntent) {
            return pendingIntent;
        }
        return null;
    }

    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.AhwBna = C5670aAp.AEQbTJ(view);
        android.app.PendingIntent pendingIntentEZpvd = EZpvd();
        if (pendingIntentEZpvd != null) {
            AEQbTJ(pendingIntentEZpvd);
        } else {
            OLrzqt(new PasskeySdkResult.Failure(null, "PendingIntent is null", false));
        }
    }

    @Override // o.AbstractC5926aFg
    public void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        C5922aFc.KWHzl.copydefault("[REGISTER]", "[FIDO2]", getTAG() + " finish with: " + passkeySdkResult.EZpvd());
        FragmentKt.setFragmentResult(this, "KEY_FRAGMENT_RESULT", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_RESPONSE_CREDENTIAL", passkeySdkResult)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }
}
