package aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.PathClassLoader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AssumeRoleWithWebIdentityOperationDeserializerKt$throwAssumeRoleWithWebIdentityError$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssumeRoleWithWebIdentityOperationDeserializerKt$throwAssumeRoleWithWebIdentityError$1(Continuation<? super AssumeRoleWithWebIdentityOperationDeserializerKt$throwAssumeRoleWithWebIdentityError$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PathClassLoader.copydefault(null, null, this);
    }
}
