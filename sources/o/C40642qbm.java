package o;

import android.view.View;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC38465pZu;
import o.InterfaceC40693qck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40642qbm extends AbstractC40515qYs<InterfaceC41655qus, C42796rdF> {
    public static final int copydefault = C41421qqW.KWHzl | DexChainGroupVo.OLrzqt;
    public final C41421qqW EZpvd;
    public final DexChainGroupVo OLrzqt;

    public C40642qbm(@NotNull DexChainGroupVo dexChainGroupVo, @NotNull C41421qqW c41421qqW) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        this.OLrzqt = dexChainGroupVo;
        this.EZpvd = c41421qqW;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42796rdF AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42796rdF c42796rdFKWHzl = C42796rdF.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42796rdFKWHzl, "");
        return c42796rdFKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    public void copydefault(@NotNull final C42796rdF c42796rdF, final int i, @NotNull final InterfaceC41655qus interfaceC41655qus) {
        Intrinsics.checkNotNullParameter(c42796rdF, "");
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        C41424qqZ c41424qqZ = (C41424qqZ) this.EZpvd.copydefault((java.lang.Object) interfaceC41655qus);
        java.lang.CharSequence charSequenceCopydefault = c41424qqZ.copydefault();
        UpDownColor upDownColorOLrzqt = c41424qqZ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41424qqZ.KWHzl();
        java.lang.CharSequence charSequenceAEQbTJ = c41424qqZ.AEQbTJ();
        java.lang.CharSequence charSequenceEZpvd = c41424qqZ.EZpvd();
        C41309qoQ root = c42796rdF.getRoot();
        java.lang.String tokenSymbol = interfaceC41655qus.copydefault().getTokenSymbol();
        java.lang.String tokenLogoUrl = interfaceC41655qus.copydefault().getTokenLogoUrl();
        java.lang.String chainLogoUrl = interfaceC41655qus.copydefault().getChainLogoUrl();
        java.lang.CharSequence charSequence = charSequenceAEQbTJ == null ? "--" : charSequenceAEQbTJ;
        java.lang.CharSequence charSequence2 = charSequenceEZpvd == null ? "--" : charSequenceEZpvd;
        java.lang.CharSequence charSequence3 = charSequenceKWHzl == null ? "--" : charSequenceKWHzl;
        java.lang.CharSequence charSequence4 = charSequenceCopydefault == null ? "--" : charSequenceCopydefault;
        if (upDownColorOLrzqt == null) {
            upDownColorOLrzqt = UpDownColor.NEUTRAL;
        }
        UpDownColor upDownColor = upDownColorOLrzqt;
        java.lang.Boolean boolFetchVPNInfo = interfaceC41655qus.fetchVPNInfo();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean zEZpvd = Intrinsics.EZpvd(boolFetchVPNInfo, bool);
        boolean zEZpvd2 = Intrinsics.EZpvd(interfaceC41655qus.OLrzqt(), bool);
        java.lang.String strEZpvd = interfaceC41655qus.EZpvd();
        root.setData(tokenSymbol, tokenLogoUrl, chainLogoUrl, charSequence, charSequence2, charSequence3, charSequence4, upDownColor, zEZpvd, zEZpvd2, strEZpvd == null ? "" : strEZpvd, new Function1() { // from class: o.qbn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40642qbm.KWHzl(c42796rdF, interfaceC41655qus, this, (java.lang.String) obj);
            }
        });
        C41309qoQ root2 = c42796rdF.getRoot();
        root2.setOnClickListener(new Activity(root2, 1000L, c42796rdF, this, interfaceC41655qus, i));
        c42796rdF.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C40642qbm.EZpvd(c42796rdF, interfaceC41655qus, i, view);
            }
        });
    }

    public static final Unit KWHzl(C42796rdF c42796rdF, InterfaceC41655qus interfaceC41655qus, C40642qbm c40642qbm, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            C41309qoQ root = c42796rdF.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC38466pZv interfaceC38466pZvKWHzl = C38470pZz.KWHzl(root);
            if (interfaceC38466pZvKWHzl != null) {
                DexInstrument dexInstrumentCopydefault = interfaceC41655qus.copydefault();
                if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
                    str2 = c40642qbm.OLrzqt.AhwBna() ? "explore_market_dex_boost" : "explore_market_dex_others";
                } else {
                    str2 = c40642qbm.OLrzqt.AhwBna() ? "market_dex_boost" : "market_dex_others";
                }
                interfaceC38466pZvKWHzl.EZpvd(dexInstrumentCopydefault, str2);
            }
        } else {
            C41309qoQ root2 = c42796rdF.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            InterfaceC38466pZv interfaceC38466pZvKWHzl2 = C38470pZz.KWHzl(root2);
            if (interfaceC38466pZvKWHzl2 != null) {
                DexInstrument dexInstrumentCopydefault2 = interfaceC41655qus.copydefault();
                java.lang.String strEZpvd = c40642qbm.OLrzqt.EZpvd();
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
                    strEZpvd = "All";
                }
                interfaceC38466pZvKWHzl2.copydefault(dexInstrumentCopydefault2, "cedefi", strEZpvd);
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(C42796rdF c42796rdF, InterfaceC41655qus interfaceC41655qus, int i, android.view.View view) {
        C41309qoQ root = c42796rdF.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40693qck interfaceC40693qckKWHzl = C40695qcm.KWHzl(root);
        if (interfaceC40693qckKWHzl == null) {
            return true;
        }
        Intrinsics.copydefault(view);
        InterfaceC40693qck.Application.onLongClickInstrument$default(interfaceC40693qckKWHzl, view, interfaceC41655qus, i, false, false, null, null, 120, null);
        return true;
    }

    /* JADX INFO: renamed from: o.qbm$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C42796rdF EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ InterfaceC41655qus OLrzqt;
        public final /* synthetic */ long copydefault;
        public final /* synthetic */ C40642qbm valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42796rdF c42796rdF, C40642qbm c40642qbm, InterfaceC41655qus interfaceC41655qus, int i) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c42796rdF;
            this.valueOf = c40642qbm;
            this.OLrzqt = interfaceC41655qus;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C41309qoQ root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    InterfaceC38465pZu.Activity.navigateInstrumentDetailPage$default(interfaceC38465pZuOLrzqt, "cedefi", this.valueOf.OLrzqt.KWHzl() ? "all" : this.valueOf.OLrzqt.EZpvd(), this.OLrzqt.copydefault(), this.AEQbTJ, "", null, this.OLrzqt.OLrzqt(), 32, null);
                }
            }
        }
    }
}
