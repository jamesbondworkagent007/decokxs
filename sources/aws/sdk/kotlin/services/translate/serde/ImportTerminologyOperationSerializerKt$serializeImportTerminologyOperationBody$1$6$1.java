package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C46402tT;
import o.C52885wb;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C46402tT, Unit> {
    public static final ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$6$1 INSTANCE = new ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$6$1() {
        super(2, C52885wb.class, "serializeTerminologyDataDocument", "serializeTerminologyDataDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/TerminologyData;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C46402tT c46402tT) {
        invoke2(interfaceC5106Ey, c46402tT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46402tT c46402tT) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c46402tT, "");
        C52885wb.EZpvd(interfaceC5106Ey, c46402tT);
    }
}
