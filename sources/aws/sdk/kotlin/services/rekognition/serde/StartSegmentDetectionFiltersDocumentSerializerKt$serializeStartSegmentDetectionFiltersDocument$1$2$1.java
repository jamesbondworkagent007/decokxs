package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C30963ll;
import o.C8297bA;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C8297bA, Unit> {
    public static final StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$2$1 INSTANCE = new StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$2$1() {
        super(2, C30963ll.class, "serializeStartShotDetectionFilterDocument", "serializeStartShotDetectionFilterDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StartShotDetectionFilter;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C8297bA c8297bA) {
        invoke2(interfaceC5106Ey, c8297bA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8297bA c8297bA) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8297bA, "");
        C30963ll.copydefault(interfaceC5106Ey, c8297bA);
    }
}
