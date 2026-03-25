package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.C5473Tc;

/* JADX INFO: loaded from: classes2.dex */
public class SW extends android.widget.LinearLayout {
    public android.widget.ImageView AEQbTJ;
    public android.widget.TextView EZpvd;
    public android.content.Context KWHzl;
    public android.view.View OLrzqt;
    public android.widget.TextView copydefault;
    public android.widget.TextView djBIcL;

    public SW(android.content.Context context) {
        super(context);
        this.KWHzl = context;
        OLrzqt();
    }

    public SW(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = context;
        OLrzqt();
    }

    public SW(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = context;
        OLrzqt();
    }

    public final void OLrzqt() {
        setOrientation(1);
        android.view.LayoutInflater.from(this.KWHzl).inflate(C5473Tc.Application.KWHzl, (android.view.ViewGroup) this, true);
        this.AEQbTJ = (android.widget.ImageView) findViewById(C5473Tc.TaskDescription.AEQbTJ);
        this.EZpvd = (android.widget.TextView) findViewById(C5473Tc.TaskDescription.copydefault);
        this.djBIcL = (android.widget.TextView) findViewById(C5473Tc.TaskDescription.OLrzqt);
        this.copydefault = (android.widget.TextView) findViewById(C5473Tc.TaskDescription.EZpvd);
        android.view.View viewFindViewById = findViewById(C5473Tc.TaskDescription.KWHzl);
        this.OLrzqt = viewFindViewById;
        viewFindViewById.setBackgroundColor(0);
        this.AEQbTJ.setVisibility(8);
        this.EZpvd.setVisibility(8);
        this.djBIcL.setVisibility(8);
        setTextSize(C5474Td.OLrzqt);
    }

    public void setTextSize(float f) {
        float f2 = (int) f;
        C5474Td.OLrzqt = f2;
        this.EZpvd.setTextSize(f2);
        this.djBIcL.setTextSize(C5474Td.OLrzqt);
        this.copydefault.setTextSize(C5474Td.OLrzqt);
        int iApplyDimension = (int) android.util.TypedValue.applyDimension(1, C5474Td.OLrzqt, getResources().getDisplayMetrics());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.AEQbTJ.getLayoutParams();
        layoutParams.height = iApplyDimension;
        layoutParams.width = iApplyDimension;
        layoutParams.rightMargin = (int) android.util.TypedValue.applyDimension(1, C5474Td.OLrzqt / 4.0f, getResources().getDisplayMetrics());
        layoutParams.gravity = 16;
        this.AEQbTJ.setLayoutParams(layoutParams);
    }

    public void setCommand(java.lang.CharSequence charSequence) {
        this.copydefault.setText(charSequence);
    }

    public void KWHzl() {
        this.AEQbTJ.setVisibility(8);
    }

    public void copydefault(boolean z) {
        this.AEQbTJ.setVisibility(0);
        this.AEQbTJ.setImageResource(z ? C5473Tc.StateListAnimator.KWHzl : C5473Tc.StateListAnimator.copydefault);
    }

    public void AEQbTJ() {
        this.djBIcL.setVisibility(8);
    }

    public void OLrzqt(java.lang.CharSequence charSequence) {
        this.djBIcL.setVisibility(0);
        this.djBIcL.setText(charSequence);
        this.djBIcL.setBackgroundColor(0);
    }

    public void EZpvd(int i) {
        this.djBIcL.setBackgroundResource(i);
    }

    public void EZpvd(java.lang.CharSequence charSequence) {
        this.EZpvd.setVisibility(0);
        this.EZpvd.setText(charSequence);
    }

    public void setIconClickListener(View.OnClickListener onClickListener) {
        this.AEQbTJ.setOnClickListener(onClickListener);
    }

    public void EZpvd() {
        this.AEQbTJ.setTag(java.lang.Boolean.FALSE);
        this.AEQbTJ.callOnClick();
    }

    public void copydefault() {
        this.AEQbTJ.setTag(java.lang.Boolean.TRUE);
        this.AEQbTJ.callOnClick();
    }

    public void EZpvd(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null && (layoutParams = generateDefaultLayoutParams()) == null) {
            throw new java.lang.IllegalArgumentException("generateDefaultLayoutParams() cannot return null");
        }
        addViewInLayout(view, -1, layoutParams);
    }
}
