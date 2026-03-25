package com.okinc.web3.security.features.backup.mnemonic;

import androidx.lifecycle.ViewModel;
import com.okinc.web3.security.listener.BackupMnemonicListener;

/* JADX INFO: loaded from: classes19.dex */
public final class BackupMnemonicViewModel extends ViewModel {
    public static final int $stable = 8;
    private BackupMnemonicListener listener;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackupMnemonicListener getListener() {
        return this.listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(BackupMnemonicListener backupMnemonicListener) {
        this.listener = backupMnemonicListener;
    }
}
