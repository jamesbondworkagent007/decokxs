package o;

import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30354lVg extends lUN<CryptoListItem.StateListAnimator, AbstractC31601lxc> {
    public C30354lVg() {
        super(C31351lsQ.ActionBar.RdAHlO);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/okinc/buysell/view/cryptolist/CryptoListItem;Lo/rms;)V */
    @Override // o.lUN
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull CryptoListItem.StateListAnimator stateListAnimator, @NotNull C43312rms<AbstractC31601lxc> c43312rms) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        ((AbstractC31601lxc) c43312rms.OLrzqt()).KWHzl.setText(stateListAnimator.copydefault());
    }
}
