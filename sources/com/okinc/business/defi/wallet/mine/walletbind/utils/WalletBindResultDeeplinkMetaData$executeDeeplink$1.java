package com.okinc.business.defi.wallet.mine.walletbind.utils;

import android.content.Context;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.BindCeFiDeeplinkParams;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.ActivityC19292fyY;
import o.ActivityC19347fza;
import o.C13754dXa;
import o.C17304fAj;
import o.C19330fzJ;
import o.C19339fzS;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindResultDeeplinkMetaData$executeDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    final /* synthetic */ Object $chainIndex;
    final /* synthetic */ Intention $intention;
    final /* synthetic */ Object $intentionStr;
    final /* synthetic */ Object $nonce;
    final /* synthetic */ Object $packageName;
    final /* synthetic */ C19330fzJ $verifyBindCeFiDeeplinkUseCase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindResultDeeplinkMetaData$executeDeeplink$1(C19330fzJ c19330fzJ, Object obj, Intention intention, Object obj2, Object obj3, Object obj4, Context context, Continuation<? super WalletBindResultDeeplinkMetaData$executeDeeplink$1> continuation) {
        super(2, continuation);
        this.$verifyBindCeFiDeeplinkUseCase = c19330fzJ;
        this.$packageName = obj;
        this.$intention = intention;
        this.$nonce = obj2;
        this.$chainIndex = obj3;
        this.$intentionStr = obj4;
        this.$acContext = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindResultDeeplinkMetaData$executeDeeplink$1(this.$verifyBindCeFiDeeplinkUseCase, this.$packageName, this.$intention, this.$nonce, this.$chainIndex, this.$intentionStr, this.$acContext, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindResultDeeplinkMetaData$executeDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19330fzJ c19330fzJ = this.$verifyBindCeFiDeeplinkUseCase;
            String strValueOf = String.valueOf(this.$packageName);
            this.label = 1;
            objEZpvd = c19330fzJ.EZpvd(strValueOf, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        Object obj2 = objEZpvd;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2, this.$intention, this.$nonce, this.$packageName, this.$chainIndex, this.$intentionStr, this.$acContext, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.utils.WalletBindResultDeeplinkMetaData$executeDeeplink$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $acContext;
        final /* synthetic */ Object $chainIndex;
        final /* synthetic */ Intention $intention;
        final /* synthetic */ Object $intentionStr;
        final /* synthetic */ Object $nonce;
        final /* synthetic */ Object $packageName;
        final /* synthetic */ Object $verifyTokenResult;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Intention intention, Object obj2, Object obj3, Object obj4, Object obj5, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$verifyTokenResult = obj;
            this.$intention = intention;
            this.$nonce = obj2;
            this.$packageName = obj3;
            this.$chainIndex = obj4;
            this.$intentionStr = obj5;
            this.$acContext = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$verifyTokenResult, this.$intention, this.$nonce, this.$packageName, this.$chainIndex, this.$intentionStr, this.$acContext, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object obj2 = this.$verifyTokenResult;
                if (Result.m7383isFailureimpl(obj2)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                if (str != null) {
                    Intention intention = this.$intention;
                    Object obj3 = this.$nonce;
                    Object obj4 = this.$packageName;
                    Object obj5 = this.$chainIndex;
                    Object obj6 = this.$intentionStr;
                    Context context = this.$acContext;
                    BindCeFiDeeplinkParams bindCeFiDeeplinkParams = new BindCeFiDeeplinkParams(intention, String.valueOf(obj3), String.valueOf(obj4), String.valueOf(obj5), str);
                    if (Intrinsics.EZpvd(obj6, (Object) "wallet_management") || Intrinsics.EZpvd(obj6, (Object) "wallet_general") || Intrinsics.EZpvd(obj6, (Object) "wallet_withdraw")) {
                        ActivityC19347fza.Companion.AEQbTJ(context, C17304fAj.EZpvd.AuCTel(), bindCeFiDeeplinkParams);
                    } else if (Intrinsics.EZpvd(obj6, (Object) "exchange_management") || Intrinsics.EZpvd(obj6, (Object) "exchange_withdraw")) {
                        ActivityC19292fyY.Companion.EZpvd(context, bindCeFiDeeplinkParams);
                    }
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(this.$verifyTokenResult);
                if (thM7380exceptionOrNullimpl != null) {
                    C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.UeEOUB), 0, 1, (Object) null);
                    C19339fzS.EZpvd.OLrzqt("[Verify app]", "verify app failed:" + thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
