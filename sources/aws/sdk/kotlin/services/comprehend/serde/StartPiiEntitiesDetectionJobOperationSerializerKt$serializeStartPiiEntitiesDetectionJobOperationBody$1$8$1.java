package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.MalformedJsonException;
import o.ServiceConnectionLeakedViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$8$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ServiceConnectionLeakedViolation, Unit> {
    public static final StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$8$1 INSTANCE = new StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$8$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$8$1() {
        super(2, MalformedJsonException.class, "serializeRedactionConfigDocument", "serializeRedactionConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/RedactionConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ServiceConnectionLeakedViolation serviceConnectionLeakedViolation) {
        invoke2(interfaceC5106Ey, serviceConnectionLeakedViolation);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ServiceConnectionLeakedViolation serviceConnectionLeakedViolation) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(serviceConnectionLeakedViolation, "");
        MalformedJsonException.copydefault(interfaceC5106Ey, serviceConnectionLeakedViolation);
    }
}
