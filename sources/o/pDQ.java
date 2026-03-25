package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.util.CompareIndicatorUtils$glideAsBitmap$1;
import com.okinc.kline.util.CompareIndicatorUtils$glideAsBitmap$2;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDQ {
    public static final pDQ copydefault = new pDQ();

    public final double AEQbTJ(double d, double d2) {
        double d3 = d2 * (((double) 1) + d);
        return d3 < AudioStats.AUDIO_AMPLITUDE_NONE ? AudioStats.AUDIO_AMPLITUDE_NONE : d3;
    }

    public final double KWHzl(double d, double d2) {
        return (d == AudioStats.AUDIO_AMPLITUDE_NONE || d2 == AudioStats.AUDIO_AMPLITUDE_NONE) ? d2 : (d - d2) / d2;
    }

    private pDQ() {
    }

    public final java.lang.String copydefault(double d, double d2) {
        if (d <= AudioStats.AUDIO_AMPLITUDE_NONE || d2 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return pTB.KWHzl(pTB.OLrzqt((java.lang.Object) 0), 2, RoundingMode.DOWN);
        }
        return pTB.KWHzl(pTB.OLrzqt(java.lang.Double.valueOf((d - d2) / d2)), 2, RoundingMode.DOWN);
    }

    public final double EZpvd(int i, int i2, double d, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().sSMYrx().get("ds0");
        double dEZpvd = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (dataSource == null) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(dataArrayList, "");
        DataSource.StateListAnimator stateListAnimator = (DataSource.StateListAnimator) CollectionsKt___CollectionsKt.AkhnZx(dataArrayList, i2);
        if (stateListAnimator != null) {
            dEZpvd = stateListAnimator.EZpvd(str);
        }
        return AEQbTJ(KWHzl(d, dEZpvd), dataSource.AEQbTJ.get(i).copydefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, int i2, @NotNull Continuation<? super android.graphics.Bitmap> continuation) throws java.lang.Throwable {
        CompareIndicatorUtils$glideAsBitmap$1 compareIndicatorUtils$glideAsBitmap$1;
        if (continuation instanceof CompareIndicatorUtils$glideAsBitmap$1) {
            compareIndicatorUtils$glideAsBitmap$1 = (CompareIndicatorUtils$glideAsBitmap$1) continuation;
            int i3 = compareIndicatorUtils$glideAsBitmap$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                compareIndicatorUtils$glideAsBitmap$1.label = i3 - Integer.MIN_VALUE;
            } else {
                compareIndicatorUtils$glideAsBitmap$1 = new CompareIndicatorUtils$glideAsBitmap$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = compareIndicatorUtils$glideAsBitmap$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = compareIndicatorUtils$glideAsBitmap$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CompareIndicatorUtils$glideAsBitmap$2 compareIndicatorUtils$glideAsBitmap$2 = new CompareIndicatorUtils$glideAsBitmap$2(context, str, i, i2, null);
            compareIndicatorUtils$glideAsBitmap$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, compareIndicatorUtils$glideAsBitmap$2, compareIndicatorUtils$glideAsBitmap$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "");
        return objWithContext;
    }
}
