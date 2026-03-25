package o;

import com.okinc.business.defi.biz.database.extra.entity.FullAssetCoinRelationEntity;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11262cHs {
    java.util.List<CoinMetaBean> AEQbTJ();

    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.util.List<CoinMetaBean> list);

    int EZpvd();

    int KWHzl();

    java.util.List<java.lang.Long> KWHzl(@NotNull java.util.List<FullAssetCoinRelationEntity> list);

    java.util.List<java.lang.Long> KWHzl(boolean z, @NotNull java.util.List<FullAssetCoinRelationEntity> list, @NotNull java.util.List<CoinMetaBean> list2);

    int copydefault(int i);

    java.util.List<FullAssetCoinRelationEntity> copydefault();

    java.util.List<java.lang.Long> copydefault(@NotNull java.util.List<CoinMetaBean> list);

    /* JADX INFO: renamed from: o.cHs$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static java.util.List<java.lang.Long> copydefault(@NotNull InterfaceC11262cHs interfaceC11262cHs, @NotNull java.util.List<CoinMetaBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            interfaceC11262cHs.copydefault(1);
            return interfaceC11262cHs.copydefault(list);
        }

        public static java.util.List<java.lang.Long> EZpvd(@NotNull InterfaceC11262cHs interfaceC11262cHs, boolean z, @NotNull java.util.List<FullAssetCoinRelationEntity> list, @NotNull java.util.List<CoinMetaBean> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            if (z) {
                interfaceC11262cHs.KWHzl();
            }
            interfaceC11262cHs.KWHzl(list);
            return interfaceC11262cHs.copydefault(list2);
        }

        public static int OLrzqt(@NotNull InterfaceC11262cHs interfaceC11262cHs) {
            interfaceC11262cHs.KWHzl();
            return interfaceC11262cHs.copydefault(2);
        }
    }
}
