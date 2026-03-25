package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C57626ylv {
    public static final C57626ylv AEQbTJ = new C57626ylv();

    private C57626ylv() {
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C32866mlf.onEvent$default("HomePage_Account_VIPPOPUP_View", (TrackChannel[]) null, new Function1() { // from class: o.ylu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57626ylv.valueOf(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit valueOf(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        final java.lang.String str = i == 1 ? "unactivate" : "activated";
        C32866mlf.onEvent$default("VIPactivatepopup_Giftvip_Giftvip_View", (TrackChannel[]) null, new Function1() { // from class: o.yly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57626ylv.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("activatvip", str, true);
        return Unit.INSTANCE;
    }

    public final void copydefault(int i) {
        final java.lang.String str = i == 1 ? "activate" : "viewbenefit";
        C32866mlf.onEvent$default("VIPactivatepopup_Giftvip_Giftvip_Click", (TrackChannel[]) null, new Function1() { // from class: o.ylx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57626ylv.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("activatvip", str, true);
        return Unit.INSTANCE;
    }
}
