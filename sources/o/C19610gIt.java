package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19610gIt extends RecyclerView.Adapter<C19613gIw> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final java.util.List<DefiOnboardingTile.TaskDescription.ActionBar> AEQbTJ;
    public final yHO<java.lang.Integer, C18190fdi, C18126fcX, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super java.lang.Integer, ? super o.fdi, ? super o.fcX, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19610gIt(@NotNull java.util.List<DefiOnboardingTile.TaskDescription.ActionBar> list, @NotNull yHO<? super java.lang.Integer, ? super C18190fdi, ? super C18126fcX, Unit> yho) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.AEQbTJ = list;
        this.OLrzqt = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19613gIw onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C19613gIw.Companion.KWHzl(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.isEmpty() ? 2 : Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19613gIw c19613gIw, int i) {
        Intrinsics.checkNotNullParameter(c19613gIw, "");
        DefiOnboardingTile.TaskDescription.ActionBar actionBarCopydefault = copydefault(i);
        if (actionBarCopydefault == null) {
            Glide.AEQbTJ(c19613gIw.AEQbTJ().getRoot().getContext()).OLrzqt(java.lang.Integer.valueOf(C13754dXa.Activity.ORxRYg)).EZpvd((android.widget.ImageView) c19613gIw.AEQbTJ().getRoot());
            return;
        }
        Glide.AEQbTJ(c19613gIw.AEQbTJ().getRoot().getContext()).EZpvd(actionBarCopydefault.copydefault()).KWHzl(C13754dXa.Activity.QKVWgx).copydefault(C13754dXa.Activity.ORxRYg).EZpvd((NN<android.graphics.Bitmap>) new StateListAnimator()).EZpvd((android.widget.ImageView) c19613gIw.AEQbTJ().getRoot());
        ShapeableImageView root = c19613gIw.AEQbTJ().getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, actionBarCopydefault));
    }

    /* JADX INFO: renamed from: o.gIt$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5396Qc {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NH
        public void AEQbTJ(MessageDigest messageDigest) {
            Intrinsics.checkNotNullParameter(messageDigest, "");
        }

        @Override // o.AbstractC5396Qc
        public android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap, int i, int i2) {
            Intrinsics.checkNotNullParameter(og, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, 10, 10, bitmap.getWidth() - C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null), bitmap.getHeight() - C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null));
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            return bitmapCreateBitmap;
        }
    }

    public final DefiOnboardingTile.TaskDescription.ActionBar copydefault(int i) {
        if (this.AEQbTJ.isEmpty()) {
            return null;
        }
        java.util.List<DefiOnboardingTile.TaskDescription.ActionBar> list = this.AEQbTJ;
        return list.get(i % list.size());
    }

    /* JADX INFO: renamed from: o.gIt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.gIt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C19610gIt AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ DefiOnboardingTile.TaskDescription.ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19610gIt c19610gIt, DefiOnboardingTile.TaskDescription.ActionBar actionBar) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c19610gIt;
            this.copydefault = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                yHO yho = this.AEQbTJ.OLrzqt;
                int iKWHzl = this.copydefault.KWHzl();
                yho.invoke(java.lang.Integer.valueOf(iKWHzl), C18190fdi.EZpvd(C18190fdi.copydefault(this.copydefault.EZpvd())), C18126fcX.KWHzl(C18126fcX.OLrzqt(this.copydefault.OLrzqt())));
            }
        }
    }
}
