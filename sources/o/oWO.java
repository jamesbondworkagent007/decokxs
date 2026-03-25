package o;

import android.graphics.RectF;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oWO {
    public java.lang.String AYXKKw = "State";
    public java.lang.String KWHzl = "buy";
    public java.lang.String OLrzqt = "sell";
    public java.lang.String AEQbTJ = "net";
    public java.lang.String copydefault = "long";
    public java.lang.String EZpvd = "short";
    public int AhwBna = -1;
    public int valueOf = C55298xhM.copydefault(1.0f, (android.content.Context) C43246rlf.OLrzqt.valueOf());

    public void AEQbTJ(boolean z) {
    }

    public boolean AEQbTJ() {
        return false;
    }

    public boolean AYXKKw(android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean AhwBna(android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean AkhnZx(android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean DbNXlk(android.view.MotionEvent motionEvent) {
        return false;
    }

    public void EZpvd() {
    }

    public abstract java.lang.String KWHzl();

    public void OLrzqt() {
    }

    public boolean fetchVPNInfo(android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean values(android.view.MotionEvent motionEvent) {
        return false;
    }

    public android.util.Pair<java.lang.Boolean, KlineOpenOrderBean> djBIcL(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        KlineOpenOrderBean klineOpenOrderBean = null;
        if (!c36246oUrCopydefault.iwGUEr().AxsJAY().isEmpty() && !c36246oUrCopydefault.gasjUx().isEmpty() && c36246oUrCopydefault.fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().AxsJAY().keySet());
            Collections.reverse(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                RectF rectF = c36246oUrCopydefault.iwGUEr().AxsJAY().get(java.lang.Integer.valueOf(iIntValue));
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.gasjUx().size()) {
                    klineOpenOrderBean = c36246oUrCopydefault.gasjUx().get(iIntValue);
                    this.AhwBna = iIntValue;
                    z = true;
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineOpenOrderBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public android.util.Pair<java.lang.Boolean, InterfaceC39510pth> valueOf(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        InterfaceC39510pth interfaceC39510pth = null;
        if (!c36246oUrCopydefault.iwGUEr().gEmmrt().isEmpty() && !c36246oUrCopydefault.DCUTEI().isEmpty() && c36246oUrCopydefault.fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().gEmmrt().keySet());
            Collections.reverse(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                RectF rectF = c36246oUrCopydefault.iwGUEr().gEmmrt().get(java.lang.Integer.valueOf(iIntValue));
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.DCUTEI().size()) {
                    interfaceC39510pth = c36246oUrCopydefault.DCUTEI().get(iIntValue);
                    z = true;
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public android.util.Pair<java.lang.Boolean, KlineSpotAverageBean> gEmmrt(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        KlineSpotAverageBean klineSpotAverageBean = null;
        if (c36246oUrCopydefault.iwGUEr().aKErDB() != null && c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean() != null && c36246oUrCopydefault.DaRZkR()) {
            if (c36246oUrCopydefault.iwGUEr().aKErDB().contains(motionEvent.getX(), motionEvent.getY())) {
                klineSpotAverageBean = c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean();
                z = true;
            } else {
                z = false;
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineSpotAverageBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public android.util.Pair<java.lang.Boolean, InterfaceC39510pth> AEQbTJ(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        InterfaceC39510pth interfaceC39510pth = null;
        if (!c36246oUrCopydefault.iwGUEr().iwGUEr().isEmpty() && !c36246oUrCopydefault.DCUTEI().isEmpty() && c36246oUrCopydefault.fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().iwGUEr().keySet());
            Collections.reverse(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                RectF rectF = c36246oUrCopydefault.iwGUEr().iwGUEr().get(java.lang.Integer.valueOf(iIntValue));
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.DCUTEI().size()) {
                    interfaceC39510pth = c36246oUrCopydefault.DCUTEI().get(iIntValue);
                    z = true;
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public android.util.Pair<java.lang.Boolean, InterfaceC39510pth> OLrzqt(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        InterfaceC39510pth interfaceC39510pth = null;
        if (!c36246oUrCopydefault.iwGUEr().KWHzl().isEmpty() && !c36246oUrCopydefault.DCUTEI().isEmpty() && c36246oUrCopydefault.fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().KWHzl().keySet());
            Collections.reverse(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                RectF rectF = c36246oUrCopydefault.iwGUEr().KWHzl().get(java.lang.Integer.valueOf(iIntValue));
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.DCUTEI().size()) {
                    interfaceC39510pth = c36246oUrCopydefault.DCUTEI().get(iIntValue);
                    z = true;
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public android.util.Pair<java.lang.Boolean, oLS> EZpvd(android.view.MotionEvent motionEvent) {
        oLS ols;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        for (Map.Entry<java.lang.Integer, RectF> entry : c36246oUrCopydefault.iwGUEr().fIwbmz().entrySet()) {
            java.lang.Integer key = entry.getKey();
            RectF value = entry.getValue();
            if (value != null && value.contains(motionEvent.getX(), motionEvent.getY()) && key.intValue() < c36246oUrCopydefault.dNCPSb().size() && (ols = c36246oUrCopydefault.dNCPSb().get(key.intValue())) != null) {
                ols.EZpvd(true);
                return new android.util.Pair<>(java.lang.Boolean.TRUE, ols);
            }
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public android.util.Pair<java.lang.Boolean, java.lang.Integer> KWHzl(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        int i = -1;
        if (!c36246oUrCopydefault.iwGUEr().OLrzqt().isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().OLrzqt().keySet());
            Collections.reverse(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                RectF rectF = c36246oUrCopydefault.iwGUEr().OLrzqt().get(java.lang.Integer.valueOf(iIntValue));
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    z = true;
                    i = iIntValue;
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, -1);
    }

    public android.util.Pair<java.lang.Boolean, java.lang.Integer> copydefault(android.view.MotionEvent motionEvent) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        int i = -1;
        if (!c36246oUrCopydefault.iwGUEr().copydefault().isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().copydefault().keySet());
            Collections.reverse(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                RectF rectF = c36246oUrCopydefault.iwGUEr().copydefault().get(java.lang.Integer.valueOf(iIntValue));
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    z = true;
                    i = iIntValue;
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, -1);
    }

    public void fJNWhG(android.view.MotionEvent motionEvent) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.iwGUEr().AxsJAY().isEmpty() || c36246oUrCopydefault.gasjUx().isEmpty() || !c36246oUrCopydefault.fdOvFl()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().AxsJAY().keySet());
        Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            RectF rectF = c36246oUrCopydefault.iwGUEr().AxsJAY().get(java.lang.Integer.valueOf(iIntValue));
            if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.gasjUx().size()) {
                C37932pGa.AEQbTJ.EZpvd(c36246oUrCopydefault.gasjUx().get(iIntValue));
                return;
            }
        }
    }

    public void AuCTel(android.view.MotionEvent motionEvent) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.iwGUEr().gEmmrt().isEmpty() || c36246oUrCopydefault.DCUTEI().isEmpty() || !c36246oUrCopydefault.fdOvFl()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().gEmmrt().keySet());
        Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            RectF rectF = c36246oUrCopydefault.iwGUEr().gEmmrt().get(java.lang.Integer.valueOf(iIntValue));
            if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.DCUTEI().size()) {
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setSelected(true);
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setShowSolid(true);
                C37932pGa.AEQbTJ.AEQbTJ(c36246oUrCopydefault.DCUTEI().get(iIntValue));
                return;
            }
        }
    }

    public void fIwbmz(android.view.MotionEvent motionEvent) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.iwGUEr().iwGUEr().isEmpty() || c36246oUrCopydefault.DCUTEI().isEmpty() || !c36246oUrCopydefault.fdOvFl()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().iwGUEr().keySet());
        Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            RectF rectF = c36246oUrCopydefault.iwGUEr().iwGUEr().get(java.lang.Integer.valueOf(iIntValue));
            if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.DCUTEI().size()) {
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setLiqSelected(true);
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setShowSolidLiq(true);
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setShowSolidBE(false);
                C37932pGa.AEQbTJ.AEQbTJ(c36246oUrCopydefault.DCUTEI().get(iIntValue));
                return;
            }
        }
    }

    public void isConnected(android.view.MotionEvent motionEvent) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.iwGUEr().KWHzl().isEmpty() || c36246oUrCopydefault.DCUTEI().isEmpty() || !c36246oUrCopydefault.fdOvFl()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(c36246oUrCopydefault.iwGUEr().KWHzl().keySet());
        Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            RectF rectF = c36246oUrCopydefault.iwGUEr().KWHzl().get(java.lang.Integer.valueOf(iIntValue));
            if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && iIntValue < c36246oUrCopydefault.DCUTEI().size()) {
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setBeSelected(true);
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setShowSolidBE(true);
                c36246oUrCopydefault.DCUTEI().get(iIntValue).setShowSolidLiq(false);
                C37932pGa.AEQbTJ.AEQbTJ(c36246oUrCopydefault.DCUTEI().get(iIntValue));
                return;
            }
        }
    }

    public void ejfBZ(android.view.MotionEvent motionEvent) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.iwGUEr().aKErDB() == null || c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean() == null || !c36246oUrCopydefault.iwGUEr().aKErDB().contains(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean().setTSelected(true);
        c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean().setTShowSolid(true);
    }

    public void EZpvd(KlineOpenOrderBean klineOpenOrderBean) {
        if (klineOpenOrderBean != null) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.OLrzqt();
            c37932pGa.EZpvd(klineOpenOrderBean);
        }
    }

    public void OLrzqt(KlineOpenOrderBean klineOpenOrderBean) {
        if (klineOpenOrderBean != null) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.OLrzqt();
            c37932pGa.OLrzqt(klineOpenOrderBean);
        }
    }

    public void copydefault(InterfaceC39510pth interfaceC39510pth) {
        if (interfaceC39510pth != null) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.AEQbTJ(interfaceC39510pth);
            interfaceC39510pth.setSelected(true);
            interfaceC39510pth.setShowSolid(true);
        }
    }

    public void OLrzqt(InterfaceC39510pth interfaceC39510pth) {
        if (interfaceC39510pth != null) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.AEQbTJ(interfaceC39510pth);
            interfaceC39510pth.setSelected(true);
            interfaceC39510pth.setShowSolid(false);
            interfaceC39510pth.setLiqSelected(true);
            interfaceC39510pth.setShowSolidLiq(true);
        }
    }

    public void KWHzl(InterfaceC39510pth interfaceC39510pth) {
        if (interfaceC39510pth != null) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.AEQbTJ(interfaceC39510pth);
            interfaceC39510pth.setSelected(true);
            interfaceC39510pth.setShowSolid(false);
            interfaceC39510pth.setBeSelected(true);
            interfaceC39510pth.setShowSolidBE(true);
        }
    }

    public void copydefault(KlineSpotAverageBean klineSpotAverageBean) {
        if (klineSpotAverageBean != null) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.OLrzqt();
            klineSpotAverageBean.setTSelected(true);
            klineSpotAverageBean.setTShowSolid(true);
        }
    }

    public void OLrzqt(C36312oXc c36312oXc, android.view.MotionEvent motionEvent) {
        c36312oXc.copydefault(motionEvent.getX());
        c36312oXc.OLrzqt(motionEvent.getY());
        c36312oXc.EZpvd(c36312oXc.gHZMYf);
    }

    public void copydefault(C36312oXc c36312oXc) {
        if (c36312oXc.gEmmrt() == null || c36312oXc.gEmmrt().OLrzqt()) {
            return;
        }
        c36312oXc.gEmmrt().EZpvd();
    }
}
