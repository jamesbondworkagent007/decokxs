package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.net.bean.VerifyRes;
import com.okinc.business.defi.wallet.home.AccountVerifyManager$checkAndVerifyAccount$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C12827cuN;
import o.C13934dbu;
import o.C15519eLi;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountVerifyManager$checkAndVerifyAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C15519eLi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerifyManager$checkAndVerifyAccount$1(AbstractC12782ctV abstractC12782ctV, C15519eLi c15519eLi, String str, Continuation<? super AccountVerifyManager$checkAndVerifyAccount$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = c15519eLi;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountVerifyManager$checkAndVerifyAccount$1 accountVerifyManager$checkAndVerifyAccount$1 = new AccountVerifyManager$checkAndVerifyAccount$1(this.$wallet, this.this$0, this.$password, continuation);
        accountVerifyManager$checkAndVerifyAccount$1.L$0 = obj;
        return accountVerifyManager$checkAndVerifyAccount$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountVerifyManager$checkAndVerifyAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        C15519eLi c15519eLi;
        String str;
        AbstractC12782ctV abstractC12782ctV;
        Object obj2;
        final String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
            c15519eLi = this.this$0;
            str = this.$password;
            Result.Application application2 = Result.Companion;
            if (abstractC12782ctV2 == null) {
                abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            }
            abstractC12782ctV = abstractC12782ctV2;
            if (abstractC12782ctV != null && (abstractC12782ctV.AubY() || abstractC12782ctV.QVAiDq() || abstractC12782ctV.AwvSrB())) {
                String strDbNXlk = abstractC12782ctV.DbNXlk();
                if (!Intrinsics.EZpvd(c15519eLi.OLrzqt.get(strDbNXlk), C56443yFo.KWHzl(false))) {
                    if (c15519eLi.OLrzqt.get(strDbNXlk) == null) {
                        C13934dbu c13934dbu = c15519eLi.KWHzl;
                        this.L$0 = c15519eLi;
                        this.L$1 = str;
                        this.L$2 = abstractC12782ctV;
                        this.L$3 = strDbNXlk;
                        this.label = 1;
                        Object objValues = c13934dbu.values(strDbNXlk, this);
                        if (objValues == objCopydefault) {
                            return objCopydefault;
                        }
                        str2 = strDbNXlk;
                        obj = objValues;
                    } else {
                        c15519eLi.copydefault(abstractC12782ctV, str);
                        obj2 = Unit.INSTANCE;
                        objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.copydefault("AccountVerifyManager checkAndVerifyAccount error " + thM7380exceptionOrNullimpl);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) this.L$3;
        abstractC12782ctV = (AbstractC12782ctV) this.L$2;
        str = (String) this.L$1;
        c15519eLi = (C15519eLi) this.L$0;
        C56391yDq.AEQbTJ(obj);
        obj2 = (AbstractC43419rot) obj;
        if (obj2 instanceof AbstractC43419rot.StateListAnimator) {
            final VerifyRes verifyRes = (VerifyRes) ((AbstractC43419rot.StateListAnimator) obj2).KWHzl();
            C32866mlf.onEvent$default("Web3Wallet_VerifyAddress_NeedVerify_View", (TrackChannel[]) null, new Function1() { // from class: o.eLj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return AccountVerifyManager$checkAndVerifyAccount$1.invokeSuspend$lambda$3$lambda$1$lambda$0(str2, verifyRes, (EventParamsList) obj3);
                }
            }, 1, (Object) null);
            c15519eLi.OLrzqt.put(str2, C56443yFo.KWHzl(verifyRes.getNeedVerify()));
            c15519eLi.copydefault(abstractC12782ctV, str);
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
