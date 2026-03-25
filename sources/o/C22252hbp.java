package o;

import android.view.View;
import com.okinc.business.dex.trade.order.ui.binder.ExplorerButtonBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22252hbp extends AbstractC25436iwg<C22254hbr, hHJ> {
    public final Function0<Unit> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22252hbp(@NotNull Function0<Unit> function0) {
        super(ExplorerButtonBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHJ> c25435iwf, @NotNull C22254hbr c22254hbr) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c22254hbr, "");
        hHJ hhj = (hHJ) c25435iwf.EZpvd();
        hhj.OLrzqt.setOKDSType(260);
        hhj.OLrzqt.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKtBackHandler2));
        C52794wYp c52794wYp = hhj.OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        android.view.View view = hhj.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(c22254hbr.KWHzl() ? 8 : 0);
    }

    /* JADX INFO: renamed from: o.hbp$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C22252hbp OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C22252hbp c22252hbp) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c22252hbp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.invoke();
            }
        }
    }
}
