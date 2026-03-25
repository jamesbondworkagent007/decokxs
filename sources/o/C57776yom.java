package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.onesignal.OSTrigger;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57776yom extends C57771yoh {
    public java.util.Set<java.lang.String> AEQbTJ;
    public C57784you AYXKKw;
    public boolean AhwBna;
    public java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> AkhnZx;
    public double EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean djBIcL;
    public java.util.ArrayList<java.util.ArrayList<OSTrigger>> fetchVPNInfo;
    public boolean gEmmrt;
    public Date valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(double d) {
        this.EZpvd = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57784you OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        if (this.KWHzl) {
            return false;
        }
        this.KWHzl = true;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.OLrzqt;
    }

    public C57776yom(boolean z) {
        super("");
        this.AYXKKw = new C57784you();
        this.OLrzqt = false;
        this.djBIcL = false;
        this.AhwBna = z;
    }

    public C57776yom(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.util.Set<java.lang.String> set, boolean z, C57784you c57784you) {
        super(str);
        new C57784you();
        this.djBIcL = false;
        this.AEQbTJ = set;
        this.OLrzqt = z;
        this.AYXKKw = c57784you;
    }

    public C57776yom(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("id"));
        this.AYXKKw = new C57784you();
        this.OLrzqt = false;
        this.djBIcL = false;
        this.AkhnZx = AEQbTJ(jSONObject.getJSONObject("variants"));
        this.fetchVPNInfo = EZpvd(jSONObject.getJSONArray("triggers"));
        this.AEQbTJ = new java.util.HashSet();
        this.valueOf = EZpvd(jSONObject);
        if (jSONObject.has("has_liquid")) {
            this.gEmmrt = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.AYXKKw = new C57784you(jSONObject.getJSONObject("redisplay"));
        }
    }

    public final Date EZpvd(JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString(MetricsSQLiteCacheKt.METRICS_END_TIME);
            if (string.equals(AbstractJsonLexerKt.NULL)) {
                return null;
            }
            try {
                return C57842ypz.EZpvd().parse(string);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    public final java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> AEQbTJ(JSONObject jSONObject) throws JSONException {
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> map = new java.util.HashMap<>();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
            java.util.Iterator<java.lang.String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                java.lang.String next2 = itKeys2.next();
                map2.put(next2, jSONObject2.getString(next2));
            }
            map.put(next, map2);
        }
        return map;
    }

    public java.util.ArrayList<java.util.ArrayList<OSTrigger>> EZpvd(JSONArray jSONArray) throws JSONException {
        java.util.ArrayList<java.util.ArrayList<OSTrigger>> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            java.util.ArrayList<OSTrigger> arrayList2 = new java.util.ArrayList<>();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new OSTrigger(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public boolean KWHzl(java.lang.String str) {
        return !this.AEQbTJ.contains(str);
    }

    public void AEQbTJ() {
        this.AEQbTJ.clear();
    }

    public void OLrzqt(java.lang.String str) {
        this.AEQbTJ.add(str);
    }

    public void copydefault(java.lang.String str) {
        this.AEQbTJ.remove(str);
    }

    public java.lang.String toString() {
        return "OSInAppMessage{messageId='" + this.copydefault + "', variants=" + this.AkhnZx + ", triggers=" + this.fetchVPNInfo + ", clickedClickIds=" + this.AEQbTJ + ", redisplayStats=" + this.AYXKKw + ", displayDuration=" + this.EZpvd + ", displayedInSession=" + this.OLrzqt + ", triggerChanged=" + this.djBIcL + ", actionTaken=" + this.KWHzl + ", isPreview=" + this.AhwBna + ", endTime=" + this.valueOf + ", hasLiquid=" + this.gEmmrt + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.copydefault.equals(((C57776yom) obj).copydefault);
    }

    public int hashCode() {
        return this.copydefault.hashCode();
    }

    public boolean gEmmrt() {
        if (this.valueOf == null) {
            return false;
        }
        return this.valueOf.before(new Date());
    }
}
