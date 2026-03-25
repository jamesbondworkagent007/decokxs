package o;

import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53554wng extends AbstractC49945uyC<uUQ, EmptyPresenter> {
    public final int KWHzl = C48033uCm.Activity.dbwnZN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.newThumbRating));
    }
}
