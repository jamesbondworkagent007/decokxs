package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.feb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18236feb {
    public final long AEQbTJ;
    public final java.util.List<AddressRegisterBean> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.feb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18236feb copy$default(C18236feb c18236feb, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c18236feb.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c18236feb.KWHzl;
        }
        return c18236feb.AEQbTJ(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18236feb AEQbTJ(long j, @NotNull java.util.List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C18236feb(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AddressRegisterBean> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18236feb)) {
            return false;
        }
        C18236feb c18236feb = (C18236feb) obj;
        return this.AEQbTJ == c18236feb.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c18236feb.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QueryAddressRegisterStatusInput(bannerId=" + this.AEQbTJ + ", queryAddressList=" + this.KWHzl + ")";
    }

    public C18236feb(long j, @NotNull java.util.List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = j;
        this.KWHzl = list;
    }
}
