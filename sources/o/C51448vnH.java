package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.uilab.item.OKRegularCell;
import com.okinc.unify_trade.bot.list.SortOption;
import com.okinc.unify_trade.bot.list.SortOrder;
import com.okinc.unify_trade.bot.list.SortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C51448vnH;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51448vnH extends AbstractC49945uyC<AbstractC48379uPh, BotOrderListPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public SortOption AEQbTJ;
    public Function1<? super SortOption, Unit> OLrzqt;
    public final boolean KWHzl = true;
    public final java.util.List<ActionBar> djBIcL = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.zblBkD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super SortOption, Unit> function1) {
        this.OLrzqt = function1;
    }

    @Override // o.AbstractC49945uyC
    public boolean fetchVPNInfo() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.vnH$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vnH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C51448vnH AEQbTJ(@NotNull SortOption sortOption) {
            Intrinsics.checkNotNullParameter(sortOption, "");
            C51448vnH c51448vnH = new C51448vnH();
            c51448vnH.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("SORT_OPTION_KEY", sortOption)));
            return c51448vnH;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        SortOption sortOption;
        java.lang.Object parcelable;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            sortOption = new SortOption((SortType) null, (SortOrder) null, 3, (DefaultConstructorMarker) null);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable("SORT_OPTION_KEY", SortOption.class);
            } else {
                java.lang.Object parcelable2 = arguments.getParcelable("SORT_OPTION_KEY");
                if (!(parcelable2 instanceof SortOption)) {
                    parcelable2 = null;
                }
                parcelable = (SortOption) parcelable2;
            }
            sortOption = (SortOption) parcelable;
            if (sortOption == null) {
            }
        }
        this.AEQbTJ = sortOption;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = getString(C48033uCm.Fragment.OhcwxsRkSIEV);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vnQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51448vnH.AEQbTJ(this.EZpvd, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C51448vnH c51448vnH, android.view.View view) {
        c51448vnH.copydefault();
        Function1<? super SortOption, Unit> function1 = c51448vnH.OLrzqt;
        if (function1 != null) {
            SortOption sortOption = c51448vnH.AEQbTJ;
            if (sortOption == null) {
                Intrinsics.gEmmrt("");
                sortOption = null;
            }
            function1.invoke(sortOption);
        }
        c51448vnH.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
        C32866mlf.onEvent$default("BotDetails_Sorting_ALL_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    private final void isConnected() {
        SortOrder order;
        SortOrder order2;
        this.djBIcL.clear();
        java.util.List<ActionBar> list = this.djBIcL;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        SortType sortType = SortType.CREATE_TIME;
        java.lang.String apiValue = sortType.getApiValue();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setMetadata);
        SortOrder sortOrder = SortOrder.DESCENDING;
        SortOption sortOption = this.AEQbTJ;
        SortOption sortOption2 = null;
        if (sortOption == null) {
            Intrinsics.gEmmrt("");
            sortOption = null;
        }
        listOLrzqt.add(new ActionBar(apiValue, strAYXKKw, sortOrder, sortOption.getType() == sortType));
        if (!Intrinsics.EZpvd((java.lang.Object) OLrzqt().valueOf().getBotType(), (java.lang.Object) "smart_iceberg") && !Intrinsics.EZpvd((java.lang.Object) OLrzqt().valueOf().getBotType(), (java.lang.Object) "arbitrage") && !Intrinsics.EZpvd((java.lang.Object) OLrzqt().valueOf().getBotType(), (java.lang.Object) "twap")) {
            SortType sortType2 = SortType.PNL_PERCENT;
            java.lang.String apiValue2 = sortType2.getApiValue();
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.QBiWsm);
            SortOption sortOption3 = this.AEQbTJ;
            if (sortOption3 == null) {
                Intrinsics.gEmmrt("");
                sortOption3 = null;
            }
            if (sortOption3.getType() == sortType2) {
                SortOption sortOption4 = this.AEQbTJ;
                if (sortOption4 == null) {
                    Intrinsics.gEmmrt("");
                    sortOption4 = null;
                }
                order2 = sortOption4.getOrder();
            } else {
                order2 = SortOrder.ASCENDING;
            }
            SortOption sortOption5 = this.AEQbTJ;
            if (sortOption5 == null) {
                Intrinsics.gEmmrt("");
                sortOption5 = null;
            }
            listOLrzqt.add(new ActionBar(apiValue2, strAYXKKw2, order2, sortOption5.getType() == sortType2));
        }
        SortType sortType3 = SortType.COIN_NAME;
        java.lang.String apiValue3 = sortType3.getApiValue();
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C48033uCm.Fragment.iMXFZQ);
        SortOption sortOption6 = this.AEQbTJ;
        if (sortOption6 == null) {
            Intrinsics.gEmmrt("");
            sortOption6 = null;
        }
        if (sortOption6.getType() == sortType3) {
            SortOption sortOption7 = this.AEQbTJ;
            if (sortOption7 == null) {
                Intrinsics.gEmmrt("");
                sortOption7 = null;
            }
            order = sortOption7.getOrder();
        } else {
            order = SortOrder.ASCENDING;
        }
        SortOption sortOption8 = this.AEQbTJ;
        if (sortOption8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            sortOption2 = sortOption8;
        }
        listOLrzqt.add(new ActionBar(apiValue3, strAYXKKw3, order, sortOption2.getType() == sortType3));
        list.addAll(C56402yEa.fARcdN(listOLrzqt));
        values().copydefault.setLayoutManager(new LinearLayoutManager(requireContext()));
        values().copydefault.setAdapter(new StateListAnimator(this, this.djBIcL, new Function1() { // from class: o.vnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51448vnH.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        RecyclerView.Adapter adapter = values().copydefault.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public static final Unit EZpvd(C51448vnH c51448vnH, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (ActionBar actionBar : c51448vnH.djBIcL) {
            if (!Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) str)) {
                actionBar.AEQbTJ(false);
            } else {
                actionBar.AEQbTJ(true);
                SortOrder sortOrderOLrzqt = actionBar.OLrzqt();
                SortOrder sortOrder = SortOrder.DESCENDING;
                if (sortOrderOLrzqt == sortOrder) {
                    actionBar.AEQbTJ(SortOrder.ASCENDING);
                } else {
                    actionBar.AEQbTJ(sortOrder);
                }
            }
        }
        RecyclerView.Adapter adapter = c51448vnH.values().copydefault.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vnH$ActionBar */
    public static final class ActionBar {
        public boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public SortOrder copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, SortOrder sortOrder, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.EZpvd;
            }
            if ((i & 4) != 0) {
                sortOrder = actionBar.copydefault;
            }
            if ((i & 8) != 0) {
                z = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(str, str2, sortOrder, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull SortOrder sortOrder) {
            Intrinsics.checkNotNullParameter(sortOrder, "");
            this.copydefault = sortOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SortOrder sortOrder, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sortOrder, "");
            return new ActionBar(str, str2, sortOrder, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SortOrder OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && this.copydefault == actionBar.copydefault && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SortItem(id=" + this.KWHzl + ", name=" + this.EZpvd + ", order=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SortOrder sortOrder, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sortOrder, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.copydefault = sortOrder;
            this.AEQbTJ = z;
        }
    }

    /* JADX INFO: renamed from: o.vnH$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.Adapter<C0985StateListAnimator> {
        public final Function1<java.lang.String, Unit> AEQbTJ;
        public final /* synthetic */ C51448vnH KWHzl;
        public final java.util.List<ActionBar> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull C51448vnH c51448vnH, @NotNull java.util.List<ActionBar> list, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = c51448vnH;
            this.copydefault = list;
            this.AEQbTJ = function1;
        }

        /* JADX INFO: renamed from: o.vnH$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public final class C0985StateListAnimator extends RecyclerView.ViewHolder {
            public final OKRegularCell AEQbTJ;
            public final android.widget.ImageView EZpvd;
            public final android.widget.TextView OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKRegularCell AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0985StateListAnimator(@NotNull StateListAnimator stateListAnimator, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = stateListAnimator;
                android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.DcMfJKdMCrTj);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.AEQbTJ = (OKRegularCell) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.getSmallIconBitmap);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.EZpvd = (android.widget.ImageView) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.onSeekTo);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.OLrzqt = (android.widget.TextView) viewFindViewById3;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C0985StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C48033uCm.Activity.dzCpvv, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new C0985StateListAnimator(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0985StateListAnimator c0985StateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(c0985StateListAnimator, "");
            final ActionBar actionBar = this.copydefault.get(i);
            c0985StateListAnimator.AEQbTJ().setTitle(actionBar.EZpvd());
            c0985StateListAnimator.EZpvd().setVisibility(8);
            c0985StateListAnimator.OLrzqt().setVisibility(8);
            if (actionBar.copydefault()) {
                if (!Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) SortType.CREATE_TIME.getApiValue())) {
                    if (Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) SortType.PNL_PERCENT.getApiValue())) {
                        c0985StateListAnimator.EZpvd().setVisibility(8);
                        c0985StateListAnimator.OLrzqt().setVisibility(0);
                        if (actionBar.OLrzqt() == SortOrder.DESCENDING) {
                            c0985StateListAnimator.OLrzqt().setText(C33070mpX.AYXKKw(C55688xof.Application.invokeSuspendlambda0));
                            c0985StateListAnimator.OLrzqt().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DTwDnp), (android.graphics.drawable.Drawable) null);
                        } else {
                            c0985StateListAnimator.OLrzqt().setText(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1));
                            c0985StateListAnimator.OLrzqt().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLIhJrIAr), (android.graphics.drawable.Drawable) null);
                        }
                    } else {
                        c0985StateListAnimator.EZpvd().setVisibility(8);
                        c0985StateListAnimator.OLrzqt().setVisibility(0);
                        if (actionBar.OLrzqt() == SortOrder.DESCENDING) {
                            c0985StateListAnimator.OLrzqt().setText(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawn1));
                            c0985StateListAnimator.OLrzqt().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DTwDnp), (android.graphics.drawable.Drawable) null);
                        } else {
                            c0985StateListAnimator.OLrzqt().setText(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawn2));
                            c0985StateListAnimator.OLrzqt().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLIhJrIAr), (android.graphics.drawable.Drawable) null);
                        }
                    }
                } else {
                    c0985StateListAnimator.EZpvd().setVisibility(0);
                    c0985StateListAnimator.OLrzqt().setVisibility(8);
                }
            }
            c0985StateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.vnP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51448vnH.StateListAnimator.AEQbTJ(this.copydefault, actionBar, view);
                }
            });
        }

        public static final void AEQbTJ(StateListAnimator stateListAnimator, ActionBar actionBar, android.view.View view) {
            stateListAnimator.AEQbTJ.invoke(actionBar.KWHzl());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }
    }

    public final void copydefault() {
        for (ActionBar actionBar : this.djBIcL) {
            if (actionBar.copydefault()) {
                SortOption sortOption = new SortOption(SortType.Companion.EZpvd(actionBar.KWHzl()), actionBar.OLrzqt());
                this.AEQbTJ = sortOption;
                if (sortOption.getType() == SortType.CREATE_TIME) {
                    SortOption sortOption2 = this.AEQbTJ;
                    if (sortOption2 == null) {
                        Intrinsics.gEmmrt("");
                        sortOption2 = null;
                    }
                    this.AEQbTJ = SortOption.copy$default(sortOption2, null, SortOrder.DESCENDING, 1, null);
                }
            }
        }
    }
}
