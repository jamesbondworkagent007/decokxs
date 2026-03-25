package o;

import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.uilab.reminder.OKReminder;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gAD extends C43318rmy<CoinAndAddressHistoryDetail, AbstractC16742epf> {
    public final gAI EZpvd;
    public final TaskDescription KWHzl;

    public interface TaskDescription {
        void AEQbTJ(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);

        void EZpvd(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);

        void KWHzl(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);

        void OLrzqt(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);

        void copydefault(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gAD(@NotNull TaskDescription taskDescription) {
        super(C13754dXa.TaskDescription.jh, 0);
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl = taskDescription;
        this.EZpvd = new gAI();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16742epf> c43312rms, @NotNull final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        final AbstractC16742epf abstractC16742epf = (AbstractC16742epf) c43312rms.OLrzqt();
        this.EZpvd.EZpvd(coinAndAddressHistoryDetail, new yHO() { // from class: o.gAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return gAD.OLrzqt(abstractC16742epf, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        gAI gai = this.EZpvd;
        AppCompatImageView appCompatImageView = abstractC16742epf.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String tipsType = coinAndAddressHistoryDetail.getTipsType();
        if (tipsType == null) {
            tipsType = "";
        }
        gai.EZpvd(appCompatImageView, tipsType);
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(coinAndAddressHistoryDetail.getMainCoinId());
        if (((c10854bwMKWHzl == null || !c10854bwMKWHzl.QkdxfA()) && coinAndAddressHistoryDetail.getCoinId() > 0) || coinAndAddressHistoryDetail.isShowPending()) {
            abstractC16742epf.DbNXlk.setVisibility(0);
            abstractC16742epf.DbNXlk.setText(pTA.formatSimpleDateTime$default(new Date(coinAndAddressHistoryDetail.getTxTime()), null, 1, null));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getPendingToastInfo())) {
                abstractC16742epf.isConnected.setVisibility(0);
                abstractC16742epf.isConnected.setLeadingIconVisibility(false);
                abstractC16742epf.isConnected.setCloseIconVisibility(false);
                OKReminder oKReminder = abstractC16742epf.isConnected;
                C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(coinAndAddressHistoryDetail.getMainCoinId());
                int i = (c10854bwMKWHzl2 == null || c10854bwMKWHzl2.QkdxfA() || !c10854bwMKWHzl2.iRxXKY()) ? C13754dXa.FragmentManager.ActivityResultRegistry1 : C13754dXa.FragmentManager.register;
                oKReminder.setMessage(C33070mpX.AYXKKw(i));
            } else {
                abstractC16742epf.isConnected.setVisibility(8);
            }
            int repeatTxType = coinAndAddressHistoryDetail.getRepeatTxType();
            if (repeatTxType != 0) {
                if (repeatTxType == 1) {
                    abstractC16742epf.gEmmrt.setStatus(2);
                } else if (repeatTxType == 2 || repeatTxType == 3) {
                    abstractC16742epf.gEmmrt.setStatus(3);
                } else {
                    abstractC16742epf.gEmmrt.setStatus(1);
                }
            } else if (coinAndAddressHistoryDetail.getTxStatus() == 5) {
                abstractC16742epf.gEmmrt.setStatus(6);
            } else {
                abstractC16742epf.gEmmrt.setStatus(1);
            }
            abstractC16742epf.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        } else {
            abstractC16742epf.gEmmrt.setStatus(0);
            abstractC16742epf.DbNXlk.setVisibility(8);
            abstractC16742epf.isConnected.setVisibility(8);
            abstractC16742epf.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        java.lang.Integer claimableStatus = coinAndAddressHistoryDetail.getClaimableStatus();
        if (claimableStatus != null && claimableStatus.intValue() == 1) {
            abstractC16742epf.DbNXlk.setVisibility(8);
            abstractC16742epf.isConnected.setVisibility(8);
            abstractC16742epf.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else if (claimableStatus != null && claimableStatus.intValue() == 2) {
            abstractC16742epf.gEmmrt.setStatus(8);
            abstractC16742epf.DbNXlk.setVisibility(8);
            abstractC16742epf.isConnected.setVisibility(8);
            abstractC16742epf.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else if (claimableStatus != null && claimableStatus.intValue() == 3) {
            abstractC16742epf.gEmmrt.setStatus(9);
            abstractC16742epf.DbNXlk.setVisibility(8);
            abstractC16742epf.isConnected.setVisibility(8);
            abstractC16742epf.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        abstractC16742epf.KWHzl.setVisibility((coinAndAddressHistoryDetail.isShowCancel() && C15487eKd.AEQbTJ.EZpvd(coinAndAddressHistoryDetail.getTxType())) ? 0 : 8);
        abstractC16742epf.copydefault.setVisibility((coinAndAddressHistoryDetail.isShowSpeedUp() && C15487eKd.AEQbTJ.EZpvd(coinAndAddressHistoryDetail.getTxType())) ? 0 : 8);
        abstractC16742epf.OLrzqt.setVisibility((coinAndAddressHistoryDetail.isShowSpeedupCancel() && C15487eKd.AEQbTJ.EZpvd(coinAndAddressHistoryDetail.getTxType())) ? 0 : 8);
        C52794wYp c52794wYp = abstractC16742epf.AEQbTJ;
        java.lang.Integer claimableStatus2 = coinAndAddressHistoryDetail.getClaimableStatus();
        c52794wYp.setVisibility((claimableStatus2 != null && claimableStatus2.intValue() == 2 && C15487eKd.AEQbTJ.EZpvd(coinAndAddressHistoryDetail.getTxType())) ? 0 : 8);
        abstractC16742epf.values.setText(coinAndAddressHistoryDetail.getCoinSymbol());
        gAI gai2 = this.EZpvd;
        C15503eKt c15503eKt = abstractC16742epf.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c15503eKt, "");
        gai2.KWHzl(coinAndAddressHistoryDetail, true, c15503eKt);
        gAI gai3 = this.EZpvd;
        C15503eKt c15503eKt2 = abstractC16742epf.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c15503eKt2, "");
        gai3.copydefault(coinAndAddressHistoryDetail, c15503eKt2);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16742epf.getRoot());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAD.AhwBna(this.AEQbTJ, coinAndAddressHistoryDetail, obj);
            }
        });
        C8003auW.copydefault(abstractC16742epf.copydefault).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAD.gEmmrt(this.EZpvd, coinAndAddressHistoryDetail, obj);
            }
        });
        C8003auW.copydefault(abstractC16742epf.KWHzl).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAD.AYXKKw(this.KWHzl, coinAndAddressHistoryDetail, obj);
            }
        });
        C8003auW.copydefault(abstractC16742epf.OLrzqt).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAD.djBIcL(this.copydefault, coinAndAddressHistoryDetail, obj);
            }
        });
        C8003auW.copydefault(abstractC16742epf.AEQbTJ).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAD.valueOf(this.KWHzl, coinAndAddressHistoryDetail, obj);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC16742epf abstractC16742epf, int i, java.lang.String str, java.lang.String str2) {
        android.graphics.drawable.Drawable drawable;
        abstractC16742epf.valueOf.setImageResource(i);
        android.graphics.drawable.Drawable drawable2 = abstractC16742epf.valueOf.getDrawable();
        LayerDrawable layerDrawable = drawable2 instanceof LayerDrawable ? (LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(1)) != null) {
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        abstractC16742epf.fetchVPNInfo.setFixAutoSizeText(str);
        if (str2 == null || str2.length() == 0) {
            abstractC16742epf.AhwBna.setVisibility(8);
        } else {
            abstractC16742epf.AhwBna.setVisibility(0);
            abstractC16742epf.AhwBna.setText(str2);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(gAD gad, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.Object obj) {
        gad.KWHzl.KWHzl(coinAndAddressHistoryDetail);
    }

    public static final void gEmmrt(gAD gad, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.Object obj) {
        gad.KWHzl.AEQbTJ(coinAndAddressHistoryDetail);
    }

    public static final void AYXKKw(gAD gad, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.Object obj) {
        gad.KWHzl.copydefault(coinAndAddressHistoryDetail);
    }

    public static final void djBIcL(gAD gad, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.Object obj) {
        gad.KWHzl.EZpvd(coinAndAddressHistoryDetail);
    }

    public static final void valueOf(gAD gad, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.Object obj) {
        gad.KWHzl.OLrzqt(coinAndAddressHistoryDetail);
    }
}
