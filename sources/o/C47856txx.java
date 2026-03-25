package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47856txx extends AbstractC43310rmq<C47777twX, tMK> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.wlaJM;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tMK> c43312rms, @NotNull C47777twX c47777twX) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c47777twX, "");
        super.onBindViewHolder((C43312rms) c43312rms, c47777twX);
        ((tMK) c43312rms.OLrzqt()).OLrzqt.setText(c47777twX.KWHzl());
        android.widget.LinearLayout linearLayout = ((tMK) c43312rms.OLrzqt()).AEQbTJ;
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L));
    }

    /* JADX INFO: renamed from: o.txx$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.copydefault = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.AEQbTJ;
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                android.content.Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", "/zh-hans-sg/help/orbit-earnings-faq")), null, 4, null);
            }
        }
    }
}
