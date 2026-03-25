package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okmarket.ui.market.remind.CommonKt$dealHttpException$1;
import com.okinc.tradeapi.bean.BizApiException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46768tdR {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CommonKt$dealHttpException$1 commonKt$dealHttpException$1;
        if (continuation instanceof CommonKt$dealHttpException$1) {
            commonKt$dealHttpException$1 = (CommonKt$dealHttpException$1) continuation;
            int i = commonKt$dealHttpException$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonKt$dealHttpException$1.label = i - Integer.MIN_VALUE;
            } else {
                commonKt$dealHttpException$1 = new CommonKt$dealHttpException$1(continuation);
            }
        }
        java.lang.Object obj = commonKt$dealHttpException$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = commonKt$dealHttpException$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                commonKt$dealHttpException$1.label = 1;
                if (function1.invoke(commonKt$dealHttpException$1) == objCopydefault) {
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
}
