package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.util.ScannerActivity;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignResult;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneSignResp;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cXx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11698cXx extends AbstractC43215rlA implements InterfaceC33528myE {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public ParseKeystoneSignResp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33528myE
    public void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33528myE
    public java.lang.String copydefault() {
        return "OKWKeystoneSignScannerViewExtensionImpl";
    }

    /* JADX INFO: renamed from: o.cXx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cXx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC33528myE
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17093ewL c17093ewLAEQbTJ = C17093ewL.AEQbTJ(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c17093ewLAEQbTJ, "");
        ConstraintLayout root = c17093ewLAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC33528myE
    public void OLrzqt(@NotNull ScannerActivity scannerActivity, @NotNull java.lang.String str, @NotNull android.view.View view, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(scannerActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Pattern.matches("^[0-9]*$", str)) {
            return;
        }
        KWHzl(scannerActivity, str, view, bundle.getLong("chain_id"));
    }

    public final void KWHzl(ScannerActivity scannerActivity, java.lang.String str, android.view.View view, long j) {
        android.os.Bundle bundleExtra;
        KeystoneSignResult signResult;
        int iCopydefault = copydefault(java.lang.Long.valueOf(j), str);
        if (iCopydefault == -1) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.DcMfJKfbSiEC, 0, 1, (java.lang.Object) null);
            return;
        }
        if (1 <= iCopydefault && iCopydefault < 100) {
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.newUnratedRating)).setText(C33069mpW.copydefault(C13754dXa.FragmentManager.aKhcqp, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(iCopydefault)))));
            return;
        }
        if (iCopydefault == 100) {
            android.content.Intent intent = new android.content.Intent();
            ParseKeystoneSignResp parseKeystoneSignResp = this.copydefault;
            java.lang.String strKWHzl = (parseKeystoneSignResp == null || (signResult = parseKeystoneSignResp.getSignResult()) == null) ? null : C33489mxS.KWHzl.KWHzl(KeystoneSignResult.Companion.serializer(), signResult);
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            intent.putExtra("EXTRA_SCAN_RESULT", strKWHzl);
            android.content.Intent intent2 = scannerActivity.getIntent();
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("EXTRA_SCAN_BUNDLE")) != null) {
                intent.putExtra("EXTRA_SCAN_BUNDLE", bundleExtra);
            }
            Unit unit = Unit.INSTANCE;
            scannerActivity.setResult(-1, intent);
            scannerActivity.finish();
            this.copydefault = null;
        }
    }

    public final int copydefault(java.lang.Long l, java.lang.String str) {
        ParseKeystoneSignResp parseKeystoneSignRespCopydefault;
        if (!C59449zhJ.startsWith$default(str, "UR:", false, 2, null)) {
            return -1;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l);
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.AxsJAYaxsJAY()) {
            parseKeystoneSignRespCopydefault = xZX.OLrzqt.copydefault(0L, str);
        } else if (c10854bwMKWHzl != null && c10854bwMKWHzl.QkdxfA()) {
            parseKeystoneSignRespCopydefault = xZX.OLrzqt.copydefault(1L, str);
        } else if (c10854bwMKWHzl != null && c10854bwMKWHzl.run()) {
            parseKeystoneSignRespCopydefault = xZX.OLrzqt.copydefault(195L, str);
        } else if (c10854bwMKWHzl != null && c10854bwMKWHzl.DLWbHP()) {
            parseKeystoneSignRespCopydefault = xZX.OLrzqt.copydefault(2L, str);
        } else if (c10854bwMKWHzl != null && c10854bwMKWHzl.OqFWZa()) {
            parseKeystoneSignRespCopydefault = xZX.OLrzqt.copydefault(5L, str);
        } else if (c10854bwMKWHzl == null || !c10854bwMKWHzl.flVtFt()) {
            pUU.KWHzl("OKWKeystoneSignScannerViewExtensionImpl", "Invalid data: chainId=" + l + ", chainMeta=" + c10854bwMKWHzl);
            parseKeystoneSignRespCopydefault = null;
        } else {
            parseKeystoneSignRespCopydefault = xZX.OLrzqt.copydefault(145L, str);
        }
        this.copydefault = parseKeystoneSignRespCopydefault;
        if ((parseKeystoneSignRespCopydefault != null ? parseKeystoneSignRespCopydefault.getSignResult() : null) != null) {
            ParseKeystoneSignResp parseKeystoneSignResp = this.copydefault;
            if (parseKeystoneSignResp != null) {
                return parseKeystoneSignResp.getProgress();
            }
            return -1;
        }
        pUU.KWHzl("OKWKeystoneSignScannerViewExtensionImpl", "parseResult=" + this.copydefault);
        return -2;
    }
}
