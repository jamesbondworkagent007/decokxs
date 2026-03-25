package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C31228lq;
import o.C8509bE;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C8509bE, Unit> {
    public static final StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$2$1 INSTANCE = new StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$2$1() {
        super(2, C31228lq.class, "serializeStartTextDetectionFiltersDocument", "serializeStartTextDetectionFiltersDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StartTextDetectionFilters;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C8509bE c8509bE) {
        invoke2(interfaceC5106Ey, c8509bE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8509bE c8509bE) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8509bE, "");
        C31228lq.EZpvd(interfaceC5106Ey, c8509bE);
    }
}
