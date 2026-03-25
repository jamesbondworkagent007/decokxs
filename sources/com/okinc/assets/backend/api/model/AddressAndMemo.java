package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AddressAndMemo {
    public static final int $stable = 0;
    private final String address;
    private final String memo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressAndMemo copy$default(AddressAndMemo addressAndMemo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressAndMemo.address;
        }
        if ((i & 2) != 0) {
            str2 = addressAndMemo.memo;
        }
        return addressAndMemo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAndMemo copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressAndMemo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAndMemo)) {
            return false;
        }
        AddressAndMemo addressAndMemo = (AddressAndMemo) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressAndMemo.address) && Intrinsics.EZpvd((Object) this.memo, (Object) addressAndMemo.memo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        String str = this.memo;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAndMemo(address=" + this.address + ", memo=" + this.memo + ")";
    }

    public AddressAndMemo(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.memo = str2;
    }
}
