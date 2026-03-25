package com.reown.android.internal.common.modal.domain.usecase;

import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetInstalledWalletsIdsUseCaseInterface {
    Object invoke(@NotNull String str, @NotNull Continuation<? super List<String>> continuation);
}
