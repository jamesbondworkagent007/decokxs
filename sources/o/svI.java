package o;

import com.okinc.okex.lite.home.bean.LiteHomeWelcomeData;
import com.okinc.okex.lite.home.bean.LiteUserResidenceType;
import com.okinc.okex.lite.home.bean.ProductMatrixSource;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface svI extends InterfaceC43217rlC {
    androidx.fragment.app.Fragment EZpvd(@NotNull svS svs, @NotNull java.lang.String str);

    java.lang.Object EZpvd(@NotNull Continuation<? super LiteUserResidenceType> continuation);

    android.view.View KWHzl(@NotNull android.content.Context context, @NotNull ProductMatrixSource productMatrixSource);

    java.lang.Object KWHzl(@NotNull Continuation<? super LiteHomeWelcomeData> continuation);
}
