package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.model.Pairing;
import com.reown.sign.engine.model.EngineDO;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ProposeSessionUseCaseInterface {
    Object proposeSession(Map<String, EngineDO.Namespace.Proposal> map, Map<String, EngineDO.Namespace.Proposal> map2, Map<String, String> map3, @NotNull Pairing pairing, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation);
}
