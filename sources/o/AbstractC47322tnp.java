package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: o.tnp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47322tnp extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AbstractC47480tqo AhwBna;

    @Bindable
    public java.lang.Boolean AkhnZx;
    public final AbstractC47480tqo DbNXlk;
    public final AbstractC47476tqk EZpvd;
    public final AbstractC47476tqk KWHzl;
    public final C33537myN OLrzqt;
    public final AbstractC47480tqo copydefault;

    @Bindable
    public LiveData<java.lang.String> djBIcL;
    public final AbstractC47480tqo ejfBZ;

    @Bindable
    public java.lang.CharSequence fetchVPNInfo;

    @Bindable
    public java.lang.String gEmmrt;

    @Bindable
    public LiveData<java.lang.Boolean> isConnected;

    @Bindable
    public java.lang.CharSequence valueOf;

    @Bindable
    public java.lang.CharSequence values;

    public abstract void AEQbTJ(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData);

    public abstract void AEQbTJ(@androidx.annotation.Nullable java.lang.String str);

    public abstract void EZpvd(@androidx.annotation.Nullable LiveData<java.lang.String> liveData);

    public abstract void EZpvd(@androidx.annotation.Nullable java.lang.CharSequence charSequence);

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool);

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.CharSequence charSequence);

    public abstract void OLrzqt(@androidx.annotation.Nullable java.lang.CharSequence charSequence);

    public AbstractC47322tnp(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, android.widget.TextView textView, AbstractC47480tqo abstractC47480tqo, AbstractC47476tqk abstractC47476tqk, AbstractC47476tqk abstractC47476tqk2, AbstractC47480tqo abstractC47480tqo2, android.widget.TextView textView2, AbstractC47480tqo abstractC47480tqo3, AbstractC47480tqo abstractC47480tqo4) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.AEQbTJ = textView;
        this.copydefault = abstractC47480tqo;
        this.KWHzl = abstractC47476tqk;
        this.EZpvd = abstractC47476tqk2;
        this.AhwBna = abstractC47480tqo2;
        this.AYXKKw = textView2;
        this.DbNXlk = abstractC47480tqo3;
        this.ejfBZ = abstractC47480tqo4;
    }
}
