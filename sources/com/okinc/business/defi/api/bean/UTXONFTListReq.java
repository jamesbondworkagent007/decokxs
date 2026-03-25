package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UTXONFTListReq {
    public static final int $stable = 8;
    private String address;
    private long chainIndex;
    private int cursor;
    private int size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UTXONFTListReq copy$default(UTXONFTListReq uTXONFTListReq, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = uTXONFTListReq.address;
        }
        if ((i3 & 2) != 0) {
            i = uTXONFTListReq.cursor;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = uTXONFTListReq.size;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = uTXONFTListReq.chainIndex;
        }
        return uTXONFTListReq.copy(str, i4, i5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXONFTListReq copy(@NotNull String str, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UTXONFTListReq(str, i, i2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UTXONFTListReq)) {
            return false;
        }
        UTXONFTListReq uTXONFTListReq = (UTXONFTListReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) uTXONFTListReq.address) && this.cursor == uTXONFTListReq.cursor && this.size == uTXONFTListReq.size && this.chainIndex == uTXONFTListReq.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.address.hashCode() * 31) + Integer.hashCode(this.cursor)) * 31) + Integer.hashCode(this.size)) * 31) + Long.hashCode(this.chainIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(long j) {
        this.chainIndex = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCursor(int i) {
        this.cursor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSize(int i) {
        this.size = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXONFTListReq(address=" + this.address + ", cursor=" + this.cursor + ", size=" + this.size + ", chainIndex=" + this.chainIndex + ")";
    }

    public UTXONFTListReq(@NotNull String str, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.cursor = i;
        this.size = i2;
        this.chainIndex = j;
    }
}
