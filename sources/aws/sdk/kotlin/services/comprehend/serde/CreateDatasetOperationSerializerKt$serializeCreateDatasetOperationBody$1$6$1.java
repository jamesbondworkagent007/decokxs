package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.IpConnectivityLog;
import o.TrustedCertificateStoreAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateDatasetOperationSerializerKt$serializeCreateDatasetOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, IpConnectivityLog, Unit> {
    public static final CreateDatasetOperationSerializerKt$serializeCreateDatasetOperationBody$1$6$1 INSTANCE = new CreateDatasetOperationSerializerKt$serializeCreateDatasetOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateDatasetOperationSerializerKt$serializeCreateDatasetOperationBody$1$6$1() {
        super(2, TrustedCertificateStoreAdapter.class, "serializeDatasetInputDataConfigDocument", "serializeDatasetInputDataConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/DatasetInputDataConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, IpConnectivityLog ipConnectivityLog) {
        invoke2(interfaceC5106Ey, ipConnectivityLog);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull IpConnectivityLog ipConnectivityLog) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(ipConnectivityLog, "");
        TrustedCertificateStoreAdapter.copydefault(interfaceC5106Ey, ipConnectivityLog);
    }
}
