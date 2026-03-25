package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22340hdX {
    public static final MevInfoBean KWHzl(@NotNull java.util.List<MevInfoBean> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MevInfoBean) next).isDefault()) {
                break;
            }
        }
        MevInfoBean mevInfoBean = (MevInfoBean) next;
        return mevInfoBean == null ? (MevInfoBean) CollectionsKt___CollectionsKt.firstOrNull(list) : mevInfoBean;
    }
}
