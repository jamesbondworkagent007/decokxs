package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C47280tn;
import o.C48481uT;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$3$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C47280tn, Unit> {
    public static final StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$3$1 INSTANCE = new StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$3$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$3$1() {
        super(2, C48481uT.class, "serializeInputDataConfigDocument", "serializeInputDataConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/InputDataConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C47280tn c47280tn) {
        invoke2(interfaceC5106Ey, c47280tn);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C47280tn c47280tn) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c47280tn, "");
        C48481uT.AEQbTJ(interfaceC5106Ey, c47280tn);
    }
}
