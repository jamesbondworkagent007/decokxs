package o;

import androidx.exifinterface.media.ExifInterface;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okuser.data.User;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.thf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46994thf {
    public static final C46994thf OLrzqt = new C46994thf();

    private C46994thf() {
    }

    public final java.util.List<java.lang.String> copydefault() {
        java.util.Set setGEmmrt = yEE.gEmmrt(OLrzqt(), AEQbTJ());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setGEmmrt, 10));
        java.util.Iterator it = setGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(C59449zhJ.replace$default((java.lang.String) it.next(), "_", "", false, 4, (java.lang.Object) null));
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    public final java.lang.String OLrzqt() {
        final java.lang.String str = "LANGUAGE_" + C59449zhJ.replace$default(pSC.AEQbTJ.KWHzl(), "-", "_", false, 4, (java.lang.Object) null);
        if (C43292rmY.OLrzqt.AwvSrB().values()) {
            C32866mlf.AEQbTJ("app_user_rcTag_language", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.thg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46994thf.copydefault(str, (EventParamsList) obj);
                }
            });
        }
        return str;
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String uid;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("language", str, false);
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        if (userOLrzqt != null && (uid = userOLrzqt.getUid()) != null) {
            eventParamsList.put("userId", uid, false);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String displayName = TimeZone.getDefault().getDisplayName(false, 0);
        Intrinsics.copydefault((java.lang.Object) displayName);
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) displayName, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
        if (C33129mqd.KWHzl((java.util.Collection) listSplit$default)) {
            return "TIME_ZONE_" + C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default((java.lang.String) listSplit$default.get(0), "+0", "E", false, 4, (java.lang.Object) null), "-0", ExifInterface.LONGITUDE_WEST, false, 4, (java.lang.Object) null), Marker.ANY_NON_NULL_MARKER, "E", false, 4, (java.lang.Object) null), "-", ExifInterface.LONGITUDE_WEST, false, 4, (java.lang.Object) null);
        }
        return "TIME_ZONE_" + C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(displayName, "+0", "E", false, 4, (java.lang.Object) null), "-0", ExifInterface.LONGITUDE_WEST, false, 4, (java.lang.Object) null), Marker.ANY_NON_NULL_MARKER, "E", false, 4, (java.lang.Object) null), "-", ExifInterface.LONGITUDE_WEST, false, 4, (java.lang.Object) null);
    }

    public final java.lang.String EZpvd() {
        pSC psc = pSC.AEQbTJ;
        java.lang.String strKWHzl = psc.KWHzl();
        java.lang.String language = psc.AEQbTJ().getLanguage();
        if (Intrinsics.EZpvd((java.lang.Object) language, (java.lang.Object) "zh")) {
            language = C38303pTu.OLrzqt(psc.AEQbTJ()) ? "zh-Hans" : "zh-Hant";
        } else if (Intrinsics.EZpvd((java.lang.Object) language, (java.lang.Object) "in") && android.text.TextUtils.equals(strKWHzl, "in-ID")) {
            language = "id";
        }
        pUU.KWHzl("PushTagUtils", "language : " + language);
        Intrinsics.copydefault((java.lang.Object) language);
        return language;
    }
}
