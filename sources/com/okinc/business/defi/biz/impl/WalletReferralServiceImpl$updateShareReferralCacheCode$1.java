package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.net.bean.InviterCodeResponse;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC43419rot;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.InterfaceC9780bbz;
import o.cZS;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletReferralServiceImpl$updateShareReferralCacheCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ cZS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletReferralServiceImpl$updateShareReferralCacheCode$1(cZS czs, Continuation<? super WalletReferralServiceImpl$updateShareReferralCacheCode$1> continuation) {
        super(2, continuation);
        this.this$0 = czs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletReferralServiceImpl$updateShareReferralCacheCode$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletReferralServiceImpl$updateShareReferralCacheCode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x00ec, CancellationException -> 0x0107, TryCatch #2 {CancellationException -> 0x0107, all -> 0x00ec, blocks: (B:8:0x0016, B:36:0x008c, B:38:0x0094, B:41:0x009e, B:44:0x00a5, B:46:0x00ad, B:50:0x00b5, B:51:0x00e5, B:13:0x0027, B:28:0x006b, B:30:0x0075, B:32:0x007b, B:16:0x002f, B:23:0x0052, B:25:0x0056, B:19:0x0038), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x00ec, CancellationException -> 0x0107, TryCatch #2 {CancellationException -> 0x0107, all -> 0x00ec, blocks: (B:8:0x0016, B:36:0x008c, B:38:0x0094, B:41:0x009e, B:44:0x00a5, B:46:0x00ad, B:50:0x00b5, B:51:0x00e5, B:13:0x0027, B:28:0x006b, B:30:0x0075, B:32:0x007b, B:16:0x002f, B:23:0x0052, B:25:0x0056, B:19:0x0038), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: all -> 0x00ec, CancellationException -> 0x0107, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0107, all -> 0x00ec, blocks: (B:8:0x0016, B:36:0x008c, B:38:0x0094, B:41:0x009e, B:44:0x00a5, B:46:0x00ad, B:50:0x00b5, B:51:0x00e5, B:13:0x0027, B:28:0x006b, B:30:0x0075, B:32:0x007b, B:16:0x002f, B:23:0x0052, B:25:0x0056, B:19:0x0038), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        cZS czs;
        String address;
        InterfaceC9738bbJ interfaceC9738bbJ;
        AbstractC43419rot abstractC43419rot;
        String defaultCode;
        String discountRate;
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
            cZS czs2 = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<WalletStatus> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL();
            this.L$0 = czs2;
            this.label = 1;
            Object objAwait = RxAwaitKt.await(abstractC58260yxtDjBIcL, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            czs = czs2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i == 2) {
                    czs = (cZS) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
                    InterfaceC9780bbz interfaceC9780bbzCopydefault = interfaceC9738bbJ2.copydefault(1L);
                    address = interfaceC9780bbzCopydefault != null ? interfaceC9780bbzCopydefault.getAddress() : null;
                    if (address != null) {
                        C13934dbu c13934dbu = czs.KWHzl;
                        this.L$0 = interfaceC9738bbJ2;
                        this.label = 3;
                        Object objDjBIcL = c13934dbu.djBIcL(address, this);
                        if (objDjBIcL == objCopydefault) {
                            return objCopydefault;
                        }
                        interfaceC9738bbJ = interfaceC9738bbJ2;
                        obj = objDjBIcL;
                        abstractC43419rot = (AbstractC43419rot) obj;
                        if (abstractC43419rot.EZpvd()) {
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot.EZpvd()) {
                    InviterCodeResponse inviterCodeResponse = (InviterCodeResponse) abstractC43419rot.copydefault();
                    String str = "";
                    if (inviterCodeResponse == null || (defaultCode = inviterCodeResponse.getDefaultCode()) == null) {
                        defaultCode = "";
                    }
                    InviterCodeResponse inviterCodeResponse2 = (InviterCodeResponse) abstractC43419rot.copydefault();
                    if (inviterCodeResponse2 != null && (discountRate = inviterCodeResponse2.getDiscountRate()) != null) {
                        str = discountRate;
                    }
                    SPUtils.put("SP_DEX_REFERRAL_CODE_KEY:" + interfaceC9738bbJ.DbNXlk(), defaultCode);
                    SPUtils.put("SP_DEX_REFERRAL_RATE_KEY:" + interfaceC9738bbJ.DbNXlk(), str);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("DexReferral", "updateShareReferralCacheCode: Failed", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            czs = (cZS) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (obj == WalletStatus.RealWallets) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl();
            this.L$0 = czs;
            this.label = 2;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            InterfaceC9738bbJ interfaceC9738bbJ22 = (InterfaceC9738bbJ) obj;
            InterfaceC9780bbz interfaceC9780bbzCopydefault2 = interfaceC9738bbJ22.copydefault(1L);
            if (interfaceC9780bbzCopydefault2 != null) {
            }
            if (address != null) {
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
