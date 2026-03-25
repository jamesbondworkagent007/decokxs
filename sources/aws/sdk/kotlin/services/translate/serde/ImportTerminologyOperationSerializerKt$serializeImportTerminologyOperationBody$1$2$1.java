package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C46697tc;
import o.C48290uM;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C46697tc, Unit> {
    public static final ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$2$1 INSTANCE = new ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$2$1() {
        super(2, C48290uM.class, "serializeEncryptionKeyDocument", "serializeEncryptionKeyDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/EncryptionKey;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C46697tc c46697tc) {
        invoke2(interfaceC5106Ey, c46697tc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46697tc c46697tc) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c46697tc, "");
        C48290uM.copydefault(interfaceC5106Ey, c46697tc);
    }
}
