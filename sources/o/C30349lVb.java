package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.view.cryptolist.ConvertListItem;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30349lVb extends lUN<ConvertListItem.ConvertToCryptoListItem, lxC> {
    public final Function1<ConvertListItem.ConvertToCryptoListItem, Unit> EZpvd;
    public final boolean KWHzl;
    public final java.lang.String copydefault;

    /* JADX INFO: renamed from: o.lVb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ConvertListItem.ConvertToCryptoListItem.PercentageChange.values().length];
            try {
                iArr[ConvertListItem.ConvertToCryptoListItem.PercentageChange.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ConvertListItem.ConvertToCryptoListItem.PercentageChange.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ConvertListItem.ConvertToCryptoListItem.PercentageChange.NO_CHANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    @Override // o.lUN
    public /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        KWHzl((ConvertListItem.ConvertToCryptoListItem) cryptoListItem, (C43312rms<lxC>) c43312rms);
    }

    @Override // o.AbstractC59533zio
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.Object obj, java.util.List list) {
        copydefault((C43312rms<lxC>) viewHolder, (ConvertListItem.ConvertToCryptoListItem) obj, (java.util.List<java.lang.Object>) list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.ConvertListItem$ConvertToCryptoListItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30349lVb(boolean z, @NotNull Function1<? super ConvertListItem.ConvertToCryptoListItem, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.dUDNAs);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = z;
        this.EZpvd = function1;
        this.copydefault = str;
    }

    public void KWHzl(@NotNull final ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem, @NotNull C43312rms<lxC> c43312rms) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(convertToCryptoListItem, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        C55021xcA c55021xcA = ((lxC) c43312rms.OLrzqt()).AEQbTJ;
        C33054mpH.loadUrl$default(c55021xcA.gEmmrt(), convertToCryptoListItem.AEQbTJ(), null, 0, 0, 14, null);
        c55021xcA.gEmmrt().setBorderSize(0.0f);
        c55021xcA.gEmmrt().setLayoutParams(new LinearLayout.LayoutParams(c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OqFWZa), c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.wlaJM)));
        if (this.KWHzl) {
            C55021xcA.setCryptoText$default(c55021xcA, convertToCryptoListItem.getCryptoName(), null, 2, null);
            c55021xcA.KWHzl().setText(convertToCryptoListItem.getCryptoId());
        } else {
            C55021xcA.setCryptoText$default(c55021xcA, convertToCryptoListItem.getCryptoId(), null, 2, null);
            c55021xcA.KWHzl().setText(convertToCryptoListItem.getCryptoName());
        }
        c55021xcA.AYXKKw().setText(convertToCryptoListItem.EZpvd());
        android.widget.TextView textViewValues = c55021xcA.values();
        if (this.KWHzl && convertToCryptoListItem.valueOf()) {
            textViewValues.setVisibility(8);
            textViewValues.setText("");
        } else {
            textViewValues.setVisibility(0);
            textViewValues.setText(convertToCryptoListItem.KWHzl());
            int i = TaskDescription.copydefault[convertToCryptoListItem.copydefault().ordinal()];
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
        }
        c55021xcA.setBackground(Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) convertToCryptoListItem.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        c55021xcA.setOnClickListener(new View.OnClickListener() { // from class: o.lUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30349lVb.copydefault(this.EZpvd, convertToCryptoListItem, view);
            }
        });
    }

    public static final void copydefault(C30349lVb c30349lVb, ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem, android.view.View view) {
        c30349lVb.EZpvd.invoke(convertToCryptoListItem);
    }

    public void copydefault(@NotNull C43312rms<lxC> c43312rms, @NotNull ConvertListItem.ConvertToCryptoListItem convertToCryptoListItem, @NotNull java.util.List<java.lang.Object> list) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(convertToCryptoListItem, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(c43312rms, convertToCryptoListItem, list);
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
            java.lang.String string2 = bundle.getString("percentage_diff");
            if (string2 != null) {
                textViewValues.setText(string2);
            }
            java.lang.String string3 = bundle.getString("percentage_change_diff");
            if (string3 != null) {
                int i = TaskDescription.copydefault[ConvertListItem.ConvertToCryptoListItem.PercentageChange.valueOf(string3).ordinal()];
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
        super.onBindViewHolder(c43312rms, convertToCryptoListItem, list);
        Unit unit2 = Unit.INSTANCE;
    }
}
