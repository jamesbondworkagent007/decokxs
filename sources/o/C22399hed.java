package o;

import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22399hed {
    public static final ResponseData<MergeQuoteCallData> OLrzqt(@NotNull ResponseData<QuoteCallData> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData<>(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), new MergeQuoteCallData(responseData.getData(), (IntentBridgeQuoteCallData) null, 2, (DefaultConstructorMarker) null), responseData.getError_code());
    }
}
