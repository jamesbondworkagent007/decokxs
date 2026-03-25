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
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.unit.IntSize;
import com.okinc.cruilib.compose.library.reorderable.ReorderableItemScopeImpl$draggableHandle$1$3;
import com.okinc.cruilib.compose.library.reorderable.ReorderableItemScopeImpl$draggableHandle$1$4$1;
import com.okinc.cruilib.compose.library.reorderable.ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.mEA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mEA implements InterfaceC31808mEr {
    public final java.lang.Object AEQbTJ;
    public final Orientation EZpvd;
    public final Function0<java.lang.Float> OLrzqt;
    public final mEL copydefault;

    public mEA(@NotNull mEL mel, @NotNull java.lang.Object obj, @NotNull Orientation orientation, @NotNull Function0<java.lang.Float> function0) {
        Intrinsics.checkNotNullParameter(mel, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = mel;
        this.AEQbTJ = obj;
        this.EZpvd = orientation;
        this.OLrzqt = function0;
    }

    public static final class ActionBar implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ yHO<CoroutineScope, java.lang.Float, Continuation<? super Unit>, java.lang.Object> AEQbTJ;
        public final /* synthetic */ yHO<CoroutineScope, Offset, Continuation<? super Unit>, java.lang.Object> EZpvd;
        public final /* synthetic */ MutableInteractionSource KWHzl;
        public final /* synthetic */ boolean OLrzqt;

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] EZpvd;

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
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(boolean z, MutableInteractionSource mutableInteractionSource, yHO<? super CoroutineScope, ? super java.lang.Float, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho2) {
            this.OLrzqt = z;
            this.KWHzl = mutableInteractionSource;
            this.AEQbTJ = yho;
            this.EZpvd = yho2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return EZpvd(modifier, composer, num.intValue());
        }

        public final Modifier EZpvd(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(-1799814926);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1799814926, i, -1, "com.okinc.cruilib.compose.library.reorderable.ReorderableItemScopeImpl.draggableHandle.<anonymous> (ReorderableLazyList.kt:611)");
            }
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            composer.startReplaceableGroup(-928263090);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = java.lang.Float.valueOf(0.0f);
                composer.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue = ((java.lang.Number) objRememberedValue).floatValue();
            composer.endReplaceableGroup();
            floatRef.element = fFloatValue;
            final Ref.IntRef intRef = new Ref.IntRef();
            composer.startReplaceableGroup(-928261779);
            java.lang.Object objRememberedValue2 = composer.rememberedValue();
            boolean z = false;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = 0;
                composer.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((java.lang.Number) objRememberedValue2).intValue();
            composer.endReplaceableGroup();
            intRef.element = iIntValue;
            final mEA mea = mEA.this;
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new Function1() { // from class: o.mEy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mEA.ActionBar.OLrzqt(floatRef, mea, intRef, (LayoutCoordinates) obj);
                }
            });
            composer.startReplaceableGroup(-928246737);
            boolean zChangedInstance = composer.changedInstance(mEA.this);
            final mEA mea2 = mEA.this;
            java.lang.Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: o.mEz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mEA.ActionBar.OLrzqt(mea2, ((java.lang.Float) obj).floatValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue3, composer, 0);
            Orientation orientation = mEA.this.EZpvd;
            if (this.OLrzqt && (mEA.this.copydefault.AEQbTJ(mEA.this.AEQbTJ).getValue().booleanValue() || !mEA.this.copydefault.DbNXlk().getValue().booleanValue())) {
                z = true;
            }
            boolean z2 = z;
            MutableInteractionSource mutableInteractionSource = this.KWHzl;
            ReorderableItemScopeImpl$draggableHandle$1$3 reorderableItemScopeImpl$draggableHandle$1$3 = new ReorderableItemScopeImpl$draggableHandle$1$3(this.EZpvd, floatRef, mEA.this, intRef, null);
            composer.startReplaceableGroup(-928224826);
            boolean zChangedInstance2 = composer.changedInstance(mEA.this);
            boolean zChangedInstance3 = composer.changedInstance(this.AEQbTJ);
            mEA mea3 = mEA.this;
            yHO<CoroutineScope, java.lang.Float, Continuation<? super Unit>, java.lang.Object> yho = this.AEQbTJ;
            java.lang.Object objRememberedValue4 = composer.rememberedValue();
            if ((zChangedInstance2 | zChangedInstance3) || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ReorderableItemScopeImpl$draggableHandle$1$4$1(mea3, yho, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierDraggable = DraggableKt.draggable(modifierOnGloballyPositioned, draggableStateRememberDraggableState, orientation, (188 & 4) != 0 ? true : z2, (188 & 8) != 0 ? null : mutableInteractionSource, (188 & 16) != 0 ? false : false, (188 & 32) != 0 ? new DraggableKt.C10861(null) : reorderableItemScopeImpl$draggableHandle$1$3, (188 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : (yHO) objRememberedValue4, (188 & 128) != 0 ? false : false);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierDraggable;
        }

        public static final Unit OLrzqt(Ref.FloatRef floatRef, mEA mea, Ref.IntRef intRef, LayoutCoordinates layoutCoordinates) {
            float fM2911getYimpl;
            int iM5573getHeightimpl;
            Intrinsics.checkNotNullParameter(layoutCoordinates, "");
            Orientation orientation = mea.EZpvd;
            int[] iArr = Application.EZpvd;
            int i = iArr[orientation.ordinal()];
            if (i == 1) {
                fM2911getYimpl = Offset.m2911getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fM2911getYimpl = Offset.m2910getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
            }
            floatRef.element = fM2911getYimpl;
            int i2 = iArr[mea.EZpvd.ordinal()];
            if (i2 == 1) {
                iM5573getHeightimpl = IntSize.m5573getHeightimpl(layoutCoordinates.mo4392getSizeYbymL2g());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM5573getHeightimpl = IntSize.m5574getWidthimpl(layoutCoordinates.mo4392getSizeYbymL2g());
            }
            intRef.element = iM5573getHeightimpl;
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(mEA mea, float f) {
            mea.copydefault.KWHzl(f);
            return Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC31808mEr
    public Modifier EZpvd(@NotNull Modifier modifier, boolean z, @NotNull yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull yHO<? super CoroutineScope, ? super java.lang.Float, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho2, MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(yho2, "");
        return ComposedModifierKt.composed$default(modifier, null, new ActionBar(z, mutableInteractionSource, yho2, yho), 1, null);
    }

    public static final class StateListAnimator implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ mEA AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ Function1<Offset, Unit> KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX INFO: renamed from: o.mEA$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public final /* synthetic */ class C0877StateListAnimator {
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
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(boolean z, mEA mea, Function0<Unit> function0, Function1<? super Offset, Unit> function1) {
            this.EZpvd = z;
            this.AEQbTJ = mea;
            this.OLrzqt = function0;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return KWHzl(modifier, composer, num.intValue());
        }

        public final Modifier KWHzl(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(1372077659);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1372077659, i, -1, "com.okinc.cruilib.compose.library.reorderable.ReorderableItemScopeImpl.longPressDraggableHandle.<anonymous> (ReorderableLazyList.kt:648)");
            }
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            composer.startReplaceableGroup(1876684593);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = java.lang.Float.valueOf(0.0f);
                composer.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue = ((java.lang.Number) objRememberedValue).floatValue();
            composer.endReplaceableGroup();
            floatRef.element = fFloatValue;
            final Ref.IntRef intRef = new Ref.IntRef();
            composer.startReplaceableGroup(1876685904);
            java.lang.Object objRememberedValue2 = composer.rememberedValue();
            boolean z = false;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = 0;
                composer.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((java.lang.Number) objRememberedValue2).intValue();
            composer.endReplaceableGroup();
            intRef.element = iIntValue;
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            java.lang.Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final mEA mea = this.AEQbTJ;
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new Function1() { // from class: o.mEw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mEA.StateListAnimator.copydefault(floatRef, mea, intRef, (LayoutCoordinates) obj);
                }
            });
            if (this.EZpvd && (this.AEQbTJ.copydefault.AEQbTJ(this.AEQbTJ.AEQbTJ).getValue().booleanValue() || !this.AEQbTJ.copydefault.DbNXlk().getValue().booleanValue())) {
                z = true;
            }
            final Function1<Offset, Unit> function1 = this.KWHzl;
            final mEA mea2 = this.AEQbTJ;
            Function1 function12 = new Function1() { // from class: o.mEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mEA.StateListAnimator.OLrzqt(coroutineScope, function1, floatRef, mea2, intRef, (Offset) obj);
                }
            };
            composer.startReplaceableGroup(1876719559);
            boolean zChangedInstance = composer.changedInstance(this.AEQbTJ);
            boolean zChanged = composer.changed(this.OLrzqt);
            final mEA mea3 = this.AEQbTJ;
            final Function0<Unit> function0 = this.OLrzqt;
            java.lang.Object objRememberedValue4 = composer.rememberedValue();
            if ((zChangedInstance | zChanged) || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: o.mEC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return mEA.StateListAnimator.AEQbTJ(mea3, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function02 = (Function0) objRememberedValue4;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1876723722);
            boolean zChangedInstance2 = composer.changedInstance(this.AEQbTJ);
            final mEA mea4 = this.AEQbTJ;
            java.lang.Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: o.mED
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return mEA.StateListAnimator.KWHzl(mea4, (PointerInputChange) obj, (Offset) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierEZpvd = C31804mEn.EZpvd(modifierOnGloballyPositioned, z, function12, function02, (Function2) objRememberedValue5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierEZpvd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(Ref.FloatRef floatRef, mEA mea, Ref.IntRef intRef, LayoutCoordinates layoutCoordinates) {
            float fM2911getYimpl;
            int iM5573getHeightimpl;
            Intrinsics.checkNotNullParameter(layoutCoordinates, "");
            Orientation orientation = mea.EZpvd;
            int[] iArr = C0877StateListAnimator.OLrzqt;
            int i = iArr[orientation.ordinal()];
            if (i == 1) {
                fM2911getYimpl = Offset.m2911getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fM2911getYimpl = Offset.m2910getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
            }
            floatRef.element = fM2911getYimpl;
            int i2 = iArr[mea.EZpvd.ordinal()];
            if (i2 == 1) {
                iM5573getHeightimpl = IntSize.m5573getHeightimpl(layoutCoordinates.mo4392getSizeYbymL2g());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM5573getHeightimpl = IntSize.m5574getWidthimpl(layoutCoordinates.mo4392getSizeYbymL2g());
            }
            intRef.element = iM5573getHeightimpl;
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(CoroutineScope coroutineScope, Function1 function1, Ref.FloatRef floatRef, mEA mea, Ref.IntRef intRef, Offset offset) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1(floatRef, mea, intRef, null), 3, null);
            function1.invoke(offset);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(mEA mea, Function0 function0) {
            mea.copydefault.isConnected();
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(mEA mea, PointerInputChange pointerInputChange, Offset offset) {
            float fM2911getYimpl;
            Intrinsics.checkNotNullParameter(pointerInputChange, "");
            mEL mel = mea.copydefault;
            int i = C0877StateListAnimator.OLrzqt[mea.EZpvd.ordinal()];
            if (i == 1) {
                fM2911getYimpl = Offset.m2911getYimpl(offset.m2920unboximpl());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fM2911getYimpl = Offset.m2910getXimpl(offset.m2920unboximpl());
            }
            mel.KWHzl(fM2911getYimpl);
            return Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC31808mEr
    public Modifier OLrzqt(@NotNull Modifier modifier, boolean z, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return ComposedModifierKt.composed$default(modifier, null, new StateListAnimator(z, this, function0, function1), 1, null);
    }
}
