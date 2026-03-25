package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ZcashAccount {
    private final int index;
    private final String name;
    private final String ufvk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ZcashAccount copy$default(ZcashAccount zcashAccount, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = zcashAccount.ufvk;
        }
        if ((i2 & 2) != 0) {
            i = zcashAccount.index;
        }
        if ((i2 & 4) != 0) {
            str2 = zcashAccount.name;
        }
        return zcashAccount.copy(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ufvk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZcashAccount copy(@NotNull String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ZcashAccount(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZcashAccount)) {
            return false;
        }
        ZcashAccount zcashAccount = (ZcashAccount) obj;
        return Intrinsics.EZpvd((Object) this.ufvk, (Object) zcashAccount.ufvk) && this.index == zcashAccount.index && Intrinsics.EZpvd((Object) this.name, (Object) zcashAccount.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUfvk() {
        return this.ufvk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ufvk.hashCode();
        int iHashCode2 = Integer.hashCode(this.index);
        String str = this.name;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZcashAccount(ufvk=" + this.ufvk + ", index=" + this.index + ", name=" + ((Object) this.name) + ')';
    }

    public ZcashAccount(@NotNull String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ufvk = str;
        this.index = i;
        this.name = str2;
    }
}
