package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.oklive.app.ui.player.ILivePlayer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44569sUu;
import o.C44565sUq;
import o.sWj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.sUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44565sUq extends androidx.recyclerview.widget.ListAdapter<AbstractC44569sUu, RecyclerView.ViewHolder> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final Function1<AbstractC44569sUu.Activity, Unit> AEQbTJ;
    public final Function1<AbstractC44569sUu.Activity, Unit> EZpvd;
    public final Function1<AbstractC44569sUu.ActionBar, Unit> KWHzl;
    public final Function0<Unit> OLrzqt;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.sUu$Activity, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.sUu$ActionBar, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.sUu$Activity, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C44565sUq(@NotNull Function1<? super AbstractC44569sUu.Activity, Unit> function1, @NotNull Function1<? super AbstractC44569sUu.ActionBar, Unit> function12, Function1<? super AbstractC44569sUu.Activity, Unit> function13, Function0<Unit> function0) {
        super(new Activity());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd = function1;
        this.KWHzl = function12;
        this.AEQbTJ = function13;
        this.OLrzqt = function0;
    }

    /* JADX INFO: renamed from: o.sUq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AbstractC44569sUu item = getItem(i);
        if (item instanceof AbstractC44569sUu.Activity) {
            return 0;
        }
        if (item instanceof AbstractC44569sUu.Dialog) {
            return 1;
        }
        if (item instanceof AbstractC44569sUu.StateListAnimator) {
            return 3;
        }
        if (item instanceof AbstractC44569sUu.Application) {
            return 4;
        }
        if (item instanceof AbstractC44569sUu.TaskDescription) {
            return 5;
        }
        if (item instanceof AbstractC44569sUu.ActionBar) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof TaskDescription) {
            TaskDescription taskDescription = (TaskDescription) viewHolder;
            taskDescription.KWHzl();
            taskDescription.OLrzqt();
        } else if (viewHolder instanceof FragmentManager) {
            ((FragmentManager) viewHolder).KWHzl();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            sWl swlKWHzl = sWl.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(swlKWHzl, "");
            return new TaskDescription(swlKWHzl, this.EZpvd, this.AEQbTJ);
        }
        if (i == 1) {
            sWm swmKWHzl = sWm.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(swmKWHzl, "");
            return new LoaderManager(swmKWHzl);
        }
        if (i == 2) {
            sWo swoEZpvd = sWo.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(swoEZpvd, "");
            return new FragmentManager(swoEZpvd, this.KWHzl);
        }
        if (i == 3) {
            sWp swpCopydefault = sWp.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(swpCopydefault, "");
            return new PendingIntent(swpCopydefault);
        }
        if (i == 4) {
            sWk swkEZpvd = sWk.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(swkEZpvd, "");
            return new ActionBar(swkEZpvd, this.OLrzqt);
        }
        if (i == 5) {
            sWn swnEZpvd = sWn.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(swnEZpvd, "");
            return new StateListAnimator(swnEZpvd);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        AbstractC44569sUu item = getItem(i);
        if (item instanceof AbstractC44569sUu.Activity) {
            TaskDescription taskDescription = (TaskDescription) viewHolder;
            taskDescription.AEQbTJ(this.gEmmrt);
            taskDescription.KWHzl((AbstractC44569sUu.Activity) item);
        } else {
            if (item instanceof AbstractC44569sUu.Dialog) {
                ((LoaderManager) viewHolder).OLrzqt();
                return;
            }
            if (item instanceof AbstractC44569sUu.StateListAnimator) {
                ((PendingIntent) viewHolder).KWHzl((AbstractC44569sUu.StateListAnimator) item);
            } else {
                if ((item instanceof AbstractC44569sUu.Application) || (item instanceof AbstractC44569sUu.TaskDescription)) {
                    return;
                }
                if (!(item instanceof AbstractC44569sUu.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((FragmentManager) viewHolder).AEQbTJ((AbstractC44569sUu.ActionBar) item);
            }
        }
    }

    public final void copydefault(@NotNull RecyclerView recyclerView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<AbstractC44569sUu> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.Iterator<AbstractC44569sUu> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            AbstractC44569sUu next = it.next();
            if ((next instanceof AbstractC44569sUu.Activity) && Intrinsics.EZpvd((java.lang.Object) ((AbstractC44569sUu.Activity) next).OLrzqt(), (java.lang.Object) str)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition instanceof TaskDescription) {
                TaskDescription taskDescription = (TaskDescription) viewHolderFindViewHolderForAdapterPosition;
                taskDescription.AEQbTJ();
                taskDescription.EZpvd();
                return;
            }
            notifyItemChanged(i);
        }
    }

    public final void AEQbTJ(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        java.util.List<AbstractC44569sUu> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.Iterator<AbstractC44569sUu> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof AbstractC44569sUu.Activity) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition instanceof TaskDescription) {
                ((TaskDescription) viewHolderFindViewHolderForAdapterPosition).AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.sUq$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final sWl AEQbTJ;
        public boolean AYXKKw;
        public boolean AhwBna;
        public boolean EZpvd;
        public AbstractC44569sUu.Activity KWHzl;
        public ILivePlayer OLrzqt;
        public final Function1<AbstractC44569sUu.Activity, Unit> copydefault;
        public java.lang.String gEmmrt;
        public final Function1<AbstractC44569sUu.Activity, Unit> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.AhwBna = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.sUu$Activity, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.sUu$Activity, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull sWl swl, @NotNull Function1<? super AbstractC44569sUu.Activity, Unit> function1, Function1<? super AbstractC44569sUu.Activity, Unit> function12) {
            super(swl.getRoot());
            Intrinsics.checkNotNullParameter(swl, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = swl;
            this.copydefault = function1;
            this.valueOf = function12;
        }

        /* JADX INFO: renamed from: o.sUq$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ AbstractC44569sUu.Activity EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, TaskDescription taskDescription, AbstractC44569sUu.Activity activity) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.copydefault = taskDescription;
                this.EZpvd = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.copydefault.copydefault.invoke(this.EZpvd);
                }
            }
        }

        public final void KWHzl(@NotNull AbstractC44569sUu.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl = activity;
            this.AEQbTJ.isConnected.setText(activity.KWHzl());
            this.AEQbTJ.fetchVPNInfo.setText(C44544sTw.OLrzqt.copydefault(activity.gEmmrt(), true));
            C44571sUw c44571sUwAhwBna = activity.AhwBna();
            if (c44571sUwAhwBna != null) {
                AEQbTJ(c44571sUwAhwBna);
            } else {
                this.AEQbTJ.valueOf.setVisibility(8);
                this.AEQbTJ.AYXKKw.setVisibility(8);
            }
            if (this.AhwBna) {
                EZpvd(activity.EZpvd());
            } else {
                OLrzqt(activity);
            }
            ConstraintLayout root = this.AEQbTJ.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, this, activity));
        }

        public final void AEQbTJ(C44571sUw c44571sUw) {
            android.content.Context context = this.AEQbTJ.getRoot().getContext();
            java.lang.String strEZpvd = c44571sUw.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = c44571sUw.copydefault();
            }
            if (Intrinsics.EZpvd(c44571sUw.djBIcL(), java.lang.Boolean.TRUE)) {
                this.AEQbTJ.valueOf.setVisibility(0);
                this.AEQbTJ.AYXKKw.setVisibility(8);
                if (strEZpvd != null) {
                    Glide.AEQbTJ(context).EZpvd(strEZpvd).EZpvd(this.AEQbTJ.AhwBna);
                }
                this.AEQbTJ.DbNXlk.setText(c44571sUw.KWHzl());
                this.AEQbTJ.values.setText(c44571sUw.AEQbTJ());
                android.widget.TextView textView = this.AEQbTJ.values;
                Intrinsics.copydefault(context);
                textView.setTextColor(EZpvd(context, c44571sUw.AEQbTJ()));
                return;
            }
            this.AEQbTJ.AYXKKw.setVisibility(8);
        }

        public final int EZpvd(android.content.Context context, java.lang.String str) {
            return C59449zhJ.startsWith$default(str, Marker.ANY_NON_NULL_MARKER, false, 2, null) ? C33508mxl.copydefault(context) : C59449zhJ.startsWith$default(str, "-", false, 2, null) ? C33508mxl.AEQbTJ(context) : C33508mxl.copydefault(context);
        }

        public final void OLrzqt(@NotNull java.lang.String str) {
            C44571sUw c44571sUwAhwBna;
            Intrinsics.checkNotNullParameter(str, "");
            AbstractC44569sUu.Activity activity = this.KWHzl;
            if (activity == null || (c44571sUwAhwBna = activity.AhwBna()) == null || !Intrinsics.EZpvd(c44571sUwAhwBna.djBIcL(), java.lang.Boolean.TRUE)) {
                return;
            }
            android.content.Context context = this.AEQbTJ.getRoot().getContext();
            this.AEQbTJ.values.setText(str);
            android.widget.TextView textView = this.AEQbTJ.values;
            Intrinsics.copydefault(context);
            textView.setTextColor(EZpvd(context, str));
        }

        public final void valueOf() {
            ILivePlayer iLivePlayer = this.OLrzqt;
            this.AYXKKw = iLivePlayer != null && iLivePlayer.AEQbTJ();
            this.EZpvd = true;
            ILivePlayer iLivePlayer2 = this.OLrzqt;
            if (iLivePlayer2 != null) {
                iLivePlayer2.AhwBna();
            }
        }

        public final void AhwBna() {
            AbstractC44569sUu.Activity activity = this.KWHzl;
            EZpvd(activity != null ? activity.EZpvd() : null);
            this.AEQbTJ.AEQbTJ.setVisibility(0);
        }

        public final void AEQbTJ() {
            this.AEQbTJ.AEQbTJ.setVisibility(8);
        }

        public final void copydefault() {
            ILivePlayer iLivePlayer = this.OLrzqt;
            if (iLivePlayer == null || iLivePlayer == null) {
                return;
            }
            iLivePlayer.AYXKKw();
        }

        public final void EZpvd() {
            AbstractC44569sUu.Activity activity = this.KWHzl;
            if (activity != null) {
                KWHzl();
                OLrzqt(activity);
            }
        }

        public final void OLrzqt(AbstractC44569sUu.Activity activity) {
            java.lang.String strAEQbTJ = activity.AEQbTJ();
            if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                EZpvd(activity.EZpvd());
                return;
            }
            if (this.OLrzqt != null && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) strAEQbTJ)) {
                ILivePlayer iLivePlayer = this.OLrzqt;
                if (iLivePlayer != null) {
                    iLivePlayer.AYXKKw();
                    return;
                }
                return;
            }
            KWHzl();
            this.gEmmrt = strAEQbTJ;
            android.content.Context context = this.AEQbTJ.getRoot().getContext();
            Intrinsics.copydefault(context);
            C44578sVf c44578sVf = new C44578sVf(context);
            c44578sVf.copydefault(new Activity());
            this.AEQbTJ.copydefault.removeAllViews();
            this.AEQbTJ.copydefault.addView(c44578sVf.EZpvd());
            c44578sVf.OLrzqt(0.0f);
            c44578sVf.OLrzqt(strAEQbTJ);
            c44578sVf.AYXKKw();
            this.OLrzqt = c44578sVf;
        }

        /* JADX INFO: renamed from: o.sUq$TaskDescription$Activity */
        public static final class Activity implements ILivePlayer.Activity {

            /* JADX INFO: renamed from: o.sUq$TaskDescription$Activity$Application */
            public final /* synthetic */ class Application {
                public static final /* synthetic */ int[] OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[ILivePlayer.PlayerState.values().length];
                    try {
                        iArr[ILivePlayer.PlayerState.PREPARING.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ILivePlayer.PlayerState.ERROR.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ILivePlayer.PlayerState.PLAYING.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ILivePlayer.PlayerState.IDLE.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ILivePlayer.PlayerState.COMPLETED.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ILivePlayer.PlayerState.PAUSED.ordinal()] = 6;
                    } catch (java.lang.NoSuchFieldError unused6) {
                    }
                    OLrzqt = iArr;
                }
            }

            @Override // com.okinc.oklive.app.ui.player.ILivePlayer.Activity
            public void EZpvd() {
            }

            @Override // com.okinc.oklive.app.ui.player.ILivePlayer.Activity
            public void OLrzqt(int i, int i2) {
            }

            public Activity() {
            }

            @Override // com.okinc.oklive.app.ui.player.ILivePlayer.Activity
            public void OLrzqt(ILivePlayer.PlayerState playerState) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(playerState, "");
                switch (Application.OLrzqt[playerState.ordinal()]) {
                    case 1:
                        TaskDescription taskDescription = TaskDescription.this;
                        AbstractC44569sUu.Activity activity = taskDescription.KWHzl;
                        taskDescription.EZpvd(activity != null ? activity.EZpvd() : null);
                        TaskDescription.this.AEQbTJ.OLrzqt.setVisibility(0);
                        TaskDescription.this.AEQbTJ.AEQbTJ.setVisibility(0);
                        TaskDescription.this.AEQbTJ.KWHzl.setVisibility(0);
                        return;
                    case 2:
                        TaskDescription.this.AEQbTJ.KWHzl.setVisibility(8);
                        TaskDescription taskDescription2 = TaskDescription.this;
                        AbstractC44569sUu.Activity activity2 = taskDescription2.KWHzl;
                        taskDescription2.EZpvd(activity2 != null ? activity2.EZpvd() : null);
                        return;
                    case 3:
                        android.view.View[] viewArr = new android.view.View[3];
                        viewArr[0] = TaskDescription.this.AEQbTJ.OLrzqt;
                        viewArr[1] = TaskDescription.this.AEQbTJ.KWHzl;
                        android.view.View view = TaskDescription.this.AEQbTJ.AEQbTJ;
                        viewArr[2] = view.getVisibility() == 0 ? view : null;
                        for (final android.view.View view2 : yDY.valueOf(viewArr)) {
                            view2.animate().alpha(0.0f).setDuration(300L).withEndAction(new java.lang.Runnable() { // from class: o.sUv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C44565sUq.TaskDescription.Activity.AEQbTJ(view2);
                                }
                            }).start();
                        }
                        TaskDescription.this.AYXKKw = true;
                        TaskDescription.this.EZpvd = false;
                        return;
                    case 4:
                        if (TaskDescription.this.AEQbTJ.OLrzqt.getVisibility() != 0) {
                            TaskDescription taskDescription3 = TaskDescription.this;
                            AbstractC44569sUu.Activity activity3 = taskDescription3.KWHzl;
                            taskDescription3.EZpvd(activity3 != null ? activity3.EZpvd() : null);
                        }
                        if (TaskDescription.this.AEQbTJ.KWHzl.getVisibility() != 0) {
                            TaskDescription.this.AEQbTJ.KWHzl.setVisibility(0);
                        }
                        if (!TaskDescription.this.EZpvd) {
                            TaskDescription.this.AYXKKw = false;
                        }
                        TaskDescription.this.EZpvd = false;
                        return;
                    case 5:
                        TaskDescription taskDescription4 = TaskDescription.this;
                        AbstractC44569sUu.Activity activity4 = taskDescription4.KWHzl;
                        taskDescription4.EZpvd(activity4 != null ? activity4.EZpvd() : null);
                        AbstractC44569sUu.Activity activity5 = TaskDescription.this.KWHzl;
                        if (activity5 == null || (function1 = TaskDescription.this.valueOf) == null) {
                            return;
                        }
                        function1.invoke(activity5);
                        return;
                    case 6:
                        TaskDescription taskDescription5 = TaskDescription.this;
                        AbstractC44569sUu.Activity activity6 = taskDescription5.KWHzl;
                        taskDescription5.EZpvd(activity6 != null ? activity6.EZpvd() : null);
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public static final void AEQbTJ(android.view.View view) {
                view.setVisibility(8);
                view.setAlpha(1.0f);
            }

            @Override // com.okinc.oklive.app.ui.player.ILivePlayer.Activity
            public void KWHzl(int i, java.lang.String str) {
                Function1 function1;
                TaskDescription taskDescription = TaskDescription.this;
                AbstractC44569sUu.Activity activity = taskDescription.KWHzl;
                taskDescription.EZpvd(activity != null ? activity.EZpvd() : null);
                AbstractC44569sUu.Activity activity2 = TaskDescription.this.KWHzl;
                if (activity2 == null || (function1 = TaskDescription.this.valueOf) == null) {
                    return;
                }
                function1.invoke(activity2);
            }
        }

        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ.OLrzqt.setVisibility(0);
            android.content.Context context = this.AEQbTJ.OLrzqt.getContext();
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            if (str == null || str.length() == 0) {
                Glide.AEQbTJ(context).AEQbTJ(this.AEQbTJ.OLrzqt);
                this.AEQbTJ.OLrzqt.setImageDrawable(null);
            } else {
                Intrinsics.copydefault(Glide.AEQbTJ(context).EZpvd(str).fetchVPNInfo().AEQbTJ(this.AEQbTJ.OLrzqt.getDrawable()).EZpvd(this.AEQbTJ.OLrzqt));
            }
        }

        public final void OLrzqt() {
            android.content.Context context = this.AEQbTJ.OLrzqt.getContext();
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            Glide.AEQbTJ(context).AEQbTJ(this.AEQbTJ.OLrzqt);
            this.AEQbTJ.OLrzqt.setImageDrawable(null);
        }

        public final void KWHzl() {
            ILivePlayer iLivePlayer = this.OLrzqt;
            if (iLivePlayer != null) {
                iLivePlayer.valueOf();
            }
            ILivePlayer iLivePlayer2 = this.OLrzqt;
            if (iLivePlayer2 != null) {
                iLivePlayer2.djBIcL();
            }
            this.OLrzqt = null;
            this.AYXKKw = false;
            this.EZpvd = false;
            this.gEmmrt = null;
            this.AEQbTJ.copydefault.removeAllViews();
            this.AEQbTJ.KWHzl.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.sUq$FragmentManager */
    public static final class FragmentManager extends RecyclerView.ViewHolder {
        public final sWo AEQbTJ;
        public final Function1<AbstractC44569sUu.ActionBar, Unit> KWHzl;

        /* JADX INFO: renamed from: o.sUq$FragmentManager$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ FragmentManager KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ AbstractC44569sUu.ActionBar copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, FragmentManager fragmentManager, AbstractC44569sUu.ActionBar actionBar) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.KWHzl = fragmentManager;
                this.copydefault = actionBar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.KWHzl.KWHzl.invoke(this.copydefault);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.sUu$ActionBar, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(@NotNull sWo swo, @NotNull Function1<? super AbstractC44569sUu.ActionBar, Unit> function1) {
            super(swo.getRoot());
            Intrinsics.checkNotNullParameter(swo, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = swo;
            this.KWHzl = function1;
        }

        public final void AEQbTJ(@NotNull AbstractC44569sUu.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.AEQbTJ.OLrzqt.setText(actionBar.AEQbTJ());
            this.AEQbTJ.KWHzl.setText(actionBar.OLrzqt() + " • " + actionBar.AhwBna());
            android.content.Context context = this.AEQbTJ.copydefault.getContext();
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            java.lang.String strKWHzl = actionBar.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                Glide.AEQbTJ(context).AEQbTJ(this.AEQbTJ.copydefault);
                this.AEQbTJ.copydefault.setImageDrawable(null);
            } else {
                Intrinsics.copydefault(Glide.AEQbTJ(context).EZpvd(actionBar.KWHzl()).fetchVPNInfo().AEQbTJ(this.AEQbTJ.copydefault.getDrawable()).EZpvd(this.AEQbTJ.copydefault));
            }
            ConstraintLayout root = this.AEQbTJ.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, this, actionBar));
        }

        public final void KWHzl() {
            android.content.Context context = this.AEQbTJ.copydefault.getContext();
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            Glide.AEQbTJ(context).AEQbTJ(this.AEQbTJ.copydefault);
            this.AEQbTJ.copydefault.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: o.sUq$LoaderManager */
    public static final class LoaderManager extends RecyclerView.ViewHolder {
        public final sWm KWHzl;

        public final void OLrzqt() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull sWm swm) {
            super(swm.getRoot());
            Intrinsics.checkNotNullParameter(swm, "");
            this.KWHzl = swm;
        }
    }

    /* JADX INFO: renamed from: o.sUq$PendingIntent */
    public static final class PendingIntent extends RecyclerView.ViewHolder {
        public final sWp KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull sWp swp) {
            super(swp.getRoot());
            Intrinsics.checkNotNullParameter(swp, "");
            this.KWHzl = swp;
        }

        public final void KWHzl(@NotNull AbstractC44569sUu.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            android.content.Context context = this.KWHzl.getRoot().getContext();
            if (stateListAnimator.EZpvd()) {
                C55173xeu c55173xeu = this.KWHzl.KWHzl;
                java.lang.String string = context.getString(sWj.Activity.gEmmrt);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setTitle(string);
                C55173xeu c55173xeu2 = this.KWHzl.KWHzl;
                java.lang.String string2 = context.getString(sWj.Activity.valueOf);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu2.setSubTitle((java.lang.CharSequence) string2);
                return;
            }
            C55173xeu c55173xeu3 = this.KWHzl.KWHzl;
            java.lang.String string3 = context.getString(sWj.Activity.AYXKKw);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu3.setTitle(string3);
            C55173xeu c55173xeu4 = this.KWHzl.KWHzl;
            java.lang.String string4 = context.getString(sWj.Activity.djBIcL);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            c55173xeu4.setSubTitle((java.lang.CharSequence) string4);
        }
    }

    /* JADX INFO: renamed from: o.sUq$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull sWk swk, final Function0<Unit> function0) {
            super(swk.getRoot());
            Intrinsics.checkNotNullParameter(swk, "");
            swk.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.sUs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44565sUq.ActionBar.KWHzl(function0, view);
                }
            });
        }

        public static final void KWHzl(Function0 function0, android.view.View view) {
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.sUq$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull sWn swn) {
            super(swn.getRoot());
            Intrinsics.checkNotNullParameter(swn, "");
        }
    }

    /* JADX INFO: renamed from: o.sUq$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<AbstractC44569sUu> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull AbstractC44569sUu abstractC44569sUu, @NotNull AbstractC44569sUu abstractC44569sUu2) {
            Intrinsics.checkNotNullParameter(abstractC44569sUu, "");
            Intrinsics.checkNotNullParameter(abstractC44569sUu2, "");
            if ((abstractC44569sUu instanceof AbstractC44569sUu.Activity) && (abstractC44569sUu2 instanceof AbstractC44569sUu.Activity)) {
                return Intrinsics.EZpvd((java.lang.Object) ((AbstractC44569sUu.Activity) abstractC44569sUu).copydefault(), (java.lang.Object) ((AbstractC44569sUu.Activity) abstractC44569sUu2).copydefault());
            }
            if (((abstractC44569sUu instanceof AbstractC44569sUu.Dialog) && (abstractC44569sUu2 instanceof AbstractC44569sUu.Dialog)) || (((abstractC44569sUu instanceof AbstractC44569sUu.StateListAnimator) && (abstractC44569sUu2 instanceof AbstractC44569sUu.StateListAnimator)) || (((abstractC44569sUu instanceof AbstractC44569sUu.Application) && (abstractC44569sUu2 instanceof AbstractC44569sUu.Application)) || ((abstractC44569sUu instanceof AbstractC44569sUu.TaskDescription) && (abstractC44569sUu2 instanceof AbstractC44569sUu.TaskDescription))))) {
                return true;
            }
            if ((abstractC44569sUu instanceof AbstractC44569sUu.ActionBar) && (abstractC44569sUu2 instanceof AbstractC44569sUu.ActionBar)) {
                return Intrinsics.EZpvd((java.lang.Object) ((AbstractC44569sUu.ActionBar) abstractC44569sUu).copydefault(), (java.lang.Object) ((AbstractC44569sUu.ActionBar) abstractC44569sUu2).copydefault());
            }
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull AbstractC44569sUu abstractC44569sUu, @NotNull AbstractC44569sUu abstractC44569sUu2) {
            Intrinsics.checkNotNullParameter(abstractC44569sUu, "");
            Intrinsics.checkNotNullParameter(abstractC44569sUu2, "");
            return Intrinsics.EZpvd(abstractC44569sUu, abstractC44569sUu2);
        }
    }
}
