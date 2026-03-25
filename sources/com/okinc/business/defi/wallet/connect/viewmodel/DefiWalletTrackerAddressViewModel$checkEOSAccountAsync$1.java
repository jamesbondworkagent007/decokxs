package com.okinc.business.defi.wallet.connect.viewmodel;

import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.AbstractC58260yxt;
import o.C13934dbu;
import o.C16103edc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EosAccountResp>, Object> {
    final /* synthetic */ String $account;
    int label;
    final /* synthetic */ C16103edc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1(C16103edc c16103edc, String str, Continuation<? super DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = c16103edc;
        this.$account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1(this.this$0, this.$account, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EosAccountResp> continuation) {
        return ((DefiWalletTrackerAddressViewModel$checkEOSAccountAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16103edc c16103edc = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c16103edc.AYXKKw.copydefault(false);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    return (EosAccountResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        if (abstractC12782ctV == null) {
            return null;
        }
        C13934dbu c13934dbu = this.this$0.gEmmrt;
        String strUSBtdM = abstractC12782ctV.USBtdM();
        String strAUsmxb = abstractC12782ctV.aUsmxb();
        String strDbNXlk = abstractC12782ctV.DbNXlk();
        String str = this.$account;
        this.label = 2;
        obj = c13934dbu.AEQbTJ(strUSBtdM, strAUsmxb, strDbNXlk, str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
        }
    }
}
