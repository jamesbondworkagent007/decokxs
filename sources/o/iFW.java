package o;

import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iFW {
    java.lang.Object copydefault(boolean z, @NotNull Continuation<? super Result<HomeTokensResponse>> continuation);

    /* JADX INFO: renamed from: invoke-gIAlu-s$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8614invokegIAlus$default(iFW ifw, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke-gIAlu-s");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return ifw.copydefault(z, continuation);
    }
}
