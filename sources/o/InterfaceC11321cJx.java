package o;

import com.okinc.business.defi.biz.database.wallet.entity.CustomChainTransactionEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11321cJx {
    java.util.List<CustomChainTransactionEntity> AEQbTJ(@NotNull java.lang.String str, long j, long j2);

    java.util.List<CustomChainTransactionEntity> AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Integer> list, int i);

    int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i);

    long EZpvd(@NotNull CustomChainTransactionEntity customChainTransactionEntity);

    int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    int OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, int i);

    java.util.List<java.lang.Long> OLrzqt(long j, @NotNull java.lang.String str, int i);

    java.util.List<CustomChainTransactionEntity> OLrzqt(@NotNull java.lang.String str);

    java.util.List<CustomChainTransactionEntity> OLrzqt(@NotNull java.lang.String str, long j, int i, int i2, @NotNull java.util.List<java.lang.Integer> list, int i3);

    java.util.List<CustomChainTransactionEntity> OLrzqt(@NotNull java.lang.String str, long j, long j2, @NotNull java.util.List<java.lang.Integer> list);

    int copydefault(@NotNull java.lang.String str, int i);

    int copydefault(@NotNull java.util.List<java.lang.String> list);

    void copydefault(@NotNull CustomChainTransactionEntity customChainTransactionEntity, java.lang.String str);

    /* JADX INFO: renamed from: o.cJx$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static void copydefault(@NotNull InterfaceC11321cJx interfaceC11321cJx, @NotNull CustomChainTransactionEntity customChainTransactionEntity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(customChainTransactionEntity, "");
            interfaceC11321cJx.EZpvd(customChainTransactionEntity);
            if (str != null) {
                interfaceC11321cJx.KWHzl(customChainTransactionEntity.getOriginTxHash(), str);
            }
        }
    }
}
