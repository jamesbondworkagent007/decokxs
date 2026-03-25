package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.multitype.selection.Selectable;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountConfig;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountShow;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.vUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vUP extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public C48351uOg gEmmrt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vUO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vUP.valueOf(this.KWHzl);
        }
    });
    public java.util.ArrayList<AccountConfig> KWHzl = new java.util.ArrayList<>();
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vUN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vUP.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vUS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vUP.AhwBna(this.EZpvd);
        }
    });
    public java.lang.String AYXKKw = "";

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vUP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final vUP copydefault(@NotNull java.util.ArrayList<AccountConfig> arrayList, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            vUP vup = new vUP();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("data", arrayList);
            bundle.putString("size", str);
            vup.setArguments(bundle);
            return vup;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(false);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QSusPL));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    public final ItemTouchHelper copydefault() {
        return (ItemTouchHelper) this.AEQbTJ.getValue();
    }

    public static final ItemTouchHelper valueOf(vUP vup) {
        return new ItemTouchHelper(vup.new ActionBar());
    }

    private final C43316rmw OLrzqt() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public static final C43316rmw djBIcL(vUP vup) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(AccountConfig.class, new C50661vWr(vup.copydefault()));
        return c43316rmw;
    }

    public static final class StateListAnimator extends C43317rmx<RecyclerView.ViewHolder> {
        @Override // o.C43317rmx, com.okinc.multitype.selection.Selectable
        public boolean KWHzl(int i) {
            return true;
        }

        public StateListAnimator(C43316rmw c43316rmw, Selectable.Mode mode) {
            super(c43316rmw, mode);
        }
    }

    public final StateListAnimator KWHzl() {
        return (StateListAnimator) this.copydefault.getValue();
    }

    public static final StateListAnimator AhwBna(vUP vup) {
        return new StateListAnimator(vup.OLrzqt(), Selectable.Mode.Multiple);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        android.widget.ImageView imageView;
        OKRegularCell oKRegularCell;
        java.lang.String string;
        java.util.ArrayList<AccountConfig> parcelableArrayList;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("data")) != null) {
            this.KWHzl = parcelableArrayList;
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("size")) != null) {
            this.AYXKKw = string;
        }
        android.content.Context context = getContext();
        if (context != null) {
            C48351uOg c48351uOgCopydefault = C48351uOg.copydefault(getCustomLayoutInflater(), constraintLayout, true);
            this.gEmmrt = c48351uOgCopydefault;
            if (c48351uOgCopydefault != null && (oKRegularCell = c48351uOgCopydefault.EZpvd) != null) {
                oKRegularCell.setDescription(this.AYXKKw);
            }
            C48351uOg c48351uOg = this.gEmmrt;
            if (c48351uOg != null && (imageView = c48351uOg.copydefault) != null) {
                imageView.setEnabled(false);
            }
            C48351uOg c48351uOg2 = this.gEmmrt;
            if (c48351uOg2 != null && (recyclerView3 = c48351uOg2.AEQbTJ) != null) {
                recyclerView3.setLayoutManager(C33047mpA.KWHzl(context));
            }
            C48351uOg c48351uOg3 = this.gEmmrt;
            if (c48351uOg3 != null && (recyclerView2 = c48351uOg3.AEQbTJ) != null) {
                copydefault().attachToRecyclerView(recyclerView2);
            }
            C48351uOg c48351uOg4 = this.gEmmrt;
            if (c48351uOg4 != null && (recyclerView = c48351uOg4.AEQbTJ) != null) {
                recyclerView.setAdapter(KWHzl());
            }
            C33064mpR.OLrzqt(OLrzqt(), (java.util.List<? extends java.lang.Object>) this.KWHzl);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOnClickListener(new PendingIntent(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static final class TaskDescription implements Function1<java.util.ArrayList<AccountType>, Unit> {
        public static final TaskDescription copydefault = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.ArrayList<AccountType> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.util.ArrayList<AccountType> arrayList) {
            copydefault(arrayList);
            return Unit.INSTANCE;
        }
    }

    public final class ActionBar extends ItemTouchHelper.SimpleCallback {
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isItemViewSwipeEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
            super(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            vUP.this.OLrzqt(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            super.onSelectedChanged(viewHolder, i);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super.clearView(recyclerView, viewHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(int i, int i2) {
        Collections.swap(this.KWHzl, i, i2);
        OLrzqt().notifyItemMoved(i, i2);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vUP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vUP vup) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = vup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ vUP EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, vUP vup) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = vup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                vUU.Application application = vUU.Companion;
                java.util.ArrayList<AccountConfig> arrayList = this.EZpvd.KWHzl;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (AccountConfig accountConfig : arrayList) {
                    arrayList2.add(new AccountShow(accountConfig.getId(), accountConfig.getTitle(), accountConfig.getAvailable(), accountConfig.getSelect()));
                }
                application.KWHzl(new java.util.ArrayList<>(arrayList2), this.EZpvd.AYXKKw, TaskDescription.copydefault).show(this.EZpvd.getParentFragmentManager(), vUU.class.getSimpleName());
                this.EZpvd.dismiss();
            }
        }
    }
}
