package o;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.unit.Velocity;
import com.okinc.cruilib.compose.library.reorderable.ReorderableScopeImpl$draggableHandle$1;
import com.okinc.cruilib.compose.library.reorderable.ReorderableScopeImpl$draggableHandle$2;
import com.okinc.cruilib.compose.library.reorderable.ReorderableScopeImpl$longPressDraggableHandle$1$2$1$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.mEV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mEV implements mEX {
    public final int EZpvd;
    public final mEQ KWHzl;
    public final Orientation copydefault;

    @Override // o.mEX
    public Modifier KWHzl(@NotNull Modifier modifier, boolean z, @NotNull yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull yHO<? super CoroutineScope, ? super java.lang.Float, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho2, MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(yho2, "");
        return DraggableKt.draggable(modifier, this.KWHzl.EZpvd().get(this.EZpvd), this.copydefault, (188 & 4) != 0 ? true : z && (this.KWHzl.EZpvd(this.EZpvd).getValue().booleanValue() || !this.KWHzl.AEQbTJ().getValue().booleanValue()), (188 & 8) != 0 ? null : mutableInteractionSource, (188 & 16) != 0 ? false : false, (188 & 32) != 0 ? new DraggableKt.C10861(null) : new ReorderableScopeImpl$draggableHandle$1(this, yho, null), (188 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : new ReorderableScopeImpl$draggableHandle$2(yho2, this, null), (188 & 128) != 0 ? false : false);
    }

    public static final class StateListAnimator implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ mEV AEQbTJ;
        public final /* synthetic */ Function1<Offset, Unit> KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ Function1<java.lang.Float, Unit> copydefault;

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[Orientation.values().length];
                try {
                    iArr[Orientation.Vertical.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[Orientation.Horizontal.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(boolean z, mEV mev, Function1<? super Offset, Unit> function1, Function1<? super java.lang.Float, Unit> function12) {
            this.OLrzqt = z;
            this.AEQbTJ = mev;
            this.KWHzl = function1;
            this.copydefault = function12;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return EZpvd(modifier, composer, num.intValue());
        }

        public final Modifier EZpvd(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(-1840958653);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1840958653, i, -1, "com.okinc.cruilib.compose.library.reorderable.ReorderableScopeImpl.longPressDraggableHandle.<anonymous> (ReorderableList.kt:253)");
            }
            composer.startReplaceableGroup(1163236013);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new androidx.compose.ui.input.pointer.util.VelocityTracker();
                composer.updateRememberedValue(objRememberedValue);
            }
            final androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker = (androidx.compose.ui.input.pointer.util.VelocityTracker) objRememberedValue;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            java.lang.Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                java.lang.Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            composer.endReplaceableGroup();
            boolean z = this.OLrzqt && (this.AEQbTJ.KWHzl.EZpvd(this.AEQbTJ.EZpvd).getValue().booleanValue() || !this.AEQbTJ.KWHzl.AEQbTJ().getValue().booleanValue());
            composer.startReplaceableGroup(1163243975);
            boolean zChangedInstance = composer.changedInstance(this.AEQbTJ);
            boolean zChanged = composer.changed(this.KWHzl);
            final mEV mev = this.AEQbTJ;
            final Function1<Offset, Unit> function1 = this.KWHzl;
            java.lang.Object objRememberedValue3 = composer.rememberedValue();
            if ((zChangedInstance | zChanged) || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: o.mFd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mEV.StateListAnimator.EZpvd(mev, function1, (Offset) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1163248097);
            boolean zChangedInstance2 = composer.changedInstance(velocityTracker);
            boolean zChangedInstance3 = composer.changedInstance(this.AEQbTJ);
            boolean zChangedInstance4 = composer.changedInstance(coroutineScope);
            boolean zChanged2 = composer.changed(this.copydefault);
            final mEV mev2 = this.AEQbTJ;
            final Function1<java.lang.Float, Unit> function13 = this.copydefault;
            java.lang.Object objRememberedValue4 = composer.rememberedValue();
            if ((zChangedInstance2 | zChangedInstance3 | zChangedInstance4 | zChanged2) || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: o.mFe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return mEV.StateListAnimator.copydefault(velocityTracker, mev2, coroutineScope, function13);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1163262656);
            boolean zChangedInstance5 = composer.changedInstance(velocityTracker);
            boolean zChangedInstance6 = composer.changedInstance(this.AEQbTJ);
            final mEV mev3 = this.AEQbTJ;
            java.lang.Object objRememberedValue5 = composer.rememberedValue();
            if ((zChangedInstance5 | zChangedInstance6) || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: o.mFa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return mEV.StateListAnimator.OLrzqt(velocityTracker, mev3, (PointerInputChange) obj, (Offset) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierEZpvd = C31804mEn.EZpvd(modifier, z, function12, function0, (Function2) objRememberedValue5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierEZpvd;
        }

        public static final Unit EZpvd(mEV mev, Function1 function1, Offset offset) {
            mev.KWHzl.KWHzl(mev.EZpvd);
            function1.invoke(offset);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, mEV mev, CoroutineScope coroutineScope, Function1 function1) {
            float fM5640getYimpl;
            long jM4359calculateVelocity9UxMQ8M = velocityTracker.m4359calculateVelocity9UxMQ8M();
            velocityTracker.resetTracking();
            int i = Activity.OLrzqt[mev.copydefault.ordinal()];
            if (i == 1) {
                fM5640getYimpl = Velocity.m5640getYimpl(jM4359calculateVelocity9UxMQ8M);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fM5640getYimpl = Velocity.m5639getXimpl(jM4359calculateVelocity9UxMQ8M);
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReorderableScopeImpl$longPressDraggableHandle$1$2$1$1(mev, fM5640getYimpl, null), 3, null);
            function1.invoke(java.lang.Float.valueOf(fM5640getYimpl));
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, mEV mev, PointerInputChange pointerInputChange, Offset offset) {
            float fM2911getYimpl;
            Intrinsics.checkNotNullParameter(pointerInputChange, "");
            VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
            DraggableState draggableState = mev.KWHzl.EZpvd().get(mev.EZpvd);
            int i = Activity.OLrzqt[mev.copydefault.ordinal()];
            if (i == 1) {
                fM2911getYimpl = Offset.m2911getYimpl(offset.m2920unboximpl());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fM2911getYimpl = Offset.m2910getXimpl(offset.m2920unboximpl());
            }
            draggableState.dispatchRawDelta(fM2911getYimpl);
            return Unit.INSTANCE;
        }
    }

    @Override // o.mEX
    public Modifier KWHzl(@NotNull Modifier modifier, boolean z, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function1<? super java.lang.Float, Unit> function12) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return ComposedModifierKt.composed$default(modifier, null, new StateListAnimator(z, this, function1, function12), 1, null);
    }
}
