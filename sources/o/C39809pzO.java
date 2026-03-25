package o;

import android.graphics.Paint;
import com.okinc.kline.ui.view.model.MarketDealItem;
import java.util.Date;
import o.C35964oKf;
import o.C35966oKh;

/* JADX INFO: renamed from: o.pzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C39809pzO extends android.view.View {
    public int AEQbTJ;
    public int AYXKKw;
    public android.graphics.Paint AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public float DbNXlk;
    public MarketDealItem EZpvd;
    public java.lang.String KWHzl;
    public float OLrzqt;
    public float copydefault;
    public int djBIcL;
    public float ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public java.lang.String fJNWhG;
    public android.graphics.Paint fetchVPNInfo;
    public int gEmmrt;
    public android.graphics.Paint isConnected;
    public android.graphics.Paint uzCIH;
    public int valueOf;
    public java.lang.String values;

    public C39809pzO(android.content.Context context) {
        super(context);
        this.fJNWhG = "";
        this.uzCIH = null;
        this.fetchVPNInfo = null;
        this.AhwBna = null;
        this.isConnected = null;
        this.djBIcL = C33518mxv.EZpvd(getContext(), 8.0f);
        this.fIwbmz = C33518mxv.AEQbTJ(getContext(), 12.0f);
        this.valueOf = C33518mxv.EZpvd(getContext(), 16.0f);
        this.gEmmrt = C33518mxv.EZpvd(getContext(), 20.0f);
        this.KWHzl = getContext().getResources().getString(C35966oKh.TaskDescription.AhwBna);
        this.values = getContext().getResources().getString(C35964oKf.Fragment.fvQaOB);
        this.AEQbTJ = C33508mxl.copydefault(getContext());
        this.AkhnZx = C33508mxl.AEQbTJ(getContext());
        this.copydefault = 0.0f;
    }

    public C39809pzO(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fJNWhG = "";
        this.uzCIH = null;
        this.fetchVPNInfo = null;
        this.AhwBna = null;
        this.isConnected = null;
        this.djBIcL = C33518mxv.EZpvd(getContext(), 8.0f);
        this.fIwbmz = C33518mxv.AEQbTJ(getContext(), 12.0f);
        this.valueOf = C33518mxv.EZpvd(getContext(), 16.0f);
        this.gEmmrt = C33518mxv.EZpvd(getContext(), 20.0f);
        this.KWHzl = getContext().getResources().getString(C35966oKh.TaskDescription.AhwBna);
        this.values = getContext().getResources().getString(C35964oKf.Fragment.fvQaOB);
        this.AEQbTJ = C33508mxl.copydefault(getContext());
        this.AkhnZx = C33508mxl.AEQbTJ(getContext());
        this.copydefault = 0.0f;
        AEQbTJ();
    }

    public C39809pzO(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fJNWhG = "";
        this.uzCIH = null;
        this.fetchVPNInfo = null;
        this.AhwBna = null;
        this.isConnected = null;
        this.djBIcL = C33518mxv.EZpvd(getContext(), 8.0f);
        this.fIwbmz = C33518mxv.AEQbTJ(getContext(), 12.0f);
        this.valueOf = C33518mxv.EZpvd(getContext(), 16.0f);
        this.gEmmrt = C33518mxv.EZpvd(getContext(), 20.0f);
        this.KWHzl = getContext().getResources().getString(C35966oKh.TaskDescription.AhwBna);
        this.values = getContext().getResources().getString(C35964oKf.Fragment.fvQaOB);
        this.AEQbTJ = C33508mxl.copydefault(getContext());
        this.AkhnZx = C33508mxl.AEQbTJ(getContext());
        this.copydefault = 0.0f;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return getBackground() != null;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.ejfBZ = (getWidth() >> 2) + this.djBIcL;
        this.DbNXlk = getWidth() - (getWidth() >> 1);
        this.OLrzqt = getWidth() - this.valueOf;
        this.copydefault = getWidth();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        java.lang.String str2;
        super.onDraw(canvas);
        if (C55296xhK.AEQbTJ(this)) {
            android.graphics.Paint paint = this.uzCIH;
            Paint.Align align = Paint.Align.RIGHT;
            paint.setTextAlign(align);
            this.fetchVPNInfo.setTextAlign(align);
            this.AhwBna.setTextAlign(Paint.Align.LEFT);
            this.isConnected.setTextAlign(align);
            this.uzCIH.setColor(this.AuCTel);
            canvas.drawText(pTA.copydefault(new Date(this.EZpvd.getCreatedDate())) + "", this.copydefault - this.valueOf, this.gEmmrt, this.uzCIH);
            java.lang.String side = this.EZpvd.getSide();
            side.hashCode();
            if (!side.equals("buy")) {
                if (side.equals("sell")) {
                    this.fARcdN = this.AkhnZx;
                    str2 = this.values;
                }
                this.fetchVPNInfo.setColor(this.fARcdN);
                canvas.drawText(this.fJNWhG, this.copydefault - this.ejfBZ, this.gEmmrt, this.fetchVPNInfo);
                this.AhwBna.setColor(this.AYXKKw);
                this.isConnected.setColor(this.AYXKKw);
                canvas.drawText(this.EZpvd.getPrice(), this.DbNXlk, this.gEmmrt, this.isConnected);
                canvas.drawText(this.EZpvd.getAmount(), this.copydefault - this.OLrzqt, this.gEmmrt, this.AhwBna);
                return;
            }
            this.fARcdN = this.AEQbTJ;
            str2 = this.KWHzl;
            this.fJNWhG = str2;
            this.fetchVPNInfo.setColor(this.fARcdN);
            canvas.drawText(this.fJNWhG, this.copydefault - this.ejfBZ, this.gEmmrt, this.fetchVPNInfo);
            this.AhwBna.setColor(this.AYXKKw);
            this.isConnected.setColor(this.AYXKKw);
            canvas.drawText(this.EZpvd.getPrice(), this.DbNXlk, this.gEmmrt, this.isConnected);
            canvas.drawText(this.EZpvd.getAmount(), this.copydefault - this.OLrzqt, this.gEmmrt, this.AhwBna);
            return;
        }
        android.graphics.Paint paint2 = this.uzCIH;
        Paint.Align align2 = Paint.Align.LEFT;
        paint2.setTextAlign(align2);
        this.fetchVPNInfo.setTextAlign(align2);
        this.AhwBna.setTextAlign(Paint.Align.RIGHT);
        this.isConnected.setTextAlign(align2);
        this.uzCIH.setColor(this.AuCTel);
        canvas.drawText(pTA.copydefault(new Date(this.EZpvd.getCreatedDate())) + "", this.valueOf, this.gEmmrt, this.uzCIH);
        java.lang.String side2 = this.EZpvd.getSide();
        side2.hashCode();
        if (!side2.equals("buy")) {
            if (side2.equals("sell")) {
                this.fARcdN = this.AkhnZx;
                str = this.values;
            }
            this.fetchVPNInfo.setColor(this.fARcdN);
            this.isConnected.setColor(this.AYXKKw);
            canvas.drawText(this.fJNWhG, this.ejfBZ, this.gEmmrt, this.fetchVPNInfo);
            this.AhwBna.setColor(this.AYXKKw);
            this.isConnected.setColor(this.AYXKKw);
            canvas.drawText(this.EZpvd.getPrice(), this.DbNXlk, this.gEmmrt, this.isConnected);
            canvas.drawText(this.EZpvd.getAmount(), this.OLrzqt, this.gEmmrt, this.AhwBna);
        }
        this.fARcdN = this.AEQbTJ;
        str = this.KWHzl;
        this.fJNWhG = str;
        this.fetchVPNInfo.setColor(this.fARcdN);
        this.isConnected.setColor(this.AYXKKw);
        canvas.drawText(this.fJNWhG, this.ejfBZ, this.gEmmrt, this.fetchVPNInfo);
        this.AhwBna.setColor(this.AYXKKw);
        this.isConnected.setColor(this.AYXKKw);
        canvas.drawText(this.EZpvd.getPrice(), this.DbNXlk, this.gEmmrt, this.isConnected);
        canvas.drawText(this.EZpvd.getAmount(), this.OLrzqt, this.gEmmrt, this.AhwBna);
    }

    public void AEQbTJ() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.uzCIH = paint;
        paint.setAntiAlias(true);
        this.uzCIH.setTextSize(this.fIwbmz);
        android.graphics.Paint paint2 = this.uzCIH;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint2.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        this.AhwBna = new android.graphics.Paint();
        this.isConnected = new android.graphics.Paint();
        this.AhwBna.setAntiAlias(true);
        this.isConnected.setAntiAlias(true);
        this.AhwBna.setTextSize(this.fIwbmz);
        this.AhwBna.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        this.isConnected.setTextSize(this.fIwbmz);
        this.isConnected.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.fetchVPNInfo = paint3;
        paint3.setAntiAlias(true);
        this.fetchVPNInfo.setTextSize(this.fIwbmz);
    }

    public void setData(MarketDealItem marketDealItem) {
        this.EZpvd = marketDealItem;
        postInvalidate();
    }
}
