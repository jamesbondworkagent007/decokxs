package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C10841bw;
import o.C30645lf;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C10841bw, Unit> {
    public static final StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$2$1 INSTANCE = new StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$2$1() {
        super(2, C30645lf.class, "serializeStartSegmentDetectionFiltersDocument", "serializeStartSegmentDetectionFiltersDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StartSegmentDetectionFilters;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C10841bw c10841bw) {
        invoke2(interfaceC5106Ey, c10841bw);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C10841bw c10841bw) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c10841bw, "");
        C30645lf.EZpvd(interfaceC5106Ey, c10841bw);
    }
}
