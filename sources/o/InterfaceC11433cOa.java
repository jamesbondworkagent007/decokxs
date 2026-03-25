package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11433cOa {
    java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, int i, @NotNull Continuation<? super java.lang.Integer> continuation);

    int EZpvd(@NotNull java.lang.String str, long j);

    java.lang.Object KWHzl(int i, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, int i2, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, int i, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<WalletSignDataEntity>>> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<WalletSignDataEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);
}
