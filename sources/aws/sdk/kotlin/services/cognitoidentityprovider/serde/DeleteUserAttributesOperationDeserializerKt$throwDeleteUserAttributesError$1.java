package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.OrgApacheHttpLegacyUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DeleteUserAttributesOperationDeserializerKt$throwDeleteUserAttributesError$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeleteUserAttributesOperationDeserializerKt$throwDeleteUserAttributesError$1(Continuation<? super DeleteUserAttributesOperationDeserializerKt$throwDeleteUserAttributesError$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OrgApacheHttpLegacyUpdater.AEQbTJ(null, null, this);
    }
}
