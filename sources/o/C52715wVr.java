package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.biz.TacticsType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.bot.data.BotGuiderViewData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52715wVr extends AbstractC59533zio<BotGuiderViewData, C52713wVp> {
    public final boolean EZpvd;
    public final Function1<java.lang.String, Unit> KWHzl;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52715wVr(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.KWHzl = function12;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C52713wVp onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.init, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52713wVp(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52713wVp c52713wVp, @NotNull BotGuiderViewData botGuiderViewData) {
        InterfaceC49317umK interfaceC49317umK;
        int iCopydefault;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(c52713wVp, "");
        Intrinsics.checkNotNullParameter(botGuiderViewData, "");
        int iCopydefault2 = 0;
        boolean z = (c52713wVp.itemView.getContext() instanceof ActivityC52122vzt) || (c52713wVp.itemView.getContext() instanceof ActivityC51686vrh);
        c52713wVp.gEmmrt().setText(EZpvd(botGuiderViewData.getBotType(), z));
        c52713wVp.EZpvd().OLrzqt().setTextSize(14.0f);
        c52713wVp.valueOf().setText(AEQbTJ(botGuiderViewData, z));
        c52713wVp.valueOf().setVisibility(C51468vnb.fARcdN().contains(botGuiderViewData.getBotType()) ^ true ? 0 : 8);
        if (this.EZpvd) {
            OLrzqt(c52713wVp, botGuiderViewData);
        } else if (!C51468vnb.fARcdN().contains(botGuiderViewData.getBotType())) {
            xND xndAEQbTJ = C53685wqE.copydefault.OLrzqt().AEQbTJ();
            if (xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.AYXKKw(), java.lang.Boolean.TRUE) && (interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class)) != null && interfaceC49317umK.copydefault("social_enter_channel_trade")) {
                if ((Intrinsics.EZpvd((java.lang.Object) botGuiderViewData.getBotType(), (java.lang.Object) "all_bot") && botGuiderViewData.isHome()) || (Intrinsics.EZpvd((java.lang.Object) botGuiderViewData.getBotType(), (java.lang.Object) "all_bot") && botGuiderViewData.isMyBotOnGoing())) {
                    OLrzqt(c52713wVp);
                } else {
                    copydefault(c52713wVp, botGuiderViewData);
                }
            } else {
                copydefault(c52713wVp, botGuiderViewData);
            }
        }
        if (botGuiderViewData.getHPadding() == -1.0f) {
            iCopydefault = 0;
        } else {
            float hPadding = botGuiderViewData.getHPadding();
            android.content.Context context = c52713wVp.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C55298xhM.copydefault(hPadding, context);
        }
        if (botGuiderViewData.getVPadding() != -1.0f) {
            float vPadding = botGuiderViewData.getVPadding();
            android.content.Context context2 = c52713wVp.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault2 = C55298xhM.copydefault(vPadding, context2);
        }
        if (botGuiderViewData.isCenter()) {
            android.view.View view = c52713wVp.itemView;
            linearLayout = view instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view : null;
            if (linearLayout != null) {
                linearLayout.setGravity(16);
                return;
            }
            return;
        }
        android.view.View view2 = c52713wVp.itemView;
        android.widget.LinearLayout linearLayout2 = view2 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view2 : null;
        if (linearLayout2 != null) {
            linearLayout2.setGravity(48);
        }
        android.view.View view3 = c52713wVp.itemView;
        linearLayout = view3 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view3 : null;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(iCopydefault, iCopydefault2, iCopydefault, iCopydefault2);
        }
    }

    public final void OLrzqt(C52713wVp c52713wVp, BotGuiderViewData botGuiderViewData) {
        c52713wVp.copydefault().setVisibility(8);
        c52713wVp.valueOf().setVisibility(8);
        c52713wVp.KWHzl().setVisibility(0);
        android.widget.TextView textViewGEmmrt = c52713wVp.gEmmrt();
        textViewGEmmrt.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.copydefault));
        textViewGEmmrt.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        textViewGEmmrt.setTextColor(c52713wVp.itemView.getContext().getColor(C52761wXj.Activity.v));
        C55173xeu c55173xeuEZpvd = c52713wVp.EZpvd();
        c55173xeuEZpvd.setTitle("");
        ViewGroup.LayoutParams layoutParams = c55173xeuEZpvd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c52713wVp.itemView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fIwbmz);
            layoutParams.height = c52713wVp.itemView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fIwbmz);
            c55173xeuEZpvd.setLayoutParams(layoutParams);
            android.view.View view = c52713wVp.itemView;
            view.setBackgroundResource(C48033uCm.ActionBar.gEmmrt);
            Intrinsics.copydefault(view);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.height = -2;
                marginLayoutParams.bottomMargin = view.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTel);
                view.setLayoutParams(marginLayoutParams);
                C52794wYp c52794wYpKWHzl = c52713wVp.KWHzl();
                ViewGroup.LayoutParams layoutParams3 = c52794wYpKWHzl.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.topMargin = c52713wVp.itemView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AkhnZx);
                    c52794wYpKWHzl.setLayoutParams(marginLayoutParams2);
                    C52794wYp c52794wYpKWHzl2 = c52713wVp.KWHzl();
                    c52794wYpKWHzl2.setOnClickListener(new ActionBar(c52794wYpKWHzl2, 1000L, botGuiderViewData, this));
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void OLrzqt(C52713wVp c52713wVp) {
        c52713wVp.copydefault().setVisibility(0);
        c52713wVp.valueOf().setVisibility(8);
        android.widget.TextView textViewOLrzqt = c52713wVp.OLrzqt();
        textViewOLrzqt.setOnClickListener(new Activity(textViewOLrzqt, 1000L, this));
        android.widget.TextView textViewAEQbTJ = c52713wVp.AEQbTJ();
        textViewAEQbTJ.setOnClickListener(new StateListAnimator(textViewAEQbTJ, 1000L, this));
    }

    public final void KWHzl(final BotGuiderViewData botGuiderViewData) {
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        C32866mlf.onEvent$default("PlaceOrder_RunningBotPrompt_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wVq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52715wVr.AEQbTJ(botGuiderViewData, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (this.EZpvd) {
            C32866mlf.onEvent$default("OEXActivityTab_BotsTab_ExploreAllBots_Click", (TrackChannel[]) null, new Function1() { // from class: o.wVu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52715wVr.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) botGuiderViewData.getBotType(), (java.lang.Object) "iceberg")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null && (listAEQbTJ = xorCopydefault.AEQbTJ()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OrderCategory) it.next()).getStrategyType());
                }
                if (arrayList.contains("smart_iceberg")) {
                    this.copydefault.invoke("smart_iceberg");
                    return;
                }
            }
            this.copydefault.invoke("iceberg");
            return;
        }
        this.copydefault.invoke(botGuiderViewData.getBotType());
    }

    public static final Unit AEQbTJ(BotGuiderViewData botGuiderViewData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", botGuiderViewData.getBotType(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wVr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ BotGuiderViewData KWHzl;
        public final /* synthetic */ C52715wVr OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, BotGuiderViewData botGuiderViewData, C52715wVr c52715wVr) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = botGuiderViewData;
            this.OLrzqt = c52715wVr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                xND xndAEQbTJ = C53685wqE.copydefault.OLrzqt().AEQbTJ();
                boolean z = false;
                boolean zEZpvd = xndAEQbTJ != null ? Intrinsics.EZpvd(xndAEQbTJ.AYXKKw(), java.lang.Boolean.TRUE) : false;
                InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
                boolean z2 = interfaceC49317umK != null && interfaceC49317umK.copydefault("social_enter_channel_trade");
                if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.getBotType(), (java.lang.Object) "all_bot") && (this.KWHzl.isHome() || this.KWHzl.isMyBotOnGoing())) {
                    z = true;
                }
                if (!zEZpvd || !z2 || !z) {
                    this.OLrzqt.KWHzl(this.KWHzl);
                } else {
                    this.OLrzqt.AEQbTJ().invoke("trade_tactics");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wVr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52715wVr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52715wVr c52715wVr) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c52715wVr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.AEQbTJ().invoke("trade_tactics");
            }
        }
    }

    /* JADX INFO: renamed from: o.wVr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52715wVr EZpvd;
        public final /* synthetic */ BotGuiderViewData KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52715wVr c52715wVr, BotGuiderViewData botGuiderViewData) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c52715wVr;
            this.KWHzl = botGuiderViewData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.KWHzl(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.wVr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52715wVr KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52715wVr c52715wVr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c52715wVr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ().invoke("trade_social");
            }
        }
    }

    public final void copydefault(C52713wVp c52713wVp, BotGuiderViewData botGuiderViewData) {
        c52713wVp.copydefault().setVisibility(8);
        android.widget.TextView textViewValueOf = c52713wVp.valueOf();
        textViewValueOf.setOnClickListener(new Application(textViewValueOf, 1000L, this, botGuiderViewData));
    }

    public final java.lang.String AEQbTJ(BotGuiderViewData botGuiderViewData, boolean z) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String botType = botGuiderViewData.getBotType();
        if (Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "all_bot")) {
            return C33070mpX.AYXKKw(C48033uCm.Fragment.ggKfIT);
        }
        java.lang.String str = "";
        if (Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "iceberg")) {
            TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ("smart_iceberg");
            if (tacticsTypeAEQbTJ != null && (strAYXKKw2 = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) != null) {
                str = strAYXKKw2;
            }
            if (z) {
                return C33069mpW.copydefault(C55688xof.Application.setActionBarUpIndicator, C56423yEv.EZpvd(C56390yDp.OLrzqt("here", str)));
            }
            return C33069mpW.copydefault(C55688xof.Application.onDrawerStateChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("here", str)));
        }
        TacticsType tacticsTypeAEQbTJ2 = TacticsType.Companion.AEQbTJ(botGuiderViewData.getBotType());
        if (tacticsTypeAEQbTJ2 != null && (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ2.getStgyName())) != null) {
            str = strAYXKKw;
        }
        if (z) {
            return C33069mpW.copydefault(C55688xof.Application.setActionBarUpIndicator, C56423yEv.EZpvd(C56390yDp.OLrzqt("here", str)));
        }
        return C33069mpW.copydefault(C55688xof.Application.onDrawerStateChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("here", str)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [217=15] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(java.lang.String str, boolean z) {
        switch (str.hashCode()) {
            case -1831183611:
                if (str.equals("spot_dca")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.DCJXGO);
                }
                break;
            case -1402017003:
                if (str.equals("contract_dca")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfNLfdT);
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi213);
                }
                break;
            case -1148661171:
                if (str.equals("smart_iceberg")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.Rdimen);
                }
                break;
            case -1086683216:
                if (str.equals("signal_bot")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.RbMRq);
                }
                break;
            case -911839703:
                if (str.equals("all_bot")) {
                    return KWHzl(z);
                }
                break;
            case -591806012:
                if (str.equals("moon_grid")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.onSetRepeatMode);
                }
                break;
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                    return C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKdMCrTj);
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.onLaunch);
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity5);
                }
                break;
            case 3573234:
                if (str.equals("twap")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.getOnBackInvokedDispatcher);
                }
                break;
            case 1165749981:
                if (str.equals("recurring")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.onPrepareFromMediaId);
                }
                break;
            case 1629187779:
                if (str.equals("iceberg")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity21);
                }
                break;
            case 1780188297:
                if (str.equals("arbitrage")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity2);
                }
                break;
        }
        return C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry2);
    }

    public final java.lang.String KWHzl(boolean z) {
        if (z && !((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).valueOf()) {
            return C33070mpX.AYXKKw(C55688xof.Application.RcLksq);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry2);
    }
}
