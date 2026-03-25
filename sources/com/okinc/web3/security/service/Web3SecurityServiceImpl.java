package com.okinc.web3.security.service;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicActivity;
import com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity;
import com.okinc.web3.security.features.backup.privatekey.PrivateKeyBottomSheet;
import com.okinc.web3.security.features.importing.activity.ImportWalletActivity;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.listener.ImportWalletListener;
import com.okinc.web3.security.model.ImportMode;
import com.okinc.web3.security.model.PrivateKeyInfo;
import com.okinc.web3.security.utils.WrapApi;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C55326xho;
import o.C57407yho;
import o.ViewOnClickListenerC54939xaY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Web3SecurityServiceImpl implements Web3SecurityService {
    public static final int $stable = 0;

    @Override // com.okinc.web3.security.service.Web3SecurityService
    public void startImportingWallet(@NotNull Context context, @NotNull ImportMode importMode, @NotNull ImportWalletListener importWalletListener) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(importMode, "");
        Intrinsics.checkNotNullParameter(importWalletListener, "");
        ImportWalletActivity.Companion.start(context, importMode, importWalletListener);
    }

    @Override // com.okinc.web3.security.service.Web3SecurityService
    public void startBackupMnemonic(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, @NotNull BackupMnemonicListener backupMnemonicListener) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(backupMnemonicListener, "");
        BackupShowMnemonicActivity.Companion.startActivity(activity, str, str2, str3, z, z2, backupMnemonicListener);
    }

    @Override // com.okinc.web3.security.service.Web3SecurityService
    public void showPrivateKeyBottomSheet(@NotNull FragmentManager fragmentManager, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        PrivateKeyBottomSheet privateKeyBottomSheetNewInstance = PrivateKeyBottomSheet.Companion.newInstance(str, str2, str3, str4);
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.add(privateKeyBottomSheetNewInstance, "PrivateKeyDialogFragment");
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.okinc.web3.security.service.Web3SecurityService
    public void showPrivateKeyDialog(@NotNull final Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        final String strDataUnwrap = WrapApi.dataUnwrap(C43246rlf.OLrzqt.valueOf(), str2);
        viewOnClickListenerC54939xaY.EZpvd(strDataUnwrap);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "复制(copy)", new View.OnClickListener() { // from class: com.okinc.web3.security.service.Web3SecurityServiceImpl$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Web3SecurityServiceImpl.showPrivateKeyDialog$lambda$3$lambda$1(context, viewOnClickListenerC54939xaY, strDataUnwrap, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ("取消(cancel)", new View.OnClickListener() { // from class: com.okinc.web3.security.service.Web3SecurityServiceImpl$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                viewOnClickListenerC54939xaY.dismiss();
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrivateKeyDialog$lambda$3$lambda$1(Context context, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, String str, View view) {
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(viewOnClickListenerC54939xaY.getClass().getName(), str));
        C55326xho.toastWithSuccessfulIcon$default(C57407yho.Activity.zLjUOn, 0, 1, (Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // com.okinc.web3.security.service.Web3SecurityService
    public void startBackupPrivateKeys(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull ArrayList<PrivateKeyInfo> arrayList) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        BackupPrivateKeyActivity.Companion.startActivity(activity, str, str2, arrayList);
    }
}
