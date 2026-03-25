package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C30103lM;
import o.C9251bS;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C9251bS, Unit> {
    public static final UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$5$1 INSTANCE = new UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$5$1() {
        super(2, C30103lM.class, "serializeStreamProcessorSettingsForUpdateDocument", "serializeStreamProcessorSettingsForUpdateDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/StreamProcessorSettingsForUpdate;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C9251bS c9251bS) {
        invoke2(interfaceC5106Ey, c9251bS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C9251bS c9251bS) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c9251bS, "");
        C30103lM.OLrzqt(interfaceC5106Ey, c9251bS);
    }
}
