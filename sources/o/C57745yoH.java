package o;

import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57745yoH {
    public boolean AEQbTJ;
    public java.lang.CharSequence AYXKKw;
    public android.net.Uri AhwBna;
    public boolean AkhnZx;
    public C57789yoz EZpvd;
    public android.content.Context KWHzl;
    public JSONObject OLrzqt;
    public java.lang.Integer copydefault;
    public android.net.Uri djBIcL;
    public java.lang.CharSequence gEmmrt;
    public java.lang.Long isConnected;
    public java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(android.net.Uri uri) {
        this.AhwBna = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.CharSequence charSequence) {
        this.gEmmrt = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(JSONObject jSONObject) {
        this.OLrzqt = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.net.Uri AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(android.content.Context context) {
        this.KWHzl = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.Integer num) {
        this.valueOf = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(android.net.Uri uri) {
        this.djBIcL = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.Integer num) {
        this.copydefault = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.content.Context copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.CharSequence charSequence) {
        this.AYXKKw = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.Long l) {
        this.isConnected = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Integer djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Long gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57789yoz valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.AkhnZx;
    }

    public C57745yoH(android.content.Context context) {
        this.KWHzl = context;
    }

    public C57745yoH(android.content.Context context, JSONObject jSONObject) {
        this(context, new C57789yoz(jSONObject), jSONObject);
    }

    public C57745yoH(android.content.Context context, C57789yoz c57789yoz, JSONObject jSONObject) {
        this.KWHzl = context;
        this.OLrzqt = jSONObject;
        KWHzl(c57789yoz);
    }

    public java.lang.CharSequence AhwBna() {
        java.lang.CharSequence charSequence = this.AYXKKw;
        return charSequence != null ? charSequence : this.EZpvd.DbNXlk();
    }

    public java.lang.CharSequence KWHzl() {
        java.lang.CharSequence charSequence = this.gEmmrt;
        return charSequence != null ? charSequence : this.EZpvd.EZpvd();
    }

    public boolean isConnected() {
        return this.EZpvd.valueOf() != null;
    }

    public java.lang.String EZpvd() {
        return OneSignal.EZpvd(this.OLrzqt);
    }

    public java.lang.Integer AEQbTJ() {
        return java.lang.Integer.valueOf(this.EZpvd.copydefault());
    }

    public void KWHzl(C57789yoz c57789yoz) {
        if (c57789yoz != null && !c57789yoz.isConnected()) {
            C57789yoz c57789yoz2 = this.EZpvd;
            if (c57789yoz2 != null && c57789yoz2.isConnected()) {
                c57789yoz.OLrzqt(this.EZpvd.copydefault());
            } else {
                c57789yoz.OLrzqt(new java.security.SecureRandom().nextInt());
            }
        }
        this.EZpvd = c57789yoz;
    }

    public java.lang.String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.OLrzqt + ", isRestoring=" + this.AkhnZx + ", isNotificationToDisplay=" + this.AEQbTJ + ", shownTimeStamp=" + this.isConnected + ", overriddenBodyFromExtender=" + ((java.lang.Object) this.gEmmrt) + ", overriddenTitleFromExtender=" + ((java.lang.Object) this.AYXKKw) + ", overriddenSound=" + this.djBIcL + ", overriddenFlags=" + this.valueOf + ", orgFlags=" + this.copydefault + ", orgSound=" + this.AhwBna + ", notification=" + this.EZpvd + AbstractJsonLexerKt.END_OBJ;
    }
}
