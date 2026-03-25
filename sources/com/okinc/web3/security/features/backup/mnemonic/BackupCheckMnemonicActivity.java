package com.okinc.web3.security.features.backup.mnemonic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.web3.security.databinding.ActivityBackupShowMnemonicBinding;
import com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33013moT;
import o.C57407yho;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BackupCheckMnemonicActivity extends AbstractActivityC33013moT {
    private static BackupMnemonicListener tempListener;
    private ActivityBackupShowMnemonicBinding dataBinding;
    private BackupMnemonicViewModel mViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BackupMnemonicListener getTempListener() {
            return BackupCheckMnemonicActivity.tempListener;
        }

        public final void setTempListener(BackupMnemonicListener backupMnemonicListener) {
            BackupCheckMnemonicActivity.tempListener = backupMnemonicListener;
        }

        public final void startActivity(@NotNull Activity activity, @NotNull String str, @NotNull String str2, boolean z, @NotNull BackupMnemonicListener backupMnemonicListener) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(backupMnemonicListener, "");
            setTempListener(backupMnemonicListener);
            Intent intent = new Intent(activity, (Class<?>) BackupCheckMnemonicActivity.class);
            intent.putExtra("mnemonic", str);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            intent.putExtra("startForResult", z);
            if (z) {
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
        BackupCheckMnemonicFragment.Companion companion = BackupCheckMnemonicFragment.Companion;
        String stringExtra = getIntent().getStringExtra("mnemonic");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
        getSupportFragmentManager().beginTransaction().replace(C57407yho.Application.DbNXlk, companion.newInstance(stringExtra, stringExtra2 != null ? stringExtra2 : "", getIntent().getBooleanExtra("startForResult", false)), "BackupCheckMnemonicFragment").commitAllowingStateLoss();
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

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
