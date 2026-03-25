package com.okinc.business.web3pay.lib.core.network;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OtherBizLineServerException extends Exception {
    public static final int $stable = 0;
    private final int code;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherBizLineServerException(@NotNull OKServerException oKServerException, int i, String str) {
        super(oKServerException.getMessage(), oKServerException);
        Intrinsics.checkNotNullParameter(oKServerException, "");
        this.code = i;
        this.msg = str;
    }
}
