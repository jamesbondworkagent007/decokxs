package o;

import o.C7343ahz;
import o.C7978aty;

/* JADX INFO: renamed from: o.atQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7944atQ extends C7978aty.FragmentManager {
    public android.widget.TextView AYXKKw;
    public android.widget.TextView AhwBna;
    public android.view.View OLrzqt;
    public java.lang.CharSequence copydefault;
    public C7938atK djBIcL;
    public java.lang.CharSequence gEmmrt;
    public final float AEQbTJ = 0.3f;
    public boolean EZpvd = false;
    public float valueOf = 0.6f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(float f) {
        this.valueOf = f - 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float OLrzqt() {
        return this.valueOf + 1.0f;
    }

    public C7944atQ(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.gEmmrt = charSequence;
    }

    public void OLrzqt(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.copydefault = charSequence;
        if (this.AhwBna != null) {
            if (charSequence != null && charSequence.length() != 0) {
                this.AhwBna.setText(charSequence);
                this.AhwBna.setVisibility(0);
            } else {
                this.AhwBna.setText("");
                this.AhwBna.setVisibility(8);
            }
        }
    }

    public void AEQbTJ(boolean z) {
        this.EZpvd = z;
        android.view.View view = this.OLrzqt;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void EZpvd(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.gEmmrt = charSequence;
        android.widget.TextView textView = this.AYXKKw;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // o.C7978aty.FragmentManager
    public void AEQbTJ(@androidx.annotation.NonNull C7978aty c7978aty, @androidx.annotation.NonNull android.view.View view, float f) {
        C7938atK c7938atK;
        android.widget.TextView textView = this.AYXKKw;
        if (textView != null) {
            textView.setTypeface(null, f > 0.3f ? 1 : 0);
        }
        if (!c7978aty.AhwBna() || (c7938atK = this.djBIcL) == null) {
            return;
        }
        float f2 = (this.valueOf * f) + 1.0f;
        c7938atK.setChildScale(f2, f2);
    }

    @Override // o.C7978aty.FragmentManager
    public android.view.View OLrzqt(@androidx.annotation.NonNull C7978aty c7978aty) {
        android.view.View viewInflate = android.view.LayoutInflater.from(c7978aty.getContext()).inflate(C7343ahz.Activity.AuCTel, (android.view.ViewGroup) c7978aty, false);
        this.djBIcL = (C7938atK) viewInflate.findViewById(C7343ahz.TaskDescription.UeEOUB);
        this.AYXKKw = (android.widget.TextView) viewInflate.findViewById(C7343ahz.TaskDescription.aKErDB);
        this.AhwBna = (android.widget.TextView) viewInflate.findViewById(C7343ahz.TaskDescription.QVAiDq);
        this.OLrzqt = viewInflate.findViewById(C7343ahz.TaskDescription.QfsBiF);
        AEQbTJ(this.AYXKKw, c7978aty);
        this.AYXKKw.setTypeface(null, 0);
        EZpvd(this.gEmmrt);
        OLrzqt(this.copydefault);
        AEQbTJ(this.EZpvd);
        viewInflate.setClickable(true);
        return viewInflate;
    }

    public void copydefault() {
        C7938atK c7938atK = this.djBIcL;
        if (c7938atK != null) {
            float f = this.valueOf + 1.0f;
            c7938atK.setChildScale(f, f);
        }
    }

    public float KWHzl() {
        android.widget.TextView textView = this.AYXKKw;
        if (textView == null) {
            return 0.0f;
        }
        return textView.getTextSize();
    }

    public void copydefault(float f) {
        android.widget.TextView textView = this.AYXKKw;
        if (textView == null) {
            return;
        }
        textView.setTextSize(f);
    }

    public void KWHzl(int i) {
        android.widget.TextView textView = this.AYXKKw;
        if (textView == null || i == textView.getTextColors().getDefaultColor()) {
            return;
        }
        this.AYXKKw.setTextColor(i);
    }
}
