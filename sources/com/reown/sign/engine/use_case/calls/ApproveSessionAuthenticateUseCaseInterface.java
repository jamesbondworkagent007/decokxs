package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.signing.cacao.Cacao;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ApproveSessionAuthenticateUseCaseInterface {
    Object approveSessionAuthenticate(long j, @NotNull List<Cacao> list, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation);
}
