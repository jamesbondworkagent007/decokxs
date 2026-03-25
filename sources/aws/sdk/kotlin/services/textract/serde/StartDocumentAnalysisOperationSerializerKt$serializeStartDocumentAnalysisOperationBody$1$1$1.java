package aws.sdk.kotlin.services.textract.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C34331na;
import o.C38789pg;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C34331na, Unit> {
    public static final StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$1$1 INSTANCE = new StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$1$1() {
        super(2, C38789pg.class, "serializeAdaptersConfigDocument", "serializeAdaptersConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/AdaptersConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C34331na c34331na) {
        invoke2(interfaceC5106Ey, c34331na);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C34331na c34331na) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c34331na, "");
        C38789pg.KWHzl(interfaceC5106Ey, c34331na);
    }
}
