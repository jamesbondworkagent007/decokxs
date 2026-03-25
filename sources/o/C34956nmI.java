package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.dexkline.dex.api.enums.KlineDexPageFromType;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC27808kEb;
import o.InterfaceC46612taU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34956nmI extends AbstractC40510qYn<C34964nmQ, C42721rbk> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42721rbk AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42721rbk c42721rbkAEQbTJ = C42721rbk.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42721rbkAEQbTJ, "");
        return c42721rbkAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42721rbk c42721rbk, final int i, @NotNull final C34964nmQ c34964nmQ) {
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String strGEmmrt3;
        Intrinsics.checkNotNullParameter(c42721rbk, "");
        Intrinsics.checkNotNullParameter(c34964nmQ, "");
        C41424qqZ c41424qqZAEQbTJ = c34964nmQ.AEQbTJ();
        java.lang.CharSequence charSequenceAhwBna = c41424qqZAEQbTJ != null ? c41424qqZAEQbTJ.AhwBna() : null;
        C41424qqZ c41424qqZAEQbTJ2 = c34964nmQ.AEQbTJ();
        UpDownColor upDownColorDbNXlk = c41424qqZAEQbTJ2 != null ? c41424qqZAEQbTJ2.DbNXlk() : null;
        C41424qqZ c41424qqZAEQbTJ3 = c34964nmQ.AEQbTJ();
        java.lang.CharSequence charSequenceGEmmrt = c41424qqZAEQbTJ3 != null ? c41424qqZAEQbTJ3.gEmmrt() : null;
        C41424qqZ c41424qqZAEQbTJ4 = c34964nmQ.AEQbTJ();
        java.lang.CharSequence charSequenceAYXKKw = c41424qqZAEQbTJ4 != null ? c41424qqZAEQbTJ4.AYXKKw() : null;
        C41424qqZ c41424qqZAEQbTJ5 = c34964nmQ.AEQbTJ();
        if (c41424qqZAEQbTJ5 != null) {
            c41424qqZAEQbTJ5.values();
        }
        AppCompatImageView appCompatImageView = c42721rbk.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(c34964nmQ.copydefault().getTokenLogoUrl(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView, strKWHzl);
        AppCompatImageView appCompatImageView2 = c42721rbk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        java.lang.String strKWHzl2 = C55297xhL.KWHzl(c34964nmQ.copydefault().getChainLogoUrl(), C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        if (strKWHzl2 == null) {
            strKWHzl2 = "";
        }
        C57659ymb.KWHzl(appCompatImageView2, strKWHzl2, C52761wXj.TaskDescription.fERRXa, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        java.lang.String str = "--";
        c42721rbk.KWHzl.setData(C56390yDp.OLrzqt(c34964nmQ.copydefault().getTokenSymbol(), ""), C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz)), (charSequenceAYXKKw == null || (strGEmmrt3 = C33129mqd.gEmmrt(charSequenceAYXKKw)) == null) ? "--" : strGEmmrt3, (charSequenceGEmmrt == null || (strGEmmrt2 = C33129mqd.gEmmrt(charSequenceGEmmrt)) == null) ? "--" : strGEmmrt2, "", (1920 & 32) != 0 ? null : null, (1920 & 64) != 0 ? null : null, (1920 & 128) != 0 ? false : Intrinsics.EZpvd(c34964nmQ.fetchVPNInfo(), java.lang.Boolean.TRUE), (1920 & 256) != 0 ? java.lang.Boolean.FALSE : c34964nmQ.OLrzqt(), (1920 & 512) != 0 ? "" : c34964nmQ.EZpvd(), (1920 & 1024) != 0 ? null : new Function1() { // from class: o.nmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34956nmI.EZpvd(c42721rbk, c34964nmQ, (java.lang.String) obj);
            }
        });
        C41312qoT c41312qoT = c42721rbk.gEmmrt;
        if (charSequenceAhwBna != null && (strGEmmrt = C33129mqd.gEmmrt(charSequenceAhwBna)) != null) {
            str = strGEmmrt;
        }
        c41312qoT.setChangeRatioAndColor(str, upDownColorDbNXlk);
        c42721rbk.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34956nmI.EZpvd(c42721rbk, c34964nmQ, i, view);
            }
        });
        ConstraintLayout root = c42721rbk.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42721rbk, i, c34964nmQ));
    }

    public static final Unit EZpvd(C42721rbk c42721rbk, C34964nmQ c34964nmQ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            ConstraintLayout root = c42721rbk.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC27808kEb interfaceC27808kEbKWHzl = C27807kEa.KWHzl(root);
            if (interfaceC27808kEbKWHzl != null) {
                interfaceC27808kEbKWHzl.EZpvd(c34964nmQ.copydefault(), "homepage_dex");
            }
        } else {
            ConstraintLayout root2 = c42721rbk.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            InterfaceC27808kEb interfaceC27808kEbKWHzl2 = C27807kEa.KWHzl(root2);
            if (interfaceC27808kEbKWHzl2 != null) {
                interfaceC27808kEbKWHzl2.OLrzqt(c34964nmQ.copydefault(), "cedefi", "");
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(C42721rbk c42721rbk, C34964nmQ c34964nmQ, int i, android.view.View view) {
        ConstraintLayout root = c42721rbk.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        ConstraintLayout root2 = c42721rbk.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.KWHzl(root2, c34964nmQ.copydefault(), i);
        return true;
    }

    /* JADX INFO: renamed from: o.nmI$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C34964nmQ KWHzl;
        public final /* synthetic */ C42721rbk OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42721rbk c42721rbk, int i, C34964nmQ c34964nmQ) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c42721rbk;
            this.AEQbTJ = i;
            this.KWHzl = c34964nmQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ConstraintLayout root = this.OLrzqt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC27808kEb interfaceC27808kEbKWHzl = C27807kEa.KWHzl(root);
                if (interfaceC27808kEbKWHzl != null) {
                    InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbKWHzl, "cedefi", null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.AEQbTJ + 1)), "", "CEDEFI", this.KWHzl.copydefault().getTokenContractAddress(), this.KWHzl.OLrzqt(), 2, null);
                }
                ConstraintLayout root2 = this.OLrzqt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                InterfaceC46612taU interfaceC46612taUEZpvd = C46611taT.EZpvd(root2);
                if (interfaceC46612taUEZpvd != null) {
                    InterfaceC46612taU.ActionBar.navToKlinePage$default(interfaceC46612taUEZpvd, null, this.KWHzl, KlineDexPageFromType.HOMEPAGE_DEX_LIST.getValue(), null, "", 8, null);
                }
            }
        }
    }
}
