package o;

import com.okinc.business.defi.biz.database.wallet.dao.TeeStatusInfoDao$getTeeStatusInfo$1;
import com.okinc.business.defi.biz.database.wallet.entity.PartTeeStatusInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cKU {
    java.lang.Object EZpvd(@NotNull PartTeeStatusInfoEntity partTeeStatusInfoEntity, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object EZpvd(@NotNull TeeStatusInfoEntity teeStatusInfoEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super TeeStatusInfoEntity> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super TeeStatusInfoEntity> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TeeStatusInfoEntity>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super TeeStatusInfoEntity> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TeeStatusInfoEntity>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super TeeStatusInfoEntity> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<TeeStatusInfoEntity> list, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object copydefault(@NotNull cKU cku, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super TeeStatusInfoEntity> continuation) throws java.lang.Throwable {
            TeeStatusInfoDao$getTeeStatusInfo$1 teeStatusInfoDao$getTeeStatusInfo$1;
            if (continuation instanceof TeeStatusInfoDao$getTeeStatusInfo$1) {
                teeStatusInfoDao$getTeeStatusInfo$1 = (TeeStatusInfoDao$getTeeStatusInfo$1) continuation;
                int i = teeStatusInfoDao$getTeeStatusInfo$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    teeStatusInfoDao$getTeeStatusInfo$1.label = i - Integer.MIN_VALUE;
                } else {
                    teeStatusInfoDao$getTeeStatusInfo$1 = new TeeStatusInfoDao$getTeeStatusInfo$1(continuation);
                }
            }
            java.lang.Object objCopydefault = teeStatusInfoDao$getTeeStatusInfo$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = teeStatusInfoDao$getTeeStatusInfo$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                teeStatusInfoDao$getTeeStatusInfo$1.L$0 = cku;
                teeStatusInfoDao$getTeeStatusInfo$1.L$1 = str2;
                teeStatusInfoDao$getTeeStatusInfo$1.label = 1;
                objCopydefault = cku.copydefault(str, teeStatusInfoDao$getTeeStatusInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objCopydefault);
                    return objCopydefault;
                }
                str2 = (java.lang.String) teeStatusInfoDao$getTeeStatusInfo$1.L$1;
                cku = (cKU) teeStatusInfoDao$getTeeStatusInfo$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            objCopydefault = (TeeStatusInfoEntity) objCopydefault;
            if (objCopydefault == null) {
                teeStatusInfoDao$getTeeStatusInfo$1.L$0 = null;
                teeStatusInfoDao$getTeeStatusInfo$1.L$1 = null;
                teeStatusInfoDao$getTeeStatusInfo$1.label = 2;
                objCopydefault = cku.EZpvd(str2, teeStatusInfoDao$getTeeStatusInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return objCopydefault;
        }
    }
}
