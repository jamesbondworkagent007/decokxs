package com.reown.sign.engine.use_case.calls;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface PingUseCaseInterface {
    /* JADX INFO: renamed from: ping-zkXUZaI */
    Object mo7342pingzkXUZaI(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, long j, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: ping-zkXUZaI$default, reason: not valid java name */
        public static /* synthetic */ Object m7350pingzkXUZaI$default(PingUseCaseInterface pingUseCaseInterface, String str, Function1 function1, Function1 function12, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ping-zkXUZaI");
            }
            if ((i & 8) != 0) {
                j = PingUseCaseKt.THIRTY_SECONDS_TIMEOUT;
            }
            return pingUseCaseInterface.mo7342pingzkXUZaI(str, function1, function12, j, continuation);
        }
    }
}
