package o;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class OX {
    public final java.util.Map<java.lang.String, TaskDescription> copydefault = new java.util.HashMap();
    public final ActionBar OLrzqt = new ActionBar();

    public static class TaskDescription {
        public final Lock AEQbTJ = new ReentrantLock();
        public int EZpvd;
    }

    public void AEQbTJ(java.lang.String str) {
        TaskDescription taskDescriptionOLrzqt;
        synchronized (this) {
            taskDescriptionOLrzqt = this.copydefault.get(str);
            if (taskDescriptionOLrzqt == null) {
                taskDescriptionOLrzqt = this.OLrzqt.OLrzqt();
                this.copydefault.put(str, taskDescriptionOLrzqt);
            }
            taskDescriptionOLrzqt.EZpvd++;
        }
        taskDescriptionOLrzqt.AEQbTJ.lock();
    }

    public void OLrzqt(java.lang.String str) {
        TaskDescription taskDescription;
        synchronized (this) {
            taskDescription = (TaskDescription) SE.OLrzqt(this.copydefault.get(str));
            int i = taskDescription.EZpvd;
            if (i < 1) {
                throw new java.lang.IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + taskDescription.EZpvd);
            }
            int i2 = i - 1;
            taskDescription.EZpvd = i2;
            if (i2 == 0) {
                TaskDescription taskDescriptionRemove = this.copydefault.remove(str);
                if (!taskDescriptionRemove.equals(taskDescription)) {
                    throw new java.lang.IllegalStateException("Removed the wrong lock, expected to remove: " + taskDescription + ", but actually removed: " + taskDescriptionRemove + ", safeKey: " + str);
                }
                this.OLrzqt.KWHzl(taskDescriptionRemove);
            }
        }
        taskDescription.AEQbTJ.unlock();
    }

    public static class ActionBar {
        public final Queue<TaskDescription> KWHzl = new ArrayDeque();

        public TaskDescription OLrzqt() {
            TaskDescription taskDescriptionPoll;
            synchronized (this.KWHzl) {
                taskDescriptionPoll = this.KWHzl.poll();
            }
            return taskDescriptionPoll == null ? new TaskDescription() : taskDescriptionPoll;
        }

        public void KWHzl(TaskDescription taskDescription) {
            synchronized (this.KWHzl) {
                if (this.KWHzl.size() < 10) {
                    this.KWHzl.offer(taskDescription);
                }
            }
        }
    }
}
