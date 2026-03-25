package o;

import android.graphics.RectF;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.rxutils.RxBus;
import java.util.Map;

/* JADX INFO: renamed from: o.oXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36313oXd extends oWO {
    public long djBIcL = 0;
    public C36312oXc gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateIdle";
    }

    public C36313oXd(C36312oXc c36312oXc) {
        this.gEmmrt = c36312oXc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x036e, code lost:
    
        if (r7 != false) goto L125;
     */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AhwBna(android.view.MotionEvent motionEvent) {
        super.AhwBna(motionEvent);
        this.gEmmrt.OLrzqt(false);
        this.gEmmrt.copydefault(false);
        this.gEmmrt.KWHzl(false);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.iwGUEr().fARcdN() != null || c36246oUrCopydefault.iwGUEr().AuCTel() != null) {
            pEM.AEQbTJ.AEQbTJ(false);
        }
        if (((java.lang.Boolean) copydefault(motionEvent).first).booleanValue()) {
            if (this.gEmmrt.DbNXlk() != null) {
                this.gEmmrt.DbNXlk().KWHzl(((java.lang.Integer) copydefault(motionEvent).second).intValue());
            }
            return false;
        }
        if (((java.lang.Boolean) KWHzl(motionEvent).first).booleanValue()) {
            if (this.gEmmrt.DbNXlk() != null && copydefault()) {
                this.gEmmrt.DbNXlk().gEmmrt();
            }
            return false;
        }
        if (c36246oUrCopydefault.iwGUEr().AwvSrB() != null && c36246oUrCopydefault.iwGUEr().AwvSrB().contains(motionEvent.getX(), motionEvent.getY()) && !c36246oUrCopydefault.gHZMYf().equals("NORMAL")) {
            if (this.gEmmrt.DbNXlk() != null) {
                this.gEmmrt.DbNXlk().invalidate();
            }
            c36246oUrCopydefault.iwGUEr().KWHzl((RectF) null);
            c36246oUrCopydefault.EZpvd(true);
            c36246oUrCopydefault.iwGUEr().KWHzl("Click");
            C36246oUr.copydefault().fIwbmz("XMove");
            c36246oUrCopydefault.EZpvd(5);
            if (c36246oUrCopydefault.iwGUEr().fZBcTu()) {
                c36246oUrCopydefault.iwGUEr().EZpvd(false);
                c36246oUrCopydefault.DbNXlk("YScale");
                if (this.gEmmrt.DbNXlk() != null && this.gEmmrt.DbNXlk().DbNXlk() != null) {
                    KWHzl(false);
                }
            } else {
                c36246oUrCopydefault.iwGUEr().EZpvd(true);
                c36246oUrCopydefault.DbNXlk("NORMAL");
                if (this.gEmmrt.DbNXlk() != null && this.gEmmrt.DbNXlk().DbNXlk() != null) {
                    KWHzl(true);
                }
            }
            return false;
        }
        if (c36246oUrCopydefault.iwGUEr().QfsBiF() != null && c36246oUrCopydefault.iwGUEr().QfsBiF().contains(motionEvent.getX(), motionEvent.getY())) {
            OLrzqt(this.gEmmrt, motionEvent);
            this.gEmmrt.OLrzqt(true);
            return false;
        }
        RectF rectFAuCTel = c36246oUrCopydefault.iwGUEr().AuCTel();
        if (rectFAuCTel != null && rectFAuCTel.contains(motionEvent.getX(), motionEvent.getY())) {
            OLrzqt(this.gEmmrt, motionEvent);
            this.gEmmrt.KWHzl(true);
            this.gEmmrt.copydefault(false);
            pUU.EZpvd("StateIdle", "onActionDown: start to drag min line");
            return false;
        }
        RectF rectFFARcdN = c36246oUrCopydefault.iwGUEr().fARcdN();
        if (rectFFARcdN != null && rectFFARcdN.contains(motionEvent.getX(), motionEvent.getY())) {
            OLrzqt(this.gEmmrt, motionEvent);
            this.gEmmrt.copydefault(true);
            this.gEmmrt.KWHzl(false);
            pUU.EZpvd("StateIdle", "onActionDown: start to drag max line");
            return false;
        }
        if (c36246oUrCopydefault.iwGUEr().RJOkX() != null && c36246oUrCopydefault.iwGUEr().RJOkX().contains(motionEvent.getX(), motionEvent.getY())) {
            boolean z = SPUtils.getBoolean("hide_kline_drawing_data", false);
            boolean z2 = !z;
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.valueOf(z2));
            C36246oUr.copydefault().AkhnZx(z2);
            if (this.gEmmrt.DbNXlk() != null) {
                this.gEmmrt.DbNXlk().invalidate();
            }
            if (!z) {
                RxBus.KWHzl("hide_drawing_line");
            }
            return false;
        }
        if (c36246oUrCopydefault.QOLQEE() != null && c36246oUrCopydefault.QOLQEE().contains(motionEvent.getX(), motionEvent.getY())) {
            if (this.gEmmrt.DbNXlk() != null) {
                if (c36246oUrCopydefault.iwGUEr().giSNqX()) {
                    c36246oUrCopydefault.AEQbTJ((RectF) null);
                    copydefault(this.gEmmrt);
                    if (this.gEmmrt.DbNXlk().isConnected() == 0) {
                        RxBus.KWHzl("kline_portrait_full_screen");
                        EZpvd("fullscreen_icon_click");
                    } else {
                        RxBus.KWHzl("kline_portrait_normal");
                        EZpvd("classic_icon_click");
                    }
                } else {
                    c36246oUrCopydefault.AEQbTJ((RectF) null);
                    RxBus.KWHzl("kline_full_screen");
                    java.util.HashMap map = new java.util.HashMap();
                    map.put("chart_horizontal_button", "chart_horizontal_button");
                    C32866mlf.EZpvd("KLine_Full_Button_Click", map);
                }
            }
            return false;
        }
        if (((java.lang.Boolean) valueOf(motionEvent).first).booleanValue()) {
            OLrzqt(this.gEmmrt, motionEvent);
            return false;
        }
        if (((java.lang.Boolean) gEmmrt(motionEvent).first).booleanValue()) {
            OLrzqt(this.gEmmrt, motionEvent);
            return false;
        }
        if (((java.lang.Boolean) djBIcL(motionEvent).first).booleanValue()) {
            OLrzqt(this.gEmmrt, motionEvent);
            return false;
        }
        if (((java.lang.Boolean) AEQbTJ(motionEvent).first).booleanValue()) {
            OLrzqt(this.gEmmrt, motionEvent);
            return false;
        }
        if (((java.lang.Boolean) OLrzqt(motionEvent).first).booleanValue()) {
            OLrzqt(this.gEmmrt, motionEvent);
            return false;
        }
        if (!c36246oUrCopydefault.iwGUEr().DTwDnp().isEmpty() && c36246oUrCopydefault.iRxXKY().size() > 0) {
            boolean z3 = false;
            for (int i = 0; i < c36246oUrCopydefault.iRxXKY().size(); i++) {
                if (c36246oUrCopydefault.iRxXKY().get(i).getSelected()) {
                    z3 = true;
                }
                c36246oUrCopydefault.iRxXKY().get(i).setSelected(false);
            }
            java.util.Iterator<Map.Entry<java.lang.Integer, RectF>> it = c36246oUrCopydefault.iwGUEr().DTwDnp().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<java.lang.Integer, RectF> next = it.next();
                    int iIntValue = next.getKey().intValue();
                    if (next.getValue().contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.iRxXKY().size()) {
                        c36246oUrCopydefault.iRxXKY().get(iIntValue).setSelected(true);
                        break;
                    }
                }
            }
            if (this.gEmmrt.DbNXlk() != null) {
                this.gEmmrt.DbNXlk().invalidate();
                this.gEmmrt.OLrzqt(motionEvent.getY());
                oWO owo = this.gEmmrt.zsXlph;
                if (owo instanceof C36315oXf) {
                    ((C36315oXf) owo).EZpvd(true);
                }
                this.gEmmrt.DbNXlk().DbNXlk().OLrzqt(new PriceWarningItemBean(), "force");
                C36312oXc c36312oXc = this.gEmmrt;
                c36312oXc.EZpvd(c36312oXc.zsXlph);
            }
            return false;
        }
        if (c36246oUrCopydefault.iwGUEr().ORxRYg() != null && c36246oUrCopydefault.iwGUEr().ORxRYg().contains(motionEvent.getX(), motionEvent.getY())) {
            copydefault(this.gEmmrt);
            c36246oUrCopydefault.iwGUEr().djBIcL((RectF) null);
            if (c36246oUrCopydefault.zLjUOn().isFastKLineMode() && this.gEmmrt.DbNXlk() != null) {
                this.gEmmrt.DbNXlk().UeEOUB();
                return false;
            }
            c36246oUrCopydefault.AhwBna(false);
            if (this.gEmmrt.DbNXlk() != null) {
                this.gEmmrt.DbNXlk().invalidate();
            }
            c36246oUrCopydefault.iwGUEr().KWHzl((RectF) null);
            c36246oUrCopydefault.EZpvd(true);
            c36246oUrCopydefault.iwGUEr().EZpvd(true);
            c36246oUrCopydefault.DbNXlk("NORMAL");
            return false;
        }
        if (((java.lang.Boolean) EZpvd(motionEvent).first).booleanValue()) {
            OLrzqt(this.gEmmrt, motionEvent);
            return false;
        }
        this.gEmmrt.EZpvd(java.lang.System.currentTimeMillis());
        this.gEmmrt.copydefault(motionEvent.getX());
        this.gEmmrt.OLrzqt(motionEvent.getY());
        oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
        if (own == null) {
            return true;
        }
        own.sSMYrx();
        own.AwvSrB();
        if (this.gEmmrt.gEmmrt() != null && !this.gEmmrt.gEmmrt().OLrzqt()) {
            this.gEmmrt.gEmmrt().EZpvd();
            return false;
        }
        c36246oUrCopydefault.iwGUEr().values().get("ds0.root").EZpvd((int) motionEvent.getX(), (int) motionEvent.getY());
        if (this.gEmmrt.DbNXlk() == null) {
            return true;
        }
        if (c36246oUrCopydefault.getNewProxyInstance() == 1 && c36246oUrCopydefault.OLrzqt(motionEvent.getX(), motionEvent.getY()) != null) {
            this.gEmmrt.DbNXlk().invalidate();
            ((C36310oXa) this.gEmmrt.AuCTelauCTel).OLrzqt(c36246oUrCopydefault.OLrzqt(motionEvent.getX(), motionEvent.getY()).EZpvd());
            C36312oXc c36312oXc2 = this.gEmmrt;
            c36312oXc2.EZpvd(c36312oXc2.AuCTelauCTel);
            return false;
        }
        c36246oUrCopydefault.AEQbTJ();
        this.gEmmrt.DbNXlk().invalidate();
        C36312oXc c36312oXc3 = this.gEmmrt;
        c36312oXc3.EZpvd(c36312oXc3.gHZMYf);
        if (c36246oUrCopydefault.iwGUEr().sSMYrx() != null && c36246oUrCopydefault.iwGUEr().sSMYrx().contains(motionEvent.getX(), motionEvent.getY()) && this.gEmmrt.DbNXlk() != null) {
            this.gEmmrt.DbNXlk().EZpvd(true);
        }
        if (c36246oUrCopydefault.iwGUEr().gHZMYf() != null && c36246oUrCopydefault.iwGUEr().gHZMYf().contains(motionEvent.getX(), motionEvent.getY()) && c36246oUrCopydefault.gHZMYf().equals("YScale") && this.gEmmrt.DbNXlk() != null) {
            this.gEmmrt.DbNXlk().EZpvd(true);
        }
        return false;
    }

    public final boolean copydefault() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - this.djBIcL < 1000) {
            return false;
        }
        this.djBIcL = jCurrentTimeMillis;
        return true;
    }

    public final void EZpvd(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chart_size_swtich_click", str);
        C32866mlf.EZpvd("KLine_Full_Button_Click", map);
    }

    private void KWHzl(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reset_type", "a_button");
        C32866mlf.EZpvd("KLine_Yaxis_Reset_Click", map);
    }

    @Override // o.oWO
    public boolean AEQbTJ() {
        if (this.gEmmrt.gEmmrt() == null || !this.gEmmrt.gEmmrt().OLrzqt()) {
            return false;
        }
        C36312oXc c36312oXc = this.gEmmrt;
        c36312oXc.EZpvd(c36312oXc.AubY);
        return false;
    }

    @Override // o.oWO
    public boolean values(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 2) {
            return true;
        }
        this.gEmmrt.EZpvd(C36326oXq.copydefault(motionEvent));
        if (this.gEmmrt.DbNXlk() != null) {
            if (this.gEmmrt.fetchVPNInfo() > android.view.ViewConfiguration.get(this.gEmmrt.DbNXlk().getContext()).getScaledTouchSlop()) {
                C36246oUr.copydefault().DCJXGO().get("ds0").AxsJAY();
            }
            this.gEmmrt.DbNXlk().EZpvd(true);
            C36312oXc c36312oXc = this.gEmmrt;
            c36312oXc.EZpvd(c36312oXc.AwvSrB);
        }
        return true;
    }

    @Override // o.oWO
    public void AEQbTJ(boolean z) {
        if (z) {
            C36312oXc c36312oXc = this.gEmmrt;
            c36312oXc.EZpvd(c36312oXc.getFieldNames);
            C36246oUr.copydefault().valueOf(true);
        } else {
            C36312oXc c36312oXc2 = this.gEmmrt;
            c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
            C36246oUr.copydefault().valueOf(false);
        }
    }

    @Override // o.oWO
    public void EZpvd() {
        super.EZpvd();
        C36246oUr.copydefault().valueOf(false);
    }

    @Override // o.oWO
    public void OLrzqt() {
        super.OLrzqt();
    }
}
