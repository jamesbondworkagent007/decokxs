package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uTZ extends ViewDataBinding {
    public final NestedScrollView AEQbTJ;
    public final RecyclerView EZpvd;
    public final OKReminder KWHzl;
    public final RecyclerView OLrzqt;
    public final android.view.View copydefault;

    public uTZ(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2, NestedScrollView nestedScrollView, android.view.View view2, OKReminder oKReminder) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.EZpvd = recyclerView2;
        this.AEQbTJ = nestedScrollView;
        this.copydefault = view2;
        this.KWHzl = oKReminder;
    }
}
