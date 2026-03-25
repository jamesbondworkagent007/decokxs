package com.okinc.business.defi.wallet.tee.common.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TeeBatchAuthorizeReqData {
    public static final int $stable = 8;
    private final List<ActivateTEERequest> accountList;
    private final String frontendPubkeyVersionSelected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.tee.common.model.TeeBatchAuthorizeReqData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeeBatchAuthorizeReqData copy$default(TeeBatchAuthorizeReqData teeBatchAuthorizeReqData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teeBatchAuthorizeReqData.accountList;
        }
        if ((i & 2) != 0) {
            str = teeBatchAuthorizeReqData.frontendPubkeyVersionSelected;
        }
        return teeBatchAuthorizeReqData.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivateTEERequest> component1() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeBatchAuthorizeReqData copy(@NotNull List<ActivateTEERequest> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new TeeBatchAuthorizeReqData(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeBatchAuthorizeReqData)) {
            return false;
        }
        TeeBatchAuthorizeReqData teeBatchAuthorizeReqData = (TeeBatchAuthorizeReqData) obj;
        return Intrinsics.EZpvd(this.accountList, teeBatchAuthorizeReqData.accountList) && Intrinsics.EZpvd((Object) this.frontendPubkeyVersionSelected, (Object) teeBatchAuthorizeReqData.frontendPubkeyVersionSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivateTEERequest> getAccountList() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendPubkeyVersionSelected() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountList.hashCode() * 31) + this.frontendPubkeyVersionSelected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeBatchAuthorizeReqData(accountList=" + this.accountList + ", frontendPubkeyVersionSelected=" + this.frontendPubkeyVersionSelected + ")";
    }

    public TeeBatchAuthorizeReqData(@NotNull List<ActivateTEERequest> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.accountList = list;
        this.frontendPubkeyVersionSelected = str;
    }
}
