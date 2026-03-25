package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C45916tB;
import o.C50103vC;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C45916tB, Unit> {
    public static final StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$5$1 INSTANCE = new StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$5$1() {
        super(2, C50103vC.class, "serializeOutputDataConfigDocument", "serializeOutputDataConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/OutputDataConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C45916tB c45916tB) {
        invoke2(interfaceC5106Ey, c45916tB);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C45916tB c45916tB) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c45916tB, "");
        C50103vC.OLrzqt(interfaceC5106Ey, c45916tB);
    }
}
