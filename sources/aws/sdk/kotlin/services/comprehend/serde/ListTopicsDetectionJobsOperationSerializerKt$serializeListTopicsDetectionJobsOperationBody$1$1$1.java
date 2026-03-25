package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.LongitudinalReportingEncoder;
import o.NotificationHeaderView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ListTopicsDetectionJobsOperationSerializerKt$serializeListTopicsDetectionJobsOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, LongitudinalReportingEncoder, Unit> {
    public static final ListTopicsDetectionJobsOperationSerializerKt$serializeListTopicsDetectionJobsOperationBody$1$1$1 INSTANCE = new ListTopicsDetectionJobsOperationSerializerKt$serializeListTopicsDetectionJobsOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ListTopicsDetectionJobsOperationSerializerKt$serializeListTopicsDetectionJobsOperationBody$1$1$1() {
        super(2, NotificationHeaderView.class, "serializeTopicsDetectionJobFilterDocument", "serializeTopicsDetectionJobFilterDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/TopicsDetectionJobFilter;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, LongitudinalReportingEncoder longitudinalReportingEncoder) {
        invoke2(interfaceC5106Ey, longitudinalReportingEncoder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull LongitudinalReportingEncoder longitudinalReportingEncoder) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(longitudinalReportingEncoder, "");
        NotificationHeaderView.KWHzl(interfaceC5106Ey, longitudinalReportingEncoder);
    }
}
