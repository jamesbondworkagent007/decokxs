package o;

import com.okinc.market.biz.data.datasource.BizDataSource$getAllInstrument$1;
import com.okinc.market.biz.data.datasource.BizDataSource$initData$1;
import com.okinc.market.biz.data.datasource.BizDataSource$initData$2;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import o.InterfaceC38386pWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC38387pWx implements InterfaceC38386pWw {
    public Job AEQbTJ;
    public java.util.List<? extends BizInstrument> copydefault = yDY.AhwBna();

    public abstract java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38386pWw
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38386pWw
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation) {
        return KWHzl(this, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(AbstractC38387pWx abstractC38387pWx, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BizDataSource$initData$1 bizDataSource$initData$1;
        Job job;
        if (continuation instanceof BizDataSource$initData$1) {
            bizDataSource$initData$1 = (BizDataSource$initData$1) continuation;
            int i = bizDataSource$initData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bizDataSource$initData$1.label = i - Integer.MIN_VALUE;
            } else {
                bizDataSource$initData$1 = new BizDataSource$initData$1(abstractC38387pWx, continuation);
            }
        }
        java.lang.Object objCoroutineScope = bizDataSource$initData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bizDataSource$initData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            if (z) {
                Job job2 = abstractC38387pWx.AEQbTJ;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                }
                abstractC38387pWx.AEQbTJ = null;
            }
            Job job3 = abstractC38387pWx.AEQbTJ;
            if (job3 != null && job3.isActive() && (job = abstractC38387pWx.AEQbTJ) != null) {
                bizDataSource$initData$1.L$0 = abstractC38387pWx;
                bizDataSource$initData$1.label = 1;
                if (job.join(bizDataSource$initData$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC38387pWx = (AbstractC38387pWx) bizDataSource$initData$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                abstractC38387pWx.AEQbTJ = (Job) objCoroutineScope;
                return Unit.INSTANCE;
            }
            abstractC38387pWx = (AbstractC38387pWx) bizDataSource$initData$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        if (abstractC38387pWx.AEQbTJ == null) {
            bizDataSource$initData$1.getContext();
            BizDataSource$initData$2 bizDataSource$initData$2 = new BizDataSource$initData$2(abstractC38387pWx, null);
            bizDataSource$initData$1.L$0 = abstractC38387pWx;
            bizDataSource$initData$1.label = 2;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(bizDataSource$initData$2, bizDataSource$initData$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            abstractC38387pWx.AEQbTJ = (Job) objCoroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(AbstractC38387pWx abstractC38387pWx, Continuation<? super java.util.List<? extends BizInstrument>> continuation) throws java.lang.Throwable {
        BizDataSource$getAllInstrument$1 bizDataSource$getAllInstrument$1;
        if (continuation instanceof BizDataSource$getAllInstrument$1) {
            bizDataSource$getAllInstrument$1 = (BizDataSource$getAllInstrument$1) continuation;
            int i = bizDataSource$getAllInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bizDataSource$getAllInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                bizDataSource$getAllInstrument$1 = new BizDataSource$getAllInstrument$1(abstractC38387pWx, continuation);
            }
        }
        java.lang.Object obj = bizDataSource$getAllInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bizDataSource$getAllInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            bizDataSource$getAllInstrument$1.L$0 = abstractC38387pWx;
            bizDataSource$getAllInstrument$1.label = 1;
            if (InterfaceC38386pWw.StateListAnimator.initData$default(abstractC38387pWx, false, bizDataSource$getAllInstrument$1, 1, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC38387pWx = (AbstractC38387pWx) bizDataSource$getAllInstrument$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return abstractC38387pWx.copydefault;
    }
}
