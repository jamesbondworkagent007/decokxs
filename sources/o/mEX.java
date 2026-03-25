package o;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import com.okinc.cruilib.compose.library.reorderable.ReorderableScope$draggableHandle$1;
import com.okinc.cruilib.compose.library.reorderable.ReorderableScope$draggableHandle$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import o.mEX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface mEX {
    Modifier KWHzl(@NotNull Modifier modifier, boolean z, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function1<? super java.lang.Float, Unit> function12);

    Modifier KWHzl(@NotNull Modifier modifier, boolean z, @NotNull yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull yHO<? super CoroutineScope, ? super java.lang.Float, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho2, MutableInteractionSource mutableInteractionSource);

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.mEX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier draggableHandle$default(mEX mex, Modifier modifier, boolean z, yHO yho, yHO yho2, MutableInteractionSource mutableInteractionSource, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draggableHandle");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                yho = new ReorderableScope$draggableHandle$1(null);
            }
            yHO yho3 = yho;
            if ((i & 4) != 0) {
                yho2 = new ReorderableScope$draggableHandle$2(null);
            }
            return mex.KWHzl(modifier, z2, yho3, yho2, (i & 8) != 0 ? null : mutableInteractionSource);
        }

        public static Unit OLrzqt(Offset offset) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mEX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier longPressDraggableHandle$default(mEX mex, Modifier modifier, boolean z, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: longPressDraggableHandle");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.mEZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return mEX.StateListAnimator.OLrzqt((Offset) obj2);
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1() { // from class: o.mEW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return mEX.StateListAnimator.copydefault(((java.lang.Float) obj2).floatValue());
                    }
                };
            }
            return mex.KWHzl(modifier, z, function1, function12);
        }

        public static Unit copydefault(float f) {
            return Unit.INSTANCE;
        }
    }
}
