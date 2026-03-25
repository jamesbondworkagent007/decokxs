package com.okinc.business.defi.wallet.debug;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import com.okinc.business.defi.common.utils.ReferralManager;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1(Continuation<? super WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x00a3, CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, all -> 0x00a3, blocks: (B:8:0x0016, B:29:0x007e, B:30:0x0088, B:13:0x0026, B:23:0x005d, B:25:0x0069, B:14:0x002b, B:20:0x0047, B:17:0x0032), top: B:41:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC12782ctV abstractC12782ctV;
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues;
        AbstractC12782ctV abstractC12782ctV2;
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
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(true);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC12782ctV2 = (AbstractC12782ctV) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C56443yFo.KWHzl(((Boolean) obj).booleanValue());
                    abstractC12782ctV = abstractC12782ctV2;
                    ReferralManager.StateListAnimator stateListAnimator = ReferralManager.Companion;
                    ReferralManager.StateListAnimator.getInstance$default(stateListAnimator, null, 1, null).AuCTel();
                    ReferralManager.StateListAnimator.getInstance$default(stateListAnimator, null, 1, null).AkhnZx(abstractC12782ctV.DbNXlk());
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        C55328xhq.show$default(C55328xhq.OLrzqt, "Take effect after restart!", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV = abstractC12782ctV3;
                ReferralManager.StateListAnimator stateListAnimator2 = ReferralManager.Companion;
                deviceRefCodeCacheBeanValues = ReferralManager.StateListAnimator.getInstance$default(stateListAnimator2, null, 1, null).values();
                if (deviceRefCodeCacheBeanValues != null) {
                    ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(stateListAnimator2, null, 1, null);
                    String code = deviceRefCodeCacheBeanValues.getCode();
                    this.L$0 = abstractC12782ctV;
                    this.label = 3;
                    Object objAYXKKw = instance$default.AYXKKw(code, this);
                    if (objAYXKKw == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC12782ctV2 = abstractC12782ctV;
                    obj = objAYXKKw;
                    C56443yFo.KWHzl(((Boolean) obj).booleanValue());
                    abstractC12782ctV = abstractC12782ctV2;
                }
                ReferralManager.StateListAnimator stateListAnimator3 = ReferralManager.Companion;
                ReferralManager.StateListAnimator.getInstance$default(stateListAnimator3, null, 1, null).AuCTel();
                ReferralManager.StateListAnimator.getInstance$default(stateListAnimator3, null, 1, null).AkhnZx(abstractC12782ctV.DbNXlk());
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC12782ctV = (AbstractC12782ctV) obj;
        ReferralManager instance$default2 = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
        Intrinsics.copydefault(abstractC12782ctV);
        this.L$0 = abstractC12782ctV;
        this.label = 2;
        if (instance$default2.KWHzl(abstractC12782ctV, this) == objCopydefault) {
            return objCopydefault;
        }
        ReferralManager.StateListAnimator stateListAnimator22 = ReferralManager.Companion;
        deviceRefCodeCacheBeanValues = ReferralManager.StateListAnimator.getInstance$default(stateListAnimator22, null, 1, null).values();
        if (deviceRefCodeCacheBeanValues != null) {
        }
        ReferralManager.StateListAnimator stateListAnimator32 = ReferralManager.Companion;
        ReferralManager.StateListAnimator.getInstance$default(stateListAnimator32, null, 1, null).AuCTel();
        ReferralManager.StateListAnimator.getInstance$default(stateListAnimator32, null, 1, null).AkhnZx(abstractC12782ctV.DbNXlk());
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        return Unit.INSTANCE;
    }
}
