package o;

import java.util.LinkedList;

/* JADX INFO: renamed from: o.avt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C8077avt {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.util.List<java.util.Locale> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.String> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.util.Locale> copydefault() {
        return this.copydefault;
    }

    private C8077avt() {
        throw new java.lang.IllegalStateException("Not allowed");
    }

    public C8077avt(java.util.List<java.lang.String> list, java.util.List<java.util.Locale> list2) {
        this.AEQbTJ = list;
        this.copydefault = list2;
    }

    public static TaskDescription KWHzl() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.avt$TaskDescription */
    public static class TaskDescription {
        public java.util.List<java.lang.String> AEQbTJ;
        public java.util.List<java.util.Locale> copydefault;

        private TaskDescription() {
            this.AEQbTJ = new LinkedList();
            this.copydefault = new LinkedList();
        }

        public TaskDescription copydefault(java.lang.String str) {
            this.AEQbTJ.add(str);
            return this;
        }

        public C8077avt copydefault() {
            return new C8077avt(this.AEQbTJ, this.copydefault);
        }
    }
}
