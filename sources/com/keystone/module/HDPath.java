package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class HDPath {
    private final PathItem account;
    private final PathItem addressIndex;
    private final PathItem change;
    private final PathItem coinType;
    private final PathItem purpose;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HDPath copy$default(HDPath hDPath, PathItem pathItem, PathItem pathItem2, PathItem pathItem3, PathItem pathItem4, PathItem pathItem5, int i, Object obj) {
        if ((i & 1) != 0) {
            pathItem = hDPath.purpose;
        }
        if ((i & 2) != 0) {
            pathItem2 = hDPath.coinType;
        }
        PathItem pathItem6 = pathItem2;
        if ((i & 4) != 0) {
            pathItem3 = hDPath.account;
        }
        PathItem pathItem7 = pathItem3;
        if ((i & 8) != 0) {
            pathItem4 = hDPath.change;
        }
        PathItem pathItem8 = pathItem4;
        if ((i & 16) != 0) {
            pathItem5 = hDPath.addressIndex;
        }
        return hDPath.copy(pathItem, pathItem6, pathItem7, pathItem8, pathItem5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem component1() {
        return this.purpose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem component2() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem component3() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem component4() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem component5() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HDPath copy(PathItem pathItem, PathItem pathItem2, PathItem pathItem3, PathItem pathItem4, PathItem pathItem5) {
        return new HDPath(pathItem, pathItem2, pathItem3, pathItem4, pathItem5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HDPath)) {
            return false;
        }
        HDPath hDPath = (HDPath) obj;
        return Intrinsics.EZpvd(this.purpose, hDPath.purpose) && Intrinsics.EZpvd(this.coinType, hDPath.coinType) && Intrinsics.EZpvd(this.account, hDPath.account) && Intrinsics.EZpvd(this.change, hDPath.change) && Intrinsics.EZpvd(this.addressIndex, hDPath.addressIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem getPurpose() {
        return this.purpose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PathItem pathItem = this.purpose;
        int iHashCode = pathItem == null ? 0 : pathItem.hashCode();
        PathItem pathItem2 = this.coinType;
        int iHashCode2 = pathItem2 == null ? 0 : pathItem2.hashCode();
        PathItem pathItem3 = this.account;
        int iHashCode3 = pathItem3 == null ? 0 : pathItem3.hashCode();
        PathItem pathItem4 = this.change;
        int iHashCode4 = pathItem4 == null ? 0 : pathItem4.hashCode();
        PathItem pathItem5 = this.addressIndex;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (pathItem5 != null ? pathItem5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HDPath(purpose=" + this.purpose + ", coinType=" + this.coinType + ", account=" + this.account + ", change=" + this.change + ", addressIndex=" + this.addressIndex + ')';
    }

    public HDPath(PathItem pathItem, PathItem pathItem2, PathItem pathItem3, PathItem pathItem4, PathItem pathItem5) {
        this.purpose = pathItem;
        this.coinType = pathItem2;
        this.account = pathItem3;
        this.change = pathItem4;
        this.addressIndex = pathItem5;
    }
}
