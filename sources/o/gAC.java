package o;

import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gAC extends C43318rmy<CoinAndAddressHistoryDetail, AbstractC16745epi> {
    public final Activity AEQbTJ;
    public final gAI KWHzl;

    public interface Activity {
        void OLrzqt(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gAC(@NotNull Activity activity) {
        super(C13754dXa.TaskDescription.DcMfJKDcMfJK, 0);
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ = activity;
        this.KWHzl = new gAI();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16745epi> c43312rms, @NotNull final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        boolean z;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        final AbstractC16745epi abstractC16745epi = (AbstractC16745epi) c43312rms.OLrzqt();
        this.KWHzl.EZpvd(coinAndAddressHistoryDetail, new yHO() { // from class: o.gAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return gAC.EZpvd(abstractC16745epi, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        int txStatus = coinAndAddressHistoryDetail.getTxStatus();
        if (txStatus == 2) {
            abstractC16745epi.copydefault.setVisibility(8);
            z = true;
        } else {
            if (txStatus != 3) {
                if (txStatus != 4) {
                    if (txStatus == 6) {
                        abstractC16745epi.copydefault.setStatus(7);
                    } else {
                        abstractC16745epi.getRoot().setVisibility(8);
                        return;
                    }
                }
                abstractC16745epi.copydefault.setVisibility(8);
                z = true;
            } else {
                abstractC16745epi.copydefault.setStatus(4);
            }
            z = false;
        }
        abstractC16745epi.AhwBna.setText(coinAndAddressHistoryDetail.getCoinSymbol());
        gAI gai = this.KWHzl;
        C15503eKt c15503eKt = abstractC16745epi.valueOf;
        Intrinsics.checkNotNullExpressionValue(c15503eKt, "");
        gai.KWHzl(coinAndAddressHistoryDetail, z, c15503eKt);
        gAI gai2 = this.KWHzl;
        android.widget.TextView textView = abstractC16745epi.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        gai2.copydefault(coinAndAddressHistoryDetail, textView);
        gAI gai3 = this.KWHzl;
        AppCompatImageView appCompatImageView = abstractC16745epi.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String tipsType = coinAndAddressHistoryDetail.getTipsType();
        gai3.EZpvd(appCompatImageView, tipsType != null ? tipsType : "");
        C8003auW.copydefault(abstractC16745epi.getRoot()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.gAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAC.AEQbTJ(this.copydefault, coinAndAddressHistoryDetail, obj);
            }
        });
    }

    public static final Unit EZpvd(AbstractC16745epi abstractC16745epi, int i, java.lang.String str, java.lang.String str2) {
        android.graphics.drawable.Drawable drawable;
        abstractC16745epi.EZpvd.setImageResource(i);
        android.graphics.drawable.Drawable drawable2 = abstractC16745epi.EZpvd.getDrawable();
        LayerDrawable layerDrawable = drawable2 instanceof LayerDrawable ? (LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(1)) != null) {
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        abstractC16745epi.gEmmrt.setFixAutoSizeText(str);
        if (str2 == null || str2.length() == 0) {
            abstractC16745epi.KWHzl.setVisibility(8);
        } else {
            abstractC16745epi.KWHzl.setVisibility(0);
            abstractC16745epi.KWHzl.setText(str2);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(gAC gac, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.Object obj) {
        gac.AEQbTJ.OLrzqt(coinAndAddressHistoryDetail);
    }
}
