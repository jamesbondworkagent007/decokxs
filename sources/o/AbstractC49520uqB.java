package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;

/* JADX INFO: renamed from: o.uqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49520uqB extends ViewDataBinding {
    public final OKReminder AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;

    public AbstractC49520uqB(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, OKReminder oKReminder, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.AEQbTJ = oKReminder;
        this.KWHzl = textView;
        this.EZpvd = textView2;
    }
}
