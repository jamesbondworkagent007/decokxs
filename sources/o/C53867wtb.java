package o;

import com.okinc.unify_trade.biz.AssetsCoinTransferTarget;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53867wtb implements InterfaceC54501xKt<java.util.List<? extends AssetsCoinTransferTarget>, java.lang.String> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ java.lang.String KWHzl(java.util.List<? extends AssetsCoinTransferTarget> list) {
        return KWHzl2((java.util.List<AssetsCoinTransferTarget>) list);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public java.lang.String KWHzl2(@NotNull java.util.List<AssetsCoinTransferTarget> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        java.lang.String strAddS$default = "0";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, ((AssetsCoinTransferTarget) it.next()).getAvailable(), null, null, null, 14, null);
        }
        return strAddS$default;
    }
}
