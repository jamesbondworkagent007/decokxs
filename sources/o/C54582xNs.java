package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.HiddenCurrencyBean;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.core.OkTrade$loadBiz$3;
import com.okinc.unify_trade.trade.core.OkTrade$refreshBizInfoDetail$1;
import com.okinc.unify_trade.trade.core.OkTrade$refreshCurrentBiz$1;
import com.okinc.unify_trade.trade.core.OkTrade$reloadBizForInstUpdate$1;
import com.okinc.unify_trade.trade.core.OkTrade$syncTradeDataSettings$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import me.relex.circleindicator.SnackbarBehavior;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54582xNs implements InterfaceC54581xNr {
    private static int AuCTelauCTel = 1;
    private static int AubY = 0;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    private static int wlaJM = 0;
    private static int zuBGHE = 1;
    public final C54518xLj AEQbTJ;
    public final C54536xML AYXKKw;
    public final CoroutineExceptionHandler AhwBna;
    public final java.util.HashMap<java.lang.String, java.lang.String> AkhnZx;
    public xGX AuCTel;
    public java.util.ArrayList<java.lang.Object> DbNXlk;
    public xOR EZpvd;
    public C54526xLr KWHzl;
    public final java.util.ArrayList<AbstractC54575xNl> copydefault;
    public final C54614xOx djBIcL;
    public C56084xwD ejfBZ;
    public xOW fARcdN;
    public C54489xKh fIwbmz;
    public xOU fJNWhG;
    public java.util.ArrayList<java.lang.String> fetchVPNInfo;
    public final C56130xwx gEmmrt;
    public final C56131xwy getFieldNames;
    public final C56083xwC getNewProxyInstance;
    public final CoroutineScope hDKMBd;
    public final C54607xOq isConnected;
    public final java.util.HashMap<java.lang.String, java.lang.Boolean> iwGUEr;
    public boolean uzCIH;
    public java.util.HashMap<java.lang.String, AbstractC54531xLw> valueOf;
    public AbstractC55671xoO values;
    public final C54630xPm zLjUOn;
    public final C56087xwG zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = wlaJM + 81;
        AuCTelauCTel = i % 128;
        int i2 = i % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object copydefault(java.lang.Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i7 | i5;
        int i9 = (~i8) | (~(i7 | i));
        int i10 = (~((~i) | i7 | (~i5))) | (~(i6 | i5));
        int i11 = i6 + i5 + i3 + ((-540997959) * i2) + (162607451 * i4);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i6) + 1723858944 + (1667710703 * i5) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i3) + ((-672137216) * i2) + (483393536 * i4) + (377683968 * i12);
        int i14 = (i6 * 228155117) + 240245784 + (i5 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i3 * 228155391) + (i2 * (-329950905)) + (i4 * (-2026639707)) + (i12 * 159186944);
        if (i13 + (i14 * i14 * (-1451425792)) != 1) {
            return KWHzl(objArr);
        }
        C54582xNs c54582xNs = (C54582xNs) objArr[0];
        int i15 = 2 % 2;
        int i16 = AubY;
        int i17 = i16 + 51;
        zuBGHE = i17 % 128;
        int i18 = i17 % 2;
        java.util.HashMap<java.lang.String, AbstractC54531xLw> map = c54582xNs.valueOf;
        int i19 = i16 + 117;
        zuBGHE = i19 % 128;
        int i20 = i19 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C56130xwx AYXKKw() {
        int i = 2 % 2;
        int i2 = AubY + 63;
        int i3 = i2 % 128;
        zuBGHE = i3;
        int i4 = i2 % 2;
        C56130xwx c56130xwx = this.gEmmrt;
        int i5 = i3 + 125;
        AubY = i5 % 128;
        if (i5 % 2 == 0) {
            return c56130xwx;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C54630xPm AuCTelauCTel() {
        int i = 2 % 2;
        int i2 = AubY + 47;
        zuBGHE = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zLjUOn;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void OLrzqt(boolean z) {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 85;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        this.uzCIH = z;
        int i5 = i2 + 59;
        zuBGHE = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public xOR copydefault() {
        xOR xor;
        int i = 2 % 2;
        int i2 = zuBGHE;
        int i3 = i2 + 3;
        AubY = i3 % 128;
        if (i3 % 2 != 0) {
            xor = this.EZpvd;
            int i4 = 93 / 0;
        } else {
            xor = this.EZpvd;
        }
        int i5 = i2 + 33;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return xor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C56131xwy fetchVPNInfo() {
        int i = 2 % 2;
        int i2 = zuBGHE + 11;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        C56131xwy c56131xwy = this.getFieldNames;
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return c56131xwy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C56084xwD getFieldNames() {
        int i = 2 % 2;
        int i2 = AubY + 83;
        int i3 = i2 % 128;
        zuBGHE = i3;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        C56084xwD c56084xwD = this.ejfBZ;
        int i4 = i3 + 73;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return c56084xwD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public xOW getNewProxyInstance() {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 107;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        xOW xow = this.fARcdN;
        int i5 = i2 + 47;
        zuBGHE = i5 % 128;
        if (i5 % 2 != 0) {
            return xow;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.util.ArrayList<java.lang.String> values() {
        int i = 2 % 2;
        int i2 = zuBGHE + 83;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fetchVPNInfo;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public xOU wlaJM() {
        int i = 2 % 2;
        int i2 = AubY + 17;
        int i3 = i2 % 128;
        zuBGHE = i3;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        xOU xou = this.fJNWhG;
        int i4 = i3 + 63;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return xou;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C56087xwG zLjUOn() {
        int i = 2 % 2;
        int i2 = zuBGHE + 1;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zsXlph;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C54489xKh zsXlph() {
        int i = 2 % 2;
        int i2 = zuBGHE;
        int i3 = i2 + 51;
        AubY = i3 % 128;
        int i4 = i3 % 2;
        C54489xKh c54489xKh = this.fIwbmz;
        int i5 = i2 + 57;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return c54489xKh;
    }

    /* JADX INFO: renamed from: o.xNs$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.copydefault("OkTrade", "Coroutine Exception: " + th.getMessage());
        }
    }

    public C54582xNs(@NotNull C54614xOx c54614xOx) {
        Intrinsics.checkNotNullParameter(c54614xOx, "");
        this.djBIcL = c54614xOx;
        C54607xOq c54607xOq = new C54607xOq(c54614xOx);
        this.isConnected = c54607xOq;
        this.valueOf = new java.util.HashMap<>();
        StateListAnimator stateListAnimator = new StateListAnimator(CoroutineExceptionHandler.Key);
        this.AhwBna = stateListAnimator;
        this.hDKMBd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()).plus(stateListAnimator));
        this.ejfBZ = new C56084xwD();
        C54606xOp c54606xOpAhwBna = c54607xOq.AhwBna();
        Intrinsics.copydefault(c54606xOpAhwBna, "");
        xNS xnsCopydefault = c54607xOq.copydefault();
        Intrinsics.copydefault(xnsCopydefault, "");
        this.fARcdN = new xOW(c54606xOpAhwBna, xnsCopydefault);
        this.EZpvd = new xOR();
        this.fetchVPNInfo = new java.util.ArrayList<>();
        this.fJNWhG = new xOU();
        this.fIwbmz = new C54489xKh();
        this.gEmmrt = new C56130xwx();
        this.getFieldNames = new C56131xwy();
        this.getNewProxyInstance = new C56083xwC();
        this.zsXlph = new C56087xwG();
        this.AEQbTJ = new C54518xLj(this.fARcdN);
        this.KWHzl = new C54526xLr();
        this.zLjUOn = new C54630xPm();
        this.AYXKKw = new C54536xML();
        this.DbNXlk = new java.util.ArrayList<>();
        this.copydefault = new java.util.ArrayList<>();
        this.iwGUEr = new java.util.HashMap<>();
        this.AkhnZx = new java.util.HashMap<>();
    }

    public static final /* synthetic */ java.util.HashMap KWHzl(C54582xNs c54582xNs) {
        int i = 2 % 2;
        int i2 = AubY + 93;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        java.util.HashMap<java.lang.String, java.lang.String> map = c54582xNs.AkhnZx;
        if (i3 != 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ java.util.ArrayList OLrzqt(C54582xNs c54582xNs) {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 75;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        java.util.ArrayList<AbstractC54575xNl> arrayList = c54582xNs.copydefault;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 11;
        zuBGHE = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public static final /* synthetic */ void OLrzqt(C54582xNs c54582xNs, java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 67;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        c54582xNs.isConnected(str);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ C54614xOx copydefault(C54582xNs c54582xNs) {
        int i = 2 % 2;
        int i2 = AubY + 99;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        C54614xOx c54614xOx = c54582xNs.djBIcL;
        if (i3 != 0) {
            return c54614xOx;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void copydefault(C54582xNs c54582xNs, java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 73;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        c54582xNs.AuCTel(str);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: o.xNs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xNs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> DTwDnp() {
        int i = 2 % 2;
        int i2 = AubY + 125;
        zuBGHE = i2 % 128;
        if (i2 % 2 == 0) {
            this.isConnected.OLrzqt();
            throw null;
        }
        xNQ xnqOLrzqt = this.isConnected.OLrzqt();
        if (xnqOLrzqt != null) {
            int i3 = zuBGHE + 41;
            AubY = i3 % 128;
            int i4 = i3 % 2;
            java.util.HashMap<java.lang.String, TradeCoinInfo> mapCopydefault = xnqOLrzqt.copydefault();
            if (mapCopydefault != null) {
                return mapCopydefault;
            }
        }
        java.util.HashMap<java.lang.String, TradeCoinInfo> map = new java.util.HashMap<>();
        int i5 = zuBGHE + 69;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, HiddenCurrencyBean> QKVWgx() {
        java.util.HashMap<java.lang.String, HiddenCurrencyBean> mapOLrzqt;
        int i = 2 % 2;
        int i2 = AubY + 101;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        xNT xntAEQbTJ = this.isConnected.AEQbTJ();
        if (xntAEQbTJ != null && (mapOLrzqt = xntAEQbTJ.OLrzqt()) != null) {
            return mapOLrzqt;
        }
        java.util.HashMap<java.lang.String, HiddenCurrencyBean> map = new java.util.HashMap<>();
        int i4 = AubY + 27;
        zuBGHE = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    @Override // o.InterfaceC54581xNr
    public void AxsJAY() {
        int i = 2 % 2;
        int i2 = AubY + 25;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        QVAiDq();
        int i4 = AubY + 3;
        zuBGHE = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean AEQbTJ(@NotNull C54588xNy c54588xNy) {
        int i = 2 % 2;
        int i2 = zuBGHE + 83;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c54588xNy, "");
        boolean zIsInitialized$default = C54614xOx.isInitialized$default(this.djBIcL, c54588xNy, null, 2, null);
        int i4 = AubY + 27;
        zuBGHE = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsInitialized$default;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean zuBGHE() {
        int i = 2 % 2;
        C54603xOm c54603xOmValueOf = this.isConnected.valueOf();
        if (c54603xOmValueOf != null) {
            int i2 = zuBGHE + 73;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            java.lang.Boolean boolOLrzqt = c54603xOmValueOf.OLrzqt();
            if (boolOLrzqt != null) {
                int i4 = zuBGHE + 125;
                AubY = i4 % 128;
                if (i4 % 2 == 0) {
                    return boolOLrzqt.booleanValue();
                }
                boolOLrzqt.booleanValue();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.util.ArrayList<AbstractC54531xLw> AuCTel() {
        java.util.ArrayList<AbstractC54531xLw> arrayList;
        int i = 2 % 2;
        int i2 = AubY + 95;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        C54591xOa c54591xOaKWHzl = this.isConnected.KWHzl();
        if (c54591xOaKWHzl == null || (arrayList = c54591xOaKWHzl.iwGUEr()) == null) {
            arrayList = new java.util.ArrayList<>();
            int i4 = zuBGHE + 87;
            AubY = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 4;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 o.xOa) = (r1v5 o.xOa), (r1v11 o.xOa) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<FutureGroupInfo> fARcdN() {
        C54591xOa c54591xOaKWHzl;
        java.util.List<FutureGroupInfo> listAuCTelauCTel;
        int i = 2 % 2;
        int i2 = zuBGHE + 67;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            c54591xOaKWHzl = this.isConnected.KWHzl();
            int i3 = 62 / 0;
            if (c54591xOaKWHzl != null) {
                int i4 = AubY + 53;
                zuBGHE = i4 % 128;
                if (i4 % 2 == 0) {
                    c54591xOaKWHzl.AuCTelauCTel();
                    throw null;
                }
                listAuCTelauCTel = c54591xOaKWHzl.AuCTelauCTel();
                if (listAuCTelauCTel == null) {
                    listAuCTelauCTel = yDY.AhwBna();
                }
            }
        } else {
            c54591xOaKWHzl = this.isConnected.KWHzl();
            if (c54591xOaKWHzl != null) {
            }
        }
        int i5 = zuBGHE + 91;
        AubY = i5 % 128;
        if (i5 % 2 == 0) {
            return listAuCTelauCTel;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<FutureGroupInfo> DbNXlk() {
        java.util.List<FutureGroupInfo> listAhwBna;
        int i = 2 % 2;
        C54591xOa c54591xOaKWHzl = this.isConnected.KWHzl();
        java.lang.Object obj = null;
        if (c54591xOaKWHzl != null) {
            int i2 = zuBGHE + 83;
            AubY = i2 % 128;
            if (i2 % 2 != 0) {
                c54591xOaKWHzl.copydefault();
                throw null;
            }
            listAhwBna = c54591xOaKWHzl.copydefault();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
                int i3 = AubY + 53;
                zuBGHE = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        int i5 = AubY + 21;
        zuBGHE = i5 % 128;
        if (i5 % 2 != 0) {
            return listAhwBna;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public FutureGroupInfo EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C54591xOa c54591xOaKWHzl;
        java.util.HashMap<java.lang.String, FutureGroupInfo> mapOLrzqt;
        C54591xOa c54591xOaKWHzl2;
        java.util.HashMap<java.lang.String, FutureGroupInfo> mapWlaJM;
        java.util.HashMap<java.lang.String, FutureGroupInfo> mapAEQbTJ;
        int i = 2 % 2;
        int i2 = zuBGHE + 11;
        AubY = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            str.hashCode();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iHashCode = str.hashCode();
        if (iHashCode == -1956807563) {
            if (!str.equals("OPTION") || (c54591xOaKWHzl = this.isConnected.KWHzl()) == null || (mapOLrzqt = c54591xOaKWHzl.OLrzqt()) == null) {
                return null;
            }
            FutureGroupInfo futureGroupInfo = mapOLrzqt.get(str2);
            int i3 = AubY + 67;
            zuBGHE = i3 % 128;
            int i4 = i3 % 2;
            return futureGroupInfo;
        }
        if (iHashCode == 2558355) {
            if (!str.equals("SWAP") || (c54591xOaKWHzl2 = this.isConnected.KWHzl()) == null || (mapWlaJM = c54591xOaKWHzl2.wlaJM()) == null) {
                return null;
            }
            int i5 = zuBGHE + 85;
            AubY = i5 % 128;
            int i6 = i5 % 2;
            return mapWlaJM.get(str2);
        }
        if (iHashCode != 214415088) {
            return null;
        }
        if (!str.equals("FUTURES")) {
            int i7 = AubY + 37;
            zuBGHE = i7 % 128;
            int i8 = i7 % 2;
            return null;
        }
        C54591xOa c54591xOaKWHzl3 = this.isConnected.KWHzl();
        if (c54591xOaKWHzl3 == null || (mapAEQbTJ = c54591xOaKWHzl3.AEQbTJ()) == null) {
            return null;
        }
        return mapAEQbTJ.get(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r1 = o.C54582xNs.zuBGHE + 47;
        o.C54582xNs.AubY = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r1.getFieldNames();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<java.lang.String> ejfBZ() {
        C54591xOa c54591xOaKWHzl;
        int i = 2 % 2;
        int i2 = AubY + 95;
        zuBGHE = i2 % 128;
        if (i2 % 2 == 0) {
            c54591xOaKWHzl = this.isConnected.KWHzl();
            int i3 = 92 / 0;
        } else {
            c54591xOaKWHzl = this.isConnected.KWHzl();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
  0x002b: PHI (r1v6 o.xOa) = (r1v5 o.xOa), (r1v9 o.xOa) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean DbNXlk(@NotNull java.lang.String str) {
        C54591xOa c54591xOaKWHzl;
        int i = 2 % 2;
        int i2 = AubY + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        zuBGHE = i2 % 128;
        boolean zKWHzl = false;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            c54591xOaKWHzl = this.isConnected.KWHzl();
            int i3 = 14 / 0;
            if (c54591xOaKWHzl != null) {
                zKWHzl = c54591xOaKWHzl.KWHzl(str);
                int i4 = AubY + 91;
                zuBGHE = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 4;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            c54591xOaKWHzl = this.isConnected.KWHzl();
            if (c54591xOaKWHzl != null) {
            }
        }
        return zKWHzl;
    }

    @Override // o.InterfaceC54581xNr
    public boolean values(java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 59;
        zuBGHE = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return false;
        }
        if (str.length() == 0) {
            int i3 = AubY + 45;
            zuBGHE = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        return this.fetchVPNInfo.contains(str);
    }

    @Override // o.InterfaceC54581xNr
    public BizInstrument fIwbmz() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = zuBGHE + 21;
        AubY = i4 % 128;
        BizInstrument bizInstrumentAEQbTJ = null;
        if (i4 % 2 != 0) {
            xUV.EZpvd.EZpvd("current_instrument_type");
            bizInstrumentAEQbTJ.hashCode();
            throw null;
        }
        java.lang.String strEZpvd = xUV.EZpvd.EZpvd("current_instrument_type");
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(strEZpvd);
        if (abstractC54531xLwOLrzqt == null) {
            i = zuBGHE + 95;
            i2 = i % 128;
        } else {
            bizInstrumentAEQbTJ = AEQbTJ(abstractC54531xLwOLrzqt, false);
            i = zuBGHE + 25;
            i2 = i % 128;
        }
        AubY = i2;
        int i5 = i % 2;
        return bizInstrumentAEQbTJ;
    }

    public final BizInstrument AEQbTJ(AbstractC54531xLw abstractC54531xLw, boolean z) {
        BizInstrument bizInstrumentValueOf;
        int i = 2 % 2;
        xUV xuv = xUV.EZpvd;
        java.lang.String strEZpvd = xuv.EZpvd("current_instrument_id");
        java.lang.Object obj = null;
        if (strEZpvd == null) {
            int i2 = AubY + 119;
            zuBGHE = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            strEZpvd = "";
        }
        if (z) {
            bizInstrumentValueOf = abstractC54531xLw.copydefault();
            if (bizInstrumentValueOf != null) {
                copydefault(new java.lang.Object[]{this, bizInstrumentValueOf}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -1090269693, 1090269693);
            } else {
                bizInstrumentValueOf = null;
            }
        } else {
            java.lang.String strEZpvd2 = xuv.EZpvd("current_uly");
            if (strEZpvd2 == null) {
                strEZpvd2 = "";
            }
            java.lang.String strEZpvd3 = xuv.EZpvd("current_alias");
            java.lang.String str = strEZpvd3 != null ? strEZpvd3 : "";
            if ((abstractC54531xLw instanceof xLC) && C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd2) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                bizInstrumentValueOf = ((xLC) abstractC54531xLw).valueOf(strEZpvd2, str);
            } else {
                bizInstrumentValueOf = abstractC54531xLw.valueOf(strEZpvd);
            }
        }
        if (AbstractC54531xLw.isInitFun$default(abstractC54531xLw, false, 1, null) && bizInstrumentValueOf == null) {
            int i3 = AubY + 17;
            zuBGHE = i3 % 128;
            if (i3 % 2 != 0) {
                BizInstrument bizInstrumentCopydefault = abstractC54531xLw.copydefault();
                if (bizInstrumentCopydefault != null) {
                    copydefault(new java.lang.Object[]{this, bizInstrumentCopydefault}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -1090269693, 1090269693);
                    bizInstrumentValueOf = bizInstrumentCopydefault;
                }
            } else {
                abstractC54531xLw.copydefault();
                obj.hashCode();
                throw null;
            }
        }
        int i4 = zuBGHE + 63;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return bizInstrumentValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void KWHzl(@NotNull BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AubY + 15;
        zuBGHE = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            copydefault(new java.lang.Object[]{this, bizInstrument}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -1090269693, 1090269693);
            throw null;
        }
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        copydefault(new java.lang.Object[]{this, bizInstrument}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -1090269693, 1090269693);
        int i3 = AubY + 1;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        BizInstrument bizInstrument = (BizInstrument) objArr[1];
        int i = 2 % 2;
        int i2 = AubY + 119;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        if (true ^ Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) {
            xUV xuv = xUV.EZpvd;
            xuv.copydefault("current_instrument_id", bizInstrument.getInstId());
            xuv.copydefault("current_instrument_type", bizInstrument.getInstType());
        } else {
            Intrinsics.copydefault(bizInstrument, "");
            FutureInstrument futureInstrument = (FutureInstrument) bizInstrument;
            xUV xuv2 = xUV.EZpvd;
            xuv2.copydefault("current_instrument_id", bizInstrument.getInstId());
            xuv2.copydefault("current_instrument_type", bizInstrument.getInstType());
            xuv2.copydefault("current_alias", futureInstrument.getAlias());
            xuv2.copydefault("current_uly", futureInstrument.getInstFly());
        }
        int i4 = zuBGHE + 101;
        AubY = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public AbstractC54531xLw OLrzqt(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = zuBGHE + 31;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC54531xLw abstractC54531xLw = this.valueOf.get(str);
        int i4 = zuBGHE + 91;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return abstractC54531xLw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public AbstractC54531xLw djBIcL(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 53;
        zuBGHE = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.valueOf.get(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.get(str);
        throw null;
    }

    @Override // o.InterfaceC54581xNr
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC54531xLw> continuation) {
        int i = 2 % 2;
        pUU.KWHzl("OkTrade", "----------->loadBiz=" + str);
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new OkTrade$loadBiz$3(this, str, null), continuation);
        int i2 = zuBGHE + 115;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            return objWithContext;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r4 r6
  0x0036: PHI (r4v7 com.okinc.unify_trade.trade.core.OkTrade$refreshCurrentBiz$1) = 
  (r4v6 com.okinc.unify_trade.trade.core.OkTrade$refreshCurrentBiz$1)
  (r4v9 com.okinc.unify_trade.trade.core.OkTrade$refreshCurrentBiz$1)
 binds: [B:10:0x0034, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r6v11 int) = (r6v10 int), (r6v13 int) binds: [B:10:0x0034, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super SourceResp<AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        OkTrade$refreshCurrentBiz$1 okTrade$refreshCurrentBiz$1;
        AbstractC54531xLw abstractC54531xLw;
        C54582xNs c54582xNs;
        AbstractC54531xLw abstractC54531xLw2;
        AbstractC54531xLw abstractC54531xLw3;
        int i;
        int i2 = 2 % 2;
        int i3 = zuBGHE + 121;
        int i4 = i3 % 128;
        AubY = i4;
        int i5 = i3 % 2;
        if (continuation instanceof OkTrade$refreshCurrentBiz$1) {
            int i6 = i4 + 53;
            zuBGHE = i6 % 128;
            if (i6 % 2 == 0) {
                okTrade$refreshCurrentBiz$1 = (OkTrade$refreshCurrentBiz$1) continuation;
                i = okTrade$refreshCurrentBiz$1.label;
                int i7 = 97 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i8 = AubY + 31;
                    zuBGHE = i8 % 128;
                    int i9 = i8 % 2;
                    okTrade$refreshCurrentBiz$1.label = i - Integer.MIN_VALUE;
                    int i10 = AubY + 67;
                    zuBGHE = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    okTrade$refreshCurrentBiz$1 = new OkTrade$refreshCurrentBiz$1(this, continuation);
                }
            } else {
                okTrade$refreshCurrentBiz$1 = (OkTrade$refreshCurrentBiz$1) continuation;
                i = okTrade$refreshCurrentBiz$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        java.lang.Object objEZpvd = okTrade$refreshCurrentBiz$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i12 = okTrade$refreshCurrentBiz$1.label;
        if (i12 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            xUV xuv = xUV.EZpvd;
            pUU.KWHzl("OkTrade", "----------->loadCurrentBiz refreshCurrentBiz " + xuv.KWHzl());
            abstractC54531xLw = this.valueOf.get(xuv.KWHzl());
            java.lang.String strKWHzl = xuv.KWHzl();
            okTrade$refreshCurrentBiz$1.L$0 = this;
            okTrade$refreshCurrentBiz$1.L$1 = abstractC54531xLw;
            okTrade$refreshCurrentBiz$1.label = 1;
            objEZpvd = EZpvd(strKWHzl, okTrade$refreshCurrentBiz$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            int i13 = AubY + 103;
            zuBGHE = i13 % 128;
            int i14 = i13 % 2;
            c54582xNs = this;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = AubY + 95;
                zuBGHE = i15 % 128;
                int i16 = i15 % 2;
                abstractC54531xLw3 = (AbstractC54531xLw) okTrade$refreshCurrentBiz$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                abstractC54531xLw2 = abstractC54531xLw3;
                return new SourceResp(C56443yFo.KWHzl(true), abstractC54531xLw2, null, 4, null);
            }
            abstractC54531xLw = (AbstractC54531xLw) okTrade$refreshCurrentBiz$1.L$1;
            c54582xNs = (C54582xNs) okTrade$refreshCurrentBiz$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC54531xLw abstractC54531xLw4 = abstractC54531xLw;
        if (((AbstractC54531xLw) objEZpvd) == null) {
            return new SourceResp(C56443yFo.KWHzl(false), abstractC54531xLw4, null, 4, null);
        }
        BizInstrument bizInstrumentFIwbmz = c54582xNs.fIwbmz();
        if (bizInstrumentFIwbmz == null) {
            if (abstractC54531xLw4 != null) {
                int i17 = AubY + 33;
                zuBGHE = i17 % 128;
                int i18 = i17 % 2;
                bizInstrumentFIwbmz = abstractC54531xLw4.copydefault();
            } else {
                bizInstrumentFIwbmz = null;
            }
            if (bizInstrumentFIwbmz != null) {
                copydefault(new java.lang.Object[]{c54582xNs, bizInstrumentFIwbmz}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -1090269693, 1090269693);
            }
        }
        if (bizInstrumentFIwbmz == null) {
            pUU.KWHzl("OkTrade", "----------->refreshCurrentBiz currentBiz==null");
            return new SourceResp(C56443yFo.KWHzl(false), abstractC54531xLw4, null, 4, null);
        }
        pUU.KWHzl("OkTrade", "----------->refreshCurrentBiz " + bizInstrumentFIwbmz);
        if (abstractC54531xLw4 == null) {
            abstractC54531xLw2 = abstractC54531xLw4;
            return new SourceResp(C56443yFo.KWHzl(true), abstractC54531xLw2, null, 4, null);
        }
        okTrade$refreshCurrentBiz$1.L$0 = abstractC54531xLw4;
        okTrade$refreshCurrentBiz$1.L$1 = null;
        okTrade$refreshCurrentBiz$1.label = 2;
        objEZpvd = abstractC54531xLw4.EZpvd(bizInstrumentFIwbmz, okTrade$refreshCurrentBiz$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        abstractC54531xLw3 = abstractC54531xLw4;
        abstractC54531xLw2 = abstractC54531xLw3;
        return new SourceResp(C56443yFo.KWHzl(true), abstractC54531xLw2, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OkTrade$refreshBizInfoDetail$1 okTrade$refreshBizInfoDetail$1;
        BizInstrument bizInstrument2;
        AbstractC54531xLw abstractC54531xLw;
        int i;
        int i2 = 2 % 2;
        if (continuation instanceof OkTrade$refreshBizInfoDetail$1) {
            okTrade$refreshBizInfoDetail$1 = (OkTrade$refreshBizInfoDetail$1) continuation;
            int i3 = okTrade$refreshBizInfoDetail$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                okTrade$refreshBizInfoDetail$1.label = i3 - Integer.MIN_VALUE;
            } else {
                okTrade$refreshBizInfoDetail$1 = new OkTrade$refreshBizInfoDetail$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = okTrade$refreshBizInfoDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = okTrade$refreshBizInfoDetail$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AbstractC54531xLw abstractC54531xLw2 = this.valueOf.get(bizInstrument.getInstType());
            java.lang.String instType = bizInstrument.getInstType();
            okTrade$refreshBizInfoDetail$1.L$0 = bizInstrument;
            okTrade$refreshBizInfoDetail$1.L$1 = abstractC54531xLw2;
            okTrade$refreshBizInfoDetail$1.label = 1;
            java.lang.Object objEZpvd2 = EZpvd(instType, okTrade$refreshBizInfoDetail$1);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            bizInstrument2 = bizInstrument;
            abstractC54531xLw = abstractC54531xLw2;
            objEZpvd = objEZpvd2;
        } else {
            if (i4 != 1) {
                int i5 = AubY;
                int i6 = i5 + 121;
                zuBGHE = i6 % 128;
                if (i6 % 2 != 0 ? i4 != 2 : i4 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i5 + 101;
                zuBGHE = i7 % 128;
                int i8 = i7 % 2;
                C56391yDq.AEQbTJ(objEZpvd);
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(true);
                i = AubY + 77;
                zuBGHE = i % 128;
                if (i % 2 == 0) {
                    return boolKWHzl;
                }
                throw null;
            }
            abstractC54531xLw = (AbstractC54531xLw) okTrade$refreshBizInfoDetail$1.L$1;
            bizInstrument2 = (BizInstrument) okTrade$refreshBizInfoDetail$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        if (((AbstractC54531xLw) objEZpvd) == null) {
            return C56443yFo.KWHzl(false);
        }
        if (abstractC54531xLw != null) {
            okTrade$refreshBizInfoDetail$1.L$0 = null;
            okTrade$refreshBizInfoDetail$1.L$1 = null;
            okTrade$refreshBizInfoDetail$1.label = 2;
            objEZpvd = abstractC54531xLw.EZpvd(bizInstrument2, okTrade$refreshBizInfoDetail$1);
            if (objEZpvd == objCopydefault) {
                int i9 = AubY + 101;
                zuBGHE = i9 % 128;
                int i10 = i9 % 2;
                return objCopydefault;
            }
        }
        java.lang.Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
        i = AubY + 77;
        zuBGHE = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void copydefault(@NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        java.util.Iterator it;
        java.lang.String name;
        int i = 2 % 2;
        int i2 = AubY + 79;
        zuBGHE = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            it = arrayList.iterator();
            int i3 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(arrayList, "");
            it = arrayList.iterator();
        }
        while (!(!it.hasNext())) {
            java.lang.Object next = it.next();
            if (next instanceof AbstractC55755xpt) {
                int i4 = zuBGHE + 89;
                AubY = i4 % 128;
                int i5 = i4 % 2;
                name = ((AbstractC55755xpt) next).AEQbTJ();
            } else {
                name = next.getClass().getName();
            }
            pUU.KWHzl("WS-TASK-CONTEXT", "add->" + name);
        }
        if (this.AuCTel == null) {
            this.AuCTel = new xGX();
        }
        xGX xgx = this.AuCTel;
        if (xgx != null) {
            int i6 = zuBGHE + 11;
            AubY = i6 % 128;
            if (i6 % 2 == 0) {
                xgx.OLrzqt(arrayList);
                return;
            }
            xgx.OLrzqt(arrayList);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void AEQbTJ(@NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        java.lang.String name;
        int i = 2 % 2;
        int i2 = AubY + 27;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        int i4 = zuBGHE + 25;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        for (java.lang.Object obj : arrayList) {
            int i6 = AubY + 95;
            zuBGHE = i6 % 128;
            int i7 = i6 % 2;
            if (obj instanceof AbstractC55755xpt) {
                name = ((AbstractC55755xpt) obj).AEQbTJ();
                int i8 = zuBGHE + 93;
                AubY = i8 % 128;
                int i9 = i8 % 2;
            } else {
                name = obj.getClass().getName();
            }
            pUU.KWHzl("WS-TASK-CONTEXT", "remove->" + name);
        }
        xGX xgx = this.AuCTel;
        if (xgx != null) {
            int i10 = zuBGHE + 15;
            AubY = i10 % 128;
            int i11 = i10 % 2;
            xgx.KWHzl(arrayList);
            if (i11 != 0) {
                throw null;
            }
        }
    }

    public final void QVAiDq() {
        int i = 2 % 2;
        java.util.HashMap<java.lang.String, TradeCoinInfo> mapDTwDnp = DTwDnp();
        if (this.valueOf.get("SPOT") == null) {
            this.valueOf.put("SPOT", new xLL(mapDTwDnp));
        }
        if (this.valueOf.get("MARGIN") == null) {
            this.valueOf.put("MARGIN", new xLD(mapDTwDnp));
            int i2 = zuBGHE + 19;
            AubY = i2 % 128;
            int i3 = i2 % 2;
        }
        if (this.valueOf.get("SWAP") == null) {
            this.valueOf.put("SWAP", new xLU(mapDTwDnp));
        }
        if (this.valueOf.get("FUTURES") == null) {
            this.valueOf.put("FUTURES", new xLC(mapDTwDnp));
        }
        if (this.valueOf.get("OPTION") == null) {
            this.valueOf.put("OPTION", new xLJ(mapDTwDnp));
            int i4 = zuBGHE + 3;
            AubY = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> iwGUEr() {
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapZLjUOn;
        int i = 2 % 2;
        int i2 = AubY + 41;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        C54591xOa c54591xOaKWHzl = this.isConnected.KWHzl();
        if (c54591xOaKWHzl != null && (mapZLjUOn = c54591xOaKWHzl.zLjUOn()) != null) {
            return mapZLjUOn;
        }
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map = new java.util.HashMap<>();
        int i4 = AubY + 11;
        zuBGHE = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.util.List<ChargeGroupData> AEQbTJ() {
        int i = 2 % 2;
        int i2 = zuBGHE + 107;
        AubY = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            this.isConnected.KWHzl();
            throw null;
        }
        C54591xOa c54591xOaKWHzl = this.isConnected.KWHzl();
        if (c54591xOaKWHzl != null) {
            int i3 = AubY + 93;
            zuBGHE = i3 % 128;
            if (i3 % 2 == 0) {
                c54591xOaKWHzl.uzCIH();
                obj.hashCode();
                throw null;
            }
            java.util.List<ChargeGroupData> listUzCIH = c54591xOaKWHzl.uzCIH();
            if (listUzCIH != null) {
                return listUzCIH;
            }
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void KWHzl(@NotNull java.util.List<ChargeGroupData> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        C54591xOa c54591xOaKWHzl = this.isConnected.KWHzl();
        if (c54591xOaKWHzl != null) {
            int i2 = AubY + 105;
            zuBGHE = i2 % 128;
            int i3 = i2 % 2;
            c54591xOaKWHzl.OLrzqt(list);
            int i4 = AubY + 89;
            zuBGHE = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.util.ArrayList<TradeGroupData> uzCIH() {
        int i = 2 % 2;
        int i2 = zuBGHE + 55;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            this.isConnected.OLrzqt();
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        xNQ xnqOLrzqt = this.isConnected.OLrzqt();
        if (xnqOLrzqt != null) {
            int i3 = zuBGHE + 7;
            AubY = i3 % 128;
            int i4 = i3 % 2;
            java.util.ArrayList<TradeGroupData> arrayListOLrzqt = xnqOLrzqt.OLrzqt();
            if (arrayListOLrzqt != null) {
                return arrayListOLrzqt;
            }
        }
        return new java.util.ArrayList<>();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void OLrzqt(@NotNull java.util.ArrayList<TradeGroupData> arrayList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        xNQ xnqOLrzqt = this.isConnected.OLrzqt();
        if (xnqOLrzqt != null) {
            int i2 = zuBGHE + 69;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            xnqOLrzqt.copydefault(arrayList);
            int i4 = AubY + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            zuBGHE = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd(android.os.Looper.getMainLooper(), android.os.Looper.myLooper()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r5.setValue(new com.okinc.tradeapi.bean.SourceResp<>(java.lang.Boolean.FALSE, null, new java.lang.Exception("mBasicContext unInit")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r5.postValue(new com.okinc.tradeapi.bean.SourceResp<>(java.lang.Boolean.FALSE, null, new java.lang.Exception("mBasicContext unInit")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd(android.os.Looper.getMainLooper(), android.os.Looper.myLooper()) != false) goto L11;
     */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull MutableLiveData<SourceResp<xOW>> mutableLiveData, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, boolean z) {
        int i = 2 % 2;
        int i2 = zuBGHE + 109;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        C54606xOp c54606xOpAhwBna = this.isConnected.AhwBna();
        if (c54606xOpAhwBna != null) {
            if (userTradeConfigInfo != null) {
                c54606xOpAhwBna.EZpvd(userTradeConfigInfo);
            }
            if (tradeInfo != null) {
                int i4 = AubY + 31;
                zuBGHE = i4 % 128;
                if (i4 % 2 == 0) {
                    c54606xOpAhwBna.KWHzl(tradeInfo);
                    throw null;
                }
                c54606xOpAhwBna.KWHzl(tradeInfo);
            }
            if (z) {
                this.fARcdN.OLrzqt(mutableLiveData);
                return;
            } else {
                this.fARcdN.AEQbTJ(mutableLiveData);
                return;
            }
        }
        int i5 = zuBGHE + 1;
        AubY = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void QOLQEE() {
        int i = 2 % 2;
        this.fARcdN.QUSxYX();
        BuildersKt__Builders_commonKt.launch$default(this.hDKMBd, Dispatchers.getMain(), null, new OkTrade$syncTradeDataSettings$1(this, null), 2, null);
        isConnected().valueOf();
        int i2 = AubY + 21;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.InterfaceC54581xNr
    public java.lang.String AkhnZx() {
        int i = 2 % 2;
        int i2 = zuBGHE + 67;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String strGEmmrt = C55697xoo.OLrzqt.gEmmrt();
        int i4 = AubY + 9;
        zuBGHE = i4 % 128;
        int i5 = i4 % 2;
        return strGEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean sSMYrx() {
        int i = 2 % 2;
        int i2 = AubY + 121;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        boolean zValues = this.fARcdN.values();
        int i4 = AubY + 41;
        zuBGHE = i4 % 128;
        int i5 = i4 % 2;
        return zValues;
    }

    @Override // o.InterfaceC54581xNr
    public xIC gEmmrt() {
        int i = 2 % 2;
        int i2 = AubY + 45;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        xIC xic = xIC.AEQbTJ;
        int i4 = zuBGHE + 63;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            return xic;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public BizInstrument copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(str);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            if ((abstractC54531xLwOLrzqt instanceof xLC) && C33129mqd.OLrzqt((java.lang.CharSequence) str3) && !(!C33129mqd.OLrzqt((java.lang.CharSequence) str4))) {
                int i2 = AubY + 17;
                zuBGHE = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.copydefault((java.lang.Object) str3);
                Intrinsics.copydefault((java.lang.Object) str4);
                FutureInstrument futureInstrumentValueOf = ((xLC) abstractC54531xLwOLrzqt).valueOf(str3, str4);
                int i4 = AubY + 23;
                zuBGHE = i4 % 128;
                int i5 = i4 % 2;
                return futureInstrumentValueOf;
            }
        } else if (abstractC54531xLwOLrzqt != null) {
            Intrinsics.copydefault((java.lang.Object) str2);
            return abstractC54531xLwOLrzqt.valueOf(str2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizInstrument EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        BizInstrument bizInstrumentValueOf;
        int i = 2 % 2;
        int i2 = AubY + 15;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC54531xLw abstractC54531xLwDjBIcL = djBIcL(str);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            if (abstractC54531xLwDjBIcL != null) {
                Intrinsics.copydefault((java.lang.Object) str2);
                bizInstrumentValueOf = abstractC54531xLwDjBIcL.valueOf(str2);
            } else {
                bizInstrumentValueOf = null;
            }
        } else if ((abstractC54531xLwDjBIcL instanceof xLC) && C33129mqd.OLrzqt((java.lang.CharSequence) str3) && C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            int i4 = AubY + 55;
            zuBGHE = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.copydefault((java.lang.Object) str3);
            Intrinsics.copydefault((java.lang.Object) str4);
            bizInstrumentValueOf = ((xLC) abstractC54531xLwDjBIcL).valueOf(str3, str4);
            if (i5 == 0) {
                int i6 = 58 / 0;
            }
        }
        int i7 = zuBGHE + 105;
        AubY = i7 % 128;
        int i8 = i7 % 2;
        return bizInstrumentValueOf;
    }

    @Override // o.InterfaceC54581xNr
    public TradePositionManager fJNWhG() {
        int i = 2 % 2;
        TradePositionManager tradePositionManager = new TradePositionManager(this);
        int i2 = AubY + 45;
        zuBGHE = i2 % 128;
        if (i2 % 2 != 0) {
            return tradePositionManager;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public TradeCoinInfo AhwBna(@NotNull java.lang.String str) {
        TradeCoinInfo tradeCoinInfo;
        int i = 2 % 2;
        int i2 = zuBGHE + 81;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            tradeCoinInfo = DTwDnp().get(str);
            int i3 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            tradeCoinInfo = DTwDnp().get(str);
        }
        int i4 = zuBGHE + 83;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            return tradeCoinInfo;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<TradeCoinInfo> OLrzqt() {
        java.util.ArrayList<TradeCoinInfo> arrayList;
        int i = 2 % 2;
        int i2 = AubY + 101;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        xNQ xnqOLrzqt = this.isConnected.OLrzqt();
        if (xnqOLrzqt != null) {
            int i4 = AubY + 23;
            zuBGHE = i4 % 128;
            int i5 = i4 % 2;
            arrayList = xnqOLrzqt.AEQbTJ();
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
            }
        }
        int i6 = AubY + 75;
        zuBGHE = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fetchVPNInfo(@NotNull java.lang.String str) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        xNT xntAEQbTJ = this.isConnected.AEQbTJ();
        if (xntAEQbTJ != null) {
            boolean zOLrzqt = xntAEQbTJ.OLrzqt(str);
            z = true;
            if (zOLrzqt) {
                int i2 = AubY + 35;
                zuBGHE = i2 % 128;
                int i3 = i2 % 2;
            } else {
                z = false;
            }
        }
        int i4 = zuBGHE + 103;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        boolean z;
        int i = 2 % 2;
        int i2 = AubY + 89;
        zuBGHE = i2 % 128;
        boolean z2 = true;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (str.length() > 0) {
                z = false;
                if (str2.length() > 0) {
                    int i3 = zuBGHE + 75;
                    AubY = i3 % 128;
                    if (i3 % 2 != 0) {
                        OLrzqt(str2);
                        throw null;
                    }
                    AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(str2);
                    BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
                    if (bizInstrumentValueOf != null) {
                        int i4 = zuBGHE + 53;
                        AubY = i4 % 128;
                        if (i4 % 2 != 0) {
                            bizInstrumentValueOf.enableFilter();
                            throw null;
                        }
                        if (!bizInstrumentValueOf.enableFilter()) {
                            return true;
                        }
                    }
                }
                z2 = z;
            } else {
                z2 = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (str.length() > 0) {
                z = true;
                if (str2.length() > 0) {
                }
                z2 = z;
            }
        }
        java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(str).AEQbTJ();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = o.TaskDescription.AEQbTJ(str).copydefault().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (QKVWgx().get(upperCase2) != null) {
            return false;
        }
        int i5 = AubY + 61;
        zuBGHE = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD");
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD") || QKVWgx().get(upperCase) == null) {
            return z2;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean gEmmrt(@NotNull java.lang.String str) {
        xNT xntAEQbTJ;
        int i = 2 % 2;
        int i2 = zuBGHE + 103;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            xntAEQbTJ = this.isConnected.AEQbTJ();
            if (xntAEQbTJ == null) {
                return false;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            xntAEQbTJ = this.isConnected.AEQbTJ();
            if (xntAEQbTJ == null) {
                return false;
            }
        }
        if (!xntAEQbTJ.EZpvd(str)) {
            return false;
        }
        int i3 = AubY + 57;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        boolean z;
        HiddenCurrencyBean hiddenCurrencyBean;
        HiddenCurrencyBean hiddenCurrencyBean2;
        int i = 2 % 2;
        int i2 = zuBGHE + 3;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() > 0 && str2.length() > 0) {
            AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(str2);
            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
            if (bizInstrumentValueOf != null && !bizInstrumentValueOf.enableFilter()) {
                int i4 = zuBGHE + 79;
                AubY = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(str).AEQbTJ();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = o.TaskDescription.AEQbTJ(str).copydefault().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD")) {
            int i5 = zuBGHE + 3;
            AubY = i5 % 128;
            int i6 = i5 % 2;
            z = QKVWgx().get(upperCase) == null || ((hiddenCurrencyBean2 = QKVWgx().get(upperCase)) != null && Intrinsics.EZpvd(hiddenCurrencyBean2.getSearchLimit(), java.lang.Boolean.FALSE));
        }
        return !(z ^ true) && (QKVWgx().get(upperCase2) == null || ((hiddenCurrencyBean = QKVWgx().get(upperCase2)) != null && Intrinsics.EZpvd(hiddenCurrencyBean.getSearchLimit(), java.lang.Boolean.FALSE)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean AkhnZx(@NotNull java.lang.String str) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (QKVWgx().get(str) != null) {
            int i2 = zuBGHE + 47;
            int i3 = i2 % 128;
            AubY = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            zuBGHE = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        int i7 = zuBGHE + 95;
        AubY = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    @Override // o.InterfaceC54581xNr
    public xMW KWHzl() {
        int i = 2 % 2;
        xMW xmw = new xMW(false, 1, null);
        int i2 = zuBGHE + 17;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        return xmw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV AEQbTJ(@NotNull java.lang.String str) {
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfo = DTwDnp().get(str);
        xMV xmv = new xMV();
        if (tradeCoinInfo != null) {
            int i2 = zuBGHE + 43;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String sizeDig = tradeCoinInfo.getSizeDig();
            if (i3 != 0) {
                int i4 = 87 / 0;
                if (sizeDig == null) {
                    int i5 = AubY + 23;
                    zuBGHE = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    str2 = sizeDig;
                }
            } else if (sizeDig == null) {
            }
        }
        return xmv.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = zuBGHE + 15;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfo = DTwDnp().get(str);
        if (tradeCoinInfo == null) {
            return "";
        }
        int i4 = AubY + 65;
        zuBGHE = i4 % 128;
        int i5 = i4 % 2;
        java.lang.String name = tradeCoinInfo.getName();
        return name == null ? "" : name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = zuBGHE + 79;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfo = DTwDnp().get(str);
        if (tradeCoinInfo != null) {
            int i4 = AubY + 89;
            zuBGHE = i4 % 128;
            int i5 = i4 % 2;
            java.lang.String sign = tradeCoinInfo.getSign();
            if (i5 == 0) {
                int i6 = 77 / 0;
                if (sign != null) {
                    str2 = sign;
                }
            } else if (sign != null) {
            }
        }
        int i7 = zuBGHE + 109;
        AubY = i7 % 128;
        if (i7 % 2 == 0) {
            return str2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean EZpvd(@NotNull java.lang.String str) {
        java.lang.String newTag;
        int i = 2 % 2;
        int i2 = AubY + 11;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfo = DTwDnp().get(str);
        if (tradeCoinInfo != null) {
            newTag = tradeCoinInfo.getNewTag();
            int i4 = zuBGHE + 97;
            AubY = i4 % 128;
            int i5 = i4 % 2;
        } else {
            newTag = null;
        }
        return Intrinsics.EZpvd((java.lang.Object) newTag, (java.lang.Object) "1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public boolean KWHzl(@NotNull java.lang.String str) {
        java.lang.String newLabel;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfo = DTwDnp().get(str);
        if (tradeCoinInfo != null) {
            int i2 = zuBGHE + 119;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            newLabel = tradeCoinInfo.getNewLabel();
            if (i3 != 0) {
                int i4 = 6 / 0;
            }
        } else {
            int i5 = zuBGHE + 51;
            AubY = i5 % 128;
            int i6 = i5 % 2;
            newLabel = null;
        }
        return Intrinsics.EZpvd((java.lang.Object) newLabel, (java.lang.Object) "1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public java.lang.String valueOf(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = zuBGHE + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfo = DTwDnp().get(str);
        if (tradeCoinInfo == null) {
            return "";
        }
        int i4 = zuBGHE + 37;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.String url = tradeCoinInfo.getUrl();
            return url == null ? "" : url;
        }
        tradeCoinInfo.getUrl();
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54536xML KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54536xML c54536xML = this.AYXKKw;
        TradeCoinInfo tradeCoinInfoAhwBna = AhwBna(str);
        if (tradeCoinInfoAhwBna != null) {
            int i2 = AubY + 49;
            zuBGHE = i2 % 128;
            if (i2 % 2 == 0) {
                c54536xML.OLrzqt(str2, tradeCoinInfoAhwBna.getSizeDig(), tradeCoinInfoAhwBna.getDisplaySymbol(), tradeCoinInfoAhwBna.getSign());
                throw null;
            }
            if (c54536xML.OLrzqt(str2, tradeCoinInfoAhwBna.getSizeDig(), tradeCoinInfoAhwBna.getDisplaySymbol(), tradeCoinInfoAhwBna.getSign()) == null) {
                c54536xML.OLrzqt(str2, "8", "", "");
            }
        }
        int i3 = AubY + 81;
        zuBGHE = i3 % 128;
        if (i3 % 2 != 0) {
            return c54536xML;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o.xNs$Application */
    public static final class Application extends AbstractC55760xpy {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C54582xNs EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(java.lang.String str, C54582xNs c54582xNs, java.lang.String str2) {
            super(str, str2);
            this.AEQbTJ = str;
            this.EZpvd = c54582xNs;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* synthetic */ void EZpvd(java.lang.Boolean bool, java.lang.String str) {
            OLrzqt(bool.booleanValue(), str);
        }

        public void OLrzqt(boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                C54582xNs.OLrzqt(this.EZpvd, this.AEQbTJ);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[PHI: r1
  0x0037: PHI (r1v9 java.util.ArrayList<java.lang.Object>) = 
  (r1v4 java.util.ArrayList<java.lang.Object>)
  (r1v5 java.util.ArrayList<java.lang.Object>)
  (r1v16 java.util.ArrayList<java.lang.Object>)
 binds: [B:8:0x001d, B:12:0x002c, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 java.util.ArrayList<java.lang.Object>) = (r1v4 java.util.ArrayList<java.lang.Object>), (r1v16 java.util.ArrayList<java.lang.Object>) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AuCTel(java.lang.String str) {
        java.util.ArrayList<java.lang.Object> arrayList;
        int i = 2 % 2;
        int i2 = zuBGHE + 67;
        int i3 = i2 % 128;
        AubY = i3;
        if (i2 % 2 != 0) {
            arrayList = this.DbNXlk;
            int i4 = 43 / 0;
            if (arrayList instanceof java.util.Collection) {
                int i5 = i3 + 25;
                zuBGHE = i5 % 128;
                if (i5 % 2 == 0) {
                    arrayList.isEmpty();
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!arrayList.isEmpty()) {
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (!(!it.hasNext())) {
                        java.lang.Object next = it.next();
                        if ((next instanceof AbstractC55760xpy) && Intrinsics.EZpvd((java.lang.Object) ((AbstractC55760xpy) next).OLrzqt(), (java.lang.Object) str)) {
                            return;
                        }
                    }
                }
            }
        } else {
            arrayList = this.DbNXlk;
            if (arrayList instanceof java.util.Collection) {
            }
        }
        Application application = new Application(str, this, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(application);
        this.DbNXlk.addAll(arrayList2);
        copydefault(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void isConnected(java.lang.String str) {
        int i = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(this.hDKMBd, C54585xNv.KWHzl.gEmmrt(), null, new OkTrade$reloadBizForInstUpdate$1(this, str, null), 2, null);
        int i2 = AubY + 63;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void EZpvd(@NotNull AbstractC54575xNl abstractC54575xNl) {
        int i = 2 % 2;
        int i2 = zuBGHE + 51;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(abstractC54575xNl, "");
        this.copydefault.add(abstractC54575xNl);
        int i4 = AubY + 91;
        zuBGHE = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void copydefault(@NotNull AbstractC54575xNl abstractC54575xNl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(abstractC54575xNl, "");
        java.util.Iterator<AbstractC54575xNl> it = this.copydefault.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = zuBGHE + 101;
            AubY = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 38 / 0;
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ(), (java.lang.Object) abstractC54575xNl.AEQbTJ())) {
                    int i5 = AubY + 69;
                    zuBGHE = i5 % 128;
                    int i6 = i5 % 2;
                    break;
                }
                i2++;
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ(), (java.lang.Object) abstractC54575xNl.AEQbTJ())) {
                    int i52 = AubY + 69;
                    zuBGHE = i52 % 128;
                    int i62 = i52 % 2;
                    break;
                }
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            this.copydefault.remove(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public void OLrzqt(@NotNull BizInstrument bizInstrument, boolean z) {
        int i = 2 % 2;
        int i2 = zuBGHE + 63;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.iwGUEr.put(bizInstrument.getInstId(), java.lang.Boolean.valueOf(z));
        int i4 = AubY + 55;
        zuBGHE = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [859=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdxCcyConfig valueOf() {
        java.lang.String instType;
        IdxCcyConfig idxCcyConfigGEmmrt;
        int i;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String isoCode;
        int i2 = 2 % 2;
        int i3 = AubY + 87;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.Object obj = null;
        BizInstrument bizInstrumentFIwbmz = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.fIwbmz() : null;
        java.lang.String str = "";
        if (bizInstrumentFIwbmz == null || (instType = bizInstrumentFIwbmz.getInstType()) == null) {
            instType = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(instType);
        java.lang.String instType2 = bizInstrumentFIwbmz != null ? bizInstrumentFIwbmz.getInstType() : null;
        if (instType2 == null) {
            return null;
        }
        switch (instType2.hashCode()) {
            case -2027980370:
                if (!instType2.equals("MARGIN")) {
                    return null;
                }
                if (abstractC54531xLwOLrzqt != null) {
                    return null;
                }
                idxCcyConfigGEmmrt = abstractC54531xLwOLrzqt.fetchVPNInfo(bizInstrumentFIwbmz.getInstFamily());
                i = zuBGHE + 33;
                AubY = i % 128;
                int i5 = i % 2;
                return idxCcyConfigGEmmrt;
            case -1956807563:
                if (!instType2.equals("OPTION")) {
                    return null;
                }
                java.lang.String profitSymbol = bizInstrumentFIwbmz.getProfitSymbol();
                if (abstractC54531xLwOLrzqt == null) {
                    return null;
                }
                idxCcyConfigGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentFIwbmz.getInstFamily(), profitSymbol);
                i = AubY + 67;
                zuBGHE = i % 128;
                int i52 = i % 2;
                return idxCcyConfigGEmmrt;
            case 2552066:
                if (!instType2.equals("SPOT")) {
                    return null;
                }
                if (abstractC54531xLwOLrzqt != null) {
                }
                break;
            case 2558355:
                if (!instType2.equals("SWAP")) {
                    return null;
                }
                if (!bizInstrumentFIwbmz.isPositiveContract()) {
                    if (abstractC54531xLwOLrzqt != null) {
                        return abstractC54531xLwOLrzqt.fetchVPNInfo(bizInstrumentFIwbmz.getInstFamily());
                    }
                    return null;
                }
                if (abstractC54531xLwOLrzqt == null) {
                    return null;
                }
                java.lang.String instFamily = bizInstrumentFIwbmz.getInstFamily();
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null) {
                    int i6 = AubY + 123;
                    zuBGHE = i6 % 128;
                    if (i6 % 2 == 0) {
                        interfaceC54581xNrOLrzqt.getNewProxyInstance();
                        obj.hashCode();
                        throw null;
                    }
                    xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
                    if (newProxyInstance != null && (mutableLiveDataBG_ = newProxyInstance.bG_()) != null && (value = mutableLiveDataBG_.getValue()) != null && (isoCode = value.getIsoCode()) != null) {
                        int i7 = AubY + 25;
                        zuBGHE = i7 % 128;
                        int i8 = i7 % 2;
                        str = isoCode;
                    }
                }
                return abstractC54531xLwOLrzqt.gEmmrt(instFamily, str);
            case 214415088:
                if (!instType2.equals("FUTURES")) {
                    return null;
                }
                if (!bizInstrumentFIwbmz.isPositiveContract()) {
                }
                break;
            default:
                return null;
        }
    }

    @Override // o.InterfaceC54581xNr
    public IdxConfig AhwBna() {
        BizInstrument bizInstrumentFIwbmz;
        java.lang.String instType;
        int i = 2 % 2;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            bizInstrumentFIwbmz = interfaceC54581xNrCopydefault.fIwbmz();
            int i2 = AubY + 11;
            zuBGHE = i2 % 128;
            int i3 = i2 % 2;
        } else {
            bizInstrumentFIwbmz = null;
        }
        java.lang.String str = "";
        if (bizInstrumentFIwbmz == null || (instType = bizInstrumentFIwbmz.getInstType()) == null) {
            instType = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(instType);
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        if (bizInstrumentFIwbmz != null) {
            java.lang.String instFamily = bizInstrumentFIwbmz.getInstFamily();
            if (instFamily == null) {
                int i4 = zuBGHE + 41;
                AubY = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = instFamily;
            }
        }
        return abstractC54531xLwOLrzqt.AkhnZx(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public TradeInfo AubY() {
        TradeInfo tradeInfoQUSxYX;
        int i = 2 % 2;
        C54606xOp c54606xOpAhwBna = this.isConnected.AhwBna();
        if (c54606xOpAhwBna != null) {
            int i2 = zuBGHE + 89;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            tradeInfoQUSxYX = c54606xOpAhwBna.QUSxYX();
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
        } else {
            tradeInfoQUSxYX = null;
        }
        int i5 = zuBGHE + 63;
        AubY = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return tradeInfoQUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public UserTradeConfigInfo gHZMYf() {
        int i = 2 % 2;
        int i2 = zuBGHE + 55;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        C54606xOp c54606xOpAhwBna = this.isConnected.AhwBna();
        if (c54606xOpAhwBna == null) {
            int i4 = zuBGHE + 67;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = AubY + 15;
        zuBGHE = i6 % 128;
        int i7 = i6 % 2;
        UserTradeConfigInfo userTradeConfigInfoDNCPSb = c54606xOpAhwBna.dNCPSb();
        if (i7 != 0) {
            return userTradeConfigInfoDNCPSb;
        }
        int i8 = 38 / 0;
        return userTradeConfigInfoDNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public BizInstrument copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = zuBGHE + 109;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            OLrzqt(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(str);
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        BizInstrument bizInstrumentIsConnected = abstractC54531xLwOLrzqt.isConnected(str2);
        int i3 = AubY + 37;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        return bizInstrumentIsConnected;
    }

    @Override // o.InterfaceC54581xNr
    public java.util.HashMap<java.lang.String, TradeCoinInfo> djBIcL() {
        int i = 2 % 2;
        int i2 = zuBGHE + 3;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        java.util.HashMap<java.lang.String, TradeCoinInfo> mapDTwDnp = DTwDnp();
        int i4 = zuBGHE + 123;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return mapDTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public MarginModeManager isConnected() {
        int i = 2 % 2;
        int i2 = AubY + 123;
        zuBGHE = i2 % 128;
        int i3 = i2 % 2;
        MarginModeManager marginModeManagerAEQbTJ = this.isConnected.EZpvd().AEQbTJ();
        int i4 = zuBGHE + 105;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return marginModeManagerAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // o.InterfaceC54581xNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        java.lang.String usdToThisRate;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        xOW newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            int i2 = AubY + 99;
            zuBGHE = i2 % 128;
            if (i2 % 2 == 0) {
                valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ(str);
                int i3 = 95 / 0;
            } else {
                valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ(str);
            }
        } else {
            valuationCurrencyDataAEQbTJ = null;
        }
        if (z) {
            int i4 = zuBGHE + 49;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.EZpvd((java.lang.Object) (valuationCurrencyDataAEQbTJ != null ? valuationCurrencyDataAEQbTJ.getIsoCode() : null), (java.lang.Object) "USD") && valuationCurrencyDataAEQbTJ != null) {
                int i6 = zuBGHE + 89;
                AubY = i6 % 128;
                if (i6 % 2 == 0 ? valuationCurrencyDataAEQbTJ.isPremium() : !valuationCurrencyDataAEQbTJ.isPremium()) {
                    java.lang.String str2 = this.AkhnZx.get("USD-" + valuationCurrencyDataAEQbTJ.getIsoCode());
                    if (str2 == null) {
                        str2 = "1";
                    }
                    if (str2.length() != 0) {
                        return str2;
                    }
                    usdToThisRate = valuationCurrencyDataAEQbTJ.getUsdToThisRate();
                    if (usdToThisRate == null) {
                        int i7 = zuBGHE + 91;
                        AubY = i7 % 128;
                        int i8 = i7 % 2;
                        return "1";
                    }
                }
            } else {
                if (valuationCurrencyDataAEQbTJ == null) {
                    return "1";
                }
                usdToThisRate = valuationCurrencyDataAEQbTJ.getUsdToThisRate();
                if (usdToThisRate == null) {
                    int i9 = zuBGHE + 71;
                    AubY = i9 % 128;
                    if (i9 % 2 == 0) {
                        return "1";
                    }
                    throw null;
                }
            }
        }
        return usdToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public xNQ EZpvd() {
        int i = 2 % 2;
        int i2 = zuBGHE + 99;
        AubY = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            this.isConnected.OLrzqt();
            obj.hashCode();
            throw null;
        }
        xNQ xnqOLrzqt = this.isConnected.OLrzqt();
        int i3 = AubY + 125;
        zuBGHE = i3 % 128;
        if (i3 % 2 != 0) {
            return xnqOLrzqt;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C54591xOa AwvSrB() {
        int i = 2 % 2;
        int i2 = zuBGHE + 59;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            this.isConnected.KWHzl();
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        C54591xOa c54591xOaKWHzl = this.isConnected.KWHzl();
        int i3 = zuBGHE + 49;
        AubY = i3 % 128;
        int i4 = i3 % 2;
        return c54591xOaKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C54592xOb ORxRYg() {
        int i = 2 % 2;
        int i2 = zuBGHE + 3;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isConnected.EZpvd();
        }
        this.isConnected.EZpvd();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54581xNr
    public C54606xOp OcIXYQ() {
        int i = 2 % 2;
        int i2 = zuBGHE + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            this.isConnected.AhwBna();
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        C54606xOp c54606xOpAhwBna = this.isConnected.AhwBna();
        int i3 = AubY + 117;
        zuBGHE = i3 % 128;
        int i4 = i3 % 2;
        return c54606xOpAhwBna;
    }

    /* JADX INFO: renamed from: o.xNs$TaskDescription */
    public static final class TaskDescription extends AbstractC55671xoO {
        public final /* synthetic */ C54582xNs AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.lang.String str, C54582xNs c54582xNs, java.lang.String str2) {
            super(str, str2);
            this.AEQbTJ = c54582xNs;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(IndexTickersData indexTickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(indexTickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C54582xNs.KWHzl(this.AEQbTJ).put(indexTickersData.getInstId(), indexTickersData.getIdxPx());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [970=4] */
    public void QbewEr() {
        ValuationCurrencyData value;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        int i = 2 % 2;
        xOW newProxyInstance = getNewProxyInstance();
        if (newProxyInstance == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) {
            value = null;
        } else {
            int i2 = AubY + 91;
            zuBGHE = i2 % 128;
            int i3 = i2 % 2;
            value = mutableLiveDataBG_.getValue();
        }
        java.lang.String isoCode = value != null ? value.getIsoCode() : null;
        if (Intrinsics.EZpvd((java.lang.Object) isoCode, (java.lang.Object) "USD") || value == null) {
            return;
        }
        int i4 = zuBGHE + 105;
        AubY = i4 % 128;
        if (i4 % 2 != 0) {
            if (!value.isPremium()) {
                return;
            }
        } else if (!value.isPremium()) {
            return;
        }
        java.lang.String str = "USD-" + isoCode;
        AbstractC55671xoO abstractC55671xoO = this.values;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (abstractC55671xoO != null ? abstractC55671xoO.copydefault() : null))) {
            return;
        }
        QfsBiF();
        java.util.HashMap<java.lang.String, java.lang.String> map = this.AkhnZx;
        java.lang.String usdToThisRatePremium = value.getUsdToThisRatePremium();
        if (usdToThisRatePremium == null) {
            usdToThisRatePremium = "";
        }
        map.put(str, usdToThisRatePremium);
        TaskDescription taskDescription = new TaskDescription(str, this, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        this.values = taskDescription;
        Intrinsics.copydefault(taskDescription);
        copydefault(yDY.copydefault(taskDescription));
        int i5 = AubY + 79;
        zuBGHE = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void QfsBiF() {
        java.util.ArrayList<java.lang.Object> arrayListCopydefault;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        int i = 2 % 2;
        int i2 = zuBGHE + 49;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            xOW newProxyInstance = getNewProxyInstance();
            ValuationCurrencyData value = (newProxyInstance == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) ? null : mutableLiveDataBG_.getValue();
            this.AkhnZx.put("USD-" + (value != null ? value.getIsoCode() : null), null);
            AbstractC55671xoO abstractC55671xoO = this.values;
            if (abstractC55671xoO != null) {
                int i3 = AubY + 95;
                zuBGHE = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.copydefault(abstractC55671xoO);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    objArr[1] = abstractC55671xoO;
                    arrayListCopydefault = yDY.copydefault(objArr);
                } else {
                    Intrinsics.copydefault(abstractC55671xoO);
                    arrayListCopydefault = yDY.copydefault(abstractC55671xoO);
                }
                AEQbTJ(arrayListCopydefault);
            }
            int i4 = zuBGHE + 83;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        getNewProxyInstance();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.ArrayList<com.okinc.tradeapi.bean.TradeGroupData> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC54581xNr
    public java.util.ArrayList<TradeGroupData> hDKMBd() {
        java.util.ArrayList<TradeGroupData> arrayList;
        int i = 2 % 2;
        xNQ xnqOLrzqt = this.isConnected.OLrzqt();
        if (xnqOLrzqt == null || (arrayList = xnqOLrzqt.OLrzqt()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        java.util.ArrayList<TradeGroupData> arrayList2 = new java.util.ArrayList<>();
        for (java.lang.Object obj : arrayList) {
            int i2 = zuBGHE + 99;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            TradeGroupData tradeGroupData = (TradeGroupData) obj;
            if (tradeGroupData.getName().length() > 0) {
                int i4 = AubY + 59;
                zuBGHE = i4 % 128;
                int i5 = i4 % 2;
                java.lang.String id = tradeGroupData.getId();
                if (id != null) {
                    int i6 = AubY + 83;
                    zuBGHE = i6 % 128;
                    int i7 = i6 % 2;
                    if (id.length() != 0) {
                        arrayList2.add(obj);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final void OLrzqt(BizInstrument bizInstrument) {
        copydefault(new java.lang.Object[]{this, bizInstrument}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -1090269693, 1090269693);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (java.util.HashMap) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 o.xNs) A[WRAPPED] (LINE:65354) elemType: java.lang.Object)
  (wrap:int:0x0004: INVOKE  STATIC call: me.relex.circleindicator.SnackbarBehavior.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: me.relex.circleindicator.SnackbarBehavior.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: me.relex.circleindicator.SnackbarBehavior.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0010: INVOKE  STATIC call: me.relex.circleindicator.SnackbarBehavior.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-919921477 int)
  (919921478 int)
 STATIC call: o.xNs.copydefault(java.lang.Object[], int, int, int, int, int, int):java.lang.Object A[MD:(java.lang.Object[], int, int, int, int, int, int):java.lang.Object (m), WRAPPED] (LINE:65354)) */
    public static final /* synthetic */ java.util.HashMap EZpvd(C54582xNs c54582xNs) {
        return (java.util.HashMap) copydefault(new java.lang.Object[]{c54582xNs}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -919921477, 919921478);
    }
}
