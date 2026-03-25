package o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Map;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;

/* JADX INFO: renamed from: o.zrT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59911zrT implements Map.Entry<java.lang.String, java.lang.String>, java.lang.Cloneable {
    public java.lang.String AEQbTJ;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.String getValue() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getKey()Ljava/lang/Object; */
    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String getKey() {
        return this.copydefault;
    }

    public C59911zrT(java.lang.String str, java.lang.String str2) {
        C59912zrU.copydefault(str);
        C59912zrU.KWHzl((java.lang.Object) str2);
        this.copydefault = str.trim().toLowerCase();
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String setValue(java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        java.lang.String str2 = this.AEQbTJ;
        this.AEQbTJ = str;
        return str2;
    }

    public java.lang.String AEQbTJ() {
        return this.copydefault + "=\"" + Entities.copydefault(this.AEQbTJ, new Document("").djBIcL()) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }

    public void AEQbTJ(java.lang.StringBuilder sb, Document.Activity activity) {
        sb.append(this.copydefault);
        sb.append("=\"");
        sb.append(Entities.copydefault(this.AEQbTJ, activity));
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public java.lang.String toString() {
        return AEQbTJ();
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59911zrT)) {
            return false;
        }
        C59911zrT c59911zrT = (C59911zrT) obj;
        java.lang.String str = this.copydefault;
        if (str == null ? c59911zrT.copydefault != null : !str.equals(c59911zrT.copydefault)) {
            return false;
        }
        java.lang.String str2 = this.AEQbTJ;
        java.lang.String str3 = c59911zrT.AEQbTJ;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C59911zrT clone() {
        try {
            return (C59911zrT) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
