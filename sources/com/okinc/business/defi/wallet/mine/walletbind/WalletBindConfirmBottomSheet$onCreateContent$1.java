package com.okinc.business.defi.wallet.mine.walletbind;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.C19339fzS;
import o.C19356fzj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletBindConfirmBottomSheet$onCreateContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19356fzj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindConfirmBottomSheet$onCreateContent$1(C19356fzj c19356fzj, Continuation<? super WalletBindConfirmBottomSheet$onCreateContent$1> continuation) {
        super(2, continuation);
        this.this$0 = c19356fzj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindConfirmBottomSheet$onCreateContent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindConfirmBottomSheet$onCreateContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WalletBindConfirmBottomSheet$onCreateContent$1$wallet$1 walletBindConfirmBottomSheet$onCreateContent$1$wallet$1 = new WalletBindConfirmBottomSheet$onCreateContent$1$wallet$1(null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, walletBindConfirmBottomSheet$onCreateContent$1$wallet$1, this);
            if (obj == objCopydefault) {
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
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        if (abstractC12782ctV == null) {
            C19339fzS.EZpvd.OLrzqt("[Bind Wallet]", "get main wallet null");
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, abstractC12782ctV, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$onCreateContent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractC12782ctV $wallet;
        int label;
        final /* synthetic */ C19356fzj this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19356fzj c19356fzj, AbstractC12782ctV abstractC12782ctV, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19356fzj;
            this.$wallet = abstractC12782ctV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$wallet, continuation);
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
                C19356fzj c19356fzj = this.this$0;
                String strDbNXlk = this.$wallet.DbNXlk();
                String strAYXKKw = this.$wallet.AYXKKw();
                String strAkhnZx = this.$wallet.AkhnZx();
                AbstractC12784ctX abstractC12784ctXGwTjWJ = this.$wallet.gwTjWJ();
                String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
                if (strAuCTel == null) {
                    strAuCTel = "";
                }
                c19356fzj.values = new WalletInfo(strDbNXlk, strAYXKKw, strAkhnZx, strAuCTel, WalletType.Companion.OLrzqt(this.$wallet), "", this.$wallet.AEQbTJ(), this.$wallet);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
