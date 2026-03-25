package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28329kXj {
    public abstract java.lang.Object AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation);

    public abstract kVE AEQbTJ();

    /* JADX INFO: renamed from: submitPMMOrder-bMdYcbs$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8658submitPMMOrderbMdYcbs$default(AbstractC28329kXj abstractC28329kXj, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, int i, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, Continuation continuation, int i2, java.lang.Object obj) {
        if (obj == null) {
            return abstractC28329kXj.AEQbTJ(v6BaseQuoteResponse, str, (i2 & 4) != 0 ? 0 : i, fragmentActivity, z, taskDescription, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPMMOrder-bMdYcbs");
    }

    /* JADX DEBUG: Type inference failed for r9v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<SaveIntentData>> abstractC58185ywXCopydefault = AEQbTJ().copydefault(str, str2, str3, str4, TradeMode.MemeMode.getType(), i);
        final Function1 function1 = new Function1() { // from class: o.kXl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC28329kXj.EZpvd((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kXo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC28329kXj.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(ResponseData responseData) throws OKServerException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SaveIntentData saveIntentData = (SaveIntentData) responseData.getData();
            java.lang.String orderId = saveIntentData != null ? saveIntentData.getOrderId() : null;
            return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, orderId == null ? "" : orderId, null, 44, null);
        }
        throw new OKServerException(responseData.getCode(), responseData.getMsg(), null, null, 12, null);
    }
}
