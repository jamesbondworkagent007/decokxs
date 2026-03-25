package com.okinc.tradingbot.impl.notice.banner;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.RelativeLayout;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradecore.main.mvp.home.EventTrade;
import com.okinc.tradecore.main.mvp.mediator.BaseMediator;
import com.okinc.tradingbot.impl.notice.banner.UMContractLimitedPresenter;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C49511upt;
import o.C54794xVo;
import o.C55296xhK;
import o.C56392yDr;
import o.InterfaceC49498upg;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.xLY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class UMContractLimitedPresenter extends BaseMediator {
    public final InterfaceC49498upg AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public RelativeLayout KWHzl;
    public final View copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UMContractLimitedPresenter(@NotNull View view, @NotNull InterfaceC49498upg interfaceC49498upg, @NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(view, interfaceC49498upg, application, savedStateHandle);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(interfaceC49498upg, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = view;
        this.AEQbTJ = interfaceC49498upg;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UMContractLimitedPresenter.EZpvd(this.KWHzl);
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C49511upt.Application.frkDMe);
        this.KWHzl = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new StateListAnimator(relativeLayout, 1000L, this));
        }
    }

    public final xLY EZpvd() {
        return (xLY) this.EZpvd.getValue();
    }

    public static final xLY EZpvd(UMContractLimitedPresenter uMContractLimitedPresenter) {
        Object objOnEventWithCallback$default = InterfaceC49498upg.ActionBar.onEventWithCallback$default(uMContractLimitedPresenter.AEQbTJ, EventTrade.GET_BIZ_CONFIG, null, 2, null);
        BizInfoConfig bizInfoConfig = objOnEventWithCallback$default instanceof BizInfoConfig ? (BizInfoConfig) objOnEventWithCallback$default : null;
        if (bizInfoConfig == null) {
            bizInfoConfig = BizInfoConfig.DefaultBizConfig.copydefault;
        }
        return new xLY(bizInfoConfig);
    }

    public final void AhwBna() {
        Context context = this.copydefault.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C49511upt.Activity.QbewEr));
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C49511upt.Activity.valueOf), new View.OnClickListener() { // from class: o.vzl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    UMContractLimitedPresenter.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void AEQbTJ() {
        super.AEQbTJ();
        RelativeLayout relativeLayout = this.KWHzl;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(C54794xVo.copydefault.valueOf(EZpvd().EZpvd()) ? 0 : 8);
        }
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void OLrzqt() {
        super.OLrzqt();
        RelativeLayout relativeLayout = this.KWHzl;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        this.KWHzl = null;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ UMContractLimitedPresenter OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, UMContractLimitedPresenter uMContractLimitedPresenter) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = uMContractLimitedPresenter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AhwBna();
            }
        }
    }
}
