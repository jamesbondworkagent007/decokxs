package aws.sdk.kotlin.services.textract.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C35796oE;
import o.C42415rS;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DocumentDocumentSerializerKt$serializeDocumentDocument$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C35796oE, Unit> {
    public static final DocumentDocumentSerializerKt$serializeDocumentDocument$1$2$1 INSTANCE = new DocumentDocumentSerializerKt$serializeDocumentDocument$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DocumentDocumentSerializerKt$serializeDocumentDocument$1$2$1() {
        super(2, C42415rS.class, "serializeS3ObjectDocument", "serializeS3ObjectDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/S3Object;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C35796oE c35796oE) {
        invoke2(interfaceC5106Ey, c35796oE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C35796oE c35796oE) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c35796oE, "");
        C42415rS.KWHzl(interfaceC5106Ey, c35796oE);
    }
}
