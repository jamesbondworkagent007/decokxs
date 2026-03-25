package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.ext.UpDownColor;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40112qJu extends AbstractC40510qYn<C40113qJv, C42889ret> {
    public static final int copydefault = C41407qqI.EZpvd;
    public final boolean EZpvd;
    public final C41407qqI KWHzl;

    public C40112qJu(@NotNull C41407qqI c41407qqI, boolean z) {
        Intrinsics.checkNotNullParameter(c41407qqI, "");
        this.KWHzl = c41407qqI;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
    public void AEQbTJ(@NotNull C42889ret c42889ret, int i, @NotNull C40113qJv c40113qJv) {
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(c42889ret, "");
        Intrinsics.checkNotNullParameter(c40113qJv, "");
        Triple triple = (Triple) this.KWHzl.copydefault(c40113qJv);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) triple.component1();
        UpDownColor upDownColor = (UpDownColor) triple.component2();
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) triple.component3();
        AppCompatImageView appCompatImageView = c42889ret.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.AEQbTJ(appCompatImageView, c40113qJv.OLrzqt(), C52761wXj.TaskDescription.aHXSQp);
        C40358qSx c40358qSx = c42889ret.AEQbTJ;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(c40113qJv.EZpvd(), "");
        java.lang.String strAEQbTJ = c40113qJv.AEQbTJ();
        java.lang.String str = (charSequence2 == null || (string2 = charSequence2.toString()) == null) ? "--" : string2;
        java.lang.String str2 = (charSequence == null || (string = charSequence.toString()) == null) ? "--" : string;
        if (upDownColor == null) {
            upDownColor = UpDownColor.NEUTRAL;
        }
        c40358qSx.setData(pairOLrzqt, null, strAEQbTJ, str, str2, upDownColor, true, this.EZpvd, C33129mqd.OLrzqt((java.lang.Object) c40113qJv.djBIcL().getNewTag(), (java.lang.Object) 1), C33129mqd.OLrzqt((java.lang.Object) c40113qJv.djBIcL().getNewLabel(), (java.lang.Object) 1) && C33129mqd.AhwBna(c40113qJv.djBIcL().getNewTag(), 1), (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
        AppCompatImageView appCompatImageView2 = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(this.EZpvd ? 0 : 8);
        c42889ret.EZpvd.setSelected(c40113qJv.DbNXlk());
        AppCompatImageView appCompatImageView3 = c42889ret.EZpvd;
        appCompatImageView3.setOnClickListener(new ActionBar(appCompatImageView3, 1000L, c40113qJv, c42889ret));
        ConstraintLayout root = c42889ret.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42889ret, c40113qJv));
    }

    /* JADX INFO: renamed from: o.qJu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C42889ret EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C40113qJv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C40113qJv c40113qJv, C42889ret c42889ret) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c40113qJv;
            this.EZpvd = c42889ret;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.DbNXlk()) {
                    AppCompatImageView appCompatImageView = this.EZpvd.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    qKN qknOLrzqt = qKO.OLrzqt(appCompatImageView);
                    if (qknOLrzqt != null) {
                        qknOLrzqt.copydefault(this.copydefault.djBIcL());
                    }
                    AppCompatImageView appCompatImageView2 = this.EZpvd.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                    qPT qptKWHzl = qPU.KWHzl(appCompatImageView2);
                    if (qptKWHzl != null) {
                        qptKWHzl.djBIcL(C27989kKu.Companion.isConnected());
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView3 = this.EZpvd.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                qKN qknOLrzqt2 = qKO.OLrzqt(appCompatImageView3);
                if (qknOLrzqt2 != null) {
                    qknOLrzqt2.KWHzl(this.copydefault.djBIcL());
                }
                AppCompatImageView appCompatImageView4 = this.EZpvd.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                qPT qptKWHzl2 = qPU.KWHzl(appCompatImageView4);
                if (qptKWHzl2 != null) {
                    qptKWHzl2.djBIcL(C27989kKu.Companion.copydefault());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qJu$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C42889ret KWHzl;
        public final /* synthetic */ C40113qJv OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42889ret c42889ret, C40113qJv c40113qJv) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c42889ret;
            this.OLrzqt = c40113qJv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ConstraintLayout root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qplAEQbTJ.copydefault(new C40131qKm(this.OLrzqt.EZpvd()));
                }
            }
        }
    }
}
