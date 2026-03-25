package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C31069ln;
import o.C8456bD;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C8456bD, Unit> {
    public static final StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$1$1 INSTANCE = new StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$1$1() {
        super(2, C31069ln.class, "serializeStartTechnicalCueDetectionFilterDocument", "serializeStartTechnicalCueDetectionFilterDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StartTechnicalCueDetectionFilter;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C8456bD c8456bD) {
        invoke2(interfaceC5106Ey, c8456bD);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8456bD c8456bD) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8456bD, "");
        C31069ln.OLrzqt(interfaceC5106Ey, c8456bD);
    }
}
