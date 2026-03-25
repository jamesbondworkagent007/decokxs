package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyPairingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eGW extends wXX {
    public final float KWHzl = 0.54f;
    public C16536ell OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.KWHzl;
    }

    public final C16536ell KWHzl() {
        C16536ell c16536ell = this.OLrzqt;
        Intrinsics.copydefault(c16536ell);
        return c16536ell;
    }

    public final HardwareWalletOneKeyPairingType AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("key.pairing_type") : null;
        HardwareWalletOneKeyPairingType hardwareWalletOneKeyPairingType = serializable instanceof HardwareWalletOneKeyPairingType ? (HardwareWalletOneKeyPairingType) serializable : null;
        if (hardwareWalletOneKeyPairingType != null) {
            return hardwareWalletOneKeyPairingType;
        }
        throw new java.lang.IllegalStateException("Must provide pairing type");
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.OLrzqt = C16536ell.copydefault(layoutInflater, viewGroup, false);
        EZpvd();
        ConstraintLayout root = KWHzl().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        super.onDestroyView();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        KeyEventDispatcher.Component activity = getActivity();
        eGX egx = activity instanceof eGX ? (eGX) activity : null;
        if (egx != null) {
            egx.OLrzqt();
        }
    }

    public final void EZpvd() {
        kotlin.Pair pairOLrzqt;
        if (AEQbTJ() == HardwareWalletOneKeyPairingType.OneKeyUnlocking) {
            pairOLrzqt = C56390yDp.OLrzqt(getString(C13754dXa.FragmentManager.applyDayNightToActiveDelegates), "images/web3_wallet/onekey_unlock_tips.png");
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(getString(C13754dXa.FragmentManager.getDefaultNightMode), "images/web3_wallet/android/onekey_passphrase_tip.webp");
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        C16536ell c16536ellKWHzl = KWHzl();
        android.widget.ImageView imageView = c16536ellKWHzl.AEQbTJ;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        c16536ellKWHzl.KWHzl.setText(str);
        android.widget.ImageView imageView2 = c16536ellKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        android.content.Context context = c16536ellKWHzl.EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(imageView2, C43454rpb.copydefault(str2, context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eGW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final eGW copydefault(@NotNull HardwareWalletOneKeyPairingType hardwareWalletOneKeyPairingType) {
            Intrinsics.checkNotNullParameter(hardwareWalletOneKeyPairingType, "");
            eGW egw = new eGW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("key.pairing_type", hardwareWalletOneKeyPairingType);
            egw.setArguments(bundle);
            return egw;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ eGW AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eGW egw) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = egw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }
}
