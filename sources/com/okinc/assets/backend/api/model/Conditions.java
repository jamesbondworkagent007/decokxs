package com.okinc.assets.backend.api.model;

/* JADX INFO: loaded from: classes22.dex */
public final class Conditions {
    public static final int $stable = 8;
    private int code;
    private boolean isBindEmail;
    private boolean isBindGoogle;
    private boolean isBindPhone;
    private int status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBindEmail() {
        return this.isBindEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBindGoogle() {
        return this.isBindGoogle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBindPhone() {
        return this.isBindPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBindEmail(boolean z) {
        this.isBindEmail = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBindGoogle(boolean z) {
        this.isBindGoogle = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBindPhone(boolean z) {
        this.isBindPhone = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(int i) {
        this.code = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }
}
