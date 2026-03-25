package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.IntArray;
import o.InterfaceC5106Ey;
import o.StorageManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartTopicsDetectionJobOperationSerializerKt$serializeStartTopicsDetectionJobOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, StorageManagerInternal, Unit> {
    public static final StartTopicsDetectionJobOperationSerializerKt$serializeStartTopicsDetectionJobOperationBody$1$6$1 INSTANCE = new StartTopicsDetectionJobOperationSerializerKt$serializeStartTopicsDetectionJobOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartTopicsDetectionJobOperationSerializerKt$serializeStartTopicsDetectionJobOperationBody$1$6$1() {
        super(2, IntArray.class, "serializeOutputDataConfigDocument", "serializeOutputDataConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/OutputDataConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, StorageManagerInternal storageManagerInternal) {
        invoke2(interfaceC5106Ey, storageManagerInternal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull StorageManagerInternal storageManagerInternal) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(storageManagerInternal, "");
        IntArray.EZpvd(interfaceC5106Ey, storageManagerInternal);
    }
}
