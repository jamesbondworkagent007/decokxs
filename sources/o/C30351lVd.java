package o;

import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30351lVd extends lUN<CryptoListItem.Activity, lxA> {
    public C30351lVd() {
        super(C31351lsQ.ActionBar.QwvEab);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/okinc/buysell/view/cryptolist/CryptoListItem;Lo/rms;)V */
    @Override // o.lUN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull CryptoListItem.Activity activity, @NotNull C43312rms<lxA> c43312rms) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        ((lxA) c43312rms.OLrzqt()).EZpvd.setText(activity.OLrzqt());
    }
}
