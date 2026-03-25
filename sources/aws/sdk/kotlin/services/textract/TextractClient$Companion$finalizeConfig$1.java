package aws.sdk.kotlin.services.textract;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.HH;
import o.InterfaceC31925mJ;
import o.ObjectOutputStream;
import o.ObjectStreamField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class TextractClient$Companion$finalizeConfig$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ InterfaceC31925mJ.Activity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextractClient$Companion$finalizeConfig$1(InterfaceC31925mJ.Activity activity, Continuation<? super TextractClient$Companion$finalizeConfig$1> continuation) {
        super(continuation);
        this.this$0 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((InterfaceC31925mJ.Application) null, (HH<ObjectOutputStream>) null, (HH<ObjectStreamField>) null, (Continuation<? super Unit>) this);
    }
}
