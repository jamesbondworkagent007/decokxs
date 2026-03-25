package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.market.common.biz_spot.AnnounceDetail;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFU {
    public static boolean OLrzqt;
    public static final pFU AEQbTJ = new pFU();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        OLrzqt = z;
    }

    private pFU() {
    }

    public static /* synthetic */ void setIsShowTradeOrKline$default(pFU pfu, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pfu.KWHzl(z);
    }

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull final Function1<? super AnnounceDetail, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getAnnounceDetail(str), lifecycleOwner), new Function1() { // from class: o.pFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pFU.KWHzl(function1, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pFU.KWHzl(function1, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            function1.invoke(null);
        } else if (responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            function1.invoke(data);
        }
        return Unit.INSTANCE;
    }
}
