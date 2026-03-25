package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.xvD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56031xvD extends Converter.Factory {

    /* JADX INFO: renamed from: o.xvD$Application */
    public static final class Application extends TypeToken<ResponseData<java.util.List<StrategyPendingListResp>>> {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.reflect.Type type2 = new Application().getType();
        if (Intrinsics.EZpvd(type, type2)) {
            pUU.EZpvd("GRID_TPSL", "responseBodyConverter found type " + type2);
            return new C56035xvH();
        }
        pUU.copydefault("GRID_TPSL", "StrategyPendingListConverter No such type " + type2);
        return null;
    }
}
