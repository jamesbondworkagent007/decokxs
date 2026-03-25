package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.tee.converter.ui.item.SmallAssetsHiddenEntryViewBinding$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUR extends AbstractC19608gIr<fTZ.TaskDescription, C16839erW> {
    public final Function1<fTZ.TaskDescription, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fTZ$TaskDescription, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fUR(@NotNull Function1<? super fTZ.TaskDescription, Unit> function1) {
        super(SmallAssetsHiddenEntryViewBinding$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C16839erW c16839erW, @NotNull fTZ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c16839erW, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c16839erW.copydefault.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.onSetShuffleMode, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(taskDescription.OLrzqt())))));
        ConstraintLayout root = c16839erW.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, taskDescription));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ fUR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ fTZ.TaskDescription OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fUR fur, fTZ.TaskDescription taskDescription) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = fur;
            this.OLrzqt = taskDescription;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(this.OLrzqt);
            }
        }
    }
}
