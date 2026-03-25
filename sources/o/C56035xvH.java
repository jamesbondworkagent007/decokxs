package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListRespExt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.xvH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56035xvH implements Converter<ResponseBody, ResponseData<java.util.List<? extends StrategyPendingListResp>>> {
    public final java.util.List<StrategyPendingListResp> EZpvd(@NotNull java.lang.String str) {
        java.lang.Exception e;
        java.util.List<StrategyPendingListResp> list;
        java.lang.Exception e2;
        java.lang.Object objOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(StrategyPendingListResp.Companion.serializer()), str);
            try {
                pUU.EZpvd("GRID_TPSL", "StrategyPendingListConverter result : " + list);
            } catch (java.lang.Exception e3) {
                e = e3;
                pUU.AEQbTJ("GRID_TPSL", "StrategyPendingListConverter json parsing: ", e);
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            list = null;
        }
        try {
            objOLrzqt = C33489mxS.KWHzl.OLrzqt((DeserializationStrategy<? extends java.lang.Object>) BuiltinSerializersKt.ListSerializer(StrategyPendingListRespExt.Companion.serializer()), str);
            try {
                pUU.EZpvd("GRID_TPSL", "StrategyPendingListConverter resultExt : " + objOLrzqt);
            } catch (java.lang.Exception e5) {
                e2 = e5;
                pUU.AEQbTJ("GRID_TPSL", "StrategyPendingListConverter json parsing: ", e2);
            }
        } catch (java.lang.Exception e6) {
            e2 = e6;
            objOLrzqt = null;
        }
        if (list != null) {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.util.List list2 = (java.util.List) objOLrzqt;
                ((StrategyPendingListResp) obj).setExt(list2 != null ? (StrategyPendingListRespExt) CollectionsKt___CollectionsKt.AkhnZx(list2, i) : null);
                i++;
            }
        }
        return list;
    }

    /* JADX DEBUG: Method merged with bridge method: convert(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ResponseData<java.util.List<StrategyPendingListResp>> convert(@NotNull ResponseBody responseBody) throws java.io.IOException {
        java.lang.Exception e;
        ResponseData<java.util.List<StrategyPendingListResp>> responseData;
        java.lang.Exception e2;
        java.lang.Object objOLrzqt;
        java.util.List<StrategyPendingListResp> data;
        java.util.List list;
        Intrinsics.checkNotNullParameter(responseBody, "");
        java.lang.String strString = responseBody.string();
        pUU.EZpvd("GRID_TPSL", "StrategyPendingListConverter rawjson: " + strString);
        try {
            responseData = (ResponseData) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) ResponseData.Companion.serializer(BuiltinSerializersKt.ListSerializer(StrategyPendingListResp.Companion.serializer())), strString);
            try {
                pUU.EZpvd("GRID_TPSL", "StrategyPendingListConverter result : " + responseData.getData());
            } catch (java.lang.Exception e3) {
                e = e3;
                pUU.AEQbTJ("GRID_TPSL", "StrategyPendingListConverter json parsing: ", e);
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            responseData = null;
        }
        try {
            objOLrzqt = C33489mxS.KWHzl.OLrzqt((DeserializationStrategy<? extends java.lang.Object>) ResponseData.Companion.serializer(BuiltinSerializersKt.ListSerializer(StrategyPendingListRespExt.Companion.serializer())), strString);
            try {
                pUU.EZpvd("GRID_TPSL", "resultExt : " + ((ResponseData) objOLrzqt).getData());
            } catch (java.lang.Exception e5) {
                e2 = e5;
                pUU.AEQbTJ("GRID_TPSL", "StrategyPendingListConverter json parsing: ", e2);
            }
        } catch (java.lang.Exception e6) {
            e2 = e6;
            objOLrzqt = null;
        }
        if (responseData != null && (data = responseData.getData()) != null) {
            int i = 0;
            for (java.lang.Object obj : data) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ResponseData responseData2 = (ResponseData) objOLrzqt;
                ((StrategyPendingListResp) obj).setExt((responseData2 == null || (list = (java.util.List) responseData2.getData()) == null) ? null : (StrategyPendingListRespExt) CollectionsKt___CollectionsKt.AkhnZx(list, i));
                i++;
            }
        }
        return responseData;
    }
}
