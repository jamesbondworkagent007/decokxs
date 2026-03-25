package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.relex.circleindicator.BuildConfig;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class eDA extends AbstractActivityC33013moT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public boolean OLrzqt;
    public AbstractC16370eie copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        return !this.OLrzqt;
    }

    public static final class TaskDescription {

        /* JADX INFO: renamed from: o.eDA$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final /* synthetic */ class C0832TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[LedgerError.values().length];
                try {
                    iArr[LedgerError.CONDITIONS_OF_USE_NOT_SATISFIED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[LedgerError.USER_REJECTED_1.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[LedgerError.USER_REJECTED_2.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[LedgerError.DEVICE_DISCONNECT.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[LedgerError.BLIND_NOT_OPEN.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[LedgerError.APDU_ORDER_BREAK.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eDA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int copydefault(@NotNull LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(ledgerError, "");
            switch (C0832TaskDescription.EZpvd[ledgerError.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return 10;
                case 4:
                    return 9;
                case 5:
                    return 11;
                case 6:
                    return 12;
                default:
                    return 8;
            }
        }

        public final void copydefault(@NotNull android.app.Activity activity, int i, LedgerSupportedApp ledgerSupportedApp, java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) eDA.class);
            intent.putExtra("type", i);
            intent.putExtra("chain", ledgerSupportedApp);
            intent.putExtra("chainName", str);
            intent.putExtra("startFromDialog", z);
            activity.startActivity(intent);
            if (z) {
                activity.overridePendingTransition(com.google.android.material.R.anim.design_bottom_sheet_slide_in, C52761wXj.Application.fetchVPNInfo);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        if (this.OLrzqt) {
            overridePendingTransition(C52761wXj.Application.fetchVPNInfo, com.google.android.material.R.anim.design_bottom_sheet_slide_out);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        Function1 function1;
        java.lang.String str;
        java.lang.String strAYXKKw4;
        java.lang.String strAYXKKw5;
        Function1 function12;
        final Function1 function13;
        java.lang.String strAYXKKw6;
        java.lang.String strAYXKKw7;
        java.lang.String str2;
        java.lang.String appName;
        java.lang.String strCopydefault;
        java.lang.String strAYXKKw8;
        Function1 function14;
        java.lang.String appName2;
        java.lang.String strAYXKKw9;
        java.lang.String strCopydefault2;
        java.lang.String appName3;
        java.lang.String signSetting;
        this.OLrzqt = getIntent().getBooleanExtra("startFromDialog", false);
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        AbstractC16370eie abstractC16370eie = (AbstractC16370eie) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.fZBcTu);
        this.copydefault = abstractC16370eie;
        AbstractC16370eie abstractC16370eie2 = null;
        if (this.OLrzqt) {
            if (abstractC16370eie == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie = null;
            }
            abstractC16370eie.AEQbTJ.setBackImage(C32113mPz.TaskDescription.copydefault);
        }
        int intExtra = getIntent().getIntExtra("type", 8);
        LedgerSupportedApp ledgerSupportedApp = (LedgerSupportedApp) getIntent().getSerializableExtra("chain");
        java.lang.String stringExtra = getIntent().getStringExtra("chainName");
        switch (intExtra) {
            case 1:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActiveQueueItemId);
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi22);
                strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBaseMediaSessionStub);
                function1 = new Function1() { // from class: o.eDB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.fetchVPNInfo(this.OLrzqt, (android.view.View) obj);
                    }
                };
                str = "images/web3_wallet/android/ledger_bluetooth.webp";
                str2 = str;
                function13 = function1;
                strAYXKKw6 = strAYXKKw3;
                strAYXKKw7 = strAYXKKw2;
                strCopydefault2 = null;
                break;
            case 2:
                AbstractC16370eie abstractC16370eie3 = this.copydefault;
                if (abstractC16370eie3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie3 = null;
                }
                ViewGroup.LayoutParams layoutParams = abstractC16370eie3.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = C33052mpF.dpInt$default(106, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams.height = C33052mpF.dpInt$default(201, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams.topMargin = C33052mpF.dpInt$default(64, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams.bottomMargin = C33052mpF.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
                AbstractC16370eie abstractC16370eie4 = this.copydefault;
                if (abstractC16370eie4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie4 = null;
                }
                abstractC16370eie4.EZpvd.setLayoutParams(marginLayoutParams);
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPosition);
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.createSession);
                strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatOnActiveChangeListener);
                function1 = new Function1() { // from class: o.eDJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.values(this.KWHzl, (android.view.View) obj);
                    }
                };
                str = "images/web3_wallet/android/ledger_bluetooth.webp";
                str2 = str;
                function13 = function1;
                strAYXKKw6 = strAYXKKw3;
                strAYXKKw7 = strAYXKKw2;
                strCopydefault2 = null;
                break;
            case 3:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.addCustomAction);
                strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasCallback);
                strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromQueueItemList);
                function12 = new Function1() { // from class: o.eDH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.isConnected(this.EZpvd, (android.view.View) obj);
                    }
                };
                function13 = function12;
                strAYXKKw6 = strAYXKKw5;
                strAYXKKw7 = strAYXKKw4;
                str2 = "images/web3_wallet/android/ledger_overtime.webp";
                strCopydefault2 = null;
                break;
            case 4:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi21QueueItem);
                strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasCallback);
                strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromQueueItemList);
                function12 = new Function1() { // from class: o.eDO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.DbNXlk(this.copydefault, (android.view.View) obj);
                    }
                };
                function13 = function12;
                strAYXKKw6 = strAYXKKw5;
                strAYXKKw7 = strAYXKKw4;
                str2 = "images/web3_wallet/android/ledger_overtime.webp";
                strCopydefault2 = null;
                break;
            case 5:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getErrorMessage);
                if (ledgerSupportedApp == LedgerSupportedApp.Ethereum) {
                    strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi23CallbackProxy);
                } else {
                    if (ledgerSupportedApp == null || (appName = ledgerSupportedApp.getAppName()) == null) {
                        appName = "";
                    }
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.MediaSessionCompatApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", appName)));
                }
                strAYXKKw8 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.update);
                function14 = new Function1() { // from class: o.eDN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.AkhnZx(this.copydefault, (android.view.View) obj);
                    }
                };
                function13 = function14;
                strAYXKKw6 = strAYXKKw8;
                strAYXKKw7 = strCopydefault;
                str2 = "images/web3_wallet/ledger_open_app_tips.png";
                strCopydefault2 = null;
                break;
            case 6:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.PlaybackStateCompatActions);
                if (ledgerSupportedApp == null || (appName2 = ledgerSupportedApp.getAppName()) == null) {
                    appName2 = "";
                }
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.MediaSessionCompatApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", appName2)));
                strAYXKKw8 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBaseMessageHandler);
                function14 = new Function1() { // from class: o.eDL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.fARcdN(this.copydefault, (android.view.View) obj);
                    }
                };
                function13 = function14;
                strAYXKKw6 = strAYXKKw8;
                strAYXKKw7 = strCopydefault;
                str2 = "images/web3_wallet/ledger_open_app_tips.png";
                strCopydefault2 = null;
                break;
            case 7:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.PlaybackStateCompatBuilder);
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setExtraBinder);
                strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBase1);
                function1 = new Function1() { // from class: o.eDM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.AuCTel(this.copydefault, (android.view.View) obj);
                    }
                };
                str = "images/web3_wallet/ledger_match_fail.png";
                str2 = str;
                function13 = function1;
                strAYXKKw6 = strAYXKKw3;
                strAYXKKw7 = strAYXKKw2;
                strCopydefault2 = null;
                break;
            case 8:
                AbstractC16370eie abstractC16370eie5 = this.copydefault;
                if (abstractC16370eie5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie5 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = abstractC16370eie5.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams2, "");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.width = C33052mpF.dpInt$default(BuildConfig.VERSION_CODE, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams2.height = C33052mpF.dpInt$default(CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams2.topMargin = C33052mpF.dpInt$default(94, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams2.bottomMargin = C33052mpF.dpInt$default(84, (android.content.Context) null, 1, (java.lang.Object) null);
                AbstractC16370eie abstractC16370eie6 = this.copydefault;
                if (abstractC16370eie6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie6 = null;
                }
                abstractC16370eie6.EZpvd.setLayoutParams(marginLayoutParams2);
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActions);
                strAYXKKw9 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi21Callback);
                str2 = "images/web3_wallet/ledger_transaction_failed.png";
                strAYXKKw7 = strAYXKKw9;
                strCopydefault2 = null;
                strAYXKKw6 = null;
                function13 = null;
                break;
            case 9:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPlaybackSpeed);
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setSessionToken2Bundle);
                strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onVolumeChanged);
                function1 = new Function1() { // from class: o.eDK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.fJNWhG(this.copydefault, (android.view.View) obj);
                    }
                };
                str = "images/web3_wallet/ledger_not_connect.png";
                str2 = str;
                function13 = function1;
                strAYXKKw6 = strAYXKKw3;
                strAYXKKw7 = strAYXKKw2;
                strCopydefault2 = null;
                break;
            case 10:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getState);
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.verifySession);
                strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBaseCommand);
                function1 = new Function1() { // from class: o.eDF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.ejfBZ(this.OLrzqt, (android.view.View) obj);
                    }
                };
                str = "images/web3_wallet/ledger_reject.png";
                str2 = str;
                function13 = function1;
                strAYXKKw6 = strAYXKKw3;
                strAYXKKw7 = strAYXKKw2;
                strCopydefault2 = null;
                break;
            case 11:
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCustomActions);
                strAYXKKw7 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hashCode);
                if (ledgerSupportedApp == null || (appName3 = ledgerSupportedApp.getAppName()) == null) {
                    appName3 = "";
                }
                if (ledgerSupportedApp == null || (signSetting = ledgerSupportedApp.getSignSetting()) == null) {
                    signSetting = "";
                }
                strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.verifyToken, C56424yEw.gEmmrt(C56390yDp.OLrzqt("network", appName3), C56390yDp.OLrzqt("signbyhash", signSetting)));
                strAYXKKw6 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendState);
                function13 = new Function1() { // from class: o.eDI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eDA.fIwbmz(this.copydefault, (android.view.View) obj);
                    }
                };
                str2 = "images/web3_wallet/ledger_open_blind_sign_tips.png";
                break;
            case 12:
                AbstractC16370eie abstractC16370eie7 = this.copydefault;
                if (abstractC16370eie7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie7 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = abstractC16370eie7.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int iDpInt$default = C33052mpF.dpInt$default(236, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams3.width = iDpInt$default;
                marginLayoutParams3.height = iDpInt$default;
                marginLayoutParams3.topMargin = C33052mpF.dpInt$default(49, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams3.bottomMargin = C33052mpF.dpInt$default(46, (android.content.Context) null, 1, (java.lang.Object) null);
                AbstractC16370eie abstractC16370eie8 = this.copydefault;
                if (abstractC16370eie8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie8 = null;
                }
                abstractC16370eie8.EZpvd.setLayoutParams(marginLayoutParams3);
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActions);
                strAYXKKw9 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.createItem);
                str2 = "images/web3_wallet/ledger_transaction_failed.png";
                strAYXKKw7 = strAYXKKw9;
                strCopydefault2 = null;
                strAYXKKw6 = null;
                function13 = null;
                break;
            case 13:
                AbstractC16370eie abstractC16370eie9 = this.copydefault;
                if (abstractC16370eie9 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie9 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = abstractC16370eie9.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams4, "");
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                int iDpInt$default2 = C33052mpF.dpInt$default(236, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams4.width = iDpInt$default2;
                marginLayoutParams4.height = iDpInt$default2;
                marginLayoutParams4.topMargin = C33052mpF.dpInt$default(49, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams4.bottomMargin = C33052mpF.dpInt$default(46, (android.content.Context) null, 1, (java.lang.Object) null);
                AbstractC16370eie abstractC16370eie10 = this.copydefault;
                if (abstractC16370eie10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie10 = null;
                }
                abstractC16370eie10.EZpvd.setLayoutParams(marginLayoutParams4);
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActions);
                strAYXKKw9 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi24Callback);
                str2 = "images/web3_wallet/ledger_transaction_failed.png";
                strAYXKKw7 = strAYXKKw9;
                strCopydefault2 = null;
                strAYXKKw6 = null;
                function13 = null;
                break;
            case 14:
                AbstractC16370eie abstractC16370eie11 = this.copydefault;
                if (abstractC16370eie11 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie11 = null;
                }
                ViewGroup.LayoutParams layoutParams5 = abstractC16370eie11.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams5, "");
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                int iDpInt$default3 = C33052mpF.dpInt$default(236, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams5.width = iDpInt$default3;
                marginLayoutParams5.height = iDpInt$default3;
                marginLayoutParams5.topMargin = C33052mpF.dpInt$default(49, (android.content.Context) null, 1, (java.lang.Object) null);
                marginLayoutParams5.bottomMargin = C33052mpF.dpInt$default(46, (android.content.Context) null, 1, (java.lang.Object) null);
                AbstractC16370eie abstractC16370eie12 = this.copydefault;
                if (abstractC16370eie12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16370eie12 = null;
                }
                abstractC16370eie12.EZpvd.setLayoutParams(marginLayoutParams5);
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActions);
                int i = C13754dXa.FragmentManager.getToken;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                strAYXKKw9 = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", stringExtra)));
                str2 = "images/web3_wallet/ledger_transaction_failed.png";
                strAYXKKw7 = strAYXKKw9;
                strCopydefault2 = null;
                strAYXKKw6 = null;
                function13 = null;
                break;
            default:
                strAYXKKw = null;
                strCopydefault2 = null;
                strAYXKKw7 = null;
                strAYXKKw6 = null;
                function13 = null;
                str2 = null;
                break;
        }
        if (str2 != null) {
            AbstractC16370eie abstractC16370eie13 = this.copydefault;
            if (abstractC16370eie13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie13 = null;
            }
            android.widget.ImageView imageView = abstractC16370eie13.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AbstractC16370eie abstractC16370eie14 = this.copydefault;
            if (abstractC16370eie14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie14 = null;
            }
            android.content.Context context = abstractC16370eie14.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault(str2, context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        AbstractC16370eie abstractC16370eie15 = this.copydefault;
        if (abstractC16370eie15 == null) {
            Intrinsics.gEmmrt("");
            abstractC16370eie15 = null;
        }
        abstractC16370eie15.gEmmrt.setText(strAYXKKw);
        AbstractC16370eie abstractC16370eie16 = this.copydefault;
        if (abstractC16370eie16 == null) {
            Intrinsics.gEmmrt("");
            abstractC16370eie16 = null;
        }
        abstractC16370eie16.OLrzqt.setText(strAYXKKw7);
        if (strCopydefault2 == null) {
            AbstractC16370eie abstractC16370eie17 = this.copydefault;
            if (abstractC16370eie17 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie17 = null;
            }
            abstractC16370eie17.djBIcL.setVisibility(8);
        } else {
            AbstractC16370eie abstractC16370eie18 = this.copydefault;
            if (abstractC16370eie18 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie18 = null;
            }
            abstractC16370eie18.djBIcL.setVisibility(0);
            AbstractC16370eie abstractC16370eie19 = this.copydefault;
            if (abstractC16370eie19 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie19 = null;
            }
            abstractC16370eie19.djBIcL.setText(strCopydefault2);
        }
        if (strAYXKKw6 == null) {
            AbstractC16370eie abstractC16370eie20 = this.copydefault;
            if (abstractC16370eie20 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie20 = null;
            }
            abstractC16370eie20.KWHzl.setVisibility(8);
        } else {
            AbstractC16370eie abstractC16370eie21 = this.copydefault;
            if (abstractC16370eie21 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie21 = null;
            }
            abstractC16370eie21.KWHzl.setVisibility(0);
            AbstractC16370eie abstractC16370eie22 = this.copydefault;
            if (abstractC16370eie22 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie22 = null;
            }
            abstractC16370eie22.KWHzl.setText(strAYXKKw6);
            AbstractC16370eie abstractC16370eie23 = this.copydefault;
            if (abstractC16370eie23 == null) {
                Intrinsics.gEmmrt("");
                abstractC16370eie23 = null;
            }
            abstractC16370eie23.KWHzl.setOnClickListener(function13 != null ? new View.OnClickListener() { // from class: o.eDD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    eDA.AEQbTJ(function13, view);
                }
            } : null);
        }
        AbstractC16370eie abstractC16370eie24 = this.copydefault;
        if (abstractC16370eie24 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16370eie2 = abstractC16370eie24;
        }
        abstractC16370eie2.copydefault.setVisibility(8);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eDA.copydefault(this.KWHzl);
            }
        });
    }

    public static final Unit fetchVPNInfo(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit values(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(eDA eda, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eda.finish();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, android.view.View view) {
        function1.invoke(view);
    }

    public static final void copydefault(eDA eda) {
        rVN.reportFullyDrawn$default((android.app.Activity) eda, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
