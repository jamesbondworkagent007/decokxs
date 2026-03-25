package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25229isl extends C43318rmy<C25150irL, AbstractC23444hyO> {
    public C25229isl() {
        super(C23274hvD.Activity.RKDWNf, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23444hyO> c43312rms, @NotNull C25150irL c25150irL) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25150irL, "");
        ((AbstractC23444hyO) c43312rms.OLrzqt()).OLrzqt.setText(c25150irL.AEQbTJ());
        C55258xgZ c55258xgZ = ((AbstractC23444hyO) c43312rms.OLrzqt()).AEQbTJ;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, c25150irL));
    }

    /* JADX INFO: renamed from: o.isl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25150irL KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25150irL c25150irL) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c25150irL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.KWHzl.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }
}
