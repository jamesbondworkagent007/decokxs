package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.CloudBackupWalletType;
import com.okinc.business.defi.common.track.CloudBackupEventCode;
import com.okinc.business.defi.common.track.CloudBackupEventType;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18774foj;
import o.C13754dXa;
import o.C52761wXj;
import o.Cfor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.for, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Cfor extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public InterfaceC18835fps KWHzl;
    public int OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public AbstractC16305ehS valueOf;
    public int copydefault = 1;
    public boolean AhwBna = true;

    /* JADX INFO: renamed from: o.for$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.for.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static final Unit OLrzqt() {
            return Unit.INSTANCE;
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, boolean z, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function0, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            TaskDescription taskDescription = new TaskDescription();
            taskDescription.copydefault(str, str2, str3, i, i2, z, function0);
            fragmentTransactionBeginTransaction.add(taskDescription, (java.lang.String) null).commitAllowingStateLoss();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("rootWalletId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.gEmmrt = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletPassword");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.djBIcL = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("cloudPasswordHash");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.AEQbTJ = stringExtra3;
        this.OLrzqt = getIntent().getIntExtra("cloudBackupMode", 0);
        this.copydefault = getIntent().getIntExtra("backupCloudType", 1);
        this.AhwBna = getIntent().getBooleanExtra("jump_home", true);
        C18832fpp c18832fpp = new C18832fpp(this);
        c18832fpp.EZpvd(this.OLrzqt);
        c18832fpp.KWHzl(this.copydefault);
        c18832fpp.OLrzqt(this.AhwBna);
        this.KWHzl = c18832fpp.AEQbTJ();
        this.valueOf = (AbstractC16305ehS) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.RJOkX);
        C33516mxt.EZpvd(this);
        this.AYXKKw = true;
        final AbstractC16305ehS abstractC16305ehS = this.valueOf;
        if (abstractC16305ehS == null) {
            Intrinsics.gEmmrt("");
            abstractC16305ehS = null;
        }
        final C14775drn c14775drn = abstractC16305ehS.copydefault;
        c14775drn.setOnTextChanged(new Function1() { // from class: o.foy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return Cfor.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        });
        c14775drn.setOnEditorActionListener(new Function0() { // from class: o.fox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return Cfor.EZpvd(c14775drn, this, abstractC16305ehS);
            }
        });
        c14775drn.setOnFocusChanged(new Function1() { // from class: o.fow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return Cfor.OLrzqt(c14775drn, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        abstractC16305ehS.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.foz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                Cfor.copydefault(this.KWHzl, view);
            }
        });
        C8003auW.copydefault(abstractC16305ehS.AEQbTJ).throttleFirst(5L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.foA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                Cfor.copydefault(this.OLrzqt, obj);
            }
        });
        wYC wycCopydefault = abstractC16305ehS.OLrzqt.copydefault();
        if (wycCopydefault != null) {
            wycCopydefault.setImageResource(C52761wXj.TaskDescription.onStatusChanged);
            wycCopydefault.setPaddingRelative(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
            wycCopydefault.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(wycCopydefault.getContext(), C52761wXj.Activity.fdOvFl)));
        }
        C55258xgZ c55258xgZ = abstractC16305ehS.OLrzqt;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.foC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                Cfor.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final Unit KWHzl(Cfor cfor, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        cfor.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C14775drn c14775drn, Cfor cfor, AbstractC16305ehS abstractC16305ehS) {
        java.lang.String string;
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx = c14775drn.AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() >= 6) {
            cfor.copydefault();
        } else {
            abstractC16305ehS.copydefault.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDisplayOptions));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C14775drn c14775drn, boolean z) {
        if (z) {
            c14775drn.values();
        } else {
            c14775drn.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Cfor cfor, android.view.View view) {
        cfor.KWHzl();
    }

    public static final void copydefault(Cfor cfor, java.lang.Object obj) {
        C32866mlf.onEvent$default("Web3Onboarding_VerifyBackupPassword_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        cfor.KWHzl();
        cfor.copydefault();
    }

    /* JADX INFO: renamed from: o.for$Activity */
    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            Cfor.this.setResult(-1);
            Cfor.this.finish();
        }
    }

    /* JADX INFO: renamed from: o.for$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Cfor EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Cfor cfor) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = cfor;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.foj.StateListAnimator.start$default(o.foj$StateListAnimator, androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, int, int, boolean, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC18774foj.StateListAnimator stateListAnimator = ActivityC18774foj.Companion;
                androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                java.lang.String str = this.EZpvd.gEmmrt;
                java.lang.String str2 = null;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
                java.lang.String str3 = this.EZpvd.djBIcL;
                if (str3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    str2 = str3;
                }
                stateListAnimator.KWHzl(supportFragmentManager, str, str2, (64 & 8) != 0 ? 0 : this.EZpvd.OLrzqt, (64 & 16) != 0 ? 1 : this.EZpvd.copydefault, (64 & 32) != 0 ? false : true, (64 & 64) != 0, (64 & 128) != 0 ? new Function0() { // from class: o.fos
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC18774foj.StateListAnimator.copydefault();
                    }
                } : this.EZpvd.new Activity());
            }
        }
    }

    public static final void gEmmrt(Cfor cfor) {
        rVN.reportFullyDrawn$default((android.app.Activity) cfor, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.AYXKKw) {
            this.AYXKKw = false;
            AbstractC16305ehS abstractC16305ehS = this.valueOf;
            AbstractC16305ehS abstractC16305ehS2 = null;
            if (abstractC16305ehS == null) {
                Intrinsics.gEmmrt("");
                abstractC16305ehS = null;
            }
            abstractC16305ehS.copydefault.requestFocusFromTouch();
            AbstractC16305ehS abstractC16305ehS3 = this.valueOf;
            if (abstractC16305ehS3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16305ehS2 = abstractC16305ehS3;
            }
            abstractC16305ehS2.copydefault.setState(1);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dmW.trackCloudBackupEvent$default(com.okinc.business.defi.api.bean.CloudBackupWalletType, com.okinc.business.defi.common.track.CloudBackupEventType, java.lang.String, java.lang.String, boolean, com.okinc.business.defi.common.track.CloudBackupEventCode, int, java.lang.String, int, java.lang.Object):void */
    private final void copydefault() {
        android.text.Editable text;
        java.lang.String string;
        java.lang.String str;
        AbstractC16305ehS abstractC16305ehS = this.valueOf;
        AbstractC16305ehS abstractC16305ehS2 = null;
        java.lang.String str2 = null;
        if (abstractC16305ehS == null) {
            Intrinsics.gEmmrt("");
            abstractC16305ehS = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC16305ehS.copydefault.AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) {
            return;
        }
        AbstractC16305ehS abstractC16305ehS3 = this.valueOf;
        if (abstractC16305ehS3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16305ehS3 = null;
        }
        C52794wYp.startLoading$default(abstractC16305ehS3.AEQbTJ, 0L, 1, null);
        java.lang.String strEZpvd = xXX.EZpvd.EZpvd(string);
        java.lang.String str3 = this.AEQbTJ;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) str3)) {
            AbstractC16305ehS abstractC16305ehS4 = this.valueOf;
            if (abstractC16305ehS4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16305ehS4 = null;
            }
            abstractC16305ehS4.copydefault.values();
            Function1<? super C9697baV, Unit> function1 = new Function1() { // from class: o.foF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return Cfor.OLrzqt(this.AEQbTJ, (C9697baV) obj);
                }
            };
            InterfaceC18835fps interfaceC18835fps = this.KWHzl;
            if (interfaceC18835fps == null) {
                Intrinsics.gEmmrt("");
                interfaceC18835fps = null;
            }
            java.lang.String str4 = this.gEmmrt;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
                str4 = null;
            }
            java.lang.String str5 = this.djBIcL;
            if (str5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                str2 = str5;
            }
            interfaceC18835fps.KWHzl(str4, str2, string, function1);
            return;
        }
        CloudBackupWalletType cloudBackupWalletType = CloudBackupWalletType.HD;
        CloudBackupEventType cloudBackupEventType = CloudBackupEventType.RegularWalletCloudBackup;
        java.lang.String str6 = this.gEmmrt;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str6;
        }
        C14493dmW.KWHzl(cloudBackupWalletType, cloudBackupEventType, str, "Password hash mismatch", false, CloudBackupEventCode.PASSWORD_HASH_MISMATCH, this.copydefault, (128 & 128) != 0 ? "" : null);
        AbstractC16305ehS abstractC16305ehS5 = this.valueOf;
        if (abstractC16305ehS5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16305ehS5 = null;
        }
        abstractC16305ehS5.AEQbTJ.fIwbmz();
        AbstractC16305ehS abstractC16305ehS6 = this.valueOf;
        if (abstractC16305ehS6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16305ehS2 = abstractC16305ehS6;
        }
        abstractC16305ehS2.copydefault.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNavigationItemCount));
    }

    public static final Unit OLrzqt(Cfor cfor, C9697baV c9697baV) {
        Intrinsics.checkNotNullParameter(c9697baV, "");
        boolean zEZpvd = c9697baV.EZpvd();
        java.lang.String str = "[" + c9697baV.KWHzl() + "]" + c9697baV.copydefault();
        CloudBackupWalletType cloudBackupWalletType = CloudBackupWalletType.HD;
        CloudBackupEventType cloudBackupEventType = CloudBackupEventType.RegularWalletCloudBackup;
        java.lang.String str2 = cfor.gEmmrt;
        AbstractC16305ehS abstractC16305ehS = null;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        C14493dmW.KWHzl(cloudBackupWalletType, cloudBackupEventType, str2, str, zEZpvd, c9697baV.EZpvd() ? CloudBackupEventCode.SUCCESS : CloudBackupEventCode.UNKNOWN_ERROR, cfor.copydefault, c9697baV.OLrzqt());
        if (!cfor.isFinishing()) {
            if (zEZpvd) {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSelectedTab), 0, 1, (java.lang.Object) null);
            } else {
                if (str.length() == 0) {
                    C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatSearchCallback), 0, 1, (java.lang.Object) null);
                } else {
                    C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
                }
                AbstractC16305ehS abstractC16305ehS2 = cfor.valueOf;
                if (abstractC16305ehS2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16305ehS = abstractC16305ehS2;
                }
                abstractC16305ehS.AEQbTJ.fIwbmz();
            }
        }
        cfor.dismissLoading();
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        C33570myu.copydefault((android.app.Activity) this);
        AbstractC16305ehS abstractC16305ehS = this.valueOf;
        if (abstractC16305ehS == null) {
            Intrinsics.gEmmrt("");
            abstractC16305ehS = null;
        }
        abstractC16305ehS.copydefault.clearFocus();
    }

    private final void OLrzqt() {
        android.text.Editable text;
        AbstractC16305ehS abstractC16305ehS = this.valueOf;
        java.lang.Integer numValueOf = null;
        if (abstractC16305ehS == null) {
            Intrinsics.gEmmrt("");
            abstractC16305ehS = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC16305ehS.copydefault.AkhnZx();
        if (c55001xbhAkhnZx != null && (text = c55001xbhAkhnZx.getText()) != null) {
            numValueOf = java.lang.Integer.valueOf(text.length());
        }
        abstractC16305ehS.AEQbTJ.setEnabled(C33129mqd.copydefault((java.lang.Object) numValueOf, (java.lang.Object) 6));
    }

    /* JADX INFO: renamed from: o.for$TaskDescription */
    public static final class TaskDescription extends androidx.fragment.app.Fragment {
        public Function0<Unit> AEQbTJ;
        public java.lang.String AhwBna;
        public int EZpvd;
        public java.lang.String KWHzl;
        public int OLrzqt = 1;
        public boolean copydefault = true;
        public java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, boolean z, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.djBIcL = str;
            this.AhwBna = str2;
            this.KWHzl = str3;
            this.EZpvd = i;
            this.OLrzqt = i2;
            this.copydefault = z;
            this.AEQbTJ = function0;
        }

        public static final Unit EZpvd() {
            return Unit.INSTANCE;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            if (bundle != null) {
                getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
                return;
            }
            android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) Cfor.class);
            java.lang.String str = this.djBIcL;
            java.lang.String str2 = null;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            intent.putExtra("rootWalletId", str);
            java.lang.String str3 = this.AhwBna;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
                str3 = null;
            }
            intent.putExtra("walletPassword", str3);
            java.lang.String str4 = this.KWHzl;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                str2 = str4;
            }
            intent.putExtra("cloudPasswordHash", str2);
            intent.putExtra("cloudBackupMode", this.EZpvd);
            intent.putExtra("backupCloudType", this.OLrzqt);
            intent.putExtra("jump_home", this.copydefault);
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.foD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    Cfor.TaskDescription.OLrzqt(this.AEQbTJ, (ActivityResult) obj);
                }
            }).launch(intent);
        }

        public static final void OLrzqt(TaskDescription taskDescription, ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                Function0<Unit> function0 = taskDescription.AEQbTJ;
                if (function0 == null) {
                    Intrinsics.gEmmrt("");
                    function0 = null;
                }
                function0.invoke();
            }
            taskDescription.getParentFragmentManager().beginTransaction().remove(taskDescription).commitAllowingStateLoss();
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
