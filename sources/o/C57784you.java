package o;

import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.you, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57784you {
    public long AEQbTJ;
    public boolean EZpvd;
    public int KWHzl;
    public long OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.copydefault++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(long j) {
        this.OLrzqt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long copydefault() {
        return this.OLrzqt;
    }

    public C57784you() {
        this.OLrzqt = -1L;
        this.copydefault = 0;
        this.KWHzl = 1;
        this.AEQbTJ = 0L;
        this.EZpvd = false;
    }

    public C57784you(int i, long j) {
        this.KWHzl = 1;
        this.AEQbTJ = 0L;
        this.EZpvd = false;
        this.copydefault = i;
        this.OLrzqt = j;
    }

    public C57784you(JSONObject jSONObject) throws JSONException {
        this.OLrzqt = -1L;
        this.copydefault = 0;
        this.KWHzl = 1;
        this.AEQbTJ = 0L;
        this.EZpvd = true;
        java.lang.Object obj = jSONObject.get("limit");
        java.lang.Object obj2 = jSONObject.get("delay");
        if (obj instanceof java.lang.Integer) {
            this.KWHzl = ((java.lang.Integer) obj).intValue();
        }
        if (obj2 instanceof java.lang.Long) {
            this.AEQbTJ = ((java.lang.Long) obj2).longValue();
        } else if (obj2 instanceof java.lang.Integer) {
            this.AEQbTJ = ((java.lang.Integer) obj2).intValue();
        }
    }

    public void copydefault(C57784you c57784you) {
        OLrzqt(c57784you.copydefault());
        KWHzl(c57784you.OLrzqt());
    }

    public boolean djBIcL() {
        boolean z = this.copydefault < this.KWHzl;
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OSInAppMessage shouldDisplayAgain: " + z);
        return z;
    }

    public boolean KWHzl() {
        if (this.OLrzqt < 0) {
            return true;
        }
        long jKWHzl = OneSignal.aKErDB().KWHzl() / 1000;
        long j = jKWHzl - this.OLrzqt;
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OSInAppMessage lastDisplayTime: " + this.OLrzqt + " currentTimeInSeconds: " + jKWHzl + " diffInSeconds: " + j + " displayDelay: " + this.AEQbTJ);
        return j >= this.AEQbTJ;
    }

    public java.lang.String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.OLrzqt + ", displayQuantity=" + this.copydefault + ", displayLimit=" + this.KWHzl + ", displayDelay=" + this.AEQbTJ + AbstractJsonLexerKt.END_OBJ;
    }
}
