package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: loaded from: classes21.dex */
public class YC extends AbstractC5503Ug {
    public final JsonLocation AYXKKw;
    public java.lang.String EZpvd;
    public final AbstractC5503Ug OLrzqt;
    public java.lang.Object copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public AbstractC5503Ug AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) throws JsonProcessingException {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public java.lang.Object KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public void copydefault(java.lang.Object obj) {
        this.copydefault = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fARcdN() {
        this.KWHzl++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5503Ug
    public boolean gEmmrt() {
        return this.EZpvd != null;
    }

    public YC(AbstractC5503Ug abstractC5503Ug, ContentReference contentReference) {
        super(abstractC5503Ug);
        this.OLrzqt = abstractC5503Ug.AEQbTJ();
        this.EZpvd = abstractC5503Ug.copydefault();
        this.copydefault = abstractC5503Ug.KWHzl();
        if (abstractC5503Ug instanceof UU) {
            this.AYXKKw = ((UU) abstractC5503Ug).OLrzqt(contentReference);
        } else {
            this.AYXKKw = JsonLocation.NA;
        }
    }

    public YC(AbstractC5503Ug abstractC5503Ug, JsonLocation jsonLocation) {
        super(abstractC5503Ug);
        this.OLrzqt = abstractC5503Ug.AEQbTJ();
        this.EZpvd = abstractC5503Ug.copydefault();
        this.copydefault = abstractC5503Ug.KWHzl();
        this.AYXKKw = jsonLocation;
    }

    public YC() {
        super(0, -1);
        this.OLrzqt = null;
        this.AYXKKw = JsonLocation.NA;
    }

    public YC(YC yc, int i, int i2) {
        super(i, i2);
        this.OLrzqt = yc;
        this.AYXKKw = yc.AYXKKw;
    }

    public static YC AEQbTJ(AbstractC5503Ug abstractC5503Ug) {
        if (abstractC5503Ug == null) {
            return new YC();
        }
        return new YC(abstractC5503Ug, ContentReference.unknown());
    }

    public YC AkhnZx() {
        this.KWHzl++;
        return new YC(this, 1, -1);
    }

    public YC values() {
        this.KWHzl++;
        return new YC(this, 2, -1);
    }

    public YC fetchVPNInfo() {
        AbstractC5503Ug abstractC5503Ug = this.OLrzqt;
        if (abstractC5503Ug instanceof YC) {
            return (YC) abstractC5503Ug;
        }
        if (abstractC5503Ug == null) {
            return new YC();
        }
        return new YC(abstractC5503Ug, this.AYXKKw);
    }
}
