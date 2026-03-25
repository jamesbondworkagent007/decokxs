package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oUN extends AbstractC49411unz<ChartViewOutSideConfig> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ChartViewOutSideConfig AEQbTJ(ChartViewOutSideConfig chartViewOutSideConfig, ChartViewOutSideConfig chartViewOutSideConfig2) {
        Intrinsics.checkNotNullParameter(chartViewOutSideConfig2, "");
        return chartViewOutSideConfig;
    }

    public oUN() {
        super(new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oUN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final oUN OLrzqt() {
            return (oUN) new ViewModelProvider(oUB.EZpvd, ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(C43246rlf.OLrzqt.valueOf()), null, 4, null).get(oUN.class);
        }
    }

    public final java.lang.Object OLrzqt(@NotNull final ChartViewOutSideConfig chartViewOutSideConfig, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objAEQbTJ = C49366unG.AEQbTJ(this, new Function1() { // from class: o.oUP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oUN.AEQbTJ(chartViewOutSideConfig, (ChartViewOutSideConfig) obj);
            }
        }, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }
}
