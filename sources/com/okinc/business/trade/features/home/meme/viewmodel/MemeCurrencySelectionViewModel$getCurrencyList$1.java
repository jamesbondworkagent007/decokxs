package com.okinc.business.trade.features.home.meme.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.kVP;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeCurrencySelectionViewModel$getCurrencyList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ kVP $currencySupportUseCase;
    final /* synthetic */ String $currentTokenAddress;
    final /* synthetic */ String $tradeType;
    final /* synthetic */ String $transactionTokenAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MemeCurrencySelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeCurrencySelectionViewModel$getCurrencyList$1(kVP kvp, String str, String str2, MemeCurrencySelectionViewModel memeCurrencySelectionViewModel, String str3, String str4, Continuation<? super MemeCurrencySelectionViewModel$getCurrencyList$1> continuation) {
        super(2, continuation);
        this.$currencySupportUseCase = kvp;
        this.$chainId = str;
        this.$tradeType = str2;
        this.this$0 = memeCurrencySelectionViewModel;
        this.$transactionTokenAddress = str3;
        this.$currentTokenAddress = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeCurrencySelectionViewModel$getCurrencyList$1(this.$currencySupportUseCase, this.$chainId, this.$tradeType, this.this$0, this.$transactionTokenAddress, this.$currentTokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeCurrencySelectionViewModel$getCurrencyList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        kVP kvp;
        String str;
        String str2;
        String str3;
        kVP kvp2;
        String str4;
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kVP kvp3 = this.$currencySupportUseCase;
            String str5 = this.$chainId;
            String str6 = this.$tradeType;
            kKG kkg = this.this$0.OLrzqt;
            this.L$0 = kvp3;
            this.L$1 = str5;
            this.L$2 = str6;
            this.label = 1;
            Object objAEQbTJ = kkg.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault2) {
                return objCopydefault2;
            }
            kvp = kvp3;
            obj = objAEQbTJ;
            str = str5;
            str2 = str6;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("MemeCurrencySelectionViewModel", "getCurrencyList error", thM7380exceptionOrNullimpl);
                    }
                    this.this$0.KWHzl.setValue(this.this$0.EZpvd(this.$currencySupportUseCase.EZpvd(this.$chainId, this.$transactionTokenAddress), this.$currentTokenAddress));
                    return Unit.INSTANCE;
                }
                String str7 = (String) this.L$3;
                String str8 = (String) this.L$2;
                str = (String) this.L$1;
                kVP kvp4 = (kVP) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str7;
                str4 = str8;
                kvp2 = kvp4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                objCopydefault = kvp2.copydefault(str, str4, str3, (String) obj, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                }
                this.this$0.KWHzl.setValue(this.this$0.EZpvd(this.$currencySupportUseCase.EZpvd(this.$chainId, this.$transactionTokenAddress), this.$currentTokenAddress));
                return Unit.INSTANCE;
            }
            str2 = (String) this.L$2;
            str = (String) this.L$1;
            kvp = (kVP) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str9 = (String) obj;
        kKG kkg2 = this.this$0.OLrzqt;
        this.L$0 = kvp;
        this.L$1 = str;
        this.L$2 = str2;
        this.L$3 = str9;
        this.label = 2;
        Object objCopydefault3 = kkg2.copydefault(this);
        if (objCopydefault3 == objCopydefault2) {
            return objCopydefault2;
        }
        str3 = str9;
        obj = objCopydefault3;
        kvp2 = kvp;
        str4 = str2;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
        objCopydefault = kvp2.copydefault(str, str4, str3, (String) obj, this);
        if (objCopydefault == objCopydefault2) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        this.this$0.KWHzl.setValue(this.this$0.EZpvd(this.$currencySupportUseCase.EZpvd(this.$chainId, this.$transactionTokenAddress), this.$currentTokenAddress));
        return Unit.INSTANCE;
    }
}
