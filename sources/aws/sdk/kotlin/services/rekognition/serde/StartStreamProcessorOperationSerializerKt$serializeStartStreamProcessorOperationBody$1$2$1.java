package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C31598lx;
import o.C8827bK;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C8827bK, Unit> {
    public static final StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$2$1 INSTANCE = new StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$2$1() {
        super(2, C31598lx.class, "serializeStreamProcessingStartSelectorDocument", "serializeStreamProcessingStartSelectorDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StreamProcessingStartSelector;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C8827bK c8827bK) {
        invoke2(interfaceC5106Ey, c8827bK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8827bK c8827bK) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8827bK, "");
        C31598lx.EZpvd(interfaceC5106Ey, c8827bK);
    }
}
