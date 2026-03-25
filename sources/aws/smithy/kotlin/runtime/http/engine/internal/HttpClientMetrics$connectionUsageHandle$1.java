package aws.smithy.kotlin.runtime.http.engine.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AK;
import o.GD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HttpClientMetrics$connectionUsageHandle$1 extends FunctionReferenceImpl implements Function1<GD<Long>, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpClientMetrics$connectionUsageHandle$1(Object obj) {
        super(1, obj, AK.class, "recordConnectionState", "recordConnectionState(Laws/smithy/kotlin/runtime/telemetry/metrics/AsyncMeasurement;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GD<Long> gd) {
        invoke2(gd);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GD<Long> gd) {
        Intrinsics.checkNotNullParameter(gd, "");
        ((AK) this.receiver).OLrzqt((GD<Long>) gd);
    }
}
