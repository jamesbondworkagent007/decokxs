package aws.sdk.kotlin.services.polly.presigners;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C55338xi;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PresignersKt$presignSynthesizeSpeech$2 extends Lambda implements Function1<C55338xi.Activity, Unit> {
    final /* synthetic */ long $duration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresignersKt$presignSynthesizeSpeech$2(long j) {
        super(1);
        this.$duration = j;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C55338xi.Activity activity) {
        invoke2(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull C55338xi.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.OLrzqt(C59462zhW.KWHzl(this.$duration));
    }
}
