package aws.sdk.kotlin.services.textract.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C37344os;
import o.C42091rG;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C37344os, Unit> {
    public static final StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$6$1 INSTANCE = new StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$6$1() {
        super(2, C42091rG.class, "serializeOutputConfigDocument", "serializeOutputConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/OutputConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C37344os c37344os) {
        invoke2(interfaceC5106Ey, c37344os);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C37344os c37344os) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c37344os, "");
        C42091rG.copydefault(interfaceC5106Ey, c37344os);
    }
}
