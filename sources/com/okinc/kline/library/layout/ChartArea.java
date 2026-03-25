package com.okinc.kline.library.layout;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.template.TemplateSetting;
import o.C36246oUr;
import o.C36252oUx;
import o.C43246rlf;
import o.C55298xhM;
import o.oUC;

/* JADX INFO: loaded from: classes8.dex */
public class ChartArea extends C36252oUx {
    public int AEQbTJ;
    public DockStyle AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public final float AuCTel;
    public int DbNXlk;
    public final int EZpvd;
    public boolean KWHzl;
    public final oUC OLrzqt;
    public boolean djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public final int isConnected;
    public boolean valueOf;
    public final int values;

    public enum DockStyle {
        None,
        Left,
        Top,
        Right,
        Bottom,
        Fill
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DockStyle AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return (this.DbNXlk + this.AEQbTJ) >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTel() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(DockStyle dockStyle) {
        this.AYXKKw = dockStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt(float f, float f2) {
        return f >= ((float) this.gEmmrt) && f < ((float) this.AkhnZx) && f2 >= ((float) this.DbNXlk) && f2 < ((float) this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i, int i2) {
        this.fetchVPNInfo = i;
        this.AhwBna = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i, int i2, int i3, int i4, boolean z) {
        if (this.gEmmrt != i) {
            this.gEmmrt = i;
            this.valueOf = true;
        }
        if (this.DbNXlk != i2) {
            this.DbNXlk = i2;
            this.valueOf = true;
        }
        if (this.AkhnZx != i3) {
            this.AkhnZx = i3;
            this.valueOf = true;
        }
        if (this.AEQbTJ != i4) {
            this.AEQbTJ = i4;
            this.valueOf = true;
        }
        if (z) {
            this.valueOf = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.AkhnZx - this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.djBIcL;
    }

    public final Rect fetchVPNInfo() {
        return new Rect(this.gEmmrt, this.DbNXlk, this.AkhnZx, this.AEQbTJ);
    }

    public final RectF fARcdN() {
        float f = this.gEmmrt;
        float f2 = this.DbNXlk;
        float f3 = this.AuCTel;
        return new RectF(f, (int) (f2 - f3), this.AkhnZx, (int) (f2 + f3));
    }

    public final int djBIcL() {
        return C36246oUr.copydefault().getNewProxyInstance() == 1 ? values() : this.AEQbTJ - this.DbNXlk;
    }

    public final int values() {
        int iIntValue = SPUtils.getInt(EZpvd(), 0, TemplateSetting.SP_FILENAME).intValue();
        return iIntValue == 0 ? this.AEQbTJ - this.DbNXlk : iIntValue;
    }

    public final void EZpvd(int i) {
        if (C36246oUr.copydefault().getFieldNames() == "sp_timeinterval_okx_pro") {
            SPUtils.put(EZpvd(), Integer.valueOf(i), TemplateSetting.SP_FILENAME);
        }
    }

    public final int gEmmrt() {
        int iIntValue;
        return (C36246oUr.copydefault().getNewProxyInstance() != 1 || (iIntValue = SPUtils.getInt(EZpvd(), 0, TemplateSetting.SP_FILENAME).intValue()) == 0) ? this.AhwBna : iIntValue;
    }

    public ChartArea(String str) {
        super(str);
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        this.AuCTel = C55298xhM.copydefault(24.0f, (Context) c43246rlf.valueOf());
        this.isConnected = C55298xhM.copydefault(90.0f, (Context) c43246rlf.valueOf());
        this.values = C55298xhM.copydefault(45.0f, (Context) c43246rlf.valueOf());
        this.EZpvd = C55298xhM.copydefault(10.0f, (Context) c43246rlf.valueOf());
        this.valueOf = true;
        this.djBIcL = false;
        this.KWHzl = false;
        this.OLrzqt = new oUC(this);
    }

    public void OLrzqt(int i, int i2) {
        if (this.OLrzqt.KWHzl()) {
            this.OLrzqt.copydefault(new int[]{i, i2});
        } else {
            copydefault(i, i2);
        }
    }

    public final void EZpvd(int i, int i2, int i3, int i4) {
        copydefault(i, i2, i3, i4, false);
    }

    public ChartArea EZpvd(int i, int i2) {
        if (OLrzqt(i, i2)) {
            return this;
        }
        return null;
    }

    public ChartArea AEQbTJ(int i, int i2) {
        if (OLrzqt(i, i2)) {
            return this;
        }
        return null;
    }

    public void KWHzl(Boolean bool) {
        this.djBIcL = bool.booleanValue();
    }
}
