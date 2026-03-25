package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderApiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PendingClaimOrderEntity {
    public static final int $stable = 0;
    private final PendingClaimOrderApiModel apiModel;
    private final int index;
    private final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PendingClaimOrderEntity copy$default(PendingClaimOrderEntity pendingClaimOrderEntity, String str, PendingClaimOrderApiModel pendingClaimOrderApiModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pendingClaimOrderEntity.key;
        }
        if ((i2 & 2) != 0) {
            pendingClaimOrderApiModel = pendingClaimOrderEntity.apiModel;
        }
        if ((i2 & 4) != 0) {
            i = pendingClaimOrderEntity.index;
        }
        return pendingClaimOrderEntity.copy(str, pendingClaimOrderApiModel, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingClaimOrderApiModel component2() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingClaimOrderEntity copy(@NotNull String str, @NotNull PendingClaimOrderApiModel pendingClaimOrderApiModel, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pendingClaimOrderApiModel, "");
        return new PendingClaimOrderEntity(str, pendingClaimOrderApiModel, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingClaimOrderEntity)) {
            return false;
        }
        PendingClaimOrderEntity pendingClaimOrderEntity = (PendingClaimOrderEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) pendingClaimOrderEntity.key) && Intrinsics.EZpvd(this.apiModel, pendingClaimOrderEntity.apiModel) && this.index == pendingClaimOrderEntity.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingClaimOrderApiModel getApiModel() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.apiModel.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PendingClaimOrderEntity(key=" + this.key + ", apiModel=" + this.apiModel + ", index=" + this.index + ")";
    }

    public PendingClaimOrderEntity(@NotNull String str, @NotNull PendingClaimOrderApiModel pendingClaimOrderApiModel, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pendingClaimOrderApiModel, "");
        this.key = str;
        this.apiModel = pendingClaimOrderApiModel;
        this.index = i;
    }
}
