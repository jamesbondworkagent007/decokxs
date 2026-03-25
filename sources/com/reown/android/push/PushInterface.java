package com.reown.android.push;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface PushInterface {
    String getClientId();

    void register(@NotNull String str, boolean z, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    void unregister(@NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(PushInterface pushInterface, String str, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            pushInterface.register(str, z, function0, function1);
        }
    }
}
