package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import o.InterfaceC43315rmv;

/* JADX INFO: renamed from: o.rmz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C43319rmz implements InterfaceC43315rmv {
    public InterfaceC43315rmv.Application AEQbTJ;
    public C59534zip EZpvd;
    public int KWHzl = 0;

    /* JADX INFO: renamed from: o.rmz$TaskDescription */
    public static class TaskDescription implements ListUpdateCallback {
        public C59534zip EZpvd;

        public TaskDescription(C59534zip c59534zip) {
            this.EZpvd = c59534zip;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            this.EZpvd.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            this.EZpvd.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
            this.EZpvd.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i, int i2, java.lang.Object obj) {
            this.EZpvd.notifyItemRangeChanged(i, i2, obj);
        }
    }

    public C43319rmz(C59534zip c59534zip, InterfaceC43315rmv.Application application) {
        this.EZpvd = c59534zip;
        this.AEQbTJ = application;
    }

    public void OLrzqt(final java.util.List<?> list, final ListUpdateCallback listUpdateCallback, final boolean z) {
        this.KWHzl++;
        java.util.List<?> items = this.EZpvd.getItems();
        if (items == null) {
            if (list == null) {
                return;
            }
            this.EZpvd.setItems(list);
            this.EZpvd.notifyDataSetChanged();
            return;
        }
        if (list == null) {
            int size = items.size();
            this.EZpvd.setItems(new java.util.ArrayList(0));
            this.EZpvd.notifyItemRangeRemoved(0, size);
        } else {
            final int i = this.KWHzl;
            new android.os.AsyncTask<android.util.Pair<java.util.List<?>, java.util.List<?>>, java.lang.Void, DiffUtil.DiffResult>() { // from class: o.rmz.5
                /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // android.os.AsyncTask
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public DiffUtil.DiffResult doInBackground(android.util.Pair<java.util.List<?>, java.util.List<?>>... pairArr) {
                    android.util.Pair<java.util.List<?>, java.util.List<?>> pair = pairArr[0];
                    final java.util.List list2 = (java.util.List) pair.first;
                    final java.util.List list3 = (java.util.List) pair.second;
                    return DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: o.rmz.5.4
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public int getOldListSize() {
                            return list2.size();
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public int getNewListSize() {
                            return list3.size();
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public boolean areItemsTheSame(int i2, int i3) {
                            return C43319rmz.this.AEQbTJ.AEQbTJ(list2.get(i2), list3.get(i3));
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public boolean areContentsTheSame(int i2, int i3) {
                            return C43319rmz.this.AEQbTJ.KWHzl(list2.get(i2), list3.get(i3));
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public java.lang.Object getChangePayload(int i2, int i3) {
                            return C43319rmz.this.AEQbTJ.KWHzl(i2, i3);
                        }
                    }, z);
                }

                /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
                @Override // android.os.AsyncTask
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public void onPostExecute(DiffUtil.DiffResult diffResult) {
                    if (i != C43319rmz.this.KWHzl) {
                        return;
                    }
                    C43319rmz.this.EZpvd.setItems(list);
                    diffResult.dispatchUpdatesTo(listUpdateCallback);
                }
            }.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new android.util.Pair(items, list));
        }
    }

    public void OLrzqt(java.util.List<?> list) {
        AEQbTJ(list, true);
    }

    public void AEQbTJ(java.util.List<?> list, boolean z) {
        OLrzqt(list, new TaskDescription(this.EZpvd), z);
    }
}
