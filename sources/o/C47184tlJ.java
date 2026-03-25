package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaTable;

/* JADX INFO: renamed from: o.tlJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47184tlJ implements InterfaceC47221tlu {
    public double AEQbTJ;
    public final LuaTable EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47184tlJ copy$default(C47184tlJ c47184tlJ, LuaTable luaTable, java.lang.String str, java.lang.String str2, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            luaTable = c47184tlJ.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c47184tlJ.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = c47184tlJ.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            d = c47184tlJ.copydefault;
        }
        double d3 = d;
        if ((i & 16) != 0) {
            d2 = c47184tlJ.AEQbTJ;
        }
        return c47184tlJ.copydefault(luaTable, str3, str4, d3, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47184tlJ copydefault(@NotNull LuaTable luaTable, java.lang.String str, java.lang.String str2, double d, double d2) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        return new C47184tlJ(luaTable, str, str2, d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaTable copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47184tlJ)) {
            return false;
        }
        C47184tlJ c47184tlJ = (C47184tlJ) obj;
        return Intrinsics.EZpvd(this.EZpvd, c47184tlJ.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c47184tlJ.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c47184tlJ.OLrzqt) && java.lang.Double.compare(this.copydefault, c47184tlJ.copydefault) == 0 && java.lang.Double.compare(this.AEQbTJ, c47184tlJ.AEQbTJ) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public java.lang.String getPrimary() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public java.lang.String getSecondary() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Double.hashCode(this.copydefault)) * 31) + java.lang.Double.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.copydefault = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.AEQbTJ = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LuaSearchResultModel(originData=" + this.EZpvd + ", primary=" + this.KWHzl + ", secondary=" + this.OLrzqt + ", primarySimilarity=" + this.copydefault + ", secondarySimilarity=" + this.AEQbTJ + ")";
    }

    public C47184tlJ(@NotNull LuaTable luaTable, java.lang.String str, java.lang.String str2, double d, double d2) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        this.EZpvd = luaTable;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.copydefault = d;
        this.AEQbTJ = d2;
    }
}
