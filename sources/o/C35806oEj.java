package o;

import com.okinc.im.usecase.message.GetOrFetchMessageUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35806oEj {
    public final sKH KWHzl;

    @yCM
    public C35806oEj(@NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(skh, "");
        this.KWHzl = skh;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        GetOrFetchMessageUseCase$execute$1 getOrFetchMessageUseCase$execute$1;
        long j2;
        if (continuation instanceof GetOrFetchMessageUseCase$execute$1) {
            getOrFetchMessageUseCase$execute$1 = (GetOrFetchMessageUseCase$execute$1) continuation;
            int i = getOrFetchMessageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrFetchMessageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getOrFetchMessageUseCase$execute$1 = new GetOrFetchMessageUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getOrFetchMessageUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOrFetchMessageUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            sKH skh = this.KWHzl;
            sNO sno = new sNO(str, C56443yFo.KWHzl(j), 1L, null, true, 0, false, 32, null);
            getOrFetchMessageUseCase$execute$1.J$0 = j;
            getOrFetchMessageUseCase$execute$1.label = 1;
            objKWHzl = skh.KWHzl(sno, getOrFetchMessageUseCase$execute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = getOrFetchMessageUseCase$execute$1.J$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        for (java.lang.Object obj : (java.lang.Iterable) objKWHzl) {
            if (((OKMessage) obj).getSeq() == j2) {
                return obj;
            }
        }
        return null;
    }
}
