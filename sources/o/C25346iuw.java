package o;

import android.view.View;
import com.okinc.business.dexui.main.swap.widget.mev.RouteItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25346iuw extends AbstractC25436iwg<C25343iut, hFW> {
    public final Function2<java.lang.Integer, C25343iut, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.iut, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25346iuw(@NotNull Function2<? super java.lang.Integer, ? super C25343iut, Unit> function2) {
        super(RouteItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hFW> c25435iwf, @NotNull C25343iut c25343iut) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c25343iut, "");
        hFW hfw = (hFW) c25435iwf.EZpvd();
        hfw.copydefault.setText(c25343iut.EZpvd());
        android.widget.TextView textView = hfw.copydefault;
        if (c25343iut.AEQbTJ()) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        textView.setTextColor(iCopydefault);
        android.widget.TextView textView2 = hfw.copydefault;
        textView2.setOnClickListener(new Activity(textView2, 1000L, this, c25435iwf, c25343iut));
    }

    /* JADX INFO: renamed from: o.iuw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25346iuw EZpvd;
        public final /* synthetic */ C25343iut KWHzl;
        public final /* synthetic */ C25435iwf OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25346iuw c25346iuw, C25435iwf c25435iwf, C25343iut c25343iut) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c25346iuw;
            this.OLrzqt = c25435iwf;
            this.KWHzl = c25343iut;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault.invoke(java.lang.Integer.valueOf(this.EZpvd.getPosition(this.OLrzqt)), this.KWHzl);
            }
        }
    }
}
