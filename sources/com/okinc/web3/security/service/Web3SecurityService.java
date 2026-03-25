package com.okinc.web3.security.service;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.listener.ImportWalletListener;
import com.okinc.web3.security.model.ImportMode;
import com.okinc.web3.security.model.PrivateKeyInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface Web3SecurityService {
    void showPrivateKeyBottomSheet(@NotNull FragmentManager fragmentManager, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    void showPrivateKeyDialog(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void startBackupMnemonic(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, @NotNull BackupMnemonicListener backupMnemonicListener);

    void startBackupPrivateKeys(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull ArrayList<PrivateKeyInfo> arrayList);

    void startImportingWallet(@NotNull Context context, @NotNull ImportMode importMode, @NotNull ImportWalletListener importWalletListener);
}
