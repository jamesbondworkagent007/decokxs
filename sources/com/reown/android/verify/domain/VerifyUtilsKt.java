package com.reown.android.verify.domain;

import com.reown.android.internal.common.model.Validation;
import com.reown.utils.UtilFunctionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyUtilsKt {
    public static final Validation getValidation(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return UtilFunctionsKt.compareDomains(str, str2) ? Validation.VALID : Validation.INVALID;
    }
}
