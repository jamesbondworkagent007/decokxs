package com.reown.android.push.notifications;

import com.reown.android.Core;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface DecryptMessageUseCaseInterface {
    Object decryptNotification(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Core.Model.Message, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation);
}
