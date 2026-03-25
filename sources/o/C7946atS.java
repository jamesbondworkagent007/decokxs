package o;

import android.widget.FrameLayout;
import o.C7343ahz;

/* JADX INFO: renamed from: o.atS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7946atS extends android.widget.FrameLayout implements InterfaceC8006aua {
    public android.widget.TextView AEQbTJ;
    public C7950atW copydefault;

    @Override // o.InterfaceC8006aua
    public android.view.View OLrzqt() {
        return this;
    }

    public C7946atS(android.content.Context context) {
        this(context, null);
    }

    public C7946atS(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7946atS(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        copydefault();
    }

    private void copydefault() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C7343ahz.Activity.uzCIH, this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewInflate.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, C7865arr.copydefault(100.0f));
        }
        layoutParams.gravity = 17;
        viewInflate.setLayoutParams(layoutParams);
        this.copydefault = (C7950atW) findViewById(C7343ahz.TaskDescription.AxsJAY);
        this.AEQbTJ = (android.widget.TextView) findViewById(C7343ahz.TaskDescription.gHZMYf);
    }

    @Override // o.InterfaceC7948atU
    public void gEmmrt() {
        this.copydefault.gEmmrt();
    }

    @Override // o.InterfaceC7948atU
    public void AhwBna() {
        this.copydefault.AhwBna();
    }

    @Override // o.InterfaceC7948atU
    public void EZpvd() {
        this.copydefault.EZpvd();
    }

    @Override // o.InterfaceC7948atU
    public void KWHzl() {
        this.copydefault.KWHzl();
    }

    @Override // o.InterfaceC8006aua
    public void setLoadText(java.lang.CharSequence charSequence) {
        this.AEQbTJ.setText(charSequence);
    }
}
