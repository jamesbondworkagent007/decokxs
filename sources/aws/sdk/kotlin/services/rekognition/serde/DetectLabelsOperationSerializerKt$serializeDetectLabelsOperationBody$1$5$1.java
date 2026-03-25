package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C19108fv;
import o.InterfaceC5106Ey;
import o.RadioButton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, RadioButton, Unit> {
    public static final DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$5$1 INSTANCE = new DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$5$1() {
        super(2, C19108fv.class, "serializeDetectLabelsSettingsDocument", "serializeDetectLabelsSettingsDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/DetectLabelsSettings;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, RadioButton radioButton) {
        invoke2(interfaceC5106Ey, radioButton);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RadioButton radioButton) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(radioButton, "");
        C19108fv.EZpvd(interfaceC5106Ey, radioButton);
    }
}
