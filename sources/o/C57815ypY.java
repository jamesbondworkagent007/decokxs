package o;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57815ypY extends AbstractC57813ypW {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57813ypW
    public java.lang.String AYXKKw() {
        return "iam_id";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57813ypW
    public void EZpvd(@NotNull JSONObject jSONObject, @NotNull C57870yqa c57870yqa) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(c57870yqa, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57815ypY(@NotNull C57816ypZ c57816ypZ, @NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull InterfaceC57821ype interfaceC57821ype) {
        super(c57816ypZ, interfaceC57738yoA, interfaceC57821ype);
        Intrinsics.checkNotNullParameter(c57816ypZ, "");
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(interfaceC57821ype, "");
    }

    @Override // o.AbstractC57813ypW
    public OSInfluenceChannel AEQbTJ() {
        return OSInfluenceChannel.IAM;
    }

    @Override // o.AbstractC57813ypW
    public JSONArray EZpvd(java.lang.String str) {
        try {
            JSONArray jSONArrayValues = values();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = jSONArrayValues.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) jSONArrayValues.getJSONObject(i).getString(AYXKKw()))) {
                            jSONArray.put(jSONArrayValues.getJSONObject(i));
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                DbNXlk().KWHzl("Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return jSONArrayValues;
            }
        } catch (JSONException e2) {
            DbNXlk().KWHzl("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    @Override // o.AbstractC57813ypW
    public JSONArray values() throws JSONException {
        return copydefault().KWHzl();
    }

    @Override // o.AbstractC57813ypW
    public int KWHzl() {
        return copydefault().AEQbTJ();
    }

    @Override // o.AbstractC57813ypW
    public int djBIcL() {
        return copydefault().copydefault();
    }

    @Override // o.AbstractC57813ypW
    public void KWHzl(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        copydefault().copydefault(jSONArray);
    }

    @Override // o.AbstractC57813ypW
    public void AkhnZx() {
        OSInfluenceType oSInfluenceTypeOLrzqt = copydefault().OLrzqt();
        if (oSInfluenceTypeOLrzqt.isIndirect()) {
            AEQbTJ(isConnected());
        }
        Unit unit = Unit.INSTANCE;
        EZpvd(oSInfluenceTypeOLrzqt);
        DbNXlk().OLrzqt(Intrinsics.KWHzl("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // o.AbstractC57813ypW
    public void EZpvd() {
        OSInfluenceType oSInfluenceTypeGEmmrt = gEmmrt();
        if (oSInfluenceTypeGEmmrt == null) {
            oSInfluenceTypeGEmmrt = OSInfluenceType.UNATTRIBUTED;
        }
        C57816ypZ c57816ypZCopydefault = copydefault();
        if (oSInfluenceTypeGEmmrt == OSInfluenceType.DIRECT) {
            oSInfluenceTypeGEmmrt = OSInfluenceType.INDIRECT;
        }
        c57816ypZCopydefault.copydefault(oSInfluenceTypeGEmmrt);
    }
}
