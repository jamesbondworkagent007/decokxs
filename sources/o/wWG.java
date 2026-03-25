package o;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.widget.compose.PagingListHandlerKt$rememberPagingListHandler$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wWG {
    public static final LazyListState KWHzl(LazyListState lazyListState, int i, boolean z, @NotNull Function0<Unit> function0, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(function0, "");
        composer.startReplaceableGroup(-155364141);
        LazyListState lazyListStateRememberLazyListState = (i3 & 1) != 0 ? LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3) : lazyListState;
        int i4 = (i3 & 2) != 0 ? 5 : i;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-155364141, i2, -1, "com.okinc.tradingbot.impl.widget.compose.rememberPagingListHandler (PagingListHandler.kt:28)");
        }
        androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composer, (i2 >> 9) & 14);
        composer.startReplaceableGroup(-515052613);
        boolean z3 = (((i2 & FaceDetector.NUM_BOXES) ^ MLKEMEngine.KyberPolyBytes) > 256 && composer.changed(z2)) || (i2 & MLKEMEngine.KyberPolyBytes) == 256;
        int i5 = i2 & 14;
        boolean z4 = ((i5 ^ 6) > 4 && composer.changed(lazyListStateRememberLazyListState)) || (i2 & 6) == 4;
        boolean z5 = (((i2 & WalletImportError.ERROR_CODE_AA_EXIST) ^ 48) > 32 && composer.changed(i4)) || (i2 & 48) == 32;
        boolean zChanged = composer.changed(stateRememberUpdatedState);
        java.lang.Object objRememberedValue = composer.rememberedValue();
        if ((z3 | z4 | z5 | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
            java.lang.Object pagingListHandlerKt$rememberPagingListHandler$1$1 = new PagingListHandlerKt$rememberPagingListHandler$1$1(z2, lazyListStateRememberLazyListState, i4, stateRememberUpdatedState, null);
            composer.updateRememberedValue(pagingListHandlerKt$rememberPagingListHandler$1$1);
            objRememberedValue = pagingListHandlerKt$rememberPagingListHandler$1$1;
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, java.lang.Boolean.valueOf(z2), (Function2) objRememberedValue, composer, ((i2 >> 3) & WalletImportError.ERROR_CODE_AA_EXIST) | i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListStateRememberLazyListState;
    }

    public static final Function0<Unit> EZpvd(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
