package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosFeeItemInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C57230yeW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21290gwv extends AbstractViewOnClickListenerC21247gwE<CosmosFeeItemInfo, C8843bKP> {
    public final StateListAnimator AEQbTJ = new StateListAnimator();
    public final ActionBar EZpvd = new ActionBar();

    public static final /* synthetic */ C8843bKP KWHzl(C21290gwv c21290gwv) {
        return c21290gwv.AhwBna();
    }

    /* JADX INFO: renamed from: o.gwv$StateListAnimator */
    public static final class StateListAnimator extends C57230yeW.Application {
        public StateListAnimator() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            C8843bKP c8843bKPKWHzl = C21290gwv.KWHzl(C21290gwv.this);
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String strCopydefault = C21290gwv.this.djBIcL().EZpvd.valueOf.copydefault.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            CosmosFeeItemInfo cosmosFeeItemInfoOLrzqt = c8843bKPKWHzl.OLrzqt(str2, strCopydefault);
            C21290gwv.this.EZpvd(cosmosFeeItemInfoOLrzqt, 3);
            C21290gwv c21290gwv = C21290gwv.this;
            if (str == null) {
                str = "";
            }
            c21290gwv.AEQbTJ(str, cosmosFeeItemInfoOLrzqt, true);
            C21290gwv.this.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.gwv$ActionBar */
    public static final class ActionBar extends C57230yeW.Application {
        public ActionBar() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            C8843bKP c8843bKPKWHzl = C21290gwv.KWHzl(C21290gwv.this);
            java.lang.String strCopydefault = C21290gwv.this.djBIcL().EZpvd.gEmmrt.copydefault.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            CosmosFeeItemInfo cosmosFeeItemInfoOLrzqt = c8843bKPKWHzl.OLrzqt(strCopydefault, str == null ? "" : str);
            C21290gwv.this.EZpvd(cosmosFeeItemInfoOLrzqt, 3);
            C21290gwv c21290gwv = C21290gwv.this;
            if (str == null) {
                str = "";
            }
            c21290gwv.OLrzqt(str, cosmosFeeItemInfoOLrzqt, true);
            C21290gwv.this.OLrzqt();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/bDi;)V */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull CosmosFeeItemInfo cosmosFeeItemInfo) {
        Intrinsics.checkNotNullParameter(cosmosFeeItemInfo, "");
        copydefault(cosmosFeeItemInfo, C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(cosmosFeeItemInfo.getGasPrice().getGasPrice()), null, null, CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, false, 25, null), cosmosFeeItemInfo.getFeeAmount());
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/bDi;I)V */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull CosmosFeeItemInfo cosmosFeeItemInfo, int i) {
        Intrinsics.checkNotNullParameter(cosmosFeeItemInfo, "");
        OLrzqt(cosmosFeeItemInfo, C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(cosmosFeeItemInfo.getGasPrice().getGasPrice()), null, null, CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, false, 25, null), cosmosFeeItemInfo.getFeeAmount(), i);
        EZpvd(cosmosFeeItemInfo, cosmosFeeItemInfo.getGasPrice().getGasPrice(), cosmosFeeItemInfo.getFeeUnit(), cosmosFeeItemInfo.getGasLimit().getGasLimit(), i);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void KWHzl(boolean z) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (z) {
            abstractC16844erb.gEmmrt.getRoot().setVisibility(0);
            abstractC16844erb.valueOf.getRoot().setVisibility(0);
            abstractC16844erb.isConnected.setVisibility(0);
            if (gEmmrt()) {
                return;
            }
            C57230yeW c57230yeW = abstractC16844erb.gEmmrt.copydefault;
            c57230yeW.setText(c57230yeW.getText());
            C57230yeW c57230yeW2 = abstractC16844erb.valueOf.copydefault;
            c57230yeW2.setText(c57230yeW2.getText());
            return;
        }
        abstractC16844erb.gEmmrt.getRoot().setVisibility(8);
        abstractC16844erb.gEmmrt.AEQbTJ.setVisibility(8);
        abstractC16844erb.valueOf.getRoot().setVisibility(8);
        abstractC16844erb.valueOf.AEQbTJ.setVisibility(8);
        abstractC16844erb.isConnected.setVisibility(8);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public boolean AEQbTJ() {
        java.lang.String strCopydefault = djBIcL().EZpvd.gEmmrt.copydefault.copydefault();
        java.lang.String strCopydefault2 = djBIcL().EZpvd.valueOf.copydefault.copydefault();
        CosmosFeeItemInfo cosmosFeeItemInfoEZpvd = AhwBna().EZpvd(4);
        return AEQbTJ(strCopydefault, cosmosFeeItemInfoEZpvd, false) && OLrzqt(strCopydefault2, cosmosFeeItemInfoEZpvd, false);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void EZpvd() {
        java.lang.String strCopydefault;
        C8843bKP c8843bKPAhwBna = AhwBna();
        java.lang.String strCopydefault2 = djBIcL().EZpvd.gEmmrt.copydefault.copydefault();
        if (strCopydefault2 == null || (strCopydefault = djBIcL().EZpvd.valueOf.copydefault.copydefault()) == null) {
            return;
        }
        c8843bKPAhwBna.copydefault(strCopydefault2, strCopydefault);
    }

    public final void EZpvd(CosmosFeeItemInfo cosmosFeeItemInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (EZpvd(i)) {
            android.view.View root = abstractC16844erb.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            KWHzl(root);
            AbstractC17079evy abstractC17079evy = abstractC16844erb.gEmmrt;
            android.view.View root2 = abstractC17079evy.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            KWHzl(root2);
            abstractC17079evy.copydefault.EZpvd(this.AEQbTJ);
            abstractC17079evy.valueOf.setText(getString(C13754dXa.FragmentManager.clearRegistrations) + "(" + str2 + ")");
            abstractC17079evy.copydefault.setMaxDecimalValue(AYXKKw());
            C57230yeW.setTextWrapper$default(abstractC17079evy.copydefault, str, null, 2, null);
            AEQbTJ(str, cosmosFeeItemInfo, true);
            AppCompatTextView appCompatTextView = abstractC17079evy.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            KWHzl(appCompatTextView);
            abstractC17079evy.EZpvd.setText(str2);
            abstractC17079evy.copydefault.AEQbTJ(this.AEQbTJ);
            AbstractC17079evy abstractC17079evy2 = abstractC16844erb.valueOf;
            android.view.View root3 = abstractC17079evy2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            KWHzl(root3);
            abstractC17079evy2.copydefault.EZpvd(this.EZpvd);
            abstractC17079evy2.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQNKFG));
            abstractC17079evy2.copydefault.setMaxDecimalValue(0);
            C57230yeW.setTextWrapper$default(abstractC17079evy2.copydefault, str3, null, 2, null);
            OLrzqt(str3, cosmosFeeItemInfo, true);
            abstractC17079evy2.copydefault.AEQbTJ(this.EZpvd);
        }
    }

    public final boolean AEQbTJ(java.lang.String str, CosmosFeeItemInfo cosmosFeeItemInfo, boolean z) {
        java.lang.String minLimitGasPrice = cosmosFeeItemInfo.getGasPrice().getMinLimitGasPrice();
        if (!C33129mqd.OLrzqt(str, "0") && !C33129mqd.gEmmrt(str, minLimitGasPrice)) {
            if (z) {
                djBIcL().EZpvd.gEmmrt.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
                djBIcL().EZpvd.gEmmrt.AEQbTJ.setVisibility(8);
            }
            return true;
        }
        if (!z) {
            return false;
        }
        djBIcL().EZpvd.gEmmrt.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
        djBIcL().EZpvd.gEmmrt.AEQbTJ.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.FSMca, C56423yEv.EZpvd(C56390yDp.OLrzqt("minGasPrice", C54862xYb.EZpvd(minLimitGasPrice)))));
        djBIcL().EZpvd.gEmmrt.AEQbTJ.setVisibility(djBIcL().EZpvd.gEmmrt.copydefault.getVisibility() == 0 ? 0 : 8);
        return false;
    }

    public final boolean OLrzqt(java.lang.String str, CosmosFeeItemInfo cosmosFeeItemInfo, boolean z) {
        java.lang.String minLimitGasLimit = cosmosFeeItemInfo.getGasLimit().getMinLimitGasLimit();
        if (!C33129mqd.OLrzqt(str, "0") && !C33129mqd.gEmmrt(str, minLimitGasLimit)) {
            if (z) {
                djBIcL().EZpvd.valueOf.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
                djBIcL().EZpvd.valueOf.AEQbTJ.setVisibility(8);
            }
            return true;
        }
        if (!z) {
            return false;
        }
        djBIcL().EZpvd.valueOf.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
        djBIcL().EZpvd.valueOf.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaDescriptionCompatApi21));
        djBIcL().EZpvd.valueOf.AEQbTJ.setVisibility(djBIcL().EZpvd.valueOf.copydefault.getVisibility() == 0 ? 0 : 8);
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL().EZpvd.gEmmrt.copydefault.EZpvd(this.AEQbTJ);
        djBIcL().EZpvd.valueOf.copydefault.EZpvd(this.EZpvd);
    }
}
