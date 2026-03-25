package o;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pJB implements Application.ActivityLifecycleCallbacks {
    public final Function1<android.app.Activity, Unit> EZpvd;
    public final Function1<android.app.Activity, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public pJB() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public pJB(@NotNull Function1<? super android.app.Activity, Unit> function1, @NotNull Function1<? super android.app.Activity, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd = function1;
        this.OLrzqt = function12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:13) call: o.pJC.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:14) call: o.pJA.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit>, kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit>):void (m)] (LINE:12) call: o.pJB.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ pJB(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.pJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pJB.EZpvd((android.app.Activity) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: o.pJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pJB.KWHzl((android.app.Activity) obj);
            }
        } : function12);
    }

    public static final Unit EZpvd(android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return Unit.INSTANCE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd.invoke(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.invoke(activity);
    }
}
