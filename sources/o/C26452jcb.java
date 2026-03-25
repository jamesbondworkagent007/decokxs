package o;

import com.okinc.business.invest_biz.data.bean.ProductJumpParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26452jcb {
    public static final void KWHzl(@NotNull C26526jdw c26526jdw, int i, ProductJumpParam productJumpParam, @NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c26526jdw, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iGEmmrt = c26526jdw.gEmmrt();
        if (iGEmmrt == 1) {
            if (productJumpParam == null || C33129mqd.OLrzqt((java.lang.Object) java.lang.Long.valueOf(productJumpParam.AEQbTJ()), (java.lang.Object) (-1))) {
                return;
            }
            C27508jwX.startInvestDetailActivity$default(C27508jwX.AEQbTJ, activity, java.lang.Long.valueOf(productJumpParam.AEQbTJ()), null, str, null, false, 24, null);
            return;
        }
        if (iGEmmrt != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC24156iWz.class);
        intent.putExtra("aggregate_tab_id", i);
        intent.putExtra("aggregate_item_key", c26526jdw.AhwBna());
        activity.startActivity(intent);
    }
}
