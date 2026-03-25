package o;

import com.okinc.cruilib.compose.composable.cryptolist.model.CryptoListType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31800mEj {
    public final CryptoListType AEQbTJ;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31800mEj copy$default(C31800mEj c31800mEj, CryptoListType cryptoListType, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptoListType = c31800mEj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c31800mEj.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = c31800mEj.copydefault;
        }
        return c31800mEj.copydefault(cryptoListType, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoListType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31800mEj copydefault(@NotNull CryptoListType cryptoListType, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(cryptoListType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C31800mEj(cryptoListType, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31800mEj)) {
            return false;
        }
        C31800mEj c31800mEj = (C31800mEj) obj;
        return this.AEQbTJ == c31800mEj.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31800mEj.OLrzqt) && this.copydefault == c31800mEj.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CryptoMultiListTabState(listType=" + this.AEQbTJ + ", tabTitle=" + this.OLrzqt + ", isSelected=" + this.copydefault + ")";
    }

    public C31800mEj(@NotNull CryptoListType cryptoListType, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(cryptoListType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = cryptoListType;
        this.OLrzqt = str;
        this.copydefault = z;
    }
}
