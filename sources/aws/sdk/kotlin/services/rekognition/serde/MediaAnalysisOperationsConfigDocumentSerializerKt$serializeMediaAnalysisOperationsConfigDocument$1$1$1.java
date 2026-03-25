package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C24130iW;
import o.InterfaceC5106Ey;
import o.Y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class MediaAnalysisOperationsConfigDocumentSerializerKt$serializeMediaAnalysisOperationsConfigDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, Y, Unit> {
    public static final MediaAnalysisOperationsConfigDocumentSerializerKt$serializeMediaAnalysisOperationsConfigDocument$1$1$1 INSTANCE = new MediaAnalysisOperationsConfigDocumentSerializerKt$serializeMediaAnalysisOperationsConfigDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaAnalysisOperationsConfigDocumentSerializerKt$serializeMediaAnalysisOperationsConfigDocument$1$1$1() {
        super(2, C24130iW.class, "serializeMediaAnalysisDetectModerationLabelsConfigDocument", "serializeMediaAnalysisDetectModerationLabelsConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/MediaAnalysisDetectModerationLabelsConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, Y y) {
        invoke2(interfaceC5106Ey, y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Y y) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(y, "");
        C24130iW.AEQbTJ(interfaceC5106Ey, y);
    }
}
