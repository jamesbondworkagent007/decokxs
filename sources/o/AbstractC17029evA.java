package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17029evA extends ViewDataBinding {
    public final MaterialCardView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final C55113xdn AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final C17634fMp DbNXlk;
    public final C52794wYp EZpvd;
    public final C33537myN KWHzl;
    public final android.view.View OLrzqt;
    public final C55173xeu copydefault;
    public final AppCompatImageView djBIcL;
    public final C17634fMp ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final C17634fMp getNewProxyInstance;
    public final C17634fMp hDKMBd;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public final RecyclerView valueOf;
    public final NestedScrollView values;

    public AbstractC17029evA(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, MaterialCardView materialCardView, C55173xeu c55173xeu, android.view.View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, C55113xdn c55113xdn, RecyclerView recyclerView, NestedScrollView nestedScrollView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, C17634fMp c17634fMp, android.widget.TextView textView4, android.widget.TextView textView5, C17634fMp c17634fMp2, android.widget.TextView textView6, android.widget.TextView textView7, C17634fMp c17634fMp3, android.widget.TextView textView8, android.widget.TextView textView9, android.widget.TextView textView10, C17634fMp c17634fMp4) {
        super(obj, view, i);
        this.KWHzl = c33537myN;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = materialCardView;
        this.copydefault = c55173xeu;
        this.OLrzqt = view2;
        this.gEmmrt = constraintLayout;
        this.AYXKKw = appCompatImageView;
        this.djBIcL = appCompatImageView2;
        this.AhwBna = c55113xdn;
        this.valueOf = recyclerView;
        this.values = nestedScrollView;
        this.AkhnZx = textView;
        this.fetchVPNInfo = textView2;
        this.isConnected = textView3;
        this.DbNXlk = c17634fMp;
        this.fIwbmz = textView4;
        this.fJNWhG = textView5;
        this.ejfBZ = c17634fMp2;
        this.fARcdN = textView6;
        this.AuCTel = textView7;
        this.getNewProxyInstance = c17634fMp3;
        this.uzCIH = textView8;
        this.getFieldNames = textView9;
        this.iwGUEr = textView10;
        this.hDKMBd = c17634fMp4;
    }

    public static AbstractC17029evA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17029evA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17029evA) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DPVBvL, null, false, obj);
    }
}
