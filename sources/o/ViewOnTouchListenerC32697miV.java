package o;

import android.view.View;
import com.okinc.components.security.api.ProtectionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnTouchListenerC32697miV implements View.OnTouchListener {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final Function2<android.view.View, android.view.MotionEvent, java.lang.Boolean> KWHzl;
    public final Function1<C32680miE, Unit> OLrzqt;
    public final C32678miC copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.miE, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnTouchListenerC32697miV(@NotNull C32678miC c32678miC, boolean z, Function1<? super C32680miE, Unit> function1, java.lang.String str, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(c32678miC, "");
        this.copydefault = c32678miC;
        this.AEQbTJ = z;
        this.OLrzqt = function1;
        this.EZpvd = str;
        this.KWHzl = function2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull android.view.View view, @NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            C32699miX c32699miX = C32699miX.copydefault;
            boolean zCopydefault = c32699miX.copydefault(motionEvent, this.AEQbTJ);
            ProtectionMode protectionModeAEQbTJ = this.copydefault.AEQbTJ();
            ProtectionMode protectionMode = ProtectionMode.BLOCKING;
            boolean z = protectionModeAEQbTJ == protectionMode && zCopydefault;
            boolean zCopydefault2 = c32699miX.copydefault(motionEvent);
            boolean z2 = this.copydefault.copydefault() == protectionMode && zCopydefault2;
            if (zCopydefault && this.copydefault.AEQbTJ() != ProtectionMode.DISABLED) {
                C32700miY.KWHzl.copydefault("GESTURE_CLICK", view, z, this.EZpvd, this.OLrzqt);
            }
            if (zCopydefault2 && this.copydefault.copydefault() != ProtectionMode.DISABLED) {
                C32700miY.KWHzl.copydefault("OVERLAY_CLICK", view, z2, this.EZpvd, this.OLrzqt);
            }
            if (z || z2) {
                return true;
            }
        }
        Function2<android.view.View, android.view.MotionEvent, java.lang.Boolean> function2 = this.KWHzl;
        if (function2 != null) {
            return function2.invoke(view, motionEvent).booleanValue();
        }
        return false;
    }
}
