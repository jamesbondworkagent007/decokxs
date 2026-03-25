package aws.sdk.kotlin.runtime.auth.credentials;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.ArrayIndexOutOfBoundsException;
import o.C56391yDq;
import o.C56442yFn;
import o.FilterOutputStream;
import o.HL;
import o.InterfaceC57843yq;
import o.Looper;
import o.ObjectStreamField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileCredentialsProvider$resolve$region$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ InterfaceC57843yq $attributes;
    final /* synthetic */ ObjectStreamField $profileOverride;
    int label;
    final /* synthetic */ Looper this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCredentialsProvider$resolve$region$1(Looper looper, ObjectStreamField objectStreamField, InterfaceC57843yq interfaceC57843yq, Continuation<? super ProfileCredentialsProvider$resolve$region$1> continuation) {
        super(1, continuation);
        this.this$0 = looper;
        this.$profileOverride = objectStreamField;
        this.$attributes = interfaceC57843yq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new ProfileCredentialsProvider$resolve$region$1(this.this$0, this.$profileOverride, this.$attributes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((ProfileCredentialsProvider$resolve$region$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strEZpvd = this.this$0.EZpvd();
            if (strEZpvd != null) {
                return strEZpvd;
            }
            ObjectStreamField objectStreamField = this.$profileOverride;
            String orNull$default = objectStreamField != null ? ObjectStreamField.getOrNull$default(objectStreamField, "region", null, 2, null) : null;
            if (orNull$default != null) {
                return orNull$default;
            }
            String str = (String) this.$attributes.OLrzqt(FilterOutputStream.EZpvd.AEQbTJ());
            if (str != null) {
                return str;
            }
            HL hlAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            obj = ArrayIndexOutOfBoundsException.resolveRegion$default(hlAEQbTJ, null, this, 2, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (String) obj;
    }
}
