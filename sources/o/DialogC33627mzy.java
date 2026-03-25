package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@java.lang.Deprecated
public class DialogC33627mzy extends AppCompatDialog {
    public long AEQbTJ;
    public android.content.Context AYXKKw;
    public int AhwBna;
    public android.widget.LinearLayout AkhnZx;
    public android.widget.LinearLayout AuCTel;
    public int AuCTelauCTel;
    public android.widget.TextView AubY;
    public C55022xcB AxsJAY;
    public android.widget.FrameLayout DbNXlk;
    public int EZpvd;
    public java.util.List<kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence>> KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public android.view.View djBIcL;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public int fIwbmz;
    public View.OnClickListener fJNWhG;
    public android.widget.LinearLayout fetchVPNInfo;
    public C55055xci gEmmrt;
    public java.lang.String getFieldNames;
    public android.widget.TextView getNewProxyInstance;
    public int hDKMBd;
    public android.widget.FrameLayout isConnected;
    public View.OnClickListener iwGUEr;
    public java.lang.String uzCIH;
    public android.view.View valueOf;
    public android.widget.LinearLayout values;
    public android.widget.TextView wlaJM;
    public boolean zLjUOn;
    public android.widget.TextView zsXlph;
    public android.view.View zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(android.view.View view) {
        this.valueOf = view;
    }

    public DialogC33627mzy(android.content.Context context, int i) {
        super(context, C32113mPz.Dialog.RJOkX);
        this.AuCTelauCTel = -1;
        this.fIwbmz = -1;
        this.hDKMBd = -1;
        this.KWHzl = new java.util.ArrayList();
        this.EZpvd = -1;
        this.AhwBna = -1;
        this.AEQbTJ = 500L;
        this.copydefault = i;
        this.AYXKKw = context;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView;
        super.onCreate(bundle);
        setCanceledOnTouchOutside(this.OLrzqt);
        setContentView(C32113mPz.Fragment.getNewProxyInstance);
        this.djBIcL = getWindow().getDecorView().findViewById(android.R.id.content);
        this.getNewProxyInstance = (android.widget.TextView) findViewById(C32113mPz.FragmentManager.QkdxfA);
        this.AxsJAY = (C55022xcB) findViewById(C32113mPz.FragmentManager.finit);
        C55055xci c55055xci = (C55055xci) findViewById(C32113mPz.FragmentManager.DbNXlk);
        this.gEmmrt = c55055xci;
        if (c55055xci != null && this.EZpvd >= 0) {
            c55055xci.setPaddingRelative(c55055xci.getPaddingLeft(), this.gEmmrt.getPaddingTop(), this.gEmmrt.getPaddingRight(), this.EZpvd);
        }
        this.AubY = (android.widget.TextView) findViewById(C32113mPz.FragmentManager.QHmsKR);
        C33087mpo c33087mpo = C33087mpo.KWHzl;
        if (c33087mpo.OLrzqt() != 0) {
            this.AubY.setText(this.AYXKKw.getString(c33087mpo.OLrzqt()));
        }
        this.fetchVPNInfo = (android.widget.LinearLayout) findViewById(C32113mPz.FragmentManager.zuBGHE);
        this.AkhnZx = (android.widget.LinearLayout) findViewById(C32113mPz.FragmentManager.ORxRYg);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(C32113mPz.FragmentManager.getPostValueLengthLimit);
        this.wlaJM = textView2;
        int i = this.fIwbmz;
        if (i != -1 && textView2 != null) {
            textView2.setTextColor(i);
        }
        int i2 = this.hDKMBd;
        if (i2 != -1 && (textView = this.zsXlph) != null) {
            textView.setTextColor(i2);
        }
        this.zuBGHE = findViewById(C32113mPz.FragmentManager.ODXsMY);
        this.zsXlph = (android.widget.TextView) findViewById(C32113mPz.FragmentManager.DCUTEI);
        this.values = (android.widget.LinearLayout) findViewById(C32113mPz.FragmentManager.AxsJAY);
        this.AuCTel = (android.widget.LinearLayout) findViewById(C32113mPz.FragmentManager.QKVWgx);
        this.isConnected = (android.widget.FrameLayout) findViewById(C32113mPz.FragmentManager.fARcdN);
        this.DbNXlk = (android.widget.FrameLayout) findViewById(C32113mPz.FragmentManager.DarRvM);
        OLrzqt(this.copydefault);
    }

    public final void OLrzqt(int i) {
        if (i == 0) {
            this.values.setVisibility(0);
            this.AuCTel.setVisibility(8);
            OLrzqt();
        } else {
            if (i == 5) {
                AEQbTJ();
                return;
            }
            if (i != 6) {
                return;
            }
            this.values.setVisibility(8);
            this.AuCTel.setVisibility(8);
            if (this.valueOf != null) {
                this.DbNXlk.removeAllViews();
                this.DbNXlk.addView(this.valueOf);
            }
        }
    }

