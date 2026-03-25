package com.reown.android.internal.common.modal.domain.usecase;

import com.reown.android.internal.common.modal.data.model.Wallet;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetSampleWalletsUseCaseInterface {
    Object invoke(@NotNull Continuation<? super List<Wallet>> continuation);
}
