package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ApfProgramEvent;
import o.InterfaceC5106Ey;
import o.Pin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateFlywheelOperationSerializerKt$serializeCreateFlywheelOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ApfProgramEvent, Unit> {
    public static final CreateFlywheelOperationSerializerKt$serializeCreateFlywheelOperationBody$1$5$1 INSTANCE = new CreateFlywheelOperationSerializerKt$serializeCreateFlywheelOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateFlywheelOperationSerializerKt$serializeCreateFlywheelOperationBody$1$5$1() {
        super(2, Pin.class, "serializeDataSecurityConfigDocument", "serializeDataSecurityConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/DataSecurityConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ApfProgramEvent apfProgramEvent) {
        invoke2(interfaceC5106Ey, apfProgramEvent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ApfProgramEvent apfProgramEvent) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(apfProgramEvent, "");
        Pin.OLrzqt(interfaceC5106Ey, apfProgramEvent);
    }
}
