package o;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wMN extends AbstractC59533zio<TacticsData, wNW> {
    public final C52499wNr copydefault;

    public wMN(@NotNull C52499wNr c52499wNr) {
        Intrinsics.checkNotNullParameter(c52499wNr, "");
        this.copydefault = c52499wNr;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public wNW onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.frkDMe, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new wNW(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wNW wnw, @NotNull TacticsData tacticsData) {
        ArbitrageOrderBean arbitrageOrderBean;
        ArbitrageOrderBean arbitrageOrderBean2;
        java.lang.String tvTitle;
        int i;
        int i2;
        java.lang.Integer numValueOf;
        boolean z;
        BotCommon common;
        TacticsListButtonItem tacticsListButtonItem;
        TacticsListButtonItem tacticsListButtonItem2;
        BotCommon common2;
        java.lang.String tvTitle2;
        BotCommon common3;
        BotCommon common4;
        BotCommon common5;
        BotCommon common6;
        Intrinsics.checkNotNullParameter(wnw, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.util.List<ArbitrageOrderBean> instList = tacticsData.getInstList();
        if (instList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : instList) {
                if (Intrinsics.EZpvd(((ArbitrageOrderBean) obj).getMajor(), java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            arbitrageOrderBean = (ArbitrageOrderBean) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0);
        } else {
            arbitrageOrderBean = null;
        }
        java.util.List<ArbitrageOrderBean> instList2 = tacticsData.getInstList();
        if (instList2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : instList2) {
                if (!Intrinsics.EZpvd(((ArbitrageOrderBean) obj2).getMajor(), java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj2);
                }
            }
            arbitrageOrderBean2 = (ArbitrageOrderBean) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, 0);
        } else {
            arbitrageOrderBean2 = null;
        }
        android.view.View viewFetchVPNInfo = wnw.fetchVPNInfo();
        int i3 = getAdapter().getItems().size() - 1 != wnw.getBindingAdapterPosition() ? 0 : 8;
        viewFetchVPNInfo.setVisibility(i3);
        android.widget.TextView textViewValueOf = wnw.valueOf();
        BotVo bot = tacticsData.getBot();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((bot == null || (common6 = bot.getCommon()) == null) ? null : common6.getStgyName()))) {
            BotVo bot2 = tacticsData.getBot();
            tvTitle = (bot2 == null || (common5 = bot2.getCommon()) == null) ? null : common5.getStgyName();
        } else {
            tvTitle = tacticsData.getTvTitle();
        }
        textViewValueOf.setText(tvTitle);
        BotVo bot3 = tacticsData.getBot();
        if (bot3 != null && (common2 = bot3.getCommon()) != null && common2.isPinned()) {
            android.widget.TextView textViewValueOf2 = wnw.valueOf();
            BotVo bot4 = tacticsData.getBot();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((bot4 == null || (common4 = bot4.getCommon()) == null) ? null : common4.getStgyName()))) {
                BotVo bot5 = tacticsData.getBot();
                tvTitle2 = (bot5 == null || (common3 = bot5.getCommon()) == null) ? null : common3.getStgyName();
            } else {
                tvTitle2 = tacticsData.getTvTitle();
            }
            wPQ.setTextWithDrawable$default(textViewValueOf2, tvTitle2 == null ? "" : tvTitle2, C48033uCm.ActionBar.AuCTel, 17.0f, 0, 8, null);
            android.widget.TextView textViewValueOf3 = wnw.valueOf();
            textViewValueOf3.setOnClickListener(new Activity(textViewValueOf3, 1000L, wnw, this, tacticsData));
        }
        wnw.AEQbTJ().AEQbTJ(tacticsData);
        wOD wodAYXKKw = wnw.AYXKKw();
        wodAYXKKw.copydefault(tacticsData);
        pUU.EZpvd("ArbitrageListItemBinder", "Label Layout UPDATE status view");
        java.util.ArrayList<TacticsListLabelUiData> labelList = tacticsData.getLabelList();
        if (C33129mqd.AEQbTJ(labelList != null ? java.lang.Integer.valueOf(labelList.size()) : null, 0)) {
            wodAYXKKw.setDividerVisibility(0);
            i = 8;
        } else {
            i = 8;
            wodAYXKKw.setDividerVisibility(8);
        }
        Unit unit = Unit.INSTANCE;
        java.util.ArrayList<TacticsListLabelUiData> labelList2 = tacticsData.getLabelList();
        if (C33129mqd.AEQbTJ(labelList2 != null ? java.lang.Integer.valueOf(labelList2.size()) : null, 0)) {
            wnw.values().setExpand(true);
            wnw.values().removeAllViews();
            java.util.ArrayList<TacticsListLabelUiData> labelList3 = tacticsData.getLabelList();
            if (labelList3 != null) {
                for (TacticsListLabelUiData tacticsListLabelUiData : labelList3) {
                    C52534wOz c52534wOz = C52534wOz.KWHzl;
                    android.content.Context context = wnw.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    wnw.values().addView(c52534wOz.copydefault(context, tacticsListLabelUiData));
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        if (wnw.AYXKKw().OLrzqt(tacticsData)) {
            C55372xih c55372xihValues = wnw.values();
            c55372xihValues.setOnClickListener(new ActionBar(c55372xihValues, 1000L, wnw, tacticsData));
        } else {
            wnw.values().setOnClickListener(null);
        }
        java.util.List<TacticsListButtonItem> operateList = tacticsData.getOperateList();
        if (operateList != null) {
            numValueOf = java.lang.Integer.valueOf(operateList.size());
            i2 = 1;
        } else {
            i2 = 1;
            numValueOf = null;
        }
        if (C33129mqd.copydefault(numValueOf, java.lang.Integer.valueOf(i2))) {
            wnw.KWHzl().setVisibility(0);
            wnw.isConnected().setVisibility(0);
            C52794wYp c52794wYpKWHzl = wnw.KWHzl();
            java.util.List<TacticsListButtonItem> operateList2 = tacticsData.getOperateList();
            c52794wYpKWHzl.setText(C56033xvF.OLrzqt((operateList2 == null || (tacticsListButtonItem2 = operateList2.get(0)) == null) ? null : tacticsListButtonItem2.AEQbTJ()));
            java.util.List<TacticsListButtonItem> operateList3 = tacticsData.getOperateList();
            java.lang.String strAEQbTJ = (operateList3 == null || (tacticsListButtonItem = operateList3.get(0)) == null) ? null : tacticsListButtonItem.AEQbTJ();
            if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "strategy_button_starting") || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "strategy_button_stopping")) {
                C52794wYp.startLoading$default(wnw.KWHzl(), 0L, 1, null);
            } else {
                wnw.KWHzl().fIwbmz();
                C52794wYp c52794wYpKWHzl2 = wnw.KWHzl();
                c52794wYpKWHzl2.setOnClickListener(new Dialog(c52794wYpKWHzl2, 1000L, this, tacticsData));
                wnw.KWHzl().setCompoundDrawablesRelativeWithIntrinsicBounds(C48033uCm.ActionBar.isConnected, 0, 0, 0);
                C52794wYp c52794wYpKWHzl3 = wnw.KWHzl();
                android.content.Context context2 = wnw.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c52794wYpKWHzl3.setCompoundDrawablePadding(C33052mpF.EZpvd(4.0f, context2));
            }
            BotVo bot6 = tacticsData.getBot();
            boolean zIsPinned = (bot6 == null || (common = bot6.getCommon()) == null) ? false : common.isPinned();
            wPQ.setDrawableWithSize$default(wnw.AkhnZx(), zIsPinned ? C52761wXj.TaskDescription.onServiceConnected : C52761wXj.TaskDescription.HJWChPzRXNTw, 16.0f, 16.0f, 0, 8, null);
            wnw.AkhnZx().setText(C33070mpX.AYXKKw(zIsPinned ? C55688xof.Application.createHandler : C55688xof.Application.ComponentActivityReportFullyDrawnExecutorApi1));
            C52794wYp c52794wYpAkhnZx = wnw.AkhnZx();
            android.content.Context context3 = wnw.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c52794wYpAkhnZx.setCompoundDrawablePadding(C33052mpF.EZpvd(4.0f, context3));
            if (Build.VERSION.SDK_INT >= 31) {
                wnw.AkhnZx().setAllowClickWhenDisabled(true);
            }
            wnw.AkhnZx().setEnabled(zIsPinned || C55875xsG.copydefault.copydefault() < 5);
            C52794wYp c52794wYpAkhnZx2 = wnw.AkhnZx();
            c52794wYpAkhnZx2.setOnClickListener(new Fragment(c52794wYpAkhnZx2, 1000L, zIsPinned, this, tacticsData));
            wPQ.setDrawableWithSize$default(wnw.copydefault(), C52761wXj.TaskDescription.fGT, 16.0f, 16.0f, 0, 8, null);
            C52794wYp c52794wYpCopydefault = wnw.copydefault();
            android.content.Context context4 = wnw.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            c52794wYpCopydefault.setCompoundDrawablePadding(C33052mpF.EZpvd(4.0f, context4));
            C52794wYp c52794wYpCopydefault2 = wnw.copydefault();
            c52794wYpCopydefault2.setOnClickListener(new LoaderManager(c52794wYpCopydefault2, 1000L, this, tacticsData));
        } else {
            wnw.KWHzl().setVisibility(i);
            wnw.isConnected().setVisibility(i);
        }
        android.widget.TextView textViewOLrzqt = wnw.OLrzqt();
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        textViewOLrzqt.setText(C54799xVt.getTitleByIdAndType$default(c54799xVt, arbitrageOrderBean != null ? arbitrageOrderBean.getInstId() : null, arbitrageOrderBean != null ? arbitrageOrderBean.getInstType() : null, C59449zhJ.gEmmrt(arbitrageOrderBean != null ? arbitrageOrderBean.getInstType() : null, "FUTURES", true), false, 8, null));
        wnw.djBIcL().setText(C54799xVt.getTitleByIdAndType$default(c54799xVt, arbitrageOrderBean2 != null ? arbitrageOrderBean2.getInstId() : null, arbitrageOrderBean2 != null ? arbitrageOrderBean2.getInstType() : null, C59449zhJ.gEmmrt(arbitrageOrderBean2 != null ? arbitrageOrderBean2.getInstType() : null, "FUTURES", true), false, 8, null));
        if (wnw.AhwBna().getItemDecorationCount() == 0) {
            RecyclerView recyclerViewAhwBna = wnw.AhwBna();
            android.content.Context context5 = wnw.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            z = false;
            recyclerViewAhwBna.addItemDecoration(new C57584ylF(2, 0, C33052mpF.EZpvd(16.0f, context5)));
        } else {
            z = false;
        }
        wnw.AhwBna().setLayoutManager(new GridLayoutManager(wnw.AhwBna().getContext(), 2));
        wnw.AhwBna().setNestedScrollingEnabled(z);
        RecyclerView recyclerViewAhwBna2 = wnw.AhwBna();
        C59534zip c59534zip = new C59534zip();
        android.content.Context context6 = wnw.AhwBna().getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context6, null, true, 0, false, null, null, null, 250, null));
        recyclerViewAhwBna2.setAdapter(c59534zip);
        RecyclerView.Adapter adapter = wnw.AhwBna().getAdapter();
        Intrinsics.copydefault(adapter, "");
        C59534zip c59534zip2 = (C59534zip) adapter;
        java.util.List subData = tacticsData.getSubData();
        if (subData == null) {
            subData = yDY.AhwBna();
        }
        C33064mpR.OLrzqt(c59534zip2, (java.util.List<? extends java.lang.Object>) subData);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler3), C33070mpX.AYXKKw(Intrinsics.EZpvd(tacticsData.getAssociate(), java.lang.Boolean.TRUE) ? C55688xof.Application.AlertController3 : C55688xof.Application.onScroll), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (tacticsData.getHistory()) {
            arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), tacticsData.getCTime(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), tacticsData.getUTime(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        if (C55875xsG.copydefault.KWHzl() == CardStyle.MINI) {
            wnw.gEmmrt().setVisibility(i);
            wnw.EZpvd().setVisibility(i);
            return;
        }
        wnw.gEmmrt().setVisibility(0);
        wnw.EZpvd().setVisibility(0);
        if (wnw.gEmmrt().getItemDecorationCount() == 0) {
            RecyclerView recyclerViewGEmmrt = wnw.gEmmrt();
            android.content.Context context7 = wnw.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            recyclerViewGEmmrt.addItemDecoration(new C57584ylF(2, 0, C33052mpF.EZpvd(16.0f, context7)));
        }
        wnw.gEmmrt().setLayoutManager(new GridLayoutManager(wnw.AhwBna().getContext(), 2));
        wnw.gEmmrt().setNestedScrollingEnabled(false);
        RecyclerView recyclerViewGEmmrt2 = wnw.gEmmrt();
        C59534zip c59534zip3 = new C59534zip();
        android.content.Context context8 = wnw.AhwBna().getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        c59534zip3.register(TacticsInsideItemData.class, new C52518wOj(context8, null, true, 0, false, null, null, null, 250, null));
        recyclerViewGEmmrt2.setAdapter(c59534zip3);
        RecyclerView.Adapter adapter2 = wnw.gEmmrt().getAdapter();
        Intrinsics.copydefault(adapter2, "");
        C33064mpR.OLrzqt((C59534zip) adapter2, arrayList3);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;
        public final /* synthetic */ TacticsData OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = tacticsData;
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function2<java.lang.String, java.lang.Boolean, Unit> function2AYXKKw = wMN.this.copydefault.AYXKKw();
            if (function2AYXKKw != null) {
                function2AYXKKw.invoke(this.OLrzqt.getAlgoId(), java.lang.Boolean.FALSE);
            }
            this.KWHzl.dismiss();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ wNW AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ TacticsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wNW wnw, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = wnw;
            this.copydefault = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setMetadata));
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.getCTime());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ wMN AEQbTJ;
        public final /* synthetic */ TacticsData EZpvd;
        public final /* synthetic */ wNW KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wNW wnw, wMN wmn, TacticsData tacticsData) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = wnw;
            this.AEQbTJ = wmn;
            this.EZpvd = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.createHandler));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKt));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.fetchVPNInfo), (View.OnClickListener) this.AEQbTJ.new StateListAnimator(this.EZpvd, viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKt), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ TacticsData AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ wMN OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, wMN wmn, TacticsData tacticsData) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = wmn;
            this.AEQbTJ = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            TacticsListButtonItem tacticsListButtonItem;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> function2OLrzqt = this.OLrzqt.copydefault.OLrzqt();
                if (function2OLrzqt != null) {
                    java.util.List<TacticsListButtonItem> operateList = this.AEQbTJ.getOperateList();
                    function2OLrzqt.invoke(new kotlin.Pair<>((operateList == null || (tacticsListButtonItem = operateList.get(0)) == null) ? null : tacticsListButtonItem.AEQbTJ(), this.AEQbTJ), null);
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ wMN AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ TacticsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, boolean z, wMN wmn, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = z;
            this.AEQbTJ = wmn;
            this.copydefault = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.EZpvd) {
                    Function2<java.lang.String, java.lang.Boolean, Unit> function2AYXKKw = this.AEQbTJ.copydefault.AYXKKw();
                    if (function2AYXKKw != null) {
                        function2AYXKKw.invoke(this.copydefault.getAlgoId(), java.lang.Boolean.FALSE);
                        return;
                    }
                    return;
                }
                if (C55875xsG.copydefault.copydefault() < 5) {
                    Function2<java.lang.String, java.lang.Boolean, Unit> function2AYXKKw2 = this.AEQbTJ.copydefault.AYXKKw();
                    if (function2AYXKKw2 != null) {
                        function2AYXKKw2.invoke(this.copydefault.getAlgoId(), java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C55688xof.Application.viewModels, C56423yEv.EZpvd(C56390yDp.OLrzqt("max", "5"))), 0, 1, (java.lang.Object) null);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ wMN EZpvd;
        public final /* synthetic */ TacticsData OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, wMN wmn, TacticsData tacticsData) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = wmn;
            this.OLrzqt = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1<TacticsData, Unit> function1DjBIcL = this.EZpvd.copydefault.djBIcL();
                if (function1DjBIcL != null) {
                    function1DjBIcL.invoke(this.OLrzqt);
                }
            }
        }
    }
}
