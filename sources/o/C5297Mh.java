package o;

import com.amplitude.experiment.evaluation.EvaluationFlag;
import com.amplitude.experiment.storage.CacheKt$getFlagStorage$1;
import com.amplitude.experiment.storage.CacheKt$getFlagStorage$2;
import com.amplitude.experiment.storage.CacheKt$getVariantStorage$1;
import com.amplitude.experiment.storage.CacheKt$getVariantStorage$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5297Mh {
    public static final C5298Mi<LP> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC5295Mf interfaceC5295Mf) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC5295Mf, "");
        return new C5298Mi<>("amp-exp-" + str2 + '-' + C59454zhO.isConnected(str, 6), interfaceC5295Mf, CacheKt$getVariantStorage$1.INSTANCE, CacheKt$getVariantStorage$2.INSTANCE, null, 16, null);
    }

    public static final C5298Mi<EvaluationFlag> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC5295Mf interfaceC5295Mf, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC5295Mf, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new C5298Mi<>("amp-exp-" + str2 + '-' + C59454zhO.isConnected(str, 6) + "-flags", interfaceC5295Mf, CacheKt$getFlagStorage$1.INSTANCE, CacheKt$getFlagStorage$2.INSTANCE, function0);
    }

    public static final LP EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C5315Mz.OLrzqt(str);
    }

    public static final EvaluationFlag copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Json json = LU.OLrzqt;
        return (EvaluationFlag) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), C56524yIo.copydefault(EvaluationFlag.class)), str);
    }

    public static final java.lang.String OLrzqt(@NotNull LP lp) {
        Intrinsics.checkNotNullParameter(lp, "");
        return C5315Mz.KWHzl(lp);
    }

    public static final java.lang.String OLrzqt(@NotNull EvaluationFlag evaluationFlag) {
        Intrinsics.checkNotNullParameter(evaluationFlag, "");
        Json json = LU.OLrzqt;
        return json.encodeToString(SerializersKt.serializer(json.getSerializersModule(), C56524yIo.copydefault(EvaluationFlag.class)), evaluationFlag);
    }
}
