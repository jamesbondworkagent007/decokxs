package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.okex.lite_market_api.DexUtils;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lUP extends lUN<CryptoListItem.BuyDexListItem, AbstractC31576lwe> {
    public final Function1<CryptoListItem.BuyDexListItem, Unit> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final double copydefault;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CryptoListItem.BuyDexListItem.PercentageChange.values().length];
            try {
                iArr[CryptoListItem.BuyDexListItem.PercentageChange.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoListItem.BuyDexListItem.PercentageChange.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoListItem.BuyDexListItem.PercentageChange.NO_CHANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.lUN
    public /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        KWHzl((CryptoListItem.BuyDexListItem) cryptoListItem, (C43312rms<AbstractC31576lwe>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.CryptoListItem$BuyDexListItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lUP(@NotNull Function1<? super CryptoListItem.BuyDexListItem, Unit> function1, @NotNull java.lang.String str, double d, @NotNull java.lang.String str2) {
        super(C31351lsQ.ActionBar.hUfVAv);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = function1;
        this.EZpvd = str;
        this.copydefault = d;
        this.KWHzl = str2;
    }

    public void KWHzl(@NotNull final CryptoListItem.BuyDexListItem buyDexListItem, @NotNull C43312rms<AbstractC31576lwe> c43312rms) {
        android.graphics.drawable.Drawable drawable;
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(buyDexListItem, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31576lwe abstractC31576lwe = (AbstractC31576lwe) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC31576lwe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, buyDexListItem.AEQbTJ().getIcon(), C52761wXj.TaskDescription.aHXSQp);
        android.widget.ImageView imageView2 = abstractC31576lwe.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C33054mpH.EZpvd(imageView2, buyDexListItem.AEQbTJ().getDexInfo().getChainLogo(), C52761wXj.TaskDescription.fERRXa);
        abstractC31576lwe.values.setText(buyDexListItem.AEQbTJ().getCurrencyName());
        abstractC31576lwe.OLrzqt.setVisibility(8);
        int i = C31351lsQ.Activity.values;
        DexUtils dexUtils = DexUtils.EZpvd;
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("marketCap", DexUtils.getFormattedMarketCap$default(dexUtils, buyDexListItem.AEQbTJ().getDexInfo().getMarketCap(), null, 2, null))));
        abstractC31576lwe.isConnected.setText(buyDexListItem.getCryptoName() + " · " + strCopydefault);
        abstractC31576lwe.AkhnZx.setText(buyDexListItem.EZpvd());
        android.widget.TextView textView = abstractC31576lwe.valueOf;
        textView.setVisibility(0);
        textView.setText((java.lang.CharSequence) dexUtils.EZpvd(buyDexListItem.KWHzl(), (62 & 2) != 0 ? 2 : 0, (62 & 4) == 0 ? 0 : 2, (62 & 8) != 0 ? RoundingMode.HALF_UP : null, (62 & 16) != 0 ? java.util.Locale.getDefault() : null, (62 & 32) != 0 ? 1.0d : AudioStats.AUDIO_AMPLITUDE_NONE).getFirst());
        int i2 = Activity.OLrzqt[buyDexListItem.OLrzqt().ordinal()];
        if (i2 == 1) {
            drawable = null;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        } else if (i2 == 2) {
            drawable = null;
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeRiseDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable = null;
            iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp3, context3, 0.0f, 2, null);
        }
        textView.setTextColor(iTradeRiseDefault$default);
        android.widget.ImageView imageView3 = abstractC31576lwe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(buyDexListItem.AEQbTJ().getDexInfo().getCommunityRecognized() ? 0 : 8);
        abstractC31576lwe.EZpvd.setBackground(Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) buyDexListItem.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : drawable);
        abstractC31576lwe.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lUW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lUP.KWHzl(this.OLrzqt, buyDexListItem, view);
            }
        });
    }

    public static final void KWHzl(lUP lup, CryptoListItem.BuyDexListItem buyDexListItem, android.view.View view) {
        lup.AEQbTJ.invoke(buyDexListItem);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31576lwe> c43312rms, @NotNull CryptoListItem.BuyDexListItem buyDexListItem, @NotNull java.util.List<java.lang.Object> list) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(buyDexListItem, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(c43312rms, buyDexListItem, list);
            Unit unit = Unit.INSTANCE;
            return;
        }
        java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        android.os.Bundle bundle = objAuCTelauCTel instanceof android.os.Bundle ? (android.os.Bundle) objAuCTelauCTel : null;
        if (bundle != null) {
            AbstractC31576lwe abstractC31576lwe = (AbstractC31576lwe) c43312rms.OLrzqt();
            java.lang.String string = bundle.getString("price_diff");
            if (string != null) {
                abstractC31576lwe.AkhnZx.setText(string);
            }
            android.widget.TextView textView = abstractC31576lwe.valueOf;
            textView.setVisibility(0);
            java.lang.String string2 = bundle.getString("percentage_diff");
            if (string2 != null) {
                textView.setText(string2);
            }
            java.lang.String string3 = bundle.getString("percentage_change_diff");
            if (string3 != null) {
                int i = Activity.OLrzqt[CryptoListItem.BuyDexListItem.PercentageChange.valueOf(string3).ordinal()];
                if (i == 1) {
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    android.content.Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
                } else if (i == 2) {
                    C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                    android.content.Context context2 = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iTradeRiseDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                    android.content.Context context3 = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp3, context3, 0.0f, 2, null);
                }
                textView.setTextColor(iTradeRiseDefault$default);
            }
            if (abstractC31576lwe != null) {
                return;
            }
        }
        super.onBindViewHolder(c43312rms, buyDexListItem, list);
        Unit unit2 = Unit.INSTANCE;
    }
}
