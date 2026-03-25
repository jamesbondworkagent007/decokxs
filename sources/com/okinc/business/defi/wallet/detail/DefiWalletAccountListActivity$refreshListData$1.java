package com.okinc.business.defi.wallet.detail;

import android.app.Activity;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C15274eCg;
import o.C17922fXg;
import o.C33064mpR;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.eAL;
import o.eBX;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletAccountListActivity$refreshListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ eAL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletAccountListActivity$refreshListData$1(eAL eal, Continuation<? super DefiWalletAccountListActivity$refreshListData$1> continuation) {
        super(2, continuation);
        this.this$0 = eal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletAccountListActivity$refreshListData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletAccountListActivity$refreshListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x011d, CancellationException -> 0x0152, TryCatch #2 {CancellationException -> 0x0152, all -> 0x011d, blocks: (B:7:0x001a, B:29:0x00a7, B:32:0x00ae, B:33:0x00b8, B:35:0x00be, B:37:0x00e2, B:40:0x00f0, B:39:0x00ee, B:41:0x0104, B:12:0x0033, B:21:0x006c, B:22:0x0085, B:24:0x008b, B:25:0x0099, B:15:0x003e, B:17:0x004d, B:18:0x0053), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        eAL eal;
        Object objAwait;
        Object objKWHzl;
        AbstractC12784ctX abstractC12784ctX;
        EIP7702WalletStatus eIP7702WalletStatus;
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
            eal = this.this$0;
            Result.Application application2 = Result.Companion;
            eal.copydefault.clear();
            if (eal.AhwBna) {
                eal.AhwBna = false;
                eal.showLoadingAtOnceCannotCancel();
            }
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(eal.OLrzqt());
            this.L$0 = eal;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtDjBIcL, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12784ctX = (AbstractC12784ctX) this.L$1;
                eal = (eAL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objKWHzl)) {
                    objKWHzl = null;
                }
                Map map = (Map) objKWHzl;
                for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
                    ArrayList arrayList = eal.copydefault;
                    String strDbNXlk = abstractC12782ctV.DbNXlk();
                    String strAEQbTJ = abstractC12782ctV.AEQbTJ();
                    boolean fieldNames = abstractC12782ctV.getFieldNames();
                    String strAkhnZx = abstractC12782ctV.AkhnZx();
                    String strOLrzqt = abstractC12782ctV.OLrzqt("opened");
                    if (map == null || (eIP7702WalletStatus = (EIP7702WalletStatus) map.get(abstractC12782ctV.DbNXlk())) == null) {
                        eIP7702WalletStatus = EIP7702WalletStatus.Unknown;
                    }
                    arrayList.add(new eBX.LoaderManager(strDbNXlk, strAEQbTJ, fieldNames ? 1 : 0, strAkhnZx, strOLrzqt, eIP7702WalletStatus, C17922fXg.OLrzqt(abstractC12782ctV)));
                }
                eal.dismissLoading();
                C33064mpR.OLrzqt(eal.copydefault(), (List<? extends Object>) eal.copydefault);
                rVN.reportFullyDrawn$default((Activity) eal, true, (String) null, 2, (Object) null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                eAL eal2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault(eal2.getTAG(), "refreshListData error message :" + thM7380exceptionOrNullimpl.getMessage());
                    eal2.finish();
                }
                return Unit.INSTANCE;
            }
            eal = (eAL) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) objAwait;
        C15274eCg c15274eCg = eal.OLrzqt;
        List<AbstractC12782ctV> listKWHzl = abstractC12784ctX2.KWHzl();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC12782ctV) it.next()).DbNXlk());
        }
        this.L$0 = eal;
        this.L$1 = abstractC12784ctX2;
        this.label = 2;
        objKWHzl = c15274eCg.KWHzl(arrayList2, false, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        abstractC12784ctX = abstractC12784ctX2;
        if (Result.m7383isFailureimpl(objKWHzl)) {
        }
        Map map2 = (Map) objKWHzl;
        while (r0.hasNext()) {
        }
        eal.dismissLoading();
        C33064mpR.OLrzqt(eal.copydefault(), (List<? extends Object>) eal.copydefault);
        rVN.reportFullyDrawn$default((Activity) eal, true, (String) null, 2, (Object) null);
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        eAL eal22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
