package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C44637sag;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44637sag extends RecyclerView.Adapter<StateListAnimator> {
    public final Function1<NotificationCategoryBean, Unit> KWHzl;
    public final java.util.List<C44646sap> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C44637sag(@NotNull Function1<? super NotificationCategoryBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        this.OLrzqt = new java.util.ArrayList();
    }

    public final void EZpvd(@NotNull java.util.List<C44646sap> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(rXV.StateListAnimator.values, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.EZpvd(this.OLrzqt.get(i), this.KWHzl);
    }

    /* JADX INFO: renamed from: o.sag$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C54989xbV EZpvd;
        public final /* synthetic */ C44637sag OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C44637sag c44637sag, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c44637sag;
            android.view.View viewFindViewById = view.findViewById(rXV.ActionBar.iwGUEr);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (C54989xbV) viewFindViewById;
        }

        public final void EZpvd(@NotNull final C44646sap c44646sap, @NotNull final Function1<? super NotificationCategoryBean, Unit> function1) {
            java.lang.String lowerCase;
            Intrinsics.checkNotNullParameter(c44646sap, "");
            Intrinsics.checkNotNullParameter(function1, "");
            android.widget.TextView textViewEZpvd = this.EZpvd.EZpvd();
            java.lang.String localizedMessage = c44646sap.KWHzl().getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            textViewEZpvd.setText(localizedMessage);
            this.EZpvd.setSelected(c44646sap.EZpvd());
            this.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.saj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44637sag.StateListAnimator.copydefault(this.AEQbTJ, function1, c44646sap, view);
                }
            });
            C54989xbV c54989xbV = this.EZpvd;
            java.lang.String id = c44646sap.KWHzl().getId();
            if (id != null) {
                lowerCase = id.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            c54989xbV.setContentDescription("mc_category_" + lowerCase);
        }

        public static final void copydefault(StateListAnimator stateListAnimator, Function1 function1, C44646sap c44646sap, android.view.View view) {
            stateListAnimator.EZpvd.setSelected(true);
            function1.invoke(c44646sap.KWHzl());
        }
    }
}
