package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.CloudBackupWalletType;
import com.okinc.business.defi.common.track.CloudBackupEventCode;
import com.okinc.business.defi.common.track.CloudBackupEventType;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18774foj;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.foj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18774foj extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.lang.String AhwBna;
    public InterfaceC18835fps KWHzl;
    public int OLrzqt;
    public boolean copydefault;
    public AbstractC16293ehG djBIcL;
    public java.lang.String gEmmrt;
    public int AEQbTJ = 1;
    public boolean valueOf = true;

    /* JADX INFO: renamed from: o.foj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.foj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static final Unit copydefault() {
            return Unit.INSTANCE;
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, boolean z, boolean z2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            Application application = new Application();
            application.EZpvd(str, str2, i, i2, z, z2, function0);
            fragmentTransactionBeginTransaction.add(application, (java.lang.String) null).commitAllowingStateLoss();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        final AbstractC16293ehG abstractC16293ehG = null;
        C32866mlf.onEvent$default("Web3Onboarding_CloudBackupPassword_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        this.djBIcL = (AbstractC16293ehG) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QOLQEE);
        java.lang.String stringExtra = getIntent().getStringExtra("rootWalletId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AhwBna = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletPassword");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.gEmmrt = stringExtra2;
        this.OLrzqt = getIntent().getIntExtra("cloudBackupMode", 0);
        this.AEQbTJ = getIntent().getIntExtra("backupCloudType", 1);
        this.valueOf = getIntent().getBooleanExtra("jump_home", true);
        boolean booleanExtra = getIntent().getBooleanExtra("newSet", false);
        if (!booleanExtra) {
            AbstractC16293ehG abstractC16293ehG2 = this.djBIcL;
            if (abstractC16293ehG2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG2 = null;
            }
            abstractC16293ehG2.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallbackStubApi23));
        } else {
            AbstractC16293ehG abstractC16293ehG3 = this.djBIcL;
            if (abstractC16293ehG3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG3 = null;
            }
            abstractC16293ehG3.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendRequest));
        }
        C18832fpp c18832fpp = new C18832fpp(this);
        c18832fpp.EZpvd(this.OLrzqt);
        c18832fpp.KWHzl(this.AEQbTJ);
        c18832fpp.OLrzqt(this.valueOf);
        this.KWHzl = c18832fpp.AEQbTJ();
        C33516mxt.EZpvd(this);
        this.copydefault = true;
        AbstractC16293ehG abstractC16293ehG4 = this.djBIcL;
        if (abstractC16293ehG4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16293ehG = abstractC16293ehG4;
        }
        final C14775drn c14775drn = abstractC16293ehG.AEQbTJ;
        c14775drn.setOnTextChanged(new Function1() { // from class: o.foh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18774foj.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        c14775drn.setOnFocusChanged(new Function1() { // from class: o.foi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18774foj.AEQbTJ(c14775drn, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        final C14775drn c14775drn2 = abstractC16293ehG.KWHzl;
        c14775drn2.setOnTextChanged(new Function1() { // from class: o.fol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18774foj.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        });
        c14775drn2.setOnEditorActionListener(new Function0() { // from class: o.fon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18774foj.copydefault(c14775drn2, this, abstractC16293ehG);
            }
        });
        c14775drn2.setOnFocusChanged(new Function1() { // from class: o.foq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18774foj.EZpvd(c14775drn2, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        abstractC16293ehG.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.fom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18774foj.KWHzl(this.EZpvd, view);
            }
        });
        C52794wYp c52794wYp = abstractC16293ehG.copydefault;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        copydefault();
        OLrzqt(booleanExtra);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18774foj.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final Unit OLrzqt(ActivityC18774foj activityC18774foj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18774foj.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C14775drn c14775drn, boolean z) {
        if (z) {
            c14775drn.values();
        } else {
            c14775drn.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC18774foj activityC18774foj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18774foj.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C14775drn c14775drn, ActivityC18774foj activityC18774foj, AbstractC16293ehG abstractC16293ehG) {
        java.lang.String string;
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx = c14775drn.AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() >= 6) {
            activityC18774foj.OLrzqt();
        } else {
            abstractC16293ehG.KWHzl.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDisplayOptions));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C14775drn c14775drn, boolean z) {
        if (z) {
            c14775drn.values();
        } else {
            c14775drn.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC18774foj activityC18774foj, android.view.View view) {
        activityC18774foj.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.foj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC18774foj OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC18774foj activityC18774foj) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = activityC18774foj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ();
                this.OLrzqt.OLrzqt();
            }
        }
    }

    public static final void OLrzqt(ActivityC18774foj activityC18774foj) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18774foj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.copydefault) {
            this.copydefault = false;
            AbstractC16293ehG abstractC16293ehG = this.djBIcL;
            AbstractC16293ehG abstractC16293ehG2 = null;
            if (abstractC16293ehG == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG = null;
            }
            abstractC16293ehG.AEQbTJ.requestFocusFromTouch();
            AbstractC16293ehG abstractC16293ehG3 = this.djBIcL;
            if (abstractC16293ehG3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16293ehG2 = abstractC16293ehG3;
            }
            abstractC16293ehG2.AEQbTJ.setState(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt() {
        java.lang.String strKWHzl = KWHzl();
        if (strKWHzl != null) {
            AbstractC16293ehG abstractC16293ehG = this.djBIcL;
            java.lang.String str = null;
            if (abstractC16293ehG == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG = null;
            }
            C52794wYp.startLoading$default(abstractC16293ehG.copydefault, 0L, 1, null);
            AbstractC16293ehG abstractC16293ehG2 = this.djBIcL;
            if (abstractC16293ehG2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG2 = null;
            }
            abstractC16293ehG2.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSearchResult));
            Function1<? super C9697baV, Unit> function1 = new Function1() { // from class: o.fov
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18774foj.OLrzqt(this.copydefault, (C9697baV) obj);
                }
            };
            InterfaceC18835fps interfaceC18835fps = this.KWHzl;
            if (interfaceC18835fps == null) {
                Intrinsics.gEmmrt("");
                interfaceC18835fps = null;
            }
            java.lang.String str2 = this.AhwBna;
            if (str2 == null) {
                Intrinsics.gEmmrt("");
                str2 = null;
            }
            java.lang.String str3 = this.gEmmrt;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                str = str3;
            }
            interfaceC18835fps.KWHzl(str2, str, strKWHzl, function1);
        }
    }

    public static final Unit OLrzqt(ActivityC18774foj activityC18774foj, C9697baV c9697baV) {
        Intrinsics.checkNotNullParameter(c9697baV, "");
        boolean zEZpvd = c9697baV.EZpvd();
        java.lang.String str = "[" + c9697baV.KWHzl() + "]" + c9697baV.copydefault();
        CloudBackupWalletType cloudBackupWalletType = CloudBackupWalletType.HD;
        CloudBackupEventType cloudBackupEventType = CloudBackupEventType.InitialWalletCloudBackup;
        java.lang.String str2 = activityC18774foj.AhwBna;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        C14493dmW.KWHzl(cloudBackupWalletType, cloudBackupEventType, str2, zEZpvd ? "success" : str, zEZpvd, zEZpvd ? CloudBackupEventCode.SUCCESS : CloudBackupEventCode.UNKNOWN_ERROR, activityC18774foj.AEQbTJ, c9697baV.OLrzqt());
        if (!activityC18774foj.isFinishing()) {
            AbstractC16293ehG abstractC16293ehG = activityC18774foj.djBIcL;
            if (abstractC16293ehG == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG = null;
            }
            abstractC16293ehG.copydefault.fIwbmz();
            AbstractC16293ehG abstractC16293ehG2 = activityC18774foj.djBIcL;
            if (abstractC16293ehG2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG2 = null;
            }
            abstractC16293ehG2.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g));
            if (zEZpvd) {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.BackHandlerlambda0), 0, 1, (java.lang.Object) null);
            } else if (str.length() == 0) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatSearchCallback), 0, 1, (java.lang.Object) null);
            } else {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private final java.lang.String KWHzl() {
        java.lang.String string;
        java.lang.String string2;
        android.text.Editable text;
        android.text.Editable text2;
        AbstractC16293ehG abstractC16293ehG = this.djBIcL;
        if (abstractC16293ehG == null) {
            Intrinsics.gEmmrt("");
            abstractC16293ehG = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC16293ehG.AEQbTJ.AkhnZx();
        if (c55001xbhAkhnZx == null || (text2 = c55001xbhAkhnZx.getText()) == null || (string = text2.toString()) == null) {
            string = "";
        }
        AbstractC16293ehG abstractC16293ehG2 = this.djBIcL;
        if (abstractC16293ehG2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16293ehG2 = null;
        }
        C55001xbh c55001xbhAkhnZx2 = abstractC16293ehG2.KWHzl.AkhnZx();
        if (c55001xbhAkhnZx2 == null || (text = c55001xbhAkhnZx2.getText()) == null || (string2 = text.toString()) == null) {
            string2 = "";
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
            AbstractC16293ehG abstractC16293ehG3 = this.djBIcL;
            if (abstractC16293ehG3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG3 = null;
            }
            abstractC16293ehG3.KWHzl.values();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) string2)) {
                return string;
            }
            AbstractC16293ehG abstractC16293ehG4 = this.djBIcL;
            if (abstractC16293ehG4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG4 = null;
            }
            abstractC16293ehG4.KWHzl.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.stop));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        C33570myu.copydefault((android.app.Activity) this);
        AbstractC16293ehG abstractC16293ehG = this.djBIcL;
        AbstractC16293ehG abstractC16293ehG2 = null;
        if (abstractC16293ehG == null) {
            Intrinsics.gEmmrt("");
            abstractC16293ehG = null;
        }
        abstractC16293ehG.AEQbTJ.clearFocus();
        AbstractC16293ehG abstractC16293ehG3 = this.djBIcL;
        if (abstractC16293ehG3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16293ehG2 = abstractC16293ehG3;
        }
        abstractC16293ehG2.KWHzl.clearFocus();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault() {
        boolean z;
        android.text.Editable text;
        android.text.Editable text2;
        AbstractC16293ehG abstractC16293ehG = this.djBIcL;
        java.lang.Integer numValueOf = null;
        if (abstractC16293ehG == null) {
            Intrinsics.gEmmrt("");
            abstractC16293ehG = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC16293ehG.AEQbTJ.AkhnZx();
        if (C33129mqd.copydefault((java.lang.Object) ((c55001xbhAkhnZx == null || (text2 = c55001xbhAkhnZx.getText()) == null) ? null : java.lang.Integer.valueOf(text2.length())), (java.lang.Object) 6)) {
            C55001xbh c55001xbhAkhnZx2 = abstractC16293ehG.KWHzl.AkhnZx();
            if (c55001xbhAkhnZx2 != null && (text = c55001xbhAkhnZx2.getText()) != null) {
                numValueOf = java.lang.Integer.valueOf(text.length());
            }
            if (C33129mqd.copydefault((java.lang.Object) numValueOf, (java.lang.Object) 6)) {
                z = true;
            }
        } else {
            z = false;
        }
        abstractC16293ehG.copydefault.setEnabled(z);
    }

    public final void OLrzqt(boolean z) {
        AbstractC16293ehG abstractC16293ehG = null;
        if (!z) {
            java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV) + "\u200b";
            if (str == null) {
                str = "--";
            }
            java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.newArray, C56424yEw.gEmmrt(C56390yDp.OLrzqt("CloudName", C14392dkb.AEQbTJ.KWHzl(this, this.AEQbTJ)), C56390yDp.OLrzqt("learnmore", str))) + "\u200b";
            java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.foo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18774foj.AEQbTJ((java.util.List) obj);
                }
            }, 14, null);
            AbstractC16293ehG abstractC16293ehG2 = this.djBIcL;
            if (abstractC16293ehG2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG2 = null;
            }
            abstractC16293ehG2.djBIcL.setText(charSequence);
            AbstractC16293ehG abstractC16293ehG3 = this.djBIcL;
            if (abstractC16293ehG3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16293ehG3 = null;
            }
            android.widget.TextView textView = abstractC16293ehG3.djBIcL;
            AbstractC16293ehG abstractC16293ehG4 = this.djBIcL;
            if (abstractC16293ehG4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16293ehG = abstractC16293ehG4;
            }
            textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(abstractC16293ehG.djBIcL, str2, str, new Function0() { // from class: o.fot
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC18774foj.valueOf(this.AEQbTJ);
                }
            }));
            return;
        }
        AbstractC16293ehG abstractC16293ehG5 = this.djBIcL;
        if (abstractC16293ehG5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16293ehG = abstractC16293ehG5;
        }
        abstractC16293ehG.djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaItemFlags));
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC18774foj activityC18774foj) {
        activityC18774foj.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getHeight));
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.lang.String str) {
        C33570myu.copydefault((android.app.Activity) this);
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    /* JADX INFO: renamed from: o.foj$Application */
    public static final class Application extends androidx.fragment.app.Fragment {
        public boolean EZpvd;
        public int KWHzl;
        public Function0<Unit> copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public int OLrzqt = 1;
        public boolean AEQbTJ = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, boolean z, boolean z2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.gEmmrt = str;
            this.djBIcL = str2;
            this.KWHzl = i;
            this.OLrzqt = i2;
            this.EZpvd = z;
            this.AEQbTJ = z2;
            this.copydefault = function0;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            if (bundle != null) {
                getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
                return;
            }
            android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) ActivityC18774foj.class);
            java.lang.String str = this.gEmmrt;
            java.lang.String str2 = null;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            intent.putExtra("rootWalletId", str);
            java.lang.String str3 = this.djBIcL;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                str2 = str3;
            }
            intent.putExtra("walletPassword", str2);
            intent.putExtra("cloudBackupMode", this.KWHzl);
            intent.putExtra("backupCloudType", this.OLrzqt);
            intent.putExtra("newSet", this.EZpvd);
            intent.putExtra("jump_home", this.AEQbTJ);
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.fou
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    ActivityC18774foj.Application.KWHzl(this.AEQbTJ, (ActivityResult) obj);
                }
            }).launch(intent);
        }

        public static final void KWHzl(Application application, ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                Function0<Unit> function0 = application.copydefault;
                if (function0 == null) {
                    Intrinsics.gEmmrt("");
                    function0 = null;
                }
                function0.invoke();
            }
            application.getParentFragmentManager().beginTransaction().remove(application).commitAllowingStateLoss();
        }
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
    public void onStart() {
        super.onStart();
    }
}
