package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC14457dln;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14456dlm implements InterfaceC14457dln {
    public android.app.Activity AEQbTJ;
    public final Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ = activity;
    }

    public C14456dlm(android.app.Activity activity, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = activity;
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:android.app.Activity:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.app.Activity) : (r1v0 android.app.Activity))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(android.app.Activity, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:5) call: o.dlm.<init>(android.app.Activity, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C14456dlm(android.app.Activity activity, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activity, function0);
    }

    @Override // o.InterfaceC14457dln
    public boolean OLrzqt() {
        return InterfaceC14457dln.Activity.OLrzqt(this);
    }

    @Override // o.InterfaceC14457dln
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Activity activity = this.AEQbTJ;
        if (activity != null) {
            activity.finish();
        }
        this.KWHzl.invoke();
    }
}
