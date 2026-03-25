package o;

import com.ibm.icu.util.UResourceBundle;
import com.ibm.icu.util.UResourceTypeMismatchException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.agV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7260agV {
    public int EZpvd = 0;
    public int KWHzl;
    public UResourceBundle OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.EZpvd = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.EZpvd < this.KWHzl;
    }

    public C7260agV(UResourceBundle uResourceBundle) {
        this.KWHzl = 0;
        this.OLrzqt = uResourceBundle;
        this.KWHzl = uResourceBundle.fARcdN();
    }

    public UResourceBundle copydefault() throws NoSuchElementException {
        int i = this.EZpvd;
        if (i < this.KWHzl) {
            UResourceBundle uResourceBundle = this.OLrzqt;
            this.EZpvd = i + 1;
            return uResourceBundle.KWHzl(i);
        }
        throw new NoSuchElementException();
    }

    public java.lang.String OLrzqt() throws UResourceTypeMismatchException, NoSuchElementException {
        int i = this.EZpvd;
        if (i < this.KWHzl) {
            UResourceBundle uResourceBundle = this.OLrzqt;
            this.EZpvd = i + 1;
            return uResourceBundle.copydefault(i);
        }
        throw new NoSuchElementException();
    }
}
