package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AdapterView;
import o.C14470dm;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, AdapterView, Unit> {
    public static final StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$2$1 INSTANCE = new StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$2$1() {
        super(2, C14470dm.class, "serializeConnectedHomeSettingsDocument", "serializeConnectedHomeSettingsDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/ConnectedHomeSettings;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, AdapterView adapterView) {
        invoke2(interfaceC5106Ey, adapterView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull AdapterView adapterView) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(adapterView, "");
        C14470dm.AEQbTJ(interfaceC5106Ey, adapterView);
    }
}
