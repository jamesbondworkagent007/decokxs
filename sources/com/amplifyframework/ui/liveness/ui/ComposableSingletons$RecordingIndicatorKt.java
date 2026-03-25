package com.amplifyframework.ui.liveness.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class ComposableSingletons$RecordingIndicatorKt {
    public static final ComposableSingletons$RecordingIndicatorKt INSTANCE = new ComposableSingletons$RecordingIndicatorKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f72lambda1 = ComposableLambdaKt.composableLambdaInstance(1564390526, false, new Function2<Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.ComposableSingletons$RecordingIndicatorKt$lambda-1$1
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.amplifyframework.ui.liveness.ui.RecordingIndicatorKt.access$RecordingIndicator(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1564390526, i, -1, "com.amplifyframework.ui.liveness.ui.ComposableSingletons$RecordingIndicatorKt.lambda-1.<anonymous> (RecordingIndicator.kt:90)");
            }
            RecordingIndicatorKt.RecordingIndicator("REC", null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f73lambda2 = ComposableLambdaKt.composableLambdaInstance(1064246070, false, new Function2<Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.ComposableSingletons$RecordingIndicatorKt$lambda-2$1
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
                ComposerKt.traceEventStart(1064246070, i, -1, "com.amplifyframework.ui.liveness.ui.ComposableSingletons$RecordingIndicatorKt.lambda-2.<anonymous> (RecordingIndicator.kt:98)");
            }
            RecordingIndicatorKt.RecordingIndicator("RECORDING", null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f74lambda3 = ComposableLambdaKt.composableLambdaInstance(-58030538, false, new Function2<Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.ComposableSingletons$RecordingIndicatorKt$lambda-3$1
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
                ComposerKt.traceEventStart(-58030538, i, -1, "com.amplifyframework.ui.liveness.ui.ComposableSingletons$RecordingIndicatorKt.lambda-3.<anonymous> (RecordingIndicator.kt:121)");
            }
            RecordingIndicatorKt.RecordingIndicator("REC", null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLambda-1$OKCompliance_ok_compliance_dynamic_aws_impl, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6069getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl() {
        return f72lambda1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLambda-2$OKCompliance_ok_compliance_dynamic_aws_impl, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6070getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl() {
        return f73lambda2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLambda-3$OKCompliance_ok_compliance_dynamic_aws_impl, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6071getLambda3$OKCompliance_ok_compliance_dynamic_aws_impl() {
        return f74lambda3;
    }
}
