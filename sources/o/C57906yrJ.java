package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yrJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C57906yrJ {
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    public C57906yrJ(java.lang.String str, boolean z, boolean z2) {
        this.KWHzl = str;
        this.OLrzqt = z;
        this.copydefault = z2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C57906yrJ c57906yrJ = (C57906yrJ) obj;
        if (this.OLrzqt == c57906yrJ.OLrzqt && this.copydefault == c57906yrJ.copydefault) {
            return this.KWHzl.equals(c57906yrJ.KWHzl);
        }
        return false;
    }

    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + (this.OLrzqt ? 1 : 0)) * 31) + (this.copydefault ? 1 : 0);
    }

    public java.lang.String toString() {
        return "Permission{name='" + this.KWHzl + "', granted=" + this.OLrzqt + ", shouldShowRequestPermissionRationale=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
