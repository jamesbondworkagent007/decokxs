package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CashInput {
    private final String hash;
    private final int index;
    private final String ownerKeyPath;
    private final String pubkey;
    private final long value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CashInput copy$default(CashInput cashInput, String str, int i, long j, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cashInput.hash;
        }
        if ((i2 & 2) != 0) {
            i = cashInput.index;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = cashInput.value;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            str2 = cashInput.pubkey;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = cashInput.ownerKeyPath;
        }
        return cashInput.copy(str, i3, j2, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ownerKeyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CashInput copy(@NotNull String str, int i, long j, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CashInput(str, i, j, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashInput)) {
            return false;
        }
        CashInput cashInput = (CashInput) obj;
        return Intrinsics.EZpvd((Object) this.hash, (Object) cashInput.hash) && this.index == cashInput.index && this.value == cashInput.value && Intrinsics.EZpvd((Object) this.pubkey, (Object) cashInput.pubkey) && Intrinsics.EZpvd((Object) this.ownerKeyPath, (Object) cashInput.ownerKeyPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHash() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerKeyPath() {
        return this.ownerKeyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.hash.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + Long.hashCode(this.value)) * 31) + this.pubkey.hashCode()) * 31) + this.ownerKeyPath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CashInput(hash=" + this.hash + ", index=" + this.index + ", value=" + this.value + ", pubkey=" + this.pubkey + ", ownerKeyPath=" + this.ownerKeyPath + ')';
    }

    public CashInput(@NotNull String str, int i, long j, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hash = str;
        this.index = i;
        this.value = j;
        this.pubkey = str2;
        this.ownerKeyPath = str3;
    }
}
