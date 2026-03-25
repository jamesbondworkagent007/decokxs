package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28465kbL extends kMD<C28463kbJ> {
    public final Function0<Unit> EZpvd;
    public final Function0<Unit> KWHzl;

    public C28465kbL(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.EZpvd = function0;
        this.KWHzl = function02;
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCB hcbKWHzl = hCB.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcbKWHzl, "");
        return hcbKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull C28463kbJ c28463kbJ) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(c28463kbJ, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hCB hcb = viewBindingAEQbTJ instanceof hCB ? (hCB) viewBindingAEQbTJ : null;
        if (hcb == null) {
            return;
        }
        LinearLayoutCompat linearLayoutCompat = hcb.OLrzqt;
        linearLayoutCompat.setOnClickListener(new ActionBar(linearLayoutCompat, 1000L, this));
        LinearLayoutCompat linearLayoutCompat2 = hcb.copydefault;
        linearLayoutCompat2.setContentDescription("web3_dex_watchlist_manage_tokens_btn");
        linearLayoutCompat2.setOnClickListener(new StateListAnimator(linearLayoutCompat2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.kbL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C28465kbL KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28465kbL c28465kbL) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c28465kbL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.kbL$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C28465kbL EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28465kbL c28465kbL) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c28465kbL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke();
            }
        }
    }
}
