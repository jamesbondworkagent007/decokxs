package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.dex.biz.data.OKTWalletInfo;
import com.okinc.unify_trade.dex.biz.data.WalletInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C54598xOh;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54598xOh extends xNW {
    public final boolean OLrzqt;
    public final java.lang.String copydefault = "OKTDexWalletInfoProvider";
    public final C54278xCm KWHzl = new C54278xCm();
    public final C54277xCl EZpvd = new C54277xCl();
    public final MutableStateFlow<ActionBar> AEQbTJ = StateFlowKt.MutableStateFlow(ActionBar.Companion.AEQbTJ());

    @Override // o.xNW
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public boolean bE_() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.xOh$ActionBar */
    public static final class ActionBar {
        public static final C0996ActionBar Companion = new C0996ActionBar(null);
        public static final ActionBar KWHzl = new ActionBar(new OKTWalletInfo((java.lang.String) null, "", false, yDY.AhwBna(), 1, (DefaultConstructorMarker) null));
        public final InterfaceC56387yDm AEQbTJ;
        public final OKTWalletInfo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, OKTWalletInfo oKTWalletInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                oKTWalletInfo = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(oKTWalletInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKTWalletInfo OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull OKTWalletInfo oKTWalletInfo) {
            Intrinsics.checkNotNullParameter(oKTWalletInfo, "");
            return new ActionBar(oKTWalletInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WalletData(walletInfo=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull OKTWalletInfo oKTWalletInfo) {
            Intrinsics.checkNotNullParameter(oKTWalletInfo, "");
            this.EZpvd = oKTWalletInfo;
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xOg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C54598xOh.ActionBar.EZpvd(this.copydefault);
                }
            });
        }

        public static final java.util.Map EZpvd(ActionBar actionBar) {
            java.util.List<WalletInfo> wallets = actionBar.EZpvd.getWallets();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(wallets, 10)), 16));
            for (java.lang.Object obj : wallets) {
                linkedHashMap.put(((WalletInfo) obj).getChainIndex(), obj);
            }
            return linkedHashMap;
        }

        public final java.util.Map<java.lang.String, WalletInfo> EZpvd() {
            return (java.util.Map) this.AEQbTJ.getValue();
        }

        public final boolean AEQbTJ() {
            return this.EZpvd.getHasWalletAddress();
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletInfo walletInfo = EZpvd().get(str);
            if (walletInfo != null) {
                return walletInfo.getAddress();
            }
            return null;
        }

        /* JADX INFO: renamed from: o.xOh$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0996ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xOh.ActionBar.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0996ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0996ActionBar() {
            }

            public final ActionBar AEQbTJ() {
                return ActionBar.KWHzl;
            }
        }
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.List<OKTWalletInfo>> xklOLrzqt = OLrzqt();
        xklOLrzqt.AYXKKw();
        xklOLrzqt.KWHzl(new Function1() { // from class: o.xOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54598xOh.OLrzqt(this.copydefault, xklOLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklOLrzqt, 0L, 1, null);
    }

    public static final Unit OLrzqt(C54598xOh c54598xOh, xKL xkl, ResponseData responseData) {
        java.util.List list;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = c54598xOh.fJNWhG();
        java.lang.String strEZpvd = c54598xOh.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp success:" + z + "; costTime: " + (java.lang.System.currentTimeMillis() - c54598xOh.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null && (!list.isEmpty())) {
            java.lang.String strFJNWhG2 = c54598xOh.fJNWhG();
            java.util.List list2 = (java.util.List) responseData.getData();
            pUU.KWHzl(strFJNWhG2, "请求钱包状态" + (list2 != null ? (OKTWalletInfo) list2.get(0) : null));
            MutableStateFlow<ActionBar> mutableStateFlow = c54598xOh.AEQbTJ;
            java.util.List list3 = (java.util.List) responseData.getData();
            mutableStateFlow.setValue(list3 != null ? new ActionBar((OKTWalletInfo) list3.get(0)) : ActionBar.Companion.AEQbTJ());
            xNW.notifyResult$default(c54598xOh, true, null, 2, null);
        } else {
            c54598xOh.AEQbTJ(false, c54598xOh.AEQbTJ(xkl.AhwBna().getValue()));
        }
        return Unit.INSTANCE;
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.gEmmrt(this.KWHzl, this.EZpvd);
    }

    public final boolean copydefault() {
        return this.AEQbTJ.getValue().AEQbTJ();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.getValue().OLrzqt(str);
    }

    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ.getValue().OLrzqt().getAccountId();
    }

    private final xKL<java.util.List<OKTWalletInfo>> OLrzqt() {
        return hDKMBd() ? this.EZpvd : this.KWHzl;
    }
}
