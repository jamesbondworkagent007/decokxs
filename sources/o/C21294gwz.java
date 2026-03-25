package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C54871xYk;
import o.C57230yeW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21294gwz extends AbstractViewOnClickListenerC21247gwE<C9215bRQ, AbstractC9346bTp> {
    public final Application KWHzl = new Application();
    public final ActionBar EZpvd = new ActionBar();
    public final Activity OLrzqt = new Activity();
    public final StateListAnimator AEQbTJ = new StateListAnimator();
    public boolean copydefault = true;

    public static final /* synthetic */ AbstractC9346bTp EZpvd(C21294gwz c21294gwz) {
        return c21294gwz.AhwBna();
    }

    /* JADX INFO: renamed from: o.gwz$Application */
    public static final class Application extends C57230yeW.Application {
        public Application() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC9346bTp abstractC9346bTpEZpvd = C21294gwz.EZpvd(C21294gwz.this);
            java.lang.String strOLrzqt = C54869xYi.OLrzqt(str == null ? "" : str, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false);
            java.lang.String strCopydefault = C21294gwz.this.djBIcL().EZpvd.valueOf.copydefault.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            C9215bRQ c9215bRQCopydefault = abstractC9346bTpEZpvd.copydefault(strOLrzqt, strCopydefault);
            C21294gwz.this.EZpvd(c9215bRQCopydefault, 3);
            C21294gwz c21294gwz = C21294gwz.this;
            if (str == null) {
                str = "";
            }
            c21294gwz.copydefault(str, c9215bRQCopydefault);
            C21294gwz.this.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.gwz$ActionBar */
    public static final class ActionBar extends C57230yeW.Application {
        public ActionBar() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC9346bTp abstractC9346bTpEZpvd = C21294gwz.EZpvd(C21294gwz.this);
            java.lang.String strOLrzqt = C54869xYi.OLrzqt(str == null ? "" : str, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false);
            java.lang.String strCopydefault = C21294gwz.this.djBIcL().EZpvd.AkhnZx.copydefault.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            java.lang.String strOLrzqt2 = C54869xYi.OLrzqt(strCopydefault, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false);
            java.lang.String strCopydefault2 = C21294gwz.this.djBIcL().EZpvd.valueOf.copydefault.copydefault();
            if (strCopydefault2 == null) {
                strCopydefault2 = "";
            }
            C9215bRQ c9215bRQAEQbTJ = abstractC9346bTpEZpvd.AEQbTJ(strOLrzqt, strOLrzqt2, strCopydefault2);
            C21294gwz.this.EZpvd(c9215bRQAEQbTJ, 3);
            C21294gwz c21294gwz = C21294gwz.this;
            if (str == null) {
                str = "";
            }
            c21294gwz.KWHzl(str, c9215bRQAEQbTJ);
            C21294gwz.this.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.gwz$Activity */
    public static final class Activity extends C57230yeW.Application {
        public Activity() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC9346bTp abstractC9346bTpEZpvd = C21294gwz.EZpvd(C21294gwz.this);
            java.lang.String strCopydefault = C21294gwz.this.djBIcL().EZpvd.AYXKKw.copydefault.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            java.lang.String strOLrzqt = C54869xYi.OLrzqt(strCopydefault, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false);
            java.lang.String strOLrzqt2 = C54869xYi.OLrzqt(str == null ? "" : str, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false);
            java.lang.String strCopydefault2 = C21294gwz.this.djBIcL().EZpvd.valueOf.copydefault.copydefault();
            if (strCopydefault2 == null) {
                strCopydefault2 = "";
            }
            C9215bRQ c9215bRQAEQbTJ = abstractC9346bTpEZpvd.AEQbTJ(strOLrzqt, strOLrzqt2, strCopydefault2);
            C21294gwz.this.EZpvd(c9215bRQAEQbTJ, 3);
            C21294gwz c21294gwz = C21294gwz.this;
            if (str == null) {
                str = "";
            }
            c21294gwz.EZpvd(str, c9215bRQAEQbTJ);
            C21294gwz.this.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.gwz$StateListAnimator */
    public static final class StateListAnimator extends C57230yeW.Application {
        public StateListAnimator() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            C9215bRQ c9215bRQCopydefault;
            if (C21294gwz.EZpvd(C21294gwz.this).ejfBZ()) {
                AbstractC9346bTp abstractC9346bTpEZpvd = C21294gwz.EZpvd(C21294gwz.this);
                java.lang.String strCopydefault = C21294gwz.this.djBIcL().EZpvd.AYXKKw.copydefault.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                java.lang.String strOLrzqt = C54869xYi.OLrzqt(strCopydefault, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false);
                java.lang.String strCopydefault2 = C21294gwz.this.djBIcL().EZpvd.AkhnZx.copydefault.copydefault();
                if (strCopydefault2 == null) {
                    strCopydefault2 = "";
                }
                c9215bRQCopydefault = abstractC9346bTpEZpvd.AEQbTJ(strOLrzqt, C54869xYi.OLrzqt(strCopydefault2, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false), str == null ? "" : str);
            } else {
                AbstractC9346bTp abstractC9346bTpEZpvd2 = C21294gwz.EZpvd(C21294gwz.this);
                java.lang.String strCopydefault3 = C21294gwz.this.djBIcL().EZpvd.gEmmrt.copydefault.copydefault();
                if (strCopydefault3 == null) {
                    strCopydefault3 = "";
                }
                c9215bRQCopydefault = abstractC9346bTpEZpvd2.copydefault(C54869xYi.OLrzqt(strCopydefault3, java.lang.Integer.valueOf(C21294gwz.this.AYXKKw()), false), str == null ? "" : str);
            }
            C21294gwz.this.EZpvd(c9215bRQCopydefault, 3);
            C21294gwz c21294gwz = C21294gwz.this;
            if (str == null) {
                str = "";
            }
            c21294gwz.AEQbTJ(str, c9215bRQCopydefault);
            C21294gwz.this.OLrzqt();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/bDi;)V */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C9215bRQ c9215bRQ) {
        Intrinsics.checkNotNullParameter(c9215bRQ, "");
        copydefault(c9215bRQ, C54869xYi.weiToGwei$default(c9215bRQ.djBIcL().AEQbTJ(), java.lang.Integer.valueOf(AYXKKw()), true, null, false, 12, null), c9215bRQ.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/bDi;I)V */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C9215bRQ c9215bRQ, int i) {
        Intrinsics.checkNotNullParameter(c9215bRQ, "");
        OLrzqt(c9215bRQ, C9215bRQ.weiToGwei$default(c9215bRQ, c9215bRQ.djBIcL().OLrzqt(), true, false, 4, null), c9215bRQ.getFeeAmount(), i);
        AEQbTJ(c9215bRQ);
        if (c9215bRQ.djBIcL().AhwBna()) {
            java.lang.String strWeiToGwei$default = C9215bRQ.weiToGwei$default(c9215bRQ, c9215bRQ.djBIcL().copydefault(), false, false, 6, null);
            java.lang.String strWeiToGwei$default2 = C9215bRQ.weiToGwei$default(c9215bRQ, c9215bRQ.djBIcL().valueOf(), true, false, 4, null);
            java.lang.String strKWHzl = c9215bRQ.djBIcL().KWHzl();
            KWHzl(c9215bRQ, strWeiToGwei$default, strWeiToGwei$default2, C9215bRQ.weiToGwei$default(c9215bRQ, strKWHzl == null ? "" : strKWHzl, false, false, 6, null), c9215bRQ.getFeeUnit(), c9215bRQ.valueOf().KWHzl(), i);
            return;
        }
        EZpvd(c9215bRQ, C9215bRQ.weiToGwei$default(c9215bRQ, c9215bRQ.djBIcL().AEQbTJ(), false, false, 6, null), c9215bRQ.getFeeUnit(), c9215bRQ.valueOf().KWHzl(), i);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void KWHzl(boolean z) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (!AhwBna().ejfBZ()) {
            if (z) {
                abstractC16844erb.gEmmrt.getRoot().setVisibility(0);
                abstractC16844erb.valueOf.getRoot().setVisibility(0);
                abstractC16844erb.values.setVisibility(0);
                abstractC16844erb.isConnected.setVisibility(0);
                djBIcL().KWHzl.setVisibility(0);
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
            abstractC16844erb.valueOf.getRoot().setVisibility(8);
            abstractC16844erb.valueOf.AEQbTJ.setVisibility(8);
            abstractC16844erb.gEmmrt.AEQbTJ.setVisibility(8);
            abstractC16844erb.values.setVisibility(8);
            abstractC16844erb.isConnected.setVisibility(8);
            return;
        }
        if (z) {
            abstractC16844erb.AYXKKw.getRoot().setVisibility(0);
            abstractC16844erb.AkhnZx.getRoot().setVisibility(0);
            abstractC16844erb.valueOf.getRoot().setVisibility(0);
            djBIcL().KWHzl.setVisibility(0);
            abstractC16844erb.isConnected.setVisibility(0);
            abstractC16844erb.values.setVisibility(0);
            if (gEmmrt()) {
                return;
            }
            C57230yeW c57230yeW3 = abstractC16844erb.AYXKKw.copydefault;
            c57230yeW3.setText(c57230yeW3.getText());
            C57230yeW c57230yeW4 = abstractC16844erb.AkhnZx.copydefault;
            c57230yeW4.setText(c57230yeW4.getText());
            C57230yeW c57230yeW5 = abstractC16844erb.valueOf.copydefault;
            c57230yeW5.setText(c57230yeW5.getText());
            return;
        }
        abstractC16844erb.AYXKKw.getRoot().setVisibility(8);
        abstractC16844erb.AYXKKw.AEQbTJ.setVisibility(8);
        abstractC16844erb.AkhnZx.getRoot().setVisibility(8);
        abstractC16844erb.AkhnZx.AEQbTJ.setVisibility(8);
        abstractC16844erb.valueOf.getRoot().setVisibility(8);
        abstractC16844erb.valueOf.AEQbTJ.setVisibility(8);
        abstractC16844erb.values.setVisibility(8);
        abstractC16844erb.isConnected.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0 A[ORIG_RETURN, RETURN] */
    @Override // o.AbstractViewOnClickListenerC21247gwE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AEQbTJ() {
        C9215bRQ c9215bRQEZpvd = AhwBna().EZpvd(4);
        if (AhwBna().ejfBZ()) {
            java.lang.String strCopydefault = djBIcL().EZpvd.valueOf.copydefault.copydefault();
            java.lang.String strCopydefault2 = djBIcL().EZpvd.AYXKKw.copydefault.copydefault();
            java.lang.String strCopydefault3 = djBIcL().EZpvd.AkhnZx.copydefault.copydefault();
            gFJ gfj = gFJ.KWHzl;
            return (gfj.OLrzqt(c9215bRQEZpvd.valueOf().OLrzqt(), strCopydefault) || gfj.AEQbTJ(c9215bRQEZpvd.valueOf().copydefault(), strCopydefault) || gfj.OLrzqt(strCopydefault2) || gfj.OLrzqt(strCopydefault3)) ? false : true;
        }
        java.lang.String strCopydefault4 = djBIcL().EZpvd.gEmmrt.copydefault.copydefault();
        java.lang.String strCopydefault5 = djBIcL().EZpvd.valueOf.copydefault.copydefault();
        gFJ gfj2 = gFJ.KWHzl;
        if (gfj2.KWHzl(c9215bRQEZpvd.djBIcL().EZpvd(), strCopydefault4, java.lang.Integer.valueOf(AYXKKw())) || gfj2.OLrzqt(c9215bRQEZpvd.valueOf().OLrzqt(), strCopydefault5) || gfj2.AEQbTJ(c9215bRQEZpvd.valueOf().copydefault(), strCopydefault5)) {
        }
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void AEQbTJ(int i) {
        KWHzl();
        if (!djBIcL().EZpvd.values.isChecked()) {
            AhwBna().EZpvd(false);
        } else {
            EZpvd();
        }
        super.AEQbTJ(i);
    }

    @Override // o.AbstractViewOnClickListenerC21247gwE
    public void EZpvd() {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String strCopydefault3;
        KWHzl();
        if (AhwBna().ejfBZ()) {
            java.lang.String strCopydefault4 = djBIcL().EZpvd.AYXKKw.copydefault.copydefault();
            if (strCopydefault4 == null || (strCopydefault2 = djBIcL().EZpvd.AkhnZx.copydefault.copydefault()) == null || (strCopydefault3 = djBIcL().EZpvd.valueOf.copydefault.copydefault()) == null) {
                return;
            }
            AhwBna().OLrzqt(C54869xYi.OLrzqt(strCopydefault4, java.lang.Integer.valueOf(AYXKKw()), false), C54869xYi.OLrzqt(strCopydefault2, java.lang.Integer.valueOf(AYXKKw()), false), strCopydefault3, djBIcL().EZpvd.values.isChecked(), !djBIcL().EZpvd.values.isChecked());
            return;
        }
        java.lang.String strCopydefault5 = djBIcL().EZpvd.gEmmrt.copydefault.copydefault();
        if (strCopydefault5 == null || (strCopydefault = djBIcL().EZpvd.valueOf.copydefault.copydefault()) == null) {
            return;
        }
        AhwBna().AEQbTJ(C54869xYi.OLrzqt(strCopydefault5, java.lang.Integer.valueOf(AYXKKw()), false), strCopydefault, djBIcL().EZpvd.values.isChecked(), !djBIcL().EZpvd.values.isChecked());
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("NetworkFee_Footer_AnimationCheckBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.gwx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21294gwz.copydefault(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C21294gwz c21294gwz, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("network_type", c21294gwz.AhwBna() instanceof C9339bTi ? "rpc" : "integrated_chain", true));
        return Unit.INSTANCE;
    }

    public final void EZpvd(C9215bRQ c9215bRQ, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (EZpvd(i)) {
            android.view.View root = abstractC16844erb.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            KWHzl(root);
            AbstractC17079evy abstractC17079evy = abstractC16844erb.gEmmrt;
            android.view.View root2 = abstractC17079evy.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            KWHzl(root2);
            abstractC17079evy.copydefault.EZpvd(this.KWHzl);
            abstractC17079evy.valueOf.setText(getString(C13754dXa.FragmentManager.clearRegistrations) + "(" + str2 + ")");
            abstractC17079evy.copydefault.setMaxDecimalValue(C54871xYk.Companion.EZpvd(java.lang.Integer.valueOf(AYXKKw())));
            C57230yeW.setTextWrapper$default(abstractC17079evy.copydefault, str, null, 2, null);
            copydefault(str, c9215bRQ);
            AppCompatTextView appCompatTextView = abstractC17079evy.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            KWHzl(appCompatTextView);
            abstractC17079evy.EZpvd.setText(str2);
            abstractC17079evy.copydefault.AEQbTJ(this.KWHzl);
            AbstractC17079evy abstractC17079evy2 = abstractC16844erb.valueOf;
            android.view.View root3 = abstractC17079evy2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            KWHzl(root3);
            abstractC17079evy2.copydefault.EZpvd(this.AEQbTJ);
            abstractC17079evy2.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQNKFG));
            abstractC17079evy2.copydefault.setMaxDecimalValue(0);
            C57230yeW.setTextWrapper$default(abstractC17079evy2.copydefault, str3, null, 2, null);
            copydefault(str3, c9215bRQ);
            abstractC17079evy2.copydefault.AEQbTJ(this.AEQbTJ);
        }
    }

    public static final void EZpvd(java.lang.String str, java.lang.String str2, C21294gwz c21294gwz, C9215bRQ c9215bRQ, AbstractC17079evy abstractC17079evy) {
        if (abstractC17079evy.getRoot().getVisibility() == 0) {
            abstractC17079evy.KWHzl.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.aKErDB, C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseFee", str), C56390yDp.OLrzqt("symbol", str2))));
            java.lang.String strCopydefault = abstractC17079evy.copydefault.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            c21294gwz.KWHzl(strCopydefault, c9215bRQ);
        }
    }

    public final void KWHzl(C9215bRQ c9215bRQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (!EZpvd(i)) {
            AbstractC17079evy abstractC17079evy = abstractC16844erb.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(abstractC17079evy, "");
            EZpvd(str2, str4, this, c9215bRQ, abstractC17079evy);
            return;
        }
        android.view.View root = abstractC16844erb.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        KWHzl(root);
        AbstractC17079evy abstractC17079evy2 = abstractC16844erb.AYXKKw;
        android.view.View root2 = abstractC17079evy2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        KWHzl(root2);
        abstractC17079evy2.copydefault.EZpvd(this.EZpvd);
        abstractC17079evy2.valueOf.setText(getString(C13754dXa.FragmentManager.gbIfDn));
        C57230yeW c57230yeW = abstractC17079evy2.copydefault;
        C54871xYk.StateListAnimator stateListAnimator = C54871xYk.Companion;
        c57230yeW.setMaxDecimalValue(stateListAnimator.EZpvd(java.lang.Integer.valueOf(AYXKKw())));
        C57230yeW.setTextWrapper$default(abstractC17079evy2.copydefault, str, null, 2, null);
        KWHzl(str, c9215bRQ);
        Intrinsics.copydefault(abstractC17079evy2);
        EZpvd(str2, str4, this, c9215bRQ, abstractC17079evy2);
        AppCompatTextView appCompatTextView = abstractC17079evy2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        KWHzl(appCompatTextView);
        abstractC17079evy2.EZpvd.setText(str4);
        abstractC17079evy2.copydefault.AEQbTJ(this.EZpvd);
        AbstractC17079evy abstractC17079evy3 = abstractC16844erb.AkhnZx;
        android.view.View root3 = abstractC17079evy3.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        KWHzl(root3);
        abstractC17079evy3.copydefault.EZpvd(this.OLrzqt);
        abstractC17079evy3.valueOf.setText(getString(C13754dXa.FragmentManager.sVvuFk));
        abstractC17079evy3.copydefault.setMaxDecimalValue(stateListAnimator.EZpvd(java.lang.Integer.valueOf(AYXKKw())));
        C57230yeW.setTextWrapper$default(abstractC17079evy3.copydefault, str3, null, 2, null);
        EZpvd(str3, c9215bRQ);
        AppCompatTextView appCompatTextView2 = abstractC17079evy3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        KWHzl(appCompatTextView2);
        abstractC17079evy3.EZpvd.setText(str4);
        abstractC17079evy3.copydefault.AEQbTJ(this.OLrzqt);
        AbstractC17079evy abstractC17079evy4 = abstractC16844erb.valueOf;
        android.view.View root4 = abstractC17079evy4.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        KWHzl(root4);
        abstractC17079evy4.copydefault.EZpvd(this.AEQbTJ);
        abstractC17079evy4.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQNKFG));
        abstractC17079evy4.copydefault.setMaxDecimalValue(0);
        C57230yeW.setTextWrapper$default(abstractC17079evy4.copydefault, str5, null, 2, null);
        AEQbTJ(str5, c9215bRQ);
        abstractC17079evy4.copydefault.AEQbTJ(this.AEQbTJ);
    }

    public final void copydefault(java.lang.String str, C9215bRQ c9215bRQ) {
        java.lang.String strEZpvd = c9215bRQ.djBIcL().EZpvd();
        boolean zKWHzl = gFJ.KWHzl.KWHzl(strEZpvd, str, java.lang.Integer.valueOf(AYXKKw()));
        java.lang.String strCopydefault = zKWHzl ? C33069mpW.copydefault(C13754dXa.FragmentManager.FSMca, C56423yEv.EZpvd(C56390yDp.OLrzqt("minGasPrice", C9215bRQ.weiToGwei$default(c9215bRQ, strEZpvd, true, false, 4, null)))) : "";
        if (zKWHzl) {
            djBIcL().EZpvd.gEmmrt.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
            djBIcL().EZpvd.gEmmrt.AEQbTJ.setText(strCopydefault);
            djBIcL().EZpvd.gEmmrt.AEQbTJ.setVisibility(djBIcL().EZpvd.gEmmrt.copydefault.getVisibility() == 0 ? 0 : 8);
        } else {
            djBIcL().EZpvd.gEmmrt.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
            djBIcL().EZpvd.gEmmrt.AEQbTJ.setVisibility(8);
        }
    }

    public final void KWHzl(java.lang.String str, C9215bRQ c9215bRQ) {
        java.lang.String strWeiToGwei$default = C9215bRQ.weiToGwei$default(c9215bRQ, c9215bRQ.djBIcL().valueOf(), false, false, 6, null);
        if (gFJ.KWHzl.OLrzqt(str)) {
            djBIcL().EZpvd.AYXKKw.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
            djBIcL().EZpvd.AYXKKw.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
            djBIcL().EZpvd.AYXKKw.AEQbTJ.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.hbZCHz, C56423yEv.EZpvd(C56390yDp.OLrzqt("baseFee", "0"))));
            djBIcL().EZpvd.AYXKKw.AEQbTJ.setVisibility(djBIcL().EZpvd.AYXKKw.copydefault.getVisibility() == 0 ? 0 : 8);
            return;
        }
        if (C33129mqd.gEmmrt(str, strWeiToGwei$default)) {
            djBIcL().EZpvd.AYXKKw.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
            djBIcL().EZpvd.AYXKKw.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv));
            djBIcL().EZpvd.AYXKKw.AEQbTJ.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.ORxRYg, C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseFee", strWeiToGwei$default), C56390yDp.OLrzqt("symbol", c9215bRQ.getFeeUnit()))));
            djBIcL().EZpvd.AYXKKw.AEQbTJ.setVisibility(djBIcL().EZpvd.AYXKKw.copydefault.getVisibility() == 0 ? 0 : 8);
            return;
        }
        djBIcL().EZpvd.AYXKKw.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
        djBIcL().EZpvd.AYXKKw.AEQbTJ.setVisibility(8);
    }

    public final void EZpvd(java.lang.String str, C9215bRQ c9215bRQ) {
        if (gFJ.KWHzl.OLrzqt(str)) {
            djBIcL().EZpvd.AkhnZx.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
            djBIcL().EZpvd.AkhnZx.AEQbTJ.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.onProviderEnabled, C56423yEv.EZpvd(C56390yDp.OLrzqt("priorityFee", "0"))));
            djBIcL().EZpvd.AkhnZx.AEQbTJ.setVisibility(djBIcL().EZpvd.AkhnZx.copydefault.getVisibility() == 0 ? 0 : 8);
        } else {
            djBIcL().EZpvd.AkhnZx.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
            djBIcL().EZpvd.AkhnZx.AEQbTJ.setVisibility(8);
        }
    }

    public final void AEQbTJ(java.lang.String str, C9215bRQ c9215bRQ) {
        java.lang.String strLimitFmtWithKMB2$default;
        java.math.BigInteger bigIntegerKWHzl;
        java.math.BigInteger bigIntegerKWHzl2;
        java.lang.String strCopydefault = c9215bRQ.valueOf().copydefault();
        java.lang.String strOLrzqt = c9215bRQ.valueOf().OLrzqt();
        gFJ gfj = gFJ.KWHzl;
        boolean zAEQbTJ = gfj.AEQbTJ(strCopydefault, str);
        boolean zOLrzqt = gfj.OLrzqt(strOLrzqt, str);
        java.lang.String strLimitFmtWithKMB2$default2 = "";
        if (strCopydefault == null || (bigIntegerKWHzl2 = C33129mqd.KWHzl(strCopydefault)) == null) {
            strLimitFmtWithKMB2$default = "";
        } else {
            double dAEQbTJ = C33129mqd.AEQbTJ(bigIntegerKWHzl2);
            if (C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ), 100000)) {
                strLimitFmtWithKMB2$default = pTB.formatLocalizedWithMinPrecision$default(strCopydefault, 0, null, 2, null);
            } else {
                strLimitFmtWithKMB2$default = C10858bwQ.limitFmtWithKMB2$default(dAEQbTJ, 0, 1, (java.lang.Object) null);
            }
        }
        if (strOLrzqt != null && (bigIntegerKWHzl = C33129mqd.KWHzl(strOLrzqt)) != null) {
            strLimitFmtWithKMB2$default2 = C10858bwQ.limitFmtWithKMB2$default(C33129mqd.AEQbTJ(bigIntegerKWHzl), 0, 1, (java.lang.Object) null);
        }
        if (zAEQbTJ || zOLrzqt) {
            java.lang.String strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.OmYuqg, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minGasLimit", strLimitFmtWithKMB2$default), C56390yDp.OLrzqt("maxGasLimit", strLimitFmtWithKMB2$default2)));
            djBIcL().EZpvd.valueOf.OLrzqt.setBackgroundResource(C13754dXa.Activity.hDKMBd);
            djBIcL().EZpvd.valueOf.AEQbTJ.setText(strCopydefault2);
            djBIcL().EZpvd.valueOf.AEQbTJ.setVisibility(djBIcL().EZpvd.valueOf.copydefault.getVisibility() != 0 ? 8 : 0);
            return;
        }
        djBIcL().EZpvd.valueOf.OLrzqt.setBackgroundResource(C13754dXa.Activity.getFieldNames);
        djBIcL().EZpvd.valueOf.AEQbTJ.setVisibility(8);
    }

    public final void AEQbTJ(C9215bRQ c9215bRQ) {
        if (this.copydefault) {
            wYK wyk = djBIcL().EZpvd.values;
            wyk.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.readTypedObject, C56423yEv.EZpvd(C56390yDp.OLrzqt("networkName", c9215bRQ.getFeeCoinMeta().djBIcL()))));
            wyk.setChecked(c9215bRQ.AYXKKw());
            this.copydefault = false;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL().EZpvd.gEmmrt.copydefault.EZpvd(this.KWHzl);
        djBIcL().EZpvd.valueOf.copydefault.EZpvd(this.AEQbTJ);
        djBIcL().EZpvd.AYXKKw.copydefault.EZpvd(this.EZpvd);
        djBIcL().EZpvd.AkhnZx.copydefault.EZpvd(this.OLrzqt);
    }
}
