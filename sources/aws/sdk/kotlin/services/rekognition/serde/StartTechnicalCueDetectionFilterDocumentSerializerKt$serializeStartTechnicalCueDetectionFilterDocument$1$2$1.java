package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C11512cR;
import o.InterfaceC5106Ey;
import o.WebViewLibraryLoader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartTechnicalCueDetectionFilterDocumentSerializerKt$serializeStartTechnicalCueDetectionFilterDocument$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, WebViewLibraryLoader, Unit> {
    public static final StartTechnicalCueDetectionFilterDocumentSerializerKt$serializeStartTechnicalCueDetectionFilterDocument$1$2$1 INSTANCE = new StartTechnicalCueDetectionFilterDocumentSerializerKt$serializeStartTechnicalCueDetectionFilterDocument$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartTechnicalCueDetectionFilterDocumentSerializerKt$serializeStartTechnicalCueDetectionFilterDocument$1$2$1() {
        super(2, C11512cR.class, "serializeBlackFrameDocument", "serializeBlackFrameDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/BlackFrame;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, WebViewLibraryLoader webViewLibraryLoader) {
        invoke2(interfaceC5106Ey, webViewLibraryLoader);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WebViewLibraryLoader webViewLibraryLoader) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(webViewLibraryLoader, "");
        C11512cR.copydefault(interfaceC5106Ey, webViewLibraryLoader);
    }
}
