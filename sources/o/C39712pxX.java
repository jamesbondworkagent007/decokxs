package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.kline.ui.unlock.ui.viewmodel.UnlockEventViewModel$flow$2;
import com.okinc.kline.ui.unlock.ui.viewmodel.UnlockEventViewModel$flow$3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39712pxX extends ViewModel {
    public final Flow<PagingData<UnlockTokenEvent>> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<PagingData<UnlockTokenEvent>> AEQbTJ() {
        return this.AEQbTJ;
    }

    public C39712pxX(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = CachedPagingDataKt.cachedIn(FlowKt.onStart(FlowKt.onEach(new Pager(new PagingConfig(10000, 0, false, 0, 0, 0, 58, null), null, new Function0() { // from class: o.pxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39712pxX.AEQbTJ(this.copydefault);
            }
        }, 2, null).getFlow(), new UnlockEventViewModel$flow$2(null)), new UnlockEventViewModel$flow$3(null)), ViewModelKt.getViewModelScope(this));
    }

    public static final PagingSource AEQbTJ(C39712pxX c39712pxX) {
        return new C39647pwL(c39712pxX.EZpvd, c39712pxX.KWHzl);
    }
}
