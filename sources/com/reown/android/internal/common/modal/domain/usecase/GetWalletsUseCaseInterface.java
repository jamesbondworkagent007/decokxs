package com.reown.android.internal.common.modal.domain.usecase;

import com.reown.android.internal.common.modal.data.model.WalletListing;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetWalletsUseCaseInterface {
    Object invoke(@NotNull String str, int i, String str2, List<String> list, List<String> list2, @NotNull Continuation<? super WalletListing> continuation);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.reown.android.internal.common.modal.domain.usecase.GetWalletsUseCaseInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object invoke$default(GetWalletsUseCaseInterface getWalletsUseCaseInterface, String str, int i, String str2, List list, List list2, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return getWalletsUseCaseInterface.invoke(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
