package o;

import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15379eGd extends C43318rmy<eFG, AbstractC16809eqt> {
    public C15379eGd() {
        super(C13754dXa.TaskDescription.dPkBzA, dTV.isConnected);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16809eqt> c43312rms, @NotNull eFG efg) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(efg, "");
        super.onBindViewHolder((C43312rms) c43312rms, efg);
        android.widget.ImageView imageView = ((AbstractC16809eqt) c43312rms.OLrzqt()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.copydefault(imageView, efg.EZpvd(), C52761wXj.TaskDescription.aHXSQp, 1.0f, 32.0f);
        ((AbstractC16809eqt) c43312rms.OLrzqt()).OLrzqt.setText(efg.AhwBna());
        WalletCurrencyBean walletCurrencyBeanCopydefault = C54864xYd.AEQbTJ.copydefault();
        java.lang.String strOLrzqt = efg.OLrzqt();
        java.lang.String valuationFromFee$default = strOLrzqt != null ? C54880xYt.formatValuationFromFee$default(strOLrzqt, walletCurrencyBeanCopydefault, false, false, 6, null) : null;
        android.widget.TextView textView = ((AbstractC16809eqt) c43312rms.OLrzqt()).copydefault;
        if (valuationFromFee$default == null) {
            valuationFromFee$default = efg.AEQbTJ();
        }
        textView.setText(valuationFromFee$default);
    }
}
