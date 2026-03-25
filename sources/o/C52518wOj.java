package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52518wOj extends AbstractC59533zio<TacticsInsideItemData, C52516wOh> {
    public final int AEQbTJ;
    public final Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> EZpvd;
    public final Function0<Unit> KWHzl;
    public final boolean OLrzqt;
    public final android.content.Context copydefault;
    public final java.lang.Object djBIcL;
    public final Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (r9v0 android.content.Context)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r10v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r12v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 boolean) : false)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r14v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r15v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r16v0 kotlin.jvm.functions.Function1) : (null kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, java.lang.Object, boolean, int, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super kotlin.Triple<java.lang.String, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit>, kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit>):void (m)] (LINE:41) call: o.wOj.<init>(android.content.Context, java.lang.Object, boolean, int, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52518wOj(android.content.Context context, java.lang.Object obj, boolean z, int i, boolean z2, Function0 function0, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 2 : i, (i2 & 16) == 0 ? z2 : false, (i2 & 32) != 0 ? null : function0, (i2 & 64) != 0 ? null : function1, (i2 & 128) == 0 ? function12 : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Triple<java.lang.String, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52518wOj(@NotNull android.content.Context context, java.lang.Object obj, boolean z, int i, boolean z2, Function0<Unit> function0, Function1<? super Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.djBIcL = obj;
        this.OLrzqt = z;
        this.AEQbTJ = i;
        this.valueOf = z2;
        this.KWHzl = function0;
        this.EZpvd = function1;
        this.gEmmrt = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C52516wOh onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.IKQXqd, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52516wOh(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52516wOh c52516wOh, @NotNull TacticsInsideItemData tacticsInsideItemData) {
        android.widget.LinearLayout linearLayout;
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C55320xhi c55320xhiKWHzl6;
        C55320xhi c55320xhiKWHzl7;
        Intrinsics.checkNotNullParameter(c52516wOh, "");
        Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
        android.view.View view = c52516wOh.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(12.0f, null, 1, null);
        } else {
            marginLayoutParams = null;
        }
        view.setLayoutParams(marginLayoutParams);
        C55320xhi c55320xhiKWHzl8 = c52516wOh.KWHzl();
        c55320xhiKWHzl8.setText(tacticsInsideItemData.getTitle());
        c55320xhiKWHzl8.setMaxLines(5);
        c55320xhiKWHzl8.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = (tacticsInsideItemData.getSubItemType() instanceof TacticsUiConst.BotListSubItemType.BotSubTip) || (tacticsInsideItemData.getSubItemType() instanceof TacticsUiConst.BotListSubItemType.BotSubPosition);
        c55320xhiKWHzl8.setShowUnderline(z);
        c55320xhiKWHzl8.setOnClickListener(new StateListAnimator(c55320xhiKWHzl8, 1000L, z, this, tacticsInsideItemData));
        c52516wOh.copydefault().setHelperLabelType(2);
        C55312xha c55312xhaValueOf2 = c52516wOh.copydefault().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl7 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl7.setShowAttachmentView(false);
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsInsideItemData.getIvDrawableType()) || this.djBIcL == null) {
            c52516wOh.copydefault().setOnClickListener(null);
        } else {
            int iCopydefault = copydefault(tacticsInsideItemData.getIvDrawableType());
            if (iCopydefault == -1) {
                c52516wOh.copydefault().setHelperLabelType(1);
            } else if (iCopydefault != 0) {
                C55312xha c55312xhaValueOf3 = c52516wOh.copydefault().valueOf();
                if (c55312xhaValueOf3 != null && (c55320xhiKWHzl6 = c55312xhaValueOf3.KWHzl()) != null) {
                    c55320xhiKWHzl6.setShowAttachmentView(true);
                }
                c52516wOh.copydefault().setAttachmentViewId(copydefault(tacticsInsideItemData.getIvDrawableType()));
            }
            C55258xgZ c55258xgZCopydefault = c52516wOh.copydefault();
            c55258xgZCopydefault.setOnClickListener(new Activity(c55258xgZCopydefault, 1000L, this, tacticsInsideItemData));
        }
        C55312xha c55312xhaValueOf4 = c52516wOh.copydefault().valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl5 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl5.setText(tacticsInsideItemData.getText());
        }
        Function0<Unit> function0 = this.KWHzl;
        if (function0 != null) {
            android.view.View view2 = c52516wOh.itemView;
            view2.setOnClickListener(new Application(view2, 1000L, function0));
        }
        if (tacticsInsideItemData.getTextStyle() != 0 && (c55312xhaValueOf = c52516wOh.copydefault().valueOf()) != null && (c55320xhiKWHzl4 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl4.setTextAppearance(this.copydefault, tacticsInsideItemData.getTextStyle());
        }
        int tvColor = tacticsInsideItemData.getTvColor() != 0 ? tacticsInsideItemData.getTvColor() : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
        C55312xha c55312xhaValueOf5 = c52516wOh.copydefault().valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl3 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl3.setTextColor(tvColor);
        }
        if (this.OLrzqt) {
            int position = getPosition(c52516wOh);
            int i = this.AEQbTJ;
            if (position % i == i - 1) {
                android.view.View view3 = c52516wOh.itemView;
                linearLayout = view3 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view3 : null;
                if (linearLayout != null) {
                    linearLayout.setGravity(8388613);
                }
                C55312xha c55312xhaValueOf6 = c52516wOh.copydefault().valueOf();
                if (c55312xhaValueOf6 != null && (c55320xhiKWHzl2 = c55312xhaValueOf6.KWHzl()) != null) {
                    c55320xhiKWHzl2.setTextAlignment(6);
                }
                c52516wOh.KWHzl().setTextAlignment(6);
            } else {
                android.view.View view4 = c52516wOh.itemView;
                linearLayout = view4 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view4 : null;
                if (linearLayout != null) {
                    linearLayout.setGravity(8388611);
                }
                C55312xha c55312xhaValueOf7 = c52516wOh.copydefault().valueOf();
                if (c55312xhaValueOf7 != null && (c55320xhiKWHzl = c55312xhaValueOf7.KWHzl()) != null) {
                    c55320xhiKWHzl.setTextAlignment(5);
                }
                c52516wOh.KWHzl().setTextAlignment(5);
            }
        }
        if (this.valueOf) {
            C55296xhK.OLrzqt(c52516wOh.EZpvd(), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int copydefault(java.lang.String str) {
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

    /* JADX INFO: renamed from: o.wOj$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ TacticsInsideItemData AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52518wOj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52518wOj c52518wOj, TacticsInsideItemData tacticsInsideItemData) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c52518wOj;
            this.AEQbTJ = tacticsInsideItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1EZpvd = this.copydefault.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(new Triple<>(this.AEQbTJ.getIvDrawableType(), this.copydefault.copydefault(), this.AEQbTJ));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wOj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.wOj$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ TacticsInsideItemData KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C52518wOj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, boolean z, C52518wOj c52518wOj, TacticsInsideItemData tacticsInsideItemData) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = z;
            this.copydefault = c52518wOj;
            this.KWHzl = tacticsInsideItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1AEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (!this.AEQbTJ || (function1AEQbTJ = this.copydefault.AEQbTJ()) == null) {
                    return;
                }
                function1AEQbTJ.invoke(new Triple<>(this.KWHzl.getSubItemType(), this.copydefault.copydefault(), this.KWHzl));
            }
        }
    }
}
