package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.BotItemSwitchData;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.SignalBtnItemData;
import com.okinc.unify_trade.bot.data.ItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51708vsC extends AbstractC59533zio<MySignalListItemData, C51710vsE> {
    public final Function2<MySignalListItemData, java.lang.String, Unit> AEQbTJ;
    public final Function2<MySignalListItemData, java.lang.Boolean, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51708vsC(@NotNull Function2<? super MySignalListItemData, ? super java.lang.String, Unit> function2, Function2<? super MySignalListItemData, ? super java.lang.Boolean, Unit> function22) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
        this.EZpvd = function22;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51710vsE onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.ilfrrN, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51710vsE(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51710vsE c51710vsE, @NotNull final MySignalListItemData mySignalListItemData) {
        Intrinsics.checkNotNullParameter(c51710vsE, "");
        Intrinsics.checkNotNullParameter(mySignalListItemData, "");
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(ItemData.class, new wNH(null, null, null, null, null, 31, null));
        c43316rmw.register(BotItemSwitchData.class, new C51755vsx(new Function1() { // from class: o.vsD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51708vsC.AEQbTJ(this.AEQbTJ, mySignalListItemData, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        c51710vsE.copydefault().setLineSpacing(20.0f, 1.0f);
        c51710vsE.OLrzqt().setLineSpacing(20.0f, 1.0f);
        c51710vsE.copydefault().setText(mySignalListItemData.EZpvd().getSignalChanName());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) mySignalListItemData.OLrzqt())) {
            c51710vsE.OLrzqt().setVisibility(0);
            c51710vsE.OLrzqt().setText(mySignalListItemData.OLrzqt());
        } else {
            c51710vsE.OLrzqt().setVisibility(8);
        }
        c51710vsE.valueOf().setVisibility(mySignalListItemData.AEQbTJ() ? 0 : 8);
        c51710vsE.EZpvd().setLayoutManager(new LinearLayoutManager(c51710vsE.itemView.getContext()));
        c51710vsE.EZpvd().setAdapter(c43316rmw);
        c51710vsE.EZpvd().setVisibility(C33129mqd.KWHzl((java.util.Collection) mySignalListItemData.KWHzl()) ? 0 : 8);
        c51710vsE.AEQbTJ().setVisibility(8);
        c51710vsE.KWHzl().setVisibility(8);
        c51710vsE.gEmmrt().setVisibility(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (mySignalListItemData.KWHzl() != null) {
            arrayList.addAll(mySignalListItemData.KWHzl());
        }
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) arrayList);
        java.util.ArrayList<SignalBtnItemData> arrayListCopydefault = mySignalListItemData.copydefault();
        if (arrayListCopydefault != null) {
            int i = 0;
            for (java.lang.Object obj : arrayListCopydefault) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                SignalBtnItemData signalBtnItemData = (SignalBtnItemData) obj;
                if (i == 0) {
                    c51710vsE.AEQbTJ().setVisibility(0);
                    c51710vsE.AEQbTJ().setText(signalBtnItemData.AEQbTJ());
                    C52794wYp c52794wYpAEQbTJ = c51710vsE.AEQbTJ();
                    c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, this, mySignalListItemData, signalBtnItemData));
                    c51710vsE.AEQbTJ().setEnabled(signalBtnItemData.copydefault());
                } else if (i == 1) {
                    c51710vsE.KWHzl().setVisibility(0);
                    c51710vsE.KWHzl().setText(signalBtnItemData.AEQbTJ());
                    C52794wYp c52794wYpKWHzl = c51710vsE.KWHzl();
                    c52794wYpKWHzl.setOnClickListener(new Activity(c52794wYpKWHzl, 1000L, this, mySignalListItemData, signalBtnItemData));
                    c51710vsE.KWHzl().setEnabled(signalBtnItemData.copydefault());
                } else if (i == 2) {
                    c51710vsE.gEmmrt().setVisibility(0);
                    c51710vsE.gEmmrt().setText(signalBtnItemData.AEQbTJ());
                    C52794wYp c52794wYpGEmmrt = c51710vsE.gEmmrt();
                    c52794wYpGEmmrt.setOnClickListener(new StateListAnimator(c52794wYpGEmmrt, 1000L, this, mySignalListItemData, signalBtnItemData));
                    c51710vsE.gEmmrt().setEnabled(signalBtnItemData.copydefault());
                }
                i++;
            }
        }
    }

    public static final Unit AEQbTJ(C51708vsC c51708vsC, MySignalListItemData mySignalListItemData, boolean z) {
        Function2<MySignalListItemData, java.lang.Boolean, Unit> function2 = c51708vsC.EZpvd;
        if (function2 != null) {
            function2.invoke(mySignalListItemData, java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vsC$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51708vsC AEQbTJ;
        public final /* synthetic */ MySignalListItemData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ SignalBtnItemData OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51708vsC c51708vsC, MySignalListItemData mySignalListItemData, SignalBtnItemData signalBtnItemData) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c51708vsC;
            this.EZpvd = mySignalListItemData;
            this.OLrzqt = signalBtnItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(this.EZpvd, this.OLrzqt.EZpvd());
            }
        }
    }

    /* JADX INFO: renamed from: o.vsC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51708vsC AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ MySignalListItemData KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ SignalBtnItemData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51708vsC c51708vsC, MySignalListItemData mySignalListItemData, SignalBtnItemData signalBtnItemData) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c51708vsC;
            this.KWHzl = mySignalListItemData;
            this.copydefault = signalBtnItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(this.KWHzl, this.copydefault.EZpvd());
            }
        }
    }

    /* JADX INFO: renamed from: o.vsC$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ MySignalListItemData AEQbTJ;
        public final /* synthetic */ C51708vsC EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ SignalBtnItemData OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51708vsC c51708vsC, MySignalListItemData mySignalListItemData, SignalBtnItemData signalBtnItemData) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c51708vsC;
            this.AEQbTJ = mySignalListItemData;
            this.OLrzqt = signalBtnItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.invoke(this.AEQbTJ, this.OLrzqt.EZpvd());
            }
        }
    }
}
