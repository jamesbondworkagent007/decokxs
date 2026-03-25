package com.okinc.business.defi.wallet.mine.viewmodel;

import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.fNC;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1(DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, Continuation<? super DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletBatchCreateAccountAnimationModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.viewmodel.DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = defiWalletBatchCreateAccountAnimationModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                int i = this.this$0.iwGUEr;
                WalletType walletType = WalletType.HDWallet;
                if (i == walletType.ordinal()) {
                    fNC fnc = fNC.OLrzqt;
                    String str = this.this$0.AuCTel;
                    String str2 = this.this$0.fJNWhG;
                    Function1<AbstractC12782ctV, Unit> function1OLrzqt = this.this$0.OLrzqt();
                    if (function1OLrzqt == null) {
                        return Unit.INSTANCE;
                    }
                    fnc.copydefault(null, null, str, str2, walletType, function1OLrzqt);
                } else if (i == WalletType.MPCWallet.ordinal()) {
                    DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel = this.this$0;
                    fNC fnc2 = fNC.OLrzqt;
                    String str3 = defiWalletBatchCreateAccountAnimationModel.AuCTel;
                    String str4 = this.this$0.fJNWhG;
                    Function1<AbstractC12782ctV, Unit> function1OLrzqt2 = this.this$0.OLrzqt();
                    if (function1OLrzqt2 == null) {
                        return Unit.INSTANCE;
                    }
                    defiWalletBatchCreateAccountAnimationModel.AhwBna = fNC.createMpcSmartAccount$default(fnc2, null, null, str3, str4, 0L, false, false, false, function1OLrzqt2, 16, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
