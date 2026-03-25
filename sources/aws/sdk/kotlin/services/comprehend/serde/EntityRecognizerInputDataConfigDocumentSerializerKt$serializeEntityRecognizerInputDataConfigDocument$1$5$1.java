package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.DigitsKeyListener;
import o.InterfaceC5106Ey;
import o.MemoryFile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class EntityRecognizerInputDataConfigDocumentSerializerKt$serializeEntityRecognizerInputDataConfigDocument$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, MemoryFile, Unit> {
    public static final EntityRecognizerInputDataConfigDocumentSerializerKt$serializeEntityRecognizerInputDataConfigDocument$1$5$1 INSTANCE = new EntityRecognizerInputDataConfigDocumentSerializerKt$serializeEntityRecognizerInputDataConfigDocument$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntityRecognizerInputDataConfigDocumentSerializerKt$serializeEntityRecognizerInputDataConfigDocument$1$5$1() {
        super(2, DigitsKeyListener.class, "serializeEntityRecognizerEntityListDocument", "serializeEntityRecognizerEntityListDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/EntityRecognizerEntityList;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, MemoryFile memoryFile) {
        invoke2(interfaceC5106Ey, memoryFile);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull MemoryFile memoryFile) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(memoryFile, "");
        DigitsKeyListener.OLrzqt(interfaceC5106Ey, memoryFile);
    }
}
