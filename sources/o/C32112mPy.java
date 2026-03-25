package o;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.debugbox.bean.WsArg;
import com.okinc.debugbox.bean.WsMsg;
import com.okinc.debugbox.view.ErrorCatchLayoutManager;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31976mKx;
import o.C32112mPy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mPy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32112mPy extends RecyclerView {
    public final android.os.Handler AEQbTJ;
    public java.util.ArrayList<WsMsg> EZpvd;
    public java.util.ArrayList<WsMsg> KWHzl;
    public final java.lang.String OLrzqt;
    public Application copydefault;
    public Timer djBIcL;

    /* JADX INFO: renamed from: o.mPy$TaskDescription */
    public interface TaskDescription {
        void EZpvd(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllData(@NotNull java.util.ArrayList<WsMsg> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.KWHzl = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterList(@NotNull java.util.ArrayList<WsMsg> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32112mPy(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32112mPy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32112mPy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "FloatHttpRecyclerView";
        this.copydefault = new Application(new java.util.ArrayList());
        this.KWHzl = new java.util.ArrayList<>();
        this.EZpvd = new java.util.ArrayList<>();
        OLrzqt();
        KWHzl();
        this.AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper(), new Dialog());
    }

    /* JADX INFO: renamed from: o.mPy$ActionBar */
    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public static int AEQbTJ;
        public static int OLrzqt;

        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || C32112mPy.this.canScrollVertically(1)) {
                return;
            }
            C32112mPy.this.copydefault.notifyDataSetChanged();
        }

        public static int KWHzl() {
            int i = AEQbTJ;
            int i2 = i % 5953066;
            AEQbTJ = i + 1;
            if (i2 != 0) {
                return OLrzqt;
            }
            int iMyTid = android.os.Process.myTid();
            OLrzqt = iMyTid;
            return iMyTid;
        }
    }

    private final void OLrzqt() {
        addOnScrollListener(new ActionBar());
    }

    private final void KWHzl() {
        setLayoutManager(new ErrorCatchLayoutManager(getContext()));
        setAdapter(this.copydefault);
        this.copydefault.OLrzqt(this.KWHzl);
        this.copydefault.EZpvd(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.mPy$StateListAnimator */
    public static final class StateListAnimator implements TaskDescription {
        public StateListAnimator() {
        }

        @Override // o.C32112mPy.TaskDescription
        public void EZpvd(int i) {
            try {
                WsMsg wsMsgAEQbTJ = C32112mPy.this.copydefault.AEQbTJ(i);
                if (wsMsgAEQbTJ != null) {
                    C32112mPy c32112mPy = C32112mPy.this;
                    android.content.Intent intent = new android.content.Intent(c32112mPy.getContext(), (java.lang.Class<?>) mMH.class);
                    intent.putExtra("info", wsMsgAEQbTJ.getMsgContent());
                    intent.addFlags(268435456);
                    c32112mPy.getContext().startActivity(intent);
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
            }
        }
    }

    /* JADX INFO: renamed from: o.mPy$Application */
    public static final class Application extends RecyclerView.Adapter<Activity> {
        public java.util.ArrayList<WsMsg> EZpvd;
        public TaskDescription OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<WsMsg> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.OLrzqt = taskDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.util.ArrayList<WsMsg> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.EZpvd = arrayList;
        }

        public Application(@NotNull java.util.ArrayList<WsMsg> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.EZpvd = arrayList;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C31976mKx.Application.AwvSrB, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.EZpvd.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, final int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.OLrzqt().setText(this.EZpvd.get(i).getType());
            activity.copydefault().setText(this.EZpvd.get(i).getMsgPath());
            activity.copydefault().setBackgroundResource(C31976mKx.ActionBar.OLrzqt);
            activity.EZpvd().setText(KWHzl(this.EZpvd.get(i).getArg()));
            if (C59449zhJ.equals$default(this.EZpvd.get(i).getType(), "sender", false, 2, null)) {
                activity.OLrzqt().setBackgroundResource(C31976mKx.ActionBar.valueOf);
            } else {
                activity.OLrzqt().setBackgroundResource(C31976mKx.ActionBar.EZpvd);
            }
            activity.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.mPu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C32112mPy.Application.AEQbTJ(this.KWHzl, i, view);
                }
            });
        }

        public static final void AEQbTJ(Application application, int i, android.view.View view) {
            TaskDescription taskDescription = application.OLrzqt;
            if (taskDescription == null || taskDescription == null) {
                return;
            }
            taskDescription.EZpvd(i);
        }

        public final int OLrzqt() {
            return this.EZpvd.size();
        }

        public final WsMsg AEQbTJ(int i) {
            if (this.EZpvd.size() > i) {
                return this.EZpvd.get(i);
            }
            return null;
        }

        public final void EZpvd() {
            this.EZpvd.clear();
            notifyDataSetChanged();
        }

        public final java.lang.String KWHzl(WsArg wsArg) {
            return CollectionsKt___CollectionsKt.joinToString$default(yDY.valueOf(wsArg.getChannel(), wsArg.getInstId(), wsArg.getUly(), wsArg.getInstType(), wsArg.getCcy(), wsArg.getFairPriceId()), ", ", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: renamed from: o.mPy$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public android.view.View AEQbTJ;
        public android.widget.TextView EZpvd;
        public android.widget.TextView OLrzqt;
        public android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = view;
            android.view.View viewFindViewById = view.findViewById(C31976mKx.Activity.DaRZkR);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C31976mKx.Activity.DGgnkA);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C31976mKx.Activity.run);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (android.widget.TextView) viewFindViewById3;
        }
    }

    public final void EZpvd(@NotNull WsMsg wsMsg, @NotNull java.lang.String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(wsMsg, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) wsMsg.getArg().getChannel(), (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                this.EZpvd.add(wsMsg);
            }
            this.KWHzl.add(wsMsg);
            while (this.KWHzl.size() >= 200) {
                this.KWHzl.remove(0);
            }
            while (this.EZpvd.size() >= 200) {
                this.EZpvd.remove(0);
            }
            copydefault();
        }
    }

    /* JADX INFO: renamed from: o.mPy$FragmentManager */
    public static final class FragmentManager extends TimerTask {
        public FragmentManager() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C32112mPy.this.AEQbTJ.sendEmptyMessage(4);
        }
    }

    public final void copydefault() {
        if (this.djBIcL == null) {
            Timer timer = new Timer();
            this.djBIcL = timer;
            timer.schedule(new FragmentManager(), 1000L, 1000L);
        }
    }

    /* JADX INFO: renamed from: o.mPy$Dialog */
    public static final class Dialog implements Handler.Callback {
        public Dialog() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            if (message.what != 4) {
                return false;
            }
            C32112mPy.this.copydefault.notifyDataSetChanged();
            if (C32112mPy.this.canScrollVertically(1)) {
                return true;
            }
            C32112mPy c32112mPy = C32112mPy.this;
            c32112mPy.smoothScrollToPosition(c32112mPy.copydefault.OLrzqt());
            return true;
        }
    }

    public final void AEQbTJ() {
        this.copydefault.EZpvd();
        Timer timer = this.djBIcL;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            this.djBIcL = null;
        }
    }

    public final void setFilterText(@NotNull java.lang.String str) {
        java.util.ArrayList<WsMsg> arrayList;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                this.EZpvd.clear();
                for (WsMsg wsMsg : this.copydefault.AEQbTJ()) {
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) wsMsg.getArg().getChannel(), (java.lang.CharSequence) str, false, 2, (java.lang.Object) null) && (arrayList = this.EZpvd) != null) {
                        arrayList.add(wsMsg);
                    }
                }
                this.copydefault.OLrzqt(this.EZpvd);
            } else {
                this.copydefault.OLrzqt(this.KWHzl);
            }
            this.AEQbTJ.sendEmptyMessage(4);
        }
    }
}
