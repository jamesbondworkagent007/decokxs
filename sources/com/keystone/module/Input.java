package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Input {
    private final String hash;
    private final int index;
    private final String ownerKeyPath;
    private final UTXO utxo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Input copy$default(Input input, String str, int i, UTXO utxo, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = input.hash;
        }
        if ((i2 & 2) != 0) {
            i = input.index;
        }
        if ((i2 & 4) != 0) {
            utxo = input.utxo;
        }
        if ((i2 & 8) != 0) {
            str2 = input.ownerKeyPath;
        }
        return input.copy(str, i, utxo, str2);
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
    public final UTXO component3() {
        return this.utxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ownerKeyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Input copy(@NotNull String str, int i, @NotNull UTXO utxo, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(utxo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Input(str, i, utxo, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Input)) {
            return false;
        }
        Input input = (Input) obj;
        return Intrinsics.EZpvd((Object) this.hash, (Object) input.hash) && this.index == input.index && Intrinsics.EZpvd(this.utxo, input.utxo) && Intrinsics.EZpvd((Object) this.ownerKeyPath, (Object) input.ownerKeyPath);
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
    public final UTXO getUtxo() {
        return this.utxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.hash.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.utxo.hashCode()) * 31) + this.ownerKeyPath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Input(hash=" + this.hash + ", index=" + this.index + ", utxo=" + this.utxo + ", ownerKeyPath=" + this.ownerKeyPath + ')';
    }

    public Input(@NotNull String str, int i, @NotNull UTXO utxo, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(utxo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hash = str;
        this.index = i;
        this.utxo = utxo;
        this.ownerKeyPath = str2;
    }
}
