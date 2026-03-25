package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C45892tAc;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45892tAc extends androidx.recyclerview.widget.ListAdapter<TopOrbiter, ActionBar> {
    public java.util.Set<java.lang.String> EZpvd;
    public final Function1<java.lang.String, Unit> copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final Activity AEQbTJ = new Activity();

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C45892tAc(@NotNull Function1<? super java.lang.String, Unit> function1) {
        super(AEQbTJ);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.EZpvd = yEE.copydefault();
    }

    public final void KWHzl(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.EZpvd = set;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        tMQ tmqAEQbTJ = tMQ.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(tmqAEQbTJ, "");
        return new ActionBar(tmqAEQbTJ, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        TopOrbiter item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        actionBar.OLrzqt(item, this.EZpvd);
    }

    /* JADX INFO: renamed from: o.tAc$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final tMQ KWHzl;
        public final Function1<java.lang.String, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull tMQ tmq, @NotNull Function1<? super java.lang.String, Unit> function1) {
            super(tmq.getRoot());
            Intrinsics.checkNotNullParameter(tmq, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = tmq;
            this.OLrzqt = function1;
        }

        public final void OLrzqt(@NotNull TopOrbiter topOrbiter, @NotNull java.util.Set<java.lang.String> set) {
            Intrinsics.checkNotNullParameter(topOrbiter, "");
            Intrinsics.checkNotNullParameter(set, "");
            boolean z = false;
            if (Intrinsics.EZpvd((java.lang.Object) topOrbiter.getOfficialStatus(), (java.lang.Object) "1")) {
                this.KWHzl.OLrzqt.setVisibility(0);
            } else {
                this.KWHzl.OLrzqt.setVisibility(8);
            }
            final java.lang.String authorId = topOrbiter.getAuthorId();
            if (authorId == null) {
                authorId = "";
            }
            android.widget.ImageView imageView = this.KWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.String portrait = topOrbiter.getPortrait();
            C33054mpH.loadAvatar$default(imageView, portrait == null ? "" : portrait, null, null, 6, null);
            this.KWHzl.gEmmrt.setText(topOrbiter.getNickName());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) topOrbiter.getBio())) {
                this.KWHzl.AYXKKw.setVisibility(0);
                this.KWHzl.AYXKKw.setText(topOrbiter.getBio());
            } else {
                this.KWHzl.AYXKKw.setVisibility(8);
            }
            if (C46437tUh.OLrzqt.AhwBna()) {
                this.KWHzl.valueOf.setVisibility(0);
                this.KWHzl.valueOf.setText(OLrzqt(topOrbiter.getFollowerCount()));
            } else {
                this.KWHzl.valueOf.setVisibility(8);
            }
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) authorId)) && set.contains(authorId)) {
                z = true;
            }
            this.KWHzl.AEQbTJ.setChecked(z);
            this.KWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.tAi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45892tAc.ActionBar.EZpvd(authorId, this, view);
                }
            });
        }

        public static final void EZpvd(java.lang.String str, ActionBar actionBar, android.view.View view) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                actionBar.OLrzqt.invoke(str);
            }
        }

        public final java.lang.String OLrzqt(java.lang.Long l) {
            long jLongValue = l != null ? l.longValue() : 0L;
            if (jLongValue >= 1000) {
                long j = jLongValue / 1000;
                return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C47501trL.LoaderManager.copydefault, C33129mqd.AhwBna(java.lang.Long.valueOf(jLongValue)), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", j + "K")));
            }
            return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C47501trL.LoaderManager.copydefault, C33129mqd.AhwBna(java.lang.Long.valueOf(jLongValue)), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(jLongValue))));
        }
    }

    /* JADX INFO: renamed from: o.tAc$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.tAc$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<TopOrbiter> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(TopOrbiter topOrbiter, TopOrbiter topOrbiter2) {
            Intrinsics.checkNotNullParameter(topOrbiter, "");
            Intrinsics.checkNotNullParameter(topOrbiter2, "");
            return Intrinsics.EZpvd((java.lang.Object) topOrbiter.getAuthorId(), (java.lang.Object) topOrbiter2.getAuthorId());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(TopOrbiter topOrbiter, TopOrbiter topOrbiter2) {
            Intrinsics.checkNotNullParameter(topOrbiter, "");
            Intrinsics.checkNotNullParameter(topOrbiter2, "");
            return Intrinsics.EZpvd(topOrbiter, topOrbiter2);
        }
    }
}
