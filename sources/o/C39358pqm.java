package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.IndicatorSettingItem;
import com.okinc.kline.ui.view.model.MarketTypeGroup;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C39358pqm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39358pqm extends AbstractC49393unh implements InterfaceC35976oKr, InterfaceC35973oKo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public android.widget.TextView AkhnZx;
    public boolean OLrzqt;
    public Function1<? super MarketTypeSelect, Unit> gEmmrt;
    public TemplateSetting valueOf;
    public RecyclerView values;
    public java.util.ArrayList<java.lang.Object> AhwBna = new java.util.ArrayList<>();
    public final C43316rmw AEQbTJ = new C43316rmw();
    public java.util.ArrayList<java.lang.Integer> djBIcL = new java.util.ArrayList<>();
    public java.lang.String AYXKKw = "";
    public int EZpvd = C55298xhM.dp2px$default(16.0f, null, 1, null);
    public int copydefault = C55298xhM.dp2px$default(24.0f, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35973oKo
    public void AEQbTJ(@NotNull Function1<? super MarketTypeSelect, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35976oKr
    public void OLrzqt(@NotNull oKD okd) {
        Intrinsics.checkNotNullParameter(okd, "");
    }

    /* JADX INFO: renamed from: o.pqm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C39358pqm newInstance$default(TaskDescription taskDescription, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return taskDescription.KWHzl(z, str);
        }

        public final C39358pqm KWHzl(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("kline_is_lite", z);
            bundle.putString(oLT.valueOf(), str);
            C39358pqm c39358pqm = new C39358pqm();
            c39358pqm.setArguments(bundle);
            return c39358pqm;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        oMK.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? arguments.getBoolean("kline_is_lite", false) : false;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString(oLT.valueOf(), "")) != null) {
            str = string;
        }
        this.AYXKKw = str;
        this.values = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.receiveFile);
        this.AkhnZx = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.getVolumeControl);
        AEQbTJ();
        EZpvd();
        OLrzqt();
        copydefault();
        TemplateSetting templateSetting = this.valueOf;
        if (templateSetting != null && (sideIndicatorNames = templateSetting.getSideIndicatorNames()) != null) {
            KWHzl(sideIndicatorNames);
        }
        view.post(new java.lang.Runnable() { // from class: o.pqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39358pqm.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(C39358pqm c39358pqm) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39358pqm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        RecyclerView recyclerView;
        if (!this.OLrzqt || (recyclerView = this.values) == null) {
            return;
        }
        recyclerView.setPadding(this.copydefault, 0, this.EZpvd, 0);
    }

    public final void EZpvd() {
        this.valueOf = C36246oUr.copydefault().KWHzl("ds0");
        this.AhwBna.clear();
        java.util.ArrayList<java.lang.Object> arrayList = this.AhwBna;
        java.lang.String string = getResources().getString(C35964oKf.Fragment.dLBcXg);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(new MarketTypeGroup(string));
        int i = 0;
        java.lang.Object obj = null;
        int i2 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.AhwBna.add(new MarketTypeSelect("VOLUME", false, i, obj, i2, defaultConstructorMarker));
        this.AhwBna.add(new MarketTypeSelect("MA", true, i, obj, i2, defaultConstructorMarker));
        boolean z = false;
        this.AhwBna.add(new MarketTypeSelect("EMA", z, i, obj, i2, defaultConstructorMarker));
        this.AhwBna.add(new MarketTypeSelect("BOLL", z, i, obj, i2, defaultConstructorMarker));
        this.AhwBna.add(new MarketTypeSelect("SAR", z, i, obj, i2, defaultConstructorMarker));
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getChartTag(), (java.lang.Object) "sp_timeinterval_okx_cedefi") && pFS.KWHzl.valueOf()) {
            this.AhwBna.add(new MarketTypeSelect("SR", false, 0, null, 8, null));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "cedefi_mode") && pFS.KWHzl.djBIcL()) {
            this.AhwBna.add(new MarketTypeSelect("SUPERTREND", false, 0, null, 8, null));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "cedefi_mode") && pFS.KWHzl.KWHzl()) {
            this.AhwBna.add(new MarketTypeSelect("ENVELOPE", false, 0, null, 8, null));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "cedefi_mode") && pFS.KWHzl.gEmmrt()) {
            this.AhwBna.add(new MarketTypeSelect("VWAP", false, 0, null, 8, null));
        }
        java.util.ArrayList<java.lang.Object> arrayList2 = this.AhwBna;
        java.lang.String string2 = getResources().getString(C35964oKf.Fragment.izFvvl);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList2.add(new MarketTypeGroup(string2));
        boolean z2 = false;
        int i3 = 1;
        java.lang.Object obj2 = null;
        int i4 = 8;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        this.AhwBna.add(new MarketTypeSelect("VOLUME", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("MACD", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("KDJ", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("SKDJ", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("BOLL", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("RSI", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("StochRSI", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("OBV", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("SAR", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("DMA", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("TRIX", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("VR", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("BRAR", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("EMV", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("WR", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("ROC", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("MTM", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("PSY", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("DMI", z2, i3, obj2, i4, defaultConstructorMarker2));
        this.AhwBna.add(new MarketTypeSelect("CCI", z2, i3, obj2, i4, defaultConstructorMarker2));
        if (!this.OLrzqt && C36246oUr.copydefault().RdAHlO() && pFP.OLrzqt.OLrzqt()) {
            java.util.ArrayList<java.lang.Object> arrayList3 = this.AhwBna;
            java.lang.String string3 = getResources().getString(C35964oKf.Fragment.zFtALg);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList3.add(new MarketTypeGroup(string3));
            boolean z3 = false;
            int i5 = 1;
            java.lang.Object obj3 = null;
            int i6 = 8;
            DefaultConstructorMarker defaultConstructorMarker3 = null;
            this.AhwBna.add(new MarketTypeSelect("OI", z3, i5, obj3, i6, defaultConstructorMarker3));
            this.AhwBna.add(new MarketTypeSelect("LSAcco", z3, i5, obj3, i6, defaultConstructorMarker3));
            this.AhwBna.add(new MarketTypeSelect("LSPos", z3, i5, obj3, i6, defaultConstructorMarker3));
            this.AhwBna.add(new MarketTypeSelect("LSRatio", z3, i5, obj3, i6, defaultConstructorMarker3));
            this.AhwBna.add(new MarketTypeSelect("BSVol", z3, i5, obj3, i6, defaultConstructorMarker3));
        }
        this.AhwBna.add(1);
        this.AhwBna.add(new IndicatorSettingItem(C33070mpX.AYXKKw(C35964oKf.Fragment.aJFbMH)));
    }

    private final void OLrzqt() {
        this.AEQbTJ.register(MarketTypeSelect.class, new Application());
        this.AEQbTJ.register(MarketTypeGroup.class, new Fragment());
        this.AEQbTJ.register(IndicatorSettingItem.class, new ActionBar(new Function1() { // from class: o.pqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39358pqm.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        this.AEQbTJ.register(java.lang.Integer.class, new FragmentManager());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        gridLayoutManager.setSpanSizeLookup(new Dialog());
        RecyclerView recyclerView = this.values;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.values;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.AEQbTJ);
        }
        this.AEQbTJ.setItems(this.AhwBna);
    }

    public static final Unit OLrzqt(C39358pqm c39358pqm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c39358pqm.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pqm$FragmentManager */
    public static final class FragmentManager extends AbstractC59533zio<java.lang.Integer, RecyclerView.ViewHolder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(num, "");
        }

        /* JADX INFO: renamed from: o.pqm$FragmentManager$StateListAnimator */
        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public StateListAnimator(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new StateListAnimator(layoutInflater.inflate(C35964oKf.Application.dmfpNf, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: o.pqm$Dialog */
    public static final class Dialog extends GridLayoutManager.SpanSizeLookup {
        public Dialog() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return C39358pqm.this.AEQbTJ.getItems().get(i) instanceof MarketTypeSelect ? 1 : 4;
        }
    }

    public final void OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.aJFbMH))) {
            dismiss();
            KWHzl();
        }
    }

    public final void KWHzl() {
        android.content.Intent intent = new android.content.Intent(requireContext(), (java.lang.Class<?>) ActivityC37844pCu.class);
        intent.putExtra(oLT.valueOf(), this.AYXKKw);
        startActivity(intent);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_IndicatorPop_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39358pqm.OLrzqt((EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("indicator_setting_entry", "indicator_setting_entry", false);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35973oKo
    public void KWHzl(@NotNull DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(onDismissListener, "");
        setOnDismissListener(onDismissListener);
    }

    @Override // o.InterfaceC35973oKo
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
                return;
            }
            show(fragmentManager, str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineIndicatorSelectFragment", "Error showFragment: " + e.getMessage());
        }
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // o.InterfaceC35976oKr
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
                return;
            }
            show(fragmentManager, str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineIndicatorSelectFragment", "Error showDialog: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.pqm$Application */
    public final class Application extends AbstractC59533zio<MarketTypeSelect, StateListAnimator> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.Dmq, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            StateListAnimator stateListAnimator = new StateListAnimator(viewInflate);
            android.widget.TextView textViewEZpvd = stateListAnimator.EZpvd();
            if (textViewEZpvd != null) {
                textViewEZpvd.setPadding(0, textViewEZpvd.getPaddingTop(), 0, textViewEZpvd.getPaddingBottom());
            }
            return stateListAnimator;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final MarketTypeSelect marketTypeSelect) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            android.widget.TextView textViewEZpvd = stateListAnimator.EZpvd();
            if (textViewEZpvd != null) {
                textViewEZpvd.setSelected(marketTypeSelect.isSelect());
            }
            android.widget.TextView textViewEZpvd2 = stateListAnimator.EZpvd();
            if (textViewEZpvd2 != null) {
                textViewEZpvd2.setText(C39358pqm.this.KWHzl(Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME") ? "VOL" : C37979pHu.AEQbTJ.OLrzqt(marketTypeSelect.getSelectTypeName()), marketTypeSelect.isSelect()));
            }
            android.view.View view = stateListAnimator.itemView;
            final C39358pqm c39358pqm = C39358pqm.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.pqw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39358pqm.Application.OLrzqt(marketTypeSelect, c39358pqm, view2);
                }
            });
        }

        public static final void OLrzqt(MarketTypeSelect marketTypeSelect, C39358pqm c39358pqm, android.view.View view) {
            if (marketTypeSelect.getGroup() == 1) {
                c39358pqm.OLrzqt(marketTypeSelect);
            } else if (marketTypeSelect.getGroup() == 0) {
                c39358pqm.copydefault(marketTypeSelect);
            }
            Function1 function1 = c39358pqm.gEmmrt;
            if (function1 != null) {
                function1.invoke(marketTypeSelect);
            }
        }
    }

    /* JADX INFO: renamed from: o.pqm$Fragment */
    public static final class Fragment extends AbstractC59533zio<MarketTypeGroup, LoaderManager> {
        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public LoaderManager onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.call, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new LoaderManager(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull LoaderManager loaderManager, @NotNull MarketTypeGroup marketTypeGroup) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            Intrinsics.checkNotNullParameter(marketTypeGroup, "");
            android.widget.TextView textViewAEQbTJ = loaderManager.AEQbTJ();
            if (textViewAEQbTJ != null) {
                textViewAEQbTJ.setText(marketTypeGroup.getSelectGroupName());
            }
        }
    }

    /* JADX INFO: renamed from: o.pqm$LoaderManager */
    public static final class LoaderManager extends RecyclerView.ViewHolder {
        public final android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.sanitizeSessionIdIgnoreCase);
        }
    }

    /* JADX INFO: renamed from: o.pqm$ActionBar */
    public static final class ActionBar extends AbstractC59533zio<IndicatorSettingItem, Activity> {
        public final Function1<java.lang.String, Unit> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.dHguZz, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new Activity(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, @NotNull final IndicatorSettingItem indicatorSettingItem) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(indicatorSettingItem, "");
            OKRegularCell oKRegularCellKWHzl = activity.KWHzl();
            if (oKRegularCellKWHzl != null) {
                oKRegularCellKWHzl.setTitle(indicatorSettingItem.getItemTittle());
            }
            activity.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.pqy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39358pqm.ActionBar.copydefault(this.EZpvd, indicatorSettingItem, view);
                }
            });
        }

        public static final void copydefault(ActionBar actionBar, IndicatorSettingItem indicatorSettingItem, android.view.View view) {
            actionBar.EZpvd.invoke(indicatorSettingItem.getItemTittle());
        }
    }

    /* JADX INFO: renamed from: o.pqm$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.dTTfOR);
        }
    }

    /* JADX INFO: renamed from: o.pqm$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public static final int OLrzqt = OKRegularCell.EZpvd;
        public final OKRegularCell EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKRegularCell KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (OKRegularCell) view.findViewById(C35964oKf.StateListAnimator.OHsvZP);
        }
    }

    public final void copydefault() {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        int size = this.AhwBna.size();
        for (int i = 0; i < size; i++) {
            if (this.AhwBna.get(i) instanceof MarketTypeSelect) {
                java.lang.Object obj = this.AhwBna.get(i);
                Intrinsics.copydefault(obj, "");
                MarketTypeSelect marketTypeSelect = (MarketTypeSelect) obj;
                if (marketTypeSelect.getGroup() == 0) {
                    TemplateSetting templateSetting = this.valueOf;
                    marketTypeSelect.setSelect((templateSetting == null || (mainIndicatorNames = templateSetting.getMainIndicatorNames()) == null) ? false : mainIndicatorNames.contains(marketTypeSelect.getSelectTypeName()));
                }
            }
        }
        this.AEQbTJ.notifyDataSetChanged();
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        int size = this.AhwBna.size();
        for (int i = 0; i < size; i++) {
            if (this.AhwBna.get(i) instanceof MarketTypeSelect) {
                java.lang.Object obj = this.AhwBna.get(i);
                Intrinsics.copydefault(obj, "");
                MarketTypeSelect marketTypeSelect = (MarketTypeSelect) obj;
                if (marketTypeSelect.getGroup() == 1) {
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.EZpvd(next, (java.lang.Object) marketTypeSelect.getSelectTypeName())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    marketTypeSelect.setSelect(next != null);
                    if (marketTypeSelect.isSelect()) {
                        this.djBIcL.add(java.lang.Integer.valueOf(i));
                    }
                }
            }
        }
        this.AEQbTJ.notifyDataSetChanged();
    }

    public final void copydefault(MarketTypeSelect marketTypeSelect) {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        copydefault(marketTypeSelect.getSelectTypeName());
        int size = this.AhwBna.size();
        for (int i = 0; i < size; i++) {
            if (this.AhwBna.get(i) instanceof MarketTypeSelect) {
                java.lang.Object obj = this.AhwBna.get(i);
                Intrinsics.copydefault(obj, "");
                MarketTypeSelect marketTypeSelect2 = (MarketTypeSelect) obj;
                if (marketTypeSelect2.getGroup() == 0) {
                    TemplateSetting templateSetting = this.valueOf;
                    marketTypeSelect2.setSelect((templateSetting == null || (mainIndicatorNames = templateSetting.getMainIndicatorNames()) == null) ? false : mainIndicatorNames.contains(marketTypeSelect2.getSelectTypeName()));
                }
            }
        }
        this.AEQbTJ.notifyDataSetChanged();
    }

    public final void OLrzqt(MarketTypeSelect marketTypeSelect) {
        int iIndexOf = this.AhwBna.indexOf(marketTypeSelect);
        java.lang.Object obj = this.AhwBna.get(iIndexOf);
        if (obj instanceof MarketTypeSelect) {
            if (!marketTypeSelect.isSelect()) {
                if (this.djBIcL.size() == 4) {
                    java.util.ArrayList<java.lang.Object> arrayList = this.AhwBna;
                    java.lang.Integer num = this.djBIcL.get(0);
                    Intrinsics.checkNotNullExpressionValue(num, "");
                    java.lang.Object obj2 = arrayList.get(num.intValue());
                    if (obj2 instanceof MarketTypeSelect) {
                        ((MarketTypeSelect) obj2).setSelect(false);
                        this.djBIcL.remove(0);
                    }
                }
                this.djBIcL.add(java.lang.Integer.valueOf(iIndexOf));
            } else {
                this.djBIcL.remove(java.lang.Integer.valueOf(iIndexOf));
            }
            ((MarketTypeSelect) obj).setSelect(!r1.isSelect());
        }
        this.AEQbTJ.notifyDataSetChanged();
    }

    public final void copydefault(java.lang.String str) {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        TemplateSetting templateSetting = this.valueOf;
        if (templateSetting == null || (mainIndicatorNames = templateSetting.getMainIndicatorNames()) == null || !mainIndicatorNames.contains(str)) {
            TemplateSetting templateSetting2 = this.valueOf;
            if (templateSetting2 != null) {
                templateSetting2.addMainIndicatorName(str);
                return;
            }
            return;
        }
        TemplateSetting templateSetting3 = this.valueOf;
        if (templateSetting3 != null) {
            templateSetting3.removeMainIndicatorName(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.CharSequence KWHzl(java.lang.String str, boolean z) {
        if (z) {
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pqt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39358pqm.OLrzqt(this.AEQbTJ, (java.util.List) obj);
                }
            }, 14, null);
        }
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39358pqm.copydefault(this.copydefault, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit OLrzqt(C39358pqm c39358pqm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39358pqm.getContext(), C35964oKf.Dialog.copydefault));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C39358pqm c39358pqm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39358pqm.getContext(), C35964oKf.Dialog.OLrzqt));
        return Unit.INSTANCE;
    }
}
