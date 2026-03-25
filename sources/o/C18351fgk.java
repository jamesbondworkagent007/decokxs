package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectViewModel$checkDAppSessions$1$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectViewModel$listenDAppSessionStateChanges$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectViewModel$listener$1$onConnected$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectViewModel$listener$1$onDisConnect$1;
import com.okinc.core.util.ScannerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C15935eaT;
import o.C16058eck;

/* JADX INFO: renamed from: o.fgk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C18351fgk extends ViewModel {
    public final Activity AkhnZx;
    public final MutableSharedFlow<C16061ecn> DbNXlk;
    public final Flow<C16061ecn> gEmmrt;
    public final Flow<C16061ecn> isConnected;
    public final Flow<C16061ecn> values;
    public final MutableLiveData<java.lang.Integer> valueOf = new MutableLiveData<>(0);
    public final MutableLiveData<C18343fgc> AhwBna = new MutableLiveData<>(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C16061ecn> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C18343fgc> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> copydefault() {
        return this.valueOf;
    }

    public C18351fgk() {
        MutableSharedFlow<C16061ecn> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default;
        Flow<C16061ecn> flowKWHzl = C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null).KWHzl();
        this.isConnected = flowKWHzl;
        Flow<C16061ecn> flowKWHzl2 = C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null).KWHzl();
        this.values = flowKWHzl2;
        this.gEmmrt = FlowKt.merge(mutableSharedFlowMutableSharedFlow$default, flowKWHzl, flowKWHzl2);
        Activity activity = new Activity();
        this.AkhnZx = activity;
        gEmmrt();
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AEQbTJ(activity);
    }

    /* JADX INFO: renamed from: o.fgk$Activity */
    public static final class Activity implements WalletConnectUtils.StateListAnimator {
        public Activity() {
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(ShowWCAuthRequestArgs showWCAuthRequestArgs) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, showWCAuthRequestArgs);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.copydefault(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str);
            C18351fgk.this.copydefault().setValue(5);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletConnectUtils.StateListAnimator.Activity.AEQbTJ(this, str, z);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(C18351fgk.this), null, null, new WalletConnectViewModel$listener$1$onDisConnect$1(C18351fgk.this, str, null), 3, null);
            if ((C54819xWm.KWHzl().AEQbTJ() instanceof ScannerActivity) || z) {
                return;
            }
            C33134mqi.EZpvd(C13754dXa.FragmentManager.hlXVux, 17, 0, 0);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(C18351fgk.this), null, null, new WalletConnectViewModel$listener$1$onConnected$1(C18351fgk.this, str, null), 3, null);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18351fgk.this.copydefault().setValue(1);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C55326xho.toastWithFailedIcon$default(str2, 0, 1, (java.lang.Object) null);
        }
    }

    public final Job gEmmrt() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletConnectViewModel$listenDAppSessionStateChanges$1(this, null), 3, null);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.fgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18351fgk.OLrzqt(this.copydefault, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18351fgk.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18351fgk.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fgn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18351fgk.copydefault(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(C18351fgk c18351fgk, AbstractC12782ctV abstractC12782ctV) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(c18351fgk), null, null, new WalletConnectViewModel$checkDAppSessions$1$1(abstractC12782ctV, c18351fgk, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this.AkhnZx);
    }
}
