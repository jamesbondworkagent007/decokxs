package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eFV extends AbstractC59533zio<eFH, RecyclerView.ViewHolder> {
    public final Function1<BluetoothDeviceModel, Unit> AEQbTJ;
    public final int copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public eFV(@androidx.annotation.LayoutRes int i, @NotNull Function1<? super BluetoothDeviceModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = i;
        this.AEQbTJ = function1;
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new ActionBar(layoutInflater.inflate(this.copydefault, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final eFH efh) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(efh, "");
        ((android.widget.TextView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1)).setText(efh.AEQbTJ().getName());
        android.view.View viewFindViewById = viewHolder.itemView.findViewById(C13754dXa.ActionBar.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(efh.copydefault() ? 0 : 8);
        C8003auW.copydefault(viewHolder.itemView).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.eGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eFV.KWHzl(this.EZpvd, efh, obj);
            }
        });
    }

    public static final void KWHzl(eFV efv, eFH efh, java.lang.Object obj) {
        efv.AEQbTJ.invoke(efh.AEQbTJ());
    }
}
