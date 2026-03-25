package o;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import com.okinc.cruilib.compose.library.reorderable.ReorderableItemScope$draggableHandle$1;
import com.okinc.cruilib.compose.library.reorderable.ReorderableItemScope$draggableHandle$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import o.InterfaceC31808mEr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31808mEr {
    Modifier EZpvd(@NotNull Modifier modifier, boolean z, @NotNull yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull yHO<? super CoroutineScope, ? super java.lang.Float, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho2, MutableInteractionSource mutableInteractionSource);

    Modifier OLrzqt(@NotNull Modifier modifier, boolean z, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: o.mEr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.mEr */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier draggableHandle$default(InterfaceC31808mEr interfaceC31808mEr, Modifier modifier, boolean z, yHO yho, yHO yho2, MutableInteractionSource mutableInteractionSource, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draggableHandle");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                yho = new ReorderableItemScope$draggableHandle$1(null);
            }
            yHO yho3 = yho;
            if ((i & 4) != 0) {
                yho2 = new ReorderableItemScope$draggableHandle$2(null);
            }
            return interfaceC31808mEr.EZpvd(modifier, z2, yho3, yho2, (i & 8) != 0 ? null : mutableInteractionSource);
        }

        public static Unit KWHzl(Offset offset) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mEr */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier longPressDraggableHandle$default(InterfaceC31808mEr interfaceC31808mEr, Modifier modifier, boolean z, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: longPressDraggableHandle");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.mEv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC31808mEr.StateListAnimator.KWHzl((Offset) obj2);
                    }
                };
            }
            if ((i & 4) != 0) {
                function0 = new Function0() { // from class: o.mEt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InterfaceC31808mEr.StateListAnimator.copydefault();
                    }
                };
            }
            return interfaceC31808mEr.OLrzqt(modifier, z, function1, function0);
        }

        public static Unit copydefault() {
            return Unit.INSTANCE;
        }
    }
}
