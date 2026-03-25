package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ufS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48954ufS {
    public static final C48954ufS KWHzl = new C48954ufS();

    private C48954ufS() {
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final java.lang.String string = jSONObject.getString("activityId");
                final java.lang.String string2 = jSONObject.getString("activityName");
                if (C33129mqd.OLrzqt((java.lang.CharSequence) string) && C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
                    C32866mlf.EZpvd("ActivityLandingPage_Share_Button_View", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ufU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C48954ufS.OLrzqt(string, string2, (EventParamsList) obj);
                        }
                    });
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.copydefault((java.lang.Object) str);
        EventParamsList.put$default(eventParamsList, "activity_id", str, false, 4, null);
        Intrinsics.copydefault((java.lang.Object) str2);
        EventParamsList.put$default(eventParamsList, "activity_name", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final java.lang.String string = jSONObject.getString("activityId");
                final java.lang.String string2 = jSONObject.getString("activityName");
                if (C33129mqd.OLrzqt((java.lang.CharSequence) string) && C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
                    C32866mlf.EZpvd("ActivityLandingPage_Share_Button_Click", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ufT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C48954ufS.EZpvd(string, string2, (EventParamsList) obj);
                        }
                    });
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.copydefault((java.lang.Object) str);
        EventParamsList.put$default(eventParamsList, "activity_id", str, false, 4, null);
        Intrinsics.copydefault((java.lang.Object) str2);
        EventParamsList.put$default(eventParamsList, "activity_name", str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
