package o;

import com.ibm.icu.number.NumberRangeFormatter;
import com.ibm.icu.util.ULocale;
import java.util.Objects;

/* JADX INFO: renamed from: o.afb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7213afb {
    public C7187afB AEQbTJ;
    public int AYXKKw = -1;
    public NumberRangeFormatter.RangeCollapse EZpvd;
    public C7187afB KWHzl;
    public NumberRangeFormatter.RangeIdentityFallback OLrzqt;
    public ULocale copydefault;

    public int hashCode() {
        return Objects.hash(this.AEQbTJ, this.KWHzl, this.EZpvd, this.OLrzqt, this.copydefault);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7213afb)) {
            return false;
        }
        C7213afb c7213afb = (C7213afb) obj;
        return Objects.equals(this.AEQbTJ, c7213afb.AEQbTJ) && Objects.equals(this.KWHzl, c7213afb.KWHzl) && Objects.equals(this.EZpvd, c7213afb.EZpvd) && Objects.equals(this.OLrzqt, c7213afb.OLrzqt) && Objects.equals(this.copydefault, c7213afb.copydefault);
    }
}
