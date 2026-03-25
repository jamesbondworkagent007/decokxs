package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15296eDb extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final Function1<eFJ, Unit> AEQbTJ;
    public final Function0<Unit> AYXKKw;
    public boolean KWHzl;
    public final Function1<eFI, Unit> OLrzqt;
    public int djBIcL;
    public final java.util.List<java.lang.Object> copydefault = new java.util.ArrayList();
    public int AhwBna = -1;

    /* JADX INFO: renamed from: o.eDb$StateListAnimator */
    public static final class StateListAnimator {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.eFI, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eFJ, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15296eDb(Function1<? super eFI, Unit> function1, Function1<? super eFJ, Unit> function12, Function0<Unit> function0) {
        this.OLrzqt = function1;
        this.AEQbTJ = function12;
        this.AYXKKw = function0;
    }

    /* JADX INFO: renamed from: o.eDb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eDb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        java.lang.Object obj = this.copydefault.get(i);
        if (obj instanceof eFI) {
            return 0;
        }
        return obj instanceof eFJ ? 1 : 2;
    }

    public static /* synthetic */ void setData$default(C15296eDb c15296eDb, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c15296eDb.KWHzl(list, z, z2);
    }

    public final void KWHzl(@NotNull java.util.List<? extends java.lang.Object> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.clear();
        this.copydefault.addAll(list);
        if (z) {
            this.copydefault.add(new StateListAnimator());
        }
        this.KWHzl = false;
        if (z2) {
            this.djBIcL = 0;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 1) {
            C16814eqy c16814eqyEZpvd = C16814eqy.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16814eqyEZpvd, "");
            return new TaskDescription(c16814eqyEZpvd);
        }
        if (i == 2) {
            C16807eqr c16807eqrAEQbTJ = C16807eqr.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16807eqrAEQbTJ, "");
            return new ActionBar(c16807eqrAEQbTJ);
        }
        C16808eqs c16808eqsAEQbTJ = C16808eqs.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16808eqsAEQbTJ, "");
        return new Application(c16808eqsAEQbTJ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof Application) {
            java.lang.Object obj = this.copydefault.get(i);
            Intrinsics.copydefault(obj, "");
            eFI efi = (eFI) obj;
            java.lang.String address = efi.copydefault().getAddress();
            Application application = (Application) viewHolder;
            android.widget.ImageView imageView = application.KWHzl().KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(i == this.djBIcL ? 0 : 8);
            if (i == this.djBIcL) {
                application.KWHzl().OLrzqt.setBackgroundResource(C13754dXa.Activity.DGOPHZDGOPHZ);
            } else {
                application.KWHzl().OLrzqt.setBackgroundResource(C13754dXa.Activity.hCLrkq);
            }
            application.KWHzl().AhwBna.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, address, false, 2, null));
            WalletCurrencyBean walletCurrencyBeanCopydefault = C54864xYd.AEQbTJ.copydefault();
            java.lang.String strEZpvd = efi.EZpvd();
            java.lang.String valuationFromFee$default = strEZpvd != null ? C54880xYt.formatValuationFromFee$default(strEZpvd, walletCurrencyBeanCopydefault, false, false, 6, null) : null;
            android.widget.TextView textView = application.KWHzl().djBIcL;
            if (valuationFromFee$default == null) {
                valuationFromFee$default = efi.OLrzqt();
            }
            textView.setText(valuationFromFee$default);
            android.widget.TextView textView2 = application.KWHzl().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            C55251xgS c55251xgS = application.KWHzl().valueOf;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            AppCompatImageView appCompatImageView = application.KWHzl().EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.loadBlockiesIcon$default(appCompatImageView, address, C13754dXa.Activity.getNewProxyInstance, null, 40.0f, 4, null);
            android.view.View view = viewHolder.itemView;
            view.setOnClickListener(new LoaderManager(view, 1000L, this, viewHolder, efi));
            return;
        }
        if (viewHolder instanceof TaskDescription) {
            java.lang.Object obj2 = this.copydefault.get(i);
            Intrinsics.copydefault(obj2, "");
            eFJ efj = (eFJ) obj2;
            TaskDescription taskDescription = (TaskDescription) viewHolder;
            LinearLayoutCompat linearLayoutCompat = taskDescription.AEQbTJ().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.removeAllViews();
            for (eFI efi2 : efj.copydefault()) {
                android.content.Context context = linearLayoutCompat.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                eDZ edz = new eDZ(context, null, 2, null);
                edz.copydefault(efi2);
                linearLayoutCompat.addView(edz);
            }
            if (i == this.djBIcL) {
                taskDescription.AEQbTJ().copydefault.setVisibility(0);
            } else {
                taskDescription.AEQbTJ().copydefault.setVisibility(4);
            }
            if (i == this.djBIcL) {
                taskDescription.AEQbTJ().OLrzqt.setBackgroundResource(C13754dXa.Activity.DGOPHZDGOPHZ);
            } else {
                taskDescription.AEQbTJ().OLrzqt.setBackgroundResource(C13754dXa.Activity.hCLrkq);
            }
            android.view.View view2 = viewHolder.itemView;
            view2.setOnClickListener(new FragmentManager(view2, 1000L, this, viewHolder, efj));
            return;
        }
        if (viewHolder instanceof ActionBar) {
            ActionBar actionBar = (ActionBar) viewHolder;
            actionBar.AEQbTJ().OLrzqt.setSelected(this.KWHzl);
            if (this.KWHzl) {
                actionBar.AEQbTJ().KWHzl.setVisibility(0);
                actionBar.AEQbTJ().copydefault.setVisibility(8);
                viewHolder.itemView.setEnabled(false);
            } else {
                actionBar.AEQbTJ().KWHzl.setVisibility(8);
                actionBar.AEQbTJ().copydefault.setVisibility(0);
                viewHolder.itemView.setEnabled(true);
            }
            android.view.View view3 = viewHolder.itemView;
            view3.setOnClickListener(new Fragment(view3, 1000L, this, viewHolder));
        }
    }

    /* JADX INFO: renamed from: o.eDb$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ RecyclerView.ViewHolder EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C15296eDb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C15296eDb c15296eDb, RecyclerView.ViewHolder viewHolder) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c15296eDb;
            this.EZpvd = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.OLrzqt()) {
                    C15296eDb c15296eDb = this.copydefault;
                    c15296eDb.notifyItemChanged(c15296eDb.AhwBna);
                    this.copydefault.AEQbTJ(true);
                    this.copydefault.AhwBna = ((ActionBar) this.EZpvd).copydefault();
                    C15296eDb c15296eDb2 = this.copydefault;
                    c15296eDb2.notifyItemChanged(c15296eDb2.AhwBna);
                    Function0 function0 = this.copydefault.AYXKKw;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C13754dXa.FragmentManager.MediaSessionCompatApi23);
                Intrinsics.checkNotNullExpressionValue(string, "");
                C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.eDb$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ eFJ AEQbTJ;
        public final /* synthetic */ RecyclerView.ViewHolder EZpvd;
        public final /* synthetic */ C15296eDb KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C15296eDb c15296eDb, RecyclerView.ViewHolder viewHolder, eFJ efj) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c15296eDb;
            this.EZpvd = viewHolder;
            this.AEQbTJ = efj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C15296eDb c15296eDb = this.KWHzl;
                c15296eDb.notifyItemChanged(c15296eDb.djBIcL);
                this.KWHzl.djBIcL = ((TaskDescription) this.EZpvd).copydefault();
                C15296eDb c15296eDb2 = this.KWHzl;
                c15296eDb2.notifyItemChanged(c15296eDb2.djBIcL);
                Function1 function1 = this.KWHzl.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eDb$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ RecyclerView.ViewHolder AEQbTJ;
        public final /* synthetic */ C15296eDb EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ eFI OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C15296eDb c15296eDb, RecyclerView.ViewHolder viewHolder, eFI efi) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c15296eDb;
            this.AEQbTJ = viewHolder;
            this.OLrzqt = efi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                pUU.OLrzqt(">>>ledger adapter:  selectedPos :" + this.EZpvd.djBIcL + " - loadingPos:" + this.EZpvd.AhwBna);
                C15296eDb c15296eDb = this.EZpvd;
                c15296eDb.notifyItemChanged(c15296eDb.djBIcL);
                this.EZpvd.djBIcL = ((Application) this.AEQbTJ).copydefault();
                C15296eDb c15296eDb2 = this.EZpvd;
                c15296eDb2.notifyItemChanged(c15296eDb2.djBIcL);
                Function1 function1 = this.EZpvd.OLrzqt;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt);
                }
            }
        }
    }

    public final boolean OLrzqt() {
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        return (interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null) != null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX INFO: renamed from: o.eDb$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final C16808eqs OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C16808eqs KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C16808eqs c16808eqs) {
            super(c16808eqs.getRoot());
            Intrinsics.checkNotNullParameter(c16808eqs, "");
            this.OLrzqt = c16808eqs;
        }

        public final int copydefault() {
            return getLayoutPosition();
        }
    }

    /* JADX INFO: renamed from: o.eDb$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C16807eqr EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C16807eqr AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C16807eqr c16807eqr) {
            super(c16807eqr.getRoot());
            Intrinsics.checkNotNullParameter(c16807eqr, "");
            this.EZpvd = c16807eqr;
        }

        public final int copydefault() {
            return getLayoutPosition();
        }
    }

    /* JADX INFO: renamed from: o.eDb$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C16814eqy AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C16814eqy AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C16814eqy c16814eqy) {
            super(c16814eqy.getRoot());
            Intrinsics.checkNotNullParameter(c16814eqy, "");
            this.AEQbTJ = c16814eqy;
        }

        public final int copydefault() {
            return getLayoutPosition();
        }
    }
}
