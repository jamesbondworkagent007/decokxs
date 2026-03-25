package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.Debug;
import o.InterfaceC5106Ey;
import o.SpanSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateDocumentClassifierOperationSerializerKt$serializeCreateDocumentClassifierOperationBody$1$9$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, Debug, Unit> {
    public static final CreateDocumentClassifierOperationSerializerKt$serializeCreateDocumentClassifierOperationBody$1$9$1 INSTANCE = new CreateDocumentClassifierOperationSerializerKt$serializeCreateDocumentClassifierOperationBody$1$9$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateDocumentClassifierOperationSerializerKt$serializeCreateDocumentClassifierOperationBody$1$9$1() {
        super(2, SpanSet.class, "serializeDocumentClassifierOutputDataConfigDocument", "serializeDocumentClassifierOutputDataConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/DocumentClassifierOutputDataConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, Debug debug) {
        invoke2(interfaceC5106Ey, debug);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Debug debug) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(debug, "");
        SpanSet.EZpvd(interfaceC5106Ey, debug);
    }
}
