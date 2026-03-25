package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57871yqb extends AbstractC57813ypW {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57813ypW
    public java.lang.String AYXKKw() {
        return MTPushConstants.Message.KEY_NOTIFICATION_ID;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57871yqb(@NotNull C57816ypZ c57816ypZ, @NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull InterfaceC57821ype interfaceC57821ype) {
        super(c57816ypZ, interfaceC57738yoA, interfaceC57821ype);
        Intrinsics.checkNotNullParameter(c57816ypZ, "");
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(interfaceC57821ype, "");
    }

    @Override // o.AbstractC57813ypW
    public JSONArray EZpvd(java.lang.String str) {
        try {
            return values();
        } catch (JSONException e) {
            DbNXlk().KWHzl("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    @Override // o.AbstractC57813ypW
    public JSONArray values() throws JSONException {
        return copydefault().gEmmrt();
    }

    @Override // o.AbstractC57813ypW
    public OSInfluenceChannel AEQbTJ() {
        return OSInfluenceChannel.NOTIFICATION;
    }

    @Override // o.AbstractC57813ypW
    public int KWHzl() {
        return copydefault().valueOf();
    }

    @Override // o.AbstractC57813ypW
    public int djBIcL() {
        return copydefault().djBIcL();
    }

    @Override // o.AbstractC57813ypW
    public void KWHzl(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        copydefault().OLrzqt(jSONArray);
    }

    @Override // o.AbstractC57813ypW
    public void AkhnZx() {
        OSInfluenceType oSInfluenceTypeAhwBna = copydefault().AhwBna();
        if (oSInfluenceTypeAhwBna.isIndirect()) {
            AEQbTJ(isConnected());
        } else if (oSInfluenceTypeAhwBna.isDirect()) {
            AEQbTJ(copydefault().EZpvd());
        }
        Unit unit = Unit.INSTANCE;
        EZpvd(oSInfluenceTypeAhwBna);
        DbNXlk().OLrzqt(Intrinsics.KWHzl("OneSignal NotificationTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // o.AbstractC57813ypW
    public void EZpvd(@NotNull JSONObject jSONObject, @NotNull C57870yqa c57870yqa) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(c57870yqa, "");
        if (c57870yqa.EZpvd().isAttributed()) {
            try {
                jSONObject.put(DevicePublicKeyStringDef.DIRECT, c57870yqa.EZpvd().isDirect());
                jSONObject.put("notification_ids", c57870yqa.OLrzqt());
            } catch (JSONException e) {
                DbNXlk().KWHzl("Generating notification tracker addSessionData JSONObject ", e);
            }
        }
    }

    @Override // o.AbstractC57813ypW
    public void EZpvd() {
        C57816ypZ c57816ypZCopydefault = copydefault();
        OSInfluenceType oSInfluenceTypeGEmmrt = gEmmrt();
        if (oSInfluenceTypeGEmmrt == null) {
            oSInfluenceTypeGEmmrt = OSInfluenceType.UNATTRIBUTED;
        }
        c57816ypZCopydefault.AEQbTJ(oSInfluenceTypeGEmmrt);
        copydefault().KWHzl(AhwBna());
    }
}
