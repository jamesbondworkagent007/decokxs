package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C38431pYn {
    public static final C38431pYn KWHzl = new C38431pYn();

    private C38431pYn() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pYn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadFilterResult$default(C38431pYn c38431pYn, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        c38431pYn.KWHzl(str, list);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        C32866mlf.onEvent$default("Feed_Top_Filter_View", (TrackChannel[]) null, new Function1() { // from class: o.pYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38431pYn.KWHzl(str, list, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page", "opportunity", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "filter_group", KWHzl.OLrzqt((java.util.List<java.lang.String>) list), false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt(java.util.List<java.lang.String> list) {
        return list.isEmpty() ? "all" : CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: o.pYt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38431pYn.AEQbTJ((java.lang.String) obj);
            }
        }, 31, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.CharSequence AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 49:
                if (!str.equals("1")) {
                }
                break;
            case 50:
                if (!str.equals("2")) {
                }
                break;
            case 51:
                if (!str.equals("3")) {
                }
                break;
            case 52:
                if (!str.equals("4")) {
                }
                break;
            case 53:
                if (!str.equals("5")) {
                }
                break;
        }
        return "";
    }
}
