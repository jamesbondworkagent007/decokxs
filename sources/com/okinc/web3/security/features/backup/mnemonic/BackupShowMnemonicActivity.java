package com.okinc.web3.security.features.backup.mnemonic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web3.security.databinding.ActivityBackupShowMnemonicBinding;
import com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33013moT;
import o.C32866mlf;
import o.C33440mwW;
import o.C33570myu;
import o.C55296xhK;
import o.C57407yho;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BackupShowMnemonicActivity extends AbstractActivityC33013moT {
    private static final String EXTRA_BACKED_UP = "backedUp";
    private static final String EXTRA_MNEMONIC = "mnemonic";
    private static final String EXTRA_PASSWORD = "password";
    private static final String EXTRA_START_FOR_RESULT = "startForResult";
    private static final String EXTRA_TITLE = "title";
    private static final int REQUEST_CODE = 100;
    private static BackupMnemonicListener tempListener;
    private ActivityBackupShowMnemonicBinding dataBinding;
    private final String fragmentTag = "BackupShowMnemonicFragment";
    private boolean isShowScreen;
    private boolean mIsPermissionRejected;
    private BackupMnemonicViewModel mViewModel;
    private C33440mwW.TaskDescription screenshotListener;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // o.AbstractActivityC33041mov, o.InterfaceC48850udU
    public boolean canScreenshot() {
        return false;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BackupMnemonicListener getTempListener$OKWeb3Security_web3_security_lib() {
            return BackupShowMnemonicActivity.tempListener;
        }

        public final void setTempListener$OKWeb3Security_web3_security_lib(BackupMnemonicListener backupMnemonicListener) {
            BackupShowMnemonicActivity.tempListener = backupMnemonicListener;
        }

        public final void startActivity(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, @NotNull BackupMnemonicListener backupMnemonicListener) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(backupMnemonicListener, "");
            setTempListener$OKWeb3Security_web3_security_lib(backupMnemonicListener);
            Intent intent = new Intent(activity, (Class<?>) BackupShowMnemonicActivity.class);
            intent.putExtra("title", str);
            intent.putExtra(BackupShowMnemonicActivity.EXTRA_MNEMONIC, str2);
            intent.putExtra("password", str3);
            intent.putExtra(BackupShowMnemonicActivity.EXTRA_BACKED_UP, z);
            intent.putExtra(BackupShowMnemonicActivity.EXTRA_START_FOR_RESULT, z2);
            if (z2) {
                activity.startActivityForResult(intent, 100);
            } else {
                activity.startActivity(intent);
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dataBinding = (ActivityBackupShowMnemonicBinding) DataBindingUtil.setContentView(this, C57407yho.StateListAnimator.AEQbTJ);
        BackupMnemonicViewModel backupMnemonicViewModel = (BackupMnemonicViewModel) new ViewModelProvider(this).get(BackupMnemonicViewModel.class);
        this.mViewModel = backupMnemonicViewModel;
        if (backupMnemonicViewModel == null) {
            Intrinsics.gEmmrt("");
            backupMnemonicViewModel = null;
        }
        backupMnemonicViewModel.setListener(tempListener);
        tempListener = null;
        ActivityBackupShowMnemonicBinding activityBackupShowMnemonicBinding = this.dataBinding;
        if (activityBackupShowMnemonicBinding == null) {
            Intrinsics.gEmmrt("");
            activityBackupShowMnemonicBinding = null;
        }
        activityBackupShowMnemonicBinding.appBar.setAppBarTitle(getIntent().getStringExtra("title"));
        ActivityBackupShowMnemonicBinding activityBackupShowMnemonicBinding2 = this.dataBinding;
        if (activityBackupShowMnemonicBinding2 == null) {
            Intrinsics.gEmmrt("");
            activityBackupShowMnemonicBinding2 = null;
        }
        final AppCompatImageView appCompatImageView = activityBackupShowMnemonicBinding2.ivTip;
        appCompatImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C33570myu.OLrzqt();
        appCompatImageView.setLayoutParams(layoutParams2);
        final long j = 1000;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicActivity$onCreate$lambda$2$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(appCompatImageView) > j || (appCompatImageView instanceof Checkable)) {
                    C55296xhK.OLrzqt(appCompatImageView, jCurrentTimeMillis);
                    BackupMnemonicViewModel backupMnemonicViewModel2 = this.mViewModel;
                    if (backupMnemonicViewModel2 == null) {
                        Intrinsics.gEmmrt("");
                        backupMnemonicViewModel2 = null;
                    }
                    BackupMnemonicListener listener = backupMnemonicViewModel2.getListener();
                    if (listener != null) {
                        listener.onOpenMnemonicArticle(this);
                    }
                }
            }
        });
        BackupShowMnemonicFragment.Companion companion = BackupShowMnemonicFragment.Companion;
        String stringExtra = getIntent().getStringExtra(EXTRA_MNEMONIC);
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("password");
        getSupportFragmentManager().beginTransaction().replace(C57407yho.Application.DbNXlk, companion.newInstance(stringExtra, stringExtra2 != null ? stringExtra2 : "", getIntent().getBooleanExtra(EXTRA_BACKED_UP, false), getIntent().getBooleanExtra(EXTRA_START_FOR_RESULT, false)), this.fragmentTag).commitAllowingStateLoss();
        C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedDisplay_Page_View, (TrackChannel[]) null, new Function1() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicActivity$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupShowMnemonicActivity.onCreate$lambda$3((EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("already_have_wallet", "yes", true));
        return Unit.INSTANCE;
    }

    private final boolean checkReadPermission() {
        return ContextCompat.checkSelfPermission(this, Build.VERSION.SDK_INT < 33 ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_IMAGES") == 0;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!this.mIsPermissionRejected && checkReadPermission()) {
            C33440mwW.TaskDescription taskDescription = new C33440mwW.TaskDescription() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicActivity.onStart.1
                @Override // o.C33440mwW.TaskDescription
                public void onScreenShot(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    C32866mlf.onEvent$default(Web3SecurityTrackEvent.SECURITY_EVENT_MNEMONIC_SCREENSHOT, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                    if (BackupShowMnemonicActivity.this.isShowScreen) {
                        return;
                    }
                    BackupShowMnemonicActivity.this.isShowScreen = true;
                    C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedDisplay_ScreenShot_View, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                }
            };
            this.screenshotListener = taskDescription;
            C33440mwW.copydefault.EZpvd(taskDescription);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C33440mwW.TaskDescription taskDescription = this.screenshotListener;
        if (taskDescription != null) {
            C33440mwW.copydefault.KWHzl(taskDescription);
        }
        this.screenshotListener = null;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(this.fragmentTag);
        BackupShowMnemonicFragment backupShowMnemonicFragment = fragmentFindFragmentByTag instanceof BackupShowMnemonicFragment ? (BackupShowMnemonicFragment) fragmentFindFragmentByTag : null;
        if (backupShowMnemonicFragment != null) {
            backupShowMnemonicFragment.showMaskStatus();
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            finish();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
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
}
