package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25811jHf extends androidx.recyclerview.widget.ListAdapter<AlertUiItem, RecyclerView.ViewHolder> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function1<AlertDataUiItem, Unit> AEQbTJ;
    public final Function1<AlertDataUiItem, Unit> EZpvd;
    public final Function1<AlertGroupUiItem, Unit> KWHzl;
    public final Function1<AlertUiItem, Unit> OLrzqt;
    public final Function1<AlertDataUiItem, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.data.model.alert.AlertGroupUiItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.data.model.alert.AlertUiItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.data.model.alert.AlertDataUiItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.data.model.alert.AlertDataUiItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.data.model.alert.AlertDataUiItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25811jHf(@NotNull Function1<? super AlertGroupUiItem, Unit> function1, @NotNull Function1<? super AlertUiItem, Unit> function12, @NotNull Function1<? super AlertDataUiItem, Unit> function13, @NotNull Function1<? super AlertDataUiItem, Unit> function14, @NotNull Function1<? super AlertDataUiItem, Unit> function15) {
        super(new C25818jHm());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        this.KWHzl = function1;
        this.OLrzqt = function12;
        this.copydefault = function13;
        this.EZpvd = function14;
        this.AEQbTJ = function15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0) {
            return C25814jHi.Companion.OLrzqt(viewGroup);
        }
        return C25815jHj.Companion.KWHzl(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof C25814jHi) {
            AlertUiItem item = getItem(i);
            Intrinsics.copydefault(item, "");
            final AlertGroupUiItem alertGroupUiItem = (AlertGroupUiItem) item;
            C25814jHi c25814jHi = (C25814jHi) viewHolder;
            c25814jHi.AEQbTJ(alertGroupUiItem);
            c25814jHi.AEQbTJ().EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jHe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C25811jHf.KWHzl(this.copydefault, alertGroupUiItem, view);
                }
            });
            if (alertGroupUiItem.AYXKKw()) {
                c25814jHi.AEQbTJ().KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.jHl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C25811jHf.OLrzqt(this.AEQbTJ, alertGroupUiItem, view);
                    }
                });
                return;
            }
            return;
        }
        if (viewHolder instanceof C25815jHj) {
            AlertUiItem item2 = getItem(i);
            Intrinsics.copydefault(item2, "");
            final AlertDataUiItem alertDataUiItem = (AlertDataUiItem) item2;
            C25815jHj c25815jHj = (C25815jHj) viewHolder;
            c25815jHj.OLrzqt(alertDataUiItem);
            C22328hdL c22328hdLKWHzl = c25815jHj.KWHzl();
            android.widget.TextView textView = c22328hdLKWHzl.copydefault;
            textView.setOnClickListener(new TaskDescription(textView, 1000L, viewHolder, this, alertDataUiItem, c22328hdLKWHzl));
            if (alertDataUiItem.AYXKKw()) {
                android.widget.LinearLayout linearLayout = c22328hdLKWHzl.OLrzqt;
                linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this, alertDataUiItem));
            } else {
                c22328hdLKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jHk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C25811jHf.OLrzqt(this.KWHzl, alertDataUiItem, view);
                    }
                });
                C55239xgG c55239xgG = c22328hdLKWHzl.AhwBna;
                c55239xgG.setOnClickListener(new LoaderManager(c55239xgG, 1000L, this, alertDataUiItem, c22328hdLKWHzl));
            }
        }
    }

    public static final void KWHzl(C25811jHf c25811jHf, AlertGroupUiItem alertGroupUiItem, android.view.View view) {
        c25811jHf.KWHzl.invoke(alertGroupUiItem);
    }

    public static final void OLrzqt(C25811jHf c25811jHf, AlertGroupUiItem alertGroupUiItem, android.view.View view) {
        c25811jHf.OLrzqt.invoke(alertGroupUiItem);
    }

    /* JADX INFO: renamed from: o.jHf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;
        public final /* synthetic */ C25811jHf OLrzqt;
        public final /* synthetic */ AlertDataUiItem copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C25811jHf c25811jHf, AlertDataUiItem alertDataUiItem) {
            this.EZpvd = viewOnClickListenerC54939xaY;
            this.OLrzqt = c25811jHf;
            this.copydefault = alertDataUiItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
            this.OLrzqt.AEQbTJ.invoke(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.jHf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C22328hdL AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C22328hdL c22328hdL) {
            this.EZpvd = viewOnClickListenerC54939xaY;
            this.AEQbTJ = c22328hdL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
            this.AEQbTJ.getRoot().OLrzqt();
        }
    }

    public static final void OLrzqt(C25811jHf c25811jHf, AlertDataUiItem alertDataUiItem, android.view.View view) {
        c25811jHf.copydefault.invoke(alertDataUiItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(getItem(i) instanceof AlertGroupUiItem) ? 1 : 0;
    }

    /* JADX INFO: renamed from: o.jHf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jHf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jHf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AlertDataUiItem EZpvd;
        public final /* synthetic */ C25811jHf KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25811jHf c25811jHf, AlertDataUiItem alertDataUiItem) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c25811jHf;
            this.EZpvd = alertDataUiItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.jHf$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ AlertDataUiItem AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25811jHf KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C22328hdL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C25811jHf c25811jHf, AlertDataUiItem alertDataUiItem, C22328hdL c22328hdL) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c25811jHf;
            this.AEQbTJ = alertDataUiItem;
            this.copydefault = c22328hdL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke(this.AEQbTJ);
                this.copydefault.AhwBna.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: o.jHf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ AlertDataUiItem AEQbTJ;
        public final /* synthetic */ C22328hdL EZpvd;
        public final /* synthetic */ RecyclerView.ViewHolder KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;
        public final /* synthetic */ C25811jHf valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, RecyclerView.ViewHolder viewHolder, C25811jHf c25811jHf, AlertDataUiItem alertDataUiItem, C22328hdL c22328hdL) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = viewHolder;
            this.valueOf = c25811jHf;
            this.AEQbTJ = alertDataUiItem;
            this.EZpvd = c22328hdL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = ((C25815jHj) this.KWHzl).copydefault().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C22366hdx.StateListAnimator.fetchVPNInfo);
                viewOnClickListenerC54939xaY.copydefault(C22366hdx.StateListAnimator.AkhnZx);
                viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy, new StateListAnimator(viewOnClickListenerC54939xaY, this.valueOf, this.AEQbTJ));
                viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.ORxRYg, new Application(viewOnClickListenerC54939xaY, this.EZpvd));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
