package o;

/* JADX INFO: loaded from: classes8.dex */
public class oUC {
    public final java.lang.Object EZpvd;
    public final java.util.ArrayList<TaskDescription> OLrzqt = new java.util.ArrayList<>();

    public interface TaskDescription {
        void OLrzqt(java.lang.Object obj, java.lang.Object obj2);
    }

    public oUC(java.lang.Object obj) {
        this.EZpvd = obj;
    }

    public void AEQbTJ(TaskDescription taskDescription) {
        if (this.OLrzqt.contains(taskDescription)) {
            return;
        }
        this.OLrzqt.add(taskDescription);
    }

    public boolean KWHzl() {
        return this.OLrzqt.size() > 0;
    }

    public void copydefault(java.lang.Object obj) {
        for (int i = 0; i < this.OLrzqt.size(); i++) {
            this.OLrzqt.get(i).OLrzqt(this.EZpvd, obj);
        }
    }
}
