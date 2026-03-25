package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.DateFormat;
import o.IncidentManager;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ListEntitiesDetectionJobsOperationSerializerKt$serializeListEntitiesDetectionJobsOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, IncidentManager, Unit> {
    public static final ListEntitiesDetectionJobsOperationSerializerKt$serializeListEntitiesDetectionJobsOperationBody$1$1$1 INSTANCE = new ListEntitiesDetectionJobsOperationSerializerKt$serializeListEntitiesDetectionJobsOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ListEntitiesDetectionJobsOperationSerializerKt$serializeListEntitiesDetectionJobsOperationBody$1$1$1() {
        super(2, DateFormat.class, "serializeEntitiesDetectionJobFilterDocument", "serializeEntitiesDetectionJobFilterDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/EntitiesDetectionJobFilter;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, IncidentManager incidentManager) {
        invoke2(interfaceC5106Ey, incidentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull IncidentManager incidentManager) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(incidentManager, "");
        DateFormat.copydefault(interfaceC5106Ey, incidentManager);
    }
}
