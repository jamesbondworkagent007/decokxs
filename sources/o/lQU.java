package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import kotlin.jvm.internal.Intrinsics;
import o.lQQ;

/* JADX INFO: loaded from: classes18.dex */
public final class lQU extends mHT<RecurringFrequencyOption> {
    public lQU() {
        super(new DiffUtil.ItemCallback<RecurringFrequencyOption>() { // from class: o.lQU.2
            /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(RecurringFrequencyOption recurringFrequencyOption, RecurringFrequencyOption recurringFrequencyOption2) {
                Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
                Intrinsics.checkNotNullParameter(recurringFrequencyOption2, "");
                return Intrinsics.EZpvd((java.lang.Object) recurringFrequencyOption.getId(), (java.lang.Object) recurringFrequencyOption2.getId());
            }

            /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(RecurringFrequencyOption recurringFrequencyOption, RecurringFrequencyOption recurringFrequencyOption2) {
                Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
                Intrinsics.checkNotNullParameter(recurringFrequencyOption2, "");
                return Intrinsics.EZpvd(recurringFrequencyOption, recurringFrequencyOption2);
            }

            /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public java.lang.Object getChangePayload(RecurringFrequencyOption recurringFrequencyOption, RecurringFrequencyOption recurringFrequencyOption2) {
                Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
                Intrinsics.checkNotNullParameter(recurringFrequencyOption2, "");
                lQQ.ActionBar actionBar = new lQQ.ActionBar(java.lang.Boolean.valueOf(recurringFrequencyOption2.isSelected()));
                if (!(!actionBar.KWHzl())) {
                    actionBar = null;
                }
                return actionBar == null ? super.getChangePayload(recurringFrequencyOption, recurringFrequencyOption2) : actionBar;
            }
        });
    }
}
