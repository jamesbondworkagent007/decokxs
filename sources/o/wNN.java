package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wNN extends AbstractC59533zio<DetailsData, StateListAnimator> {
    public final Function1<DetailsData, Unit> AEQbTJ;
    public final int AYXKKw;
    public final Function1<DetailsData, Unit> EZpvd;
    public final boolean KWHzl;
    public final int OLrzqt;
    public final boolean copydefault;
    public final Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public wNN() {
        this(0, false, false, 0, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r6v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000d: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 boolean) : false)
  (wrap:int:0x0019: TERNARY null = ((wrap:int:0x0013: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (12 int) : (r9v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001a: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r10v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r11v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r12v0 kotlin.jvm.functions.Function1))
 A[MD:(int, boolean, boolean, int, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit>):void (m)] (LINE:143) call: o.wNN.<init>(int, boolean, boolean, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ wNN(int i, boolean z, boolean z2, int i2, Function1 function1, Function1 function12, Function1 function13, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) == 0 ? z2 : false, (i3 & 8) != 0 ? 12 : i2, (i3 & 16) != 0 ? null : function1, (i3 & 32) != 0 ? null : function12, (i3 & 64) != 0 ? null : function13);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Triple<? extends com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, ? extends java.lang.Object, com.okinc.unify_trade.bot.data.TacticsInsideItemData>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wNN(int i, boolean z, boolean z2, int i2, Function1<? super DetailsData, Unit> function1, Function1<? super DetailsData, Unit> function12, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function13) {
        this.OLrzqt = i;
        this.copydefault = z;
        this.KWHzl = z2;
        this.AYXKKw = i2;
        this.EZpvd = function1;
        this.AEQbTJ = function12;
        this.djBIcL = function13;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.dIjzlO, viewGroup, false);
        viewInflate.setPadding(0, C55298xhM.dpInt$default(this.AYXKKw, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(detailsData, "");
        if (this.KWHzl) {
            stateListAnimator.KWHzl().setVisibility(8);
        } else {
            stateListAnimator.KWHzl().setVisibility(0);
            stateListAnimator.KWHzl().setCurrentLevel(detailsData.getAdl());
        }
        stateListAnimator.gEmmrt().setVisibility(detailsData.getCompletedCycles().length() > 0 ? 0 : 8);
        stateListAnimator.gEmmrt().setText(C33069mpW.copydefault(C55688xof.Application.QSBOWP, C56423yEv.EZpvd(C56390yDp.OLrzqt("cycleNum", C33129mqd.addS$default(detailsData.getCompletedCycles(), 1, null, null, null, 14, null)))));
        stateListAnimator.AEQbTJ().setLayoutManager(new GridLayoutManager(stateListAnimator.AEQbTJ().getContext(), this.OLrzqt));
        if (stateListAnimator.AEQbTJ().getItemDecorationCount() == 0) {
            RecyclerView recyclerViewAEQbTJ = stateListAnimator.AEQbTJ();
            int i = this.OLrzqt;
            android.content.Context context = stateListAnimator.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerViewAEQbTJ.addItemDecoration(new C57584ylF(i, 0, C33052mpF.EZpvd(16.0f, context)));
        }
        stateListAnimator.AEQbTJ().setNestedScrollingEnabled(false);
        RecyclerView recyclerViewAEQbTJ2 = stateListAnimator.AEQbTJ();
        C59534zip c59534zip = new C59534zip();
        android.content.Context context2 = stateListAnimator.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context2, detailsData, this.copydefault, this.OLrzqt, false, null, null, this.djBIcL, WalletImportError.ERROR_CODE_AA_EXIST, null));
        recyclerViewAEQbTJ2.setAdapter(c59534zip);
        RecyclerView.Adapter adapter = stateListAnimator.AEQbTJ().getAdapter();
        Intrinsics.copydefault(adapter, "");
        C59534zip c59534zip2 = (C59534zip) adapter;
        java.util.List subData = detailsData.getSubData();
        if (subData == null) {
            subData = yDY.AhwBna();
        }
        C33064mpR.OLrzqt(c59534zip2, (java.util.List<? extends java.lang.Object>) subData);
        stateListAnimator.EZpvd().setVisibility(Intrinsics.EZpvd((java.lang.Object) detailsData.getState(), (java.lang.Object) "no_close_position") ? 0 : 8);
        android.widget.TextView textViewCopydefault = stateListAnimator.copydefault();
        textViewCopydefault.setOnClickListener(new Application(textViewCopydefault, 1000L, this, detailsData));
        android.widget.TextView textViewOLrzqt = stateListAnimator.OLrzqt();
        textViewOLrzqt.setOnClickListener(new TaskDescription(textViewOLrzqt, 1000L, this, detailsData));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ wNN EZpvd;
        public final /* synthetic */ DetailsData KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wNN wnn, DetailsData detailsData) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = wnn;
            this.KWHzl = detailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.EZpvd;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wNN OLrzqt;
        public final /* synthetic */ DetailsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, wNN wnn, DetailsData detailsData) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = wnn;
            this.copydefault = detailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.copydefault);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class StateListAnimator extends RecyclerView.ViewHolder {
        public RecyclerView AEQbTJ;
        public android.widget.LinearLayout EZpvd;
        public android.widget.TextView KWHzl;
        public android.widget.TextView OLrzqt;
        public C49946uyD copydefault;
        public android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C49946uyD KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.valueOf;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.fetchVPNInfo);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (C49946uyD) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.IResultReceiverStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (RecyclerView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.getIconBitmap);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.EZpvd = (android.widget.LinearLayout) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.init);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.pauseLocationServices);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.updateResourcesConfigurationForNightMode);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.valueOf = (android.widget.TextView) viewFindViewById6;
        }
    }
}
