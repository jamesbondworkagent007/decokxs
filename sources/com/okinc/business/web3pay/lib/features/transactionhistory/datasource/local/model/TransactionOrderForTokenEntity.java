package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import kotlin.jvm.internal.Intrinsics;
import o.C31381lsu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionOrderForTokenEntity {
    public static final int $stable = 0;
    private final C31381lsu apiModel;
    private final String chainIndex;
    private final int index;
    private final String key;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionOrderForTokenEntity copy$default(TransactionOrderForTokenEntity transactionOrderForTokenEntity, String str, String str2, String str3, C31381lsu c31381lsu, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transactionOrderForTokenEntity.key;
        }
        if ((i2 & 2) != 0) {
            str2 = transactionOrderForTokenEntity.chainIndex;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = transactionOrderForTokenEntity.tokenCoinTypeNo;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            c31381lsu = transactionOrderForTokenEntity.apiModel;
        }
        C31381lsu c31381lsu2 = c31381lsu;
        if ((i2 & 16) != 0) {
            i = transactionOrderForTokenEntity.index;
        }
        return transactionOrderForTokenEntity.copy(str, str4, str5, c31381lsu2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31381lsu component4() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionOrderForTokenEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull C31381lsu c31381lsu, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c31381lsu, "");
        return new TransactionOrderForTokenEntity(str, str2, str3, c31381lsu, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionOrderForTokenEntity)) {
            return false;
        }
        TransactionOrderForTokenEntity transactionOrderForTokenEntity = (TransactionOrderForTokenEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) transactionOrderForTokenEntity.key) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) transactionOrderForTokenEntity.chainIndex) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) transactionOrderForTokenEntity.tokenCoinTypeNo) && Intrinsics.EZpvd(this.apiModel, transactionOrderForTokenEntity.apiModel) && this.index == transactionOrderForTokenEntity.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31381lsu getApiModel() {
        return this.apiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
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
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.key.hashCode() * 31) + this.chainIndex.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.apiModel.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionOrderForTokenEntity(key=" + this.key + ", chainIndex=" + this.chainIndex + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", apiModel=" + this.apiModel + ", index=" + this.index + ")";
    }

    public TransactionOrderForTokenEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull C31381lsu c31381lsu, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c31381lsu, "");
        this.key = str;
        this.chainIndex = str2;
        this.tokenCoinTypeNo = str3;
        this.apiModel = c31381lsu;
        this.index = i;
    }
}
