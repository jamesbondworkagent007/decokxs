package o;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import com.okinc.cruilib.compose.modifier.TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1;
import com.okinc.cruilib.compose.modifier.TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1;
import com.okinc.cruilib.compose.modifier.TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.mDC;
import o.mFC;
import o.mHZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mFC {

    public static final class Application implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ Shape EZpvd;
        public final /* synthetic */ int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Shape shape, int i) {
            this.EZpvd = shape;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return copydefault(modifier, composer, num.intValue());
        }

        public final Modifier copydefault(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(-313792531);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313792531, i, -1, "com.okinc.cruilib.compose.modifier.animateTouchFeedback.<anonymous> (TouchFeedbackAnimation.kt:32)");
            }
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                java.lang.Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1257367759);
            java.lang.Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final Animatable animatable = (Animatable) objRememberedValue2;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1257370320);
            java.lang.Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final Animatable animatable2 = (Animatable) objRememberedValue3;
            composer.endReplaceableGroup();
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            final long jColorResource = ColorResources_androidKt.colorResource(mDC.Application.EZpvd, composer, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            composer.startReplaceableGroup(1257397072);
            boolean zChanged = composer.changed(this.EZpvd);
            boolean zChanged2 = composer.changed(density);
            boolean zChanged3 = composer.changed(jColorResource);
            boolean zChangedInstance = composer.changedInstance(animatable2);
            final Shape shape = this.EZpvd;
            java.lang.Object objRememberedValue4 = composer.rememberedValue();
            if ((zChanged | zChanged2 | zChanged3 | zChangedInstance) || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: o.mFD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mFC.Application.EZpvd(shape, density, jColorResource, animatable2, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion2, (Function1) objRememberedValue4);
            composer.startReplaceableGroup(1257408648);
            boolean zChangedInstance2 = composer.changedInstance(animatable);
            java.lang.Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: o.mFB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mFC.Application.OLrzqt(animatable, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierDrawBehind, (Function1) objRememberedValue5);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceableGroup(1257414635);
            boolean zChanged4 = composer.changed(this.KWHzl);
            boolean zChangedInstance3 = composer.changedInstance(coroutineScope);
            boolean zChangedInstance4 = composer.changedInstance(animatable);
            boolean zChangedInstance5 = composer.changedInstance(animatable2);
            int i2 = this.KWHzl;
            java.lang.Object objRememberedValue6 = composer.rememberedValue();
            if ((zChanged4 | zChangedInstance3 | zChangedInstance4 | zChangedInstance5) || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new TouchFeedbackAnimationKt$animateTouchFeedback$1$3$1(i2, coroutineScope, animatable, animatable2, null);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierGraphicsLayer, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }

        public static final void AEQbTJ(int i, CoroutineScope coroutineScope, Animatable<java.lang.Float, AnimationVector1D> animatable, Animatable<java.lang.Float, AnimationVector1D> animatable2, float f, float f2) {
            mHZ.Activity activity = mHZ.Companion;
            if (activity.AEQbTJ(i)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$1(animatable, f, null), 3, null);
            }
            if (activity.EZpvd(i, 4)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TouchFeedbackAnimationKt$animateTouchFeedback$1$animate$2(animatable2, f2, null), 3, null);
            }
        }

        public static final Unit EZpvd(Shape shape, Density density, long j, Animatable animatable, DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "");
            OutlineKt.m3400drawOutlinewDX37Ww(drawScope, shape.mo399createOutlinePq9zytI(drawScope.mo3691getSizeNHjbRc(), drawScope.getLayoutDirection(), density), j, (60 & 4) != 0 ? 1.0f : ((java.lang.Number) animatable.getValue()).floatValue(), (60 & 8) != 0 ? Fill.INSTANCE : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? DrawScope.Companion.m3692getDefaultBlendMode0nO6VwU() : 0);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
            graphicsLayerScope.setScaleX(((java.lang.Number) animatable.getValue()).floatValue());
            graphicsLayerScope.setScaleY(((java.lang.Number) animatable.getValue()).floatValue());
            graphicsLayerScope.mo3337setTransformOrigin__ExYCQ(TransformOrigin.Companion.m3532getCenterSzJe1aQ());
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Modifier animateTouchFeedback$default(Modifier modifier, int i, Shape shape, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 5;
        }
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return copydefault(modifier, i, shape);
    }

    public static final Modifier copydefault(@NotNull Modifier modifier, int i, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(shape, "");
        return ComposedModifierKt.composed$default(modifier, null, new Application(shape, i), 1, null);
    }
}
