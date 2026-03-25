package o;

import android.view.Window;
import com.amplitude.common.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5223Jl extends WindowCallbackC5229Jr {
    public final android.view.GestureDetector EZpvd;
    public final GestureDetectorOnGestureListenerC5224Jm KWHzl;
    public final Application OLrzqt;
    public final Logger copydefault;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5223Jl(Window.Callback callback, android.app.Activity activity, Function2 function2, java.util.List list, Logger logger, Application application, GestureDetectorOnGestureListenerC5224Jm gestureDetectorOnGestureListenerC5224Jm, android.view.GestureDetector gestureDetector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Application application2 = (i & 32) != 0 ? new Application() { // from class: o.Jl.4
        } : application;
        GestureDetectorOnGestureListenerC5224Jm gestureDetectorOnGestureListenerC5224Jm2 = (i & 64) != 0 ? new GestureDetectorOnGestureListenerC5224Jm(activity, function2, logger, list) : gestureDetectorOnGestureListenerC5224Jm;
        this(callback, activity, function2, list, logger, application2, gestureDetectorOnGestureListenerC5224Jm2, (i & 128) != 0 ? new android.view.GestureDetector(activity, gestureDetectorOnGestureListenerC5224Jm2) : gestureDetector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5223Jl(@NotNull Window.Callback callback, @NotNull android.app.Activity activity, @NotNull Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2, @NotNull java.util.List<? extends InterfaceC5234Jw> list, @NotNull Logger logger, @NotNull Application application, @NotNull GestureDetectorOnGestureListenerC5224Jm gestureDetectorOnGestureListenerC5224Jm, @NotNull android.view.GestureDetector gestureDetector) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(gestureDetectorOnGestureListenerC5224Jm, "");
        Intrinsics.checkNotNullParameter(gestureDetector, "");
        this.copydefault = logger;
        this.OLrzqt = application;
        this.KWHzl = gestureDetectorOnGestureListenerC5224Jm;
        this.EZpvd = gestureDetector;
    }

    @Override // o.WindowCallbackC5229Jr, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            android.view.MotionEvent motionEventAEQbTJ = this.OLrzqt.AEQbTJ(motionEvent);
            try {
                try {
                    this.EZpvd.onTouchEvent(motionEventAEQbTJ);
                } catch (java.lang.Exception e) {
                    this.copydefault.EZpvd("Error handling touch event: " + e);
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                motionEventAEQbTJ.recycle();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: o.Jl$Application */
    public interface Application {
        default android.view.MotionEvent AEQbTJ(@NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
            Intrinsics.checkNotNullExpressionValue(motionEventObtain, "");
            return motionEventObtain;
        }
    }
}
