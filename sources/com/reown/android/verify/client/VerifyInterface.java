package com.reown.android.verify.client;

import com.reown.android.verify.domain.VerifyResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface VerifyInterface {
    void initialize();

    void register(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    void resolve(@NotNull String str, @NotNull String str2, @NotNull Function1<? super VerifyResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void resolveV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super VerifyResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
