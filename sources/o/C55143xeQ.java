package o;

import com.amplifyframework.core.model.ModelIdentifier;

/* JADX INFO: renamed from: o.xeQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55143xeQ implements InterfaceC55136xeJ {
    public C55130xeD AEQbTJ;
    public C55130xeD EZpvd;
    public C55130xeD OLrzqt;
    public C55130xeD KWHzl = new C55130xeD("default", android.graphics.Typeface.DEFAULT);
    public C55130xeD gEmmrt = new C55130xeD(com.google.android.exoplayer2.C.SERIF_NAME, android.graphics.Typeface.SERIF);
    public C55130xeD valueOf = new C55130xeD(com.google.android.exoplayer2.C.SANS_SERIF_NAME, android.graphics.Typeface.SANS_SERIF);
    public C55130xeD copydefault = new C55130xeD("monospace", android.graphics.Typeface.MONOSPACE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55136xeJ
    public C55130xeD AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55130xeD EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55130xeD KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55136xeJ
    public C55130xeD OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55136xeJ
    public C55130xeD copydefault() {
        return this.EZpvd;
    }

    public C55143xeQ() {
        C55051xce c55051xce = C55051xce.OLrzqt;
        this.EZpvd = new C55130xeD("harmony_sans_regular", c55051xce.valueOf());
        this.AEQbTJ = new C55130xeD("harmony_sans_bold", c55051xce.AEQbTJ());
        this.OLrzqt = new C55130xeD("harmony_sans_medium", c55051xce.OLrzqt());
    }

    @Override // o.InterfaceC55136xeJ
    public C55130xeD AEQbTJ(java.lang.String str) {
        if (str != null && str.length() > 0) {
            java.lang.String[] strArrSplit = str.split(",(\\s)*");
            for (int i = 0; i < strArrSplit.length; i++) {
                java.lang.String strSubstring = strArrSplit[i];
                if (strSubstring.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) && strSubstring.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                if (strSubstring.startsWith("'") && strSubstring.endsWith("'")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                C55130xeD c55130xeDOLrzqt = OLrzqt(strSubstring);
                if (c55130xeDOLrzqt != null) {
                    return c55130xeDOLrzqt;
                }
            }
        }
        return OLrzqt();
    }

    public C55130xeD OLrzqt(java.lang.String str) {
        if (str.equalsIgnoreCase(com.google.android.exoplayer2.C.SERIF_NAME)) {
            return KWHzl();
        }
        if (str.equalsIgnoreCase(com.google.android.exoplayer2.C.SANS_SERIF_NAME)) {
            return EZpvd();
        }
        if (str.equalsIgnoreCase("monospace")) {
            return this.copydefault;
        }
        return null;
    }
}
