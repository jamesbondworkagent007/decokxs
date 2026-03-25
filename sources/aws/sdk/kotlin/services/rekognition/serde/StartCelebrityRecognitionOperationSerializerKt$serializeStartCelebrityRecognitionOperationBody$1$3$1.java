package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C26901jl;
import o.C7662ao;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$3$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C7662ao, Unit> {
    public static final StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$3$1 INSTANCE = new StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$3$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$3$1() {
        super(2, C26901jl.class, "serializeNotificationChannelDocument", "serializeNotificationChannelDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/NotificationChannel;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C7662ao c7662ao) {
        invoke2(interfaceC5106Ey, c7662ao);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7662ao c7662ao) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c7662ao, "");
        C26901jl.AEQbTJ(interfaceC5106Ey, c7662ao);
    }
}
