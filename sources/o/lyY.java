package o;

import com.okinc.buysell.domain.GetUserInfoUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyY {
    public final InterfaceC31764mDa KWHzl;

    @yCM
    public lyY(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.KWHzl = interfaceC31764mDa;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<UserInfoBean, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetUserInfoUseCase$invoke$2(this, null), continuation);
    }
}
