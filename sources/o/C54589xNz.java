package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.TokenType;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.FavoriteBizConfig;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import com.okinc.unify_trade.biz.FavoriteBizInst;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitForTradeDex$1;
import com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1;
import com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitialize$1;
import com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitialize$2;
import com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitializeWithBuilder$1;
import com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitializeWithBuilder$2;
import com.okinc.unify_trade.trade.core.config.TradeInit;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC54610xOt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54589xNz implements InterfaceC54577xNn {
    public static InterfaceC54572xNi AEQbTJ = null;
    public static final C54607xOq AYXKKw;
    public static java.util.ArrayList<InterfaceC54612xOv> AhwBna = null;
    private static int AkhnZx = 0;
    private static int DbNXlk = 1;
    public static final C54589xNz EZpvd = new C54589xNz();
    public static java.lang.String KWHzl = "pro";
    public static InterfaceC54581xNr OLrzqt = null;
    public static final int copydefault;
    public static boolean djBIcL = false;
    private static int fetchVPNInfo = 1;
    private static int gEmmrt;
    public static final C54614xOx valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        int i = 2 % 2;
        int i2 = DbNXlk + 51;
        AkhnZx = i2 % 128;
        if (i2 % 2 == 0) {
            return valueOf;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C54607xOq AYXKKw() {
        int i = 2 % 2;
        int i2 = AkhnZx;
        int i3 = i2 + 65;
        DbNXlk = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        C54607xOq c54607xOq = AYXKKw;
        int i4 = i2 + 49;
        DbNXlk = i4 % 128;
        if (i4 % 2 != 0) {
            return c54607xOq;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        int i = 2 % 2;
        int i2 = AkhnZx + 77;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54572xNi interfaceC54572xNi = AEQbTJ;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return interfaceC54572xNi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object KWHzl(int i, int i2, int i3, java.lang.Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~i2;
        int i11 = i9 | (~(i7 | i10 | i));
        int i12 = (~(i2 | i8)) | i7 | (~(i10 | i));
        int i13 = i3 + i + i6 + (1112421973 * i5) + ((-1897213938) * i4);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i3) - 781189120) + ((-1395624931) * i) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i6) + ((-1446510592) * i5) + (892338176 * i4) + ((-1657864192) * i14);
        int i16 = (i3 * 2010092721) + 1217064380 + (i * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i6 * 2010091741) + (i5 * (-1378896031)) + (i4 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        return i17 != 1 ? i17 != 2 ? AEQbTJ(objArr) : EZpvd(objArr) : OLrzqt(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) {
        int i = 2 % 2;
        int i2 = DbNXlk + 27;
        int i3 = i2 % 128;
        AkhnZx = i3;
        int i4 = i2 % 2;
        InterfaceC54572xNi interfaceC54572xNi = AEQbTJ;
        int i5 = i3 + 121;
        DbNXlk = i5 % 128;
        int i6 = i5 % 2;
        return interfaceC54572xNi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ void copydefault(InterfaceC54581xNr interfaceC54581xNr) {
        int i = 2 % 2;
        int i2 = DbNXlk;
        int i3 = i2 + 97;
        AkhnZx = i3 % 128;
        int i4 = i3 % 2;
        OLrzqt = interfaceC54581xNr;
        int i5 = i2 + 73;
        AkhnZx = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ InterfaceC54581xNr djBIcL() {
        InterfaceC54581xNr interfaceC54581xNr;
        int i = 2 % 2;
        int i2 = DbNXlk + 87;
        int i3 = i2 % 128;
        AkhnZx = i3;
        if (i2 % 2 != 0) {
            interfaceC54581xNr = OLrzqt;
            int i4 = 6 / 0;
        } else {
            interfaceC54581xNr = OLrzqt;
        }
        int i5 = i3 + 65;
        DbNXlk = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return interfaceC54581xNr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        int i = 2 % 2;
        int i2 = AkhnZx + 81;
        DbNXlk = i2 % 128;
        if (i2 % 2 != 0) {
            return djBIcL;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        int i = 2 % 2;
        int i2 = DbNXlk + 21;
        int i3 = i2 % 128;
        AkhnZx = i3;
        int i4 = i2 % 2;
        djBIcL = z;
        int i5 = i3 + 105;
        DbNXlk = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54577xNn
    public InterfaceC54581xNr OLrzqt() {
        int i = 2 % 2;
        int i2 = DbNXlk + 81;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54581xNr interfaceC54581xNr = OLrzqt;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return interfaceC54581xNr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54577xNn
    public InterfaceC54581xNr copydefault() {
        int i = 2 % 2;
        int i2 = DbNXlk + 63;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54581xNr interfaceC54581xNr = OLrzqt;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return interfaceC54581xNr;
    }

    private C54589xNz() {
    }

    public static final /* synthetic */ void AEQbTJ(C54589xNz c54589xNz, C54588xNy c54588xNy) {
        int i = 2 % 2;
        int i2 = DbNXlk + 119;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        c54589xNz.OLrzqt(c54588xNy);
        int i4 = AkhnZx + 15;
        DbNXlk = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ java.lang.Object copydefault(C54589xNz c54589xNz, AbstractC54610xOt abstractC54610xOt) {
        int i = 2 % 2;
        int i2 = DbNXlk + 37;
        AkhnZx = i2 % 128;
        if (i2 % 2 != 0) {
            c54589xNz.OLrzqt(abstractC54610xOt);
            throw null;
        }
        java.lang.Object objOLrzqt = c54589xNz.OLrzqt(abstractC54610xOt);
        int i3 = DbNXlk + 115;
        AkhnZx = i3 % 128;
        int i4 = i3 % 2;
        return objOLrzqt;
    }

    @Override // o.InterfaceC54577xNn
    public InterfaceC55813xqy KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        int i = 2 % 2;
        int i2 = DbNXlk + 51;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC55813xqy interfaceC55813xqyKWHzl = InterfaceC54577xNn.ActionBar.KWHzl(this, str, str2, str3, str4, str5, str6);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return interfaceC55813xqyKWHzl;
    }

    @Override // o.InterfaceC54577xNn
    public void OLrzqt(@NotNull MutableLiveData<java.lang.Boolean> mutableLiveData, boolean z) {
        int i = 2 % 2;
        int i2 = AkhnZx + 83;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54577xNn.ActionBar.copydefault(this, mutableLiveData, z);
        int i4 = AkhnZx + 117;
        DbNXlk = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        pUU.copydefault("testTradeCoreManager", "TradeCoreManager init");
        AhwBna = new java.util.ArrayList<>();
        C54614xOx c54614xOx = new C54614xOx();
        valueOf = c54614xOx;
        AYXKKw = new C54607xOq(c54614xOx);
        copydefault = 8;
        int i = fetchVPNInfo + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        gEmmrt = i % 128;
        int i2 = i % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r13v10, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v17, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v18, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.InterfaceC54577xNn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(boolean z, @NotNull C54588xNy c54588xNy, @NotNull Continuation<? super Result<? extends InterfaceC54581xNr>> continuation) throws java.lang.Throwable {
        TradeCoreManager$ensureInitialize$1 tradeCoreManager$ensureInitialize$1;
        java.lang.String str;
        java.lang.String str2;
        int i = 2 % 2;
        if (continuation instanceof TradeCoreManager$ensureInitialize$1) {
            tradeCoreManager$ensureInitialize$1 = (TradeCoreManager$ensureInitialize$1) continuation;
            int i2 = tradeCoreManager$ensureInitialize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tradeCoreManager$ensureInitialize$1.label = i2 - Integer.MIN_VALUE;
            } else {
                tradeCoreManager$ensureInitialize$1 = new TradeCoreManager$ensureInitialize$1(this, continuation);
                int i3 = DbNXlk + 121;
                AkhnZx = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        java.lang.Object obj = tradeCoreManager$ensureInitialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = tradeCoreManager$ensureInitialize$1.label;
        try {
            if (i5 == 0) {
                C56391yDq.AEQbTJ(obj);
                java.lang.String strKWHzl = xNI.KWHzl.KWHzl();
                pUU.KWHzl("trade_init", "[" + strKWHzl + "] tradecore manager, ensureInitialize(isForce=" + z + ", config=" + c54588xNy + ")");
                try {
                    CoroutineDispatcher coroutineDispatcherAYXKKw = C54585xNv.KWHzl.AYXKKw();
                    TradeCoreManager$ensureInitialize$2 tradeCoreManager$ensureInitialize$2 = new TradeCoreManager$ensureInitialize$2(strKWHzl, c54588xNy, z, null);
                    tradeCoreManager$ensureInitialize$1.L$0 = strKWHzl;
                    tradeCoreManager$ensureInitialize$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcherAYXKKw, tradeCoreManager$ensureInitialize$2, tradeCoreManager$ensureInitialize$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    int i6 = AkhnZx + 105;
                    DbNXlk = i6 % 128;
                    int i7 = i6 % 2;
                    obj = objWithContext;
                } catch (CancellationException e) {
                    e = e;
                    str2 = strKWHzl;
                    pUU.AEQbTJ("trade_init", "[" + str2 + "] Coroutine was cancelled in ensureInitialize", e);
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
                } catch (java.lang.Exception e2) {
                    e = e2;
                    str = strKWHzl;
                    pUU.AEQbTJ("trade_init", "[" + str + "] ensureInitialize failed: " + e.getMessage(), e);
                    Result.Application application2 = Result.Companion;
                    java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
                    int i8 = DbNXlk + 57;
                    AkhnZx = i8 % 128;
                    int i9 = i8 % 2;
                    return objM7377constructorimpl;
                }
            } else {
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = DbNXlk + 21;
                AkhnZx = i10 % 128;
                if (i10 % 2 != 0) {
                    C56391yDq.AEQbTJ(obj);
                    throw null;
                }
                C56391yDq.AEQbTJ(obj);
            }
            return ((Result) obj).m7386unboximpl();
        } catch (CancellationException e3) {
            e = e3;
            str2 = z;
        } catch (java.lang.Exception e4) {
            e = e4;
            str = z;
        }
    }

    public final void OLrzqt(C54588xNy c54588xNy) {
        int i = 2 % 2;
        int i2 = AkhnZx + 117;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        AEQbTJ(c54588xNy);
        copydefault(c54588xNy);
        int i4 = DbNXlk + 83;
        AkhnZx = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C54588xNy c54588xNy) {
        int i = 2 % 2;
        InterfaceC54581xNr interfaceC54581xNr = OLrzqt;
        if (interfaceC54581xNr != null) {
            int i2 = DbNXlk + 61;
            AkhnZx = i2 % 128;
            int i3 = i2 % 2;
            if (interfaceC54581xNr != null) {
                interfaceC54581xNr.AxsJAY();
                interfaceC54581xNr.QOLQEE();
                int i4 = DbNXlk + 25;
                AkhnZx = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        if (TradeInit.Companion.KWHzl(c54588xNy.AEQbTJ())) {
            C54582xNs c54582xNs = new C54582xNs(valueOf);
            AYXKKw.EZpvd().OLrzqt();
            c54582xNs.AxsJAY();
            c54582xNs.QOLQEE();
            OLrzqt = c54582xNs;
            return;
        }
        pUU.KWHzl("trade_init", "OkTrade not needed: config contains no core trade types " + c54588xNy.AEQbTJ());
        int i6 = AkhnZx + 51;
        DbNXlk = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 4;
        }
    }

    public final void copydefault(C54588xNy c54588xNy) {
        int i = 2 % 2;
        int i2 = DbNXlk + 37;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        if (!(!TradeInit.Companion.AEQbTJ(c54588xNy.AEQbTJ()))) {
            int i4 = AkhnZx + 9;
            DbNXlk = i4 % 128;
            if (i4 % 2 == 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            InterfaceC54572xNi c54579xNp = AEQbTJ;
            if (c54579xNp == null) {
                c54579xNp = new C54579xNp(valueOf);
            }
            AEQbTJ = c54579xNp;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [178=4] */
    public final java.lang.Object OLrzqt(AbstractC54610xOt abstractC54610xOt) {
        int i = 2 % 2;
        if (!(abstractC54610xOt instanceof AbstractC54610xOt.TaskDescription)) {
            if (!(abstractC54610xOt instanceof AbstractC54610xOt.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new BizApiException(((AbstractC54610xOt.StateListAnimator) abstractC54610xOt).copydefault(), null, null, null, null, 30, null)));
        }
        int i2 = AkhnZx + 13;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        Result.Application application2 = Result.Companion;
        java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        int i4 = AkhnZx + 93;
        DbNXlk = i4 % 128;
        if (i4 % 2 != 0) {
            return objM7377constructorimpl;
        }
        int i5 = 4 / 5;
        return objM7377constructorimpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [225=5, 226=5, 236=5, 249=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    @Override // o.InterfaceC54577xNn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(FavoriteBizInfo favoriteBizInfo) {
        java.util.ArrayList<InstrumentInfo> arrayList;
        java.util.ArrayList<InstrumentInfo> arrayList2;
        java.util.ArrayList<InstrumentInfo> arrayList3;
        java.util.ArrayList<InstrumentInfo> arrayList4;
        FavoriteBizConfig mBizConfigList;
        java.util.List<IdxConfig> idxConfig;
        java.util.Iterator it;
        FavoriteBizInst mBizInstList;
        int i = 2 % 2;
        java.util.ArrayList arrayList5 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        java.util.List<TradeCoinInfo> mCoinList = favoriteBizInfo != null ? favoriteBizInfo.getMCoinList() : null;
        if (mCoinList != null) {
            EZpvd.EZpvd(mCoinList);
        }
        java.util.ArrayList<InstrumentInfo> arrayList6 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList7 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList8 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList9 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList10 = new java.util.ArrayList<>();
        if (favoriteBizInfo != null && (mBizInstList = favoriteBizInfo.getMBizInstList()) != null) {
            int i2 = DbNXlk + 11;
            AkhnZx = i2 % 128;
            if (i2 % 2 == 0 ? (!mBizInstList.getSPOT().isEmpty()) : (!mBizInstList.getSPOT().isEmpty())) {
                arrayList6.addAll(mBizInstList.getSPOT());
            }
            if (!mBizInstList.getSWAP().isEmpty()) {
                int i3 = DbNXlk + 15;
                AkhnZx = i3 % 128;
                int i4 = i3 % 2;
                arrayList8.addAll(mBizInstList.getSWAP());
            }
            if (!mBizInstList.getFUTURES().isEmpty()) {
                arrayList9.addAll(mBizInstList.getFUTURES());
            }
            if (!mBizInstList.getOPTION().isEmpty()) {
                arrayList10.addAll(mBizInstList.getOPTION());
            }
            if (!mBizInstList.getMARGIN().isEmpty()) {
                arrayList7.addAll(mBizInstList.getMARGIN());
            }
        }
        int i5 = 3;
        TradeConfigData tradeConfigData = new TradeConfigData(arrayList5, (java.util.ArrayList) (b14 == true ? 1 : 0), i5, (DefaultConstructorMarker) (b13 == true ? 1 : 0));
        TradeConfigData tradeConfigData2 = new TradeConfigData((java.util.ArrayList) (b12 == true ? 1 : 0), (java.util.ArrayList) (b11 == true ? 1 : 0), i5, (DefaultConstructorMarker) (b10 == true ? 1 : 0));
        TradeConfigData tradeConfigData3 = new TradeConfigData((java.util.ArrayList) (b9 == true ? 1 : 0), (java.util.ArrayList) (b8 == true ? 1 : 0), i5, (DefaultConstructorMarker) (b7 == true ? 1 : 0));
        TradeConfigData tradeConfigData4 = new TradeConfigData((java.util.ArrayList) (b6 == true ? 1 : 0), (java.util.ArrayList) (b5 == true ? 1 : 0), i5, (DefaultConstructorMarker) (b4 == true ? 1 : 0));
        TradeConfigData tradeConfigData5 = new TradeConfigData((java.util.ArrayList) (b3 == true ? 1 : 0), (java.util.ArrayList) (b2 == true ? 1 : 0), i5, (DefaultConstructorMarker) (b == true ? 1 : 0));
        if (favoriteBizInfo != null) {
            arrayList3 = arrayList10;
            int i6 = DbNXlk + 123;
            arrayList2 = arrayList9;
            AkhnZx = i6 % 128;
            if (i6 % 2 != 0) {
                favoriteBizInfo.getMBizConfigList();
                throw null;
            }
            FavoriteBizConfig mBizConfigList2 = favoriteBizInfo.getMBizConfigList();
            if (mBizConfigList2 != null && (idxConfig = mBizConfigList2.getIdxConfig()) != null) {
                int i7 = AkhnZx + 89;
                arrayList = arrayList8;
                DbNXlk = i7 % 128;
                if (i7 % 2 == 0) {
                    it = idxConfig.iterator();
                    int i8 = 14 / 0;
                } else {
                    it = idxConfig.iterator();
                }
                while (it.hasNext()) {
                    IdxConfig idxConfig2 = (IdxConfig) it.next();
                    java.lang.String instType = idxConfig2.getInstType();
                    switch (instType.hashCode()) {
                        case -2027980370:
                            if (instType.equals("MARGIN")) {
                                tradeConfigData2.putIdxConfig(idxConfig2);
                            }
                            break;
                        case -1956807563:
                            if (instType.equals("OPTION")) {
                                tradeConfigData5.putIdxConfig(idxConfig2);
                            }
                            break;
                        case 2552066:
                            if (instType.equals("SPOT")) {
                                tradeConfigData.putIdxConfig(idxConfig2);
                            }
                            break;
                        case 2558355:
                            if (instType.equals("SWAP")) {
                                tradeConfigData3.putIdxConfig(idxConfig2);
                            }
                            break;
                        case 214415088:
                            if (instType.equals("FUTURES")) {
                                tradeConfigData4.putIdxConfig(idxConfig2);
                            }
                            break;
                    }
                }
            } else {
                arrayList = arrayList8;
            }
        } else {
            arrayList = arrayList8;
            arrayList2 = arrayList9;
            arrayList3 = arrayList10;
        }
        if (favoriteBizInfo == null || (mBizConfigList = favoriteBizInfo.getMBizConfigList()) == null) {
            arrayList4 = arrayList7;
        } else {
            int i9 = DbNXlk + 17;
            AkhnZx = i9 % 128;
            if (i9 % 2 != 0) {
                mBizConfigList.getIdxCcyConfig();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            java.util.List<IdxCcyConfig> idxCcyConfig = mBizConfigList.getIdxCcyConfig();
            if (idxCcyConfig != null) {
                int i10 = AkhnZx + 125;
                arrayList4 = arrayList7;
                DbNXlk = i10 % 128;
                int i11 = i10 % 2;
                for (IdxCcyConfig idxCcyConfig2 : idxCcyConfig) {
                    java.lang.String instType2 = idxCcyConfig2.getInstType();
                    switch (instType2.hashCode()) {
                        case -2027980370:
                            if (instType2.equals("MARGIN")) {
                                tradeConfigData2.putIdxCcyConfig(idxCcyConfig2);
                            }
                            break;
                        case -1956807563:
                            if (instType2.equals("OPTION")) {
                                tradeConfigData5.putIdxCcyConfig(idxCcyConfig2);
                            }
                            break;
                        case 2552066:
                            if (instType2.equals("SPOT")) {
                                tradeConfigData.putIdxCcyConfig(idxCcyConfig2);
                            }
                            break;
                        case 2558355:
                            if (instType2.equals("SWAP")) {
                                tradeConfigData3.putIdxCcyConfig(idxCcyConfig2);
                            }
                            break;
                        case 214415088:
                            if (instType2.equals("FUTURES")) {
                                tradeConfigData4.putIdxCcyConfig(idxCcyConfig2);
                            }
                            break;
                    }
                }
            }
        }
        EZpvd("SPOT", arrayList6, tradeConfigData);
        EZpvd("MARGIN", arrayList4, tradeConfigData2);
        EZpvd("SWAP", arrayList, tradeConfigData3);
        EZpvd("FUTURES", arrayList2, tradeConfigData4);
        EZpvd("OPTION", arrayList3, tradeConfigData5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [263=4] */
    public final void EZpvd(java.lang.String str, java.util.ArrayList<InstrumentInfo> arrayList, TradeConfigData tradeConfigData) {
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        int i = 2 % 2;
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNr = OLrzqt;
        if (interfaceC54581xNr != null) {
            int i2 = AkhnZx + 23;
            DbNXlk = i2 % 128;
            int i3 = i2 % 2;
            abstractC54531xLwDjBIcL = interfaceC54581xNr.djBIcL(str);
        } else {
            abstractC54531xLwDjBIcL = null;
        }
        if (abstractC54531xLwDjBIcL != null) {
            int i4 = DbNXlk + 7;
            AkhnZx = i4 % 128;
            int i5 = i4 % 2;
            if (AbstractC54531xLw.isInitFun$default(abstractC54531xLwDjBIcL, false, 1, null)) {
                return;
            }
        }
        if (abstractC54531xLwDjBIcL != null) {
            abstractC54531xLwDjBIcL.KWHzl(arrayList);
        }
        if (abstractC54531xLwDjBIcL != null) {
            abstractC54531xLwDjBIcL.EZpvd(tradeConfigData.getIdxConfig());
        }
        if (abstractC54531xLwDjBIcL != null) {
            int i6 = AkhnZx + 71;
            DbNXlk = i6 % 128;
            if (i6 % 2 != 0) {
                abstractC54531xLwDjBIcL.AEQbTJ(tradeConfigData.getIdxCcyConfig());
            } else {
                abstractC54531xLwDjBIcL.AEQbTJ(tradeConfigData.getIdxCcyConfig());
                int i7 = 71 / 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(java.util.List<TradeCoinInfo> list) {
        xNQ xnqOLrzqt;
        int i = 2 % 2;
        if (OLrzqt == null) {
            OLrzqt = new C54582xNs(valueOf);
            int i2 = AkhnZx + 75;
            DbNXlk = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!valueOf.copydefault() && (xnqOLrzqt = AYXKKw.OLrzqt()) != null) {
            xnqOLrzqt.AEQbTJ(list);
            int i4 = DbNXlk + 29;
            AkhnZx = i4 % 128;
            int i5 = i4 % 2;
        }
        InterfaceC54581xNr interfaceC54581xNr = OLrzqt;
        if (interfaceC54581xNr == null) {
            return true;
        }
        interfaceC54581xNr.AxsJAY();
        int i6 = DbNXlk + 101;
        AkhnZx = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // o.InterfaceC54577xNn
    public boolean EZpvd() {
        int i = 2 % 2;
        int i2 = AkhnZx + 89;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        boolean zAkhnZx = C55697xoo.OLrzqt.AkhnZx();
        int i4 = DbNXlk + 63;
        AkhnZx = i4 % 128;
        if (i4 % 2 == 0) {
            return zAkhnZx;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceC54577xNn
    public boolean KWHzl() {
        int i = 2 % 2;
        int i2 = AkhnZx + 15;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !C55697xoo.OLrzqt.AkhnZx();
        int i4 = AkhnZx + 87;
        DbNXlk = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int valueOf() {
        TokenType tokenType;
        int i = 2 % 2;
        int i2 = DbNXlk + 53;
        AkhnZx = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
            if (C55697xoo.OLrzqt.AkhnZx()) {
                tokenType = TokenType.DEMO_TRADING;
            } else {
                tokenType = TokenType.LIVE_TRADING;
                int i4 = AkhnZx + 1;
                DbNXlk = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 4;
                }
            }
        } else if (C55697xoo.OLrzqt.AkhnZx()) {
        }
        int headerValue = tokenType.getHeaderValue();
        int i6 = AkhnZx + 125;
        DbNXlk = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 / 2;
        }
        return headerValue;
    }

    @Override // o.InterfaceC54577xNn
    public java.lang.String AEQbTJ() {
        int i = 2 % 2;
        int i2 = DbNXlk + 99;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        int iValueOf = valueOf();
        if (iValueOf == TokenType.LIVE_TRADING.getHeaderValue()) {
            int i4 = DbNXlk + 109;
            AkhnZx = i4 % 128;
            int i5 = i4 % 2;
            return "system_line";
        }
        if (iValueOf != TokenType.DEMO_TRADING.getHeaderValue()) {
            return "";
        }
        int i6 = AkhnZx + 67;
        DbNXlk = i6 % 128;
        int i7 = i6 % 2;
        return "system_test";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54577xNn
    public void KWHzl(@NotNull InterfaceC54612xOv interfaceC54612xOv) {
        int i = 2 % 2;
        int i2 = DbNXlk + 3;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC54612xOv, "");
        AhwBna.add(interfaceC54612xOv);
        int i4 = AkhnZx + 95;
        DbNXlk = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [325=4] */
    public java.lang.String fetchVPNInfo() {
        int i = 2 % 2;
        xUV xuv = xUV.EZpvd;
        if (!(!Intrinsics.EZpvd((java.lang.Object) xuv.EZpvd("current_instrument_type"), (java.lang.Object) "OPTION"))) {
            int i2 = DbNXlk + 43;
            AkhnZx = i2 % 128;
            int i3 = i2 % 2;
            if (!xuv.AEQbTJ("newoption")) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = OLrzqt();
                if (interfaceC54581xNrOLrzqt != null) {
                    int i4 = DbNXlk + 101;
                    AkhnZx = i4 % 128;
                    int i5 = i4 % 2;
                    xOU xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM();
                    if (xouWlaJM != null) {
                        xouWlaJM.copydefault("trade_option");
                    }
                }
                SPUtils.put("key_trade_mode-" + EZpvd.DbNXlk(), "trade_option", "file_trade_ins_type");
                pUU.KWHzl("optionJump", "old version pack");
                C55697xoo c55697xoo = C55697xoo.OLrzqt;
                if (c55697xoo.isConnected()) {
                    SPUtils.put("newoption-" + c55697xoo.gEmmrt(), java.lang.Boolean.TRUE);
                } else {
                    SPUtils.put("newoption", java.lang.Boolean.TRUE);
                }
            }
        }
        java.lang.String string = SPUtils.getString("key_trade_mode-" + DbNXlk(), "trade_manual", "file_trade_ins_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = DbNXlk + 59;
        AkhnZx = i6 % 128;
        if (i6 % 2 == 0) {
            return string;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("key_trade_mode-" + EZpvd.DbNXlk(), str, "file_trade_ins_type");
        int i2 = AkhnZx + 27;
        DbNXlk = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v16, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v17, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v7, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(boolean z, @NotNull Function1<? super xNC, Unit> function1, @NotNull Continuation<? super xNA> continuation) throws java.lang.Throwable {
        TradeCoreManager$ensureInitializeWithBuilder$1 tradeCoreManager$ensureInitializeWithBuilder$1;
        java.lang.String str;
        java.lang.String str2;
        int i = 2 % 2;
        if (!(continuation instanceof TradeCoreManager$ensureInitializeWithBuilder$1)) {
            tradeCoreManager$ensureInitializeWithBuilder$1 = new TradeCoreManager$ensureInitializeWithBuilder$1(this, continuation);
        } else {
            tradeCoreManager$ensureInitializeWithBuilder$1 = (TradeCoreManager$ensureInitializeWithBuilder$1) continuation;
            int i2 = tradeCoreManager$ensureInitializeWithBuilder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tradeCoreManager$ensureInitializeWithBuilder$1.label = i2 - Integer.MIN_VALUE;
            }
        }
        java.lang.Object obj = tradeCoreManager$ensureInitializeWithBuilder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = tradeCoreManager$ensureInitializeWithBuilder$1.label;
        try {
            if (i3 != 0) {
                int i4 = AkhnZx;
                int i5 = i4 + 101;
                DbNXlk = i5 % 128;
                if (i5 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 41;
                DbNXlk = i6 % 128;
                if (i6 % 2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    throw null;
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                xNC xnc = new xNC();
                function1.invoke(xnc);
                xNH xnhCopydefault = xnc.copydefault();
                java.lang.String strKWHzl = xNI.KWHzl.KWHzl();
                try {
                    CoroutineDispatcher coroutineDispatcherAYXKKw = C54585xNv.KWHzl.AYXKKw();
                    TradeCoreManager$ensureInitializeWithBuilder$2 tradeCoreManager$ensureInitializeWithBuilder$2 = new TradeCoreManager$ensureInitializeWithBuilder$2(strKWHzl, z, xnhCopydefault, null);
                    tradeCoreManager$ensureInitializeWithBuilder$1.L$0 = strKWHzl;
                    tradeCoreManager$ensureInitializeWithBuilder$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcherAYXKKw, tradeCoreManager$ensureInitializeWithBuilder$2, tradeCoreManager$ensureInitializeWithBuilder$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objWithContext;
                } catch (CancellationException e) {
                    e = e;
                    str2 = strKWHzl;
                    pUU.AEQbTJ("trade_init", "[" + str2 + "] Coroutine was cancelled in ensureInitializeWithBuilder", e);
                    Result.Application application = Result.Companion;
                    return new xNA(Result.m7377constructorimpl(C56391yDq.EZpvd(e)), Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                } catch (java.lang.Exception e2) {
                    e = e2;
                    str = strKWHzl;
                    pUU.AEQbTJ("trade_init", "[" + str + "] ensureInitializeWithBuilder failed: " + e.getMessage(), e);
                    Result.Application application2 = Result.Companion;
                    return new xNA(Result.m7377constructorimpl(C56391yDq.EZpvd(e)), Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                }
            }
            return (xNA) obj;
        } catch (CancellationException e3) {
            e = e3;
            str2 = z;
        } catch (java.lang.Exception e4) {
            e = e4;
            str = z;
        }
    }

    public final java.lang.String DbNXlk() {
        int i = 2 % 2;
        int i2 = AkhnZx + 65;
        DbNXlk = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String strGEmmrt = C55697xoo.OLrzqt.gEmmrt();
        int i4 = AkhnZx + 41;
        DbNXlk = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return strGEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        int i = 2 % 2;
        int i2 = AkhnZx + 39;
        DbNXlk = i2 % 128;
        if (i2 % 2 != 0) {
            return Intrinsics.EZpvd((java.lang.Object) KWHzl, (java.lang.Object) "pro");
        }
        Intrinsics.EZpvd((java.lang.Object) KWHzl, (java.lang.Object) "pro");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Result<? extends InterfaceC54572xNi>> continuation) throws java.lang.Throwable {
        TradeCoreManager$ensureInitForTradeDex$1 tradeCoreManager$ensureInitForTradeDex$1;
        java.lang.String strKWHzl;
        java.lang.Exception e;
        java.lang.String str;
        int i = 2 % 2;
        int i2 = AkhnZx + 21;
        DbNXlk = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z2 = continuation instanceof TradeCoreManager$ensureInitForTradeDex$1;
            throw null;
        }
        if (continuation instanceof TradeCoreManager$ensureInitForTradeDex$1) {
            tradeCoreManager$ensureInitForTradeDex$1 = (TradeCoreManager$ensureInitForTradeDex$1) continuation;
            int i3 = tradeCoreManager$ensureInitForTradeDex$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tradeCoreManager$ensureInitForTradeDex$1.label = i3 - Integer.MIN_VALUE;
            } else {
                tradeCoreManager$ensureInitForTradeDex$1 = new TradeCoreManager$ensureInitForTradeDex$1(this, continuation);
            }
        }
        java.lang.Object obj = tradeCoreManager$ensureInitForTradeDex$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = tradeCoreManager$ensureInitForTradeDex$1.label;
        if (i4 != 0) {
            int i5 = DbNXlk + 59;
            AkhnZx = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) tradeCoreManager$ensureInitForTradeDex$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (CancellationException e2) {
                strKWHzl = str;
                e = e2;
                pUU.AEQbTJ("trade_init", "[" + strKWHzl + "] Coroutine was cancelled for " + C56524yIo.AEQbTJ(InterfaceC54572xNi.class).valueOf(), e);
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
            } catch (java.lang.Exception e3) {
                e = e3;
                pUU.AEQbTJ("trade_init", "[" + str + "] Initialization failed for " + C56524yIo.AEQbTJ(InterfaceC54572xNi.class).valueOf() + ": " + e.getMessage(), e);
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
            }
        } else {
            C56391yDq.AEQbTJ(obj);
            strKWHzl = xNI.KWHzl.KWHzl();
            try {
                CoroutineDispatcher coroutineDispatcherAYXKKw = C54585xNv.KWHzl.AYXKKw();
                TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1 tradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1 = new TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1(strKWHzl, z, null);
                tradeCoreManager$ensureInitForTradeDex$1.L$0 = strKWHzl;
                tradeCoreManager$ensureInitForTradeDex$1.label = 1;
                java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcherAYXKKw, tradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1, tradeCoreManager$ensureInitForTradeDex$1);
                if (objWithContext == objCopydefault) {
                    int i6 = DbNXlk + 69;
                    int i7 = i6 % 128;
                    AkhnZx = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 123;
                    DbNXlk = i9 % 128;
                    int i10 = i9 % 2;
                    return objCopydefault;
                }
                obj = objWithContext;
            } catch (CancellationException e4) {
                e = e4;
                pUU.AEQbTJ("trade_init", "[" + strKWHzl + "] Coroutine was cancelled for " + C56524yIo.AEQbTJ(InterfaceC54572xNi.class).valueOf(), e);
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
            } catch (java.lang.Exception e5) {
                e = e5;
                str = strKWHzl;
                pUU.AEQbTJ("trade_init", "[" + str + "] Initialization failed for " + C56524yIo.AEQbTJ(InterfaceC54572xNi.class).valueOf() + ": " + e.getMessage(), e);
                Result.Application application22 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
            }
        }
        return ((Result) obj).m7386unboximpl();
    }

    public final InterfaceC54572xNi values() {
        int iAEQbTJ = EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ();
        int iAEQbTJ2 = EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ();
        return (InterfaceC54572xNi) KWHzl(-473815706, iAEQbTJ, 473815707, new java.lang.Object[]{this}, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), iAEQbTJ2);
    }

    public static final /* synthetic */ C54614xOx gEmmrt() {
        int iAEQbTJ = EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ();
        int iAEQbTJ2 = EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ();
        return (C54614xOx) KWHzl(-2021296261, iAEQbTJ, 2021296261, new java.lang.Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), iAEQbTJ2);
    }

    public static final /* synthetic */ InterfaceC54572xNi AhwBna() {
        int iAEQbTJ = EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ();
        int iAEQbTJ2 = EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ();
        return (InterfaceC54572xNi) KWHzl(1397675941, iAEQbTJ, -1397675939, new java.lang.Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), iAEQbTJ2);
    }
}
