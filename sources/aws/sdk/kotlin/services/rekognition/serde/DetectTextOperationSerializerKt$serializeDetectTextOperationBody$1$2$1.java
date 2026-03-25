package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23005hq;
import o.C25615j;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C25615j, Unit> {
    public static final DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$2$1 INSTANCE = new DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$2$1() {
        super(2, C23005hq.class, "serializeImageDocument", "serializeImageDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Image;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C25615j c25615j) {
        invoke2(interfaceC5106Ey, c25615j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C25615j c25615j) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c25615j, "");
        C23005hq.AEQbTJ(interfaceC5106Ey, c25615j);
    }
}
