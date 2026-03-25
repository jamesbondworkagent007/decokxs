package aws.sdk.kotlin.services.textract.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C37715oz;
import o.C42307rO;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C37715oz, Unit> {
    public static final AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$5$1 INSTANCE = new AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$5$1() {
        super(2, C42307rO.class, "serializeQueriesConfigDocument", "serializeQueriesConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/QueriesConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C37715oz c37715oz) {
        invoke2(interfaceC5106Ey, c37715oz);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C37715oz c37715oz) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c37715oz, "");
        C42307rO.KWHzl(interfaceC5106Ey, c37715oz);
    }
}
