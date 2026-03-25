package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53800wsN extends androidx.recyclerview.widget.ListAdapter<TacticsInsideItemData, StateListAnimator> {
    public final int KWHzl;
    public final android.content.Context OLrzqt;
    public final boolean copydefault;
    public final Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final Application AEQbTJ = new Application();

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C53800wsN(@NotNull android.content.Context context, int i, boolean z, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1) {
        super(AEQbTJ);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.KWHzl = i;
        this.copydefault = z;
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50822vbR c50822vbRCopydefault = C50822vbR.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C48033uCm.Activity.IKQXqd, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(c50822vbRCopydefault, "");
        return new StateListAnimator(this, c50822vbRCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        TacticsInsideItemData item = getItem(i);
        Intrinsics.copydefault(item);
        stateListAnimator.EZpvd(item, i);
    }

    /* JADX INFO: renamed from: o.wsN$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C53800wsN KWHzl;
        public final C50822vbR copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C53800wsN c53800wsN, C50822vbR c50822vbR) {
            super(c50822vbR.getRoot());
            Intrinsics.checkNotNullParameter(c50822vbR, "");
            this.KWHzl = c53800wsN;
            this.copydefault = c50822vbR;
            c50822vbR.AEQbTJ.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        }

        public final void EZpvd(@NotNull TacticsInsideItemData tacticsInsideItemData, int i) {
            C55320xhi c55320xhiKWHzl;
            int iCopydefault;
            C55320xhi c55320xhiKWHzl2;
            C55320xhi c55320xhiKWHzl3;
            C55320xhi c55320xhiKWHzl4;
            C55312xha c55312xhaValueOf;
            C55320xhi c55320xhiKWHzl5;
            C55320xhi c55320xhiKWHzl6;
            C55320xhi c55320xhiKWHzl7;
            Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
            android.view.View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C55298xhM.dp2px$default(12.0f, null, 1, null);
            } else {
                marginLayoutParams = null;
            }
            view.setLayoutParams(marginLayoutParams);
            C55320xhi c55320xhi = this.copydefault.KWHzl;
            C53800wsN c53800wsN = this.KWHzl;
            c55320xhi.setText(tacticsInsideItemData.getTitle());
            c55320xhi.setMaxLines(5);
            c55320xhi.setEllipsize(TextUtils.TruncateAt.END);
            boolean z = (tacticsInsideItemData.getSubItemType() instanceof TacticsUiConst.BotListSubItemType.BotSubTip) || (tacticsInsideItemData.getSubItemType() instanceof TacticsUiConst.BotListSubItemType.BotSubPosition);
            c55320xhi.setShowUnderline(z);
            c55320xhi.setOnClickListener(new ViewOnClickListenerC0991StateListAnimator(c55320xhi, 1000L, z, c53800wsN, tacticsInsideItemData));
            this.copydefault.AEQbTJ.setHelperLabelType(2);
            C55312xha c55312xhaValueOf2 = this.copydefault.AEQbTJ.valueOf();
            if (c55312xhaValueOf2 != null && (c55320xhiKWHzl7 = c55312xhaValueOf2.KWHzl()) != null) {
                c55320xhiKWHzl7.setShowAttachmentView(false);
            }
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsInsideItemData.getIvDrawableType())) {
                this.copydefault.AEQbTJ.setOnClickListener(null);
            } else {
                int iOLrzqt = OLrzqt(tacticsInsideItemData.getIvDrawableType());
                if (iOLrzqt == -1) {
                    this.copydefault.AEQbTJ.setHelperLabelType(1);
                } else if (iOLrzqt != 0) {
                    C55312xha c55312xhaValueOf3 = this.copydefault.AEQbTJ.valueOf();
                    if (c55312xhaValueOf3 != null && (c55320xhiKWHzl = c55312xhaValueOf3.KWHzl()) != null) {
                        c55320xhiKWHzl.setShowAttachmentView(true);
                    }
                    this.copydefault.AEQbTJ.setAttachmentViewId(OLrzqt(tacticsInsideItemData.getIvDrawableType()));
                }
            }
            C55312xha c55312xhaValueOf4 = this.copydefault.AEQbTJ.valueOf();
            if (c55312xhaValueOf4 != null && (c55320xhiKWHzl6 = c55312xhaValueOf4.KWHzl()) != null) {
                c55320xhiKWHzl6.setText(tacticsInsideItemData.getText());
            }
            if (tacticsInsideItemData.getTextStyle() != 0 && (c55312xhaValueOf = this.copydefault.AEQbTJ.valueOf()) != null && (c55320xhiKWHzl5 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl5.setTextAppearance(this.KWHzl.OLrzqt, tacticsInsideItemData.getTextStyle());
            }
            if (tacticsInsideItemData.getTvColor() != 0) {
                iCopydefault = tacticsInsideItemData.getTvColor();
            } else {
                iCopydefault = C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
            }
            C55312xha c55312xhaValueOf5 = this.copydefault.AEQbTJ.valueOf();
            if (c55312xhaValueOf5 != null && (c55320xhiKWHzl4 = c55312xhaValueOf5.KWHzl()) != null) {
                c55320xhiKWHzl4.setTextColor(iCopydefault);
            }
            if (this.KWHzl.copydefault) {
                if (i % this.KWHzl.KWHzl == this.KWHzl.KWHzl - 1) {
                    this.copydefault.copydefault.setGravity(8388613);
                    C55312xha c55312xhaValueOf6 = this.copydefault.AEQbTJ.valueOf();
                    if (c55312xhaValueOf6 != null && (c55320xhiKWHzl3 = c55312xhaValueOf6.KWHzl()) != null) {
                        c55320xhiKWHzl3.setTextAlignment(6);
                    }
                    this.copydefault.KWHzl.setTextAlignment(6);
                    return;
                }
                this.copydefault.copydefault.setGravity(8388611);
                C55312xha c55312xhaValueOf7 = this.copydefault.AEQbTJ.valueOf();
                if (c55312xhaValueOf7 != null && (c55320xhiKWHzl2 = c55312xhaValueOf7.KWHzl()) != null) {
                    c55320xhiKWHzl2.setTextAlignment(5);
                }
                this.copydefault.KWHzl.setTextAlignment(5);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final int OLrzqt(java.lang.String str) {
            java.lang.String str2;
            switch (str.hashCode()) {
                case -2015371680:
                    if (str.equals("last_price")) {
                        return C48033uCm.Activity.DAgZj;
                    }
                    return -1;
                case -1967119875:
                    str2 = "coin_current_value";
                    str.equals(str2);
                    return -1;
                case -1632678308:
                    if (str.equals("grid_out_of_range_warning")) {
                        return C48033uCm.Activity.zlzhuY;
                    }
                    return -1;
                case 223653149:
                    str2 = "coin_current_position";
                    str.equals(str2);
                    return -1;
                case 1594317834:
                    str2 = "coin_target_scale";
                    str.equals(str2);
                    return -1;
                case 1637026727:
                    if (str.equals("WithdrawProfitIcon")) {
                        return C48033uCm.Activity.setProfilesSinceInitCount;
                    }
                    return -1;
                case 1999465411:
                    str2 = "bot_sub_recurring_avg_price";
                    str.equals(str2);
                    return -1;
                default:
                    return -1;
            }
        }

        /* JADX INFO: renamed from: o.wsN$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0991StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ boolean AEQbTJ;
            public final /* synthetic */ TacticsInsideItemData EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C53800wsN OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0991StateListAnimator(android.view.View view, long j, boolean z, C53800wsN c53800wsN, TacticsInsideItemData tacticsInsideItemData) {
                this.KWHzl = view;
                this.copydefault = j;
                this.AEQbTJ = z;
                this.OLrzqt = c53800wsN;
                this.EZpvd = tacticsInsideItemData;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                Function1 function1;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    if (!this.AEQbTJ || (function1 = this.OLrzqt.djBIcL) == null) {
                        return;
                    }
                    function1.invoke(new Triple(this.EZpvd.getSubItemType(), null, this.EZpvd));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsN$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.wsN$Application */
    public static final class Application extends DiffUtil.ItemCallback<TacticsInsideItemData> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(TacticsInsideItemData tacticsInsideItemData, TacticsInsideItemData tacticsInsideItemData2) {
            Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
            Intrinsics.checkNotNullParameter(tacticsInsideItemData2, "");
            return Intrinsics.EZpvd((java.lang.Object) tacticsInsideItemData.getTitle(), (java.lang.Object) tacticsInsideItemData2.getTitle());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(TacticsInsideItemData tacticsInsideItemData, TacticsInsideItemData tacticsInsideItemData2) {
            Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
            Intrinsics.checkNotNullParameter(tacticsInsideItemData2, "");
            return Intrinsics.EZpvd(tacticsInsideItemData, tacticsInsideItemData2);
        }
    }
}
