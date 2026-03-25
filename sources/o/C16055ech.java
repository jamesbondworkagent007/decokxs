package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ech, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16055ech {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public ShowWCAuthRequestArgs KWHzl;
    public final MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> copydefault = new MutableLiveData<>();
    public ActionBar OLrzqt = new ActionBar();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(ShowWCAuthRequestArgs showWCAuthRequestArgs) {
        this.KWHzl = showWCAuthRequestArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShowWCAuthRequestArgs OLrzqt() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.ech$ActionBar */
    public static final class ActionBar implements WalletConnectUtils.StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        public ActionBar() {
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, boolean z) {
            WalletConnectUtils.StateListAnimator.Activity.AEQbTJ(this, str, z);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils.StateListAnimator.Activity.copydefault(this, str, str2);
            C16055ech.this.EZpvd(str);
            C16055ech.this.KWHzl(str2);
            C16055ech.this.AEQbTJ().setValue(C56390yDp.OLrzqt(3, null));
            C16055ech.this.AYXKKw();
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str) {
            C16055ech.this.AEQbTJ().setValue(C56390yDp.OLrzqt(-1, str));
            C16055ech.this.AYXKKw();
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(ShowWCAuthRequestArgs showWCAuthRequestArgs) {
            Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
            C16055ech.this.EZpvd(showWCAuthRequestArgs);
            C16055ech.this.AEQbTJ().setValue(C56390yDp.OLrzqt(4, null));
            C16055ech.this.AYXKKw();
        }
    }

    public final void copydefault() {
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AEQbTJ(this.OLrzqt);
    }

    public final void AYXKKw() {
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this.OLrzqt);
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.ecf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16055ech.copydefault(str, this, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16055ech.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eco
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16055ech.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractActivityC33041mov.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ecl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16055ech.KWHzl(function12, obj);
            }
        }));
    }

    public static final Unit copydefault(java.lang.String str, final C16055ech c16055ech, AbstractC12782ctV abstractC12782ctV) {
        WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
        Intrinsics.copydefault(abstractC12782ctV);
        instance$default.KWHzl(str, abstractC12782ctV, (java.lang.String) null, new yHO() { // from class: o.ecg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C16055ech.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C16055ech c16055ech, boolean z, int i, java.lang.String str) {
        if (z) {
            c16055ech.copydefault();
            c16055ech.copydefault.setValue(C56390yDp.OLrzqt(1, str));
        } else {
            c16055ech.copydefault.setValue(C56390yDp.OLrzqt(2, str));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
