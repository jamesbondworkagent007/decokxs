package com.okinc.components.report.db;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC32712mik;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public class EventData implements InterfaceC32712mik, Cloneable {
    String act;
    private Map<String, String> attrs;
    String code;
    String footprintId;
    public long id;
    String msg;
    String path;
    String source;
    Long time = Long.valueOf(System.currentTimeMillis());
    String env = "release";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAct() {
        return this.act;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getAttrs() {
        return this.attrs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getEnv() {
        return this.env;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFootprintId() {
        return this.footprintId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAct(String str) {
        this.act = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAttribute(Map<String, String> map) {
        this.attrs = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAttrs(Map<String, String> map) {
        this.attrs = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEnv(String str) {
        this.env = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFootprintId(String str) {
        this.footprintId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMsg(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPath(String str) {
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSource(String str) {
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTime(Long l) {
        this.time = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return this.id == eventData.id && Objects.equals(this.footprintId, eventData.footprintId) && Objects.equals(this.act, eventData.act) && Objects.equals(this.source, eventData.source) && Objects.equals(this.time, eventData.time) && Objects.equals(this.path, eventData.path) && Objects.equals(this.code, eventData.code) && Objects.equals(this.msg, eventData.msg) && Objects.equals(this.env, eventData.env) && Objects.equals(this.attrs, eventData.attrs);
    }

    public int hashCode() {
        long j = this.id;
        return Objects.hash(Long.valueOf(j), this.footprintId, this.act, this.source, this.time, this.path, this.code, this.msg, this.env, this.attrs);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventData{");
        sb.append("id=");
        sb.append(this.id);
        String str = this.footprintId;
        if (str != null && !str.isEmpty()) {
            sb.append(", footprintId='");
            sb.append(this.footprintId);
            sb.append('\'');
        }
        String str2 = this.act;
        if (str2 != null && !str2.isEmpty()) {
            sb.append(", act='");
            sb.append(this.act);
            sb.append('\'');
        }
        String str3 = this.source;
        if (str3 != null && !str3.isEmpty()) {
            sb.append(", source='");
            sb.append(this.source);
            sb.append('\'');
        }
        sb.append(", time=");
        sb.append(this.time);
        String str4 = this.path;
        if (str4 != null && !str4.isEmpty()) {
            sb.append(", path='");
            sb.append(this.path);
            sb.append('\'');
        }
        String str5 = this.code;
        if (str5 != null && !str5.isEmpty()) {
            sb.append(", code='");
            sb.append(this.code);
            sb.append('\'');
        }
        String str6 = this.msg;
        if (str6 != null && !str6.isEmpty()) {
            sb.append(", msg='");
            sb.append(this.msg);
            sb.append('\'');
        }
        String str7 = this.env;
        if (str7 != null && !str7.isEmpty()) {
            sb.append(", env='");
            sb.append(this.env);
            sb.append('\'');
        }
        Map<String, String> map = this.attrs;
        if (map != null && !map.isEmpty()) {
            sb.append(", attrs=");
            sb.append(this.attrs);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EventData m6663clone() {
        try {
            EventData eventData = (EventData) super.clone();
            if (getAttrs() != null && getAttrs().size() > 0) {
                eventData.attrs = deepCloneMap(getAttrs());
            }
            return eventData;
        } catch (CloneNotSupportedException unused) {
            EventData eventData2 = new EventData();
            eventData2.act = this.act;
            eventData2.source = this.source;
            eventData2.time = this.time;
            eventData2.path = this.path;
            eventData2.code = this.code;
            eventData2.msg = this.msg;
            eventData2.attrs = getAttrs();
            return eventData2;
        }
    }

    private Map<String, String> deepCloneMap(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        return map2;
    }
}
