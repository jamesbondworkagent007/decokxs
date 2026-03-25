package com.okinc.web3.security.listener;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public interface BackupMnemonicListener {
    void onCheckMnemonicPassed(@NotNull Activity activity, @NotNull Function0<Unit> function0);

    void onOpenMnemonicArticle(@NotNull Activity activity);
}
