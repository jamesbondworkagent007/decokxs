package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15513eLc extends ViewModel {
    public LinearLayoutManager EZpvd;
    public boolean gEmmrt;
    public final int OLrzqt = 1;
    public final Application copydefault = new Application(android.os.Looper.getMainLooper());
    public final MutableLiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData<>();
    public int KWHzl = 10;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.gEmmrt = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.eLc$Application */
    public static final class Application extends android.os.Handler {
        public Application(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            if (message.what == C15513eLc.this.AEQbTJ()) {
                C15513eLc.this.KWHzl().setValue(java.lang.Boolean.TRUE);
                C15513eLc.this.EZpvd();
            }
        }
    }

    public final boolean OLrzqt() {
        LinearLayoutManager linearLayoutManager = this.EZpvd;
        if (linearLayoutManager == null) {
            Intrinsics.gEmmrt("");
            linearLayoutManager = null;
        }
        return linearLayoutManager.findLastVisibleItemPosition() < this.KWHzl;
    }

    public final void copydefault(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            this.EZpvd = (LinearLayoutManager) layoutManager;
            recyclerView.addOnScrollListener(new ActionBar());
            return;
        }
        if (recyclerView.getLayoutManager() == null) {
            throw new java.lang.RuntimeException("should set layoutmanager first");
        }
        throw new java.lang.RuntimeException("layoutmanager must be LinearLayoutManager");
    }

    /* JADX INFO: renamed from: o.eLc$ActionBar */
    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0 && C15513eLc.this.OLrzqt() && C15513eLc.this.gEmmrt) {
                C15513eLc.this.AEQbTJ(true);
            }
        }
    }

    public static /* synthetic */ void callRefresh$default(C15513eLc c15513eLc, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c15513eLc.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            this.copydefault.removeMessages(this.OLrzqt);
            this.AEQbTJ.setValue(java.lang.Boolean.TRUE);
            EZpvd();
        } else {
            if (this.copydefault.hasMessages(this.OLrzqt)) {
                return;
            }
            this.copydefault.sendEmptyMessageDelayed(this.OLrzqt, 1000L);
        }
    }

    public final boolean copydefault() {
        this.gEmmrt = true;
        if (!OLrzqt()) {
            return false;
        }
        callRefresh$default(this, false, 1, null);
        return true;
    }
}
