package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountPreCheckResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyAddressCheckViewModel$checkAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EscapePassKeyAddressCheckViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyAddressCheckViewModel$checkAddress$1(EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel, Continuation<? super EscapePassKeyAddressCheckViewModel$checkAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = escapePassKeyAddressCheckViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EscapePassKeyAddressCheckViewModel$checkAddress$1 escapePassKeyAddressCheckViewModel$checkAddress$1 = new EscapePassKeyAddressCheckViewModel$checkAddress$1(this.this$0, continuation);
        escapePassKeyAddressCheckViewModel$checkAddress$1.L$0 = obj;
        return escapePassKeyAddressCheckViewModel$checkAddress$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyAddressCheckViewModel$checkAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x000a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.Deferred] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ?? r1;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r1 = r12;
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.KWHzl.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
            this.this$0.OLrzqt.setValue(new InterfaceC49371unL.StateListAnimator(null, 1, null));
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new EscapePassKeyAddressCheckViewModel$checkAddress$1$initializedDeferred$1(null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new EscapePassKeyAddressCheckViewModel$checkAddress$1$preCheckDeferred$1(this.this$0, null), 3, null);
            Result.Application application2 = Result.Companion;
            this.L$0 = deferredAsync$default;
            this.label = 1;
            obj = deferredAsync$default2.await(this);
            r12 = deferredAsync$default;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
                EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    AccountPreCheckResult accountPreCheckResult = (AccountPreCheckResult) obj2;
                    escapePassKeyAddressCheckViewModel.KWHzl.setValue(new InterfaceC49371unL.Activity(accountPreCheckResult));
                    this.L$0 = null;
                    this.label = 3;
                    if (escapePassKeyAddressCheckViewModel.copydefault(accountPreCheckResult, objM7386unboximpl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    escapePassKeyAddressCheckViewModel.KWHzl.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
                }
                return Unit.INSTANCE;
            }
            Deferred deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r12 = deferred;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(((Result) obj).m7386unboximpl()));
        r1 = r12;
        EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl2 != null) {
            escapePassKeyAddressCheckViewModel2.KWHzl.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl2, null, 2, null));
            return Unit.INSTANCE;
        }
        Object objM7386unboximpl2 = ((Result) objM7377constructorimpl).m7386unboximpl();
        this.L$0 = objM7386unboximpl2;
        this.label = 2;
        Object objAwait = r1.await(this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objM7386unboximpl2;
        obj = objAwait;
        Object objM7386unboximpl3 = ((Result) obj).m7386unboximpl();
        EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
