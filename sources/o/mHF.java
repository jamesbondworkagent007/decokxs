package o;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class mHF implements View.OnClickListener {
    public final TaskDescription KWHzl;
    public final int copydefault;

    public interface TaskDescription {
        void copydefault(int i, android.view.View view);
    }

    public mHF(TaskDescription taskDescription, int i) {
        this.KWHzl = taskDescription;
        this.copydefault = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        this.KWHzl.copydefault(this.copydefault, view);
    }
}
