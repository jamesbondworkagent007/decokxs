package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.core.util.ScannerActivity;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp;
import com.okinc.web.WebActivity;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC15384eGi;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11692cXr extends AbstractC43215rlA implements InterfaceC33528myE {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public ParseKeystoneAccountsResp KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void OLrzqt() {
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33528myE
    public void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33528myE
    public java.lang.String copydefault() {
        return "OKWKeystoneConnectScannerViewExtensionImpl";
    }

    /* JADX INFO: renamed from: o.cXr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cXr.Activity.<init>():void type: THIS */
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
        C17094ewM c17094ewMAEQbTJ = C17094ewM.AEQbTJ(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c17094ewMAEQbTJ, "");
        AppCompatTextView appCompatTextView = c17094ewMAEQbTJ.KWHzl;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 500L));
        ConstraintLayout root = c17094ewMAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC33528myE
    public void OLrzqt(@NotNull ScannerActivity scannerActivity, @NotNull java.lang.String str, @NotNull android.view.View view, @NotNull android.os.Bundle bundle) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(scannerActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Pattern.matches("^[0-9]*$", str)) {
            return;
        }
        copydefault(scannerActivity, str, view, bundle);
    }

    public final void copydefault(final ScannerActivity scannerActivity, java.lang.String str, final android.view.View view, final android.os.Bundle bundle) throws java.lang.Exception {
        int iCopydefault = copydefault(str);
        if (iCopydefault == -1) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.DcMfJKfbSiEC, 0, 1, (java.lang.Object) null);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatApi21CallbackProxy)).setVisibility(0);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.addSocket)).setVisibility(0);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.newUnratedRating)).setVisibility(8);
            return;
        }
        if (1 <= iCopydefault && iCopydefault < 100) {
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatApi21CallbackProxy)).setVisibility(8);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.addSocket)).setVisibility(8);
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C13754dXa.ActionBar.newUnratedRating);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.aKhcqp, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(iCopydefault)))));
            return;
        }
        if (iCopydefault == 100) {
            scannerActivity.showLoadingWithLogo();
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtEZpvd = EZpvd();
            final Function1 function1 = new Function1() { // from class: o.cXo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11692cXr.AEQbTJ(scannerActivity, this, view, bundle, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cXq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C11692cXr.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.cXp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11692cXr.KWHzl(scannerActivity, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cXu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C11692cXr.copydefault(function12, obj);
                }
            });
        }
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ScannerActivity scannerActivity, C11692cXr c11692cXr, android.view.View view, android.os.Bundle bundle, java.lang.Boolean bool) {
        KeystoneMultiAccount multiAccount;
        scannerActivity.dismissLoadingWithLogo();
        if (bool.booleanValue()) {
            c11692cXr.OLrzqt();
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.DcMfJKdMCrTj, 0, 1, (java.lang.Object) null);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatApi21CallbackProxy)).setVisibility(0);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.addSocket)).setVisibility(0);
            ((AppCompatTextView) view.findViewById(C13754dXa.ActionBar.newUnratedRating)).setVisibility(8);
        } else {
            ActivityC15384eGi.Activity activity = ActivityC15384eGi.Companion;
            int i = bundle.getInt(OtcExtraKeys.MODE);
            ParseKeystoneAccountsResp parseKeystoneAccountsResp = c11692cXr.KWHzl;
            if (parseKeystoneAccountsResp != null && (multiAccount = parseKeystoneAccountsResp.getMultiAccount()) != null) {
                activity.OLrzqt(scannerActivity, "", "createWallet", i, multiAccount);
                c11692cXr.OLrzqt();
                scannerActivity.finish();
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ScannerActivity scannerActivity, java.lang.Throwable th) {
        scannerActivity.dismissLoadingWithLogo();
        return Unit.INSTANCE;
    }

    public final int copydefault(java.lang.String str) {
        ParseKeystoneAccountsResp parseKeystoneAccountsRespCopydefault = xZX.OLrzqt.copydefault(str);
        this.KWHzl = parseKeystoneAccountsRespCopydefault;
        if (parseKeystoneAccountsRespCopydefault != null) {
            return parseKeystoneAccountsRespCopydefault.getProgress();
        }
        return -1;
    }

    public final AbstractC58260yxt<java.lang.Boolean> EZpvd() throws java.lang.Exception {
        KeystoneMultiAccount multiAccount;
        java.lang.String deviceId;
        KeystoneMultiAccount multiAccount2;
        java.lang.String masterFingerprint;
        xZX xzx = xZX.OLrzqt;
        ParseKeystoneAccountsResp parseKeystoneAccountsResp = this.KWHzl;
        if (parseKeystoneAccountsResp == null || (multiAccount = parseKeystoneAccountsResp.getMultiAccount()) == null || (deviceId = multiAccount.getDeviceId()) == null) {
            throw new java.lang.Exception("deviceId must not null");
        }
        ParseKeystoneAccountsResp parseKeystoneAccountsResp2 = this.KWHzl;
        if (parseKeystoneAccountsResp2 != null && (multiAccount2 = parseKeystoneAccountsResp2.getMultiAccount()) != null && (masterFingerprint = multiAccount2.getMasterFingerprint()) != null) {
            return xzx.copydefault(deviceId, masterFingerprint);
        }
        throw new java.lang.Exception("masterFingerprint id must not null");
    }

    /* JADX INFO: renamed from: o.cXr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j) {
            this.copydefault = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.copydefault;
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                android.content.Context context = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", appCompatTextView.getContext().getString(C13754dXa.FragmentManager.RkASWs)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
            }
        }
    }
}
