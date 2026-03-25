package com.reown.android.pulse.domain;

import com.reown.android.pulse.model.properties.Props;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface InsertEventUseCaseInterface {
    Object invoke(@NotNull Props props, @NotNull Continuation<? super Unit> continuation);
}
