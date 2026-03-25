package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21051gsU extends C43318rmy<ExchangeSelectCoinBean, AbstractC16881esL> {
    public final C21120gtk OLrzqt;
    public final StateListAnimator copydefault;

    /* JADX INFO: renamed from: o.gsU$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(ExchangeSelectCoinBean exchangeSelectCoinBean);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21051gsU(@NotNull C21120gtk c21120gtk, @NotNull StateListAnimator stateListAnimator) {
        super(C13754dXa.TaskDescription.HJWChPHhYHK, 0);
        Intrinsics.checkNotNullParameter(c21120gtk, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.OLrzqt = c21120gtk;
        this.copydefault = stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public C43312rms<AbstractC16881esL> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        final C43312rms<AbstractC16881esL> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
        C8003auW.copydefault(((AbstractC16881esL) c43312rmsOnCreateViewHolder.OLrzqt()).getRoot()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.gsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21051gsU.KWHzl(this.copydefault, c43312rmsOnCreateViewHolder, obj);
            }
        });
        return c43312rmsOnCreateViewHolder;
    }

    public static final void KWHzl(C21051gsU c21051gsU, C43312rms c43312rms, java.lang.Object obj) {
        c21051gsU.copydefault.AEQbTJ(c21051gsU.KWHzl(c43312rms.getLayoutPosition()));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16881esL> c43312rms, @NotNull ExchangeSelectCoinBean exchangeSelectCoinBean) {
        java.lang.String strOLrzqt;
        BigDecimal bigDecimalEZpvd;
        java.lang.String valuation$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(exchangeSelectCoinBean, "");
        AbstractC16881esL abstractC16881esL = (AbstractC16881esL) c43312rms.OLrzqt();
        abstractC16881esL.valueOf.setVisibility(Intrinsics.EZpvd(exchangeSelectCoinBean.isSupportWallet(), java.lang.Boolean.TRUE) ? 8 : 0);
        android.widget.ImageView imageView = abstractC16881esL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.copydefault(imageView, exchangeSelectCoinBean.getIcon(), C52761wXj.TaskDescription.aHXSQp, 1.0f, 32.0f);
        android.widget.TextView textView = abstractC16881esL.copydefault;
        C21120gtk c21120gtk = this.OLrzqt;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String currency = exchangeSelectCoinBean.getCurrency();
        if (currency == null) {
            currency = "";
        }
        textView.setText(c21120gtk.KWHzl(context, currency));
        abstractC16881esL.KWHzl.setText(exchangeSelectCoinBean.getFullName());
        android.widget.TextView textView2 = abstractC16881esL.OLrzqt;
        java.lang.String balance = exchangeSelectCoinBean.getBalance();
        if (balance != null) {
            strOLrzqt = C54870xYj.OLrzqt(balance, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        } else {
            strOLrzqt = null;
        }
        textView2.setText(strOLrzqt);
        android.widget.TextView textView3 = abstractC16881esL.AEQbTJ;
        java.lang.String valuation = exchangeSelectCoinBean.getValuation();
        if (valuation != null && (bigDecimalEZpvd = C33129mqd.EZpvd(valuation)) != null && (valuation$default = C54880xYt.formatValuation$default(bigDecimalEZpvd, 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 55, null)) != null) {
            str = valuation$default;
        }
        textView3.setText(str);
    }

    public final ExchangeSelectCoinBean KWHzl(int i) {
        C59534zip adapter = getAdapter();
        Intrinsics.copydefault(adapter, "");
        java.lang.Object objAEQbTJ = ((C43316rmw) adapter).AEQbTJ(i);
        if (objAEQbTJ instanceof ExchangeSelectCoinBean) {
            return (ExchangeSelectCoinBean) objAEQbTJ;
        }
        return null;
    }
}
