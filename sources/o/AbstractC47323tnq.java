package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: o.tnq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47323tnq extends ViewDataBinding {
    public final C33537myN AEQbTJ;

    @Bindable
    public LiveData<java.lang.Boolean> AYXKKw;

    @Bindable
    public LiveData<java.lang.String> AhwBna;

    @Bindable
    public MutableLiveData<java.lang.String> AkhnZx;

    @Bindable
    public LiveData<java.lang.Boolean> DbNXlk;
    public final android.widget.LinearLayout EZpvd;

    @Bindable
    public java.lang.String KWHzl;
    public final wYK OLrzqt;
    public final android.widget.LinearLayout copydefault;

    @Bindable
    public LiveData<java.lang.Boolean> djBIcL;
    public final C55018xby ejfBZ;
    public final C52794wYp fIwbmz;
    public final C55018xby fJNWhG;

    @Bindable
    public java.lang.CharSequence fetchVPNInfo;

    @Bindable
    public java.lang.CharSequence gEmmrt;

    @Bindable
    public LiveData<java.lang.Integer> isConnected;

    @Bindable
    public MutableLiveData<java.lang.String> valueOf;

    @Bindable
    public LiveData<java.lang.CharSequence> values;

    public abstract void AEQbTJ(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData);

    public abstract void AEQbTJ(@androidx.annotation.Nullable java.lang.CharSequence charSequence);

    public abstract void EZpvd(@androidx.annotation.Nullable LiveData<java.lang.String> liveData);

    public abstract void EZpvd(@androidx.annotation.Nullable java.lang.CharSequence charSequence);

    public abstract void KWHzl(@androidx.annotation.Nullable LiveData<java.lang.Integer> liveData);

    public abstract void KWHzl(@androidx.annotation.Nullable MutableLiveData<java.lang.String> mutableLiveData);

    public abstract void OLrzqt(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData);

    public abstract void copydefault(@androidx.annotation.Nullable LiveData<java.lang.Boolean> liveData);

    public abstract void copydefault(@androidx.annotation.Nullable MutableLiveData<java.lang.String> mutableLiveData);

    public abstract void copydefault(@androidx.annotation.Nullable java.lang.String str);

    public abstract void djBIcL(@androidx.annotation.Nullable LiveData<java.lang.CharSequence> liveData);

    public AbstractC47323tnq(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, wYK wyk, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, C55018xby c55018xby, C55018xby c55018xby2, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.AEQbTJ = c33537myN;
        this.OLrzqt = wyk;
        this.copydefault = linearLayout;
        this.EZpvd = linearLayout2;
        this.fJNWhG = c55018xby;
        this.ejfBZ = c55018xby2;
        this.fIwbmz = c52794wYp;
    }
}
