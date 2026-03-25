package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.okinc.cruilib.compose.library.reorderable.LongPressDraggableKt$longPressDraggable$3$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31804mEn {
    public static final Unit OLrzqt(Offset offset) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier longPressDraggable$default(Modifier modifier, boolean z, Function1 function1, Function0 function0, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.mEo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C31804mEn.OLrzqt((Offset) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.mEm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C31804mEn.EZpvd();
                }
            };
        }
        return EZpvd(modifier, z, function1, function0, function2);
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mEn$StateListAnimator */
    public static final class StateListAnimator implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ Function1<Offset, Unit> KWHzl;
        public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(boolean z, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function1<? super Offset, Unit> function1, Function0<Unit> function0) {
            this.copydefault = z;
            this.OLrzqt = function2;
            this.KWHzl = function1;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return KWHzl(modifier, composer, num.intValue());
        }

        public final Modifier KWHzl(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(-172082996);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-172082996, i, -1, "com.okinc.cruilib.compose.library.reorderable.longPressDraggable.<anonymous> (LongPressDraggable.kt:23)");
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            composer.startReplaceableGroup(-1737947132);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = java.lang.Boolean.FALSE;
                composer.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objRememberedValue).booleanValue();
            composer.endReplaceableGroup();
            booleanRef.element = zBooleanValue;
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, java.lang.Boolean.valueOf(this.copydefault), new LongPressDraggableKt$longPressDraggable$3$1(this.copydefault, this.OLrzqt, booleanRef, this.KWHzl, this.AEQbTJ, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }
    }

    public static final Modifier EZpvd(@NotNull Modifier modifier, boolean z, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return ComposedModifierKt.composed$default(modifier, null, new StateListAnimator(z, function2, function1, function0), 1, null);
    }
}
