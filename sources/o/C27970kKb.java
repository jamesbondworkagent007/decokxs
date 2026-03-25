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
import o.InterfaceC38465pZu;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27970kKb extends AbstractC40510qYn<InterfaceC41655qus, C42721rbk> {
    public static final int AEQbTJ = C41421qqW.KWHzl;
    public final C41421qqW EZpvd;

    public C27970kKb(@NotNull C41421qqW c41421qqW) {
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        this.EZpvd = c41421qqW;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42721rbk AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42721rbk c42721rbkAEQbTJ = C42721rbk.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42721rbkAEQbTJ, "");
        return c42721rbkAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull final C42721rbk c42721rbk, int i, @NotNull final InterfaceC41655qus interfaceC41655qus) {
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String strGEmmrt3;
        Intrinsics.checkNotNullParameter(c42721rbk, "");
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        C41424qqZ c41424qqZ = (C41424qqZ) this.EZpvd.copydefault((java.lang.Object) interfaceC41655qus);
        java.lang.CharSequence charSequenceCopydefault = c41424qqZ.copydefault();
        UpDownColor upDownColorOLrzqt = c41424qqZ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41424qqZ.KWHzl();
        java.lang.CharSequence charSequenceAEQbTJ = c41424qqZ.AEQbTJ();
        AppCompatImageView appCompatImageView = c42721rbk.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(interfaceC41655qus.copydefault().getTokenLogoUrl(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView, strKWHzl);
        AppCompatImageView appCompatImageView2 = c42721rbk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        java.lang.String strKWHzl2 = C55297xhL.KWHzl(interfaceC41655qus.copydefault().getChainLogoUrl(), C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        if (strKWHzl2 == null) {
            strKWHzl2 = "";
        }
        C57659ymb.KWHzl(appCompatImageView2, strKWHzl2, C52761wXj.TaskDescription.fERRXa, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        java.lang.String str = "--";
        c42721rbk.KWHzl.setData(C56390yDp.OLrzqt(interfaceC41655qus.copydefault().getTokenSymbol(), ""), C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz)), (charSequenceAEQbTJ == null || (strGEmmrt3 = C33129mqd.gEmmrt(charSequenceAEQbTJ)) == null) ? "--" : strGEmmrt3, (charSequenceKWHzl == null || (strGEmmrt2 = C33129mqd.gEmmrt(charSequenceKWHzl)) == null) ? "--" : strGEmmrt2, "", (1920 & 32) != 0 ? null : null, (1920 & 64) != 0 ? null : null, (1920 & 128) != 0 ? false : Intrinsics.EZpvd(interfaceC41655qus.copydefault().getVerified(), java.lang.Boolean.TRUE), (1920 & 256) != 0 ? java.lang.Boolean.FALSE : interfaceC41655qus.OLrzqt(), (1920 & 512) != 0 ? "" : interfaceC41655qus.EZpvd(), (1920 & 1024) != 0 ? null : new Function1() { // from class: o.kJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27970kKb.AEQbTJ(c42721rbk, interfaceC41655qus, (java.lang.String) obj);
            }
        });
        C41312qoT c41312qoT = c42721rbk.gEmmrt;
        if (charSequenceCopydefault != null && (strGEmmrt = C33129mqd.gEmmrt(charSequenceCopydefault)) != null) {
            str = strGEmmrt;
        }
        c41312qoT.setChangeRatioAndColor(str, upDownColorOLrzqt);
        ConstraintLayout root = c42721rbk.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, c42721rbk, interfaceC41655qus, i));
    }

    public static final Unit AEQbTJ(C42721rbk c42721rbk, InterfaceC41655qus interfaceC41655qus, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            ConstraintLayout root = c42721rbk.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC38466pZv interfaceC38466pZvKWHzl = C38470pZz.KWHzl(root);
            if (interfaceC38466pZvKWHzl != null) {
                interfaceC38466pZvKWHzl.EZpvd(interfaceC41655qus.copydefault(), C27563jxZ.OLrzqt.fetchVPNInfo() ? "explore_market_favorite" : "market_favorite");
            }
        } else {
            ConstraintLayout root2 = c42721rbk.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            InterfaceC38466pZv interfaceC38466pZvKWHzl2 = C38470pZz.KWHzl(root2);
            if (interfaceC38466pZvKWHzl2 != null) {
                interfaceC38466pZvKWHzl2.copydefault(interfaceC41655qus.copydefault(), "favorite", "");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull InterfaceC41655qus interfaceC41655qus) {
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        java.lang.String tokenContractAddress = interfaceC41655qus.copydefault().getTokenContractAddress();
        java.lang.String chainId = interfaceC41655qus.copydefault().getChainId();
        return (tokenContractAddress + chainId).hashCode();
    }

    /* JADX INFO: renamed from: o.kKb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C42721rbk AEQbTJ;
        public final /* synthetic */ InterfaceC41655qus EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42721rbk c42721rbk, InterfaceC41655qus interfaceC41655qus, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c42721rbk;
            this.EZpvd = interfaceC41655qus;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout root = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    InterfaceC38465pZu.Activity.navigateInstrumentDetailPage$default(interfaceC38465pZuOLrzqt, "", "", this.EZpvd.copydefault(), this.copydefault, "", KlineDexPageFromType.MARKET_FAVORITE_LIST.getValue(), null, 64, null);
                }
            }
        }
    }
}
