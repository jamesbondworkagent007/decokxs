package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.LongParcelable;
import o.UiModeManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, UiModeManager, Unit> {
    public static final SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$2$1 INSTANCE = new SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$2$1() {
        super(2, LongParcelable.class, "serializeSmsMfaConfigTypeDocument", "serializeSmsMfaConfigTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SmsMfaConfigType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, UiModeManager uiModeManager) {
        invoke2(interfaceC5106Ey, uiModeManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull UiModeManager uiModeManager) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(uiModeManager, "");
        LongParcelable.AEQbTJ(interfaceC5106Ey, uiModeManager);
    }
}
