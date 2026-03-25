package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52503wNv extends AbstractC59533zio<DetailsData, StateListAnimator> {
    public final Function1<DetailsData, Unit> AEQbTJ;
    public final android.app.Activity EZpvd;
    public final Function1<DetailsData, Unit> KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<DetailsData, Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.app.Activity)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(android.app.Activity, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit>):void (m)] (LINE:36) call: o.wNv.<init>(android.app.Activity, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52503wNv(android.app.Activity activity, Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function12, (i & 8) != 0 ? null : function13);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.DetailsData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52503wNv(@NotNull android.app.Activity activity, Function1<? super DetailsData, Unit> function1, Function1<? super java.lang.String, Unit> function12, Function1<? super DetailsData, Unit> function13) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
        this.KWHzl = function1;
        this.OLrzqt = function12;
        this.AEQbTJ = function13;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.onStatusChanged, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    public final void OLrzqt(@NotNull android.widget.TextView textView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(detailsData, "");
        int i = 0;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) detailsData.getSchedule())) {
            stateListAnimator.AEQbTJ().setCurrentLevel(detailsData.getSchedule());
            stateListAnimator.AEQbTJ().setVisibility(0);
        }
        stateListAnimator.KWHzl().setVisibility(detailsData.getShowCancel() ? 0 : 8);
        android.widget.TextView textViewKWHzl = stateListAnimator.KWHzl();
        textViewKWHzl.setOnClickListener(new ActionBar(textViewKWHzl, 1000L, this, detailsData));
        if (detailsData.getTitleRightDrawable()) {
            stateListAnimator.AYXKKw().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DGOPHZDGOPHZ), (android.graphics.drawable.Drawable) null);
            android.widget.TextView textViewAYXKKw = stateListAnimator.AYXKKw();
            textViewAYXKKw.setOnClickListener(new Activity(textViewAYXKKw, 1000L, this, detailsData));
        }
        OLrzqt(stateListAnimator.AYXKKw(), detailsData.getTvTitle());
        OLrzqt(stateListAnimator.valueOf(), detailsData.getTime());
        OLrzqt(stateListAnimator.AhwBna(), detailsData.getType());
        OLrzqt(stateListAnimator.EZpvd(), detailsData.getFondType());
        OLrzqt(stateListAnimator.gEmmrt(), C56033xvF.getBotLever$default(detailsData.getLevel(), false, 2, null));
        if (detailsData.getSideColor() != 0) {
            stateListAnimator.AhwBna().setTextColor(detailsData.getSideColor());
            stateListAnimator.gEmmrt().setTextColor(detailsData.getSideColor());
        }
        if (detailsData.getSideBgColor() != 0) {
            stateListAnimator.AhwBna().setBackgroundTintList(android.content.res.ColorStateList.valueOf(detailsData.getSideBgColor()));
            stateListAnimator.gEmmrt().setBackgroundTintList(android.content.res.ColorStateList.valueOf(detailsData.getSideBgColor()));
        }
        stateListAnimator.copydefault().setLayoutManager(new GridLayoutManager(stateListAnimator.copydefault().getContext(), 2));
        if (stateListAnimator.copydefault().getItemDecorationCount() == 0) {
            RecyclerView recyclerViewCopydefault = stateListAnimator.copydefault();
            android.content.Context context = stateListAnimator.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerViewCopydefault.addItemDecoration(new C57584ylF(2, 0, C33052mpF.EZpvd(16.0f, context)));
        }
        stateListAnimator.copydefault().setNestedScrollingEnabled(false);
        RecyclerView recyclerViewCopydefault2 = stateListAnimator.copydefault();
        C59534zip c59534zip = new C59534zip();
        android.content.Context context2 = stateListAnimator.copydefault().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context2, this.OLrzqt, false, 0, false, null, null, null, 252, null));
        recyclerViewCopydefault2.setAdapter(c59534zip);
        RecyclerView.Adapter adapter = stateListAnimator.copydefault().getAdapter();
        Intrinsics.copydefault(adapter, "");
        C59534zip c59534zip2 = (C59534zip) adapter;
        java.util.ArrayList<TacticsInsideItemData> subData = detailsData.getSubData();
        if (subData == null) {
            subData = new java.util.ArrayList<>();
        }
        C33064mpR.OLrzqt(c59534zip2, subData);
        android.view.View viewOLrzqt = stateListAnimator.OLrzqt();
        try {
            if (getAdapter().getItems().size() - 1 == stateListAnimator.getAdapterPosition()) {
                i = 4;
            }
        } catch (java.lang.Exception unused) {
        }
        viewOLrzqt.setVisibility(i);
    }

    /* JADX INFO: renamed from: o.wNv$StateListAnimator */
    public static class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.TextView AYXKKw;
        public C49946uyD EZpvd;
        public android.widget.TextView KWHzl;
        public android.view.View OLrzqt;
        public RecyclerView copydefault;
        public android.widget.TextView djBIcL;
        public android.widget.TextView gEmmrt;
        public android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C49946uyD AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView valueOf() {
            return this.AYXKKw;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.flushMarshmallows);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.gEmmrt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.shouldAnimateActionModeView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.AppCompatDelegateImplActionBarMenuCallback);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.valueOf = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.onNothingSelected);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.detect);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.AYXKKw = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.ensureSubDecor);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C48033uCm.Application.IResultReceiverStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.copydefault = (RecyclerView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C48033uCm.Application.updateStateFromTypedArray);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.OLrzqt = viewFindViewById8;
            android.view.View viewFindViewById9 = view.findViewById(C48033uCm.Application.fARcdN);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
            this.EZpvd = (C49946uyD) viewFindViewById9;
        }
    }

    /* JADX INFO: renamed from: o.wNv$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52503wNv EZpvd;
        public final /* synthetic */ DetailsData KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52503wNv c52503wNv, DetailsData detailsData) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c52503wNv;
            this.KWHzl = detailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wNv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52503wNv KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ DetailsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52503wNv c52503wNv, DetailsData detailsData) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c52503wNv;
            this.copydefault = detailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1<DetailsData, Unit> function1KWHzl = this.KWHzl.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke(this.copydefault);
                }
            }
        }
    }
}
