package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C48882ue;
import o.C53945wv;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C48882ue, Unit> {
    public static final TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$2$1 INSTANCE = new TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$2$1() {
        super(2, C53945wv.class, "serializeTranslationSettingsDocument", "serializeTranslationSettingsDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/TranslationSettings;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C48882ue c48882ue) {
        invoke2(interfaceC5106Ey, c48882ue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C48882ue c48882ue) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c48882ue, "");
        C53945wv.copydefault(interfaceC5106Ey, c48882ue);
    }
}
