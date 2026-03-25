package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28177kRt {
    public abstract java.lang.Object AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation);

    /* JADX INFO: renamed from: submitPMMOrder-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8651submitPMMOrderhUnOzRk$default(AbstractC28177kRt abstractC28177kRt, V6BaseQuoteResponse v6BaseQuoteResponse, int i, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPMMOrder-hUnOzRk");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return abstractC28177kRt.AEQbTJ(v6BaseQuoteResponse, i, fragmentActivity, z, taskDescription, continuation);
    }
}
