package com.reown.sign.engine.use_case.calls;

import com.reown.sign.engine.model.EngineDO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface EmitEventUseCaseInterface {
    Object emit(@NotNull String str, @NotNull EngineDO.Event event, Long l, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object emit$default(EmitEventUseCaseInterface emitEventUseCaseInterface, String str, EngineDO.Event event, Long l, Function0 function0, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emit");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            return emitEventUseCaseInterface.emit(str, event, l, function0, function1, continuation);
        }
    }
}
