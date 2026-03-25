package o;

import com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin;
import com.okinc.wallet.core.sign.sui.SuiObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11832cbX {
    public static final java.util.List<SuiObject> AEQbTJ(@NotNull java.util.List<SuiInputCoin> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SuiInputCoin) it.next()).toSuiObject());
        }
        return arrayList;
    }
}
