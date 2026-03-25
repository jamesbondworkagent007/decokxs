package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.misc.sp.NavSearchSP;
import com.okinc.unify_trade.biz.CountDownInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43035rhg;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qLw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40168qLw extends AbstractC40510qYn<qLB, C42889ret> {
    public final CategoryGroupVo EZpvd;
    public boolean KWHzl;
    public final boolean OLrzqt;
    public final C41465qrN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.KWHzl;
    }

    public C40168qLw(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41465qrN c41465qrN, boolean z) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41465qrN, "");
        this.EZpvd = categoryGroupVo;
        this.copydefault = c41465qrN;
        this.OLrzqt = z;
        this.KWHzl = true;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42889ret AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42889ret c42889retKWHzl = C42889ret.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42889retKWHzl, "");
        return c42889retKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42889ret c42889ret, int i, @NotNull final qLB qlb) {
        java.util.List list;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c42889ret, "");
        Intrinsics.checkNotNullParameter(qlb, "");
        C41461qrJ c41461qrJ = (C41461qrJ) this.copydefault.OLrzqt((java.lang.Object) qlb);
        final java.lang.CharSequence charSequenceCopydefault = c41461qrJ.copydefault();
        java.lang.CharSequence charSequenceEZpvd = c41461qrJ.EZpvd();
        UpDownColor upDownColorOLrzqt = c41461qrJ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41461qrJ.KWHzl();
        final java.lang.CharSequence charSequenceAYXKKw = c41461qrJ.AYXKKw();
        AppCompatImageView appCompatImageView = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(this.OLrzqt ? 0 : 8);
        c42889ret.EZpvd.setSelected(qlb.DbNXlk());
        AppCompatImageView appCompatImageView2 = c42889ret.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        java.lang.String strOLrzqt = qlb.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView2, strOLrzqt);
        C40492qXw c40492qXw = c42889ret.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        c40492qXw.setVisibility(8);
        final boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) qlb.values().getInstType(), (java.lang.Object) "SWAP");
        if (zEZpvd) {
            java.util.List listAhwBna = yDY.AhwBna(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
            if (qlb.values().isPreMarketPair()) {
                listAhwBna.add(C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
            } else if (qlb.values().isRebasePair()) {
                listAhwBna.add(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
            }
            list = listAhwBna;
        } else {
            list = null;
        }
        CountDownInfo countDownInfo = qlb.values().getCountDownInfo();
        C40492qXw c40492qXw2 = c42889ret.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
        boolean zAEQbTJ = C41310qoR.AEQbTJ(c40492qXw2, countDownInfo, qlb.values().getInstId(), qlb.values().getInstType());
        C40492qXw c40492qXw3 = c42889ret.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw3, "");
        c40492qXw3.setVisibility(zAEQbTJ ? 0 : 8);
        c42889ret.AEQbTJ.setPriceLayoutVisible(!zAEQbTJ);
        if (zAEQbTJ) {
            final java.util.List list2 = list;
            c42889ret.KWHzl.post(new java.lang.Runnable() { // from class: o.qLu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C40168qLw.AEQbTJ(c42889ret, qlb, charSequenceCopydefault, list2, charSequenceAYXKKw, this, zEZpvd);
                }
            });
        } else {
            C40358qSx c40358qSx = c42889ret.AEQbTJ;
            if (qlb.values().isPreMarketPair() && !Intrinsics.EZpvd((java.lang.Object) qlb.values().getInstType(), (java.lang.Object) "SWAP")) {
                strGEmmrt = C33069mpW.copydefault(C43035rhg.Application.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C33129mqd.gEmmrt(charSequenceCopydefault))));
            } else {
                strGEmmrt = C33129mqd.gEmmrt(charSequenceCopydefault);
            }
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(strGEmmrt, "");
            if (charSequenceKWHzl == null || (strGEmmrt2 = C33129mqd.gEmmrt(charSequenceKWHzl)) == null) {
                strGEmmrt2 = "--";
            }
            pTF ptf = pTF.KWHzl;
            if (charSequenceEZpvd == null) {
                charSequenceEZpvd = "0";
            }
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(ptf.KWHzl(charSequenceEZpvd));
            AppCompatImageView appCompatImageView3 = c42889ret.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            boolean z = appCompatImageView3.getVisibility() == 0;
            AppCompatImageView appCompatImageView4 = c42889ret.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            c40358qSx.setData(pairOLrzqt, list, "", strGEmmrt2, strGEmmrt3, upDownColorOLrzqt, z, appCompatImageView4.getVisibility() == 0, qlb.values().isNewTag() && copydefault(), qlb.values().isNewLabel() && !qlb.values().isNewTag(), (195584 & 1024) != 0 ? null : zEZpvd ? java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD) : null, (195584 & 2048) != 0 ? null : zEZpvd ? java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ) : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : (charSequenceAYXKKw == null || (string = charSequenceAYXKKw.toString()) == null) ? "" : string, (195584 & 131072) != 0 ? null : null);
        }
        AppCompatImageView appCompatImageView5 = c42889ret.EZpvd;
        appCompatImageView5.setOnClickListener(new Application(appCompatImageView5, 1000L, qlb, c42889ret));
        ConstraintLayout root = c42889ret.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, i, qlb, c42889ret));
    }

    public static final void AEQbTJ(C42889ret c42889ret, qLB qlb, java.lang.CharSequence charSequence, java.util.List list, java.lang.CharSequence charSequence2, C40168qLw c40168qLw, boolean z) {
        java.lang.String strGEmmrt;
        java.lang.String string;
        java.lang.String string2;
        int width = c42889ret.KWHzl.getWidth();
        C40358qSx c40358qSx = c42889ret.AEQbTJ;
        if (qlb.values().isPreMarketPair() && !Intrinsics.EZpvd((java.lang.Object) qlb.values().getInstType(), (java.lang.Object) "SWAP")) {
            strGEmmrt = C33069mpW.copydefault(C43035rhg.Application.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C33129mqd.gEmmrt(charSequence))));
        } else {
            strGEmmrt = C33129mqd.gEmmrt(charSequence);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(strGEmmrt, "");
        if (charSequence2 == null || (string = charSequence2.toString()) == null) {
            string = "";
        }
        AppCompatImageView appCompatImageView = c42889ret.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        boolean z2 = appCompatImageView.getVisibility() == 0;
        AppCompatImageView appCompatImageView2 = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        c40358qSx.setData(pairOLrzqt, list, string, "", "", null, z2, appCompatImageView2.getVisibility() == 0, qlb.values().isNewTag() && c40168qLw.copydefault(), qlb.values().isNewLabel() && !qlb.values().isNewTag(), (195584 & 1024) != 0 ? null : z ? java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD) : null, (195584 & 2048) != 0 ? null : z ? java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ) : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : java.lang.Integer.valueOf(width), (65536 & 195584) != 0 ? null : (charSequence2 == null || (string2 = charSequence2.toString()) == null) ? "" : string2, (195584 & 131072) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: o.qLw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ qLB KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42889ret copydefault;
        public final /* synthetic */ C40168qLw gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C40168qLw c40168qLw, int i, qLB qlb, C42889ret c42889ret) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.gEmmrt = c40168qLw;
            this.EZpvd = i;
            this.KWHzl = qlb;
            this.copydefault = c42889ret;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.String strKWHzl = this.gEmmrt.KWHzl();
                int iAEQbTJ = Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) C27989kKu.Companion.djBIcL()) ? this.EZpvd : this.gEmmrt.AEQbTJ(this.KWHzl);
                java.lang.String strGEmmrt = this.KWHzl.gEmmrt();
                boolean z = strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt);
                NavSearchSP navSearchSP = NavSearchSP.EZpvd;
                java.lang.String instId = this.KWHzl.values().getInstId();
                java.lang.String instType = this.KWHzl.values().getInstType();
                java.lang.String id = this.gEmmrt.EZpvd.gEmmrt().getId();
                if (id == null) {
                    id = "";
                }
                navSearchSP.AEQbTJ(new NavSearchSP.L2TabRecord(instId, instType, id));
                ConstraintLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    ConstraintLayout root2 = this.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    qplAEQbTJ.KWHzl(root2, this.KWHzl.values(), iAEQbTJ, strKWHzl, "FUTURES", this.gEmmrt.EZpvd.gEmmrt().getType(), !z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qLw$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C42889ret OLrzqt;
        public final /* synthetic */ qLB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, qLB qlb, C42889ret c42889ret) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = qlb;
            this.OLrzqt = c42889ret;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.DbNXlk()) {
                    AppCompatImageView appCompatImageView = this.OLrzqt.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    qKN qknOLrzqt = qKO.OLrzqt(appCompatImageView);
                    if (qknOLrzqt != null) {
                        qknOLrzqt.KWHzl(this.copydefault.values());
                    }
                    AppCompatImageView appCompatImageView2 = this.OLrzqt.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                    qPT qptKWHzl = qPU.KWHzl(appCompatImageView2);
                    if (qptKWHzl != null) {
                        qptKWHzl.djBIcL(C27989kKu.Companion.isConnected());
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView3 = this.OLrzqt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                qKN qknOLrzqt2 = qKO.OLrzqt(appCompatImageView3);
                if (qknOLrzqt2 != null) {
                    qknOLrzqt2.OLrzqt(this.copydefault.values());
                }
                AppCompatImageView appCompatImageView4 = this.OLrzqt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                qPT qptKWHzl2 = qPU.KWHzl(appCompatImageView4);
                if (qptKWHzl2 != null) {
                    qptKWHzl2.djBIcL(C27989kKu.Companion.copydefault());
                }
            }
        }
    }

    public final int AEQbTJ(qLB qlb) {
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = -1;
        for (java.lang.Object obj : items) {
            if (obj instanceof qLB) {
                qLB qlb2 = (qLB) obj;
                if (Intrinsics.EZpvd((java.lang.Object) qlb2.values().getInstType(), (java.lang.Object) qlb.values().getInstType())) {
                    i++;
                    Intrinsics.EZpvd((java.lang.Object) qlb2.values().getInstId(), (java.lang.Object) qlb.values().getInstId());
                }
            }
        }
        return i;
    }

    public java.lang.String KWHzl() {
        return C27989kKu.Companion.djBIcL();
    }
}
