package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import kotlin.jvm.internal.Intrinsics;
import o.C31381lsu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionOrderEntity {
    public static final int $stable = 0;
    private final C31381lsu apiModel;
    private final int index;
    private final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionOrderEntity copy$default(TransactionOrderEntity transactionOrderEntity, String str, C31381lsu c31381lsu, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transactionOrderEntity.key;
        }
        if ((i2 & 2) != 0) {
            c31381lsu = transactionOrderEntity.apiModel;
        }
        if ((i2 & 4) != 0) {
            i = transactionOrderEntity.index;
        }
        return transactionOrderEntity.copy(str, c31381lsu, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31381lsu component2() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionOrderEntity copy(@NotNull String str, @NotNull C31381lsu c31381lsu, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c31381lsu, "");
        return new TransactionOrderEntity(str, c31381lsu, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionOrderEntity)) {
            return false;
        }
        TransactionOrderEntity transactionOrderEntity = (TransactionOrderEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) transactionOrderEntity.key) && Intrinsics.EZpvd(this.apiModel, transactionOrderEntity.apiModel) && this.index == transactionOrderEntity.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31381lsu getApiModel() {
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
        return "TransactionOrderEntity(key=" + this.key + ", apiModel=" + this.apiModel + ", index=" + this.index + ")";
    }

    public TransactionOrderEntity(@NotNull String str, @NotNull C31381lsu c31381lsu, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c31381lsu, "");
        this.key = str;
        this.apiModel = c31381lsu;
        this.index = i;
    }
}
