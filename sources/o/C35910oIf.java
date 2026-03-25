package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.widgets.bottomsheet.model.ReactionUser;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C35910oIf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35910oIf extends androidx.recyclerview.widget.ListAdapter<ReactionUser, Activity> {
    public final Function1<java.lang.String, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35910oIf(@NotNull Function1<? super java.lang.String, Unit> function1) {
        super(new Application());
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNI nniOLrzqt = nNI.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nniOLrzqt, "");
        return new Activity(nniOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        ReactionUser item = getItem(i);
        Intrinsics.copydefault(item);
        activity.OLrzqt(item, new Function1() { // from class: o.oIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35910oIf.copydefault(this.AEQbTJ, (ReactionUser) obj);
            }
        });
    }

    public static final Unit copydefault(C35910oIf c35910oIf, ReactionUser reactionUser) {
        Intrinsics.checkNotNullParameter(reactionUser, "");
        c35910oIf.OLrzqt.invoke(reactionUser.EZpvd());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.oIf$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final nNI AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull nNI nni) {
            super(nni.getRoot());
            Intrinsics.checkNotNullParameter(nni, "");
            this.AEQbTJ = nni;
        }

        public final void OLrzqt(@NotNull final ReactionUser reactionUser, @NotNull final Function1<? super ReactionUser, Unit> function1) {
            Intrinsics.checkNotNullParameter(reactionUser, "");
            Intrinsics.checkNotNullParameter(function1, "");
            nNI nni = this.AEQbTJ;
            if (reactionUser.OLrzqt() != null) {
                nni.AhwBna.setText(reactionUser.OLrzqt());
                nni.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                C35893oHp c35893oHp = nni.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                C35891oHn.OLrzqt(c35893oHp, new RelationInfo(reactionUser.copydefault(), reactionUser.KWHzl(), reactionUser.OLrzqt(), (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, (java.lang.String) null, (OfficialTagInfo) null, 0L, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (RelationSourceType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, -8, 63, (DefaultConstructorMarker) null));
                android.widget.TextView textView = nni.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                C37716ozA.updateTagViewWithTagInfo$default(textView, reactionUser.AhwBna(), 0, null, false, false, false, 62, null);
                if (reactionUser.AEQbTJ() != null) {
                    android.widget.TextView textView2 = nni.copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    C37683oyU.AEQbTJ(textView2, GroupRole.Companion.KWHzl(reactionUser.AEQbTJ().intValue()));
                } else {
                    android.widget.TextView textView3 = nni.copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(8);
                }
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) C44157sFk.KWHzl(), (java.lang.Object) reactionUser.copydefault());
                android.widget.TextView textView4 = nni.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(zEZpvd ? 0 : 8);
                nni.getRoot().setClickable(zEZpvd);
                if (zEZpvd) {
                    nni.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.oIm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C35910oIf.Activity.copydefault(function1, reactionUser, view);
                        }
                    });
                    return;
                } else {
                    nni.getRoot().setOnClickListener(null);
                    return;
                }
            }
            android.widget.TextView textView5 = nni.AhwBna;
            textView5.setText(textView5.getContext().getString(C35399nuc.LoaderManager.DQzvGN));
            nni.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            C35893oHp c35893oHp2 = nni.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.OLrzqt(c35893oHp2, new RelationInfo(reactionUser.copydefault(), "", "", (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, (java.lang.String) null, (OfficialTagInfo) null, 0L, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (RelationSourceType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, -8, 63, (DefaultConstructorMarker) null));
            android.widget.TextView textView6 = nni.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(8);
            android.widget.TextView textView7 = nni.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
        }

        public static final void copydefault(Function1 function1, ReactionUser reactionUser, android.view.View view) {
            function1.invoke(reactionUser);
        }
    }

    /* JADX INFO: renamed from: o.oIf$Application */
    public static final class Application extends DiffUtil.ItemCallback<ReactionUser> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull ReactionUser reactionUser, @NotNull ReactionUser reactionUser2) {
            Intrinsics.checkNotNullParameter(reactionUser, "");
            Intrinsics.checkNotNullParameter(reactionUser2, "");
            return Intrinsics.EZpvd((java.lang.Object) reactionUser.copydefault(), (java.lang.Object) reactionUser2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull ReactionUser reactionUser, @NotNull ReactionUser reactionUser2) {
            Intrinsics.checkNotNullParameter(reactionUser, "");
            Intrinsics.checkNotNullParameter(reactionUser2, "");
            return Intrinsics.EZpvd(reactionUser, reactionUser2);
        }
    }
}
