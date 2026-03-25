package o;

import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressSourceGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20832goN {
    public final java.lang.String AEQbTJ;
    public final AddressSourceGroup KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C20832goN copy$default(C20832goN c20832goN, java.lang.String str, java.lang.String str2, AddressSourceGroup addressSourceGroup, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c20832goN.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c20832goN.AEQbTJ;
        }
        if ((i & 4) != 0) {
            addressSourceGroup = c20832goN.KWHzl;
        }
        return c20832goN.KWHzl(str, str2, addressSourceGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20832goN KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AddressSourceGroup addressSourceGroup) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(addressSourceGroup, "");
        return new C20832goN(str, str2, addressSourceGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressSourceGroup OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20832goN)) {
            return false;
        }
        C20832goN c20832goN = (C20832goN) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c20832goN.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c20832goN.AEQbTJ) && this.KWHzl == c20832goN.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MultiReceiveTabItem(tabName=" + this.copydefault + ", tabTag=" + this.AEQbTJ + ", sendCoinGroup=" + this.KWHzl + ")";
    }

    public C20832goN(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AddressSourceGroup addressSourceGroup) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(addressSourceGroup, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = addressSourceGroup;
    }
}
