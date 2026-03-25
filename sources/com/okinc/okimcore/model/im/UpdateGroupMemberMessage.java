package com.okinc.okimcore.model.im;

/* JADX INFO: loaded from: classes10.dex */
public final class UpdateGroupMemberMessage extends GroupSystemMessage {
    public static final int $stable = 8;
    private boolean isAddMember;
    private boolean isTargetUsersExceedLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAddMember() {
        return this.isAddMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTargetUsersExceedLimit() {
        return this.isTargetUsersExceedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddMember(boolean z) {
        this.isAddMember = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUsersExceedLimit(boolean z) {
        this.isTargetUsersExceedLimit = z;
    }
}
