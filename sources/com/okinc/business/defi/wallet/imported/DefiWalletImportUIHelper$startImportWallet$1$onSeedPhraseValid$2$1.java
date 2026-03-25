package com.okinc.business.defi.wallet.imported;

import com.okinc.web3.security.model.ValidSeedPhraseResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.C13092czN;
import o.C13754dXa;
import o.C18408fho;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC14457dln;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ Function1<AbstractC12782ctV, Unit> $addWalletCallback;
    final /* synthetic */ int $mode;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ String $password;
    final /* synthetic */ ValidSeedPhraseResult $result;
    final /* synthetic */ InterfaceC14457dln $strategy;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1(ValidSeedPhraseResult validSeedPhraseResult, String str, Function1<? super String, Unit> function1, int i, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, Function1<? super AbstractC12782ctV, Unit> function12, Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1> continuation) {
        super(2, continuation);
        this.$result = validSeedPhraseResult;
        this.$password = str;
        this.$onError = function1;
        this.$mode = i;
        this.$activity = abstractActivityC33041mov;
        this.$strategy = interfaceC14457dln;
        this.$addWalletCallback = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1(this.$result, this.$password, this.$onError, this.$mode, this.$activity, this.$strategy, this.$addWalletCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ValidSeedPhraseResult validSeedPhraseResult = this.$result;
                String str = this.$password;
                Result.Application application = Result.Companion;
                C13092czN instance$default = C13092czN.Activity.getInstance$default(C13092czN.Companion, null, 1, null);
                String seedPhrase = validSeedPhraseResult.getSeedPhrase();
                this.label = 1;
                obj = instance$default.OLrzqt(seedPhrase, str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function1<String, Unit> function1 = this.$onError;
        int i2 = this.$mode;
        AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
        InterfaceC14457dln interfaceC14457dln = this.$strategy;
        String str2 = this.$password;
        ValidSeedPhraseResult validSeedPhraseResult2 = this.$result;
        Function1<AbstractC12782ctV, Unit> function12 = this.$addWalletCallback;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            if (!((Boolean) objM7377constructorimpl).booleanValue()) {
                C18408fho.EZpvd.OLrzqt(i2, abstractActivityC33041mov, interfaceC14457dln, str2, validSeedPhraseResult2.getSeedPhrase(), validSeedPhraseResult2.isTon(), function12);
            } else {
                function1.invoke(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hrNTAI));
            }
        }
        Function1<String, Unit> function13 = this.$onError;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("DefiWalletImportUIHelper", "checkSeedPhraseWalletExists", thM7380exceptionOrNullimpl);
            function13.invoke(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OHqIaq));
        }
        return Unit.INSTANCE;
    }
}
