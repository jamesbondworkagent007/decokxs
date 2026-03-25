package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class wNH extends AbstractC59533zio<ItemData, ActionBar> {
    public final Function1<ItemData, Unit> AEQbTJ;
    public final Function1<java.lang.String, Unit> EZpvd;
    public final Function1<ItemData, Unit> KWHzl;
    public final Function1<ItemData, Unit> OLrzqt;
    public final Function1<ItemData, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public wNH() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r6v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r7v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r8v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r9v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>):void (m)] (LINE:56) call: o.wNH.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ wNH(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wNH(Function1<? super ItemData, Unit> function1, Function1<? super ItemData, Unit> function12, Function1<? super java.lang.String, Unit> function13, Function1<? super ItemData, Unit> function14, Function1<? super ItemData, Unit> function15) {
        this.copydefault = function1;
        this.OLrzqt = function12;
        this.EZpvd = function13;
        this.AEQbTJ = function14;
        this.KWHzl = function15;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.aKhcqp, viewGroup, false);
        Intrinsics.copydefault(viewDataBindingInflate, "");
        android.view.View root = ((AbstractC48486uTe) viewDataBindingInflate).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return new ActionBar(this, root);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull final ItemData itemData) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55318xhg c55318xhgEZpvd;
        C55320xhi c55320xhiKWHzl3;
        C55320xhi c55320xhiKWHzl4;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl5;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(itemData, "");
        if (itemData.OLrzqt()) {
            actionBar.AEQbTJ().setPaddingRelative(0, 0, 0, 0);
        }
        if (itemData.fJNWhG()) {
            actionBar.copydefault().setVisibility(8);
            actionBar.AYXKKw().setVisibility(8);
            actionBar.djBIcL().setVisibility(8);
            actionBar.AhwBna().setVisibility(0);
            return;
        }
        actionBar.copydefault().setVisibility(0);
        ItemDataToggle itemDataToggleAkhnZx = itemData.AkhnZx();
        if (itemDataToggleAkhnZx != null && itemDataToggleAkhnZx.OLrzqt()) {
            actionBar.AYXKKw().setVisibility(8);
            actionBar.KWHzl().setVisibility(8);
            actionBar.gEmmrt().setVisibility(0);
        } else {
            actionBar.AYXKKw().setVisibility(itemData.getFieldNames() ^ true ? 0 : 8);
            actionBar.KWHzl().setVisibility(itemData.getFieldNames() ? 0 : 8);
        }
        actionBar.djBIcL().setVisibility(0);
        actionBar.AhwBna().setVisibility(8);
        C55312xha c55312xhaValueOf2 = actionBar.copydefault().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl5 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl5.setLineSpacing(C55298xhM.sp2pxFloat$default(3.0f, null, 1, null), 1.0f);
        }
        C55312xha c55312xhaValueOf3 = actionBar.copydefault().valueOf();
        if (c55312xhaValueOf3 != null) {
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) itemData.AuCTel())) || (itemData.djBIcL() instanceof TacticsUiConst.BotListSubItemType.BotSubTip)) {
                c55312xhaValueOf3.OLrzqt();
            } else {
                c55312xhaValueOf3.copydefault();
            }
            C55320xhi c55320xhiKWHzl6 = c55312xhaValueOf3.KWHzl();
            if (c55320xhiKWHzl6 != null) {
                c55320xhiKWHzl6.setText(itemData.fIwbmz());
            }
            c55312xhaValueOf3.setOnClickListener(new TaskDescription(c55312xhaValueOf3, 1000L, itemData, this));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) itemData.EZpvd()) && (c55312xhaValueOf = actionBar.copydefault().valueOf()) != null) {
            c55312xhaValueOf.OLrzqt();
            c55312xhaValueOf.setOnClickListener(new LoaderManager(c55312xhaValueOf, 1000L, this, itemData));
        }
        if (itemData.ejfBZ()) {
            actionBar.AYXKKw().setTextWeight(500);
        }
        C55312xha c55312xhaValueOf4 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl4 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl4.setTextColor(itemData.isConnected() != 0 ? itemData.isConnected() : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        C55312xha c55312xhaValueOf5 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl3 = c55312xhaValueOf5.KWHzl()) != null) {
            java.lang.String strDbNXlk = itemData.DbNXlk();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
                strDbNXlk = "--";
            }
            c55320xhiKWHzl3.setText(C33061mpO.setupSpanStyles$default(strDbNXlk, new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.wNK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wNH.EZpvd((java.util.List) obj);
                }
            }, 10, null));
        }
        C55312xha c55312xhaValueOf6 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf6 != null) {
            c55312xhaValueOf6.setShowUnderline(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) itemData.iwGUEr()));
        }
        C55312xha c55312xhaValueOf7 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf7 != null && (c55318xhgEZpvd = c55312xhaValueOf7.EZpvd()) != null) {
            c55318xhgEZpvd.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) itemData.KWHzl()) ^ true ? 0 : 8);
        }
        C55312xha c55312xhaValueOf8 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf8 != null && (c55320xhiKWHzl2 = c55312xhaValueOf8.KWHzl()) != null) {
            c55320xhiKWHzl2.setGravity(8388613);
        }
        C55312xha c55312xhaValueOf9 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf9 != null && (c55320xhiKWHzl = c55312xhaValueOf9.KWHzl()) != null) {
            c55320xhiKWHzl.setLineSpacing(C55298xhM.sp2pxFloat$default(3.0f, null, 1, null), 1.0f);
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) itemData.KWHzl())) {
            actionBar.AYXKKw().setAttachmentViewId(AEQbTJ(itemData.KWHzl()));
        }
        C55312xha c55312xhaValueOf10 = actionBar.AYXKKw().valueOf();
        if (c55312xhaValueOf10 != null) {
            c55312xhaValueOf10.setOnClickListener(new Application(c55312xhaValueOf10, 1000L, itemData, this));
        }
        actionBar.KWHzl().setText(itemData.valueOf());
        if (itemData.isConnected() != 0) {
            actionBar.KWHzl().setTextColor(itemData.isConnected());
        } else {
            actionBar.KWHzl().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        AppCompatTextView appCompatTextViewKWHzl = actionBar.KWHzl();
        appCompatTextViewKWHzl.setOnClickListener(new StateListAnimator(appCompatTextViewKWHzl, 1000L, this, itemData));
        wUE.OLrzqt.KWHzl(actionBar.OLrzqt(), wUE.Application.m8784constructorimpl$default(itemData.fetchVPNInfo(), null, 2, null));
        if (itemData.copydefault() > 0) {
            int iDpInt$default = C55298xhM.dpInt$default(itemData.copydefault(), (android.content.Context) null, 1, (java.lang.Object) null);
            ViewGroup.LayoutParams layoutParams = actionBar.EZpvd().getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = iDpInt$default;
            marginLayoutParams.height = iDpInt$default;
            actionBar.EZpvd().setLayoutParams(marginLayoutParams);
        }
        actionBar.EZpvd().setVisibility(itemData.values() ? 0 : 8);
        actionBar.valueOf().setVisibility((actionBar.EZpvd().getVisibility() == 0 || actionBar.AYXKKw().getVisibility() == 0 || actionBar.gEmmrt().getVisibility() == 0) ? 0 : 8);
        android.widget.FrameLayout frameLayoutEZpvd = actionBar.EZpvd();
        frameLayoutEZpvd.setOnClickListener(new Activity(frameLayoutEZpvd, 1000L, this, itemData));
        if (itemData.isConnected() != 0) {
            actionBar.AYXKKw().setTextColor(itemData.isConnected());
        } else {
            actionBar.AYXKKw().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        C55239xgG c55239xgGGEmmrt = actionBar.gEmmrt();
        c55239xgGGEmmrt.setOKDSSize(-5);
        ItemDataToggle itemDataToggleAkhnZx2 = itemData.AkhnZx();
        c55239xgGGEmmrt.setChecked(itemDataToggleAkhnZx2 != null && itemDataToggleAkhnZx2.KWHzl());
        c55239xgGGEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                wNH.EZpvd(this.EZpvd, itemData, compoundButton, z);
            }
        });
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ItemData EZpvd;
        public final /* synthetic */ wNH OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wNH wnh, ItemData itemData) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = wnh;
            this.EZpvd = itemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.OLrzqt;
                if (function1 != null) {
                    function1.invoke(this.EZpvd);
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ItemData KWHzl;
        public final /* synthetic */ wNH OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ItemData itemData, wNH wnh) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = itemData;
            this.OLrzqt = wnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1 function1;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.KWHzl.iwGUEr())) {
                    Function1 function12 = this.OLrzqt.EZpvd;
                    if (function12 != null) {
                        function12.invoke(this.KWHzl.iwGUEr());
                        return;
                    }
                    return;
                }
                if (!this.KWHzl.fARcdN() || (function1 = this.OLrzqt.OLrzqt) == null) {
                    return;
                }
                function1.invoke(this.KWHzl);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ wNH AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ItemData OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, wNH wnh, ItemData itemData) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = wnh;
            this.OLrzqt = itemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.AEQbTJ.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt);
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wNH OLrzqt;
        public final /* synthetic */ ItemData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wNH wnh, ItemData itemData) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = wnh;
            this.copydefault = itemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.OLrzqt;
                if (function1 != null) {
                    function1.invoke(this.copydefault);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ wNH AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ItemData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ItemData itemData, wNH wnh) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = itemData;
            this.AEQbTJ = wnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1 function1;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.copydefault.AuCTel()) || (this.copydefault.djBIcL() instanceof TacticsUiConst.BotListSubItemType.BotSubTip)) && (function1 = this.AEQbTJ.copydefault) != null) {
                    function1.invoke(this.copydefault);
                }
            }
        }
    }

    public static final void EZpvd(wNH wnh, ItemData itemData, android.widget.CompoundButton compoundButton, boolean z) {
        Function1<ItemData, Unit> function1 = wnh.KWHzl;
        if (function1 != null) {
            ItemDataToggle itemDataToggleAkhnZx = itemData.AkhnZx();
            function1.invoke(itemData.copydefault((15728639 & 1) != 0 ? itemData.title : null, (15728639 & 2) != 0 ? itemData.text : null, (15728639 & 4) != 0 ? itemData.isLine : false, (15728639 & 8) != 0 ? itemData.rightTvColor : 0, (15728639 & 16) != 0 ? itemData.rightImage : null, (15728639 & 32) != 0 ? itemData.isDoubt : null, (15728639 & 64) != 0 ? itemData.isMedium : false, (15728639 & 128) != 0 ? itemData.isRightClickable : false, (15728639 & 256) != 0 ? itemData.isRightDoubt : null, (15728639 & 512) != 0 ? itemData.isRightEditable : false, (15728639 & 1024) != 0 ? itemData.isRightEnter : false, (15728639 & 2048) != 0 ? itemData.rightClickType : null, (15728639 & 4096) != 0 ? itemData.rightClickValue : null, (15728639 & 8192) != 0 ? itemData.showAvatar : false, (15728639 & 16384) != 0 ? itemData.rightEnterText : null, (15728639 & 32768) != 0 ? itemData.rightEditType : null, (15728639 & 65536) != 0 ? itemData.iconWidth : 0, (15728639 & 131072) != 0 ? itemData.disablePadding : false, (15728639 & 262144) != 0 ? itemData.attachViewType : null, (15728639 & 524288) != 0 ? itemData.leftDoubtTitle : null, (15728639 & 1048576) != 0 ? itemData.rightToggle : itemDataToggleAkhnZx != null ? ItemDataToggle.copy$default(itemDataToggleAkhnZx, false, z, 1, null) : null, (15728639 & 2097152) != 0 ? itemData.leftSubItemType : null, (15728639 & 4194304) != 0 ? itemData.leftAttachViewType : null, (15728639 & 8388608) != 0 ? itemData.leftText : null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r2.equals("start_condition") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r2.equals("show_auto_stake_profit") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2.equals("grid_num") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r2.equals("tp") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2.equals("sl") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r2.equals("edit_smart_earn") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        if (r2.equals("show_auto_earn_profit") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        if (r2.equals("forbidden_block_tp") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        if (r2.equals("forbidden_block_sl") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return o.C48033uCm.Activity.DPVBvL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return o.C48033uCm.Activity.AxsJAYaxsJAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return o.C48033uCm.Activity.OKSWiw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2.equals("stop_condition") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2.equals("price_range") == false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(java.lang.String str) {
        switch (str.hashCode()) {
            case -1999158063:
                break;
            case -1999158028:
                break;
            case -1704132114:
                if (str.equals("grid_profit_show_negative_profit")) {
                    return C48033uCm.Activity.QOeQqh;
                }
                return -1;
            case -1632678308:
                if (str.equals("grid_out_of_range_warning")) {
                    return C48033uCm.Activity.zlzhuY;
                }
                return -1;
            case -1001798915:
                break;
            case -744203805:
                break;
            case 3673:
                break;
            case 3708:
                break;
            case 318395149:
                break;
            case 817027703:
                break;
            case 1071284568:
                if (str.equals("edit_smart_earn_disabled")) {
                    return C48033uCm.Activity.adwzgZ;
                }
                return -1;
            case 1637026727:
                if (str.equals("WithdrawProfitIcon")) {
                    return C48033uCm.Activity.setProfilesSinceInitCount;
                }
                return -1;
            case 1851562366:
                break;
            case 1884189383:
                break;
            case 2013254942:
                break;
            default:
                return -1;
        }
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final /* synthetic */ wNH AYXKKw;
        public final C55239xgG AhwBna;
        public final android.view.View DbNXlk;
        public final android.widget.FrameLayout EZpvd;
        public final C55258xgZ KWHzl;
        public final android.widget.LinearLayout OLrzqt;
        public final AppCompatTextView copydefault;
        public final ConstraintLayout djBIcL;
        public final C55258xgZ gEmmrt;
        public final android.widget.Space valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55258xgZ AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AhwBna() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.FrameLayout EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppCompatTextView KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55258xgZ copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.Space djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55239xgG gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConstraintLayout valueOf() {
            return this.djBIcL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull wNH wnh, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AYXKKw = wnh;
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.saveState);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            C55258xgZ c55258xgZ = (C55258xgZ) viewFindViewById;
            this.gEmmrt = c55258xgZ;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.ComponentActivityExternalSyntheticLambda2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AhwBna = (C55239xgG) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi217);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (C55258xgZ) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.validateRelationship);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.OLrzqt = (android.widget.LinearLayout) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.QIZEnU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.EZpvd = (android.widget.FrameLayout) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.removeOnNewIntentListener);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.djBIcL = (ConstraintLayout) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C48033uCm.Application.QDqgQU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C48033uCm.Application.reportFullyDrawn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.copydefault = (AppCompatTextView) viewFindViewById8;
            android.view.View viewFindViewById9 = view.findViewById(C48033uCm.Application.ActivityResultCallerLauncherresultContract2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
            this.valueOf = (android.widget.Space) viewFindViewById9;
            android.view.View viewFindViewById10 = view.findViewById(C48033uCm.Application.updateStateFromTypedArray);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
            this.DbNXlk = viewFindViewById10;
            c55258xgZ.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        }
    }
}
