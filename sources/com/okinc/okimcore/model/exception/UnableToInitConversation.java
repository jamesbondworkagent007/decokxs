package com.okinc.okimcore.model.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UnableToInitConversation extends OKIMException {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnableToInitConversation(@NotNull String str) {
        super((String) null, 0, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }
}
