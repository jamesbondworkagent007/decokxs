package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dexlogic.bean.PreCheckBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C19756gOd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kXM;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$requestConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super kXM>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $userUniqueId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$requestConfig$2(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, String str2, String str3, Continuation<? super MemeModeTransactionViewModel$requestConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$chainId = str;
        this.$accountId = str2;
        this.$userUniqueId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeModeTransactionViewModel$requestConfig$2 memeModeTransactionViewModel$requestConfig$2 = new MemeModeTransactionViewModel$requestConfig$2(this.this$0, this.$chainId, this.$accountId, this.$userUniqueId, continuation);
        memeModeTransactionViewModel$requestConfig$2.L$0 = obj;
        return memeModeTransactionViewModel$requestConfig$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super kXM> continuation) {
        return ((MemeModeTransactionViewModel$requestConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Object objKWHzl;
        CoroutineScope coroutineScope;
        Deferred deferred;
        Deferred deferred2;
        Object objAwait;
        Deferred deferred3;
        Deferred deferred4;
        Deferred deferred5;
        Object objAwait2;
        Deferred deferred6;
        Object obj2;
        Deferred deferred7;
        Object objAwait3;
        Object obj3;
        Object obj4;
        Deferred deferred8;
        Object objAwait4;
        Object obj5;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new MemeModeTransactionViewModel$requestConfig$2$currencyDeferred$1(this.this$0, this.$chainId, this.$accountId, this.$userUniqueId, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new MemeModeTransactionViewModel$requestConfig$2$sellConfigDeferred$1(this.this$0, null), 3, null);
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new MemeModeTransactionViewModel$requestConfig$2$chainListDeferred$1(this.this$0, null), 3, null);
            C19756gOd c19756gOd = this.this$0.gHZMYf;
            String str = this.$chainId;
            String strCopydefault = this.this$0.QfsBiF.copydefault(this.$chainId);
            this.L$0 = coroutineScope2;
            this.L$1 = deferredAsync$default2;
            this.L$2 = deferredAsync$default;
            this.L$3 = deferredAsync$default3;
            this.label = 1;
            objKWHzl = c19756gOd.KWHzl(str, strCopydefault, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
            deferred = deferredAsync$default3;
            deferred2 = deferredAsync$default2;
        } else if (i == 1) {
            deferred = (Deferred) this.L$3;
            Deferred deferred9 = (Deferred) this.L$2;
            deferred2 = (Deferred) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            deferredAsync$default = deferred9;
        } else if (i == 2) {
            deferred4 = (Deferred) this.L$2;
            Deferred deferred10 = (Deferred) this.L$1;
            deferred5 = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferred3 = deferred10;
            objAwait = obj;
            Object objM7386unboximpl = ((Result) objAwait).m7386unboximpl();
            this.L$0 = deferred3;
            this.L$1 = deferred4;
            this.L$2 = objM7386unboximpl;
            this.label = 3;
            objAwait2 = deferred5.await(this);
            if (objAwait2 != objCopydefault) {
                return objCopydefault;
            }
            Deferred deferred11 = deferred3;
            deferred6 = deferred4;
            obj2 = objM7386unboximpl;
            deferred7 = deferred11;
            Object objM7386unboximpl2 = ((Result) objAwait2).m7386unboximpl();
            this.L$0 = deferred6;
            this.L$1 = obj2;
            this.L$2 = objM7386unboximpl2;
            this.label = 4;
            objAwait3 = deferred7.await(this);
            if (objAwait3 != objCopydefault) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj5 = this.L$2;
                    obj4 = this.L$1;
                    obj3 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAwait4 = obj;
                    return new kXM(obj3, obj4, obj5, ((Result) objAwait4).m7386unboximpl());
                }
                obj4 = this.L$2;
                Object obj6 = this.L$1;
                deferred8 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj3 = obj6;
                objAwait3 = obj;
                Object objM7386unboximpl3 = ((Result) objAwait3).m7386unboximpl();
                this.L$0 = obj3;
                this.L$1 = obj4;
                this.L$2 = objM7386unboximpl3;
                this.label = 5;
                objAwait4 = deferred8.await(this);
                if (objAwait4 != objCopydefault) {
                    return objCopydefault;
                }
                obj5 = objM7386unboximpl3;
                return new kXM(obj3, obj4, obj5, ((Result) objAwait4).m7386unboximpl());
            }
            obj2 = this.L$2;
            Deferred deferred12 = (Deferred) this.L$1;
            deferred7 = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferred6 = deferred12;
            objAwait2 = obj;
            Object objM7386unboximpl22 = ((Result) objAwait2).m7386unboximpl();
            this.L$0 = deferred6;
            this.L$1 = obj2;
            this.L$2 = objM7386unboximpl22;
            this.label = 4;
            objAwait3 = deferred7.await(this);
            if (objAwait3 != objCopydefault) {
                return objCopydefault;
            }
            Deferred deferred13 = deferred6;
            obj3 = obj2;
            obj4 = objM7386unboximpl22;
            deferred8 = deferred13;
            Object objM7386unboximpl32 = ((Result) objAwait3).m7386unboximpl();
            this.L$0 = obj3;
            this.L$1 = obj4;
            this.L$2 = objM7386unboximpl32;
            this.label = 5;
            objAwait4 = deferred8.await(this);
            if (objAwait4 != objCopydefault) {
            }
        }
        MemeModeTransactionViewModel memeModeTransactionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            memeModeTransactionViewModel.copydefault.setValue(C56443yFo.KWHzl(true ^ ((PreCheckBean) objKWHzl).isSupportQuote()));
        }
        Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemeModeTransactionViewModel$requestConfig$2$presetConfigDeferred$1(this.this$0, this.$chainId, null), 3, null);
        this.L$0 = deferredAsync$default;
        this.L$1 = deferred;
        this.L$2 = deferredAsync$default4;
        this.L$3 = null;
        this.label = 2;
        objAwait = deferred2.await(this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        Deferred deferred14 = deferredAsync$default;
        deferred3 = deferred;
        deferred4 = deferredAsync$default4;
        deferred5 = deferred14;
        Object objM7386unboximpl4 = ((Result) objAwait).m7386unboximpl();
        this.L$0 = deferred3;
        this.L$1 = deferred4;
        this.L$2 = objM7386unboximpl4;
        this.label = 3;
        objAwait2 = deferred5.await(this);
        if (objAwait2 != objCopydefault) {
        }
    }
}
