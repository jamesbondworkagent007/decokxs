package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C57230yeW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21248gwF extends AbstractViewOnClickListenerC21247gwE<C11989ceV, C11990ceW> {
    public final ActionBar AEQbTJ = new ActionBar();

    public static final /* synthetic */ C11990ceW EZpvd(C21248gwF c21248gwF) {
        return c21248gwF.AhwBna();
    }

    /* JADX INFO: renamed from: o.gwF$ActionBar */
    public static final class ActionBar extends C57230yeW.Application {
        public ActionBar() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            C11989ceV c11989ceVKWHzl = C21248gwF.EZpvd(C21248gwF.this).KWHzl(str == null ? "" : str);
            C21248gwF.this.EZpvd(c11989ceVKWHzl, 3);
            C21248gwF c21248gwF = C21248gwF.this;
            if (str == null) {
                str = "";
            }
            c21248gwF.copydefault(str, c11989ceVKWHzl, true);
            C21248gwF.this.OLrzqt();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/bDi;)V */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C11989ceV c11989ceV) {
        Intrinsics.checkNotNullParameter(c11989ceV, "");
        copydefault(c11989ceV, C11989ceV.formatFeeRate$default(c11989ceV, c11989ceV.copydefault().AEQbTJ(), false, 2, null), c11989ceV.getFeeAmount());
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/bDi;I)V */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C11989ceV c11989ceV, int i) {
        Intrinsics.checkNotNullParameter(c11989ceV, "");
        OLrzqt(c11989ceV, C11989ceV.formatFeeRate$default(c11989ceV, c11989ceV.copydefault().AEQbTJ(), false, 2, null), c11989ceV.getFeeAmount(), i);
        AEQbTJ(c11989ceV, c11989ceV.copydefault().AEQbTJ(), c11989ceV.getFeeUnit(), i);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void KWHzl(boolean z) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (z) {
            abstractC16844erb.DbNXlk.getRoot().setVisibility(0);
            abstractC16844erb.isConnected.setVisibility(0);
            if (gEmmrt()) {
                return;
            }
            C57230yeW c57230yeW = abstractC16844erb.DbNXlk.copydefault;
            c57230yeW.setText(c57230yeW.getText());
            return;
        }
        abstractC16844erb.isConnected.setVisibility(8);
        abstractC16844erb.DbNXlk.getRoot().setVisibility(8);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public boolean AEQbTJ() {
        java.lang.String strCopydefault = djBIcL().EZpvd.DbNXlk.copydefault.copydefault();
        C11989ceV c11989ceVEZpvd = AhwBna().EZpvd(4);
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return copydefault(strCopydefault, c11989ceVEZpvd, false);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void EZpvd() {
        java.lang.String strCopydefault = djBIcL().EZpvd.DbNXlk.copydefault.copydefault();
        if (strCopydefault == null) {
            return;
        }
        AhwBna().EZpvd(strCopydefault);
    }

    public final void AEQbTJ(C11989ceV c11989ceV, java.lang.String str, java.lang.String str2, int i) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (EZpvd(i)) {
            android.view.View root = abstractC16844erb.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            KWHzl(root);
            AbstractC17079evy abstractC17079evy = abstractC16844erb.DbNXlk;
            android.view.View root2 = abstractC17079evy.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            KWHzl(root2);
            abstractC17079evy.copydefault.EZpvd(this.AEQbTJ);
            abstractC17079evy.valueOf.setText(str2);
            abstractC17079evy.copydefault.setMaxDecimalValue(0);
            C57230yeW.setTextWrapper$default(abstractC17079evy.copydefault, str, null, 2, null);
            copydefault(str, c11989ceV, true);
            abstractC17079evy.copydefault.AEQbTJ(this.AEQbTJ);
        }
    }

    public final boolean copydefault(java.lang.String str, C11989ceV c11989ceV, boolean z) {
        boolean zIRxXKY = c11989ceV.getFeeCoinMeta().iRxXKY();
        if (str.length() == 0) {
            if (!z) {
                return false;
            }
            djBIcL().EZpvd.DbNXlk.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
            djBIcL().EZpvd.DbNXlk.AEQbTJ.setText("");
            djBIcL().EZpvd.DbNXlk.AEQbTJ.setVisibility(8);
            return false;
        }
        if (zIRxXKY && C33129mqd.gEmmrt(str, c11989ceV.copydefault().KWHzl())) {
            if (!z) {
                return false;
            }
            djBIcL().EZpvd.DbNXlk.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
            djBIcL().EZpvd.DbNXlk.AEQbTJ.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.apHBvG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", C11989ceV.formatFeeRate$default(c11989ceV, c11989ceV.copydefault().KWHzl(), false, 2, null)), C56390yDp.OLrzqt("unit", c11989ceV.getFeeUnit()))));
            djBIcL().EZpvd.DbNXlk.AEQbTJ.setVisibility(0);
            return false;
        }
        if (!zIRxXKY && C33129mqd.gEmmrt(str, c11989ceV.copydefault().OLrzqt())) {
            if (!z) {
                return false;
            }
            djBIcL().EZpvd.DbNXlk.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
            djBIcL().EZpvd.DbNXlk.AEQbTJ.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.apHBvG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", C11989ceV.formatFeeRate$default(c11989ceV, c11989ceV.copydefault().OLrzqt(), false, 2, null)), C56390yDp.OLrzqt("unit", c11989ceV.getFeeUnit()))));
            djBIcL().EZpvd.DbNXlk.AEQbTJ.setVisibility(0);
            return false;
        }
        if (zIRxXKY || !C33129mqd.AEQbTJ(str, c11989ceV.copydefault().copydefault())) {
            if (z) {
                djBIcL().EZpvd.DbNXlk.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
                djBIcL().EZpvd.DbNXlk.AEQbTJ.setText("");
                djBIcL().EZpvd.DbNXlk.AEQbTJ.setVisibility(8);
            }
            return true;
        }
        if (!z) {
            return false;
        }
        djBIcL().EZpvd.DbNXlk.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
        djBIcL().EZpvd.DbNXlk.AEQbTJ.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.DcMfJKgMxgjU, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("max", C11989ceV.formatFeeRate$default(c11989ceV, c11989ceV.copydefault().copydefault(), false, 2, null)), C56390yDp.OLrzqt("unit", c11989ceV.getFeeUnit()))));
        djBIcL().EZpvd.DbNXlk.AEQbTJ.setVisibility(0);
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL().EZpvd.DbNXlk.copydefault.EZpvd(this.AEQbTJ);
    }
}
