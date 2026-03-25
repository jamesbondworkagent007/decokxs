package aws.sdk.kotlin.services.cognitoidentity.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.Buffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class GetIdentityPoolRolesOperationDeserializerKt$throwGetIdentityPoolRolesError$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetIdentityPoolRolesOperationDeserializerKt$throwGetIdentityPoolRolesError$1(Continuation<? super GetIdentityPoolRolesOperationDeserializerKt$throwGetIdentityPoolRolesError$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Buffer.copydefault(null, null, this);
    }
}
