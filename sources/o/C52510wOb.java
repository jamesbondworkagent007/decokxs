package o;

import android.view.View;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52510wOb extends AbstractC59533zio<TacticsInsideItemData, wNX> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final Function0<Unit> EZpvd;
    public final Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52510wOb() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.wOb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ TacticsInsideItemData KWHzl;
        public final /* synthetic */ C52510wOb OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52510wOb c52510wOb, TacticsInsideItemData tacticsInsideItemData) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c52510wOb;
            this.KWHzl = tacticsInsideItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.KWHzl.getDoubtMsg());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wOb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ TacticsInsideItemData AEQbTJ;
        public final /* synthetic */ C52510wOb EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52510wOb c52510wOb, TacticsInsideItemData tacticsInsideItemData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c52510wOb;
            this.AEQbTJ = tacticsInsideItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ.getDoubtMsg());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wOb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C52510wOb AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52510wOb c52510wOb) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c52510wOb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0<Unit> function0OLrzqt = this.AEQbTJ.OLrzqt();
                if (function0OLrzqt != null) {
                    function0OLrzqt.invoke();
                }
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:414) call: o.wOb.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C52510wOb(Function1 function1, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function02);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52510wOb(Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        this.AEQbTJ = function1;
        this.KWHzl = function0;
        this.EZpvd = function02;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public wNX onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.HrMTQN, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new wNX(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wNX wnx, @NotNull TacticsInsideItemData tacticsInsideItemData) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        C55312xha c55312xhaValueOf3;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C55320xhi c55320xhiKWHzl6;
        C55320xhi c55320xhiKWHzl7;
        C55312xha c55312xhaValueOf4;
        C55320xhi c55320xhiKWHzl8;
        C55312xha c55312xhaValueOf5;
        C55320xhi c55320xhiKWHzl9;
        C55320xhi c55320xhiKWHzl10;
        C55320xhi c55320xhiKWHzl11;
        Intrinsics.checkNotNullParameter(wnx, "");
        Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
        if (Intrinsics.EZpvd((java.lang.Object) tacticsInsideItemData.getItemType(), (java.lang.Object) "bot_inside_two")) {
            wnx.copydefault().setVisibility(8);
            wnx.gEmmrt().setVisibility(0);
            C55312xha c55312xhaValueOf6 = wnx.KWHzl().valueOf();
            if (c55312xhaValueOf6 != null && (c55320xhiKWHzl11 = c55312xhaValueOf6.KWHzl()) != null) {
                c55320xhiKWHzl11.setText(C33061mpO.setupSpanStyles$default(tacticsInsideItemData.getText(), new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.wOe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C52510wOb.KWHzl((java.util.List) obj);
                    }
                }, 10, null));
            }
            C55258xgZ c55258xgZOLrzqt = wnx.OLrzqt();
            c55258xgZOLrzqt.setHelperLabelType(1);
            C55312xha c55312xhaValueOf7 = wnx.OLrzqt().valueOf();
            if (c55312xhaValueOf7 != null && (c55320xhiKWHzl10 = c55312xhaValueOf7.KWHzl()) != null) {
                c55320xhiKWHzl10.setText(tacticsInsideItemData.getTitle());
            }
            C55312xha c55312xhaValueOf8 = c55258xgZOLrzqt.valueOf();
            if (c55312xhaValueOf8 != null) {
                c55312xhaValueOf8.setShowUnderline(false);
            }
            if (tacticsInsideItemData.getTvColor() != 0 && (c55312xhaValueOf5 = wnx.OLrzqt().valueOf()) != null && (c55320xhiKWHzl9 = c55312xhaValueOf5.KWHzl()) != null) {
                c55320xhiKWHzl9.setTextColor(tacticsInsideItemData.getTvColor());
            }
            if (tacticsInsideItemData.getTextStyle() != 0 && (c55312xhaValueOf4 = wnx.OLrzqt().valueOf()) != null && (c55320xhiKWHzl8 = c55312xhaValueOf4.KWHzl()) != null) {
                c55320xhiKWHzl8.setTextAppearance(tacticsInsideItemData.getTextStyle());
            }
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsInsideItemData.getDoubtMsg())) {
                C55312xha c55312xhaValueOf9 = c55258xgZOLrzqt.valueOf();
                if (c55312xhaValueOf9 != null) {
                    c55312xhaValueOf9.setShowUnderline(true);
                }
                c55258xgZOLrzqt.setOnClickListener(new ActionBar(c55258xgZOLrzqt, 1000L, this, tacticsInsideItemData));
            }
            wnx.EZpvd().setVisibility(8);
            C55312xha c55312xhaValueOf10 = wnx.KWHzl().valueOf();
            if (c55312xhaValueOf10 != null) {
                c55312xhaValueOf10.setShowUnderline(false);
            }
            C55312xha c55312xhaValueOf11 = wnx.KWHzl().valueOf();
            if (c55312xhaValueOf11 != null && (c55320xhiKWHzl7 = c55312xhaValueOf11.KWHzl()) != null) {
                c55320xhiKWHzl7.setEnabled(false);
            }
            if (Intrinsics.EZpvd((java.lang.Object) tacticsInsideItemData.getIvDrawableType(), (java.lang.Object) "under_line")) {
                C55312xha c55312xhaValueOf12 = wnx.KWHzl().valueOf();
                if (c55312xhaValueOf12 != null) {
                    c55312xhaValueOf12.setShowUnderline(true);
                }
                C55312xha c55312xhaValueOf13 = wnx.KWHzl().valueOf();
                if (c55312xhaValueOf13 != null && (c55320xhiKWHzl6 = c55312xhaValueOf13.KWHzl()) != null) {
                    c55320xhiKWHzl6.setEnabled(true);
                }
                C55312xha c55312xhaValueOf14 = wnx.KWHzl().valueOf();
                if (c55312xhaValueOf14 != null && (c55320xhiKWHzl5 = c55312xhaValueOf14.KWHzl()) != null) {
                    c55320xhiKWHzl5.setOnClickListener(new TaskDescription(c55320xhiKWHzl5, 1000L, this));
                }
            }
            if (tacticsInsideItemData.getRightTextColor() != null && (c55312xhaValueOf3 = wnx.KWHzl().valueOf()) != null && (c55320xhiKWHzl4 = c55312xhaValueOf3.KWHzl()) != null) {
                java.lang.Integer rightTextColor = tacticsInsideItemData.getRightTextColor();
                Intrinsics.copydefault(rightTextColor);
                c55320xhiKWHzl4.setTextColor(rightTextColor.intValue());
            }
            final Function0<Unit> function0 = this.KWHzl;
            if (function0 != null) {
                wnx.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.wOc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C52510wOb.copydefault(function0, view);
                    }
                });
                return;
            }
            return;
        }
        wnx.copydefault().setVisibility(0);
        wnx.gEmmrt().setVisibility(8);
        C55258xgZ c55258xgZAEQbTJ = wnx.AEQbTJ();
        c55258xgZAEQbTJ.setHelperLabelType(1);
        C55312xha c55312xhaValueOf15 = wnx.AEQbTJ().valueOf();
        if (c55312xhaValueOf15 != null && (c55320xhiKWHzl3 = c55312xhaValueOf15.KWHzl()) != null) {
            c55320xhiKWHzl3.setText(tacticsInsideItemData.getTitle());
        }
        C55312xha c55312xhaValueOf16 = c55258xgZAEQbTJ.valueOf();
        if (c55312xhaValueOf16 != null) {
            c55312xhaValueOf16.setShowUnderline(false);
        }
        if (tacticsInsideItemData.getTvColor() != 0 && (c55312xhaValueOf2 = wnx.AEQbTJ().valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(tacticsInsideItemData.getTvColor());
        }
        if (tacticsInsideItemData.getTextStyle() != 0 && (c55312xhaValueOf = wnx.AEQbTJ().valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextAppearance(tacticsInsideItemData.getTextStyle());
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsInsideItemData.getDoubtMsg())) {
            C55312xha c55312xhaValueOf17 = c55258xgZAEQbTJ.valueOf();
            if (c55312xhaValueOf17 != null) {
                c55312xhaValueOf17.setShowUnderline(true);
            }
            c55258xgZAEQbTJ.setOnClickListener(new Activity(c55258xgZAEQbTJ, 1000L, this, tacticsInsideItemData));
        }
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        function0.invoke();
    }
}
