package o;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57880yqk extends AbstractC57881yql {

    /* JADX INFO: renamed from: o.yqk$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OSInfluenceType.values().length];
            iArr[OSInfluenceType.DIRECT.ordinal()] = 1;
            iArr[OSInfluenceType.INDIRECT.ordinal()] = 2;
            iArr[OSInfluenceType.UNATTRIBUTED.ordinal()] = 3;
            copydefault = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57880yqk(@NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull C57877yqh c57877yqh, @NotNull InterfaceC57887yqr interfaceC57887yqr) {
        super(interfaceC57738yoA, c57877yqh, interfaceC57887yqr);
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(c57877yqh, "");
        Intrinsics.checkNotNullParameter(interfaceC57887yqr, "");
    }

    @Override // o.InterfaceC57889yqt
    public void KWHzl(@NotNull java.lang.String str, int i, @NotNull C57885yqp c57885yqp, @NotNull InterfaceC57828ypl interfaceC57828ypl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c57885yqp, "");
        Intrinsics.checkNotNullParameter(interfaceC57828ypl, "");
        C57750yoM c57750yoMAEQbTJ = C57750yoM.AEQbTJ(c57885yqp);
        OSInfluenceType oSInfluenceTypeOLrzqt = c57750yoMAEQbTJ.OLrzqt();
        int i2 = oSInfluenceTypeOLrzqt == null ? -1 : TaskDescription.copydefault[oSInfluenceTypeOLrzqt.ordinal()];
        if (i2 == 1) {
            Intrinsics.checkNotNullExpressionValue(c57750yoMAEQbTJ, "");
            KWHzl(str, i, c57750yoMAEQbTJ, interfaceC57828ypl);
        } else if (i2 == 2) {
            Intrinsics.checkNotNullExpressionValue(c57750yoMAEQbTJ, "");
            OLrzqt(str, i, c57750yoMAEQbTJ, interfaceC57828ypl);
        } else {
            if (i2 != 3) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(c57750yoMAEQbTJ, "");
            EZpvd(str, i, c57750yoMAEQbTJ, interfaceC57828ypl);
        }
    }

    public final void KWHzl(java.lang.String str, int i, C57750yoM c57750yoM, InterfaceC57828ypl interfaceC57828ypl) {
        try {
            JSONObject jSONObjectPut = c57750yoM.AEQbTJ().put(HiAnalyticsConstant.BI_KEY_APP_ID, str).put("device_type", i).put(DevicePublicKeyStringDef.DIRECT, true);
            InterfaceC57887yqr interfaceC57887yqrAEQbTJ = AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
            interfaceC57887yqrAEQbTJ.OLrzqt(jSONObjectPut, interfaceC57828ypl);
        } catch (JSONException e) {
            OLrzqt().KWHzl("Generating direct outcome:JSON Failed.", e);
        }
    }

    public final void OLrzqt(java.lang.String str, int i, C57750yoM c57750yoM, InterfaceC57828ypl interfaceC57828ypl) {
        try {
            JSONObject jSONObjectPut = c57750yoM.AEQbTJ().put(HiAnalyticsConstant.BI_KEY_APP_ID, str).put("device_type", i).put(DevicePublicKeyStringDef.DIRECT, false);
            InterfaceC57887yqr interfaceC57887yqrAEQbTJ = AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
            interfaceC57887yqrAEQbTJ.OLrzqt(jSONObjectPut, interfaceC57828ypl);
        } catch (JSONException e) {
            OLrzqt().KWHzl("Generating indirect outcome:JSON Failed.", e);
        }
    }

    public final void EZpvd(java.lang.String str, int i, C57750yoM c57750yoM, InterfaceC57828ypl interfaceC57828ypl) {
        try {
            JSONObject jSONObjectPut = c57750yoM.AEQbTJ().put(HiAnalyticsConstant.BI_KEY_APP_ID, str).put("device_type", i);
            InterfaceC57887yqr interfaceC57887yqrAEQbTJ = AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
            interfaceC57887yqrAEQbTJ.OLrzqt(jSONObjectPut, interfaceC57828ypl);
        } catch (JSONException e) {
            OLrzqt().KWHzl("Generating unattributed outcome:JSON Failed.", e);
        }
    }
}
