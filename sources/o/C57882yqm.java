package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57882yqm extends AbstractC57881yql {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57882yqm(@NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull C57877yqh c57877yqh, @NotNull InterfaceC57887yqr interfaceC57887yqr) {
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
        try {
            JSONObject jSONObjectPut = c57885yqp.valueOf().put(HiAnalyticsConstant.BI_KEY_APP_ID, str).put("device_type", i);
            InterfaceC57887yqr interfaceC57887yqrAEQbTJ = AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
            interfaceC57887yqrAEQbTJ.OLrzqt(jSONObjectPut, interfaceC57828ypl);
        } catch (JSONException e) {
            OLrzqt().KWHzl("Generating indirect outcome:JSON Failed.", e);
        }
    }
}
