package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SQLiteBindOrColumnIndexOutOfRangeException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GetUICustomizationOperationDeserializer$deserialize$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ SQLiteBindOrColumnIndexOutOfRangeException this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUICustomizationOperationDeserializer$deserialize$1(SQLiteBindOrColumnIndexOutOfRangeException sQLiteBindOrColumnIndexOutOfRangeException, Continuation<? super GetUICustomizationOperationDeserializer$deserialize$1> continuation) {
        super(continuation);
        this.this$0 = sQLiteBindOrColumnIndexOutOfRangeException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, null, this);
    }
}
