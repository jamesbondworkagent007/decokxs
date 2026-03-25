package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import o.C57230yeW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20233gcy extends C20150gbU<C9216bRR> {
    public final ActionBar fARcdN = new ActionBar();

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C9216bRR copydefault(C20233gcy c20233gcy) {
        return (C9216bRR) c20233gcy.ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C9216bRR>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.ixgjPv);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
        PlatformItem dapp = ((C9216bRR) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, drawableKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        int iEZpvd = actionBar.EZpvd();
        actionBar.OLrzqt(finit());
        if (actionBar.EZpvd() > iEZpvd) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        } else {
            c57431yiLTitleInfoView$default.setSubChildTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.doInvalidatePanelMenu));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(djSkpj());
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gcw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20233gcy.EZpvd(this.AEQbTJ, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20233gcy c20233gcy, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20233gcy.QVAiDq());
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20233gcy, null, ((C9216bRR) c20233gcy.ejfBZ()).AEQbTJ(true), 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gcy$ActionBar */
    public static final class ActionBar extends C57230yeW.Application {
        public ActionBar() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            C20233gcy.copydefault(C20233gcy.this).AhwBna(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View QVAiDq() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55008xbo c55008xbo = new C55008xbo(contextRequireContext, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        c55008xbo.setLayoutParams(marginLayoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext());
        appCompatTextView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr));
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        c55008xbo.setLabelView(appCompatTextView);
        android.view.View viewInflate = getLayoutInflater().inflate(C13754dXa.TaskDescription.OeawrHRnVkix, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        C57230yeW c57230yeW = (C57230yeW) viewInflate;
        c57230yeW.setMaxDecimalValue(0);
        java.lang.String strRcXXUw = ((C9216bRR) ejfBZ()).RcXXUw();
        C57230yeW.setTextWrapper$default(c57230yeW, strRcXXUw, null, 2, null);
        c57230yeW.setHint(strRcXXUw != null ? pTB.formatLocalized$default(strRcXXUw, null, 1, null) : null);
        c57230yeW.EZpvd(this.fARcdN);
        c57230yeW.AEQbTJ(this.fARcdN);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        c55008xbo.setContentView(viewInflate);
        return c55008xbo;
    }
}
