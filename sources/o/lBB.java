package o;

import android.view.View;
import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lBB extends mIP<BuyFrequencyOption, AbstractC31593lwv> {
    public final Function1<BuyFrequencyOption, Unit> copydefault;

    @Override // o.mIP
    public /* bridge */ /* synthetic */ void KWHzl(OKCRListItem oKCRListItem, C43312rms c43312rms) {
        KWHzl((BuyFrequencyOption) oKCRListItem, (C43312rms<AbstractC31593lwv>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.data.BuyFrequencyOption, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lBB(@NotNull Function1<? super BuyFrequencyOption, Unit> function1) {
        super(C31351lsQ.ActionBar.DarRvM);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    public void KWHzl(@NotNull final BuyFrequencyOption buyFrequencyOption, @NotNull C43312rms<AbstractC31593lwv> c43312rms) {
        Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31593lwv abstractC31593lwv = (AbstractC31593lwv) c43312rms.OLrzqt();
        if (abstractC31593lwv != null) {
            abstractC31593lwv.getRoot().setBackgroundResource(buyFrequencyOption.isSelected() ? mDC.StateListAnimator.gEmmrt : mDC.StateListAnimator.valueOf);
            abstractC31593lwv.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lBE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lBB.EZpvd(this.EZpvd, buyFrequencyOption, view);
                }
            });
            abstractC31593lwv.copydefault.setText(buyFrequencyOption.getDisplayLabel());
            abstractC31593lwv.OLrzqt.setText(buyFrequencyOption.getDisplayDescription());
        }
    }

    public static final void EZpvd(lBB lbb, BuyFrequencyOption buyFrequencyOption, android.view.View view) {
        lbb.copydefault.invoke(buyFrequencyOption);
    }
}
