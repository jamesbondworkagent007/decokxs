package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.ytj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58038ytj {
    public java.lang.String AEQbTJ;
    public JSONObject EZpvd;
    public int KWHzl;
    public AbstractC58042ytn OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(AbstractC58042ytn abstractC58042ytn) {
        this.OLrzqt = abstractC58042ytn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(JSONObject jSONObject) {
        this.EZpvd = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.KWHzl;
    }

    public C58038ytj() {
    }

    public C58038ytj(JSONObject jSONObject) {
        this.EZpvd = jSONObject;
    }

    public java.lang.String toString() {
        JSONObject jSONObject = this.EZpvd;
        java.lang.String string = jSONObject != null ? jSONObject.toString() : "";
        return java.lang.String.format("tag[%s]type[%d];key[%s];content[%s]", this.AEQbTJ, java.lang.Integer.valueOf(this.KWHzl), this.copydefault, string);
    }
}
