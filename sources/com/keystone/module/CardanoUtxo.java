package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CardanoUtxo {
    private final String address;
    private final int amount;
    private final String hdPath;
    private final int index;
    private final String transactionHash;
    private final String xfp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardanoUtxo copy$default(CardanoUtxo cardanoUtxo, String str, int i, int i2, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardanoUtxo.transactionHash;
        }
        if ((i3 & 2) != 0) {
            i = cardanoUtxo.index;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = cardanoUtxo.amount;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = cardanoUtxo.xfp;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = cardanoUtxo.hdPath;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = cardanoUtxo.address;
        }
        return cardanoUtxo.copy(str, i4, i5, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.hdPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoUtxo copy(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CardanoUtxo(str, i, i2, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardanoUtxo)) {
            return false;
        }
        CardanoUtxo cardanoUtxo = (CardanoUtxo) obj;
        return Intrinsics.EZpvd((Object) this.transactionHash, (Object) cardanoUtxo.transactionHash) && this.index == cardanoUtxo.index && this.amount == cardanoUtxo.amount && Intrinsics.EZpvd((Object) this.xfp, (Object) cardanoUtxo.xfp) && Intrinsics.EZpvd((Object) this.hdPath, (Object) cardanoUtxo.hdPath) && Intrinsics.EZpvd((Object) this.address, (Object) cardanoUtxo.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHdPath() {
        return this.hdPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXfp() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.transactionHash.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.amount)) * 31) + this.xfp.hashCode()) * 31) + this.hdPath.hashCode()) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoUtxo(transactionHash=" + this.transactionHash + ", index=" + this.index + ", amount=" + this.amount + ", xfp=" + this.xfp + ", hdPath=" + this.hdPath + ", address=" + this.address + ')';
    }

    public CardanoUtxo(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.transactionHash = str;
        this.index = i;
        this.amount = i2;
        this.xfp = str2;
        this.hdPath = str3;
        this.address = str4;
    }
}
