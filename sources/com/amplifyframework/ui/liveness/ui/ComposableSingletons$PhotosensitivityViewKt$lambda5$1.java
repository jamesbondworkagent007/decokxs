package com.amplifyframework.ui.liveness.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.amplifyframework.ui.liveness.ui.ComposableSingletons$PhotosensitivityViewKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletons$PhotosensitivityViewKt$lambda5$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PhotosensitivityViewKt$lambda5$1 INSTANCE = new ComposableSingletons$PhotosensitivityViewKt$lambda5$1();

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
            ComposerKt.traceEventStart(324742654, i, -1, "com.amplifyframework.ui.liveness.ui.ComposableSingletons$PhotosensitivityViewKt.lambda-5.<anonymous> (PhotosensitivityView.kt:122)");
        }
        composer.startReplaceableGroup(-770326586);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.ComposableSingletons$PhotosensitivityViewKt$lambda-5$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PhotosensitivityViewKt.PhotosensitivityView((Function0) objRememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
