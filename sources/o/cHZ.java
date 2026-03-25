package o;

import com.okinc.business.defi.biz.database.extra.dao.SupportPnlChainDao$updatePnlChainList$1;
import com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cHZ {
    java.lang.Object KWHzl(@NotNull java.util.List<SupportPnlChainEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<SupportPnlChainEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<SupportPnlChainEntity>> continuation);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object EZpvd(@NotNull cHZ chz, @NotNull java.util.List<SupportPnlChainEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) throws java.lang.Throwable {
            SupportPnlChainDao$updatePnlChainList$1 supportPnlChainDao$updatePnlChainList$1;
            if (continuation instanceof SupportPnlChainDao$updatePnlChainList$1) {
                supportPnlChainDao$updatePnlChainList$1 = (SupportPnlChainDao$updatePnlChainList$1) continuation;
                int i = supportPnlChainDao$updatePnlChainList$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    supportPnlChainDao$updatePnlChainList$1.label = i - Integer.MIN_VALUE;
                } else {
                    supportPnlChainDao$updatePnlChainList$1 = new SupportPnlChainDao$updatePnlChainList$1(continuation);
                }
            }
            java.lang.Object objKWHzl = supportPnlChainDao$updatePnlChainList$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = supportPnlChainDao$updatePnlChainList$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                supportPnlChainDao$updatePnlChainList$1.L$0 = chz;
                supportPnlChainDao$updatePnlChainList$1.L$1 = list;
                supportPnlChainDao$updatePnlChainList$1.label = 1;
                if (chz.OLrzqt(supportPnlChainDao$updatePnlChainList$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C56391yDq.AEQbTJ(objKWHzl);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) supportPnlChainDao$updatePnlChainList$1.L$1;
                chz = (cHZ) supportPnlChainDao$updatePnlChainList$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            supportPnlChainDao$updatePnlChainList$1.L$0 = null;
            supportPnlChainDao$updatePnlChainList$1.L$1 = null;
            supportPnlChainDao$updatePnlChainList$1.label = 2;
            objKWHzl = chz.KWHzl(list, supportPnlChainDao$updatePnlChainList$1);
            return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
        }
    }
}
