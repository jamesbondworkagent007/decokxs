package o;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes21.dex */
public class UX extends AbstractC5503Ug {
    public final UX AYXKKw;
    public UV AhwBna;
    public java.lang.Object EZpvd;
    public java.lang.String OLrzqt;
    public UX copydefault;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Ug; */
    @Override // o.AbstractC5503Ug
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public final UX AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public java.lang.Object KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UX copydefault(UV uv) {
        this.AhwBna = uv;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public void copydefault(java.lang.Object obj) {
        this.EZpvd = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UV fARcdN() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fIwbmz() {
        int i = this.AEQbTJ;
        if (i == 2) {
            if (!this.valueOf) {
                return 5;
            }
            this.valueOf = false;
            this.KWHzl++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.KWHzl;
            this.KWHzl = i2 + 1;
            return i2 < 0 ? 0 : 1;
        }
        int i3 = this.KWHzl + 1;
        this.KWHzl = i3;
        return i3 == 0 ? 0 : 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UX fetchVPNInfo() {
        this.EZpvd = null;
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public boolean gEmmrt() {
        return this.OLrzqt != null;
    }

    public UX(int i, UX ux, UV uv) {
        this.AEQbTJ = i;
        this.AYXKKw = ux;
        this.AhwBna = uv;
        this.KWHzl = -1;
    }

    public UX(int i, UX ux, UV uv, java.lang.Object obj) {
        this.AEQbTJ = i;
        this.AYXKKw = ux;
        this.AhwBna = uv;
        this.KWHzl = -1;
        this.EZpvd = obj;
    }

    public UX AEQbTJ(int i) {
        this.AEQbTJ = i;
        this.KWHzl = -1;
        this.OLrzqt = null;
        this.valueOf = false;
        this.EZpvd = null;
        UV uv = this.AhwBna;
        if (uv != null) {
            uv.EZpvd();
        }
        return this;
    }

    public UX EZpvd(int i, java.lang.Object obj) {
        this.AEQbTJ = i;
        this.KWHzl = -1;
        this.OLrzqt = null;
        this.valueOf = false;
        this.EZpvd = obj;
        UV uv = this.AhwBna;
        if (uv != null) {
            uv.EZpvd();
        }
        return this;
    }

    public static UX EZpvd(UV uv) {
        return new UX(0, null, uv);
    }

    public UX AkhnZx() {
        UX ux = this.copydefault;
        if (ux == null) {
            UV uv = this.AhwBna;
            UX ux2 = new UX(1, this, uv == null ? null : uv.KWHzl());
            this.copydefault = ux2;
            return ux2;
        }
        return ux.AEQbTJ(1);
    }

    public UX EZpvd(java.lang.Object obj) {
        UX ux = this.copydefault;
        if (ux == null) {
            UV uv = this.AhwBna;
            UX ux2 = new UX(1, this, uv == null ? null : uv.KWHzl(), obj);
            this.copydefault = ux2;
            return ux2;
        }
        return ux.EZpvd(1, obj);
    }

    public UX values() {
        UX ux = this.copydefault;
        if (ux == null) {
            UV uv = this.AhwBna;
            UX ux2 = new UX(2, this, uv == null ? null : uv.KWHzl());
            this.copydefault = ux2;
            return ux2;
        }
        return ux.AEQbTJ(2);
    }

    public UX AEQbTJ(java.lang.Object obj) {
        UX ux = this.copydefault;
        if (ux == null) {
            UV uv = this.AhwBna;
            UX ux2 = new UX(2, this, uv == null ? null : uv.KWHzl(), obj);
            this.copydefault = ux2;
            return ux2;
        }
        return ux.EZpvd(2, obj);
    }

    public int copydefault(java.lang.String str) throws JsonProcessingException {
        if (this.AEQbTJ != 2 || this.valueOf) {
            return 4;
        }
        this.valueOf = true;
        this.OLrzqt = str;
        UV uv = this.AhwBna;
        if (uv != null) {
            AEQbTJ(uv, str);
        }
        return this.KWHzl < 0 ? 0 : 1;
    }

    private final void AEQbTJ(UV uv, java.lang.String str) throws JsonProcessingException {
        if (uv.AEQbTJ(str)) {
            java.lang.Object objAEQbTJ = uv.AEQbTJ();
            throw new JsonGenerationException("Duplicate field '" + str + "'", objAEQbTJ instanceof JsonGenerator ? (JsonGenerator) objAEQbTJ : null);
        }
    }
}
