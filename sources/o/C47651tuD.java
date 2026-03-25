package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_content.leaderboard.adapter.PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import com.okinc.planet.utils.IMUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C47651tuD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47651tuD extends RecyclerView.Adapter<StateListAnimator> {
    public Application AEQbTJ;
    public final java.util.List<TopOrbiter> KWHzl = new java.util.ArrayList();
    public int OLrzqt = 5;

    /* JADX INFO: renamed from: o.tuD$Application */
    public interface Application {
        void OLrzqt(@NotNull C52794wYp c52794wYp, @NotNull java.lang.String str, @NotNull TopOrbiter topOrbiter, @NotNull TaskDescription taskDescription);
    }

    /* JADX INFO: renamed from: o.tuD$TaskDescription */
    public interface TaskDescription {
        void copydefault(java.lang.Long l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Application application) {
        this.AEQbTJ = application;
    }

    public final void OLrzqt(int i) {
        int iCopydefault = C56548yJl.copydefault(i, 0);
        if (this.OLrzqt == iCopydefault) {
            return;
        }
        int iMin = java.lang.Math.min(this.KWHzl.size(), this.OLrzqt);
        int iMin2 = java.lang.Math.min(this.KWHzl.size(), iCopydefault);
        this.OLrzqt = iCopydefault;
        if (iMin2 < iMin) {
            notifyItemRangeRemoved(iMin2, iMin - iMin2);
            if (iMin2 > 0) {
                notifyItemRangeChanged(0, iMin2);
                return;
            }
            return;
        }
        if (iMin2 > iMin) {
            notifyItemRangeInserted(iMin, iMin2 - iMin);
            if (iMin > 0) {
                notifyItemRangeChanged(0, iMin);
            }
        }
    }

    public final void OLrzqt(@NotNull java.util.List<TopOrbiter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.ixgjPv, viewGroup, false);
        if (viewInflate.getLayoutParams() != null) {
            android.content.res.Resources resources = viewGroup.getContext().getResources();
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            Intrinsics.copydefault(layoutParams);
            layoutParams.width = getItemCount() == 1 ? -1 : resources.getDimensionPixelSize(C47501trL.StateListAnimator.OLrzqt);
        }
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.AEQbTJ(this.KWHzl.get(i), this.AEQbTJ);
        if (stateListAnimator.itemView.getLayoutParams() != null) {
            android.content.res.Resources resources = stateListAnimator.itemView.getContext().getResources();
            ViewGroup.LayoutParams layoutParams = stateListAnimator.itemView.getLayoutParams();
            Intrinsics.copydefault(layoutParams);
            layoutParams.width = getItemCount() == 1 ? -1 : resources.getDimensionPixelSize(C47501trL.StateListAnimator.OLrzqt);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return java.lang.Math.min(this.KWHzl.size(), this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.tuD$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C52794wYp AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final C55251xgS KWHzl;
        public final tUQ OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.TextView djBIcL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.ggKfIT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (tUQ) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.invokespecialgBtXYZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C47501trL.TaskDescription.HJWChPURsaBn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C47501trL.TaskDescription.iWlNch);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.KWHzl = (C55251xgS) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C47501trL.TaskDescription.gFTCsA);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.copydefault = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C47501trL.TaskDescription.QUSxYX);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.AEQbTJ = (C52794wYp) viewFindViewById6;
        }

        public final void AEQbTJ(@NotNull final TopOrbiter topOrbiter, final Application application) {
            Intrinsics.checkNotNullParameter(topOrbiter, "");
            if (Intrinsics.EZpvd((java.lang.Object) topOrbiter.getOfficialStatus(), (java.lang.Object) "1")) {
                this.EZpvd.setVisibility(0);
            } else {
                this.EZpvd.setVisibility(8);
            }
            if (Intrinsics.EZpvd((java.lang.Object) topOrbiter.getLiveStatus(), (java.lang.Object) "1") && IMUtils.KWHzl.KWHzl()) {
                this.OLrzqt.setLiveState(true);
                this.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.tuG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C47651tuD.StateListAnimator.copydefault(this.KWHzl, topOrbiter, view);
                    }
                });
            } else {
                this.OLrzqt.setLiveState(false);
            }
            tUQ tuq = this.OLrzqt;
            java.lang.String portrait = topOrbiter.getPortrait();
            tuq.KWHzl(portrait != null ? portrait : "");
            this.djBIcL.setText(topOrbiter.getNickName());
            this.djBIcL.requestLayout();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) topOrbiter.getBio())) {
                this.copydefault.setVisibility(0);
                this.copydefault.setText(topOrbiter.getBio());
            } else {
                this.copydefault.setVisibility(8);
            }
            if (Intrinsics.EZpvd((java.lang.Object) topOrbiter.getFollowStatus(), (java.lang.Object) "1")) {
                topOrbiter.setHasFollowedThisUser(true);
                this.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.Hx));
            } else {
                topOrbiter.setHasFollowedThisUser(false);
                this.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKfNUfqk));
            }
            this.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tuI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C47651tuD.StateListAnimator.AEQbTJ(application, this, topOrbiter, view);
                }
            });
            android.view.View view = this.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, this, topOrbiter));
        }

        public static final void copydefault(StateListAnimator stateListAnimator, TopOrbiter topOrbiter, android.view.View view) {
            LifecycleCoroutineScope lifecycleScope;
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(stateListAnimator.OLrzqt);
            if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                return;
            }
            C46374tRz.safeLaunch$default(lifecycleScope, null, null, new PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1(stateListAnimator, topOrbiter, null), 3, null);
        }

        public static final void AEQbTJ(Application application, StateListAnimator stateListAnimator, TopOrbiter topOrbiter, android.view.View view) {
            if (application != null) {
                C52794wYp c52794wYp = stateListAnimator.AEQbTJ;
                java.lang.String authorId = topOrbiter.getAuthorId();
                if (authorId == null) {
                    authorId = "";
                }
                application.OLrzqt(c52794wYp, authorId, topOrbiter, new ActionBar(topOrbiter));
            }
        }

        /* JADX INFO: renamed from: o.tuD$StateListAnimator$ActionBar */
        public static final class ActionBar implements TaskDescription {
            public final /* synthetic */ TopOrbiter OLrzqt;

            public ActionBar(TopOrbiter topOrbiter) {
                this.OLrzqt = topOrbiter;
            }

            @Override // o.C47651tuD.TaskDescription
            public void copydefault(java.lang.Long l) {
                this.OLrzqt.setFollowerCount(l);
            }
        }

        /* JADX INFO: renamed from: o.tuD$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ TopOrbiter KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, StateListAnimator stateListAnimator, TopOrbiter topOrbiter) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.copydefault = stateListAnimator;
                this.KWHzl = topOrbiter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Orbit_Page_Toporbiterprofile_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    C46447tUr c46447tUr = C46447tUr.KWHzl;
                    android.content.Context context = this.copydefault.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    java.lang.String authorId = this.KWHzl.getAuthorId();
                    C46447tUr.openPlanetUserProfilePage$default(c46447tUr, context, "", authorId == null ? "" : authorId, "", "", "", C56423yEv.EZpvd(C56390yDp.OLrzqt("isOrbiter", "1")), null, 128, null);
                }
            }
        }
    }
}
