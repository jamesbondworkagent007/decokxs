package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;

/* JADX INFO: loaded from: classes21.dex */
public class UV {
    public java.lang.String AEQbTJ;
    public java.util.HashSet<java.lang.String> KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.Object copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.OLrzqt = null;
        this.AEQbTJ = null;
        this.KWHzl = null;
    }

    public UV(java.lang.Object obj) {
        this.copydefault = obj;
    }

    public static UV copydefault(JsonParser jsonParser) {
        return new UV(jsonParser);
    }

    public static UV copydefault(JsonGenerator jsonGenerator) {
        return new UV(jsonGenerator);
    }

    public UV KWHzl() {
        return new UV(this.copydefault);
    }

    public boolean AEQbTJ(java.lang.String str) throws JsonParseException {
        java.lang.String str2 = this.OLrzqt;
        if (str2 == null) {
            this.OLrzqt = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        java.lang.String str3 = this.AEQbTJ;
        if (str3 == null) {
            this.AEQbTJ = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.KWHzl == null) {
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>(16);
            this.KWHzl = hashSet;
            hashSet.add(this.OLrzqt);
            this.KWHzl.add(this.AEQbTJ);
        }
        return !this.KWHzl.add(str);
    }
}
