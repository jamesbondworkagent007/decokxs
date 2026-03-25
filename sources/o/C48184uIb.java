package o;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.uIb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48184uIb {
    public static final C48184uIb EZpvd = new C48184uIb();
    public static yHO<java.lang.String, Composer, java.lang.Integer, Unit> copydefault = ComposableLambdaKt.composableLambdaInstance(1641428364, false, TaskDescription.OLrzqt);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<java.lang.String, Composer, java.lang.Integer, Unit> KWHzl() {
        return copydefault;
    }

    /* JADX INFO: renamed from: o.uIb$TaskDescription */
    public static final class TaskDescription implements yHO<java.lang.String, Composer, java.lang.Integer, Unit> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.String str, Composer composer, java.lang.Integer num) {
            KWHzl(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.String str, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1641428364, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.ComposableSingletons$BotDetailCommonComposableKt.lambda-1.<anonymous> (BotDetailCommonComposable.kt:86)");
                }
                IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.DGOPHZDGOPHZ, composer, 0), "ChevronRight", (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer, 0), composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
