package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.DeadObjectException;
import o.InterfaceC5106Ey;
import o.LoginFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$7$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, DeadObjectException, Unit> {
    public static final DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$7$1 INSTANCE = new DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$7$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$7$1() {
        super(2, LoginFilter.class, "serializeDocumentClassifierDocumentsDocument", "serializeDocumentClassifierDocumentsDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/DocumentClassifierDocuments;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, DeadObjectException deadObjectException) {
        invoke2(interfaceC5106Ey, deadObjectException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull DeadObjectException deadObjectException) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(deadObjectException, "");
        LoginFilter.OLrzqt(interfaceC5106Ey, deadObjectException);
    }
}
