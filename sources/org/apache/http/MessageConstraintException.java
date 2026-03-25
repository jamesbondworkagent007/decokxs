package org.apache.http;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: loaded from: classes13.dex */
public class MessageConstraintException extends CharacterCodingException {
    private static final long serialVersionUID = 6077207720446368695L;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public MessageConstraintException(String str) {
        this.message = str;
    }
}
