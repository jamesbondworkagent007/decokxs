package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.BaseStream;
import o.InterfaceC5106Ey;
import o.MoveToDisplayItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, BaseStream, Unit> {
    public static final AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$2$1 INSTANCE = new AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$2$1() {
        super(2, MoveToDisplayItem.class, "serializeAccountTakeoverActionTypeDocument", "serializeAccountTakeoverActionTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AccountTakeoverActionType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, BaseStream baseStream) {
        invoke2(interfaceC5106Ey, baseStream);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull BaseStream baseStream) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(baseStream, "");
        MoveToDisplayItem.KWHzl(interfaceC5106Ey, baseStream);
    }
}
