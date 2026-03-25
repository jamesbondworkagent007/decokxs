package o;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702StatusItem;
import com.okinc.business.defi.biz.net.bean.UpdateStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface fVJ {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SingleTeeStatus singleTeeStatus, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull Continuation<? super SingleTeeStatus> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull dTK dtk, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Long> continuation);

    SingleTeeStatusAndWarringInfo EZpvd(@NotNull java.lang.String str, @NotNull SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<TeeAndEip7702Item> list, @NotNull Continuation<? super java.util.List<TeeAndEip7702StatusItem>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull UpdateStatus updateStatus, @NotNull Continuation<? super java.lang.Integer> continuation);
}
