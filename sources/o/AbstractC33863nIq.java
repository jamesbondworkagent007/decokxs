package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;

/* JADX INFO: renamed from: o.nIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33863nIq extends ViewDataBinding {
    public final RecyclerView EZpvd;
    public final C33537myN KWHzl;
    public final OKReminder copydefault;

    public AbstractC33863nIq(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, RecyclerView recyclerView, OKReminder oKReminder) {
        super(obj, view, i);
        this.KWHzl = c33537myN;
        this.EZpvd = recyclerView;
        this.copydefault = oKReminder;
    }
}
