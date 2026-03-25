package o;

import android.view.View;
import com.okinc.business.dexui.main.swap.mememode.dialog.adapter.FaqLinkBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24316ibY extends AbstractC25436iwg<C24374icd, C21581hEr> {
    public final Function0<Unit> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24316ibY(@NotNull Function0<Unit> function0) {
        super(FaqLinkBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21581hEr> c25435iwf, @NotNull C24374icd c24374icd) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c24374icd, "");
        C21581hEr c21581hEr = (C21581hEr) c25435iwf.EZpvd();
        c21581hEr.getRoot().setText(c24374icd.EZpvd());
        c21581hEr.getRoot().setPaintFlags(c21581hEr.getRoot().getPaintFlags() | 8);
        android.widget.TextView root = c21581hEr.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ibY$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C24316ibY EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C24316ibY c24316ibY) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c24316ibY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt.invoke();
            }
        }
    }
}
