package com.onesignal;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OSTrigger {
    public OSTriggerKind AEQbTJ;
    public String EZpvd;
    public String KWHzl;
    public OSTriggerOperator OLrzqt;
    public Object copydefault;

    public enum OSTriggerOperator {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");

        private String text;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }

        OSTriggerOperator(String str) {
            this.text = str;
        }

        public static OSTriggerOperator fromString(String str) {
            for (OSTriggerOperator oSTriggerOperator : values()) {
                if (oSTriggerOperator.text.equalsIgnoreCase(str)) {
                    return oSTriggerOperator;
                }
            }
            return EQUAL_TO;
        }
    }

    public enum OSTriggerKind {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");

        private String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        OSTriggerKind(String str) {
            this.value = str;
        }

        public static OSTriggerKind fromString(String str) {
            for (OSTriggerKind oSTriggerKind : values()) {
                if (oSTriggerKind.value.equalsIgnoreCase(str)) {
                    return oSTriggerKind;
                }
            }
            return UNKNOWN;
        }
    }

    public OSTrigger(JSONObject jSONObject) throws JSONException {
        this.KWHzl = jSONObject.getString("id");
        this.AEQbTJ = OSTriggerKind.fromString(jSONObject.getString("kind"));
        this.EZpvd = jSONObject.optString("property", null);
        this.OLrzqt = OSTriggerOperator.fromString(jSONObject.getString("operator"));
        this.copydefault = jSONObject.opt("value");
    }

    public String toString() {
        return "OSTrigger{triggerId='" + this.KWHzl + "', kind=" + this.AEQbTJ + ", property='" + this.EZpvd + "', operatorType=" + this.OLrzqt + ", value=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
