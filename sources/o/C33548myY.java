package o;

import androidx.appcompat.widget.AppCompatTextView;
import o.C32113mPz;

/* JADX INFO: renamed from: o.myY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C33548myY extends AppCompatTextView {
    public Application AEQbTJ;
    public int AhwBna;
    public int EZpvd;
    public java.lang.String KWHzl;
    public android.os.Handler OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Runnable gEmmrt;

    /* JADX INFO: renamed from: o.myY$Application */
    public interface Application {
        void EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.EZpvd > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTimeSum(int i) {
        this.AhwBna = i;
    }

    public C33548myY(android.content.Context context) {
        super(context);
        this.AhwBna = 60;
        this.copydefault = getResources().getString(C32113mPz.LoaderManager.OLrzqt);
        this.KWHzl = getResources().getString(C32113mPz.LoaderManager.EZpvd);
        this.OLrzqt = new android.os.Handler();
        this.gEmmrt = new java.lang.Runnable() { // from class: o.myY.5
            @Override // java.lang.Runnable
            public void run() {
                C33548myY c33548myY = C33548myY.this;
                if (c33548myY.EZpvd > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    C33548myY c33548myY2 = C33548myY.this;
                    int i = c33548myY2.EZpvd;
                    c33548myY2.EZpvd = i - 1;
                    sb.append(i);
                    sb.append(com.ibm.icu.text.DateFormat.SECOND);
                    c33548myY.setText(sb.toString());
                    C33548myY c33548myY3 = C33548myY.this;
                    c33548myY3.OLrzqt.postDelayed(c33548myY3.gEmmrt, 1000L);
                    return;
                }
                c33548myY.setText(c33548myY.KWHzl);
                C33548myY.this.setEnabled(true);
                if (C33548myY.this.AEQbTJ != null) {
                    C33548myY.this.AEQbTJ.EZpvd();
                }
            }
        };
        setText(this.copydefault);
    }

    public C33548myY(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AhwBna = 60;
        this.copydefault = getResources().getString(C32113mPz.LoaderManager.OLrzqt);
        this.KWHzl = getResources().getString(C32113mPz.LoaderManager.EZpvd);
        this.OLrzqt = new android.os.Handler();
        this.gEmmrt = new java.lang.Runnable() { // from class: o.myY.5
            @Override // java.lang.Runnable
            public void run() {
                C33548myY c33548myY = C33548myY.this;
                if (c33548myY.EZpvd > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    C33548myY c33548myY2 = C33548myY.this;
                    int i = c33548myY2.EZpvd;
                    c33548myY2.EZpvd = i - 1;
                    sb.append(i);
                    sb.append(com.ibm.icu.text.DateFormat.SECOND);
                    c33548myY.setText(sb.toString());
                    C33548myY c33548myY3 = C33548myY.this;
                    c33548myY3.OLrzqt.postDelayed(c33548myY3.gEmmrt, 1000L);
                    return;
                }
                c33548myY.setText(c33548myY.KWHzl);
                C33548myY.this.setEnabled(true);
                if (C33548myY.this.AEQbTJ != null) {
                    C33548myY.this.AEQbTJ.EZpvd();
                }
            }
        };
        setText(this.copydefault);
    }

    public C33548myY(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AhwBna = 60;
        this.copydefault = getResources().getString(C32113mPz.LoaderManager.OLrzqt);
        this.KWHzl = getResources().getString(C32113mPz.LoaderManager.EZpvd);
        this.OLrzqt = new android.os.Handler();
        this.gEmmrt = new java.lang.Runnable() { // from class: o.myY.5
            @Override // java.lang.Runnable
            public void run() {
                C33548myY c33548myY = C33548myY.this;
                if (c33548myY.EZpvd > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    C33548myY c33548myY2 = C33548myY.this;
                    int i2 = c33548myY2.EZpvd;
                    c33548myY2.EZpvd = i2 - 1;
                    sb.append(i2);
                    sb.append(com.ibm.icu.text.DateFormat.SECOND);
                    c33548myY.setText(sb.toString());
                    C33548myY c33548myY3 = C33548myY.this;
                    c33548myY3.OLrzqt.postDelayed(c33548myY3.gEmmrt, 1000L);
                    return;
                }
                c33548myY.setText(c33548myY.KWHzl);
                C33548myY.this.setEnabled(true);
                if (C33548myY.this.AEQbTJ != null) {
                    C33548myY.this.AEQbTJ.EZpvd();
                }
            }
        };
        setText(this.copydefault);
    }

    public void setSendStr(java.lang.String str) {
        this.copydefault = str;
        EZpvd();
    }

    public void setResendStr(java.lang.String str) {
        this.KWHzl = str;
        EZpvd();
    }

    public void copydefault() {
        setEnabled(false);
        this.EZpvd = this.AhwBna;
        this.OLrzqt.post(this.gEmmrt);
    }

    public void KWHzl(Application application) {
        this.AEQbTJ = application;
        copydefault();
    }

    @Override // android.view.View
    public void postInvalidate() {
        super.postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AEQbTJ();
    }

    private void AEQbTJ() {
        android.os.Handler handler = this.OLrzqt;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void EZpvd() {
        AEQbTJ();
        this.EZpvd = 0;
        setText(this.copydefault);
        setEnabled(true);
    }
}
