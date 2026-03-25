package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wCI extends C50027uzf<ExpandableGridDealRecordItemData> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final DiffUtil.ItemCallback<ExpandableGridDealRecordItemData> EZpvd = new Application();

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wCI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public wCI() {
        super(EZpvd);
    }

    public static final class Application extends DiffUtil.ItemCallback<ExpandableGridDealRecordItemData> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(ExpandableGridDealRecordItemData expandableGridDealRecordItemData, ExpandableGridDealRecordItemData expandableGridDealRecordItemData2) {
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData2, "");
            return Intrinsics.EZpvd((java.lang.Object) expandableGridDealRecordItemData.getGroupId(), (java.lang.Object) expandableGridDealRecordItemData2.getGroupId());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(ExpandableGridDealRecordItemData expandableGridDealRecordItemData, ExpandableGridDealRecordItemData expandableGridDealRecordItemData2) {
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData2, "");
            return Intrinsics.EZpvd(expandableGridDealRecordItemData, expandableGridDealRecordItemData2);
        }
    }
}
