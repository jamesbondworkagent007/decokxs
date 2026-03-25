package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qKI extends AbstractC40510qYn<qWG, C42891rev> {
    public static final int OLrzqt = C41421qqW.KWHzl;
    public final C41421qqW KWHzl;

    public qKI(@NotNull C41421qqW c41421qqW) {
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        this.KWHzl = c41421qqW;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42891rev AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42891rev c42891revOLrzqt = C42891rev.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42891revOLrzqt, "");
        return c42891revOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull final C42891rev c42891rev, int i, @NotNull final qWG qwg) {
        java.lang.String strValueOf;
        java.lang.String string;
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(c42891rev, "");
        Intrinsics.checkNotNullParameter(qwg, "");
        AppCompatImageView appCompatImageView = c42891rev.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        c42891rev.EZpvd.setSelected(true);
        C41424qqZ c41424qqZ = (C41424qqZ) this.KWHzl.copydefault((java.lang.Object) qwg.copydefault());
        java.lang.CharSequence charSequenceCopydefault = c41424qqZ.copydefault();
        UpDownColor upDownColorOLrzqt = c41424qqZ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41424qqZ.KWHzl();
        java.lang.CharSequence charSequenceAEQbTJ = c41424qqZ.AEQbTJ();
        java.lang.CharSequence charSequenceValueOf = c41424qqZ.valueOf();
        AppCompatImageView appCompatImageView2 = c42891rev.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(qwg.KWHzl().getTokenLogoUrl(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C46742tcs.AEQbTJ(appCompatImageView2, strKWHzl);
        AppCompatImageView appCompatImageView3 = c42891rev.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        java.lang.String strKWHzl2 = C55297xhL.KWHzl(qwg.KWHzl().getChainLogoUrl(), C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        if (strKWHzl2 == null) {
            strKWHzl2 = "";
        }
        C57659ymb.KWHzl(appCompatImageView3, strKWHzl2, C52761wXj.TaskDescription.fERRXa, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        C40358qSx c40358qSx = c42891rev.AEQbTJ;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(qwg.KWHzl().getTokenSymbol(), "");
        java.util.List listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz));
        if (charSequenceAEQbTJ == null || (strValueOf = charSequenceAEQbTJ.toString()) == null) {
            strValueOf = java.lang.String.valueOf(charSequenceValueOf);
        } else {
            if (!(true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValueOf))) {
                strValueOf = null;
            }
            if (strValueOf == null) {
            }
        }
        c40358qSx.setData(pairOLrzqt, listEZpvd, strValueOf, (charSequenceKWHzl == null || (strGEmmrt = C33129mqd.gEmmrt(charSequenceKWHzl)) == null) ? "--" : strGEmmrt, (charSequenceCopydefault == null || (string = pTF.KWHzl.KWHzl(charSequenceCopydefault).toString()) == null) ? "--" : string, upDownColorOLrzqt, true, true, false, false, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : Intrinsics.EZpvd(qwg.KWHzl().getVerified(), java.lang.Boolean.TRUE), (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : qwg.copydefault().OLrzqt(), (195584 & 16384) != 0 ? "" : qwg.copydefault().EZpvd(), (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : charSequenceAEQbTJ != null ? C33129mqd.gEmmrt(charSequenceAEQbTJ) : null, (195584 & 131072) != 0 ? null : new Function1() { // from class: o.qKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qKI.AEQbTJ(c42891rev, qwg, (java.lang.String) obj);
            }
        });
        AppCompatImageView appCompatImageView4 = c42891rev.EZpvd;
        appCompatImageView4.setOnClickListener(new Activity(appCompatImageView4, 1000L, c42891rev, qwg));
        ConstraintLayout root = c42891rev.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, qwg, c42891rev, i));
    }

    public static final Unit AEQbTJ(C42891rev c42891rev, qWG qwg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            ConstraintLayout root = c42891rev.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            qPT qptKWHzl = qPU.KWHzl(root);
            if (qptKWHzl != null) {
                qptKWHzl.OLrzqt(qwg.KWHzl());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull qWG qwg) {
        Intrinsics.checkNotNullParameter(qwg, "");
        java.lang.String tokenContractAddress = qwg.KWHzl().getTokenContractAddress();
        java.lang.String chainId = qwg.KWHzl().getChainId();
        return (tokenContractAddress + chainId).hashCode();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C42891rev EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ qWG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, qWG qwg, C42891rev c42891rev, int i) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = qwg;
            this.EZpvd = c42891rev;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.lang.String strGEmmrt = this.copydefault.gEmmrt();
                boolean z = strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt);
                ConstraintLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    ConstraintLayout root2 = this.EZpvd.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    qplAEQbTJ.KWHzl(root2, this.copydefault.KWHzl(), this.OLrzqt, "dex_nav_fav", "favorites", "cedefi", !z, this.copydefault.copydefault().OLrzqt());
                }
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C42891rev AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ qWG KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42891rev c42891rev, qWG qwg) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c42891rev;
            this.KWHzl = qwg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AppCompatImageView appCompatImageView = this.AEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                qKN qknOLrzqt = qKO.OLrzqt(appCompatImageView);
                if (qknOLrzqt != null) {
                    DexInstrument dexInstrumentKWHzl = this.KWHzl.KWHzl();
                    if (dexInstrumentKWHzl == null) {
                        return;
                    }
                    C40375qTn.AEQbTJ.copydefault("NavFavoritesDexItemBinder", "removeWatching error, cause Instrument is null, instId: " + this.KWHzl.KWHzl().getChainId() + ", instType: " + this.KWHzl.KWHzl().getTokenContractAddress());
                    qknOLrzqt.KWHzl(dexInstrumentKWHzl);
                }
                AppCompatImageView appCompatImageView2 = this.AEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                qPT qptKWHzl = qPU.KWHzl(appCompatImageView2);
                if (qptKWHzl != null) {
                    qptKWHzl.djBIcL(C27989kKu.Companion.isConnected());
                }
            }
        }
    }
}
