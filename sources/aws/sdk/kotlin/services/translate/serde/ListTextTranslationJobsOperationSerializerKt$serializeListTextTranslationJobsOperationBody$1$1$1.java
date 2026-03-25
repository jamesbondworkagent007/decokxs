package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C46483tW;
import o.C53362wk;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ListTextTranslationJobsOperationSerializerKt$serializeListTextTranslationJobsOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C46483tW, Unit> {
    public static final ListTextTranslationJobsOperationSerializerKt$serializeListTextTranslationJobsOperationBody$1$1$1 INSTANCE = new ListTextTranslationJobsOperationSerializerKt$serializeListTextTranslationJobsOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ListTextTranslationJobsOperationSerializerKt$serializeListTextTranslationJobsOperationBody$1$1$1() {
        super(2, C53362wk.class, "serializeTextTranslationJobFilterDocument", "serializeTextTranslationJobFilterDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/TextTranslationJobFilter;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C46483tW c46483tW) {
        invoke2(interfaceC5106Ey, c46483tW);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46483tW c46483tW) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c46483tW, "");
        C53362wk.OLrzqt(interfaceC5106Ey, c46483tW);
    }
}
