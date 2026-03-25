package com.onesignal;

import androidx.annotation.NonNull;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC57779yop;
import o.C57777yon;
import o.C57781yor;
import o.C57782yos;
import o.C57786yow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class OSInAppMessageAction {
    public String AEQbTJ;
    public C57786yow AYXKKw;
    public OSInAppMessageActionUrlType AhwBna;
    public String EZpvd;
    public boolean KWHzl;
    public String OLrzqt;
    public boolean copydefault;
    public String valueOf;
    public List<C57781yor> gEmmrt = new ArrayList();
    public List<AbstractC57779yop> djBIcL = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<C57781yor> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSInAppMessageActionUrlType AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57786yow KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<AbstractC57779yop> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.KWHzl;
    }

    public OSInAppMessageAction(@NonNull JSONObject jSONObject) throws JSONException {
        this.OLrzqt = jSONObject.optString("id", null);
        this.AEQbTJ = jSONObject.optString("name", null);
        this.EZpvd = jSONObject.optString("url", null);
        this.valueOf = jSONObject.optString("pageId", null);
        OSInAppMessageActionUrlType oSInAppMessageActionUrlTypeFromString = OSInAppMessageActionUrlType.fromString(jSONObject.optString("url_target", null));
        this.AhwBna = oSInAppMessageActionUrlTypeFromString;
        if (oSInAppMessageActionUrlTypeFromString == null) {
            this.AhwBna = OSInAppMessageActionUrlType.IN_APP_WEBVIEW;
        }
        this.copydefault = jSONObject.optBoolean(EopTrackEvent.CLOSE, true);
        if (jSONObject.has("outcomes")) {
            KWHzl(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.AYXKKw = new C57786yow(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            OLrzqt(jSONObject);
        }
    }

    public final void KWHzl(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.gEmmrt.add(new C57781yor((JSONObject) jSONArray.get(i)));
        }
    }

    public final void OLrzqt(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            string.hashCode();
            if (string.equals("push")) {
                this.djBIcL.add(new C57782yos());
            } else if (string.equals("location")) {
                this.djBIcL.add(new C57777yon());
            }
        }
    }

    public enum OSInAppMessageActionUrlType {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");

        private String text;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }

        OSInAppMessageActionUrlType(String str) {
            this.text = str;
        }

        public static OSInAppMessageActionUrlType fromString(String str) {
            for (OSInAppMessageActionUrlType oSInAppMessageActionUrlType : values()) {
                if (oSInAppMessageActionUrlType.text.equalsIgnoreCase(str)) {
                    return oSInAppMessageActionUrlType;
                }
            }
            return null;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url_type", this.text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }
}
