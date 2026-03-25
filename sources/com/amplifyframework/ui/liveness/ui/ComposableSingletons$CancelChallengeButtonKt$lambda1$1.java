package com.amplifyframework.ui.liveness.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.amplifyframework.ui.liveness.ui.ComposableSingletons$CancelChallengeButtonKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes21.dex */
public final class ComposableSingletons$CancelChallengeButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CancelChallengeButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$CancelChallengeButtonKt$lambda1$1();

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1862551778, i, -1, "com.amplifyframework.ui.liveness.ui.ComposableSingletons$CancelChallengeButtonKt.lambda-1.<anonymous> (CancelChallengeButton.kt:74)");
        }
        composer.startReplaceableGroup(-846168653);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.ComposableSingletons$CancelChallengeButtonKt$lambda-1$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CancelChallengeButtonKt.CancelChallengeButton(null, "", (Function0) objRememberedValue, composer, 432, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
