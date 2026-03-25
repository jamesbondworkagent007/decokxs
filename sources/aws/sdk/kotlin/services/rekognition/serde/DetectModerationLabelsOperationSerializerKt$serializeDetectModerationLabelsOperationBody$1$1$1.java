package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C22740hl;
import o.C23535i;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C23535i, Unit> {
    public static final DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$1$1 INSTANCE = new DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$1$1() {
        super(2, C22740hl.class, "serializeHumanLoopConfigDocument", "serializeHumanLoopConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/HumanLoopConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C23535i c23535i) {
        invoke2(interfaceC5106Ey, c23535i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C23535i c23535i) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c23535i, "");
        C22740hl.AEQbTJ(interfaceC5106Ey, c23535i);
    }
}
