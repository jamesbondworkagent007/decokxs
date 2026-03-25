package o;

import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;

/* JADX INFO: loaded from: classes2.dex */
public class SM {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public PreserveAspectRatio KWHzl;
    public SVG.Activity OLrzqt;
    public CSSParser.PictureInPictureParams copydefault;
    public SVG.Activity gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.KWHzl != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.OLrzqt != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.AEQbTJ != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.EZpvd != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.gEmmrt != null;
    }

    public SM() {
        this.copydefault = null;
        this.KWHzl = null;
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.EZpvd = null;
        this.gEmmrt = null;
    }

    public SM(SM sm) {
        this.copydefault = null;
        this.KWHzl = null;
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.EZpvd = null;
        this.gEmmrt = null;
        if (sm == null) {
            return;
        }
        this.copydefault = sm.copydefault;
        this.KWHzl = sm.KWHzl;
        this.OLrzqt = sm.OLrzqt;
        this.EZpvd = sm.EZpvd;
        this.gEmmrt = sm.gEmmrt;
    }

    public boolean EZpvd() {
        CSSParser.PictureInPictureParams pictureInPictureParams = this.copydefault;
        return pictureInPictureParams != null && pictureInPictureParams.copydefault() > 0;
    }

    public SM KWHzl(float f, float f2, float f3, float f4) {
        this.gEmmrt = new SVG.Activity(f, f2, f3, f4);
        return this;
    }
}
