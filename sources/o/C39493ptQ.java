package o;

import android.graphics.RectF;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TokenBusinessData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC49497upf;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.ptQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39493ptQ extends AbstractC59533zio<TokenBusinessData, TaskDescription> {
    public final Function1<TokenBusinessData, Unit> AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final android.content.Context KWHzl;
    public final Function1<TokenBusinessData, Unit> OLrzqt;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, java.util.List] */
    @Override // o.AbstractC59533zio
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, TokenBusinessData tokenBusinessData, java.util.List list) {
        KWHzl((TaskDescription) viewHolder, tokenBusinessData, (java.util.List<java.lang.Object>) list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.TokenBusinessData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.TokenBusinessData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39493ptQ(@NotNull android.content.Context context, @NotNull Function1<? super TokenBusinessData, Unit> function1, @NotNull Function1<? super TokenBusinessData, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = context;
        this.AEQbTJ = function1;
        this.OLrzqt = function12;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ptN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39493ptQ.AEQbTJ();
            }
        });
    }

    public final InterfaceC54581xNr OLrzqt() {
        return (InterfaceC54581xNr) this.EZpvd.getValue();
    }

    public static final InterfaceC54581xNr AEQbTJ() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) {
            return null;
        }
        return interfaceC54577xNn.OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QVsKAR, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [100=5] */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0452 A[PHI: r6
  0x0452: PHI (r6v4 long) = (r6v3 long), (r6v3 long), (r6v6 long), (r6v3 long), (r6v3 long) binds: [B:25:0x0123, B:104:0x03f7, B:95:0x02d1, B:49:0x019a, B:28:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final TokenBusinessData tokenBusinessData) {
        java.lang.String ccyType;
        FutureGroupInfo futureGroupInfoEZpvd;
        java.lang.String text;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String ccyType2;
        FutureGroupInfo futureGroupInfoEZpvd2;
        java.lang.String text2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String coinLever = "";
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        if (taskDescription.getLayoutPosition() == 0) {
            android.view.View viewFARcdN = taskDescription.fARcdN();
            if (viewFARcdN != null) {
                viewFARcdN.setVisibility(8);
            }
        } else {
            android.view.View viewFARcdN2 = taskDescription.fARcdN();
            if (viewFARcdN2 != null) {
                viewFARcdN2.setVisibility(0);
            }
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
            taskDescription.djBIcL().setVisibility(8);
        }
        android.widget.ImageView imageViewDjBIcL = taskDescription.djBIcL();
        int iEZpvd = C33052mpF.EZpvd(4.0f, this.KWHzl);
        imageViewDjBIcL.setPadding(iEZpvd, iEZpvd, iEZpvd, iEZpvd);
        android.widget.TextView textViewAhwBna = taskDescription.AhwBna();
        C48914uef c48914uef = C48914uef.EZpvd;
        textViewAhwBna.setText(c48914uef.copydefault(tokenBusinessData.getInstType()));
        taskDescription.isConnected().setText(tokenBusinessData.getPrice());
        taskDescription.DbNXlk().setText(pTF.KWHzl.AEQbTJ(tokenBusinessData.getChangePercent()));
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) tokenBusinessData.getChangePercent(), (java.lang.CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (java.lang.Object) null)) {
            taskDescription.DbNXlk().setTextColor(C33508mxl.copydefault(this.KWHzl));
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) tokenBusinessData.getChangePercent(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            taskDescription.DbNXlk().setTextColor(C33508mxl.AEQbTJ(this.KWHzl));
        } else {
            taskDescription.DbNXlk().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        taskDescription.KWHzl().setVisibility(0);
        taskDescription.fetchVPNInfo().setVisibility(8);
        taskDescription.valueOf().setVisibility(8);
        taskDescription.copydefault().setVisibility(0);
        taskDescription.AkhnZx().setVisibility(8);
        taskDescription.OLrzqt().setVisibility(8);
        taskDescription.djBIcL().setImageResource(C52761wXj.TaskDescription.gdLjtZ);
        taskDescription.djBIcL().setSelected(tokenBusinessData.isWatching());
        java.lang.String instType = tokenBusinessData.getInstType();
        long j = 1;
        switch (instType.hashCode()) {
            case -2027980370:
                if (!instType.equals("MARGIN")) {
                    AEQbTJ(true, taskDescription);
                    taskDescription.AYXKKw().setVisibility(0);
                    taskDescription.values().setVisibility(8);
                    taskDescription.KWHzl().setVisibility(8);
                    taskDescription.valueOf().setVisibility(0);
                    taskDescription.gEmmrt().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.getPriority));
                    taskDescription.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QslYrK));
                    taskDescription.djBIcL().setImageResource(C35964oKf.Activity.AwvSrB);
                    taskDescription.djBIcL().setVisibility(0);
                } else {
                    AEQbTJ(false, taskDescription);
                    taskDescription.AYXKKw().setVisibility(8);
                    taskDescription.values().setVisibility(0);
                    taskDescription.gEmmrt().setText(tokenBusinessData.getBaseSymbol());
                    taskDescription.values().setText(" / " + tokenBusinessData.getQuoteSymbol());
                    taskDescription.fetchVPNInfo().setVisibility(0);
                    taskDescription.fetchVPNInfo().setText(tokenBusinessData.getLeverage() + "x");
                }
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                    android.widget.ImageView imageViewEZpvd = taskDescription.EZpvd();
                    int iEZpvd2 = C33052mpF.EZpvd(2.0f, this.KWHzl);
                    imageViewEZpvd.setPadding(iEZpvd2, iEZpvd2, iEZpvd2, iEZpvd2);
                    taskDescription.copydefault().setVisibility(8);
                    taskDescription.AkhnZx().setVisibility(0);
                    taskDescription.OLrzqt().setVisibility((C55687xoe.AEQbTJ.AEQbTJ() && yDY.gEmmrt("BTC", "ETH").contains(tokenBusinessData.getBaseSymbol())) ? 0 : 8);
                    java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(o.TaskDescription.AEQbTJ(tokenBusinessData.getIndex()));
                    android.widget.TextView textViewAuCTel = taskDescription.AuCTel();
                    java.lang.String string = this.KWHzl.getResources().getString(C35964oKf.Fragment.icKaHr);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    textViewAuCTel.setText(C33069mpW.OLrzqt(string, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strAEQbTJ))));
                    AppCompatTextView appCompatTextViewFJNWhG = taskDescription.fJNWhG();
                    java.lang.String string2 = this.KWHzl.getResources().getString(C35964oKf.Fragment.dPkBzA);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    appCompatTextViewFJNWhG.setText(C33069mpW.OLrzqt(string2, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", tokenBusinessData.getBaseSymbol()))));
                    taskDescription.fIwbmz().setText(this.KWHzl.getResources().getString(C35964oKf.Fragment.vqBjd) + " " + tokenBusinessData.getPrice());
                    AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(taskDescription.AkhnZx());
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    j = 1;
                    AbstractC58247yxg<java.lang.Object> abstractC58247yxgSubscribeOn = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribeOn(C58266yxz.OLrzqt());
                    InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ptP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C39493ptQ.copydefault(this.EZpvd, tokenBusinessData, obj);
                        }
                    };
                    final Function1 function1 = new Function1() { // from class: o.ptU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C39493ptQ.copydefault((java.lang.Throwable) obj);
                        }
                    };
                    abstractC58247yxgSubscribeOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ptS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C39493ptQ.OLrzqt(function1, obj);
                        }
                    });
                    C8003auW.copydefault(taskDescription.OLrzqt()).throttleFirst(1L, timeUnit).subscribeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58227yxM() { // from class: o.ptR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C39493ptQ.AEQbTJ(this.EZpvd, tokenBusinessData, obj);
                        }
                    });
                    C33054mpH.KWHzl(taskDescription.EZpvd(), tokenBusinessData.getCoinUrl());
                }
                j = 1;
                AEQbTJ(true, taskDescription);
                taskDescription.AYXKKw().setVisibility(0);
                taskDescription.values().setVisibility(8);
                taskDescription.KWHzl().setVisibility(8);
                taskDescription.valueOf().setVisibility(0);
                taskDescription.gEmmrt().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.getPriority));
                taskDescription.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QslYrK));
                taskDescription.djBIcL().setImageResource(C35964oKf.Activity.AwvSrB);
                taskDescription.djBIcL().setVisibility(0);
                break;
            case 2552066:
                if (instType.equals("SPOT")) {
                    AEQbTJ(false, taskDescription);
                    taskDescription.AYXKKw().setVisibility(8);
                    taskDescription.values().setVisibility(0);
                    taskDescription.gEmmrt().setText(tokenBusinessData.getBaseSymbol());
                    taskDescription.values().setText(" / " + tokenBusinessData.getDisplayQuoteSymbol());
                    java.lang.String leverage = tokenBusinessData.getLeverage();
                    if (leverage != null) {
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) leverage)) {
                            leverage = null;
                        }
                        if (leverage != null) {
                            coinLever = leverage;
                        }
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinLever)) {
                            taskDescription.fetchVPNInfo().setVisibility(0);
                            taskDescription.fetchVPNInfo().setText(coinLever + "x");
                        }
                        j = 1;
                    } else {
                        BizInstrument biz = tokenBusinessData.getBiz();
                        SpotInstrument spotInstrument = biz instanceof SpotInstrument ? (SpotInstrument) biz : null;
                        if (spotInstrument != null) {
                            coinLever = spotInstrument.getCoinLever();
                        }
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinLever) && C55608xnE.EZpvd()) {
                            taskDescription.fetchVPNInfo().setVisibility(0);
                            taskDescription.fetchVPNInfo().setText(coinLever + "x");
                        }
                        j = 1;
                    }
                }
                j = 1;
                AEQbTJ(true, taskDescription);
                taskDescription.AYXKKw().setVisibility(0);
                taskDescription.values().setVisibility(8);
                taskDescription.KWHzl().setVisibility(8);
                taskDescription.valueOf().setVisibility(0);
                taskDescription.gEmmrt().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.getPriority));
                taskDescription.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QslYrK));
                taskDescription.djBIcL().setImageResource(C35964oKf.Activity.AwvSrB);
                taskDescription.djBIcL().setVisibility(0);
                break;
            case 2558355:
                if (instType.equals("SWAP")) {
                    AEQbTJ(false, taskDescription);
                    taskDescription.AYXKKw().setVisibility(0);
                    taskDescription.values().setVisibility(8);
                    java.lang.String strEZpvd = c48914uef.EZpvd(tokenBusinessData.getInstrumentName(), tokenBusinessData.getInstType(), tokenBusinessData.getIndex(), false);
                    AppCompatTextView appCompatTextViewGEmmrt = taskDescription.gEmmrt();
                    java.lang.String string3 = this.KWHzl.getResources().getString(C35964oKf.Fragment.KWHzl);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    appCompatTextViewGEmmrt.setText(setSwapSuffixText$default(this, strEZpvd, string3, C33070mpX.copydefault(C52761wXj.Activity.DcMfJKOmnske), C33070mpX.copydefault(C52761wXj.Activity.sCB), false, 16, null));
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = OLrzqt();
                    if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tokenBusinessData.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(tokenBusinessData.getInstrumentName())) == null || (ccyType = bizInstrumentValueOf.getCcyType()) == null) {
                        ccyType = "";
                    }
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = OLrzqt();
                    if (interfaceC54581xNrOLrzqt2 != null && (futureGroupInfoEZpvd = interfaceC54581xNrOLrzqt2.EZpvd("SWAP", ccyType)) != null && (text = futureGroupInfoEZpvd.getText()) != null) {
                        coinLever = text;
                    }
                    taskDescription.AYXKKw().setText(coinLever);
                    j = 1;
                }
                AEQbTJ(true, taskDescription);
                taskDescription.AYXKKw().setVisibility(0);
                taskDescription.values().setVisibility(8);
                taskDescription.KWHzl().setVisibility(8);
                taskDescription.valueOf().setVisibility(0);
                taskDescription.gEmmrt().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.getPriority));
                taskDescription.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QslYrK));
                taskDescription.djBIcL().setImageResource(C35964oKf.Activity.AwvSrB);
                taskDescription.djBIcL().setVisibility(0);
                break;
            case 214415088:
                if (instType.equals("FUTURES")) {
                    AEQbTJ(false, taskDescription);
                    taskDescription.values().setVisibility(8);
                    taskDescription.gEmmrt().setText(c48914uef.OLrzqt(tokenBusinessData.getInstrumentName(), tokenBusinessData.getInstType(), tokenBusinessData.getIndex(), true));
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = OLrzqt();
                    if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt(tokenBusinessData.getInstType())) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(tokenBusinessData.getInstrumentName())) == null || (ccyType2 = bizInstrumentValueOf2.getCcyType()) == null) {
                        ccyType2 = "";
                    }
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = OLrzqt();
                    if (interfaceC54581xNrOLrzqt4 != null && (futureGroupInfoEZpvd2 = interfaceC54581xNrOLrzqt4.EZpvd("SWAP", ccyType2)) != null && (text2 = futureGroupInfoEZpvd2.getText()) != null) {
                        coinLever = text2;
                    }
                    taskDescription.AYXKKw().setText(coinLever);
                    taskDescription.AYXKKw().setVisibility(0);
                    break;
                }
                break;
        }
        android.widget.LinearLayout linearLayoutAEQbTJ = taskDescription.AEQbTJ();
        if (linearLayoutAEQbTJ != null) {
            linearLayoutAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ptT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39493ptQ.AEQbTJ(this.KWHzl, tokenBusinessData, view);
                }
            });
        }
        if (Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "FUTURES")) {
            C8003auW.copydefault(taskDescription.djBIcL()).throttleFirst(j, java.util.concurrent.TimeUnit.SECONDS).subscribe(new Activity(tokenBusinessData, taskDescription, this));
        } else {
            taskDescription.djBIcL().setOnClickListener(null);
        }
    }

    public static final void copydefault(C39493ptQ c39493ptQ, TokenBusinessData tokenBusinessData, java.lang.Object obj) {
        InterfaceC49497upf.ActionBar.openAllOptionsWithInstFamily$default((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI), c39493ptQ.KWHzl, tokenBusinessData.getIndex(), null, 4, null);
        RxBus.KWHzl("close_search");
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C39493ptQ c39493ptQ, TokenBusinessData tokenBusinessData, java.lang.Object obj) {
        android.content.Context context = c39493ptQ.KWHzl;
        if (context != null) {
            InterfaceC49497upf.ActionBar.openSimpleOptionPage$default((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI), context, tokenBusinessData.getIndex(), null, 4, null);
        }
    }

    public static final void AEQbTJ(C39493ptQ c39493ptQ, TokenBusinessData tokenBusinessData, android.view.View view) {
        c39493ptQ.AEQbTJ.invoke(tokenBusinessData);
    }

    /* JADX INFO: renamed from: o.ptQ$Activity */
    public static final class Activity implements InterfaceC58227yxM<java.lang.Object> {
        public final /* synthetic */ C39493ptQ AEQbTJ;
        public final /* synthetic */ TaskDescription KWHzl;
        public final /* synthetic */ TokenBusinessData copydefault;

        public Activity(TokenBusinessData tokenBusinessData, TaskDescription taskDescription, C39493ptQ c39493ptQ) {
            this.copydefault = tokenBusinessData;
            this.KWHzl = taskDescription;
            this.AEQbTJ = c39493ptQ;
        }

        @Override // o.InterfaceC58227yxM
        public void accept(java.lang.Object obj) throws java.lang.Exception {
            this.copydefault.setPos(this.KWHzl.getLayoutPosition());
            this.AEQbTJ.OLrzqt.invoke(this.copydefault);
        }
    }

    public void KWHzl(@NotNull TaskDescription taskDescription, @NotNull TokenBusinessData tokenBusinessData, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(taskDescription, tokenBusinessData, list);
            return;
        }
        if (Intrinsics.EZpvd(CollectionsKt___CollectionsKt.firstOrNull(list), (java.lang.Object) "LocalRefresh")) {
            taskDescription.isConnected().setText(tokenBusinessData.getPrice());
            taskDescription.DbNXlk().setText(pTF.KWHzl.AEQbTJ(tokenBusinessData.getChangePercent()));
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) tokenBusinessData.getChangePercent(), (java.lang.CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (java.lang.Object) null)) {
                taskDescription.DbNXlk().setTextColor(C33508mxl.copydefault(this.KWHzl));
            } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) tokenBusinessData.getChangePercent(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                taskDescription.DbNXlk().setTextColor(C33508mxl.AEQbTJ(this.KWHzl));
            } else {
                taskDescription.DbNXlk().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            }
            taskDescription.djBIcL().setSelected(tokenBusinessData.isWatching());
            if (Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "OPTION")) {
                taskDescription.fIwbmz().setText(this.KWHzl.getResources().getString(C35964oKf.Fragment.vqBjd) + " " + tokenBusinessData.getPrice());
                return;
            }
            return;
        }
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(list);
        Intrinsics.copydefault(objFirstOrNull, "");
        tokenBusinessData.setWatching(((java.lang.Boolean) objFirstOrNull).booleanValue());
        android.widget.ImageView imageViewDjBIcL = taskDescription.djBIcL();
        java.lang.Object objFirstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull(list);
        Intrinsics.copydefault(objFirstOrNull2, "");
        imageViewDjBIcL.setSelected(((java.lang.Boolean) objFirstOrNull2).booleanValue());
    }

    public final void AEQbTJ(boolean z, TaskDescription taskDescription) {
        taskDescription.copydefault().setBackground(z ? this.KWHzl.getDrawable(C52761wXj.TaskDescription.giSNqX) : null);
    }

    /* JADX INFO: renamed from: o.ptQ$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public android.widget.LinearLayout AEQbTJ;
        public android.widget.TextView AYXKKw;
        public android.widget.LinearLayout AhwBna;
        public android.widget.TextView AkhnZx;
        public AppCompatTextView AuCTel;
        public android.widget.TextView DbNXlk;
        public android.view.View EZpvd;
        public android.widget.LinearLayout KWHzl;
        public android.widget.ImageView OLrzqt;
        public android.widget.LinearLayout copydefault;
        public android.widget.ImageView djBIcL;
        public android.widget.TextView ejfBZ;
        public android.view.View fARcdN;
        public android.widget.LinearLayout fIwbmz;
        public android.widget.TextView fJNWhG;
        public android.widget.TextView fetchVPNInfo;
        public AppCompatTextView gEmmrt;
        public android.widget.TextView isConnected;
        public android.widget.ImageView valueOf;
        public android.widget.TextView values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AYXKKw() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AkhnZx() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AuCTel() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View fARcdN() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppCompatTextView fJNWhG() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppCompatTextView gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView values() {
            return this.fetchVPNInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = view;
            this.copydefault = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.ULRxlR);
            this.fARcdN = view.findViewById(C35964oKf.StateListAnimator.onRemoveQueueItemAt);
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.OtZEmZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AhwBna = (android.widget.LinearLayout) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.DjWNei);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.valueOf = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.QBiWsm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AYXKKw = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C35964oKf.StateListAnimator.ibrGus);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.gEmmrt = (AppCompatTextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C35964oKf.StateListAnimator.shErWi);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.ejfBZ = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C35964oKf.StateListAnimator.ZAwExL);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.fIwbmz = (android.widget.LinearLayout) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C35964oKf.StateListAnimator.hErYDe);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.fetchVPNInfo = (android.widget.TextView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C35964oKf.StateListAnimator.SqfPTR);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.DbNXlk = (android.widget.TextView) viewFindViewById8;
            android.view.View viewFindViewById9 = view.findViewById(C35964oKf.StateListAnimator.ORrpqH);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
            this.KWHzl = (android.widget.LinearLayout) viewFindViewById9;
            android.view.View viewFindViewById10 = view.findViewById(C35964oKf.StateListAnimator.ikEgkI);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
            this.AkhnZx = (android.widget.TextView) viewFindViewById10;
            android.view.View viewFindViewById11 = view.findViewById(C35964oKf.StateListAnimator.getUriFromString);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "");
            this.isConnected = (android.widget.TextView) viewFindViewById11;
            android.view.View viewFindViewById12 = view.findViewById(C35964oKf.StateListAnimator.ddhgMB);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "");
            this.values = (android.widget.TextView) viewFindViewById12;
            android.view.View viewFindViewById13 = view.findViewById(C35964oKf.StateListAnimator.fraLem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "");
            this.djBIcL = (android.widget.ImageView) viewFindViewById13;
            android.view.View viewFindViewById14 = view.findViewById(C35964oKf.StateListAnimator.OFqMGB);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "");
            this.AEQbTJ = (android.widget.LinearLayout) viewFindViewById14;
            android.view.View viewFindViewById15 = view.findViewById(C35964oKf.StateListAnimator.RXdAnZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById15;
            android.view.View viewFindViewById16 = view.findViewById(C35964oKf.StateListAnimator.previous);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "");
            this.AuCTel = (AppCompatTextView) viewFindViewById16;
            android.view.View viewFindViewById17 = view.findViewById(C35964oKf.StateListAnimator.rate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "");
            this.fJNWhG = (android.widget.TextView) viewFindViewById17;
        }
    }

    public static /* synthetic */ java.lang.CharSequence setSwapSuffixText$default(C39493ptQ c39493ptQ, java.lang.String str, java.lang.String str2, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        return c39493ptQ.KWHzl(str, str2, i, i2, z);
    }

    public final java.lang.CharSequence KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.ColorInt final int i, @androidx.annotation.ColorInt final int i2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.ptO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39493ptQ.KWHzl(this.EZpvd, i, i2, z, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(C39493ptQ c39493ptQ, int i, int i2, boolean z, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new mAD(0.0f, 0, i, C33052mpF.AEQbTJ(2, c39493ptQ.KWHzl), new RectF(C33052mpF.EZpvd(4, c39493ptQ.KWHzl), C33052mpF.EZpvd(1, c39493ptQ.KWHzl), C33052mpF.EZpvd(4, c39493ptQ.KWHzl), C33052mpF.EZpvd(1, c39493ptQ.KWHzl)), null, C33052mpF.EZpvd(2.0f, c39493ptQ.KWHzl), i2, 32, null));
        if (z) {
            list.add(new android.text.style.TextAppearanceSpan(c39493ptQ.KWHzl, C32113mPz.Dialog.AuCTel));
        } else {
            list.add(new android.text.style.TextAppearanceSpan(c39493ptQ.KWHzl, C32113mPz.Dialog.AkhnZx));
        }
        list.add(new android.text.style.TypefaceSpan(com.google.android.exoplayer2.C.SANS_SERIF_NAME));
        return Unit.INSTANCE;
    }
}
