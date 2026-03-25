package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC32801mkT extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.view.View view, C32678miC c32678miC, Function1<? super C32680miE, Unit> function1, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2);

    void KWHzl(@NotNull android.view.View view, C32678miC c32678miC, android.content.Context context, Function1<? super C32680miE, Unit> function1, Function2<? super android.view.View, ? super android.view.MotionEvent, java.lang.Boolean> function2);

    /* JADX INFO: renamed from: o.mkT$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.mkT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setupClickProtection$default(InterfaceC32801mkT interfaceC32801mkT, android.view.View view, C32678miC c32678miC, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupClickProtection");
            }
            if ((i & 2) != 0) {
                c32678miC = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function2 = null;
            }
            interfaceC32801mkT.AEQbTJ(view, c32678miC, function1, function2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.mkT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setupClickProtection$default(InterfaceC32801mkT interfaceC32801mkT, android.view.View view, C32678miC c32678miC, android.content.Context context, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupClickProtection");
            }
            interfaceC32801mkT.KWHzl(view, (i & 2) != 0 ? null : c32678miC, (i & 4) != 0 ? null : context, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function2);
        }
    }
}
