package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C21454h;
import o.C22793hm;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class HumanLoopConfigDocumentSerializerKt$serializeHumanLoopConfigDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C21454h, Unit> {
    public static final HumanLoopConfigDocumentSerializerKt$serializeHumanLoopConfigDocument$1$1$1 INSTANCE = new HumanLoopConfigDocumentSerializerKt$serializeHumanLoopConfigDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HumanLoopConfigDocumentSerializerKt$serializeHumanLoopConfigDocument$1$1$1() {
        super(2, C22793hm.class, "serializeHumanLoopDataAttributesDocument", "serializeHumanLoopDataAttributesDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/HumanLoopDataAttributes;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C21454h c21454h) {
        invoke2(interfaceC5106Ey, c21454h);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C21454h c21454h) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c21454h, "");
        C22793hm.OLrzqt(interfaceC5106Ey, c21454h);
    }
}
