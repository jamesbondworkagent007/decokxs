package o;

import com.okinc.business.defi.biz.database.wallet.entity.DAppSearchHistoryEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cJS {
    int AEQbTJ(@NotNull DAppSearchHistoryEntity dAppSearchHistoryEntity);

    int AEQbTJ(@NotNull java.lang.String str);

    java.util.List<DAppSearchHistoryEntity> AEQbTJ();

    int EZpvd();

    DAppSearchHistoryEntity EZpvd(@NotNull java.lang.String str);

    int KWHzl();

    long OLrzqt(@NotNull DAppSearchHistoryEntity dAppSearchHistoryEntity);

    java.util.List<DAppSearchHistoryEntity> OLrzqt();

    void OLrzqt(@NotNull java.util.List<DAppSearchHistoryEntity> list);

    int copydefault();

    long copydefault(@NotNull DAppSearchHistoryEntity dAppSearchHistoryEntity);

    java.util.List<java.lang.Long> copydefault(@NotNull java.util.List<DAppSearchHistoryEntity> list);

    int gEmmrt();

    int valueOf();

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static void copydefault(@NotNull cJS cjs, @NotNull java.util.List<DAppSearchHistoryEntity> list) {
            Intrinsics.checkNotNullParameter(list, "");
            cjs.KWHzl();
            if (!list.isEmpty()) {
                cjs.copydefault(list);
            }
        }
    }
}
