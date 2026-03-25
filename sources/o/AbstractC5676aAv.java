package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5676aAv extends ViewDataBinding {
    public final OKReminder AEQbTJ;
    public final RecyclerView EZpvd;
    public final C55173xeu KWHzl;

    public AbstractC5676aAv(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, C55173xeu c55173xeu, OKReminder oKReminder) {
        super(obj, view, i);
        this.EZpvd = recyclerView;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = oKReminder;
    }

    public static AbstractC5676aAv EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC5676aAv OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC5676aAv) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.RlQdEF, viewGroup, z, obj);
    }
}
