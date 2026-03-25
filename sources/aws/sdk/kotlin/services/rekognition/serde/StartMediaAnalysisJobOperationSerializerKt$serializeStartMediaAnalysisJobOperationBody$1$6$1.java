package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C26583jf;
import o.C7185af;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C7185af, Unit> {
    public static final StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$6$1 INSTANCE = new StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$6$1() {
        super(2, C26583jf.class, "serializeMediaAnalysisOutputConfigDocument", "serializeMediaAnalysisOutputConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/MediaAnalysisOutputConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C7185af c7185af) {
        invoke2(interfaceC5106Ey, c7185af);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7185af c7185af) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c7185af, "");
        C26583jf.KWHzl(interfaceC5106Ey, c7185af);
    }
}
