package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingUser;
import com.okinc.planet.utils.IMUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47699tuz extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public boolean AYXKKw;
    public ActionBar KWHzl;
    public Activity copydefault;
    public boolean djBIcL;
    public final java.util.List<FollowingUser> EZpvd = new java.util.ArrayList();
    public int AEQbTJ = 10;

    /* JADX INFO: renamed from: o.tuz$ActionBar */
    public interface ActionBar {
        void KWHzl(@NotNull FollowingUser followingUser, boolean z);
    }

    /* JADX INFO: renamed from: o.tuz$Activity */
    public interface Activity {
        void EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Activity activity) {
        this.copydefault = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX INFO: renamed from: o.tuz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tuz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(int i) {
        int iCopydefault = C56548yJl.copydefault(i, 0);
        if (this.AEQbTJ == iCopydefault) {
            return;
        }
        this.AEQbTJ = iCopydefault;
        if (this.AYXKKw) {
            return;
        }
        notifyDataSetChanged();
    }

    public final void EZpvd(boolean z) {
        if (this.djBIcL != z) {
            this.djBIcL = z;
            if (this.AYXKKw) {
                return;
            }
            notifyDataSetChanged();
        }
    }

    public final void OLrzqt(int i, boolean z) {
        int iCopydefault = C56548yJl.copydefault(i, 0);
        if (this.AEQbTJ == iCopydefault && this.djBIcL == z) {
            return;
        }
        this.AYXKKw = true;
        try {
            copydefault(iCopydefault);
            EZpvd(z);
        } finally {
            this.AYXKKw = false;
            notifyDataSetChanged();
        }
    }

    public final void KWHzl(@NotNull java.util.List<FollowingUser> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        notifyDataSetChanged();
    }

    public final java.util.List<FollowingUser> EZpvd() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (this.djBIcL && i == java.lang.Math.min(this.EZpvd.size(), this.AEQbTJ)) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 1) {
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.OxVOHk, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new TaskDescription(viewInflate);
        }
        android.view.View viewInflate2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.QSLkRj, viewGroup, false);
        Intrinsics.copydefault(viewInflate2);
        return new StateListAnimator(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof StateListAnimator) {
            ((StateListAnimator) viewHolder).EZpvd(this.EZpvd.get(i), this.KWHzl);
        } else if (viewHolder instanceof TaskDescription) {
            ((TaskDescription) viewHolder).copydefault(this.copydefault);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int iMin = java.lang.Math.min(this.EZpvd.size(), this.AEQbTJ);
        return this.djBIcL ? iMin + 1 : iMin;
    }

    /* JADX INFO: renamed from: o.tuz$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final tUQ AEQbTJ;
        public final android.widget.TextView OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.ggKfIT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (tUQ) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.HJWChPRGtXKCDKRTZD);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById2;
        }

        public final void EZpvd(@NotNull FollowingUser followingUser, ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(followingUser, "");
            tUQ tuq = this.AEQbTJ;
            java.lang.String portrait = followingUser.getPortrait();
            if (portrait == null) {
                portrait = "";
            }
            tuq.KWHzl(portrait);
            android.widget.TextView textView = this.OLrzqt;
            java.lang.String nickName = followingUser.getNickName();
            textView.setText(nickName != null ? nickName : "");
            boolean z = false;
            boolean z2 = Intrinsics.EZpvd((java.lang.Object) followingUser.getLiveStatus(), (java.lang.Object) "1") && IMUtils.KWHzl.KWHzl();
            java.lang.Integer unread = followingUser.getUnread();
            if (unread != null && unread.intValue() == 1) {
                z = true;
            }
            if (z2) {
                this.AEQbTJ.setLiveState(true);
            } else {
                this.AEQbTJ.EZpvd(z);
            }
            android.view.View view = this.itemView;
            view.setOnClickListener(new ActionBar(view, 1000L, actionBar, followingUser, z2));
        }

        /* JADX INFO: renamed from: o.tuz$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ boolean EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ FollowingUser OLrzqt;
            public final /* synthetic */ ActionBar copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, ActionBar actionBar, FollowingUser followingUser, boolean z) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.copydefault = actionBar;
                this.OLrzqt = followingUser;
                this.EZpvd = z;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    ActionBar actionBar = this.copydefault;
                    if (actionBar != null) {
                        actionBar.KWHzl(this.OLrzqt, this.EZpvd);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tuz$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: o.tuz$TaskDescription$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ Activity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Activity activity) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Activity activity = this.copydefault;
                    if (activity != null) {
                        activity.EZpvd();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }

        public final void copydefault(Activity activity) {
            android.view.View view = this.itemView;
            view.setOnClickListener(new Application(view, 1000L, activity));
        }
    }
}
