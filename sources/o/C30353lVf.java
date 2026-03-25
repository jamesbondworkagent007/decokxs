package o;

import android.view.View;
import com.okinc.buysell.view.cryptolist.SearchHistoryItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30353lVf extends lUN<SearchHistoryItem, AbstractC31569lwW> {
    public final Function1<SearchHistoryItem, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.SearchHistoryItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30353lVf(@NotNull Function1<? super SearchHistoryItem, Unit> function1) {
        super(C31351lsQ.ActionBar.dHguZz);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/okinc/buysell/view/cryptolist/CryptoListItem;Lo/rms;)V */
    @Override // o.lUN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull final SearchHistoryItem searchHistoryItem, @NotNull C43312rms<AbstractC31569lwW> c43312rms) {
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31569lwW abstractC31569lwW = (AbstractC31569lwW) c43312rms.OLrzqt();
        if (searchHistoryItem instanceof SearchHistoryItem.HistoryTokenItem) {
            abstractC31569lwW.OLrzqt.setVisibility(0);
            android.widget.ImageView imageView = abstractC31569lwW.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            SearchHistoryItem.HistoryTokenItem historyTokenItem = (SearchHistoryItem.HistoryTokenItem) searchHistoryItem;
            C33054mpH.EZpvd(imageView, historyTokenItem.getCurrencyToken().getIcon(), C52761wXj.TaskDescription.aHXSQp);
            abstractC31569lwW.AEQbTJ.setVisibility(0);
            abstractC31569lwW.AEQbTJ.setText(historyTokenItem.getCurrencyToken().getCurrency());
            abstractC31569lwW.valueOf.setVisibility(8);
            abstractC31569lwW.djBIcL.setVisibility(8);
        } else {
            if (!(searchHistoryItem instanceof SearchHistoryItem.HistoryDexItem)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC31569lwW.OLrzqt.setVisibility(0);
            android.widget.ImageView imageView2 = abstractC31569lwW.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            SearchHistoryItem.HistoryDexItem historyDexItem = (SearchHistoryItem.HistoryDexItem) searchHistoryItem;
            C33054mpH.EZpvd(imageView2, historyDexItem.getCurrencyToken().getIcon(), C52761wXj.TaskDescription.aHXSQp);
            abstractC31569lwW.KWHzl.setVisibility(0);
            android.widget.ImageView imageView3 = abstractC31569lwW.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C33054mpH.EZpvd(imageView3, historyDexItem.getCurrencyToken().getDexInfo().getChainLogo(), C52761wXj.TaskDescription.fERRXa);
            abstractC31569lwW.AEQbTJ.setVisibility(0);
            abstractC31569lwW.AEQbTJ.setText(historyDexItem.getCryptoName());
            abstractC31569lwW.valueOf.setVisibility(8);
            abstractC31569lwW.djBIcL.setVisibility(8);
        }
        abstractC31569lwW.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lVe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30353lVf.KWHzl(this.KWHzl, searchHistoryItem, view);
            }
        });
    }

    public static final void KWHzl(C30353lVf c30353lVf, SearchHistoryItem searchHistoryItem, android.view.View view) {
        c30353lVf.copydefault.invoke(searchHistoryItem);
    }
}
