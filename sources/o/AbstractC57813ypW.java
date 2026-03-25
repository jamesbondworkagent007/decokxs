package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57813ypW {
    public JSONArray AEQbTJ;
    public java.lang.String EZpvd;
    public InterfaceC57738yoA KWHzl;
    public OSInfluenceType OLrzqt;
    public C57816ypZ copydefault;
    public InterfaceC57821ype gEmmrt;

    public abstract OSInfluenceChannel AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(JSONArray jSONArray) {
        this.AEQbTJ = jSONArray;
    }

    public abstract java.lang.String AYXKKw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.EZpvd;
    }

    public abstract void AkhnZx();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57738yoA DbNXlk() {
        return this.KWHzl;
    }

    public abstract JSONArray EZpvd(java.lang.String str);

    public abstract void EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(OSInfluenceType oSInfluenceType) {
        this.OLrzqt = oSInfluenceType;
    }

    public abstract void EZpvd(@NotNull JSONObject jSONObject, @NotNull C57870yqa c57870yqa);

    public abstract int KWHzl();

    public abstract void KWHzl(@NotNull JSONArray jSONArray);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57816ypZ copydefault() {
        return this.copydefault;
    }

    public abstract int djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OSInfluenceType gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray valueOf() {
        return this.AEQbTJ;
    }

    public abstract JSONArray values() throws JSONException;

    public AbstractC57813ypW(@NotNull C57816ypZ c57816ypZ, @NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull InterfaceC57821ype interfaceC57821ype) {
        Intrinsics.checkNotNullParameter(c57816ypZ, "");
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(interfaceC57821ype, "");
        this.copydefault = c57816ypZ;
        this.KWHzl = interfaceC57738yoA;
        this.gEmmrt = interfaceC57821ype;
    }

    public final boolean fetchVPNInfo() {
        return this.copydefault.AYXKKw();
    }

    public final boolean fIwbmz() {
        return this.copydefault.values();
    }

    public final boolean fJNWhG() {
        return this.copydefault.isConnected();
    }

    public final C57870yqa OLrzqt() {
        OSInfluenceChannel oSInfluenceChannelAEQbTJ = AEQbTJ();
        OSInfluenceType oSInfluenceType = OSInfluenceType.DISABLED;
        C57870yqa c57870yqa = new C57870yqa(oSInfluenceChannelAEQbTJ, oSInfluenceType, null);
        if (this.OLrzqt == null) {
            AkhnZx();
        }
        OSInfluenceType oSInfluenceType2 = this.OLrzqt;
        if (oSInfluenceType2 != null) {
            oSInfluenceType = oSInfluenceType2;
        }
        if (oSInfluenceType.isDirect()) {
            if (fetchVPNInfo()) {
                c57870yqa.KWHzl(new JSONArray().put(AhwBna()));
                c57870yqa.copydefault(OSInfluenceType.DIRECT);
            }
        } else if (oSInfluenceType.isIndirect()) {
            if (fIwbmz()) {
                c57870yqa.KWHzl(valueOf());
                c57870yqa.copydefault(OSInfluenceType.INDIRECT);
            }
        } else if (fJNWhG()) {
            c57870yqa.copydefault(OSInfluenceType.UNATTRIBUTED);
        }
        return c57870yqa;
    }

    public final JSONArray isConnected() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArrayValues = values();
            this.KWHzl.OLrzqt(Intrinsics.KWHzl("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ", jSONArrayValues));
            long jDjBIcL = djBIcL() * 60;
            long jKWHzl = this.gEmmrt.KWHzl();
            int length = jSONArrayValues.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = jSONArrayValues.getJSONObject(i);
                    if (jKWHzl - jSONObject.getLong(CrashHianalyticsData.TIME) <= 1000 * jDjBIcL) {
                        jSONArray.put(jSONObject.getString(AYXKKw()));
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (JSONException e) {
            this.KWHzl.KWHzl("Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    public final void ejfBZ() {
        this.EZpvd = null;
        JSONArray jSONArrayIsConnected = isConnected();
        this.AEQbTJ = jSONArrayIsConnected;
        this.OLrzqt = (jSONArrayIsConnected != null && jSONArrayIsConnected.length() > 0) ? OSInfluenceType.INDIRECT : OSInfluenceType.UNATTRIBUTED;
        EZpvd();
        this.KWHzl.OLrzqt("OneSignal OSChannelTracker resetAndInitInfluence: " + AYXKKw() + " finish with influenceType: " + this.OLrzqt);
    }

    public final void copydefault(java.lang.String str) {
        this.KWHzl.OLrzqt("OneSignal OSChannelTracker for: " + AYXKKw() + " saveLastId: " + ((java.lang.Object) str));
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray jSONArrayEZpvd = EZpvd(str);
        this.KWHzl.OLrzqt("OneSignal OSChannelTracker for: " + AYXKKw() + " saveLastId with lastChannelObjectsReceived: " + jSONArrayEZpvd);
        try {
            jSONArrayEZpvd.put(new JSONObject().put(AYXKKw(), str).put(CrashHianalyticsData.TIME, this.gEmmrt.KWHzl()));
            if (jSONArrayEZpvd.length() > KWHzl()) {
                int length = jSONArrayEZpvd.length() - KWHzl();
                JSONArray jSONArray = new JSONArray();
                int length2 = jSONArrayEZpvd.length();
                if (length < length2) {
                    while (true) {
                        int i = length + 1;
                        try {
                            jSONArray.put(jSONArrayEZpvd.get(length));
                        } catch (JSONException e) {
                            this.KWHzl.KWHzl("Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                        }
                        if (i >= length2) {
                            break;
                        } else {
                            length = i;
                        }
                    }
                }
                jSONArrayEZpvd = jSONArray;
            }
            this.KWHzl.OLrzqt("OneSignal OSChannelTracker for: " + AYXKKw() + " with channelObjectToSave: " + jSONArrayEZpvd);
            KWHzl(jSONArrayEZpvd);
        } catch (JSONException e2) {
            this.KWHzl.KWHzl("Generating tracker newInfluenceId JSONObject ", e2);
        }
    }

    public java.lang.String toString() {
        return "OSChannelTracker{tag=" + AYXKKw() + ", influenceType=" + this.OLrzqt + ", indirectIds=" + this.AEQbTJ + ", directId=" + ((java.lang.Object) this.EZpvd) + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.EZpvd(getClass(), obj.getClass())) {
            return false;
        }
        AbstractC57813ypW abstractC57813ypW = (AbstractC57813ypW) obj;
        return this.OLrzqt == abstractC57813ypW.OLrzqt && Intrinsics.EZpvd((java.lang.Object) abstractC57813ypW.AYXKKw(), (java.lang.Object) AYXKKw());
    }

    public int hashCode() {
        OSInfluenceType oSInfluenceType = this.OLrzqt;
        return ((oSInfluenceType != null ? oSInfluenceType.hashCode() : 0) * 31) + AYXKKw().hashCode();
    }
}
