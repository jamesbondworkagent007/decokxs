package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51270vjp extends RecyclerView.ViewHolder {
    public final TickerIconView EZpvd;
    public final C55258xgZ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TickerIconView KWHzl() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51270vjp(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi214);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.removeOnContextAvailableListener);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (TickerIconView) viewFindViewById2;
    }
}
