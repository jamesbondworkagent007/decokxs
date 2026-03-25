package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16575emX extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final RecyclerView KWHzl;

    public AbstractC16575emX(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.KWHzl = recyclerView;
        this.AEQbTJ = c52794wYp;
    }

    public static AbstractC16575emX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16575emX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16575emX) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DQzvGN, viewGroup, z, obj);
    }
}
