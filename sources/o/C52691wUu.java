package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52691wUu {
    public static final C52691wUu copydefault = new C52691wUu();

    private C52691wUu() {
    }

    public final C52794wYp KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSType(260);
        c52794wYp.setOKDSPill(-1);
        c52794wYp.setOKDSSize(28);
        c52794wYp.setBackgroundDrawable(C33070mpX.KWHzl(C49511upt.TaskDescription.AEQbTJ));
        c52794wYp.setText(str);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, function0));
        return c52794wYp;
    }

    /* JADX INFO: renamed from: o.wUu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }
}
