package o;

import com.google.gson.annotations.SerializedName;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jFC {

    @SerializedName(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)
    private final java.lang.String address;

    @SerializedName("emoji")
    private final java.lang.String emoji;

    @SerializedName("groups")
    private final java.util.List<java.lang.String> groups;

    @SerializedName("name")
    private final java.lang.String name;

    @SerializedName("trackedWalletAddress")
    private final java.lang.String trackedWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.jFC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jFC copy$default(jFC jfc, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = jfc.address;
        }
        if ((i & 2) != 0) {
            str2 = jfc.trackedWalletAddress;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = jfc.name;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = jfc.emoji;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = jfc.groups;
        }
        return jfc.copydefault(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jFC copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new jFC(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jFC)) {
            return false;
        }
        jFC jfc = (jFC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.address, (java.lang.Object) jfc.address) && Intrinsics.EZpvd((java.lang.Object) this.trackedWalletAddress, (java.lang.Object) jfc.trackedWalletAddress) && Intrinsics.EZpvd((java.lang.Object) this.name, (java.lang.Object) jfc.name) && Intrinsics.EZpvd((java.lang.Object) this.emoji, (java.lang.Object) jfc.emoji) && Intrinsics.EZpvd(this.groups, jfc.groups);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        java.lang.String str = this.trackedWalletAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.name;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.emoji;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.groups.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AxionItem(address=" + this.address + ", trackedWalletAddress=" + this.trackedWalletAddress + ", name=" + this.name + ", emoji=" + this.emoji + ", groups=" + this.groups + ")";
    }

    public jFC(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.trackedWalletAddress = str2;
        this.name = str3;
        this.emoji = str4;
        this.groups = list;
    }
}
