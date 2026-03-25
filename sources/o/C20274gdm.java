package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20274gdm extends C20277gdp<C9216bRR> {
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C9216bRR KWHzl(C20274gdm c20274gdm) {
        return (C9216bRR) c20274gdm.ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20277gdp, o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C9216bRR>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ((C9216bRR) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        if (actionBar.OLrzqt(QUSxYX()) != null) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(djSkpj());
        actionBar.OLrzqt(gEmmrt(actionBar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View gEmmrt(AbstractC20082gaF<C9216bRR>.ActionBar actionBar) {
        C17043evO c17043evOKWHzl = C17043evO.KWHzl(getLayoutInflater(), QbewEr().EZpvd.fIwbmz(), false);
        c17043evOKWHzl.getRoot().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr));
        C55008xbo c55008xbo = QbewEr().EZpvd;
        android.widget.TextView root = c17043evOKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55008xbo.setLabelView(root);
        C55008xbo c55008xbo2 = QbewEr().EZpvd;
        android.view.View viewInflate = getLayoutInflater().inflate(C13754dXa.TaskDescription.OeawrHRnVkix, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        C57230yeW c57230yeW = (C57230yeW) viewInflate;
        c57230yeW.setMaxDecimalValue(0);
        java.lang.String strRcXXUw = ((C9216bRR) ejfBZ()).RcXXUw();
        C57230yeW.setTextWrapper$default(c57230yeW, strRcXXUw, null, 2, null);
        c57230yeW.setHint(strRcXXUw != null ? pTB.formatLocalized$default(strRcXXUw, null, 1, null) : null);
        ((android.widget.TextView) viewInflate).addTextChangedListener(new ActionBar());
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        c55008xbo2.setContentView(viewInflate);
        QbewEr().EZpvd.setVisibility(0);
        QbewEr().OLrzqt.setVisibility(8);
        QbewEr().KWHzl.setVisibility(8);
        return AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20274gdm.KWHzl(this.EZpvd, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null);
    }

    public static final Unit KWHzl(C20274gdm c20274gdm, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20274gdm.QbewEr().getRoot());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gdm$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C20274gdm.KWHzl(C20274gdm.this).AhwBna(editable != null ? editable.toString() : null);
        }
    }
}
