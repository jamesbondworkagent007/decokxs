package com.reown.sign.common.exceptions;

import com.reown.android.internal.common.exception.WalletConnectException;

/* JADX INFO: loaded from: classes12.dex */
public final class SignClientAlreadyInitializedException extends WalletConnectException {
    public SignClientAlreadyInitializedException() {
        super(MessagesKt.CLIENT_ALREADY_INITIALIZED);
    }
}
