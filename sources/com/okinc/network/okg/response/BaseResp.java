package com.okinc.network.okg.response;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class BaseResp<T> {
    public static final int CODE_ERROR = -1;
    public static final int CODE_SUCCEED = 0;
    public T data;
    public int code = -1;
    public String msg = "";
    public String detailMsg = "";

    @Deprecated
    public String error_message = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDataValid() {
        return this.data != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSucceed() {
        return this.code == 0;
    }

    public boolean isSucceedAndDataValid() {
        return isSucceed() && isDataValid();
    }
}
