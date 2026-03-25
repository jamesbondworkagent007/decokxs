package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.net.bean.VerifyRes;
import com.okinc.business.defi.wallet.home.AccountVerifyManager$verifyAccount$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C15519eLi;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountVerifyManager$verifyAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ AbstractC12782ctV $wallet;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C15519eLi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerifyManager$verifyAccount$1(C15519eLi c15519eLi, String str, AbstractC12782ctV abstractC12782ctV, Continuation<? super AccountVerifyManager$verifyAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = c15519eLi;
        this.$accountId = str;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountVerifyManager$verifyAccount$1 accountVerifyManager$verifyAccount$1 = new AccountVerifyManager$verifyAccount$1(this.this$0, this.$accountId, this.$wallet, continuation);
        accountVerifyManager$verifyAccount$1.L$0 = obj;
        return accountVerifyManager$verifyAccount$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountVerifyManager$verifyAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        C15519eLi c15519eLi;
        final String str;
        Object obj2;
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c15519eLi = this.this$0;
            str = this.$accountId;
            AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
            Result.Application application2 = Result.Companion;
            if (c15519eLi.OLrzqt.get(str) == null) {
                C13934dbu c13934dbu = c15519eLi.KWHzl;
                this.L$0 = c15519eLi;
                this.L$1 = str;
                this.L$2 = abstractC12782ctV2;
                this.label = 1;
                Object objValues = c13934dbu.values(str, this);
                if (objValues == objCopydefault) {
                    return objCopydefault;
                }
                abstractC12782ctV = abstractC12782ctV2;
                obj = objValues;
            } else {
                C15519eLi.KWHzl(c15519eLi, abstractC12782ctV2);
                obj2 = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("AccountVerifyManager signList error " + thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC12782ctV = (AbstractC12782ctV) this.L$2;
            str = (String) this.L$1;
            c15519eLi = (C15519eLi) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        obj2 = (AbstractC43419rot) obj;
        if (obj2 instanceof AbstractC43419rot.StateListAnimator) {
            final VerifyRes verifyRes = (VerifyRes) ((AbstractC43419rot.StateListAnimator) obj2).KWHzl();
            C32866mlf.onEvent$default("Web3Wallet_VerifyAddress_NeedVerify_View", (TrackChannel[]) null, new Function1() { // from class: o.eLg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return AccountVerifyManager$verifyAccount$1.invokeSuspend$lambda$3$lambda$1$lambda$0(str, verifyRes, (EventParamsList) obj3);
                }
            }, 1, (Object) null);
            c15519eLi.OLrzqt.put(str, C56443yFo.KWHzl(verifyRes.getNeedVerify()));
            if (verifyRes.getNeedVerify()) {
                C15519eLi.KWHzl(c15519eLi, abstractC12782ctV);
            } else {
                return Unit.INSTANCE;
            }
        }
        if (obj2 instanceof AbstractC43419rot.ActionBar) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(obj2);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1$lambda$0(String str, VerifyRes verifyRes, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "account_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "need_verify", String.valueOf(verifyRes.getNeedVerify()), false, 4, null);
        return Unit.INSTANCE;
    }
}
