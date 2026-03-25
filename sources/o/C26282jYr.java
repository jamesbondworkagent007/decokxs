package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.history.ui.models.RankFilterItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26282jYr extends AbstractC25436iwg<C26280jYp, hDR> {
    public final Function1<java.lang.Integer, Unit> EZpvd;

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String AEQbTJ(java.lang.String str) {
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26282jYr(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        super(RankFilterItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hDR> c25435iwf, @NotNull C26280jYp c26280jYp) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c26280jYp, "");
        ((hDR) c25435iwf.EZpvd()).getRoot().getContext();
        hDR hdr = (hDR) c25435iwf.EZpvd();
        AppCompatTextView appCompatTextView = hdr.AEQbTJ;
        java.lang.String strEZpvd = c26280jYp.EZpvd();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            strEZpvd = "";
        }
        final java.lang.String str = "--";
        appCompatTextView.setText(C31256lqb.KWHzl(strEZpvd, (Function0<java.lang.String>) new Function0() { // from class: o.jYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26282jYr.AEQbTJ(str);
            }
        }));
        AppCompatImageView appCompatImageView = hdr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(c26280jYp.AEQbTJ() ? 0 : 8);
        LinearLayoutCompat root = ((hDR) c25435iwf.EZpvd()).getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c26280jYp, c25435iwf, this));
    }

    /* JADX INFO: renamed from: o.jYr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C26280jYp AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C26282jYr OLrzqt;
        public final /* synthetic */ C25435iwf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C26280jYp c26280jYp, C25435iwf c25435iwf, C26282jYr c26282jYr) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c26280jYp;
            this.copydefault = c25435iwf;
            this.OLrzqt = c26282jYr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ(!r7.AEQbTJ());
                AppCompatImageView appCompatImageView = ((hDR) this.copydefault.EZpvd()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(this.AEQbTJ.AEQbTJ() ? 0 : 8);
                this.OLrzqt.EZpvd.invoke(java.lang.Integer.valueOf(this.OLrzqt.getPosition(this.copydefault)));
            }
        }
    }
}
