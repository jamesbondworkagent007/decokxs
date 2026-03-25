package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: loaded from: classes21.dex */
public final class UU extends AbstractC5503Ug {
    public final UU AhwBna;
    public java.lang.String EZpvd;
    public UU OLrzqt;
    public int copydefault;
    public UV djBIcL;
    public int gEmmrt;
    public java.lang.Object valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UV AkhnZx() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public java.lang.Object KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UU copydefault(UV uv) {
        this.djBIcL = uv;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public void copydefault(java.lang.Object obj) {
        this.valueOf = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Ug; */
    @Override // o.AbstractC5503Ug
    /* JADX INFO: renamed from: ejfBZ, reason: merged with bridge method [inline-methods] */
    public UU AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UU fetchVPNInfo() {
        this.valueOf = null;
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public boolean gEmmrt() {
        return this.EZpvd != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        int i = this.KWHzl + 1;
        this.KWHzl = i;
        return this.AEQbTJ != 0 && i > 0;
    }

    public UU(UU uu, UV uv, int i, int i2, int i3) {
        this.AhwBna = uu;
        this.djBIcL = uv;
        this.AEQbTJ = i;
        this.gEmmrt = i2;
        this.copydefault = i3;
        this.KWHzl = -1;
    }

    public void EZpvd(int i, int i2, int i3) {
        this.AEQbTJ = i;
        this.KWHzl = -1;
        this.gEmmrt = i2;
        this.copydefault = i3;
        this.EZpvd = null;
        this.valueOf = null;
        UV uv = this.djBIcL;
        if (uv != null) {
            uv.EZpvd();
        }
    }

    public static UU AEQbTJ(UV uv) {
        return new UU(null, uv, 0, 1, 0);
    }

    public UU copydefault(int i, int i2) {
        UU uu = this.OLrzqt;
        if (uu == null) {
            UV uv = this.djBIcL;
            UU uu2 = new UU(this, uv == null ? null : uv.KWHzl(), 1, i, i2);
            this.OLrzqt = uu2;
            return uu2;
        }
        uu.EZpvd(1, i, i2);
        return uu;
    }

    public UU OLrzqt(int i, int i2) {
        UU uu = this.OLrzqt;
        if (uu == null) {
            UV uv = this.djBIcL;
            UU uu2 = new UU(this, uv == null ? null : uv.KWHzl(), 2, i, i2);
            this.OLrzqt = uu2;
            return uu2;
        }
        uu.EZpvd(2, i, i2);
        return uu;
    }

    @Override // o.AbstractC5503Ug
    public JsonLocation OLrzqt(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1L, this.gEmmrt, this.copydefault);
    }

    public void KWHzl(java.lang.String str) throws JsonProcessingException {
        this.EZpvd = str;
        UV uv = this.djBIcL;
        if (uv != null) {
            AEQbTJ(uv, str);
        }
    }

    public final void AEQbTJ(UV uv, java.lang.String str) throws JsonProcessingException {
        if (uv.AEQbTJ(str)) {
            java.lang.Object objAEQbTJ = uv.AEQbTJ();
            throw new JsonParseException(objAEQbTJ instanceof JsonParser ? (JsonParser) objAEQbTJ : null, "Duplicate field '" + str + "'");
        }
    }
}
