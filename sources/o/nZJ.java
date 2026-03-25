package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okimcore.model.remote.PublicGroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nZJ extends RecyclerView.Adapter<StateListAnimator> {
    public final Function1<PublicGroupInfo, Unit> AEQbTJ;
    public java.util.List<PublicGroupInfo> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.remote.PublicGroupInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public nZJ(@NotNull Function1<? super PublicGroupInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        this.OLrzqt = yDY.AhwBna();
    }

    public final void EZpvd(@NotNull java.util.List<PublicGroupInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNG nngAEQbTJ = nNG.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nngAEQbTJ, "");
        return new StateListAnimator(this, nngAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(this.OLrzqt.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ nZJ AEQbTJ;
        public final nNG EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull nZJ nzj, nNG nng) {
            super(nng.getRoot());
            Intrinsics.checkNotNullParameter(nng, "");
            this.AEQbTJ = nzj;
            this.EZpvd = nng;
        }

        public final void copydefault(@NotNull PublicGroupInfo publicGroupInfo) {
            Intrinsics.checkNotNullParameter(publicGroupInfo, "");
            nNG nng = this.EZpvd;
            nZJ nzj = this.AEQbTJ;
            C35893oHp c35893oHp = nng.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.loadGroupAvatar$default(c35893oHp, C33129mqd.gEmmrt(publicGroupInfo.getGroupAvatar()), null, 2, null);
            nng.KWHzl.setText(publicGroupInfo.getGroupName());
            android.widget.ImageView imageView = nng.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.Boolean boolIsOfficialGroup = publicGroupInfo.isOfficialGroup();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            imageView.setVisibility(Intrinsics.EZpvd(boolIsOfficialGroup, bool) ? 0 : 8);
            nng.copydefault.setText(publicGroupInfo.getGroupDescription());
            android.widget.ImageView imageView2 = nng.djBIcL;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(Intrinsics.EZpvd(publicGroupInfo.isPaidGroup(), bool) ? 0 : 8);
            nng.EZpvd.setText(C33129mqd.gEmmrt(publicGroupInfo.getMemberCount()));
            ConstraintLayout root = nng.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, nzj, publicGroupInfo));
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ PublicGroupInfo EZpvd;
            public final /* synthetic */ nZJ KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, nZJ nzj, PublicGroupInfo publicGroupInfo) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = nzj;
                this.EZpvd = publicGroupInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.KWHzl.AEQbTJ.invoke(this.EZpvd);
                }
            }
        }
    }
}
