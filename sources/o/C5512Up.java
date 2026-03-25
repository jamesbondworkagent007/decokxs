package o;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.filter.TokenFilter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5512Up extends AbstractC5503Ug {
    public boolean AhwBna;
    public C5512Up EZpvd;
    public java.lang.String OLrzqt;
    public TokenFilter copydefault;
    public boolean djBIcL;
    public final C5512Up valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5512Up EZpvd(int i, TokenFilter tokenFilter, boolean z) {
        this.AEQbTJ = i;
        this.copydefault = tokenFilter;
        this.KWHzl = -1;
        this.OLrzqt = null;
        this.AhwBna = z;
        this.djBIcL = false;
        return this;
    }

    @Override // o.AbstractC5503Ug
    public java.lang.Object KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenFilter OLrzqt(java.lang.String str) throws JsonProcessingException {
        this.OLrzqt = str;
        this.djBIcL = true;
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC5503Ug
    public void copydefault(java.lang.Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenFilter fetchVPNInfo() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public boolean gEmmrt() {
        return this.OLrzqt != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Ug; */
    @Override // o.AbstractC5503Ug
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public final C5512Up AEQbTJ() {
        return this.valueOf;
    }

    public C5512Up(int i, C5512Up c5512Up, TokenFilter tokenFilter, boolean z) {
        this.AEQbTJ = i;
        this.valueOf = c5512Up;
        this.copydefault = tokenFilter;
        this.KWHzl = -1;
        this.AhwBna = z;
        this.djBIcL = false;
    }

    public static C5512Up copydefault(TokenFilter tokenFilter) {
        return new C5512Up(0, null, tokenFilter, true);
    }

    public C5512Up copydefault(TokenFilter tokenFilter, boolean z) {
        C5512Up c5512Up = this.EZpvd;
        if (c5512Up == null) {
            C5512Up c5512Up2 = new C5512Up(1, this, tokenFilter, z);
            this.EZpvd = c5512Up2;
            return c5512Up2;
        }
        return c5512Up.EZpvd(1, tokenFilter, z);
    }

    public C5512Up OLrzqt(TokenFilter tokenFilter, boolean z) {
        C5512Up c5512Up = this.EZpvd;
        if (c5512Up == null) {
            C5512Up c5512Up2 = new C5512Up(2, this, tokenFilter, z);
            this.EZpvd = c5512Up2;
            return c5512Up2;
        }
        return c5512Up.EZpvd(2, tokenFilter, z);
    }

    public TokenFilter EZpvd(TokenFilter tokenFilter) {
        int i = this.AEQbTJ;
        if (i == 2) {
            return tokenFilter;
        }
        int i2 = this.KWHzl + 1;
        this.KWHzl = i2;
        if (i == 1) {
            return tokenFilter.AEQbTJ(i2);
        }
        return tokenFilter.OLrzqt(i2);
    }

    public com.fasterxml.jackson.core.JsonToken fARcdN() {
        if (!this.AhwBna) {
            this.AhwBna = true;
            if (this.AEQbTJ == 2) {
                return com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            }
            return com.fasterxml.jackson.core.JsonToken.START_ARRAY;
        }
        if (!this.djBIcL || this.AEQbTJ != 2) {
            return null;
        }
        this.djBIcL = false;
        return com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    }

    public C5512Up OLrzqt(C5512Up c5512Up) {
        C5512Up c5512Up2 = this.valueOf;
        if (c5512Up2 == c5512Up) {
            return this;
        }
        while (c5512Up2 != null) {
            C5512Up c5512Up3 = c5512Up2.valueOf;
            if (c5512Up3 == c5512Up) {
                return c5512Up2;
            }
            c5512Up2 = c5512Up3;
        }
        return null;
    }

    public void copydefault(java.lang.StringBuilder sb) {
        C5512Up c5512Up = this.valueOf;
        if (c5512Up != null) {
            c5512Up.copydefault(sb);
        }
        int i = this.AEQbTJ;
        if (i != 2) {
            if (i == 1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(OLrzqt());
                sb.append(AbstractJsonLexerKt.END_LIST);
                return;
            }
            sb.append("/");
            return;
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.OLrzqt != null) {
            sb.append('\"');
            sb.append(this.OLrzqt);
            sb.append('\"');
        } else {
            sb.append('?');
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // o.AbstractC5503Ug
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        copydefault(sb);
        return sb.toString();
    }
}
