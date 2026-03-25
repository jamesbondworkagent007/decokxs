package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.model.Expiry;
import com.reown.sign.engine.model.EngineDO;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SessionAuthenticateUseCaseInterface {
    Object authenticate(@NotNull EngineDO.Authenticate authenticate, List<String> list, String str, Expiry expiry, String str2, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object authenticate$default(SessionAuthenticateUseCaseInterface sessionAuthenticateUseCaseInterface, EngineDO.Authenticate authenticate, List list, String str, Expiry expiry, String str2, Function1 function1, Function1 function12, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return sessionAuthenticateUseCaseInterface.authenticate(authenticate, list, str, expiry, (i & 16) != 0 ? null : str2, function1, function12, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticate");
        }
    }
}
