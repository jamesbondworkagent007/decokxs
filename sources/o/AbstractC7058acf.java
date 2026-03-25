package o;

import java.util.EventListener;

/* JADX INFO: renamed from: o.acf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7058acf {
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public TaskDescription EZpvd;
    public java.util.List<EventListener> KWHzl;

    public abstract void AEQbTJ(EventListener eventListener);

    public void copydefault() {
        synchronized (this.AEQbTJ) {
            if (this.KWHzl != null) {
                if (this.EZpvd == null) {
                    TaskDescription taskDescription = new TaskDescription(this);
                    this.EZpvd = taskDescription;
                    taskDescription.setDaemon(true);
                    this.EZpvd.start();
                }
                TaskDescription taskDescription2 = this.EZpvd;
                java.util.List<EventListener> list = this.KWHzl;
                taskDescription2.AEQbTJ((EventListener[]) list.toArray(new EventListener[list.size()]));
            }
        }
    }

    /* JADX INFO: renamed from: o.acf$TaskDescription */
    public static class TaskDescription extends java.lang.Thread {
        public final java.util.List<EventListener[]> AEQbTJ = new java.util.ArrayList();
        public final AbstractC7058acf copydefault;

        public TaskDescription(AbstractC7058acf abstractC7058acf) {
            this.copydefault = abstractC7058acf;
        }

        public void AEQbTJ(EventListener[] eventListenerArr) {
            synchronized (this) {
                this.AEQbTJ.add(eventListenerArr);
                notify();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i;
            EventListener[] eventListenerArrRemove;
            while (true) {
                try {
                    synchronized (this) {
                        while (this.AEQbTJ.isEmpty()) {
                            wait();
                        }
                        eventListenerArrRemove = this.AEQbTJ.remove(0);
                    }
                    for (EventListener eventListener : eventListenerArrRemove) {
                        this.copydefault.AEQbTJ(eventListener);
                    }
                } catch (java.lang.InterruptedException unused) {
                    continue;
                }
            }
        }
    }
}
