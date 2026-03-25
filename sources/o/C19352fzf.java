package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment$observeUIState$1;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment$observeUIState$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment$observeUIState$3;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19352fzf extends AbstractC19314fyu implements InterfaceC33040mou {
    public C16624enT gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.invokespecialatDTRm;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16624enT c16624enTAEQbTJ = C16624enT.AEQbTJ(view);
        this.gEmmrt = c16624enTAEQbTJ;
        if (c16624enTAEQbTJ != null) {
            OLrzqt(c16624enTAEQbTJ);
        }
        fARcdN();
        view.post(new java.lang.Runnable() { // from class: o.fzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19352fzf.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(C19352fzf c19352fzf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c19352fzf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fzf$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "get_started", true);
        }
    }

    public final void OLrzqt(C16624enT c16624enT) {
        AppCompatImageView appCompatImageView;
        ViewGroup.LayoutParams layoutParams;
        AppCompatImageView appCompatImageView2;
        C52794wYp c52794wYp = c16624enT.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        android.content.Context context = getContext();
        if (context != null) {
            C16624enT c16624enT2 = this.gEmmrt;
            if (c16624enT2 != null && (appCompatImageView2 = c16624enT2.copydefault) != null) {
                C33054mpH.EZpvd(appCompatImageView2, C43454rpb.copydefault("images/web3_wallet/icon_wallet_bind_account.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
            }
            C16624enT c16624enT3 = this.gEmmrt;
            if (c16624enT3 == null || (appCompatImageView = c16624enT3.copydefault) == null || (layoutParams = appCompatImageView.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = (C33570myu.AEQbTJ() * 208) / 375;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        AppCompatImageView appCompatImageView;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        C16624enT c16624enT = this.gEmmrt;
        if (c16624enT == null || (appCompatImageView = c16624enT.copydefault) == null || (layoutParams = appCompatImageView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = (C33570myu.AEQbTJ() * 208) / 375;
    }

    @Override // o.AbstractC19318fyy
    public void fARcdN() {
        super.fARcdN();
        copydefault(new WalletBindGuideFragment$observeUIState$1(this, null));
        copydefault(new WalletBindGuideFragment$observeUIState$2(this, null));
        copydefault(new WalletBindGuideFragment$observeUIState$3(this, null));
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        C32866mlf.onEvent$default("LinkedAccount_GuidePop_GetStarted_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19352fzf.isConnected((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return false;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fzf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C19352fzf AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19352fzf c19352fzf) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c19352fzf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("LinkedAccount_GuidePop_GetStarted_Click", (TrackChannel[]) null, ActionBar.OLrzqt, 1, (java.lang.Object) null);
                this.AEQbTJ.values().getNewProxyInstance();
            }
        }
    }
}
