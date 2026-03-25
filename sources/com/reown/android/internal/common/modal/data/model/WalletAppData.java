package com.reown.android.internal.common.modal.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletAppData {
    public final String appPackage;
    public final String id;
    public final boolean isInstalled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletAppData copy$default(WalletAppData walletAppData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAppData.id;
        }
        if ((i & 2) != 0) {
            str2 = walletAppData.appPackage;
        }
        if ((i & 4) != 0) {
            z = walletAppData.isInstalled;
        }
        return walletAppData.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.appPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isInstalled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAppData copy(@NotNull String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletAppData(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAppData)) {
            return false;
        }
        WalletAppData walletAppData = (WalletAppData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) walletAppData.id) && Intrinsics.EZpvd((Object) this.appPackage, (Object) walletAppData.appPackage) && this.isInstalled == walletAppData.isInstalled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.appPackage;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isInstalled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInstalled() {
        return this.isInstalled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAppData(id=" + this.id + ", appPackage=" + this.appPackage + ", isInstalled=" + this.isInstalled + ")";
    }

    public WalletAppData(@NotNull String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.appPackage = str2;
        this.isInstalled = z;
    }
}
