package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.CompatResources;
import o.InterfaceC5106Ey;
import o.NavigationRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, NavigationRes, Unit> {
    public static final CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$6$1 INSTANCE = new CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$6$1() {
        super(2, CompatResources.class, "serializeDeviceConfigurationTypeDocument", "serializeDeviceConfigurationTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/DeviceConfigurationType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, NavigationRes navigationRes) {
        invoke2(interfaceC5106Ey, navigationRes);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NavigationRes navigationRes) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(navigationRes, "");
        CompatResources.AEQbTJ(interfaceC5106Ey, navigationRes);
    }
}
