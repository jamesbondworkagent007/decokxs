package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.ViewAllEarnProductItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27330jtE extends AbstractC27119jpF<C27328jtC, C23772iIt> {
    public final InterfaceC27287jsO copydefault;

    public C27330jtE(InterfaceC27287jsO interfaceC27287jsO) {
        super(ViewAllEarnProductItemBinder$1.INSTANCE);
        this.copydefault = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull C23772iIt c23772iIt, @NotNull C27328jtC c27328jtC) {
        Intrinsics.checkNotNullParameter(c23772iIt, "");
        Intrinsics.checkNotNullParameter(c27328jtC, "");
        c23772iIt.KWHzl.setText(c27328jtC.KWHzl());
        LinearLayoutCompat root = c23772iIt.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this));
    }

    /* JADX INFO: renamed from: o.jtE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C27330jtE AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27330jtE c27330jtE) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c27330jtE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC27287jsO interfaceC27287jsO = this.AEQbTJ.copydefault;
                if (interfaceC27287jsO != null) {
                    interfaceC27287jsO.OLrzqt(InterfaceC27286jsN.Activity.KWHzl);
                }
            }
        }
    }
}
