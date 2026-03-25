package aws.sdk.kotlin.services.textract.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C35318nt;
import o.C38363pW;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DetectDocumentTextOperationSerializerKt$serializeDetectDocumentTextOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C35318nt, Unit> {
    public static final DetectDocumentTextOperationSerializerKt$serializeDetectDocumentTextOperationBody$1$1$1 INSTANCE = new DetectDocumentTextOperationSerializerKt$serializeDetectDocumentTextOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetectDocumentTextOperationSerializerKt$serializeDetectDocumentTextOperationBody$1$1$1() {
        super(2, C38363pW.class, "serializeDocumentDocument", "serializeDocumentDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/Document;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C35318nt c35318nt) {
        invoke2(interfaceC5106Ey, c35318nt);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C35318nt c35318nt) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c35318nt, "");
        C38363pW.OLrzqt(interfaceC5106Ey, c35318nt);
    }
}
