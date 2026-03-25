package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xHF {
    java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<DexAssetsResponse>>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexAssets>>> continuation);
}
