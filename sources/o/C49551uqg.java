package o;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C49551uqg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49551uqg {

    /* JADX INFO: renamed from: o.uqg$Activity */
    public static final class Activity implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ Function0<Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return copydefault(modifier, composer, num.intValue());
        }

        public final Modifier copydefault(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(1000279389);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1000279389, i, -1, "com.okinc.tradeuilib.components.clickableWithoutBackground.<anonymous> (ComposeEx.kt:12)");
            }
            Modifier.Companion companion = Modifier.Companion;
            composer.startReplaceableGroup(1330458922);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1330461911);
            boolean zChanged = composer.changed(this.KWHzl);
            final Function0<Unit> function0 = this.KWHzl;
            java.lang.Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: o.uqh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C49551uqg.Activity.copydefault(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier modifierThen = modifier.then(ClickableKt.m381clickableO2vRcR0$default(companion, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierThen;
        }

        public static final Unit copydefault(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final Modifier EZpvd(@NotNull Modifier modifier, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return ComposedModifierKt.composed$default(modifier, null, new Activity(function0), 1, null);
    }
}
