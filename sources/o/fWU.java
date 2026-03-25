package o;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.biz.net.bean.TeeUpgradeStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface fWU {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super TeeMetadata> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super TeeUpgradeStatus> continuation);

    void EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(long j, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super SingleTeeStatus> continuation);

    java.lang.Object copydefault(long j, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC12782ctV> continuation);
}
