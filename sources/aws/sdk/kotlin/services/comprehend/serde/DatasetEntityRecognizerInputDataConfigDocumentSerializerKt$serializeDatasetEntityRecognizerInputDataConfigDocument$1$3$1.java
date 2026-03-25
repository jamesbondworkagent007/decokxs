package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultNetworkEvent;
import o.InterfaceC5106Ey;
import o.RootTrustManagerFactorySpi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$3$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, DefaultNetworkEvent, Unit> {
    public static final DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$3$1 INSTANCE = new DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$3$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$3$1() {
        super(2, RootTrustManagerFactorySpi.class, "serializeDatasetEntityRecognizerEntityListDocument", "serializeDatasetEntityRecognizerEntityListDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/DatasetEntityRecognizerEntityList;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, DefaultNetworkEvent defaultNetworkEvent) {
        invoke2(interfaceC5106Ey, defaultNetworkEvent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull DefaultNetworkEvent defaultNetworkEvent) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(defaultNetworkEvent, "");
        RootTrustManagerFactorySpi.KWHzl(interfaceC5106Ey, defaultNetworkEvent);
    }
}
