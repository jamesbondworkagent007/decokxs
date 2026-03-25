package o;

import com.immomo.mls.adapter.MLSThreadAdapter;

/* JADX INFO: renamed from: o.ahX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7315ahX implements MLSThreadAdapter {
    public final java.util.Map<java.lang.Object, java.util.List<StateListAnimator>> EZpvd = new java.util.HashMap();

    @Override // com.immomo.mls.adapter.MLSThreadAdapter
    public void KWHzl(MLSThreadAdapter.Priority priority, java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setPriority(priority == MLSThreadAdapter.Priority.HIGH ? 10 : 1);
        thread.start();
    }

    @Override // com.immomo.mls.adapter.MLSThreadAdapter
    public void AEQbTJ(java.lang.Object obj, java.lang.Runnable runnable) {
        new StateListAnimator(obj, runnable).AEQbTJ(new java.lang.Void[0]);
    }

    @Override // com.immomo.mls.adapter.MLSThreadAdapter
    public void copydefault(java.lang.Object obj) {
        java.util.List<StateListAnimator> listRemove = this.EZpvd.remove(obj);
        if (listRemove == null) {
            return;
        }
        java.util.Iterator<StateListAnimator> it = listRemove.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        listRemove.clear();
    }

    /* JADX INFO: renamed from: o.ahX$StateListAnimator */
    public final class StateListAnimator extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        public java.lang.Object AEQbTJ;
        public java.util.List<StateListAnimator> KWHzl;
        public java.lang.Runnable copydefault;

        public StateListAnimator(java.lang.Object obj, java.lang.Runnable runnable) {
            this.copydefault = runnable;
            this.AEQbTJ = obj;
            java.util.List<StateListAnimator> list = (java.util.List) C7315ahX.this.EZpvd.get(obj);
            this.KWHzl = list;
            if (list == null) {
                this.KWHzl = new java.util.ArrayList();
                C7315ahX.this.EZpvd.put(obj, this.KWHzl);
            }
            this.KWHzl.add(this);
        }

        public boolean equals(java.lang.Object obj) {
            return super.equals(obj) || ((obj instanceof StateListAnimator) && AEQbTJ(((StateListAnimator) obj).copydefault)) || ((obj instanceof java.lang.Runnable) && AEQbTJ((java.lang.Runnable) obj));
        }

        public boolean AEQbTJ(java.lang.Runnable runnable) {
            return runnable.equals(this.copydefault);
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.Void doInBackground(java.lang.Void... voidArr) {
            this.copydefault.run();
            this.KWHzl.remove(this);
            if (!this.KWHzl.isEmpty()) {
                return null;
            }
            C7315ahX.this.EZpvd.remove(this.AEQbTJ);
            return null;
        }

        public void AEQbTJ(java.lang.Void... voidArr) {
            super.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, voidArr);
        }
    }
}
