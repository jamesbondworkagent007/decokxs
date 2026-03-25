package o;

import android.graphics.RectF;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.kline.data.PriceWarningItemBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36250oUv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36315oXf extends oWO {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public boolean gEmmrt;
    public C36312oXc values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateMoveAlertLine";
    }

    public C36315oXf(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.values = c36312oXc;
    }

    /* JADX INFO: renamed from: o.oXf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        Unit unit;
        java.lang.Object next;
        C36250oUv.StateListAnimator stateListAnimatorDbNXlk;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AhwBna(motionEvent);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.util.List<PriceWarningItemBean> listIRxXKY = c36246oUrCopydefault.iRxXKY();
        Intrinsics.checkNotNullExpressionValue(listIRxXKY, "");
        java.util.Iterator<T> it = listIRxXKY.iterator();
        while (true) {
            unit = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PriceWarningItemBean) next).getSelected()) {
                break;
            }
        }
        PriceWarningItemBean priceWarningItemBean = (PriceWarningItemBean) next;
        if (priceWarningItemBean != null) {
            RectF rectF = c36246oUrCopydefault.iwGUEr().DTwDnp().get(java.lang.Integer.valueOf(c36246oUrCopydefault.iRxXKY().indexOf(priceWarningItemBean)));
            if (rectF != null) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFQOLQEE = C36246oUr.copydefault().iwGUEr().QOLQEE();
                    if (rectFQOLQEE == null || !rectFQOLQEE.contains(motionEvent.getX(), motionEvent.getY())) {
                        return true;
                    }
                    C36250oUv c36250oUvDbNXlk = this.values.DbNXlk();
                    if (c36250oUvDbNXlk != null && (stateListAnimatorDbNXlk = c36250oUvDbNXlk.DbNXlk()) != null) {
                        stateListAnimatorDbNXlk.OLrzqt(priceWarningItemBean, RequestParameters.SUBRESOURCE_DELETE);
                    }
                    return false;
                }
                priceWarningItemBean.setSelected(false);
                C36312oXc c36312oXc = this.values;
                c36312oXc.EZpvd(c36312oXc.zLjUOn);
                C36250oUv c36250oUvDbNXlk2 = this.values.DbNXlk();
                if (c36250oUvDbNXlk2 != null) {
                    c36250oUvDbNXlk2.invalidate();
                    unit = Unit.INSTANCE;
                }
            }
            if (unit == null) {
                C36312oXc c36312oXc2 = this.values;
                c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
            }
        }
        return false;
    }

    @Override // o.oWO
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.DbNXlk(motionEvent);
        RectF rectFQOLQEE = C36246oUr.copydefault().iwGUEr().QOLQEE();
        if (rectFQOLQEE != null && rectFQOLQEE.contains(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        C36250oUv c36250oUvDbNXlk = this.values.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.EZpvd(true);
        }
        KWHzl(motionEvent.getY() - this.values.djBIcL());
        this.values.OLrzqt(motionEvent.getY());
        C36250oUv c36250oUvDbNXlk2 = this.values.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.invalidate();
        }
        return true;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.Object next;
        C36250oUv c36250oUvDbNXlk;
        C36250oUv.StateListAnimator stateListAnimatorDbNXlk;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.fetchVPNInfo(motionEvent);
        if (this.gEmmrt) {
            this.gEmmrt = false;
            return true;
        }
        RectF rectFQOLQEE = C36246oUr.copydefault().iwGUEr().QOLQEE();
        if (rectFQOLQEE != null && rectFQOLQEE.contains(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        java.util.List<PriceWarningItemBean> listIRxXKY = C36246oUr.copydefault().iRxXKY();
        Intrinsics.checkNotNullExpressionValue(listIRxXKY, "");
        java.util.Iterator<T> it = listIRxXKY.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PriceWarningItemBean) next).getSelected()) {
                break;
            }
        }
        PriceWarningItemBean priceWarningItemBean = (PriceWarningItemBean) next;
        if (priceWarningItemBean != null && priceWarningItemBean.getDragChange() && (c36250oUvDbNXlk = this.values.DbNXlk()) != null && (stateListAnimatorDbNXlk = c36250oUvDbNXlk.DbNXlk()) != null) {
            stateListAnimatorDbNXlk.OLrzqt(priceWarningItemBean, "change");
        }
        return false;
    }

    public final void KWHzl(float f) {
        java.lang.Object next;
        java.lang.String promptThreshold;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get("ds0.m");
        java.util.List<PriceWarningItemBean> listIRxXKY = c36246oUrCopydefault.iRxXKY();
        Intrinsics.checkNotNullExpressionValue(listIRxXKY, "");
        java.util.Iterator<T> it = listIRxXKY.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PriceWarningItemBean) next).getSelected()) {
                    break;
                }
            }
        }
        PriceWarningItemBean priceWarningItemBean = (PriceWarningItemBean) next;
        if (priceWarningItemBean == null || owc == null) {
            return;
        }
        double dEZpvd = owc.EZpvd((int) (owc.AhwBna(C33129mqd.OLrzqt(C56515yIf.KWHzl, (java.lang.Object) priceWarningItemBean.getPromptThreshold())) + f));
        BigDecimal scale = BigDecimal.valueOf(dEZpvd).setScale(AbstractC36302oWt.EZpvd(dEZpvd), RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(scale);
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            priceWarningItemBean.setDragChange(false);
            promptThreshold = priceWarningItemBean.getPromptThreshold();
        } else {
            priceWarningItemBean.setDragChange(true);
            promptThreshold = C33129mqd.gEmmrt(scale);
        }
        priceWarningItemBean.setPromptThreshold(promptThreshold);
    }
}
