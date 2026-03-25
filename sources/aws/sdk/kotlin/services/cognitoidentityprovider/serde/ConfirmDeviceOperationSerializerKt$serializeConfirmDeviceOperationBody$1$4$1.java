package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.CompatibilityInfo;
import o.InterfaceC5106Ey;
import o.PluralsRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ConfirmDeviceOperationSerializerKt$serializeConfirmDeviceOperationBody$1$4$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, PluralsRes, Unit> {
    public static final ConfirmDeviceOperationSerializerKt$serializeConfirmDeviceOperationBody$1$4$1 INSTANCE = new ConfirmDeviceOperationSerializerKt$serializeConfirmDeviceOperationBody$1$4$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConfirmDeviceOperationSerializerKt$serializeConfirmDeviceOperationBody$1$4$1() {
        super(2, CompatibilityInfo.class, "serializeDeviceSecretVerifierConfigTypeDocument", "serializeDeviceSecretVerifierConfigTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/DeviceSecretVerifierConfigType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, PluralsRes pluralsRes) {
        invoke2(interfaceC5106Ey, pluralsRes);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull PluralsRes pluralsRes) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(pluralsRes, "");
        CompatibilityInfo.copydefault(interfaceC5106Ey, pluralsRes);
    }
}
