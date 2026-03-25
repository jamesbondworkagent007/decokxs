package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lQQ extends mIP<RecurringFrequencyOption, AbstractC31587lwp> {
    public final Function1<RecurringFrequencyOption, Unit> AEQbTJ;
    public final RecurringFrequencyOption OLrzqt;

    @Override // o.mIP
    public /* synthetic */ void KWHzl(OKCRListItem oKCRListItem, C43312rms c43312rms) {
        AEQbTJ((RecurringFrequencyOption) oKCRListItem, (C43312rms<AbstractC31587lwp>) c43312rms);
    }

    @Override // o.AbstractC59533zio
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.Object obj, java.util.List list) {
        OLrzqt((C43312rms<AbstractC31587lwp>) viewHolder, (RecurringFrequencyOption) obj, (java.util.List<java.lang.Object>) list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lQQ(RecurringFrequencyOption recurringFrequencyOption, @NotNull Function1<? super RecurringFrequencyOption, Unit> function1) {
        super(C31351lsQ.ActionBar.accept);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = recurringFrequencyOption;
        this.AEQbTJ = function1;
    }

    public void AEQbTJ(@NotNull final RecurringFrequencyOption recurringFrequencyOption, @NotNull C43312rms<AbstractC31587lwp> c43312rms) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31587lwp abstractC31587lwp = (AbstractC31587lwp) c43312rms.OLrzqt();
        if (abstractC31587lwp != null) {
            abstractC31587lwp.getRoot().setBackgroundResource(recurringFrequencyOption.isSelected() ? mDC.StateListAnimator.gEmmrt : mDC.StateListAnimator.valueOf);
            abstractC31587lwp.OLrzqt.setText(recurringFrequencyOption.getLabel());
            abstractC31587lwp.EZpvd.setText(recurringFrequencyOption.getDesc());
            C55251xgS c55251xgS = abstractC31587lwp.AEQbTJ;
            java.lang.String id = recurringFrequencyOption.getId();
            RecurringFrequencyOption recurringFrequencyOption2 = this.OLrzqt;
            c55251xgS.setVisibility(Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (recurringFrequencyOption2 != null ? recurringFrequencyOption2.getId() : null)) ? 0 : 8);
            abstractC31587lwp.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lQR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lQQ.OLrzqt(this.copydefault, recurringFrequencyOption, view);
                }
            });
        }
    }

    public static final void OLrzqt(lQQ lqq, RecurringFrequencyOption recurringFrequencyOption, android.view.View view) {
        lqq.AEQbTJ.invoke(recurringFrequencyOption);
    }

    public void OLrzqt(@NotNull C43312rms<AbstractC31587lwp> c43312rms, @NotNull final RecurringFrequencyOption recurringFrequencyOption, @NotNull java.util.List<java.lang.Object> list) {
        AbstractC31587lwp abstractC31587lwp;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(c43312rms, recurringFrequencyOption, list);
            return;
        }
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(list);
        ActionBar actionBar = objFirstOrNull instanceof ActionBar ? (ActionBar) objFirstOrNull : null;
        if (actionBar == null || (abstractC31587lwp = (AbstractC31587lwp) c43312rms.OLrzqt()) == null) {
            return;
        }
        abstractC31587lwp.getRoot().setBackgroundResource(Intrinsics.EZpvd(actionBar.copydefault(), java.lang.Boolean.TRUE) ? mDC.StateListAnimator.gEmmrt : mDC.StateListAnimator.valueOf);
        abstractC31587lwp.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lQQ.EZpvd(this.KWHzl, recurringFrequencyOption, view);
            }
        });
    }

    public static final void EZpvd(lQQ lqq, RecurringFrequencyOption recurringFrequencyOption, android.view.View view) {
        lqq.AEQbTJ.invoke(recurringFrequencyOption);
    }

    public static final class ActionBar {
        public final java.lang.Boolean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = actionBar.AEQbTJ;
            }
            return actionBar.OLrzqt(bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ == null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(java.lang.Boolean bool) {
            return new ActionBar(bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Boolean bool = this.AEQbTJ;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChangePayload(isSelected=" + this.AEQbTJ + ")";
        }

        public ActionBar(java.lang.Boolean bool) {
            this.AEQbTJ = bool;
        }
    }
}
