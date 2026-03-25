package com.reown.android.internal.common;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class WalletConnectScopeKt {
    public static final CompletableJob job;
    public static /* synthetic */ CoroutineScope scope;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CoroutineScope getScope() {
        return scope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void setScope(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        scope = coroutineScope;
    }

    static {
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        job = completableJobSupervisorJob$default;
        scope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(Dispatchers.getIO()));
    }
}
