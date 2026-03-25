package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.ParamsUtils;
import o.Vr2dDisplayProperties;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$13$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, Vr2dDisplayProperties, Unit> {
    public static final UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$13$1 INSTANCE = new UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$13$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$13$1() {
        super(2, ParamsUtils.class, "serializeSmsConfigurationTypeDocument", "serializeSmsConfigurationTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SmsConfigurationType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, Vr2dDisplayProperties vr2dDisplayProperties) {
        invoke2(interfaceC5106Ey, vr2dDisplayProperties);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Vr2dDisplayProperties vr2dDisplayProperties) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(vr2dDisplayProperties, "");
        ParamsUtils.KWHzl(interfaceC5106Ey, vr2dDisplayProperties);
    }
}
