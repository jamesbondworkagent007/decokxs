package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C30049lK;
import o.C8933bM;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C8933bM, Unit> {
    public static final CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$6$1 INSTANCE = new CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$6$1() {
        super(2, C30049lK.class, "serializeStreamProcessorOutputDocument", "serializeStreamProcessorOutputDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StreamProcessorOutput;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C8933bM c8933bM) {
        invoke2(interfaceC5106Ey, c8933bM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8933bM c8933bM) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8933bM, "");
        C30049lK.AEQbTJ(interfaceC5106Ey, c8933bM);
    }
}
