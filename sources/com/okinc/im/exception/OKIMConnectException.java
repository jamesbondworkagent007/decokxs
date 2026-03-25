package com.okinc.im.exception;

import com.okinc.okimcore.model.exception.OKIMException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class OKIMConnectException extends OKIMException {
    public static final int $stable = 0;

    public OKIMConnectException() {
        super("failed to connect to in-house im", 0, 2, (DefaultConstructorMarker) null);
    }
}
