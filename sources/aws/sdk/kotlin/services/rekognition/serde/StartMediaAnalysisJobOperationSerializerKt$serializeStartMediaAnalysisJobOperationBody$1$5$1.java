package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C26318ja;
import o.C7291ah;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C7291ah, Unit> {
    public static final StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$5$1 INSTANCE = new StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$5$1() {
        super(2, C26318ja.class, "serializeMediaAnalysisOperationsConfigDocument", "serializeMediaAnalysisOperationsConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/MediaAnalysisOperationsConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C7291ah c7291ah) {
        invoke2(interfaceC5106Ey, c7291ah);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7291ah c7291ah) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c7291ah, "");
        C26318ja.AEQbTJ(interfaceC5106Ey, c7291ah);
    }
}
