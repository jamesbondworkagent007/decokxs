package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25227isj extends C43318rmy<C25155irQ, AbstractC23515hzg> {
    public C25227isj() {
        super(C23274hvD.Activity.hrNTAI, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23515hzg> c43312rms, @NotNull C25155irQ c25155irQ) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25155irQ, "");
        ((AbstractC23515hzg) c43312rms.OLrzqt()).copydefault.setText(c25155irQ.EZpvd());
        C55258xgZ c55258xgZ = ((AbstractC23515hzg) c43312rms.OLrzqt()).KWHzl;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, c25155irQ));
    }

    /* JADX INFO: renamed from: o.isj$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C25155irQ EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C25155irQ c25155irQ) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c25155irQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0<Unit> function0Copydefault = this.EZpvd.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }
    }
}
