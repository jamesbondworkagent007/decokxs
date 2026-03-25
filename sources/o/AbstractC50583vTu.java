package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.tradingbot.impl.strategy.itembinder.TacticsContentThumbnailData;
import com.okinc.tradingbot.impl.strategy.itembinder.TacticsRemindData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotSmartArbItemData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C50569vTg;
import o.C50574vTl;
import o.C50577vTo;
import o.C50578vTp;
import o.C50581vTs;
import o.C50587vTy;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50583vTu extends AbstractC48036uCp {
    public static final Application Companion = new Application(null);
    public static final int isConnected = 8;
    public android.app.Dialog AkhnZx;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> AuCTel;
    public C48350uOf DbNXlk;
    public InterfaceC58217yxC fIwbmz;
    public java.lang.String fetchVPNInfo = "";
    public final C59534zip values = new C59534zip();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    public abstract java.util.List<java.lang.Object> EZpvd();

    public abstract void OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C48350uOf c48350uOf) {
        Intrinsics.checkNotNullParameter(c48350uOf, "");
        this.DbNXlk = c48350uOf;
    }

    public void bx_() {
    }

    public boolean by_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.AuCTel = yho;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59534zip values() {
        return this.values;
    }

    public final C48350uOf DbNXlk() {
        C48350uOf c48350uOf = this.DbNXlk;
        if (c48350uOf != null) {
            return c48350uOf;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        this.AkhnZx = dialogOnCreateDialog;
        return dialogOnCreateDialog;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = this.AkhnZx;
        DialogC33577mzA dialogC33577mzA = dialog instanceof DialogC33577mzA ? (DialogC33577mzA) dialog : null;
        if (dialogC33577mzA != null) {
            BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault = dialogC33577mzA.copydefault();
            if (bottomSheetBehaviorCopydefault != null) {
                bottomSheetBehaviorCopydefault.setDraggable(false);
            }
            BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault2 = dialogC33577mzA.copydefault();
            if (bottomSheetBehaviorCopydefault2 != null) {
                bottomSheetBehaviorCopydefault2.setSkipCollapsed(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.vTu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ AbstractC50583vTu newInstance$default(Application application, java.lang.String str, java.lang.String str2, StrategyReqGroup strategyReqGroup, boolean z, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return application.copydefault(str, str2, strategyReqGroup, z);
        }

        public final AbstractC50583vTu copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull StrategyReqGroup strategyReqGroup, boolean z) {
            AbstractC50583vTu abstractC50583vTuAEQbTJ;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(strategyReqGroup, "");
            if (strategyReqGroup.getGridReq() != null) {
                C50574vTl.Activity activity = C50574vTl.Companion;
                StrategyBaseReq baseReq = strategyReqGroup.getBaseReq();
                GridReq gridReq = strategyReqGroup.getGridReq();
                Intrinsics.copydefault(gridReq);
                abstractC50583vTuAEQbTJ = activity.copydefault(str, str2, baseReq, gridReq, !Intrinsics.EZpvd((java.lang.Object) strategyReqGroup.getBaseReq().getOrdType(), (java.lang.Object) "moon_grid"), z, strategyReqGroup.getVipProfit());
            } else if (strategyReqGroup.getIceBergReq() != null) {
                C50578vTp.Activity activity2 = C50578vTp.Companion;
                StrategyBaseReq baseReq2 = strategyReqGroup.getBaseReq();
                IceBergReq iceBergReq = strategyReqGroup.getIceBergReq();
                Intrinsics.copydefault(iceBergReq);
                abstractC50583vTuAEQbTJ = activity2.AEQbTJ(str, str2, baseReq2, iceBergReq);
            } else if (strategyReqGroup.getTwapReq() != null) {
                C50587vTy.TaskDescription taskDescription = C50587vTy.Companion;
                StrategyBaseReq baseReq3 = strategyReqGroup.getBaseReq();
                TwapReq twapReq = strategyReqGroup.getTwapReq();
                Intrinsics.copydefault(twapReq);
                abstractC50583vTuAEQbTJ = taskDescription.copydefault(str, str2, baseReq3, twapReq);
            } else if (strategyReqGroup.getContractGridReq() != null) {
                C50569vTg.Activity activity3 = C50569vTg.Companion;
                StrategyBaseReq baseReq4 = strategyReqGroup.getBaseReq();
                ContractGridReq contractGridReq = strategyReqGroup.getContractGridReq();
                Intrinsics.copydefault(contractGridReq);
                abstractC50583vTuAEQbTJ = activity3.AEQbTJ(str, str2, baseReq4, contractGridReq, z, strategyReqGroup.getVipProfit());
            } else if (strategyReqGroup.getSignalBotReq() != null) {
                C50581vTs.ActionBar actionBar = C50581vTs.Companion;
                StrategyBaseReq baseReq5 = strategyReqGroup.getBaseReq();
                SignalBotReq signalBotReq = strategyReqGroup.getSignalBotReq();
                Intrinsics.copydefault(signalBotReq);
                signalBotReq.setVipProfit(strategyReqGroup.getVipProfit());
                Unit unit = Unit.INSTANCE;
                abstractC50583vTuAEQbTJ = actionBar.EZpvd(baseReq5, signalBotReq);
            } else if (strategyReqGroup.getSmartArbitrageReq() != null) {
                C50577vTo.Application application = C50577vTo.Companion;
                SmartArbitrageReq smartArbitrageReq = strategyReqGroup.getSmartArbitrageReq();
                Intrinsics.copydefault(smartArbitrageReq);
                abstractC50583vTuAEQbTJ = application.AEQbTJ(str, str2, smartArbitrageReq);
            } else {
                abstractC50583vTuAEQbTJ = null;
            }
            android.os.Bundle arguments = abstractC50583vTuAEQbTJ != null ? abstractC50583vTuAEQbTJ.getArguments() : null;
            if (arguments != null) {
                arguments.putString("bot_type", strategyReqGroup.getBaseReq().getOrdType());
            }
            if (arguments != null) {
                arguments.putString("bot_inst_id", str);
            }
            if (arguments != null) {
                arguments.putString("bot_inst_type", str2);
            }
            if (arguments != null) {
                arguments.putString("title", abstractC50583vTuAEQbTJ.getClass().getSimpleName());
            }
            if (abstractC50583vTuAEQbTJ != null) {
                abstractC50583vTuAEQbTJ.setArguments(arguments);
            }
            return abstractC50583vTuAEQbTJ;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.ruDxL));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.itxZVF));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new TaskDescription(wyf, 1000L, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        android.os.Bundle arguments = getArguments();
        pUU.KWHzl("BotOrder", "二次确认页 " + (arguments != null ? arguments.getString("title") : null) + " Order onDetach");
    }

    /* JADX INFO: renamed from: o.vTu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ AbstractC50583vTu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC50583vTu abstractC50583vTu) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = abstractC50583vTu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vTu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ AbstractC50583vTu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC50583vTu abstractC50583vTu) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = abstractC50583vTu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.valueOf();
                this.copydefault.OLrzqt();
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        OLrzqt(C48350uOf.KWHzl(getCustomLayoutInflater(), constraintLayout, true));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("bot_type")) != null) {
            str = string;
        }
        this.fetchVPNInfo = str;
        RecyclerView recyclerView = DbNXlk().AYXKKw;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C59534zip c59534zip = this.values;
        c59534zip.register(TacticsInsideItemData.class, new C52510wOb(new Function1() { // from class: o.vTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC50583vTu.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }, null, null, 4, null));
        c59534zip.register(AutoVipProfitInfo.class, new C54145wyo(16, false, 2, null));
        c59534zip.register(TacticsContentThumbnailData.class, new wNV());
        c59534zip.register(LabelData.class, new C51278vjx());
        c59534zip.register(CoinTipsData.class, new C51272vjr());
        c59534zip.register(TacticsRemindData.class, new wOB());
        c59534zip.register(TacticsInsideLineItemData.class, new C52512wOd());
        c59534zip.register(SmartCoinsData.class, new C53186wgj());
        c59534zip.register(BotRemindData.class, new C52491wNj());
        c59534zip.register(BotSmartArbItemData.class, new C52492wNk());
        bx_();
        recyclerView.setAdapter(this.values);
        C33064mpR.OLrzqt(this.values, (java.util.List<? extends java.lang.Object>) EZpvd());
        DbNXlk().KWHzl.post(new java.lang.Runnable() { // from class: o.vTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC50583vTu.KWHzl(this.EZpvd);
            }
        });
        uzCIH();
        vTL vtl = DbNXlk().AuCTel;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("bot_inst_id") : null;
        android.os.Bundle arguments3 = getArguments();
        vtl.EZpvd(string2, arguments3 != null ? arguments3.getString("bot_inst_type") : null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(AbstractC50583vTu abstractC50583vTu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C48033uCm.Fragment.QSbQqJ))) {
            C49855uwS.copydefault.copydefault(abstractC50583vTu.getContext());
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(AbstractC50583vTu abstractC50583vTu) {
        ConstraintLayout constraintLayout;
        wXQ wxq;
        int iKWHzl = C57676yms.valueOf(abstractC50583vTu.getContext()) ? C57676yms.OLrzqt(abstractC50583vTu.getContext())[1] : C57676yms.KWHzl(abstractC50583vTu.getContext());
        int iAYXKKw = C57676yms.AYXKKw(abstractC50583vTu.getContext());
        C54946xaf binding = abstractC50583vTu.getBinding();
        int measuredHeight = 0;
        int measuredHeight2 = (binding == null || (wxq = binding.KWHzl) == null) ? 0 : wxq.getMeasuredHeight();
        int measuredHeight3 = abstractC50583vTu.DbNXlk().AhwBna.getMeasuredHeight();
        C54946xaf binding2 = abstractC50583vTu.getBinding();
        if (binding2 != null && (constraintLayout = binding2.OLrzqt) != null) {
            measuredHeight = constraintLayout.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = abstractC50583vTu.DbNXlk().AEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintMaxHeight = (((iKWHzl - iAYXKKw) - measuredHeight2) - measuredHeight3) - measuredHeight;
        abstractC50583vTu.DbNXlk().AEQbTJ.setLayoutParams(layoutParams2);
    }

    public final void uzCIH() {
        if (by_()) {
            wYK wyk = DbNXlk().copydefault;
            Intrinsics.checkNotNullExpressionValue(wyk, "");
            wyk.setVisibility(0);
            DbNXlk().copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vTx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    AbstractC50583vTu.copydefault(this.AEQbTJ, compoundButton, z);
                }
            });
            return;
        }
        wYK wyk2 = DbNXlk().copydefault;
        Intrinsics.checkNotNullExpressionValue(wyk2, "");
        wyk2.setVisibility(8);
    }

    public static final void copydefault(AbstractC50583vTu abstractC50583vTu, android.widget.CompoundButton compoundButton, boolean z) {
        abstractC50583vTu.DbNXlk().copydefault.setText(C33070mpX.AYXKKw(z ? C48033uCm.Fragment.fGsPTM : C48033uCm.Fragment.gqESXP));
        abstractC50583vTu.DbNXlk().copydefault.setChecked(z);
    }

    public void djBIcL(java.lang.String str) {
        DbNXlk().fetchVPNInfo.setText(str);
    }

    public void AhwBna(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            DbNXlk().isConnected.setText(str);
            DbNXlk().isConnected.setVisibility(0);
        }
    }

    public void copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().fARcdN.setText(str);
        DbNXlk().fARcdN.setVisibility(0);
    }

    public void KWHzl(int i) {
        DbNXlk().fARcdN.setOKDSStyle(i);
    }

    public void copydefault(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            DbNXlk().uzCIH.setText(str);
            C55251xgS c55251xgS = DbNXlk().uzCIH;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            return;
        }
        C55251xgS c55251xgS2 = DbNXlk().uzCIH;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(8);
    }

    public void OLrzqt(int i) {
        DbNXlk().uzCIH.setOKDSStyle(i);
    }

    public void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            DbNXlk().hDKMBd.setText(str);
            C55251xgS c55251xgS = DbNXlk().hDKMBd;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            return;
        }
        C55251xgS c55251xgS2 = DbNXlk().hDKMBd;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(8);
    }

    public void AEQbTJ(int i) {
        DbNXlk().hDKMBd.setOKDSStyle(i);
    }

    public void hDKMBd() {
        DbNXlk().iwGUEr.setVisibility(0);
    }

    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55251xgS c55251xgS = DbNXlk().ejfBZ;
        C52534wOz c52534wOz = C52534wOz.KWHzl;
        Intrinsics.copydefault(c55251xgS);
        c52534wOz.EZpvd(c55251xgS, new TacticsListLabelVoucherData(str, false, 0, 0, 0, null, 62, null));
        c55251xgS.setVisibility(0);
    }

    public void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().AuCTel.setTpIsOpenState(str);
    }

    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DbNXlk().AuCTel.setGridPriceInterval(str, str2);
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().AuCTel.copydefault(str);
    }

    public boolean iwGUEr() {
        return DbNXlk().AuCTel.fetchVPNInfo();
    }

    public kotlin.Pair<java.lang.Boolean, java.lang.String> fJNWhG() {
        return DbNXlk().AuCTel.AhwBna();
    }

    public kotlin.Pair<java.lang.Boolean, java.lang.String> fARcdN() {
        return DbNXlk().AuCTel.djBIcL();
    }

    public final java.lang.String AuCTel() {
        return DbNXlk().AuCTel.DbNXlk();
    }

    public final java.lang.String fIwbmz() {
        return DbNXlk().AuCTel.gEmmrt();
    }

    public final int ejfBZ() {
        return DbNXlk().AuCTel.valueOf();
    }

    public final boolean getFieldNames() {
        return DbNXlk().AuCTel.isConnected();
    }

    public final int fetchVPNInfo() {
        return DbNXlk().AuCTel.AEQbTJ();
    }

    public final boolean getNewProxyInstance() {
        return DbNXlk().AuCTel.AkhnZx();
    }

    public final void fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().AuCTel.setTpInputErrMsg(str);
    }

    public final void AkhnZx() {
        DbNXlk().AuCTel.KWHzl();
    }

    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().AuCTel.setSlInputErrMsg(str);
    }

    public final void isConnected() {
        DbNXlk().AuCTel.EZpvd();
    }

    public final void DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().AuCTel.setTpDoubtHint(str);
    }

    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk().AuCTel.setSlDoubtHint(str);
    }

    public final void valueOf() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C54630xPm c54630xPmAuCTelauCTel;
        if (!DbNXlk().copydefault.isChecked() || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            return;
        }
        C54630xPm.setOrderConfirm$default(c54630xPmAuCTelauCTel, false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderCategory) it.next()).getStrategyType());
        }
        if (arrayList.contains(this.fetchVPNInfo)) {
            C32866mlf.onEvent$default("BotPlaceOrder_Sheet_ConfirmOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.vTw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC50583vTu.AEQbTJ(this.AEQbTJ, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(AbstractC50583vTu abstractC50583vTu, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", abstractC50583vTu.fetchVPNInfo, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC56077xvx, o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC58217yxC interfaceC58217yxC = this.fIwbmz;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX INFO: renamed from: o.vTu$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.copydefault = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:445) call: o.vTu.StateListAnimator.<init>(java.lang.String, java.lang.String, int):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
        }
    }
}
