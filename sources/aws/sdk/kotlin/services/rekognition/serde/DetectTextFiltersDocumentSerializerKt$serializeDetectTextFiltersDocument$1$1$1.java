package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C17645fN;
import o.InterfaceC5106Ey;
import o.RtlSpacingHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DetectTextFiltersDocumentSerializerKt$serializeDetectTextFiltersDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, RtlSpacingHelper, Unit> {
    public static final DetectTextFiltersDocumentSerializerKt$serializeDetectTextFiltersDocument$1$1$1 INSTANCE = new DetectTextFiltersDocumentSerializerKt$serializeDetectTextFiltersDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetectTextFiltersDocumentSerializerKt$serializeDetectTextFiltersDocument$1$1$1() {
        super(2, C17645fN.class, "serializeDetectionFilterDocument", "serializeDetectionFilterDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/DetectionFilter;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, RtlSpacingHelper rtlSpacingHelper) {
        invoke2(interfaceC5106Ey, rtlSpacingHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RtlSpacingHelper rtlSpacingHelper) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(rtlSpacingHelper, "");
        C17645fN.OLrzqt(interfaceC5106Ey, rtlSpacingHelper);
    }
}
