package com.bytedance.applog.event;

import com.bytedance.bdtracker.a;
import com.bytedance.bdtracker.f4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class EventBasicData {
    public final String abSdkVersion;
    public final long eventCreateTime;
    public final long eventIndex;
    public final String sessionId;
    public final String ssid;
    public final String uuid;
    public final String uuidType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EventBasicData(f4 f4Var) {
        this.eventIndex = f4Var.d;
        this.eventCreateTime = f4Var.c;
        this.sessionId = f4Var.e;
        this.uuid = f4Var.g;
        this.uuidType = f4Var.h;
        this.ssid = f4Var.i;
        this.abSdkVersion = f4Var.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAbSdkVersion() {
        return this.abSdkVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getEventCreateTime() {
        return this.eventCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getEventIndex() {
        return this.eventIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSsid() {
        return this.ssid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUuidType() {
        return this.uuidType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = a.a("EventBasisData{eventIndex=");
        sbA.append(this.eventIndex);
        sbA.append(", eventCreateTime=");
        sbA.append(this.eventCreateTime);
        sbA.append(", sessionId='");
        sbA.append(this.sessionId);
        sbA.append('\'');
        sbA.append(", uuid='");
        sbA.append(this.uuid);
        sbA.append('\'');
        sbA.append(", uuidType='");
        sbA.append(this.uuidType);
        sbA.append('\'');
        sbA.append(", ssid='");
        sbA.append(this.ssid);
        sbA.append('\'');
        sbA.append(", abSdkVersion='");
        sbA.append(this.abSdkVersion);
        sbA.append('\'');
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }
}
