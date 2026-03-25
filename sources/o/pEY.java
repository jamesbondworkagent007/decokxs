package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.util.KlineSuspendKt$dealHttpException$1;
import com.okinc.kline.util.KlineSuspendKt$delete$2;
import com.okinc.kline.util.KlineSuspendKt$handleDragChangeAlertPrice$1;
import com.okinc.kline.util.KlineSuspendKt$handleDragChangeAlertPrice$2;
import com.okinc.kline.util.KlineSuspendKt$requestEdit$2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pEY {
    public static final void copydefault(@NotNull oYA oya, @NotNull PriceWarningItemBean priceWarningItemBean, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(oya, "");
        Intrinsics.checkNotNullParameter(priceWarningItemBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "change")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(oya), null, null, new KlineSuspendKt$handleDragChangeAlertPrice$1(priceWarningItemBean, null), 3, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) RequestParameters.SUBRESOURCE_DELETE)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(oya), null, null, new KlineSuspendKt$handleDragChangeAlertPrice$2(priceWarningItemBean, oya, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        KlineSuspendKt$dealHttpException$1 klineSuspendKt$dealHttpException$1;
        if (continuation instanceof KlineSuspendKt$dealHttpException$1) {
            klineSuspendKt$dealHttpException$1 = (KlineSuspendKt$dealHttpException$1) continuation;
            int i = klineSuspendKt$dealHttpException$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineSuspendKt$dealHttpException$1.label = i - Integer.MIN_VALUE;
            } else {
                klineSuspendKt$dealHttpException$1 = new KlineSuspendKt$dealHttpException$1(continuation);
            }
        }
        java.lang.Object obj = klineSuspendKt$dealHttpException$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineSuspendKt$dealHttpException$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                klineSuspendKt$dealHttpException$1.label = 1;
                if (function1.invoke(klineSuspendKt$dealHttpException$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Throwable th) {
            if ((th instanceof OKServerException) || (th instanceof BizApiException)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            }
            pUU.AEQbTJ("OKMarket", "dealHttpException", th);
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.Object copydefault(@NotNull PriceWarningItemBean priceWarningItemBean, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new KlineSuspendKt$requestEdit$2(priceWarningItemBean, null), continuation);
    }

    public static final java.lang.Object OLrzqt(@NotNull PriceWarningItemBean priceWarningItemBean, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new KlineSuspendKt$delete$2(priceWarningItemBean, null), continuation);
    }
}
