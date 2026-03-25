package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SignalListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vZU extends AbstractC59533zio<SignalListItem, ActionBar> {
    public final int AEQbTJ;
    public final Function1<SignalListItem, Unit> EZpvd;
    public final Function1<SignalListItem, Unit> KWHzl;
    public final Function1<SignalListItem, Unit> OLrzqt;
    public final Function1<SignalListItem, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<SignalListItem, Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<SignalListItem, Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<SignalListItem, Unit> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<SignalListItem, Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.SignalListItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.SignalListItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.SignalListItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.SignalListItem, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public vZU(@NotNull Function1<? super SignalListItem, Unit> function1, @NotNull Function1<? super SignalListItem, Unit> function12, @NotNull Function1<? super SignalListItem, Unit> function13, @NotNull Function1<? super SignalListItem, Unit> function14) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.copydefault = function1;
        this.OLrzqt = function12;
        this.EZpvd = function13;
        this.KWHzl = function14;
        this.AEQbTJ = 2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.HJWChPfvRMlC, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new ActionBar((AbstractC50776vaY) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull SignalListItem signalListItem) {
        java.util.List listAhwBna;
        java.lang.String tradeSymbol;
        BizInstrument suggestedInstrument$default;
        java.lang.String instIds;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(signalListItem, "");
        AbstractC50776vaY abstractC50776vaYKWHzl = actionBar.KWHzl();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) signalListItem.getType(), (java.lang.Object) "created");
        abstractC50776vaYKWHzl.AhwBna.setText(signalListItem.getSignalChanName());
        android.widget.TextView textView = abstractC50776vaYKWHzl.valueOf;
        java.lang.String signalDescription = signalListItem.getSignalDescription();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.newSessionWithExtras);
        if (signalDescription == null || signalDescription.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalDescription)) {
            signalDescription = strAYXKKw;
        }
        textView.setText(signalDescription);
        abstractC50776vaYKWHzl.AEQbTJ.setText(C33070mpX.AYXKKw(zEZpvd ? C55688xof.Application.onRelationshipValidationResult : C55688xof.Application.zLnOGN));
        C55251xgS c55251xgS = abstractC50776vaYKWHzl.values;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        boolean z = !zEZpvd;
        c55251xgS.setVisibility(z ? 0 : 8);
        android.widget.TextView textView2 = abstractC50776vaYKWHzl.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(signalListItem.getCanEdit() ? 0 : 8);
        android.widget.TextView textView3 = abstractC50776vaYKWHzl.fetchVPNInfo;
        textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, this, signalListItem));
        android.widget.TextView textView4 = abstractC50776vaYKWHzl.AEQbTJ;
        textView4.setOnClickListener(new TaskDescription(textView4, 1000L, this, signalListItem));
        C52794wYp c52794wYp = abstractC50776vaYKWHzl.AYXKKw;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, signalListItem));
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) signalListItem.getInstIds()) || (instIds = signalListItem.getInstIds()) == null || (listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) instIds, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        android.widget.LinearLayout linearLayout = abstractC50776vaYKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(listAhwBna.isEmpty() ^ true ? 0 : 8);
        java.lang.String strSubS$default = C33129mqd.subS$default(signalListItem.getCount(), java.lang.Integer.valueOf(listAhwBna.size()), null, null, null, 14, null);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        arrayList.addAll(listAhwBna);
        if (C33129mqd.AEQbTJ(strSubS$default, 0)) {
            int iAhwBna = C33129mqd.AhwBna(strSubS$default);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(iAhwBna);
            for (int i = 0; i < iAhwBna; i++) {
                arrayList2.add("");
            }
            arrayList.addAll(arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (java.lang.String str : arrayList) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", str, null, null, 12, null)) == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                tradeSymbol = "";
            }
            arrayList3.add(tradeSymbol);
        }
        C51601vqB.refreshCircleCoins$default(abstractC50776vaYKWHzl.copydefault, arrayList3, this.AEQbTJ, 0, 4, null);
        android.widget.LinearLayout linearLayout2 = abstractC50776vaYKWHzl.EZpvd;
        linearLayout2.setOnClickListener(new Application(linearLayout2, 1000L, this, signalListItem));
        android.widget.ImageView imageView = abstractC50776vaYKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(this.AEQbTJ)) ? 0 : 8);
        android.widget.LinearLayout linearLayout3 = abstractC50776vaYKWHzl.isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(z ? 0 : 8);
        abstractC50776vaYKWHzl.AkhnZx.setText(C56108xwb.EZpvd(signalListItem.getUserSubscriptionType(), signalListItem.getSubscriptionFee(), signalListItem.getProfitSharingRatio()));
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC50776vaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50776vaY KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC50776vaY abstractC50776vaY) {
            super(abstractC50776vaY.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50776vaY, "");
            this.EZpvd = abstractC50776vaY;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ SignalListItem EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vZU OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vZU vzu, SignalListItem signalListItem) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = vzu;
            this.EZpvd = signalListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ().invoke(this.EZpvd);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ SignalListItem AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vZU OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vZU vzu, SignalListItem signalListItem) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = vzu;
            this.AEQbTJ = signalListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl().invoke(this.AEQbTJ);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ SignalListItem AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vZU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vZU vzu, SignalListItem signalListItem) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = vzu;
            this.AEQbTJ = signalListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.OLrzqt().invoke(this.AEQbTJ);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ SignalListItem AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vZU OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vZU vzu, SignalListItem signalListItem) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = vzu;
            this.AEQbTJ = signalListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.copydefault().invoke(this.AEQbTJ);
            }
        }
    }
}
