package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19423gBv extends RecyclerView.ViewHolder {
    public final Function1<C19414gBm, Unit> EZpvd;
    public final C16762epz KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.gBm, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19423gBv(@NotNull C16762epz c16762epz, @NotNull Function1<? super C19414gBm, Unit> function1) {
        super(c16762epz.getRoot());
        Intrinsics.checkNotNullParameter(c16762epz, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = c16762epz;
        this.EZpvd = function1;
    }

    public final void OLrzqt(@NotNull C19414gBm c19414gBm) {
        Intrinsics.checkNotNullParameter(c19414gBm, "");
        C16762epz c16762epz = this.KWHzl;
        Glide.KWHzl(c16762epz.KWHzl).OLrzqt(java.lang.Integer.valueOf(c19414gBm.copydefault())).EZpvd(c16762epz.KWHzl);
        int i = c19414gBm.KWHzl() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
        c16762epz.KWHzl.setImageTintList(C33070mpX.AEQbTJ(i));
        c16762epz.AEQbTJ.setText(C33070mpX.AYXKKw(c19414gBm.EZpvd()));
        c16762epz.AEQbTJ.setTextColor(C33070mpX.copydefault(i));
        android.widget.LinearLayout root = c16762epz.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c19414gBm));
    }

    /* JADX INFO: renamed from: o.gBv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C19423gBv OLrzqt;
        public final /* synthetic */ C19414gBm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19423gBv c19423gBv, C19414gBm c19414gBm) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c19423gBv;
            this.copydefault = c19414gBm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.invoke(this.copydefault);
            }
        }
    }
}
