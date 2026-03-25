package o;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class mPT implements View.OnClickListener {
    public final TaskDescription AEQbTJ;
    public final int EZpvd;

    public interface TaskDescription {
        void AEQbTJ(int i, android.view.View view);
    }

    public mPT(TaskDescription taskDescription, int i) {
        this.AEQbTJ = taskDescription;
        this.EZpvd = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        this.AEQbTJ.AEQbTJ(this.EZpvd, view);
    }
}
