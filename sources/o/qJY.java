package o;

import android.view.View;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qJY extends AbstractC40510qYn<C40128qKj, C42892rew> {
    public static final int KWHzl = C41421qqW.KWHzl | DexChainGroupVo.OLrzqt;
    public final C41421qqW AEQbTJ;
    public final DexChainGroupVo OLrzqt;

    public qJY(@NotNull DexChainGroupVo dexChainGroupVo, @NotNull C41421qqW c41421qqW) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        this.OLrzqt = dexChainGroupVo;
        this.AEQbTJ = c41421qqW;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42892rew AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42892rew c42892rewCopydefault = C42892rew.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42892rewCopydefault, "");
        return c42892rewCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42892rew c42892rew, int i, @NotNull final C40128qKj c40128qKj) {
        Intrinsics.checkNotNullParameter(c42892rew, "");
        Intrinsics.checkNotNullParameter(c40128qKj, "");
        C41424qqZ c41424qqZ = (C41424qqZ) this.AEQbTJ.copydefault((java.lang.Object) c40128qKj);
        java.lang.CharSequence charSequenceCopydefault = c41424qqZ.copydefault();
        UpDownColor upDownColorOLrzqt = c41424qqZ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41424qqZ.KWHzl();
        java.lang.CharSequence charSequenceAEQbTJ = c41424qqZ.AEQbTJ();
        java.lang.CharSequence charSequenceEZpvd = c41424qqZ.EZpvd();
        java.lang.CharSequence charSequenceValueOf = c41424qqZ.valueOf();
        qSJ root = c42892rew.getRoot();
        boolean zDbNXlk = c40128qKj.DbNXlk();
        boolean zEZpvd = Intrinsics.EZpvd(c40128qKj.fetchVPNInfo(), java.lang.Boolean.TRUE);
        java.lang.String tokenSymbol = c40128qKj.copydefault().getTokenSymbol();
        java.lang.String tokenLogoUrl = c40128qKj.copydefault().getTokenLogoUrl();
        java.lang.String chainLogoUrl = c40128qKj.copydefault().getChainLogoUrl();
        if (charSequenceValueOf == null) {
            charSequenceValueOf = "--";
        }
        java.lang.CharSequence charSequence = charSequenceEZpvd == null ? "--" : charSequenceEZpvd;
        java.lang.CharSequence charSequence2 = charSequenceAEQbTJ == null ? "--" : charSequenceAEQbTJ;
        java.lang.CharSequence charSequence3 = charSequenceKWHzl == null ? "--" : charSequenceKWHzl;
        java.lang.CharSequence charSequence4 = charSequenceCopydefault == null ? "--" : charSequenceCopydefault;
        if (upDownColorOLrzqt == null) {
            upDownColorOLrzqt = UpDownColor.NEUTRAL;
        }
        UpDownColor upDownColor = upDownColorOLrzqt;
        java.lang.String strEZpvd = c40128qKj.EZpvd();
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        java.lang.Boolean boolOLrzqt = c40128qKj.OLrzqt();
        root.setData$OKMarket_market_impl(zDbNXlk, zEZpvd, tokenSymbol, tokenLogoUrl, chainLogoUrl, charSequenceValueOf, charSequence, charSequence2, charSequence3, charSequence4, upDownColor, boolOLrzqt != null ? boolOLrzqt.booleanValue() : false, str, new Function1() { // from class: o.qKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qJY.copydefault(c40128qKj, c42892rew, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.qKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qJY.KWHzl(c42892rew, c40128qKj, (java.lang.String) obj);
            }
        });
        qSJ root2 = c42892rew.getRoot();
        root2.setOnClickListener(new Activity(root2, 1000L, c40128qKj, c42892rew, i, this));
    }

    public static final Unit KWHzl(C42892rew c42892rew, C40128qKj c40128qKj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        qSJ root = c42892rew.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        qPT qptKWHzl = qPU.KWHzl(root);
        if (qptKWHzl != null) {
            qSJ root2 = c42892rew.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            qptKWHzl.copydefault(root2, c40128qKj.copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C40128qKj c40128qKj, C42892rew c42892rew, boolean z) {
        if (c40128qKj.DbNXlk()) {
            qSJ root = c42892rew.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            qKN qknOLrzqt = qKO.OLrzqt(root);
            if (qknOLrzqt != null) {
                qknOLrzqt.KWHzl(c40128qKj.copydefault());
            }
            qSJ root2 = c42892rew.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            qPT qptKWHzl = qPU.KWHzl(root2);
            if (qptKWHzl != null) {
                qptKWHzl.djBIcL(C27989kKu.Companion.isConnected());
            }
        } else {
            qSJ root3 = c42892rew.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            qKN qknOLrzqt2 = qKO.OLrzqt(root3);
            if (qknOLrzqt2 != null) {
                qknOLrzqt2.EZpvd(c40128qKj.copydefault());
            }
            qSJ root4 = c42892rew.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "");
            qPT qptKWHzl2 = qPU.KWHzl(root4);
            if (qptKWHzl2 != null) {
                qptKWHzl2.djBIcL(C27989kKu.Companion.copydefault());
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C40128qKj AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C42892rew OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ qJY valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C40128qKj c40128qKj, C42892rew c42892rew, int i, qJY qjy) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c40128qKj;
            this.OLrzqt = c42892rew;
            this.KWHzl = i;
            this.valueOf = qjy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String strGEmmrt = this.AEQbTJ.gEmmrt();
                boolean z = strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt);
                qSJ root = this.OLrzqt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qSJ root2 = this.OLrzqt.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    DexInstrument dexInstrumentCopydefault = this.AEQbTJ.copydefault();
                    int i = this.KWHzl;
                    java.lang.String strGEmmrt2 = this.AEQbTJ.gEmmrt();
                    qplAEQbTJ.KWHzl(root2, dexInstrumentCopydefault, i, (strGEmmrt2 == null || strGEmmrt2.length() != 0) ? "dex_nav_search" : "dex_nav_rank", "cedefi", this.valueOf.OLrzqt.KWHzl() ? "all" : this.valueOf.OLrzqt.EZpvd(), !z, this.AEQbTJ.OLrzqt());
                }
            }
        }
    }
}
