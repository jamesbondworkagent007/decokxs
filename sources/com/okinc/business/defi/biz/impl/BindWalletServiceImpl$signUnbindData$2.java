package com.okinc.business.defi.biz.impl;

import androidx.fragment.app.FragmentManager;
import com.okinc.wallet.api.bean.SignStatus;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C54834xXa;
import o.C54837xXd;
import o.C56391yDq;
import o.C56442yFn;
import o.cUH;
import o.pUU;
import o.xYW;

/* JADX INFO: loaded from: classes4.dex */
public final class BindWalletServiceImpl$signUnbindData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C54837xXd>>, Object> {
    final /* synthetic */ C54834xXa $data;
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ cUH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindWalletServiceImpl$signUnbindData$2(cUH cuh, C54834xXa c54834xXa, FragmentManager fragmentManager, Continuation<? super BindWalletServiceImpl$signUnbindData$2> continuation) {
        super(2, continuation);
        this.this$0 = cuh;
        this.$data = c54834xXa;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BindWalletServiceImpl$signUnbindData$2(this.this$0, this.$data, this.$fragmentManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C54837xXd>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C54837xXd>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C54837xXd>> continuation) {
        return ((BindWalletServiceImpl$signUnbindData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb A[Catch: all -> 0x0195, CancellationException -> 0x01a5, TryCatch #2 {CancellationException -> 0x01a5, all -> 0x0195, blocks: (B:8:0x0024, B:46:0x00ed, B:53:0x012e, B:13:0x0041, B:40:0x00c1, B:42:0x00cb, B:47:0x010f, B:16:0x0057, B:23:0x0083, B:26:0x008b, B:30:0x0094, B:32:0x0098, B:34:0x009e, B:36:0x00a2, B:48:0x0116, B:50:0x011c, B:51:0x0126, B:19:0x006c), top: B:61:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f A[Catch: all -> 0x0195, CancellationException -> 0x01a5, TryCatch #2 {CancellationException -> 0x01a5, all -> 0x0195, blocks: (B:8:0x0024, B:46:0x00ed, B:53:0x012e, B:13:0x0041, B:40:0x00c1, B:42:0x00cb, B:47:0x010f, B:16:0x0057, B:23:0x0083, B:26:0x008b, B:30:0x0094, B:32:0x0098, B:34:0x009e, B:36:0x00a2, B:48:0x0116, B:50:0x011c, B:51:0x0126, B:19:0x006c), top: B:61:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        cUH cuh;
        C54834xXa c54834xXa;
        FragmentManager fragmentManager;
        Object objM7386unboximpl;
        String str;
        SignStatus status;
        AbstractC12782ctV wallet;
        Object objAwaitFirst;
        cUH cuh2;
        SignStatus signStatus;
        C54834xXa c54834xXa2;
        Integer numEZpvd;
        Long l;
        String strOLrzqt;
        Triple triple;
        Triple triple2;
        AbstractC12782ctV abstractC12782ctV;
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
            cuh = this.this$0;
            C54834xXa c54834xXa3 = this.$data;
            FragmentManager fragmentManager2 = this.$fragmentManager;
            Result.Application application2 = Result.Companion;
            this.L$0 = cuh;
            this.L$1 = c54834xXa3;
            this.L$2 = fragmentManager2;
            this.label = 1;
            Object objKWHzl = cuh.KWHzl(c54834xXa3, (Continuation<? super Result<PreCheckResult>>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c54834xXa = c54834xXa3;
            fragmentManager = fragmentManager2;
            objM7386unboximpl = objKWHzl;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    triple2 = (Triple) this.L$3;
                    abstractC12782ctV = (AbstractC12782ctV) this.L$2;
                    c54834xXa2 = (C54834xXa) this.L$1;
                    cuh2 = (cUH) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C54837xXd c54837xXdCopydefault = cuh2.copydefault(abstractC12782ctV, (String) triple2.getSecond(), c54834xXa2.EZpvd());
                    SignStatus signStatusKWHzl = c54837xXdCopydefault.KWHzl();
                    Long lAEQbTJ = c54837xXdCopydefault.AEQbTJ();
                    numEZpvd = c54837xXdCopydefault.EZpvd();
                    strOLrzqt = c54837xXdCopydefault.OLrzqt();
                    signStatus = signStatusKWHzl;
                    l = lAEQbTJ;
                    String strCopydefault = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + numEZpvd + " msg=" + c54834xXa2.EZpvd() + " accountId=" + c54834xXa2.KWHzl());
                    StringBuilder sb = new StringBuilder();
                    sb.append("signUnBindData ");
                    sb.append(strCopydefault);
                    pUU.KWHzl("BindWalletServiceImpl", sb.toString());
                    objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, null, l, numEZpvd, 4, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) this.L$3;
                String str2 = (String) this.L$2;
                c54834xXa = (C54834xXa) this.L$1;
                cUH cuh3 = (cUH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                wallet = abstractC12782ctV2;
                str = str2;
                cuh2 = cuh3;
                objAwaitFirst = obj;
                triple = (Triple) objAwaitFirst;
                if (triple.getFirst() != SignStatus.Success) {
                    AbstractC58185ywX abstractC58185ywXOLrzqt = cuh2.OLrzqt((String) triple.getThird(), c54834xXa.KWHzl());
                    this.L$0 = cuh2;
                    this.L$1 = c54834xXa;
                    this.L$2 = wallet;
                    this.L$3 = triple;
                    this.label = 3;
                    if (AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    triple2 = triple;
                    c54834xXa2 = c54834xXa;
                    abstractC12782ctV = wallet;
                    C54837xXd c54837xXdCopydefault2 = cuh2.copydefault(abstractC12782ctV, (String) triple2.getSecond(), c54834xXa2.EZpvd());
                    SignStatus signStatusKWHzl2 = c54837xXdCopydefault2.KWHzl();
                    Long lAEQbTJ2 = c54837xXdCopydefault2.AEQbTJ();
                    numEZpvd = c54837xXdCopydefault2.EZpvd();
                    strOLrzqt = c54837xXdCopydefault2.OLrzqt();
                    signStatus = signStatusKWHzl2;
                    l = lAEQbTJ2;
                    String strCopydefault2 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + numEZpvd + " msg=" + c54834xXa2.EZpvd() + " accountId=" + c54834xXa2.KWHzl());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("signUnBindData ");
                    sb2.append(strCopydefault2);
                    pUU.KWHzl("BindWalletServiceImpl", sb2.toString());
                    objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, null, l, numEZpvd, 4, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                status = (SignStatus) triple.getFirst();
                signStatus = status;
                c54834xXa2 = c54834xXa;
                numEZpvd = null;
                l = null;
                strOLrzqt = str;
                String strCopydefault22 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + numEZpvd + " msg=" + c54834xXa2.EZpvd() + " accountId=" + c54834xXa2.KWHzl());
                StringBuilder sb22 = new StringBuilder();
                sb22.append("signUnBindData ");
                sb22.append(strCopydefault22);
                pUU.KWHzl("BindWalletServiceImpl", sb22.toString());
                objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, null, l, numEZpvd, 4, null));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            fragmentManager = (FragmentManager) this.L$2;
            c54834xXa = (C54834xXa) this.L$1;
            cuh = (cUH) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        str = "";
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            PreCheckResult preCheckResult = (PreCheckResult) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
            if ((preCheckResult != null ? preCheckResult.getStatus() : null) == SignStatus.Success) {
                C56391yDq.AEQbTJ(objM7386unboximpl);
                wallet = ((PreCheckResult) objM7386unboximpl).getWallet();
                AbstractC58185ywX abstractC58185ywXCopydefault = cuh.copydefault(fragmentManager, wallet);
                this.L$0 = cuh;
                this.L$1 = c54834xXa;
                this.L$2 = "";
                this.L$3 = wallet;
                this.label = 2;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXCopydefault, this);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
                cuh2 = cuh;
                triple = (Triple) objAwaitFirst;
                if (triple.getFirst() != SignStatus.Success) {
                }
            }
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            C56391yDq.AEQbTJ(objM7386unboximpl);
            status = ((PreCheckResult) objM7386unboximpl).getStatus();
        } else {
            status = SignStatus.AccountNotExist;
        }
        signStatus = status;
        c54834xXa2 = c54834xXa;
        numEZpvd = null;
        l = null;
        strOLrzqt = str;
        String strCopydefault222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + numEZpvd + " msg=" + c54834xXa2.EZpvd() + " accountId=" + c54834xXa2.KWHzl());
        StringBuilder sb222 = new StringBuilder();
        sb222.append("signUnBindData ");
        sb222.append(strCopydefault222);
        pUU.KWHzl("BindWalletServiceImpl", sb222.toString());
        objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, null, l, numEZpvd, 4, null));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
