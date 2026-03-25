package aws.smithy.kotlin.runtime.identity;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5051Cv;
import o.C5141Gh;
import o.C56379yDe;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.GU;
import o.InterfaceC5045Cp;
import o.InterfaceC5047Cr;
import o.InterfaceC5148Go;
import o.InterfaceC56387yDm;
import o.InterfaceC57843yq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [I] */
/* JADX INFO: loaded from: classes2.dex */
public final class IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1<I> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super I>, Object> {
    final /* synthetic */ InterfaceC57843yq $attributes$inlined;
    final /* synthetic */ GU $span;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC5051Cv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1(GU gu, Continuation continuation, AbstractC5051Cv abstractC5051Cv, InterfaceC57843yq interfaceC57843yq) {
        super(2, continuation);
        this.$span = gu;
        this.this$0 = abstractC5051Cv;
        this.$attributes$inlined = interfaceC57843yq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1 identityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1 = new IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1(this.$span, continuation, this.this$0, this.$attributes$inlined);
        identityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1.L$0 = obj;
        return identityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super I> continuation) {
        return ((IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:20:0x0084). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        int i;
        InterfaceC56387yDm interfaceC56387yDm;
        InterfaceC5045Cp[] interfaceC5045CpArr;
        InterfaceC5148Go interfaceC5148Go;
        final InterfaceC5045Cp interfaceC5045Cp;
        Object objCopydefault = C56442yFn.copydefault();
        int length = this.label;
        try {
        } catch (Exception e) {
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<String>() { // from class: aws.smithy.kotlin.runtime.identity.IdentityProviderChain$resolve$2$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (TP;Ljava/lang/Exception;)V */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "unable to resolve identity from " + interfaceC5045Cp + ": " + e.getMessage();
                }
            }, 1, null);
            C56379yDe.EZpvd((Throwable) interfaceC56387yDm.getValue(), e);
            i++;
        }
        if (length != 0) {
            if (length != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.I$1;
            i = this.I$0;
            interfaceC5045Cp = (InterfaceC5045Cp) this.L$3;
            interfaceC5148Go = (InterfaceC5148Go) this.L$2;
            interfaceC5045CpArr = (InterfaceC5045Cp[]) this.L$1;
            interfaceC56387yDm = (InterfaceC56387yDm) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Intrinsics.copydefault(obj, "");
            return (InterfaceC5047Cr) obj;
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineContext coroutineContext = ((CoroutineScope) this.L$0).getCoroutineContext();
        String strGEmmrt = C56524yIo.AEQbTJ(AbstractC5051Cv.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(coroutineContext, strGEmmrt);
        final AbstractC5051Cv abstractC5051Cv = this.this$0;
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0<IdentityProviderException>() { // from class: aws.smithy.kotlin.runtime.identity.IdentityProviderChain$resolve$2$chainException$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final IdentityProviderException invoke() {
                return new IdentityProviderException("No identity could be resolved from the chain: " + abstractC5051Cv, null, 2, null);
            }
        });
        InterfaceC5045Cp[] interfaceC5045CpArrCopydefault = this.this$0.copydefault();
        interfaceC56387yDm = interfaceC56387yDmCopydefault;
        interfaceC5045CpArr = interfaceC5045CpArrCopydefault;
        length = interfaceC5045CpArrCopydefault.length;
        i = 0;
        interfaceC5148Go = interfaceC5148GoOLrzqt;
        if (i >= length) {
            throw ((Throwable) interfaceC56387yDm.getValue());
        }
        interfaceC5045Cp = interfaceC5045CpArr[i];
        InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148Go, null, new Function0<String>() { // from class: aws.smithy.kotlin.runtime.identity.IdentityProviderChain$resolve$2$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Incorrect types in method signature: (TP;)V */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Attempting to resolve identity from " + interfaceC5045Cp;
            }
        }, 1, null);
        InterfaceC57843yq interfaceC57843yq = this.$attributes$inlined;
        this.L$0 = interfaceC56387yDm;
        this.L$1 = interfaceC5045CpArr;
        this.L$2 = interfaceC5148Go;
        this.L$3 = interfaceC5045Cp;
        this.I$0 = i;
        this.I$1 = length;
        this.label = 1;
        obj = interfaceC5045Cp.resolve(interfaceC57843yq, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Intrinsics.copydefault(obj, "");
        return (InterfaceC5047Cr) obj;
    }
}
