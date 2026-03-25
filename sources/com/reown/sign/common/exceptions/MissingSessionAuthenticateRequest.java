package com.reown.sign.common.exceptions;

import com.reown.android.internal.common.exception.WalletConnectException;

/* JADX INFO: loaded from: classes12.dex */
public final class MissingSessionAuthenticateRequest extends WalletConnectException {
    public MissingSessionAuthenticateRequest() {
        super(MessagesKt.MISSING_SESSION_AUTHENTICATE_REQUEST);
    }
}
