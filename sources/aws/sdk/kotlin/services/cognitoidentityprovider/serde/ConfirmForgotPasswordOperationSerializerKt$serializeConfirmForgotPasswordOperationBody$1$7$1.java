package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ExtractButton;
import o.InterfaceC5106Ey;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ConfirmForgotPasswordOperationSerializerKt$serializeConfirmForgotPasswordOperationBody$1$7$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, RestoreDescription, Unit> {
    public static final ConfirmForgotPasswordOperationSerializerKt$serializeConfirmForgotPasswordOperationBody$1$7$1 INSTANCE = new ConfirmForgotPasswordOperationSerializerKt$serializeConfirmForgotPasswordOperationBody$1$7$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConfirmForgotPasswordOperationSerializerKt$serializeConfirmForgotPasswordOperationBody$1$7$1() {
        super(2, ExtractButton.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, RestoreDescription restoreDescription) {
        invoke2(interfaceC5106Ey, restoreDescription);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RestoreDescription restoreDescription) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(restoreDescription, "");
        ExtractButton.EZpvd(interfaceC5106Ey, restoreDescription);
    }
}
