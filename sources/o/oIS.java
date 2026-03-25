package o;

import android.graphics.Color;
import android.view.GestureDetector;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import o.C32113mPz;

/* JADX INFO: loaded from: classes18.dex */
public class oIS extends RecyclerView {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public oIQ AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public boolean KWHzl;
    public android.view.GestureDetector OLrzqt;
    public int copydefault;
    public float djBIcL;
    public float ejfBZ;
    public int fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public float gEmmrt;
    public int isConnected;
    public float valueOf;
    public float values;

    public oIS(android.content.Context context) {
        super(context);
        this.AuCTel = null;
        this.OLrzqt = null;
        this.KWHzl = false;
        this.fJNWhG = 10;
        this.values = 16.0f;
        this.valueOf = 64.0f;
        this.gEmmrt = 8.0f;
        this.fetchVPNInfo = 5;
        this.EZpvd = 8;
        this.djBIcL = 0.0f;
        this.AEQbTJ = 2;
        this.fIwbmz = ViewCompat.MEASURED_STATE_MASK;
        this.AYXKKw = 0;
        this.AhwBna = ViewCompat.MEASURED_STATE_MASK;
        this.copydefault = -1;
        this.AkhnZx = 50;
        this.isConnected = ViewCompat.MEASURED_STATE_MASK;
        this.DbNXlk = -1;
        this.ejfBZ = 0.4f;
    }

    public oIS(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AuCTel = null;
        this.OLrzqt = null;
        this.KWHzl = false;
        this.fJNWhG = 10;
        this.values = 16.0f;
        this.valueOf = 64.0f;
        this.gEmmrt = 8.0f;
        this.fetchVPNInfo = 5;
        this.EZpvd = 8;
        this.djBIcL = 0.0f;
        this.AEQbTJ = 2;
        this.fIwbmz = ViewCompat.MEASURED_STATE_MASK;
        this.AYXKKw = 0;
        this.AhwBna = ViewCompat.MEASURED_STATE_MASK;
        this.copydefault = -1;
        this.AkhnZx = 50;
        this.isConnected = ViewCompat.MEASURED_STATE_MASK;
        this.DbNXlk = -1;
        this.ejfBZ = 0.4f;
        AEQbTJ(context, attributeSet);
    }

    public oIS(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AuCTel = null;
        this.OLrzqt = null;
        this.KWHzl = false;
        this.fJNWhG = 10;
        this.values = 16.0f;
        this.valueOf = 64.0f;
        this.gEmmrt = 8.0f;
        this.fetchVPNInfo = 5;
        this.EZpvd = 8;
        this.djBIcL = 0.0f;
        this.AEQbTJ = 2;
        this.fIwbmz = ViewCompat.MEASURED_STATE_MASK;
        this.AYXKKw = 0;
        this.AhwBna = ViewCompat.MEASURED_STATE_MASK;
        this.copydefault = -1;
        this.AkhnZx = 50;
        this.isConnected = ViewCompat.MEASURED_STATE_MASK;
        this.DbNXlk = -1;
        this.ejfBZ = 0.4f;
        AEQbTJ(context, attributeSet);
    }

