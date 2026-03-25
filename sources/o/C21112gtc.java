package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21112gtc extends C43318rmy<ExchangeSelectNetworkBean, AbstractC16877esH> {
    public final Activity EZpvd;

    /* JADX INFO: renamed from: o.gtc$Activity */
    public interface Activity {
        void KWHzl(ExchangeSelectNetworkBean exchangeSelectNetworkBean);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21112gtc(@NotNull Activity activity) {
        super(C13754dXa.TaskDescription.hcetpZ, 0);
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public C43312rms<AbstractC16877esH> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        final C43312rms<AbstractC16877esH> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
        C8003auW.copydefault(((AbstractC16877esH) c43312rmsOnCreateViewHolder.OLrzqt()).getRoot()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.gtb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21112gtc.OLrzqt(this.OLrzqt, c43312rmsOnCreateViewHolder, obj);
            }
        });
        return c43312rmsOnCreateViewHolder;
    }

    public static final void OLrzqt(C21112gtc c21112gtc, C43312rms c43312rms, java.lang.Object obj) {
        c21112gtc.EZpvd.KWHzl(c21112gtc.AEQbTJ(c43312rms.getLayoutPosition()));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16877esH> c43312rms, @NotNull final ExchangeSelectNetworkBean exchangeSelectNetworkBean) {
        java.lang.String lowerCase;
        java.lang.String lowerCase2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String valuation$default;
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(exchangeSelectNetworkBean, "");
        pUU.OLrzqt(">>>usdc onBindViewHolder ExchangeSelectNetworkBean:" + exchangeSelectNetworkBean);
        AbstractC16877esH abstractC16877esH = (AbstractC16877esH) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC16877esH.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.copydefault(imageView, exchangeSelectNetworkBean.getIcon(), C52761wXj.TaskDescription.aHXSQp, 1.0f, 24.0f);
        abstractC16877esH.copydefault.setText(exchangeSelectNetworkBean.getName());
        java.lang.String gasFee = exchangeSelectNetworkBean.getGasFee();
        if (gasFee == null) {
            android.widget.TextView textView = abstractC16877esH.valueOf;
            if (textView != null) {
                textView.setText("--");
            }
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) gasFee)) {
                gasFee = null;
            }
            if (gasFee != null) {
                android.widget.TextView textView2 = abstractC16877esH.valueOf;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = abstractC16877esH.valueOf;
                if (textView3 != null) {
                    int i = C13754dXa.FragmentManager.accesstrackPipAnimationHintViewpositionInWindow;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = C56390yDp.OLrzqt("gasFee", C54862xYb.EZpvd(exchangeSelectNetworkBean.getGasFee()));
                    java.lang.String gasFeeSymbol = exchangeSelectNetworkBean.getGasFeeSymbol();
                    if (gasFeeSymbol == null) {
                        gasFeeSymbol = "";
                    }
                    pairArr[1] = C56390yDp.OLrzqt("tokenname", gasFeeSymbol);
                    java.lang.String usdGasFee = exchangeSelectNetworkBean.getUsdGasFee();
                    if (usdGasFee == null || (bigDecimalEZpvd = C33129mqd.EZpvd(usdGasFee)) == null || (valuation$default = C54880xYt.formatValuation$default(bigDecimalEZpvd, 0, 0, null, CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, null, false, 55, null)) == null) {
                        valuation$default = "";
                    }
                    pairArr[2] = C56390yDp.OLrzqt("usdGasFee", valuation$default);
                    textView3.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
                }
            }
        }
        android.widget.TextView textView4 = abstractC16877esH.AEQbTJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcherKtaddCallbackcallback1);
        kotlin.Pair[] pairArr2 = new kotlin.Pair[1];
        java.lang.Integer estimatedArrivalTime = exchangeSelectNetworkBean.getEstimatedArrivalTime();
        pairArr2[0] = C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(estimatedArrivalTime != null ? estimatedArrivalTime.intValue() : 5));
        textView4.setText(C33069mpW.OLrzqt(strAYXKKw, C56424yEw.AYXKKw(pairArr2)));
        java.lang.String coinMetaSymbol = exchangeSelectNetworkBean.getCoinMetaSymbol();
        if (coinMetaSymbol == null || (string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) coinMetaSymbol).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        java.lang.String assetAccountWalletCurrencies = exchangeSelectNetworkBean.getAssetAccountWalletCurrencies();
        if (assetAccountWalletCurrencies == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) assetAccountWalletCurrencies).toString()) == null) {
            lowerCase2 = null;
        } else {
            lowerCase2 = string.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        }
        if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2) && C33129mqd.OLrzqt((java.lang.CharSequence) exchangeSelectNetworkBean.getCoinMetaAddress())) {
            AppCompatTextView appCompatTextView = abstractC16877esH.OLrzqt;
            android.content.Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i2 = C13754dXa.FragmentManager.applyFrozenState;
            kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
            java.lang.String coinMetaSymbol2 = exchangeSelectNetworkBean.getCoinMetaSymbol();
            if (coinMetaSymbol2 == null) {
                coinMetaSymbol2 = "";
            }
            android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(coinMetaSymbol2);
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
            spannableStringValueOf.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringValueOf.length(), 33);
            spannableStringValueOf.setSpan(android.graphics.Typeface.defaultFromStyle(1), 0, spannableStringValueOf.length(), 17);
            Unit unit = Unit.INSTANCE;
            pairArr3[0] = C56390yDp.OLrzqt("symbolName", spannableStringValueOf);
            android.text.SpannableString spannableStringValueOf2 = android.text.SpannableString.valueOf(C14079deg.getAddressStr$default(C14079deg.EZpvd, exchangeSelectNetworkBean.getCoinMetaAddress(), false, 2, null));
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf2, "");
            pairArr3[1] = C56390yDp.OLrzqt("network", spannableStringValueOf2);
            appCompatTextView.setText(C33069mpW.copydefault(context, i2, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(pairArr3)));
            appCompatTextView.setVisibility(0);
            abstractC16877esH.EZpvd.setVisibility(0);
        } else {
            abstractC16877esH.EZpvd.setVisibility(8);
            abstractC16877esH.OLrzqt.setVisibility(8);
        }
        C8003auW.copydefault(abstractC16877esH.getRoot()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.gsZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21112gtc.EZpvd(this.KWHzl, exchangeSelectNetworkBean, obj);
            }
        });
    }

    public static final void EZpvd(C21112gtc c21112gtc, ExchangeSelectNetworkBean exchangeSelectNetworkBean, java.lang.Object obj) {
        c21112gtc.EZpvd.KWHzl(exchangeSelectNetworkBean);
    }

    public final ExchangeSelectNetworkBean AEQbTJ(int i) {
        C59534zip adapter = getAdapter();
        Intrinsics.copydefault(adapter, "");
        java.lang.Object objAEQbTJ = ((C43316rmw) adapter).AEQbTJ(i);
        if (objAEQbTJ instanceof ExchangeSelectNetworkBean) {
            return (ExchangeSelectNetworkBean) objAEQbTJ;
        }
        return null;
    }
}
