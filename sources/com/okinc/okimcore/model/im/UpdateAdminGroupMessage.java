package com.okinc.okimcore.model.im;

/* JADX INFO: loaded from: classes10.dex */
public final class UpdateAdminGroupMessage extends GroupSystemMessage {
    public static final int $stable = 8;
    private boolean isAddAdmin;
    private boolean isTargetUsersExceedLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAddAdmin() {
        return this.isAddAdmin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTargetUsersExceedLimit() {
        return this.isTargetUsersExceedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddAdmin(boolean z) {
        this.isAddAdmin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUsersExceedLimit(boolean z) {
        this.isTargetUsersExceedLimit = z;
    }
}
