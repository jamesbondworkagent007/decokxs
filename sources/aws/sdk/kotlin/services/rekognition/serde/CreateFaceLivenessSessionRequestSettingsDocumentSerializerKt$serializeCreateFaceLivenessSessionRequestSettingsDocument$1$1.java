package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23995iR;
import o.InterfaceC5106Ey;
import o.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateFaceLivenessSessionRequestSettingsDocumentSerializerKt$serializeCreateFaceLivenessSessionRequestSettingsDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, V, Unit> {
    public static final CreateFaceLivenessSessionRequestSettingsDocumentSerializerKt$serializeCreateFaceLivenessSessionRequestSettingsDocument$1$1$1 INSTANCE = new CreateFaceLivenessSessionRequestSettingsDocumentSerializerKt$serializeCreateFaceLivenessSessionRequestSettingsDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateFaceLivenessSessionRequestSettingsDocumentSerializerKt$serializeCreateFaceLivenessSessionRequestSettingsDocument$1$1$1() {
        super(2, C23995iR.class, "serializeLivenessOutputConfigDocument", "serializeLivenessOutputConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/LivenessOutputConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, V v) {
        invoke2(interfaceC5106Ey, v);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull V v) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(v, "");
        C23995iR.copydefault(interfaceC5106Ey, v);
    }
}
