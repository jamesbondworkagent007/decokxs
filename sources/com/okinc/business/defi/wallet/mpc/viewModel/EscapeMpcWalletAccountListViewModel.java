package com.okinc.business.defi.wallet.mpc.viewModel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.wallet.EsCapeData;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.wallet.mpc.MpcPrivateKeyItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC12784ctX;
import o.AbstractC33073mpa;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import o.C13934dbu;
import o.C33070mpX;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeMpcWalletAccountListViewModel extends AbstractC33073mpa {
    public final Channel<List<MpcPrivateKeyItem>> AEQbTJ;
    public String AYXKKw;
    public AbstractC12784ctX AhwBna;
    public final Channel<List<EsCapeData>> EZpvd;
    public Application KWHzl;
    public final C11010bzJ OLrzqt;
    public int copydefault;
    public int djBIcL;
    public final C13934dbu fetchVPNInfo;
    public final Channel<RequestStatus> gEmmrt;
    public final C12827cuN isConnected;
    public final String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EscapeMpcWalletAccountListViewModel() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12784ctX AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Application application) {
        this.KWHzl = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(AbstractC12784ctX abstractC12784ctX) {
        this.AhwBna = abstractC12784ctX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:25) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r3v0 o.dbu))
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0011: INVOKE 
  (wrap:o.cuN$Application:0x000f: SGET  A[WRAPPED] (LINE:26) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:26)) : (r4v0 o.cuN))
  (wrap:o.bzJ:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bzJ:0x001b: INVOKE 
  (wrap:o.bzJ$ActionBar:0x0019: SGET  A[WRAPPED] (LINE:27) o.bzJ.Companion o.bzJ$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bzJ.ActionBar.getInstance$default(o.bzJ$ActionBar, android.content.Context, int, java.lang.Object):o.bzJ A[MD:(o.bzJ$ActionBar, android.content.Context, int, java.lang.Object):o.bzJ (m), WRAPPED] (LINE:27)) : (r5v0 o.bzJ))
 A[MD:(o.dbu, o.cuN, o.bzJ):void (m)] (LINE:24) call: com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel.<init>(o.dbu, o.cuN, o.bzJ):void type: THIS */
    public /* synthetic */ EscapeMpcWalletAccountListViewModel(C13934dbu c13934dbu, C12827cuN c12827cuN, C11010bzJ c11010bzJ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu, (i & 2) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 4) != 0 ? C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null) : c11010bzJ);
    }

    public EscapeMpcWalletAccountListViewModel(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull C11010bzJ c11010bzJ) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c11010bzJ, "");
        this.fetchVPNInfo = c13934dbu;
        this.isConnected = c12827cuN;
        this.OLrzqt = c11010bzJ;
        this.valueOf = EscapeMpcWalletAccountListViewModel.class.getName();
        this.gEmmrt = ChannelKt.Channel$default(0, null, null, 7, null);
        this.EZpvd = ChannelKt.Channel$default(0, null, null, 7, null);
        this.AEQbTJ = ChannelKt.Channel$default(0, null, null, 7, null);
        this.AYXKKw = "";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class RequestStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RequestStatus[] $VALUES;
        public static final RequestStatus FAILED = new RequestStatus(CardSyncResponse.FAILED, 0);
        public static final RequestStatus SUCCESS = new RequestStatus("SUCCESS", 1);
        public static final RequestStatus LOADING = new RequestStatus("LOADING", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RequestStatus[] $values() {
            return new RequestStatus[]{FAILED, SUCCESS, LOADING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RequestStatus> getEntries() {
            return $ENTRIES;
        }

        private RequestStatus(String str, int i) {
        }

        static {
            RequestStatus[] requestStatusArr$values = $values();
            $VALUES = requestStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(requestStatusArr$values);
        }

        public static RequestStatus valueOf(String str) {
            return (RequestStatus) Enum.valueOf(RequestStatus.class, str);
        }

        public static RequestStatus[] values() {
            return (RequestStatus[]) $VALUES.clone();
        }
    }

    public static final class Application {
        public final String AEQbTJ;
        public final String KWHzl;
        public final MpcWalletDecodeInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, MpcWalletDecodeInfo mpcWalletDecodeInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                mpcWalletDecodeInfo = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = application.KWHzl;
            }
            if ((i & 4) != 0) {
                str2 = application.AEQbTJ;
            }
            return application.copydefault(mpcWalletDecodeInfo, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MpcWalletDecodeInfo KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(mpcWalletDecodeInfo, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EscapeAccountInformationBean(mpcWalletDecodeInfo=" + this.OLrzqt + ", password=" + this.KWHzl + ", passwordHash=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = mpcWalletDecodeInfo;
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    public final Flow<RequestStatus> EZpvd() {
        return FlowKt.receiveAsFlow(this.gEmmrt);
    }

    public final Flow<List<EsCapeData>> AEQbTJ() {
        return FlowKt.receiveAsFlow(this.EZpvd);
    }

    public final Flow<List<MpcPrivateKeyItem>> OLrzqt() {
        return FlowKt.receiveAsFlow(this.AEQbTJ);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapeMpcWalletAccountListViewModel$getMaxWalletIndex$1(this, str, null), 3, null);
    }

    public final void EZpvd(int i) {
        this.djBIcL = i;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new EscapeMpcWalletAccountListViewModel$handleShowDataList$1(this, i, new HashMap(), null), 2, null);
    }

    public final String OLrzqt(int i) {
        int i2 = i + 1;
        if (i2 < 10) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher) + " 0" + i2;
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher) + " " + i2;
    }

    public final void EZpvd(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1(this, i, str, null), 2, null);
    }

    public final void AEQbTJ(@NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$2(this, mpcWalletDecodeInfo, null), 2, null);
    }
}
