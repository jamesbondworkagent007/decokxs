package com.amplifyframework.ui.liveness.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.amplifyframework.ui.liveness.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;

/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletons$FaceLivenessDetectorKt {
    public static final ComposableSingletons$FaceLivenessDetectorKt INSTANCE = new ComposableSingletons$FaceLivenessDetectorKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static yHO<RowScope, Composer, Integer, Unit> f62lambda1 = ComposableLambdaKt.composableLambdaInstance(2023216352, false, new yHO<RowScope, Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.ComposableSingletons$FaceLivenessDetectorKt$lambda-1$1
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023216352, i, -1, "com.amplifyframework.ui.liveness.ui.ComposableSingletons$FaceLivenessDetectorKt.lambda-1.<anonymous> (FaceLivenessDetector.kt:280)");
            }
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(R.string.amplify_ui_liveness_get_ready_begin_check, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLambda-1$OKCompliance_ok_compliance_dynamic_aws_impl, reason: not valid java name */
    public final yHO<RowScope, Composer, Integer, Unit> m6058getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl() {
        return f62lambda1;
    }
}
