package com.okinc.tradingbot.impl.signalClone.ui;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onCreateContent$1$8;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.UserInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C48033uCm;
import o.C53826wsn;
import o.C54589xNz;
import o.C54946xaf;
import o.C55173xeu;
import o.C55887xsS;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.uBL;
import o.uLU;
import o.uSN;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalCloneBottomSheet$onCreateContent$1$8 extends SuspendLambda implements Function2<uLU<? extends StrategyDetailsResponse>, Continuation<? super Unit>, Object> {
    final /* synthetic */ uSN $this_apply;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SignalCloneBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onCreateContent$1$8(uSN usn, SignalCloneBottomSheet signalCloneBottomSheet, Continuation<? super SignalCloneBottomSheet$onCreateContent$1$8> continuation) {
        super(2, continuation);
        this.$this_apply = usn;
        this.this$0 = signalCloneBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneBottomSheet$onCreateContent$1$8 signalCloneBottomSheet$onCreateContent$1$8 = new SignalCloneBottomSheet$onCreateContent$1$8(this.$this_apply, this.this$0, continuation);
        signalCloneBottomSheet$onCreateContent$1$8.L$0 = obj;
        return signalCloneBottomSheet$onCreateContent$1$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(uLU<? extends StrategyDetailsResponse> ulu, Continuation<? super Unit> continuation) {
        return invoke2((uLU<StrategyDetailsResponse>) ulu, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(uLU<StrategyDetailsResponse> ulu, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onCreateContent$1$8) create(ulu, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConstraintLayout constraintLayout;
        TextView textView;
        UserInfo userInfo;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final uLU ulu = (uLU) this.L$0;
            C55173xeu c55173xeu = this.$this_apply.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            boolean z = ulu instanceof uLU.Activity;
            c55173xeu.setVisibility(z ? 0 : 8);
            FrameLayout frameLayout = this.$this_apply.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            boolean z2 = ulu instanceof uLU.TaskDescription;
            boolean z3 = true;
            boolean z4 = z2 && ((uLU.TaskDescription) ulu).AEQbTJ();
            uSN usn = this.$this_apply;
            if (!z4) {
                usn.EZpvd.copydefault();
            }
            frameLayout.setVisibility(z4 ? 0 : 8);
            if (!z && !z2) {
                if (!(ulu instanceof uLU.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                OKReminder oKReminder = this.$this_apply.AhwBna;
                Intrinsics.checkNotNullExpressionValue(oKReminder, "");
                uLU.ActionBar actionBar = (uLU.ActionBar) ulu;
                if (!Intrinsics.EZpvd((Object) ((StrategyDetailsResponse) actionBar.KWHzl()).getState(), (Object) "stopped") && !((StrategyDetailsResponse) actionBar.KWHzl()).isHistory()) {
                    z3 = false;
                }
                uSN usn2 = this.$this_apply;
                if (z3) {
                    String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OCdtug);
                    usn2.AhwBna.setStyle(2);
                    usn2.AhwBna.setCloseIconVisibility(false);
                    usn2.AhwBna.setMessage((CharSequence) strAYXKKw);
                }
                oKReminder.setVisibility(z3 ? 0 : 8);
                uSN usn3 = this.this$0.djBIcL;
                if (usn3 != null && (textView = usn3.AYXKKw) != null) {
                    int i = C48033uCm.Fragment.jFiva;
                    BotVo bot = ((StrategyDetailsResponse) actionBar.KWHzl()).getBot();
                    String nickName = (bot == null || (userInfo = bot.getUserInfo()) == null) ? null : userInfo.getNickName();
                    textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", nickName != null ? nickName : ""))));
                }
                C54946xaf binding = this.this$0.getBinding();
                if (binding != null && (constraintLayout = binding.OLrzqt) != null) {
                    this.this$0.onCreateFooter(constraintLayout);
                }
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, ((StrategyDetailsResponse) actionBar.KWHzl()).getInstType(), ((StrategyDetailsResponse) actionBar.KWHzl()).getInstId(), null, null, 12, null) : null;
                uBL ubl = this.$this_apply.gEmmrt;
                final SignalCloneBottomSheet signalCloneBottomSheet = this.this$0;
                ubl.setOnSelectedCallback(new Function1() { // from class: o.wsg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SignalCloneBottomSheet$onCreateContent$1$8.invokeSuspend$lambda$4(signalCloneBottomSheet, ulu, (java.lang.String) obj2);
                    }
                });
                this.$this_apply.gEmmrt.copydefault(this.this$0, suggestedInstrument$default, TradeType.BUY_OPEN, false);
                C53826wsn c53826wsnAYXKKw = this.this$0.AYXKKw();
                final uSN usn4 = this.$this_apply;
                final SignalCloneBottomSheet signalCloneBottomSheet2 = this.this$0;
                c53826wsnAYXKKw.EZpvd(new Function1() { // from class: o.wsj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SignalCloneBottomSheet$onCreateContent$1$8.invokeSuspend$lambda$5(usn4, signalCloneBottomSheet2, ulu, (C55887xsS) obj2);
                    }
                });
                this.this$0.EZpvd((StrategyDetailsResponse) actionBar.KWHzl());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(SignalCloneBottomSheet signalCloneBottomSheet, uLU ulu, final String str) {
        signalCloneBottomSheet.AYXKKw().EZpvd(new Function1() { // from class: o.wsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SignalCloneBottomSheet$onCreateContent$1$8.invokeSuspend$lambda$4$lambda$3(str, (C55887xsS) obj);
            }
        });
        uLU.ActionBar actionBar = (uLU.ActionBar) ulu;
        signalCloneBottomSheet.AYXKKw().copydefault((C53826wsn.StateListAnimator) new C53826wsn.StateListAnimator.Application(((StrategyDetailsResponse) actionBar.KWHzl()).getOrderType(), ((StrategyDetailsResponse) actionBar.KWHzl()).getSourceCcy()));
        signalCloneBottomSheet.EZpvd((StrategyDetailsResponse) actionBar.KWHzl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$3(String str, C55887xsS c55887xsS) {
        c55887xsS.gEmmrt(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(uSN usn, SignalCloneBottomSheet signalCloneBottomSheet, uLU ulu, C55887xsS c55887xsS) {
        uBL ubl = usn.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        ubl.setVisibility((bizInstrumentAhwBna == null || !bizInstrumentAhwBna.isDisplayTradeReceive()) ? 8 : 0);
        BizInstrument bizInstrumentAhwBna2 = c55887xsS.AhwBna();
        if (bizInstrumentAhwBna2 != null && bizInstrumentAhwBna2.isDisplayTradeReceive()) {
            c55887xsS.gEmmrt(usn.gEmmrt.OLrzqt());
            uLU.ActionBar actionBar = (uLU.ActionBar) ulu;
            signalCloneBottomSheet.AYXKKw().copydefault((C53826wsn.StateListAnimator) new C53826wsn.StateListAnimator.Application(((StrategyDetailsResponse) actionBar.KWHzl()).getOrderType(), ((StrategyDetailsResponse) actionBar.KWHzl()).getSourceCcy()));
        }
        return Unit.INSTANCE;
    }
}
