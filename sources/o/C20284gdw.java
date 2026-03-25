package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20284gdw extends androidx.recyclerview.widget.ListAdapter<C20285gdx, Activity> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Application KWHzl = new Application();

    public C20284gdw() {
        super(KWHzl);
    }

    /* JADX INFO: renamed from: o.gdw$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C20284gdw AEQbTJ;
        public final C16487ekp KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C20284gdw c20284gdw, C16487ekp c16487ekp) {
            super(c16487ekp.getRoot());
            Intrinsics.checkNotNullParameter(c16487ekp, "");
            this.AEQbTJ = c20284gdw;
            this.KWHzl = c16487ekp;
        }

        public final void AEQbTJ(@NotNull C20285gdx c20285gdx) {
            Intrinsics.checkNotNullParameter(c20285gdx, "");
            C16487ekp c16487ekp = this.KWHzl;
            ShapeableImageView shapeableImageView = c16487ekp.copydefault;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            C33054mpH.AEQbTJ(shapeableImageView, c20285gdx.KWHzl().getVendorIcon());
            c16487ekp.KWHzl.setText(c20285gdx.KWHzl().getName());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16487ekp c16487ekpCopydefault = C16487ekp.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16487ekpCopydefault, "");
        return new Activity(this, c16487ekpCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        C20285gdx item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        activity.AEQbTJ(item);
    }

    /* JADX INFO: renamed from: o.gdw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gdw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.gdw$Application */
    public static final class Application extends DiffUtil.ItemCallback<C20285gdx> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C20285gdx c20285gdx, C20285gdx c20285gdx2) {
            Intrinsics.checkNotNullParameter(c20285gdx, "");
            Intrinsics.checkNotNullParameter(c20285gdx2, "");
            return Intrinsics.EZpvd((java.lang.Object) c20285gdx.KWHzl().getName(), (java.lang.Object) c20285gdx2.KWHzl().getName());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C20285gdx c20285gdx, C20285gdx c20285gdx2) {
            Intrinsics.checkNotNullParameter(c20285gdx, "");
            Intrinsics.checkNotNullParameter(c20285gdx2, "");
            return Intrinsics.EZpvd((java.lang.Object) c20285gdx.KWHzl().getName(), (java.lang.Object) c20285gdx2.KWHzl().getName());
        }
    }
}
