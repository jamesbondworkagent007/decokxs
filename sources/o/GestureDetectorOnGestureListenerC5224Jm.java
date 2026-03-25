package o;

import android.view.GestureDetector;
import com.amplitude.android.internal.ViewTarget;
import com.amplitude.common.Logger;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC5224Jm implements GestureDetector.OnGestureListener {
    public final Logger EZpvd;
    public final java.util.List<InterfaceC5234Jw> KWHzl;
    public final Function2<java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> OLrzqt;
    public final WeakReference<android.app.Activity> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, @NotNull android.view.MotionEvent motionEvent2, float f, float f2) {
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, @NotNull android.view.MotionEvent motionEvent2, float f, float f2) {
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.Jw> */
    /* JADX WARN: Multi-variable type inference failed */
    public GestureDetectorOnGestureListenerC5224Jm(@NotNull android.app.Activity activity, @NotNull Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2, @NotNull Logger logger, @NotNull java.util.List<? extends InterfaceC5234Jw> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = function2;
        this.EZpvd = logger;
        this.KWHzl = list;
        this.copydefault = new WeakReference<>(activity);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull android.view.MotionEvent motionEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.app.Activity activity;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        android.app.Activity activity2 = this.copydefault.get();
        if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            this.EZpvd.EZpvd("DecorView is null in onSingleTapUp()");
            Unit unit = Unit.INSTANCE;
            return false;
        }
        ViewTarget viewTargetAEQbTJ = C5220Ji.AEQbTJ(decorView, new kotlin.Pair(java.lang.Float.valueOf(motionEvent.getX()), java.lang.Float.valueOf(motionEvent.getY())), this.KWHzl, ViewTarget.Type.Clickable, this.EZpvd);
        if (viewTargetAEQbTJ == null) {
            this.EZpvd.KWHzl("Unable to find click target. No event captured.");
            Unit unit2 = Unit.INSTANCE;
            return false;
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[8];
        pairArr[0] = C56390yDp.OLrzqt("[Amplitude] Action", "touch");
        pairArr[1] = C56390yDp.OLrzqt("[Amplitude] Target Class", viewTargetAEQbTJ.AEQbTJ());
        pairArr[2] = C56390yDp.OLrzqt("[Amplitude] Target Resource", viewTargetAEQbTJ.copydefault());
        pairArr[3] = C56390yDp.OLrzqt("[Amplitude] Target Tag", viewTargetAEQbTJ.EZpvd());
        pairArr[4] = C56390yDp.OLrzqt("[Amplitude] Target Text", viewTargetAEQbTJ.AYXKKw());
        pairArr[5] = C56390yDp.OLrzqt("[Amplitude] Target Source", CollectionsKt___CollectionsKt.joinToString$default(StringsKt__StringsKt.split$default((java.lang.CharSequence) C59449zhJ.replace$default(viewTargetAEQbTJ.KWHzl(), "_", " ", false, 4, (java.lang.Object) null), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null), " ", null, null, 0, null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: com.amplitude.android.internal.gestures.AutocaptureGestureListener$onSingleTapUp$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (str.length() <= 0) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(str.charAt(0));
                Intrinsics.copydefault(strValueOf, "");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                sb.append((Object) upperCase);
                String strSubstring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                sb.append(strSubstring);
                return sb.toString();
            }
        }, 30, null));
        pairArr[6] = C56390yDp.OLrzqt("[Amplitude] Hierarchy", viewTargetAEQbTJ.OLrzqt());
        try {
            activity = this.copydefault.get();
        } catch (java.lang.Exception e) {
            this.EZpvd.EZpvd("Error getting screen name: " + e);
        }
        java.lang.String strAEQbTJ = activity != null ? JT.Companion.AEQbTJ(activity) : null;
        pairArr[7] = C56390yDp.OLrzqt("[Amplitude] Screen Name", strAEQbTJ);
        this.OLrzqt.invoke("[Amplitude] Element Interacted", C56424yEw.gEmmrt(pairArr));
        return false;
    }
}
