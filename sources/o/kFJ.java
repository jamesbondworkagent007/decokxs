package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49497upf;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kFJ extends AbstractC59533zio<java.lang.String, Application> {
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kFJ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:29) call: o.kFJ.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ kFJ(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public kFJ(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42851reH c42851reHAEQbTJ = C42851reH.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42851reHAEQbTJ, "");
        return new Application(c42851reHAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        final ActionBar actionBarAEQbTJ = TaskDescription.AEQbTJ(str);
        application.copydefault().copydefault.setText(C33069mpW.copydefault(qZH.PendingIntent.RcvFxC, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, TaskDescription.AEQbTJ(actionBarAEQbTJ)))));
        application.copydefault().getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.kFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kFJ.AEQbTJ(this.EZpvd, actionBarAEQbTJ, view);
            }
        });
    }

    public static final void AEQbTJ(kFJ kfj, final ActionBar actionBar, android.view.View view) {
        C32866mlf.onEvent$default("TradeOptionsTokenList_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.kFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kFJ.AEQbTJ(actionBar, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kfj.KWHzl(context, TaskDescription.copydefault(actionBar), kfj.AEQbTJ);
    }

    public static final Unit AEQbTJ(ActionBar actionBar, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strCopydefault = actionBar.copydefault();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strCopydefault.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, lowerCase + C27989kKu.Companion.valueOf(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2) {
        RxBus.KWHzl("optionSimpleModeOrOptionChain");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "trade_page")) {
            ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).KWHzl(context, str, "trade_page");
        } else {
            InterfaceC49497upf.ActionBar.openAllOptionsWithInstFamily$default((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI), context, str, null, 4, null);
        }
        EZpvd();
    }

    public final void EZpvd() {
        RxBus.KWHzl("close_search");
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final C42851reH EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42851reH copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C42851reH c42851reH) {
            super(c42851reH.getRoot());
            Intrinsics.checkNotNullParameter(c42851reH, "");
            this.EZpvd = c42851reH;
        }
    }
}
