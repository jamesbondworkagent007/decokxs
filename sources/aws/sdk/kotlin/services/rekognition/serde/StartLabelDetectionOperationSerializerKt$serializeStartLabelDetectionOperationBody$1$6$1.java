package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C22049hW;
import o.C52129w;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C52129w, Unit> {
    public static final StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$6$1 INSTANCE = new StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$6$1() {
        super(2, C22049hW.class, "serializeLabelDetectionSettingsDocument", "serializeLabelDetectionSettingsDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/LabelDetectionSettings;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C52129w c52129w) {
        invoke2(interfaceC5106Ey, c52129w);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C52129w c52129w) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c52129w, "");
        C22049hW.OLrzqt(interfaceC5106Ey, c52129w);
    }
}
