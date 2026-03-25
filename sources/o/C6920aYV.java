package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.biz.statistics.data.bean.StatisticsResp;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.aYV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6920aYV<T> implements Converter<ResponseBody, T> {
    /* JADX DEBUG: Method merged with bridge method: convert(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.okinc.biz.statistics.data.bean.StatisticsResp] */
    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T convert(ResponseBody responseBody) throws java.io.IOException {
        ?? r0 = (T) new StatisticsResp();
        java.lang.String strString = responseBody.string();
        if (android.text.TextUtils.isEmpty(strString)) {
            return r0;
        }
        java.lang.String[] strArrSplit = strString.split("\r\n");
        if (strArrSplit.length != 2) {
            return r0;
        }
        java.lang.String[] strArrSplit2 = strArrSplit[0].split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (strArrSplit2.length == 2) {
            r0.code = java.lang.Integer.parseInt(strArrSplit2[1]);
        }
        java.lang.String[] strArrSplit3 = strArrSplit[1].split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (strArrSplit3.length == 2) {
            r0.timestamp = java.lang.Long.parseLong(strArrSplit3[1]);
        }
        return r0;
    }
}
