package com.okinc.auth.impl.passkey.model;

import android.content.Context;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2ManagementUseCaseModule {
    public final Fido2ApiClient KWHzl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Fido2ApiClient fido2ApiClient = Fido.getFido2ApiClient(context);
        Intrinsics.checkNotNullExpressionValue(fido2ApiClient, "");
        return fido2ApiClient;
    }
}
