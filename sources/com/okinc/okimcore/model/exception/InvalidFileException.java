package com.okinc.okimcore.model.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class InvalidFileException extends OKIMException {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public InvalidFileException(String str) {
        super((String) null, 0, 3, (DefaultConstructorMarker) null);
        this.message = str;
    }
}
