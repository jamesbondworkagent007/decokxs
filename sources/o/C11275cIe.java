package o;

import com.okinc.business.defi.biz.database.extra.ExtraDatabase;
import com.okinc.business.defi.biz.database.extra.entity.FullAssetCoinRelationEntity;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11275cIe {
    public final InterfaceC11262cHs EZpvd = ExtraDatabase.Companion.AEQbTJ(C9678baC.Companion.AEQbTJ()).fetchVPNInfo();

    public final java.util.List<CoinMetaBean> OLrzqt() {
        return this.EZpvd.AEQbTJ();
    }

    public final java.util.List<FullAssetCoinRelationEntity> AEQbTJ() {
        return this.EZpvd.copydefault();
    }

    public final java.util.List<java.lang.Long> EZpvd(@NotNull java.util.List<CoinMetaBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.EZpvd.AEQbTJ(list);
    }

    public final java.util.List<java.lang.Long> KWHzl(boolean z, @NotNull java.util.List<FullAssetCoinRelationEntity> list, @NotNull java.util.List<CoinMetaBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return this.EZpvd.KWHzl(z, list, list2);
    }

    public final int copydefault() {
        return this.EZpvd.EZpvd();
    }
}
