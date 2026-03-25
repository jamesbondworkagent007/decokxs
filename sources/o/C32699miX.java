package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32699miX {
    public static final C32699miX copydefault = new C32699miX();

    private C32699miX() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.miX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ View.OnTouchListener createTouchListener$default(C32699miX c32699miX, C32678miC c32678miC, boolean z, Function1 function1, java.lang.String str, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c32699miX.EZpvd(c32678miC, z, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : function2);
    }

    public final View.OnTouchListener EZpvd(@NotNull C32678miC c32678miC, boolean z, Function1<? super C32680miE, Unit> function1, java.lang.String str, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(c32678miC, "");
        return new ViewOnTouchListenerC32697miV(c32678miC, z, function1, str, function2);
    }

    public final boolean copydefault(@NotNull android.view.MotionEvent motionEvent, boolean z) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return motionEvent.getToolType(0) == 0 && motionEvent.getSource() == 4098 && motionEvent.getPressure() == 1.0f && z;
    }

    public final boolean copydefault(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int flags = motionEvent.getFlags();
        int source = motionEvent.getSource();
        float pressure = motionEvent.getPressure();
        return (flags & 1) != 0 && source == 4098 && pressure > 0.0f && pressure < 1.0f;
    }
}
