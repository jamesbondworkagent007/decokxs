package aws.smithy.kotlin.runtime.awsprotocol.xml;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C54481xK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1(Continuation<? super Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C54481xK.EZpvd(null, this);
    }
}
