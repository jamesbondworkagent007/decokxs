package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ConnectivityManager;
import o.InterfaceC5106Ey;
import o.SharedPreferencesBackupHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$11$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, SharedPreferencesBackupHelper, Unit> {
    public static final UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$11$1 INSTANCE = new UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$11$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$11$1() {
        super(2, ConnectivityManager.class, "serializeUserPoolPolicyTypeDocument", "serializeUserPoolPolicyTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserPoolPolicyType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, SharedPreferencesBackupHelper sharedPreferencesBackupHelper) {
        invoke2(interfaceC5106Ey, sharedPreferencesBackupHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull SharedPreferencesBackupHelper sharedPreferencesBackupHelper) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(sharedPreferencesBackupHelper, "");
        ConnectivityManager.AEQbTJ(interfaceC5106Ey, sharedPreferencesBackupHelper);
    }
}
