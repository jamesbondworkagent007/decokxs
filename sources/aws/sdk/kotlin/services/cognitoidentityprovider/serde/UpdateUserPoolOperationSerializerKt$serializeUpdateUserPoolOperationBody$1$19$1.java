package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.IpSecManager;
import o.WallpaperBackupHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$19$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, WallpaperBackupHelper, Unit> {
    public static final UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$19$1 INSTANCE = new UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$19$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$19$1() {
        super(2, IpSecManager.class, "serializeVerificationMessageTemplateTypeDocument", "serializeVerificationMessageTemplateTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/VerificationMessageTemplateType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, WallpaperBackupHelper wallpaperBackupHelper) {
        invoke2(interfaceC5106Ey, wallpaperBackupHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WallpaperBackupHelper wallpaperBackupHelper) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(wallpaperBackupHelper, "");
        IpSecManager.AEQbTJ(interfaceC5106Ey, wallpaperBackupHelper);
    }
}
