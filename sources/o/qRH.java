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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qRH extends AbstractC40510qYn<qRT, C42889ret> {
    public final boolean AEQbTJ;
    public boolean EZpvd;
    public final CategoryGroupVo KWHzl;
    public final C41524qsT copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.EZpvd;
    }

    public qRH(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41524qsT c41524qsT, boolean z) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41524qsT, "");
        this.KWHzl = categoryGroupVo;
        this.copydefault = c41524qsT;
        this.AEQbTJ = z;
        this.EZpvd = true;
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
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42889ret c42889ret, int i, @NotNull qRT qrt) {
        java.lang.String strGEmmrt;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String strGEmmrt2;
        Intrinsics.checkNotNullParameter(c42889ret, "");
        Intrinsics.checkNotNullParameter(qrt, "");
        C41518qsN c41518qsN = (C41518qsN) this.copydefault.KWHzl(qrt);
        java.lang.CharSequence charSequenceOLrzqt = c41518qsN.OLrzqt();
        UpDownColor upDownColorAEQbTJ = c41518qsN.AEQbTJ();
        java.lang.CharSequence charSequenceCopydefault = c41518qsN.copydefault();
        java.lang.CharSequence charSequenceEZpvd = c41518qsN.EZpvd();
        AppCompatImageView appCompatImageView = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(this.AEQbTJ ? 0 : 8);
        c42889ret.EZpvd.setSelected(qrt.DbNXlk());
        AppCompatImageView appCompatImageView2 = c42889ret.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        java.lang.String strCopydefault = qrt.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView2, strCopydefault);
        CountDownInfo countDownInfo = qrt.values().getCountDownInfo();
        C40492qXw c40492qXw = c42889ret.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        boolean zAEQbTJ = C41310qoR.AEQbTJ(c40492qXw, countDownInfo, qrt.values().getInstId(), qrt.values().getInstType());
        C40492qXw c40492qXw2 = c42889ret.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
        c40492qXw2.setVisibility(zAEQbTJ ? 0 : 8);
        c42889ret.AEQbTJ.setPriceLayoutVisible(!zAEQbTJ);
        C40358qSx c40358qSx = c42889ret.AEQbTJ;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(qrt.AYXKKw(), qrt.OLrzqt());
        java.util.List listEZpvd = (qrt.fetchVPNInfo() && C55608xnE.EZpvd()) ? C56402yEa.EZpvd(qrt.AEQbTJ()) : null;
        java.lang.String str = zAEQbTJ ? "" : (charSequenceCopydefault == null || (strGEmmrt = C33129mqd.gEmmrt(charSequenceCopydefault)) == null) ? "--" : strGEmmrt;
        if (zAEQbTJ) {
            string = "";
        } else {
            if (charSequenceOLrzqt == null) {
                charSequenceOLrzqt = "--";
            }
            string = charSequenceOLrzqt.toString();
        }
        UpDownColor upDownColor = zAEQbTJ ? null : upDownColorAEQbTJ;
        AppCompatImageView appCompatImageView3 = c42889ret.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        boolean z = appCompatImageView3.getVisibility() == 0;
        AppCompatImageView appCompatImageView4 = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
        c40358qSx.setData(pairOLrzqt, listEZpvd, "", str, string, upDownColor, z, appCompatImageView4.getVisibility() == 0, qrt.values().isNewTag() && copydefault(), qrt.values().isNewLabel() && ((strGEmmrt2 = qrt.gEmmrt()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt2)), (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : (charSequenceEZpvd == null || (string2 = charSequenceEZpvd.toString()) == null) ? "" : string2, (195584 & 131072) != 0 ? null : null);
        AppCompatImageView appCompatImageView5 = c42889ret.EZpvd;
        appCompatImageView5.setOnClickListener(new TaskDescription(appCompatImageView5, 1000L, qrt, c42889ret));
        ConstraintLayout root = c42889ret.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, i, qrt, c42889ret));
    }

    public final int KWHzl(qRT qrt) {
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = -1;
        for (java.lang.Object obj : items) {
            if (obj instanceof qRT) {
                qRT qrt2 = (qRT) obj;
                if (Intrinsics.EZpvd((java.lang.Object) qrt2.values().getInstType(), (java.lang.Object) qrt.values().getInstType())) {
                    i++;
                    Intrinsics.EZpvd((java.lang.Object) qrt2.values().getInstId(), (java.lang.Object) qrt.values().getInstId());
                }
            }
        }
        return i;
    }

    public java.lang.String EZpvd() {
        return C27989kKu.Companion.djBIcL();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ qRT AEQbTJ;
        public final /* synthetic */ qRH AYXKKw;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C42889ret OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, qRH qrh, int i, qRT qrt, C42889ret c42889ret) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AYXKKw = qrh;
            this.EZpvd = i;
            this.AEQbTJ = qrt;
            this.OLrzqt = c42889ret;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String strEZpvd = this.AYXKKw.EZpvd();
                int iKWHzl = Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) C27989kKu.Companion.djBIcL()) ? this.EZpvd : this.AYXKKw.KWHzl(this.AEQbTJ);
                java.lang.String strGEmmrt = this.AEQbTJ.gEmmrt();
                boolean z = strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt);
                NavSearchSP navSearchSP = NavSearchSP.EZpvd;
                java.lang.String instId = this.AEQbTJ.values().getInstId();
                java.lang.String instType = this.AEQbTJ.values().getInstType();
                java.lang.String id = this.AYXKKw.KWHzl.gEmmrt().getId();
                if (id == null) {
                    id = "";
                }
                navSearchSP.OLrzqt(new NavSearchSP.L2TabRecord(instId, instType, id));
                ConstraintLayout root = this.OLrzqt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    ConstraintLayout root2 = this.OLrzqt.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    qplAEQbTJ.KWHzl(root2, this.AEQbTJ.values(), iKWHzl, strEZpvd, "SPOT", this.AYXKKw.KWHzl.gEmmrt().getType(), !z);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C42889ret KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ qRT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, qRT qrt, C42889ret c42889ret) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = qrt;
            this.KWHzl = c42889ret;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.DbNXlk()) {
                    AppCompatImageView appCompatImageView = this.KWHzl.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    qKN qknOLrzqt = qKO.OLrzqt(appCompatImageView);
                    if (qknOLrzqt != null) {
                        qknOLrzqt.KWHzl(this.copydefault.values());
                    }
                    AppCompatImageView appCompatImageView2 = this.KWHzl.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                    qPT qptKWHzl = qPU.KWHzl(appCompatImageView2);
                    if (qptKWHzl != null) {
                        qptKWHzl.djBIcL(C27989kKu.Companion.isConnected());
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView3 = this.KWHzl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                qKN qknOLrzqt2 = qKO.OLrzqt(appCompatImageView3);
                if (qknOLrzqt2 != null) {
                    qknOLrzqt2.OLrzqt(this.copydefault.values());
                }
                AppCompatImageView appCompatImageView4 = this.KWHzl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                qPT qptKWHzl2 = qPU.KWHzl(appCompatImageView4);
                if (qptKWHzl2 != null) {
                    qptKWHzl2.djBIcL(C27989kKu.Companion.copydefault());
                }
            }
        }
    }
}
