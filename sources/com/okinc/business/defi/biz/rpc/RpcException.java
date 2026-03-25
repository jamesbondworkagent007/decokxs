package com.okinc.business.defi.biz.rpc;

/* JADX INFO: loaded from: classes4.dex */
public final class RpcException extends Throwable {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public RpcException(String str) {
        this.message = str;
    }
}
