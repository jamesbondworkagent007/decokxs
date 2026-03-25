package o;

import com.okinc.business.dex.tee.data.openorder.datasource.OpenOrderDao$deletedAllAndSave$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface gMW {
    java.lang.Object EZpvd(@NotNull java.lang.String str, int i, @NotNull Continuation<? super java.util.List<java.lang.Object>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<java.lang.Object> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getRecentOrdersByWalletId$default(gMW gmw, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecentOrdersByWalletId");
            }
            if ((i2 & 2) != 0) {
                i = 20;
            }
            return gmw.EZpvd(str, i, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object KWHzl(@NotNull gMW gmw, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.Object> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            OpenOrderDao$deletedAllAndSave$1 openOrderDao$deletedAllAndSave$1;
            if (continuation instanceof OpenOrderDao$deletedAllAndSave$1) {
                openOrderDao$deletedAllAndSave$1 = (OpenOrderDao$deletedAllAndSave$1) continuation;
                int i = openOrderDao$deletedAllAndSave$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    openOrderDao$deletedAllAndSave$1.label = i - Integer.MIN_VALUE;
                } else {
                    openOrderDao$deletedAllAndSave$1 = new OpenOrderDao$deletedAllAndSave$1(continuation);
                }
            }
            java.lang.Object obj = openOrderDao$deletedAllAndSave$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = openOrderDao$deletedAllAndSave$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                openOrderDao$deletedAllAndSave$1.L$0 = gmw;
                openOrderDao$deletedAllAndSave$1.L$1 = list;
                openOrderDao$deletedAllAndSave$1.label = 1;
                if (gmw.KWHzl(str, openOrderDao$deletedAllAndSave$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                list = (java.util.List) openOrderDao$deletedAllAndSave$1.L$1;
                gmw = (gMW) openOrderDao$deletedAllAndSave$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            openOrderDao$deletedAllAndSave$1.L$0 = null;
            openOrderDao$deletedAllAndSave$1.L$1 = null;
            openOrderDao$deletedAllAndSave$1.label = 2;
            if (gmw.KWHzl(list, openOrderDao$deletedAllAndSave$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
