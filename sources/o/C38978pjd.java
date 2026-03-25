package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.oZZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38978pjd extends AbstractC59533zio<C38918piW, C38977pjc> {
    public final android.content.Context AEQbTJ;

    public C38978pjd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C38977pjc onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.iHkeWl, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C38977pjc(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C38977pjc c38977pjc, @NotNull C38918piW c38918piW) {
        Intrinsics.checkNotNullParameter(c38977pjc, "");
        Intrinsics.checkNotNullParameter(c38918piW, "");
        c38977pjc.copydefault().removeAllViews();
        for (C38920piY c38920piY : c38918piW.copydefault()) {
            if (c38920piY.copydefault() != 0) {
                C39817pzW c39817pzW = new C39817pzW(this.AEQbTJ, null, 0, 6, null);
                c39817pzW.setResourceText(c38920piY.AEQbTJ());
                c39817pzW.setResourceImage(c38920piY.copydefault());
                c39817pzW.setOnClickListener(new StateListAnimator(c39817pzW, 1000L, c38977pjc, c38920piY));
                c38977pjc.copydefault().addView(c39817pzW);
            }
        }
    }

    /* JADX INFO: renamed from: o.pjd$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C38977pjc AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C38920piY OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C38977pjc c38977pjc, C38920piY c38920piY) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c38977pjc;
            this.OLrzqt = c38920piY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                oZZ.StateListAnimator stateListAnimator = oZZ.Companion;
                android.content.Context context = this.AEQbTJ.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                stateListAnimator.KWHzl(context, this.OLrzqt.EZpvd());
            }
        }
    }
}
