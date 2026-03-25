package o;

import android.view.View;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
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
public final class lUR extends lUN<CryptoListItem.BuyCryptoListItem, lxC> {
    public final Function1<CryptoListItem.BuyCryptoListItem, Unit> AEQbTJ;
    public final boolean KWHzl;
    public final java.lang.String copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CryptoListItem.BuyCryptoListItem.PercentageChange.values().length];
            try {
                iArr[CryptoListItem.BuyCryptoListItem.PercentageChange.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoListItem.BuyCryptoListItem.PercentageChange.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoListItem.BuyCryptoListItem.PercentageChange.NO_CHANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.lUN
    public /* bridge */ /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        EZpvd((CryptoListItem.BuyCryptoListItem) cryptoListItem, (C43312rms<lxC>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.CryptoListItem$BuyCryptoListItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lUR(boolean z, @NotNull Function1<? super CryptoListItem.BuyCryptoListItem, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.dUDNAs);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = z;
        this.AEQbTJ = function1;
        this.copydefault = str;
    }

    public final void AEQbTJ(C55021xcA c55021xcA, java.lang.String str) {
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_ONE_CLICK_EARN)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                android.content.Context context = c55021xcA.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
                c55251xgS.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.RdAHlO), C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pTB.formatICUPercent$default(C33129mqd.copydefault(str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 28, null)))));
                c55251xgS.setOKDSStyle(7);
                c55021xcA.setCryptoExtraView(c55251xgS);
                return;
            }
            if (c55021xcA.djBIcL() != null) {
                c55021xcA.setCryptoExtraView(null);
            }
        }
    }

    public final android.text.SpannableString AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (!C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_ONE_CLICK_EARN)) {
            return new android.text.SpannableString(str);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "0")) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str + " · " + C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.RdAHlO), C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pTB.formatICUPercent$default(C33129mqd.copydefault(str2), null, C38307pTy.Companion.AEQbTJ(2), null, null, null, 29, null)))));
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPiaHEvk)), str.length() + 2, spannableString.length(), 33);
            return spannableString;
        }
        return new android.text.SpannableString(str);
    }

    public void EZpvd(@NotNull final CryptoListItem.BuyCryptoListItem buyCryptoListItem, @NotNull C43312rms<lxC> c43312rms) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(buyCryptoListItem, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        C55021xcA c55021xcA = ((lxC) c43312rms.OLrzqt()).AEQbTJ;
        c55021xcA.gEmmrt().setTokens(buyCryptoListItem.KWHzl());
        c55021xcA.gEmmrt().setBorderSize(0.0f);
        if (this.KWHzl) {
            C55021xcA.setCryptoText$default(c55021xcA, buyCryptoListItem.getCryptoName(), null, 2, null);
            android.widget.TextView textViewKWHzl = c55021xcA.KWHzl();
            android.content.Context context = c55021xcA.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textViewKWHzl.setText(AEQbTJ(context, buyCryptoListItem.getCryptoId(), C33129mqd.gEmmrt(buyCryptoListItem.AEQbTJ())));
        } else {
            C55021xcA.setCryptoText$default(c55021xcA, buyCryptoListItem.getCryptoId(), null, 2, null);
            c55021xcA.KWHzl().setText(buyCryptoListItem.getCryptoName());
            Intrinsics.copydefault(c55021xcA);
            AEQbTJ(c55021xcA, buyCryptoListItem.AEQbTJ());
        }
        c55021xcA.AYXKKw().setText(buyCryptoListItem.gEmmrt());
        android.widget.TextView textViewValues = c55021xcA.values();
        if (this.KWHzl && buyCryptoListItem.AhwBna()) {
            textViewValues.setVisibility(8);
            textViewValues.setText("");
        } else {
            textViewValues.setVisibility(0);
            textViewValues.setText(buyCryptoListItem.OLrzqt());
            int i = Application.AEQbTJ[buyCryptoListItem.copydefault().ordinal()];
            if (i == 1) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context2 = textViewValues.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null);
            } else if (i == 2) {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context3 = textViewValues.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iTradeRiseDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context3, 0.0f, 2, null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                android.content.Context context4 = textViewValues.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp3, context4, 0.0f, 2, null);
            }
            textViewValues.setTextColor(iTradeRiseDefault$default);
        }
        c55021xcA.setBackground(Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) buyCryptoListItem.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        c55021xcA.setOnClickListener(new View.OnClickListener() { // from class: o.lUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lUR.copydefault(this.KWHzl, buyCryptoListItem, view);
            }
        });
    }

    public static final void copydefault(lUR lur, CryptoListItem.BuyCryptoListItem buyCryptoListItem, android.view.View view) {
        lur.AEQbTJ.invoke(buyCryptoListItem);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<lxC> c43312rms, @NotNull CryptoListItem.BuyCryptoListItem buyCryptoListItem, @NotNull java.util.List<java.lang.Object> list) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(buyCryptoListItem, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(c43312rms, buyCryptoListItem, list);
            Unit unit = Unit.INSTANCE;
            return;
        }
        java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        android.os.Bundle bundle = objAuCTelauCTel instanceof android.os.Bundle ? (android.os.Bundle) objAuCTelauCTel : null;
        if (bundle != null) {
            C55021xcA c55021xcA = ((lxC) c43312rms.OLrzqt()).AEQbTJ;
            java.lang.String string = bundle.getString("price_diff");
            if (string != null) {
                c55021xcA.AYXKKw().setText(string);
            }
            android.widget.TextView textViewValues = c55021xcA.values();
            boolean z = bundle.getBoolean("is_stablecoin_diff", buyCryptoListItem.AhwBna());
            if (this.KWHzl && z) {
                textViewValues.setVisibility(8);
                textViewValues.setText("");
                return;
            }
            textViewValues.setVisibility(0);
            java.lang.String string2 = bundle.getString("percentage_diff");
            if (string2 != null) {
                textViewValues.setText(string2);
            }
            java.lang.String string3 = bundle.getString("percentage_change_diff");
            if (string3 != null) {
                int i = Application.AEQbTJ[CryptoListItem.BuyCryptoListItem.PercentageChange.valueOf(string3).ordinal()];
                if (i == 1) {
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    android.content.Context context = textViewValues.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
                } else if (i == 2) {
                    C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                    android.content.Context context2 = textViewValues.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iTradeRiseDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                    android.content.Context context3 = textViewValues.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp3, context3, 0.0f, 2, null);
                }
                textViewValues.setTextColor(iTradeRiseDefault$default);
                return;
            }
            return;
        }
        super.onBindViewHolder(c43312rms, buyCryptoListItem, list);
        Unit unit2 = Unit.INSTANCE;
    }
}
