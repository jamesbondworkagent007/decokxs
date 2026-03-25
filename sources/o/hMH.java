package o;

import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import com.okinc.business.dexui.main.limitorder.orderdetail.itemviewbinding.LimitRadioOrderItemViewBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMH extends AbstractC25436iwg<C21805hMz, C21479hAx> {
    public hMH() {
        super(LimitRadioOrderItemViewBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21479hAx> c25435iwf, @NotNull final C21805hMz c21805hMz) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c21805hMz, "");
        android.content.Context context = c25435iwf.itemView.getContext();
        if (c21805hMz.KWHzl() != null) {
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setTipsInfoVisible(0);
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setOnTitleTipClickListener(new Function0() { // from class: o.hMN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hMH.EZpvd(c21805hMz);
                }
            });
        } else {
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setTipsInfoVisible(8);
        }
        java.lang.String strAEQbTJ = c21805hMz.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_TRIGGER_RATE.getValue())) {
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.copydefault(!C22689hkB.EZpvd.EZpvd(c21805hMz.OLrzqt().getTriggerInfo().getTriggerRate()));
            hWZ hwz = ((C21479hAx) c25435iwf.EZpvd()).OLrzqt;
            java.lang.String string = c25435iwf.itemView.getContext().getString(C23274hvD.Fragment.PlaybackStateCompatMediaKeyAction);
            Intrinsics.checkNotNullExpressionValue(string, "");
            hwz.setRateTitle(string);
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setRadioTag(true);
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setRadioInfo(C22481hgF.copydefault.AEQbTJ(c21805hMz.OLrzqt(), true));
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.copydefault(c21805hMz.OLrzqt(), true);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_EXECUTION_RATE.getValue())) {
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.copydefault(!C22689hkB.EZpvd.EZpvd(c21805hMz.OLrzqt().getTransactionInfo().getTransactionRate()));
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setRadioTag(true);
            hWZ hwz2 = ((C21479hAx) c25435iwf.EZpvd()).OLrzqt;
            java.lang.String string2 = context.getString(C23274hvD.Fragment.onPlaybackStateChanged);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            hwz2.setRateTitle(string2);
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.setRadioInfo(C22481hgF.copydefault.EZpvd(c21805hMz.OLrzqt(), true));
            ((C21479hAx) c25435iwf.EZpvd()).OLrzqt.copydefault(c21805hMz.OLrzqt(), false);
        }
    }

    public static final Unit EZpvd(C21805hMz c21805hMz) {
        Function0<Unit> function0KWHzl = c21805hMz.KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }
}
