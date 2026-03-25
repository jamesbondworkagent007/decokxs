package o;

import com.okinc.business.market.data.model.ModuleBoostHeaderData;
import com.okinc.business.market.data.model.ModuleData;
import com.okinc.business.market.data.model.ModuleDetailData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28901kjX {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<ModuleData>>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ModuleData>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<ModuleDetailData>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<ModuleBoostHeaderData, OKServerException>> continuation);
}
