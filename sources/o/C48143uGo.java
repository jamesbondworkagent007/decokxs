package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C52761wXj;

/* JADX INFO: renamed from: o.uGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48143uGo {
    public static final C48143uGo AEQbTJ = new C48143uGo();
    public static Function2<Composer, java.lang.Integer, Unit> KWHzl = ComposableLambdaKt.composableLambdaInstance(1976898131, false, StateListAnimator.KWHzl);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<Composer, java.lang.Integer, Unit> OLrzqt() {
        return KWHzl;
    }

    /* JADX INFO: renamed from: o.uGo$StateListAnimator */
    public static final class StateListAnimator implements Function2<Composer, java.lang.Integer, Unit> {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1976898131, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.ComposableSingletons$EditMarketSignalComposableKt.lambda-1.<anonymous> (EditMarketSignalComposable.kt:318)");
                }
                IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.alsFma, composer, 0), "remove", SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), ColorResources_androidKt.colorResource(C52761wXj.Activity.RuDPQV, composer, 0), composer, 432, 0);
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
