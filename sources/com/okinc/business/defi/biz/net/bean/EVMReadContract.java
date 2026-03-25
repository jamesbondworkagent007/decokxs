package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EVMReadContract {
    public static final int $stable = 0;
    private final long chainId;
    private final String data;
    private final String to;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EVMReadContract copy$default(EVMReadContract eVMReadContract, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eVMReadContract.chainId;
        }
        if ((i & 2) != 0) {
            str = eVMReadContract.to;
        }
        if ((i & 4) != 0) {
            str2 = eVMReadContract.data;
        }
        return eVMReadContract.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVMReadContract copy(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EVMReadContract(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EVMReadContract)) {
            return false;
        }
        EVMReadContract eVMReadContract = (EVMReadContract) obj;
        return this.chainId == eVMReadContract.chainId && Intrinsics.EZpvd((Object) this.to, (Object) eVMReadContract.to) && Intrinsics.EZpvd((Object) this.data, (Object) eVMReadContract.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.chainId) * 31) + this.to.hashCode()) * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVMReadContract(chainId=" + this.chainId + ", to=" + this.to + ", data=" + this.data + ")";
    }

    public EVMReadContract(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = j;
        this.to = str;
        this.data = str2;
    }
}