    public final void KWHzl() {
        if (this.zLjUOn) {
            return;
        }
        this.zLjUOn = true;
        this.values.removeView(this.fetchVPNInfo);
        this.AkhnZx.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.AYXKKw.getResources().getDimensionPixelOffset(C32113mPz.StateListAnimator.EZpvd));
        android.widget.TextView textView = new android.widget.TextView(this.AYXKKw);
        this.zsXlph = textView;
        KWHzl(layoutParams, textView, C52761wXj.Activity.HJWChPURsaBn);
        this.fetchVPNInfo.addView(this.zsXlph);
        this.zuBGHE = new android.view.View(this.AYXKKw);
        this.zuBGHE.setLayoutParams(new LinearLayout.LayoutParams(-1, this.AYXKKw.getResources().getDimensionPixelOffset(C32113mPz.StateListAnimator.KWHzl)));
        this.zuBGHE.setBackgroundColor(ContextCompat.getColor(this.AYXKKw, C32113mPz.ActionBar.DbNXlk));
        this.fetchVPNInfo.addView(this.zuBGHE);
        android.widget.TextView textView2 = new android.widget.TextView(this.AYXKKw);
        this.wlaJM = textView2;
        KWHzl(layoutParams, textView2, C32113mPz.ActionBar.zuBGHE);
        this.fetchVPNInfo.addView(this.wlaJM);
        this.values.addView(this.fetchVPNInfo);
    }

    public final void KWHzl(LinearLayout.LayoutParams layoutParams, android.widget.TextView textView, int i) {
        textView.setTextSize(16.0f);
        textView.setTextColor(ContextCompat.getColor(this.AYXKKw, i));
        textView.setGravity(17);
        textView.setLayoutParams(layoutParams);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPaddingRelative((int) getContext().getResources().getDimension(C32113mPz.StateListAnimator.OLrzqt), (int) getContext().getResources().getDimension(C32113mPz.StateListAnimator.copydefault), (int) getContext().getResources().getDimension(C32113mPz.StateListAnimator.OLrzqt), (int) getContext().getResources().getDimension(C32113mPz.StateListAnimator.copydefault));
    }

    public final void OLrzqt() {
        if (android.text.TextUtils.isEmpty(this.getFieldNames) && android.text.TextUtils.isEmpty(this.ejfBZ)) {
            this.AxsJAY.setVisibility(8);
        } else {
            this.AxsJAY.setTitleAndMessage(this.getFieldNames, this.ejfBZ);
        }
        C55055xci c55055xci = this.gEmmrt;
        c55055xci.removeViews(1, c55055xci.getChildCount() - 1);
        for (kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence> pair : this.KWHzl) {
            C55022xcB c55022xcB = new C55022xcB(getContext());
            c55022xcB.setTitleAndMessage(pair.getFirst(), pair.getSecond());
            this.gEmmrt.addView(c55022xcB, new ViewGroup.LayoutParams(-1, -2));
        }
        if (!android.text.TextUtils.isEmpty(this.fARcdN)) {
            this.wlaJM.setVisibility(0);
            this.wlaJM.setText(this.fARcdN);
            View.OnClickListener onClickListener = this.fJNWhG;
            if (onClickListener != null) {
                this.wlaJM.setOnClickListener(onClickListener);
            } else {
                this.wlaJM.setOnClickListener(new View.OnClickListener() { // from class: o.mzy.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        try {
                            DialogC33627mzy.this.dismiss();
                        } catch (java.lang.Exception e) {
                            android.util.Log.getStackTraceString(e);
                        }
                    }
                });
            }
            copydefault(this.wlaJM, 16.0f);
        } else {
            this.wlaJM.setVisibility(8);
        }
        if (!android.text.TextUtils.isEmpty(this.uzCIH)) {
            this.zsXlph.setVisibility(0);
            this.zsXlph.setText(this.uzCIH);
            View.OnClickListener onClickListener2 = this.iwGUEr;
            if (onClickListener2 != null) {
                this.zsXlph.setOnClickListener(onClickListener2);
            } else {
                this.zsXlph.setOnClickListener(new View.OnClickListener() { // from class: o.mzy.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        try {
                            DialogC33627mzy.this.dismiss();
                        } catch (java.lang.Exception e) {
                            android.util.Log.getStackTraceString(e);
                        }
                    }
                });
            }
            copydefault(this.zsXlph, 16.0f);
        } else {
            this.zsXlph.setVisibility(8);
        }
        if (!android.text.TextUtils.isEmpty(this.uzCIH) && !android.text.TextUtils.isEmpty(this.fARcdN)) {
            this.zuBGHE.setVisibility(0);
        } else {
            this.zuBGHE.setVisibility(8);
        }
        if (android.text.TextUtils.isEmpty(this.uzCIH) && android.text.TextUtils.isEmpty(this.fARcdN)) {
            this.fetchVPNInfo.setVisibility(8);
        }
        if (this.valueOf != null) {
            this.isConnected.setVisibility(0);
            this.isConnected.removeAllViews();
            this.isConnected.addView(this.valueOf);
        } else {
            this.isConnected.setVisibility(8);
        }
        if (this.AhwBna <= 0 || this.values.getLayoutParams() == null) {
            return;
        }
        this.values.getLayoutParams().width = this.AhwBna;
    }

    public final void copydefault(final android.widget.TextView textView, float f) {
        final float[] fArr = {f};
        textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.mzy.4
            /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onPreDraw() {
                int lineCount = textView.getLineCount();
                if (lineCount > 1 && !DialogC33627mzy.this.zLjUOn) {
                    DialogC33627mzy.this.KWHzl();
                    DialogC33627mzy.this.OLrzqt();
                }
                if (lineCount > 1) {
                    float[] fArr2 = fArr;
                    float f2 = fArr2[0];
                    if (f2 > 12.0f) {
                        android.widget.TextView textView2 = textView;
                        float f3 = f2 - 2.0f;
                        fArr2[0] = f3;
                        textView2.setTextSize(f3);
                    } else {
                        textView.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                }
                return false;
            }
        });
    }

    public final void AEQbTJ() {
        ((C55113xdn) findViewById(C32113mPz.FragmentManager.DLWbHP)).KWHzl(this.AEQbTJ);
        this.AuCTel.setVisibility(0);
        this.values.setVisibility(8);
        this.AubY.setVisibility(8);
        this.getNewProxyInstance.setVisibility(4);
        this.DbNXlk.setBackgroundColor(0);
        getWindow().clearFlags(2);
    }
}
