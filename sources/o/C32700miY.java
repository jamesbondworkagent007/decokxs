package o;

import com.okinc.components.security.api.SecurityEventType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32700miY {
    public static final C32700miY KWHzl = new C32700miY();

    private C32700miY() {
    }

    public static /* synthetic */ C32755mja collectViewIdentifier$default(C32700miY c32700miY, android.view.View view, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c32700miY.KWHzl(view, str);
    }

    public final C32755mja KWHzl(@NotNull android.view.View view, java.lang.String str) {
        java.lang.CharSequence text;
        java.lang.String string;
        java.lang.String str2;
        java.lang.CharSequence text2;
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String str3 = (!(view instanceof android.widget.TextView) ? !(!(view instanceof android.widget.Button) || (text = ((android.widget.Button) view).getText()) == null || (string = text.toString()) == null) : !((text2 = ((android.widget.TextView) view).getText()) == null || (string = text2.toString()) == null)) ? "" : string;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        java.lang.String str4 = i + "," + iArr[1] + "," + (view.getWidth() + i) + "," + (iArr[1] + view.getHeight());
        if (str != null) {
            str2 = "R.id." + str;
        } else {
            str2 = "R.id.unknown_" + view.getId();
        }
        java.lang.String str5 = str2;
        int id = view.getId();
        java.lang.CharSequence contentDescription = view.getContentDescription();
        java.lang.String string2 = contentDescription != null ? contentDescription.toString() : null;
        java.lang.Object tag = view.getTag();
        java.lang.String string3 = tag != null ? tag.toString() : null;
        java.lang.String simpleName = view.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return new C32755mja(id, str5, str3, string2, string3, simpleName, str4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull final java.lang.String str, @NotNull android.view.View view, final boolean z, java.lang.String str2, Function1<? super C32680miE, Unit> function1) {
        SecurityEventType securityEventType;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(view, "");
        final C32755mja c32755mjaKWHzl = KWHzl(view, str2);
        C32866mlf.onEvent$default("security_remote_control_click_view", (TrackChannel[]) null, new Function1() { // from class: o.miW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32700miY.EZpvd(str, z, c32755mjaKWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32866mlf.onEvent$default("Security_Protector_RemoteControl_Click", (TrackChannel[]) null, new Function1() { // from class: o.miU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32700miY.OLrzqt(str, z, c32755mjaKWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (function1 != null) {
            switch (str.hashCode()) {
                case -4252519:
                    if (str.equals("OVERLAY_CLICK")) {
                        securityEventType = SecurityEventType.OVERLAY_CLICK;
                    } else {
                        securityEventType = SecurityEventType.ACCESSIBILITY_CLICK;
                    }
                    break;
                case 273602258:
                    if (str.equals("GESTURE_CLICK")) {
                        securityEventType = SecurityEventType.GESTURE_CLICK;
                        break;
                    }
                    break;
                case 1372712727:
                    if (str.equals("ACCESSIBILITY_CLICK")) {
                        securityEventType = SecurityEventType.ACCESSIBILITY_CLICK;
                        break;
                    }
                    break;
                case 2057352598:
                    if (!str.equals("ACCESSIBILITY_LONG_CLICK")) {
                    }
                    break;
            }
            function1.invoke(new C32680miE(securityEventType, str, z));
        }
    }

    public static final Unit EZpvd(java.lang.String str, boolean z, C32755mja c32755mja, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "blocked", java.lang.String.valueOf(z), false, 4, null);
        EventParamsList.put$default(eventParamsList, "identifier", "id=" + c32755mja.OLrzqt() + ", text='" + c32755mja.KWHzl() + "', pos='" + c32755mja.AEQbTJ() + "'", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, C32755mja c32755mja, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "blocked", java.lang.String.valueOf(z), false, 4, null);
        EventParamsList.put$default(eventParamsList, "identifier", "id=" + c32755mja.OLrzqt() + ", text='" + c32755mja.KWHzl() + "', pos='" + c32755mja.AEQbTJ() + "'", false, 4, null);
        return Unit.INSTANCE;
    }
}
