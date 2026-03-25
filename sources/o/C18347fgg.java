package o;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionViewModel$initListeners$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionViewModel$initListeners$walletFlow$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18347fgg extends C18351fgk {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C12827cuN AEQbTJ;
    public final Application AYXKKw;
    public final StateFlow<C18346fgf> KWHzl;
    public final MutableStateFlow<C18346fgf> OLrzqt;
    public int copydefault;
    public final InterfaceC18445fiY djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C18346fgf> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.fgg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fgg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public C18347fgg(@NotNull C12827cuN c12827cuN, @NotNull InterfaceC18445fiY interfaceC18445fiY) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        this.AEQbTJ = c12827cuN;
        this.djBIcL = interfaceC18445fiY;
        MutableStateFlow<C18346fgf> MutableStateFlow = StateFlowKt.MutableStateFlow(new C18346fgf(null, null, null, null, false, 31, null));
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        Application application = new Application();
        this.AYXKKw = application;
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AEQbTJ(application);
    }

    /* JADX INFO: renamed from: o.fgg$Application */
    public static final class Application implements WalletConnectUtils.StateListAnimator {
        public Application() {
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(ShowWCAuthRequestArgs showWCAuthRequestArgs) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, showWCAuthRequestArgs);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.KWHzl(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str) {
            WalletConnectUtils.StateListAnimator.Activity.KWHzl(this, str);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.copydefault(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            java.lang.Object value;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            MutableStateFlow mutableStateFlow = C18347fgg.this.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default((C18346fgf) value, null, WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).gEmmrt(str), null, str, false, 21, null)));
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, boolean z) {
            java.lang.Object value;
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C18347fgg.this.OLrzqt().getValue().djBIcL())) {
                MutableStateFlow mutableStateFlow = C18347fgg.this.OLrzqt;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default((C18346fgf) value, 4, null, null, null, false, 30, null)));
            }
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, java.lang.String str2) {
            java.lang.Object value;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C18347fgg.this.OLrzqt().getValue().djBIcL())) {
                MutableStateFlow mutableStateFlow = C18347fgg.this.OLrzqt;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default((C18346fgf) value, 6, null, null, null, false, 30, null)));
            }
        }
    }

    public static /* synthetic */ void initParams$default(C18347fgg c18347fgg, int i, java.lang.String str, WCSessionMeta wCSessionMeta, java.lang.String str2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        c18347fgg.OLrzqt(i, str, wCSessionMeta, str3, i2);
    }

    public final void OLrzqt(int i, @NotNull java.lang.String str, WCSessionMeta wCSessionMeta, @NotNull java.lang.String str2, int i2) {
        C18346fgf value;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.KWHzl.getValue().KWHzl() == null) {
            this.copydefault = i2;
            MutableStateFlow<C18346fgf> mutableStateFlow = this.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default(value, null, wCSessionMeta, null, str, false, 21, null)));
            KWHzl(i, str2);
        }
    }

    public final void KWHzl(int i, java.lang.String str) {
        FlowKt.launchIn(FlowKt.combine(FlowLiveDataConversions.asFlow(copydefault()), FlowKt.flow(new WalletConnectConnectionViewModel$initListeners$walletFlow$1(str, this, i, null)), new WalletConnectConnectionViewModel$initListeners$1(this, i, null)), ViewModelKt.getViewModelScope(this));
    }

    public final boolean OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this.KWHzl.getValue().djBIcL(), abstractC12782ctV);
    }

    public final void EZpvd() {
        AbstractC12782ctV abstractC12782ctVAYXKKw = this.KWHzl.getValue().AYXKKw();
        if (abstractC12782ctVAYXKKw != null) {
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).OLrzqt(abstractC12782ctVAYXKKw, this.KWHzl.getValue().djBIcL());
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC18445fiY interfaceC18445fiY = this.djBIcL;
        java.lang.String strCopydefault = this.KWHzl.getValue().copydefault();
        java.lang.String strAEQbTJ = this.KWHzl.getValue().AEQbTJ();
        AbstractC12782ctV abstractC12782ctVAYXKKw = this.KWHzl.getValue().AYXKKw();
        WalletType walletTypeQwvEab = abstractC12782ctVAYXKKw != null ? abstractC12782ctVAYXKKw.QwvEab() : null;
        AbstractC12782ctV abstractC12782ctVAYXKKw2 = this.KWHzl.getValue().AYXKKw();
        interfaceC18445fiY.OLrzqt(str, strCopydefault, strAEQbTJ, walletTypeQwvEab, abstractC12782ctVAYXKKw2 != null ? abstractC12782ctVAYXKKw2.DbNXlk() : null);
    }

    @Override // o.C18351fgk, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        java.lang.Integer numKWHzl = this.KWHzl.getValue().KWHzl();
        if (numKWHzl != null && numKWHzl.intValue() == 0) {
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).DbNXlk(this.KWHzl.getValue().djBIcL());
        } else if (numKWHzl != null && numKWHzl.intValue() == 1) {
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this.KWHzl.getValue().djBIcL());
        }
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this.AYXKKw);
    }

    public final void AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
        C18346fgf value;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        MutableStateFlow<C18346fgf> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default(value, null, null, abstractC12782ctV, null, !OLrzqt(abstractC12782ctV), 11, null)));
    }

    public final void AEQbTJ() {
        C18346fgf value;
        MutableStateFlow<C18346fgf> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default(value, 4, null, null, null, false, 30, null)));
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this.KWHzl.getValue().djBIcL());
    }
}
