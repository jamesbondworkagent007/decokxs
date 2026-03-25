package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16725epO extends ViewDataBinding {
    public final OKReminder KWHzl;

    public AbstractC16725epO(java.lang.Object obj, android.view.View view, int i, OKReminder oKReminder) {
        super(obj, view, i);
        this.KWHzl = oKReminder;
    }

    public static AbstractC16725epO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16725epO OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16725epO) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DwQSDd, viewGroup, z, obj);
    }
}
