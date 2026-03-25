package com.okinc.web3.security.features.mpc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class MpcPrivateKeyItem {
    public static final int $stable = 8;
    private final String address;
    private final long chainId;
    private String chainName;
    private String imageUrl;
    private final String privateKey;
    private boolean privateKeyContainerIsOpen;
    private boolean privateKeyIsEye;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.privateKeyContainerIsOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.privateKeyIsEye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcPrivateKeyItem copy(long j, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MpcPrivateKeyItem(j, str, str2, z, z2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MpcPrivateKeyItem)) {
            return false;
        }
        MpcPrivateKeyItem mpcPrivateKeyItem = (MpcPrivateKeyItem) obj;
        return this.chainId == mpcPrivateKeyItem.chainId && Intrinsics.EZpvd((Object) this.privateKey, (Object) mpcPrivateKeyItem.privateKey) && Intrinsics.EZpvd((Object) this.address, (Object) mpcPrivateKeyItem.address) && this.privateKeyContainerIsOpen == mpcPrivateKeyItem.privateKeyContainerIsOpen && this.privateKeyIsEye == mpcPrivateKeyItem.privateKeyIsEye && Intrinsics.EZpvd((Object) this.chainName, (Object) mpcPrivateKeyItem.chainName) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) mpcPrivateKeyItem.imageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPrivateKeyContainerIsOpen() {
        return this.privateKeyContainerIsOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPrivateKeyIsEye() {
        return this.privateKeyIsEye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Long.hashCode(this.chainId) * 31) + this.privateKey.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.privateKeyContainerIsOpen)) * 31) + Boolean.hashCode(this.privateKeyIsEye)) * 31) + this.chainName.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrivateKeyContainerIsOpen(boolean z) {
        this.privateKeyContainerIsOpen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrivateKeyIsEye(boolean z) {
        this.privateKeyIsEye = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcPrivateKeyItem(chainId=" + this.chainId + ", privateKey=" + this.privateKey + ", address=" + this.address + ", privateKeyContainerIsOpen=" + this.privateKeyContainerIsOpen + ", privateKeyIsEye=" + this.privateKeyIsEye + ", chainName=" + this.chainName + ", imageUrl=" + this.imageUrl + ")";
    }

    public MpcPrivateKeyItem(long j, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = j;
        this.privateKey = str;
        this.address = str2;
        this.privateKeyContainerIsOpen = z;
        this.privateKeyIsEye = z2;
        this.chainName = str3;
        this.imageUrl = str4;
    }
}
