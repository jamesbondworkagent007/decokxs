package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C24103iV;
import o.InterfaceC5106Ey;
import o.X;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, X, Unit> {
    public static final StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$2$1 INSTANCE = new StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$2$1() {
        super(2, C24103iV.class, "serializeMediaAnalysisInputDocument", "serializeMediaAnalysisInputDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/MediaAnalysisInput;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, X x) {
        invoke2(interfaceC5106Ey, x);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull X x) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(x, "");
        C24103iV.EZpvd(interfaceC5106Ey, x);
    }
}
