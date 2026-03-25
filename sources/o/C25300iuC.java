package o;

import android.view.View;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageModeItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25300iuC extends AbstractC25436iwg<C25303iuF, hFW> {
    public final Function2<java.lang.Integer, C25303iuF, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.iuF, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25300iuC(@NotNull Function2<? super java.lang.Integer, ? super C25303iuF, Unit> function2) {
        super(SlippageModeItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hFW> c25435iwf, @NotNull C25303iuF c25303iuF) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c25303iuF, "");
        hFW hfw = (hFW) c25435iwf.EZpvd();
        hfw.copydefault.setText(c25303iuF.KWHzl());
        android.widget.TextView textView = hfw.copydefault;
        if (c25303iuF.EZpvd()) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        textView.setTextColor(iCopydefault);
        if (getPosition(c25435iwf) == 1) {
            hfw.copydefault.setContentDescription("web3_dex_popover_selection_cell_1");
        }
        android.widget.TextView textView2 = hfw.copydefault;
        textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this, c25435iwf, c25303iuF));
    }

    /* JADX INFO: renamed from: o.iuC$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C25303iuF KWHzl;
        public final /* synthetic */ C25435iwf OLrzqt;
        public final /* synthetic */ C25300iuC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25300iuC c25300iuC, C25435iwf c25435iwf, C25303iuF c25303iuF) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c25300iuC;
            this.OLrzqt = c25435iwf;
            this.KWHzl = c25303iuF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt.invoke(java.lang.Integer.valueOf(this.copydefault.getPosition(this.OLrzqt)), this.KWHzl);
            }
        }
    }
}
