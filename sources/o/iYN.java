package o;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iYN {
    java.lang.Object copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j2, long j3, @NotNull Continuation<? super Result<AssetBottomSheetData.PositionBottomSheetData>> continuation);

    /* JADX INFO: renamed from: getStoredPositionData-hUnOzRk$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8616getStoredPositionDatahUnOzRk$default(iYN iyn, long j, java.lang.String str, java.lang.String str2, long j2, long j3, Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return iyn.copydefault(j, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStoredPositionData-hUnOzRk");
    }
}
