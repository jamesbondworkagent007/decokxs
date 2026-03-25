package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.CameraDeviceState;
import o.InterfaceC5106Ey;
import o.MediaRouteActionProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, MediaRouteActionProvider, Unit> {
    public static final AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$1$1 INSTANCE = new AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$1$1() {
        super(2, CameraDeviceState.class, "serializeNotifyConfigurationTypeDocument", "serializeNotifyConfigurationTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotifyConfigurationType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, MediaRouteActionProvider mediaRouteActionProvider) {
        invoke2(interfaceC5106Ey, mediaRouteActionProvider);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull MediaRouteActionProvider mediaRouteActionProvider) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(mediaRouteActionProvider, "");
        CameraDeviceState.EZpvd(interfaceC5106Ey, mediaRouteActionProvider);
    }
}
