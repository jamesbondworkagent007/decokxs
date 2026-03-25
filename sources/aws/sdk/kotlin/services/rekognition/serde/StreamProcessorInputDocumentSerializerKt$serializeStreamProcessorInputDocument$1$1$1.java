package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C21914hR;
import o.C31679m;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StreamProcessorInputDocumentSerializerKt$serializeStreamProcessorInputDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C31679m, Unit> {
    public static final StreamProcessorInputDocumentSerializerKt$serializeStreamProcessorInputDocument$1$1$1 INSTANCE = new StreamProcessorInputDocumentSerializerKt$serializeStreamProcessorInputDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StreamProcessorInputDocumentSerializerKt$serializeStreamProcessorInputDocument$1$1$1() {
        super(2, C21914hR.class, "serializeKinesisVideoStreamDocument", "serializeKinesisVideoStreamDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/KinesisVideoStream;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C31679m c31679m) {
        invoke2(interfaceC5106Ey, c31679m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C31679m c31679m) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c31679m, "");
        C21914hR.KWHzl(interfaceC5106Ey, c31679m);
    }
}
