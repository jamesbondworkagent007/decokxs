package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C11701cY;
import o.InterfaceC5106Ey;
import o.WebViewZygote;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, WebViewZygote, Unit> {
    public static final RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$1$1 INSTANCE = new RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$1$1() {
        super(2, C11701cY.class, "serializeBoundingBoxDocument", "serializeBoundingBoxDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/BoundingBox;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, WebViewZygote webViewZygote) {
        invoke2(interfaceC5106Ey, webViewZygote);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WebViewZygote webViewZygote) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(webViewZygote, "");
        C11701cY.AEQbTJ(interfaceC5106Ey, webViewZygote);
    }
}
