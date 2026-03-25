package o;

import java.util.StringTokenizer;
import org.htmlcleaner.BelongsTo;
import org.htmlcleaner.CloseTag;
import org.htmlcleaner.ContentType;

/* JADX INFO: renamed from: o.zpn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59894zpn {
    public CloseTag AEQbTJ;
    public boolean AYXKKw;
    public BelongsTo OLrzqt;
    public ContentType copydefault;
    public boolean ejfBZ;
    public boolean fetchVPNInfo;
    public java.lang.String isConnected;
    public org.htmlcleaner.Display valueOf;
    public java.util.Set<java.lang.String> AkhnZx = new java.util.HashSet();
    public java.util.Set<java.lang.String> djBIcL = new java.util.HashSet();
    public java.util.Set<java.lang.String> KWHzl = new java.util.HashSet();
    public java.util.Set<java.lang.String> DbNXlk = new java.util.HashSet();
    public java.util.Set<java.lang.String> gEmmrt = new java.util.HashSet();
    public java.util.Set<java.lang.String> EZpvd = new java.util.HashSet();
    public java.util.Set<java.lang.String> values = new java.util.HashSet();
    public java.util.Set<java.lang.String> AhwBna = new java.util.HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> valueOf() {
        return this.values;
    }

    public C59894zpn(java.lang.String str, ContentType contentType, BelongsTo belongsTo, boolean z, boolean z2, boolean z3, CloseTag closeTag, org.htmlcleaner.Display display) {
        this.OLrzqt = BelongsTo.BODY;
        this.isConnected = str;
        this.copydefault = contentType;
        this.OLrzqt = belongsTo;
        this.AYXKKw = z;
        this.ejfBZ = z2;
        this.fetchVPNInfo = z3;
        this.AEQbTJ = closeTag;
        this.valueOf = display;
    }

    public void OLrzqt(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String strNextToken = stringTokenizer.nextToken();
            this.AhwBna.add(strNextToken);
            this.djBIcL.add(strNextToken);
        }
    }

    public void AhwBna(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String strNextToken = stringTokenizer.nextToken();
            this.values.add(strNextToken);
            this.djBIcL.add(strNextToken);
        }
    }

    public void AYXKKw(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.DbNXlk.add(stringTokenizer.nextToken());
        }
    }

    public void EZpvd(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.KWHzl.add(stringTokenizer.nextToken());
        }
    }

    public void valueOf(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.djBIcL.add(stringTokenizer.nextToken());
        }
    }

    public void AEQbTJ(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String strNextToken = stringTokenizer.nextToken();
            this.gEmmrt.add(strNextToken);
            this.AkhnZx.add(strNextToken);
        }
    }

    public void copydefault(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.EZpvd.add(stringTokenizer.nextToken());
        }
    }

    public void KWHzl(java.lang.String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.AkhnZx.add(stringTokenizer.nextToken());
        }
    }

    public boolean fetchVPNInfo(java.lang.String str) {
        java.util.Iterator<java.lang.String> it = this.AhwBna.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean OLrzqt() {
        return ContentType.none != this.copydefault;
    }

    public boolean values(java.lang.String str) {
        return this.djBIcL.contains(str);
    }

    public boolean gEmmrt(java.lang.String str) {
        return this.gEmmrt.contains(str);
    }

    public boolean gEmmrt() {
        return !this.gEmmrt.isEmpty();
    }

    public boolean djBIcL(java.lang.String str) {
        return this.EZpvd.contains(str);
    }

    public boolean AhwBna() {
        return !this.DbNXlk.isEmpty();
    }

    public boolean fetchVPNInfo() {
        return this.OLrzqt == BelongsTo.HEAD;
    }

    public boolean AYXKKw() {
        BelongsTo belongsTo = this.OLrzqt;
        return belongsTo == BelongsTo.HEAD || belongsTo == BelongsTo.HEAD_AND_BODY;
    }

    public boolean copydefault(C59894zpn c59894zpn) {
        return c59894zpn != null && (this.AkhnZx.contains(c59894zpn.AEQbTJ()) || c59894zpn.copydefault == ContentType.text);
    }

    public boolean EZpvd(InterfaceC59833zoW interfaceC59833zoW) {
        if (this.copydefault != ContentType.none && (interfaceC59833zoW instanceof AbstractC59897zpq) && "script".equals(((AbstractC59897zpq) interfaceC59833zoW).values())) {
            return true;
        }
        int i = AnonymousClass3.AEQbTJ[this.copydefault.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return !(interfaceC59833zoW instanceof AbstractC59897zpq);
            }
            if (i != 3) {
                return false;
            }
            if (interfaceC59833zoW instanceof C59881zpa) {
                return ((C59881zpa) interfaceC59833zoW).gEmmrt();
            }
            return !(interfaceC59833zoW instanceof AbstractC59897zpq);
        }
        if (!this.KWHzl.isEmpty()) {
            if (interfaceC59833zoW instanceof AbstractC59897zpq) {
                return this.KWHzl.contains(((AbstractC59897zpq) interfaceC59833zoW).values());
            }
        } else if (!this.DbNXlk.isEmpty() && (interfaceC59833zoW instanceof AbstractC59897zpq)) {
            return !this.DbNXlk.contains(((AbstractC59897zpq) interfaceC59833zoW).values());
        }
        return true;
    }

    /* JADX INFO: renamed from: o.zpn$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ContentType.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ContentType.all.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ContentType.text.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ContentType.none.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public boolean copydefault() {
        return ContentType.all == this.copydefault && this.KWHzl.isEmpty();
    }
}
