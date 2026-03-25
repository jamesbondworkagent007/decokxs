package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kKD {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation);

    boolean AEQbTJ();

    boolean AEQbTJ(@NotNull java.lang.String str);

    Flow<java.lang.Boolean> AYXKKw();

    InterfaceC9738bbJ EZpvd();

    AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> EZpvd(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    boolean EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str);

    InterfaceC9740bbL KWHzl();

    AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull SignDataArgs<?> signDataArgs);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends InterfaceC9737bbI>> continuation);

    Flow<InterfaceC9738bbJ> OLrzqt();

    InterfaceC9731bbC OLrzqt(@NotNull java.lang.String str, long j);

    java.lang.String copydefault();
}