    private void AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        this.AuCTel = new oIQ(context, this);
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.fvQaOB, 0, 0)) == null) {
            return;
        }
        try {
            this.fJNWhG = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.accept, this.fJNWhG);
            this.values = typedArrayObtainStyledAttributes.getFloat(C32113mPz.PendingIntent.AxsJAYsNCnLh, this.values);
            this.gEmmrt = typedArrayObtainStyledAttributes.getFloat(C32113mPz.PendingIntent.DAIeex, this.gEmmrt);
            this.valueOf = typedArrayObtainStyledAttributes.getFloat(C32113mPz.PendingIntent.RlQdEF, this.valueOf);
            this.fetchVPNInfo = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.ODWQjV, this.fetchVPNInfo);
            this.EZpvd = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.gGvvIC, this.EZpvd);
            this.djBIcL = typedArrayObtainStyledAttributes.getFloat(C32113mPz.PendingIntent.QKudOq, this.djBIcL);
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.giSNqX)) {
                this.AYXKKw = Color.parseColor(typedArrayObtainStyledAttributes.getString(C32113mPz.PendingIntent.giSNqX));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.AxsJAYaxsJAY)) {
                this.AhwBna = Color.parseColor(typedArrayObtainStyledAttributes.getString(C32113mPz.PendingIntent.AxsJAYaxsJAY));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.gasjUx)) {
                this.copydefault = Color.parseColor(typedArrayObtainStyledAttributes.getString(C32113mPz.PendingIntent.gasjUx));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.flVtFt)) {
                this.AYXKKw = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.flVtFt, this.AYXKKw);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.iRxXKY)) {
                this.AhwBna = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.iRxXKY, this.AhwBna);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.hUfVAv)) {
                this.copydefault = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.gasjUx, this.copydefault);
            }
            this.AkhnZx = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.DarRvM, this.AkhnZx);
            this.ejfBZ = typedArrayObtainStyledAttributes.getFloat(C32113mPz.PendingIntent.OqFWZa, this.ejfBZ);
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.DXXBbs)) {
                this.isConnected = Color.parseColor(typedArrayObtainStyledAttributes.getString(C32113mPz.PendingIntent.DXXBbs));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.DCJXGO)) {
                this.DbNXlk = Color.parseColor(typedArrayObtainStyledAttributes.getString(C32113mPz.PendingIntent.DCJXGO));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.gkJEwt)) {
                this.AEQbTJ = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.gkJEwt, this.AEQbTJ);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.iZzfmt)) {
                this.fIwbmz = Color.parseColor(typedArrayObtainStyledAttributes.getString(C32113mPz.PendingIntent.iZzfmt));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        oIQ oiq = this.AuCTel;
        if (oiq != null) {
            oiq.AEQbTJ(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.KWHzl) {
            oIQ oiq = this.AuCTel;
            if (oiq != null && oiq.OLrzqt(motionEvent)) {
                return true;
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = new android.view.GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: o.oIS.5
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public boolean onFling(android.view.MotionEvent motionEvent2, android.view.MotionEvent motionEvent3, float f, float f2) {
                        return super.onFling(motionEvent2, motionEvent3, f, f2);
                    }
                });
            }
            this.OLrzqt.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        oIQ oiq;
        if (this.KWHzl && (oiq = this.AuCTel) != null && oiq.copydefault(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        oIQ oiq = this.AuCTel;
        if (oiq != null) {
            oiq.EZpvd(adapter);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oIQ oiq = this.AuCTel;
        if (oiq != null) {
            oiq.copydefault(i, i2, i3, i4);
        }
    }

    public void setIndexTextSize(int i) {
        this.AuCTel.valueOf(i);
    }

    public void setIndexbarWidth(float f) {
        this.AuCTel.gEmmrt(f);
    }

    public void setIndexbarVertMargin(float f) {
        this.AuCTel.AEQbTJ(f);
    }

    public void setIndexbarHorizMargin(float f) {
        this.AuCTel.EZpvd(f);
    }

    public void setPreviewPadding(int i) {
        this.AuCTel.AhwBna(i);
    }

    public void setIndexBarCornerRadius(int i) {
        this.AuCTel.copydefault(i);
    }

    public void setIndexBarTransparentValue(float f) {
        this.AuCTel.copydefault(f);
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        this.AuCTel.EZpvd(typeface);
    }

    public void setIndexBarVisibility(boolean z) {
        this.AuCTel.EZpvd(z);
        this.KWHzl = z;
        invalidate();
    }

    public void setIndexBarStrokeVisibility(boolean z) {
        this.AuCTel.OLrzqt(z);
    }

    public void setIndexBarStrokeColor(java.lang.String str) {
        this.AuCTel.AEQbTJ(Color.parseColor(str));
    }

    public void setIndexBarStrokeWidth(int i) {
        this.AuCTel.OLrzqt(i);
    }

    public void setPreviewVisibility(boolean z) {
        this.AuCTel.AEQbTJ(z);
    }

    public void setPreviewTextSize(int i) {
        this.AuCTel.isConnected(i);
    }

    public void setPreviewColor(@androidx.annotation.ColorRes int i) {
        this.AuCTel.gEmmrt(getContext().getResources().getColor(i));
    }

    public void setPreviewColor(java.lang.String str) {
        this.AuCTel.gEmmrt(Color.parseColor(str));
    }

    public void setPreviewTextColor(@androidx.annotation.ColorRes int i) {
        this.AuCTel.djBIcL(getContext().getResources().getColor(i));
    }

    public void setPreviewTransparentValue(float f) {
        this.AuCTel.valueOf(f);
    }

    public void setPreviewTextColor(java.lang.String str) {
        this.AuCTel.djBIcL(Color.parseColor(str));
    }

    public void setIndexBarColor(java.lang.String str) {
        this.AuCTel.EZpvd(Color.parseColor(str));
    }

    public void setIndexBarColor(@androidx.annotation.ColorRes int i) {
        this.AuCTel.EZpvd(getContext().getResources().getColor(i));
    }

    public void setIndexBarTextColor(java.lang.String str) {
        this.AuCTel.KWHzl(Color.parseColor(str));
    }

    public void setIndexBarTextColor(@androidx.annotation.ColorRes int i) {
        this.AuCTel.KWHzl(getContext().getResources().getColor(i));
    }

    public void setIndexbarHighLightTextColor(java.lang.String str) {
        this.AuCTel.AYXKKw(Color.parseColor(str));
    }

    public void setIndexbarHighLightTextColor(@androidx.annotation.ColorRes int i) {
        this.AuCTel.AYXKKw(getContext().getResources().getColor(i));
    }

    public void setIndexBarHighLightTextVisibility(boolean z) {
        this.AuCTel.copydefault(z);
    }
}
