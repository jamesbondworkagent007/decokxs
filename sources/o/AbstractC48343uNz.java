package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;

/* JADX INFO: renamed from: o.uNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48343uNz extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final RecyclerView EZpvd;
    public final OKReminder KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC48343uNz(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2, android.widget.TextView textView, android.view.View view2, OKReminder oKReminder) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.EZpvd = recyclerView2;
        this.copydefault = textView;
        this.AEQbTJ = view2;
        this.KWHzl = oKReminder;
    }
}
