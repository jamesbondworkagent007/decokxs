package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.tradingbot.impl.strategy.dialog.ui.BotMoreOperatorPresenter;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53875wtj extends AbstractC49945uyC<AbstractC48399uQa, BotMoreOperatorPresenter> {
    public Function1<? super java.lang.String, Unit> AYXKKw;
    public Function2<? super C53809wsW, ? super TacticsData, Unit> copydefault;
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> djBIcL;
    public TacticsData fetchVPNInfo;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final int AhwBna = C48033uCm.Activity.RKcVTr;
    public final C59534zip valueOf = new C59534zip();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wtm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53875wtj.KWHzl(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wtp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C53875wtj.EZpvd(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wto
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53875wtj.gEmmrt(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.wtj$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TradeLiveData<java.util.ArrayList<java.lang.Object>> tradeLiveData) {
        this.djBIcL = tradeLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super java.lang.String, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function2<? super C53809wsW, ? super TacticsData, Unit> function2) {
        this.copydefault = function2;
    }

    private final java.lang.String isConnected() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String KWHzl(C53875wtj c53875wtj) {
        android.os.Bundle arguments = c53875wtj.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("bot_data") : null;
        return string == null ? "" : string;
    }

    private final boolean ejfBZ() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean EZpvd(C53875wtj c53875wtj) {
        android.os.Bundle arguments = c53875wtj.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("from_detail_page");
        }
        return false;
    }

    public final SmartEarnParamsCheckUseCase.Result copydefault() {
        return (SmartEarnParamsCheckUseCase.Result) this.gEmmrt.getValue();
    }

    public static final SmartEarnParamsCheckUseCase.Result gEmmrt(C53875wtj c53875wtj) {
        android.os.Bundle arguments = c53875wtj.getArguments();
        SmartEarnParamsCheckUseCase.Result result = arguments != null ? (SmartEarnParamsCheckUseCase.Result) arguments.getParcelable("smart_earn_check_result") : null;
        if (result instanceof SmartEarnParamsCheckUseCase.Result) {
            return result;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.wtj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53875wtj copydefault(@NotNull java.lang.String str, boolean z, SmartEarnParamsCheckUseCase.Result result) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("bot_data", str), C56390yDp.OLrzqt("from_detail_page", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("smart_earn_check_result", result));
            C53875wtj c53875wtj = new C53875wtj();
            c53875wtj.setArguments(bundleBundleOf);
            return c53875wtj;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.kcQGz));
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        fIwbmz();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
        this.AYXKKw = null;
        this.djBIcL = null;
    }

    private final void AuCTel() {
        C59534zip c59534zip = this.valueOf;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c59534zip.register(C53809wsW.class, new Activity(contextRequireContext, new Function1() { // from class: o.wtn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53875wtj.EZpvd(this.KWHzl, (C53809wsW) obj);
            }
        }, new Function1() { // from class: o.wtt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53875wtj.AEQbTJ(this.AEQbTJ, (C53809wsW) obj);
            }
        }));
        RecyclerView recyclerView = values().KWHzl;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        values().KWHzl.setAdapter(this.valueOf);
    }

    public static final Unit EZpvd(C53875wtj c53875wtj, C53809wsW c53809wsW) {
        Intrinsics.checkNotNullParameter(c53809wsW, "");
        TacticsData tacticsData = c53875wtj.fetchVPNInfo;
        if (tacticsData != null) {
            Function2<? super C53809wsW, ? super TacticsData, Unit> function2 = c53875wtj.copydefault;
            if (function2 != null) {
                function2.invoke(c53809wsW, tacticsData);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) c53809wsW.OLrzqt(), (java.lang.Object) "pause") && !Intrinsics.EZpvd((java.lang.Object) c53809wsW.OLrzqt(), (java.lang.Object) "resume")) {
                c53875wtj.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53875wtj c53875wtj, C53809wsW c53809wsW) {
        Intrinsics.checkNotNullParameter(c53809wsW, "");
        Function1<? super java.lang.String, Unit> function1 = c53875wtj.AYXKKw;
        if (function1 != null) {
            function1.invoke(c53809wsW.copydefault());
        }
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        TradeLiveData<java.util.ArrayList<java.lang.Object>> tradeLiveData = this.djBIcL;
        if (tradeLiveData != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            tradeLiveData.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wtq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53875wtj.copydefault(this.KWHzl, (java.util.ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o.wtj$Activity */
    public static final class Activity extends AbstractC59533zio<C53809wsW, StateListAnimator> {
        public final Function1<C53809wsW, Unit> AEQbTJ;
        public final Function1<C53809wsW, Unit> KWHzl;
        public final android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<C53809wsW, Unit> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<C53809wsW, Unit> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX INFO: renamed from: o.wtj$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0994Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ Activity KWHzl;
            public final /* synthetic */ C53809wsW OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0994Activity(android.view.View view, long j, C53809wsW c53809wsW, Activity activity) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = c53809wsW;
                this.KWHzl = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                Function1<C53809wsW, Unit> function1AEQbTJ;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    if (this.OLrzqt.EZpvd()) {
                        Function1<C53809wsW, Unit> function1OLrzqt = this.KWHzl.OLrzqt();
                        if (function1OLrzqt != null) {
                            function1OLrzqt.invoke(this.OLrzqt);
                            return;
                        }
                        return;
                    }
                    if (!this.OLrzqt.AEQbTJ() || (function1AEQbTJ = this.KWHzl.AEQbTJ()) == null) {
                        return;
                    }
                    function1AEQbTJ.invoke(this.OLrzqt);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.wsW, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.wsW, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull android.content.Context context, Function1<? super C53809wsW, Unit> function1, Function1<? super C53809wsW, Unit> function12) {
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = context;
            this.AEQbTJ = function1;
            this.KWHzl = function12;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zSsVtY, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new StateListAnimator(viewInflate);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [275=6] */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C53809wsW c53809wsW) {
            java.lang.String strOLrzqt;
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(c53809wsW, "");
            int i = c53809wsW.EZpvd() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
            java.lang.String strKWHzl = c53809wsW.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                java.lang.String strOLrzqt2 = c53809wsW.OLrzqt();
                switch (strOLrzqt2.hashCode()) {
                    case -933078812:
                        strOLrzqt = !strOLrzqt2.equals("DeleteBacktest") ? C56033xvF.OLrzqt(c53809wsW.OLrzqt()) : C33070mpX.AYXKKw(C48033uCm.Fragment.OcIXYQ);
                        break;
                    case -688946819:
                        if (strOLrzqt2.equals("StopAiBot")) {
                            strOLrzqt = C33070mpX.AYXKKw(C55688xof.Application.addTab);
                            break;
                        }
                        break;
                    case -222301146:
                        if (strOLrzqt2.equals("CreateAiBotFromBacktest")) {
                            strOLrzqt = C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
                            break;
                        }
                        break;
                    case 780405820:
                        if (strOLrzqt2.equals("RunBacktestAgain")) {
                            strOLrzqt = C33070mpX.AYXKKw(C48033uCm.Fragment.QKVWgx);
                            break;
                        }
                        break;
                    case 812978030:
                        if (strOLrzqt2.equals("EditBacktestName")) {
                            strOLrzqt = C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder);
                            break;
                        }
                        break;
                    case 1112939579:
                        if (strOLrzqt2.equals("StopBacktest")) {
                            strOLrzqt = C33070mpX.AYXKKw(C48033uCm.Fragment.QOLQEE);
                            break;
                        }
                        break;
                }
            } else {
                strOLrzqt = c53809wsW.KWHzl();
            }
            stateListAnimator.OLrzqt().setText(strOLrzqt);
            stateListAnimator.AEQbTJ().setContentDescription(c53809wsW.OLrzqt());
            android.widget.TextView textViewOLrzqt = stateListAnimator.OLrzqt();
            android.content.Context context = stateListAnimator.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textViewOLrzqt.setTextColor(C33070mpX.OLrzqt(i, context));
            stateListAnimator.copydefault().setImageTintList(ContextCompat.getColorStateList(stateListAnimator.AEQbTJ().getContext(), i));
            Glide.AEQbTJ(stateListAnimator.AEQbTJ().getContext()).AEQbTJ().EZpvd(java.lang.Integer.valueOf(OLrzqt(c53809wsW.OLrzqt()))).OLrzqt(new ActionBar(stateListAnimator));
            android.view.View viewAEQbTJ = stateListAnimator.AEQbTJ();
            viewAEQbTJ.setOnClickListener(new ViewOnClickListenerC0994Activity(viewAEQbTJ, 1000L, c53809wsW, this));
        }

        /* JADX INFO: renamed from: o.wtj$Activity$ActionBar */
        public static final class ActionBar extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
            public final /* synthetic */ StateListAnimator KWHzl;

            @Override // o.InterfaceC5462Sq
            public void a_(android.graphics.drawable.Drawable drawable) {
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(StateListAnimator stateListAnimator) {
                super(28, 28);
                this.KWHzl = stateListAnimator;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                this.KWHzl.copydefault().setImageDrawable(drawable);
            }
        }

        /* JADX INFO: renamed from: o.wtj$Activity$StateListAnimator */
        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public android.view.View EZpvd;
            public android.widget.ImageView KWHzl;
            public android.widget.TextView OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.view.View AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView copydefault() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.EZpvd = view;
                android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.gISBfG);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.KWHzl = (android.widget.ImageView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.onNothingSelected);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.OLrzqt = (android.widget.TextView) viewFindViewById2;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x015d, code lost:
        
            if (r2.equals("strategy_button_start") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0167, code lost:
        
            if (r2.equals("strategy_button_pause") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x019f, code lost:
        
            if (r2.equals("StopAiBot") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01ad, code lost:
        
            if (r2.equals("strategy_button_edit_trading_pairs") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x01df, code lost:
        
            if (r2.equals("resume") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x01e8, code lost:
        
            if (r2.equals("strategy_button_restart") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x0200, code lost:
        
            if (r2.equals("recurring_modify_amount") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:164:0x0224, code lost:
        
            if (r2.equals("edit_name") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
        
            return o.C48033uCm.ActionBar.fARcdN;
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
        
            return o.C52761wXj.TaskDescription.sILrnl;
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
        
            return o.C52761wXj.TaskDescription.iRgjgR;
         */
        /* JADX WARN: Code restructure failed: missing block: B:189:?, code lost:
        
            return o.C52761wXj.TaskDescription.gGvvIC;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        
            if (r2.equals("recurring_invest_more") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:193:?, code lost:
        
            return o.C52761wXj.TaskDescription.DGgkXd;
         */
        /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
        
            return o.C52761wXj.TaskDescription.reset;
         */
        /* JADX WARN: Code restructure failed: missing block: B:198:?, code lost:
        
            return o.C52761wXj.TaskDescription.getConnectivityMgr;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r2.equals("strategy_edit_price_range") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        
            if (r2.equals("STRATEGY_SPOT_GRID__ADD_INVESTMENT") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        
            if (r2.equals("strategy_edit_dca_parameter") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        
            if (r2.equals("StopBacktest") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
        
            if (r2.equals("EditBacktestName") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
        
            if (r2.equals("strategy_button_add_order") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
        
            if (r2.equals("strategy_button_tp_price") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00eb, code lost:
        
            if (r2.equals("strategy_button_tpsl") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
        
            if (r2.equals("strategy_button_stop") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0111, code lost:
        
            if (r2.equals("pause") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0137, code lost:
        
            if (r2.equals("strategy_button_add_investment") == false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x014f, code lost:
        
            if (r2.equals("STRATEGY_SPOT_DCA_ADD_INVESTMENT") == false) goto L167;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int OLrzqt(java.lang.String str) {
            switch (str.hashCode()) {
                case -1866204256:
                    break;
                case -1773919395:
                    if (str.equals("strategy_button_adjust_margin")) {
                        return C52761wXj.TaskDescription.fetchVPNInfo;
                    }
                    return 0;
                case -1655491746:
                    if (str.equals("strategy_button_related_position")) {
                        return C52761wXj.TaskDescription.apHBvG;
                    }
                    return 0;
                case -1411487333:
                    break;
                case -1366787209:
                    if (str.equals("strategy_modify_stop_condition")) {
                        return C52761wXj.TaskDescription.xxhdY;
                    }
                    return 0;
                case -1360252850:
                    break;
                case -934426579:
                    break;
                case -933078812:
                    if (str.equals("DeleteBacktest")) {
                        return C52761wXj.TaskDescription.dTTfOR;
                    }
                    return 0;
                case -918420701:
                    if (str.equals("strategy_button_trading_view_signal")) {
                        return C52761wXj.TaskDescription.AwvSrB;
                    }
                    return 0;
                case -840828177:
                    if (str.equals("un_pin")) {
                        return C52761wXj.TaskDescription.RxVVQC;
                    }
                    return 0;
                case -702985433:
                    break;
                case -688946819:
                    break;
                case -674762535:
                    if (str.equals("view_on_kline")) {
                        return C52761wXj.TaskDescription.OFhtUX;
                    }
                    return 0;
                case -266229020:
                    if (str.equals("strategy_button_adjust_withdrawal")) {
                        return C52761wXj.TaskDescription.warmup;
                    }
                    return 0;
                case -222301146:
                    if (str.equals("CreateAiBotFromBacktest")) {
                        return C52761wXj.TaskDescription.sEAkxl;
                    }
                    return 0;
                case -213435403:
                    break;
                case -210118047:
                    break;
                case -53097185:
                    break;
                case 110997:
                    if (str.equals("pin")) {
                        return C52761wXj.TaskDescription.aBDePw;
                    }
                    return 0;
                case 13978130:
                    break;
                case 36088676:
                    if (str.equals("recurring_modify_price_range")) {
                        return C52761wXj.TaskDescription.fXG;
                    }
                    return 0;
                case 78862271:
                    if (str.equals("SHARE")) {
                        return C52761wXj.TaskDescription.zEkrwr;
                    }
                    return 0;
                case 106440182:
                    break;
                case 149470789:
                    if (str.equals("strategy_modify_start_condition")) {
                        return C52761wXj.TaskDescription.geAOna;
                    }
                    return 0;
                case 270317091:
                    break;
                case 270343158:
                    break;
                case 322024080:
                    if (str.equals("strategy_button_recreate")) {
                        return C52761wXj.TaskDescription.tIwhY;
                    }
                    return 0;
                case 517247550:
                    if (str.equals("SMART_ARB_REDUCE_POSITION")) {
                        return C52761wXj.TaskDescription.aQtmcU;
                    }
                    return 0;
                case 569314151:
                    break;
                case 665232559:
                    break;
                case 700833347:
                    if (str.equals("strategy_cancel_reserve")) {
                        return C52761wXj.TaskDescription.ULRxlR;
                    }
                    return 0;
                case 780405820:
                    if (str.equals("RunBacktestAgain")) {
                        return C52761wXj.TaskDescription.OKvQBs;
                    }
                    return 0;
                case 812978030:
                    break;
                case 937102971:
                    if (str.equals("REINVEST_PROFIT")) {
                        return C52761wXj.TaskDescription.RzdrRQ;
                    }
                    return 0;
                case 1085266328:
                    if (str.equals("modify_active_grid_range")) {
                        return C52761wXj.TaskDescription.DPhTBN;
                    }
                    return 0;
                case 1112939579:
                    break;
                case 1228725827:
                    break;
                case 1435023816:
                    break;
                case 1521663722:
                    if (str.equals("reverse_bot")) {
                        return C52761wXj.TaskDescription.QYNZmZ;
                    }
                    return 0;
                case 1605383006:
                    break;
                case 1654288125:
                    break;
                case 1677034225:
                    if (str.equals("strategy_reserve_stop")) {
                        return C52761wXj.TaskDescription.UscePu;
                    }
                    return 0;
                case 1682788997:
                    if (str.equals("strategy_modify_auto_margin")) {
                        return C52761wXj.TaskDescription.dPaqAf;
                    }
                    return 0;
                case 1688944953:
                    if (str.equals("recurring_modify_frequency")) {
                        return C52761wXj.TaskDescription.DuQ;
                    }
                    return 0;
                default:
                    return 0;
            }
        }
    }

    public static final Unit copydefault(C53875wtj c53875wtj, java.util.ArrayList arrayList) {
        java.lang.Object next;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ((next instanceof TacticsData) && Intrinsics.EZpvd((java.lang.Object) ((TacticsData) next).getAlgoId(), (java.lang.Object) c53875wtj.isConnected())) {
                break;
            }
        }
        if (next != null && (next instanceof TacticsData)) {
            TacticsData tacticsData = (TacticsData) next;
            java.util.List<C53809wsW> listOLrzqt = c53875wtj.OLrzqt().OLrzqt(tacticsData, c53875wtj.ejfBZ());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (C53809wsW c53809wsWCopy$default : listOLrzqt) {
                if (Intrinsics.EZpvd((java.lang.Object) c53809wsWCopy$default.OLrzqt(), (java.lang.Object) "modify_active_grid_range")) {
                    SmartEarnParamsCheckUseCase.Result resultCopydefault = c53875wtj.copydefault();
                    boolean z = (c53875wtj.copydefault() instanceof SmartEarnParamsCheckUseCase.Result.Success) && !tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.ModifySimpleEarn);
                    TacticsVoucherInfo voucherInfo = tacticsData.getVoucherInfo();
                    if (voucherInfo != null && voucherInfo.getHasVoucher()) {
                        strOLrzqt = C33070mpX.AYXKKw(C55688xof.Application.HrFqwD);
                    } else if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "pause")) {
                        strOLrzqt = C33070mpX.AYXKKw(C55688xof.Application.getBitmap);
                    } else {
                        SmartEarnParamsCheckUseCase.Result resultCopydefault2 = c53875wtj.copydefault();
                        if (resultCopydefault2 == null || (strOLrzqt = resultCopydefault2.KWHzl()) == null) {
                            strOLrzqt = C43422row.OLrzqt();
                        }
                    }
                    c53809wsWCopy$default = C53809wsW.copy$default(c53809wsWCopy$default, null, z, strOLrzqt, resultCopydefault, null, null, 49, null);
                }
                arrayList2.add(c53809wsWCopy$default);
            }
            java.util.List<?> items = c53875wtj.valueOf.getItems();
            Intrinsics.copydefault(items, "");
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new StateListAnimator(items, arrayList2));
            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
            c53875wtj.fetchVPNInfo = tacticsData;
            c53875wtj.valueOf.setItems(arrayList2);
            diffResultCalculateDiff.dispatchUpdatesTo(c53875wtj.valueOf);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53875wtj, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53875wtj, false, (java.lang.String) null, 2, (java.lang.Object) null);
        c53875wtj.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, int i) {
        android.view.View root;
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = getContext();
        if (context != null) {
            android.view.View view = getView();
            if (view == null || (root = view.getRootView()) == null) {
                root = values().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
            }
            C55284xgz c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(context, root, str);
            if (c55284xgzAEQbTJ != null) {
                c55284xgzAEQbTJ.isConnected(i);
                c55284xgzAEQbTJ.hDKMBd();
            }
        }
    }

    /* JADX INFO: renamed from: o.wtj$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.Callback {
        public final java.util.List<C53809wsW> EZpvd;
        public final java.util.List<C53809wsW> KWHzl;

        public StateListAnimator(@NotNull java.util.List<C53809wsW> list, @NotNull java.util.List<C53809wsW> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.KWHzl = list;
            this.EZpvd = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.KWHzl.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.EZpvd.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl.get(i).OLrzqt(), (java.lang.Object) this.EZpvd.get(i2).OLrzqt());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(this.KWHzl.get(i), this.EZpvd.get(i2));
        }
    }
}
