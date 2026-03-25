package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AccountManagerResponse;
import o.InterfaceC5106Ey;
import o.PeriodicAdvertisingParameters;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class ConfirmSignUpOperationSerializerKt$serializeConfirmSignUpOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, AccountManagerResponse, Unit> {
    public static final ConfirmSignUpOperationSerializerKt$serializeConfirmSignUpOperationBody$1$1$1 INSTANCE = new ConfirmSignUpOperationSerializerKt$serializeConfirmSignUpOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConfirmSignUpOperationSerializerKt$serializeConfirmSignUpOperationBody$1$1$1() {
        super(2, PeriodicAdvertisingParameters.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, AccountManagerResponse accountManagerResponse) {
        invoke2(interfaceC5106Ey, accountManagerResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull AccountManagerResponse accountManagerResponse) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(accountManagerResponse, "");
        PeriodicAdvertisingParameters.OLrzqt(interfaceC5106Ey, accountManagerResponse);
    }
}
