package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.GetMessageForSigningResp;
import com.okinc.business.defi.biz.net.bean.Web3LoginReq;
import com.okinc.business.defi.biz.net.bean.Web3LoginResp;
import com.okinc.business.defi.wallet.jwt.GenerateWalletJwtUseCase$invoke$1;
import com.okinc.business.defi.wallet.jwt.WalletJwtErrorCode;
import com.okinc.wallet.core.sign.SignParams;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C13754dXa;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18438fiR {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC18439fiS AEQbTJ;
    public final C10948byA KWHzl;
    public final C6887aXp OLrzqt;
    public final C13934dbu copydefault;
    public final C12827cuN djBIcL;
    public final xYU valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18438fiR() {
        this(null, null, null, null, null, null, 63, null);
    }

    public C18438fiR(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull InterfaceC18439fiS interfaceC18439fiS, @NotNull C6887aXp c6887aXp, @NotNull xYU xyu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(interfaceC18439fiS, "");
        Intrinsics.checkNotNullParameter(c6887aXp, "");
        Intrinsics.checkNotNullParameter(xyu, "");
        this.copydefault = c13934dbu;
        this.djBIcL = c12827cuN;
        this.KWHzl = c10948byA;
        this.AEQbTJ = interfaceC18439fiS;
        this.OLrzqt = c6887aXp;
        this.valueOf = xyu;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x000c: INVOKE 
  (wrap:o.dKx:0x0008: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0006: SGET  A[WRAPPED] (LINE:19) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:19))
 INTERFACE call: o.dKx.DTwDnp():o.dbu A[MD:():o.dbu (m), WRAPPED] (LINE:19)) : (r5v0 o.dbu))
  (wrap:o.cuN:0x001e: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x001a: INVOKE 
  (wrap:o.dKx:0x0016: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0014: SGET  A[WRAPPED] (LINE:20) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:20))
 INTERFACE call: o.dKx.OcIXYQ():o.cuN A[MD:():o.cuN (m), WRAPPED] (LINE:20)) : (r6v0 o.cuN))
  (wrap:o.byA:0x0029: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0025: INVOKE (wrap:o.byG:0x0023: SGET  A[WRAPPED] (LINE:21) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:21)) : (r7v0 o.byA))
  (wrap:o.fiS:0x0038: TERNARY null = ((wrap:int:0x002a: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fiS:0x0034: INVOKE 
  (wrap:o.dKx:0x0030: INVOKE 
  (wrap:o.dKx$TaskDescription:0x002e: SGET  A[WRAPPED] (LINE:22) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:22))
 INTERFACE call: o.dKx.AwvSrB():o.fiS A[MD:():o.fiS (m), WRAPPED] (LINE:22)) : (r8v0 o.fiS))
  (wrap:o.aXp:0x003f: TERNARY null = ((wrap:int:0x0039: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.aXp:0x003d: SGET  A[WRAPPED] (LINE:23) o.aXp.copydefault o.aXp) : (r9v0 o.aXp))
  (wrap:o.xYU:?: TERNARY null = ((wrap:int:0x0040: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xYU:0x0044: SGET  A[WRAPPED] (LINE:24) o.xYU.copydefault o.xYU) : (r10v0 o.xYU))
 A[MD:(o.dbu, o.cuN, o.byA, o.fiS, o.aXp, o.xYU):void (m)] (LINE:18) call: o.fiR.<init>(o.dbu, o.cuN, o.byA, o.fiS, o.aXp, o.xYU):void type: THIS */
    public /* synthetic */ C18438fiR(C13934dbu c13934dbu, C12827cuN c12827cuN, C10948byA c10948byA, InterfaceC18439fiS interfaceC18439fiS, C6887aXp c6887aXp, xYU xyu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp() : c13934dbu, (i & 2) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).OcIXYQ() : c12827cuN, (i & 4) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA, (i & 8) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).AwvSrB() : interfaceC18439fiS, (i & 16) != 0 ? C6887aXp.copydefault : c6887aXp, (i & 32) != 0 ? xYU.copydefault : xyu);
    }

    /* JADX INFO: renamed from: o.fiR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fiR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [34=5] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f A[Catch: all -> 0x029b, CancellationException -> 0x02a7, TryCatch #2 {CancellationException -> 0x02a7, all -> 0x029b, blocks: (B:15:0x0037, B:76:0x020b, B:20:0x004c, B:69:0x01e6, B:71:0x01f4, B:73:0x01fa, B:77:0x0213, B:78:0x0219, B:23:0x0069, B:64:0x0189, B:66:0x01ba, B:79:0x021a, B:80:0x021e, B:26:0x0083, B:49:0x0111, B:51:0x012f, B:53:0x0137, B:56:0x0149, B:58:0x0153, B:60:0x015d, B:81:0x021f, B:82:0x023d, B:83:0x023e, B:84:0x025c, B:85:0x025d, B:86:0x0277, B:87:0x0278, B:88:0x0295, B:29:0x0094, B:36:0x00c2, B:38:0x00cb, B:40:0x00d1, B:43:0x00d9, B:45:0x00e1, B:89:0x0296, B:90:0x029a, B:32:0x00a2), top: B:96:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba A[Catch: all -> 0x029b, CancellationException -> 0x02a7, TryCatch #2 {CancellationException -> 0x02a7, all -> 0x029b, blocks: (B:15:0x0037, B:76:0x020b, B:20:0x004c, B:69:0x01e6, B:71:0x01f4, B:73:0x01fa, B:77:0x0213, B:78:0x0219, B:23:0x0069, B:64:0x0189, B:66:0x01ba, B:79:0x021a, B:80:0x021e, B:26:0x0083, B:49:0x0111, B:51:0x012f, B:53:0x0137, B:56:0x0149, B:58:0x0153, B:60:0x015d, B:81:0x021f, B:82:0x023d, B:83:0x023e, B:84:0x025c, B:85:0x025d, B:86:0x0277, B:87:0x0278, B:88:0x0295, B:29:0x0094, B:36:0x00c2, B:38:0x00cb, B:40:0x00d1, B:43:0x00d9, B:45:0x00e1, B:89:0x0296, B:90:0x029a, B:32:0x00a2), top: B:96:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a A[Catch: all -> 0x029b, CancellationException -> 0x02a7, TryCatch #2 {CancellationException -> 0x02a7, all -> 0x029b, blocks: (B:15:0x0037, B:76:0x020b, B:20:0x004c, B:69:0x01e6, B:71:0x01f4, B:73:0x01fa, B:77:0x0213, B:78:0x0219, B:23:0x0069, B:64:0x0189, B:66:0x01ba, B:79:0x021a, B:80:0x021e, B:26:0x0083, B:49:0x0111, B:51:0x012f, B:53:0x0137, B:56:0x0149, B:58:0x0153, B:60:0x015d, B:81:0x021f, B:82:0x023d, B:83:0x023e, B:84:0x025c, B:85:0x025d, B:86:0x0277, B:87:0x0278, B:88:0x0295, B:29:0x0094, B:36:0x00c2, B:38:0x00cb, B:40:0x00d1, B:43:0x00d9, B:45:0x00e1, B:89:0x0296, B:90:0x029a, B:32:0x00a2), top: B:96:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0278 A[Catch: all -> 0x029b, CancellationException -> 0x02a7, TryCatch #2 {CancellationException -> 0x02a7, all -> 0x029b, blocks: (B:15:0x0037, B:76:0x020b, B:20:0x004c, B:69:0x01e6, B:71:0x01f4, B:73:0x01fa, B:77:0x0213, B:78:0x0219, B:23:0x0069, B:64:0x0189, B:66:0x01ba, B:79:0x021a, B:80:0x021e, B:26:0x0083, B:49:0x0111, B:51:0x012f, B:53:0x0137, B:56:0x0149, B:58:0x0153, B:60:0x015d, B:81:0x021f, B:82:0x023d, B:83:0x023e, B:84:0x025c, B:85:0x025d, B:86:0x0277, B:87:0x0278, B:88:0x0295, B:29:0x0094, B:36:0x00c2, B:38:0x00cb, B:40:0x00d1, B:43:0x00d9, B:45:0x00e1, B:89:0x0296, B:90:0x029a, B:32:0x00a2), top: B:96:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) {
        GenerateWalletJwtUseCase$invoke$1 generateWalletJwtUseCase$invoke$1;
        C18438fiR c18438fiR;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.String str4;
        C18438fiR c18438fiR2;
        AbstractC12782ctV abstractC12782ctV;
        java.lang.String str5;
        long chainIndex;
        int i;
        C18438fiR c18438fiR3;
        C10854bwM c10854bwM;
        java.lang.String str6;
        java.lang.String str7;
        ChainAddress chainAddress;
        long j;
        java.lang.String strAEQbTJ;
        java.lang.String token;
        java.lang.String str8 = str;
        if (continuation instanceof GenerateWalletJwtUseCase$invoke$1) {
            generateWalletJwtUseCase$invoke$1 = (GenerateWalletJwtUseCase$invoke$1) continuation;
            int i2 = generateWalletJwtUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                generateWalletJwtUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                generateWalletJwtUseCase$invoke$1 = new GenerateWalletJwtUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = generateWalletJwtUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = generateWalletJwtUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.djBIcL.OLrzqt(str8, false);
                generateWalletJwtUseCase$invoke$1.L$0 = this;
                generateWalletJwtUseCase$invoke$1.L$1 = str8;
                generateWalletJwtUseCase$invoke$1.L$2 = str2;
                generateWalletJwtUseCase$invoke$1.label = 1;
                java.lang.Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, generateWalletJwtUseCase$invoke$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                c18438fiR = this;
                obj = objAwait;
                str3 = str2;
            } else if (i3 == 1) {
                java.lang.String str9 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$2;
                java.lang.String str10 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$1;
                C18438fiR c18438fiR4 = (C18438fiR) generateWalletJwtUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c18438fiR = c18438fiR4;
                str3 = str9;
                str8 = str10;
                obj = objEZpvd;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(objEZpvd);
                            return Result.m7377constructorimpl(Unit.INSTANCE);
                        }
                        str6 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$1;
                        c18438fiR3 = (C18438fiR) generateWalletJwtUseCase$invoke$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd);
                        token = ((Web3LoginResp) ((AbstractC43419rot) objEZpvd).AEQbTJ()).getToken();
                        if (token != null || token.length() == 0) {
                            throw c18438fiR3.EZpvd("Token is null or empty");
                        }
                        InterfaceC18439fiS interfaceC18439fiS = c18438fiR3.AEQbTJ;
                        generateWalletJwtUseCase$invoke$1.L$0 = null;
                        generateWalletJwtUseCase$invoke$1.L$1 = null;
                        generateWalletJwtUseCase$invoke$1.label = 5;
                        if (interfaceC18439fiS.AEQbTJ(str6, token, generateWalletJwtUseCase$invoke$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Result.m7377constructorimpl(Unit.INSTANCE);
                    }
                    int i4 = generateWalletJwtUseCase$invoke$1.I$0;
                    long j2 = generateWalletJwtUseCase$invoke$1.J$0;
                    c10854bwM = (C10854bwM) generateWalletJwtUseCase$invoke$1.L$4;
                    chainAddress = (ChainAddress) generateWalletJwtUseCase$invoke$1.L$3;
                    str7 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$2;
                    java.lang.String str11 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$1;
                    C18438fiR c18438fiR5 = (C18438fiR) generateWalletJwtUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    i = i4;
                    j = j2;
                    str6 = str11;
                    c18438fiR3 = c18438fiR5;
                    strAEQbTJ = c18438fiR3.valueOf.AEQbTJ(new SignParams(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), null, (java.lang.String) objEZpvd, null, null, i, null, false, false, null, 1972, null), str7);
                    if (strAEQbTJ.length() != 0) {
                        throw c18438fiR3.KWHzl();
                    }
                    C13934dbu c13934dbu = c18438fiR3.copydefault;
                    Web3LoginReq web3LoginReq = new Web3LoginReq(str6, j, chainAddress.getAddress(), chainAddress.getPublicKey(), 2, strAEQbTJ);
                    generateWalletJwtUseCase$invoke$1.L$0 = c18438fiR3;
                    generateWalletJwtUseCase$invoke$1.L$1 = str6;
                    generateWalletJwtUseCase$invoke$1.L$2 = null;
                    generateWalletJwtUseCase$invoke$1.L$3 = null;
                    generateWalletJwtUseCase$invoke$1.L$4 = null;
                    generateWalletJwtUseCase$invoke$1.label = 4;
                    objEZpvd = c13934dbu.EZpvd(web3LoginReq, generateWalletJwtUseCase$invoke$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    token = ((Web3LoginResp) ((AbstractC43419rot) objEZpvd).AEQbTJ()).getToken();
                    if (token != null) {
                    }
                    throw c18438fiR3.EZpvd("Token is null or empty");
                }
                abstractC12782ctV = (AbstractC12782ctV) generateWalletJwtUseCase$invoke$1.L$3;
                str5 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$2;
                str4 = (java.lang.String) generateWalletJwtUseCase$invoke$1.L$1;
                c18438fiR2 = (C18438fiR) generateWalletJwtUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                GetMessageForSigningResp getMessageForSigningResp = (GetMessageForSigningResp) ((AbstractC43419rot) objEZpvd).AEQbTJ();
                chainIndex = getMessageForSigningResp.getChainIndex();
                java.lang.String signData = getMessageForSigningResp.getSignData();
                int signAddressType = getMessageForSigningResp.getSignAddressType();
                if (abstractC12782ctV.KWHzl(C56443yFo.KWHzl(chainIndex))) {
                    throw c18438fiR2.EZpvd("Wallet[" + str4 + "] doesn't support " + chainIndex);
                }
                C10854bwM c10854bwMCopydefault = c18438fiR2.KWHzl.copydefault(chainIndex);
                if (c10854bwMCopydefault == null) {
                    throw c18438fiR2.EZpvd("Chain[" + chainIndex + "] not found");
                }
                ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(c10854bwMCopydefault.AEQbTJ(), C56443yFo.AEQbTJ(signAddressType));
                if (chainAddressOLrzqt == null) {
                    throw c18438fiR2.EZpvd("Address not found, chainIndex[" + chainIndex + "] and addressType[" + signAddressType + "]");
                }
                if (chainAddressOLrzqt.getAddress().length() == 0 || chainAddressOLrzqt.getPublicKey().length() == 0) {
                    throw c18438fiR2.EZpvd("Address is empty, chainIndex[" + chainIndex + "] and addressType[" + signAddressType + "]");
                }
                AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC12782ctV.OLrzqt(str5, c10854bwMCopydefault.AEQbTJ(), signAddressType);
                generateWalletJwtUseCase$invoke$1.L$0 = c18438fiR2;
                generateWalletJwtUseCase$invoke$1.L$1 = str4;
                generateWalletJwtUseCase$invoke$1.L$2 = signData;
                generateWalletJwtUseCase$invoke$1.L$3 = chainAddressOLrzqt;
                generateWalletJwtUseCase$invoke$1.L$4 = c10854bwMCopydefault;
                generateWalletJwtUseCase$invoke$1.J$0 = chainIndex;
                generateWalletJwtUseCase$invoke$1.I$0 = signAddressType;
                generateWalletJwtUseCase$invoke$1.label = 3;
                java.lang.Object objAwait2 = RxAwaitKt.await(abstractC58260yxtOLrzqt2, generateWalletJwtUseCase$invoke$1);
                if (objAwait2 == objCopydefault) {
                    return objCopydefault;
                }
                i = signAddressType;
                c18438fiR3 = c18438fiR2;
                c10854bwM = c10854bwMCopydefault;
                objEZpvd = objAwait2;
                str6 = str4;
                str7 = signData;
                chainAddress = chainAddressOLrzqt;
                j = chainIndex;
                strAEQbTJ = c18438fiR3.valueOf.AEQbTJ(new SignParams(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), null, (java.lang.String) objEZpvd, null, null, i, null, false, false, null, 1972, null), str7);
                if (strAEQbTJ.length() != 0) {
                }
            }
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj;
            if (!abstractC12782ctV2.AubY() && !abstractC12782ctV2.QVAiDq() && !abstractC12782ctV2.AwvSrB()) {
                return Result.m7377constructorimpl(Unit.INSTANCE);
            }
            InterfaceC6884aXm interfaceC6884aXmOLrzqt = c18438fiR.OLrzqt.OLrzqt();
            if (interfaceC6884aXmOLrzqt == null) {
                throw c18438fiR.AEQbTJ();
            }
            C13934dbu c13934dbu2 = c18438fiR.copydefault;
            java.lang.String strEZpvd = interfaceC6884aXmOLrzqt.AEQbTJ().EZpvd();
            generateWalletJwtUseCase$invoke$1.L$0 = c18438fiR;
            generateWalletJwtUseCase$invoke$1.L$1 = str8;
            generateWalletJwtUseCase$invoke$1.L$2 = str3;
            generateWalletJwtUseCase$invoke$1.L$3 = abstractC12782ctV2;
            generateWalletJwtUseCase$invoke$1.label = 2;
            java.lang.Object objAEQbTJ = c13934dbu2.AEQbTJ(strEZpvd, str8, 2, 2, generateWalletJwtUseCase$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str4 = str8;
            c18438fiR2 = c18438fiR;
            abstractC12782ctV = abstractC12782ctV2;
            str5 = str3;
            objEZpvd = objAEQbTJ;
            GetMessageForSigningResp getMessageForSigningResp2 = (GetMessageForSigningResp) ((AbstractC43419rot) objEZpvd).AEQbTJ();
            chainIndex = getMessageForSigningResp2.getChainIndex();
            java.lang.String signData2 = getMessageForSigningResp2.getSignData();
            int signAddressType2 = getMessageForSigningResp2.getSignAddressType();
            if (abstractC12782ctV.KWHzl(C56443yFo.KWHzl(chainIndex))) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Throwable AEQbTJ() {
        C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.GENERATE_JWT_ERROR, "R1 Sign Key is null", 0, 4, null);
        return C11619cUz.OLrzqt("GenerateWalletJwtUseCase", "R1 Sign Key is null", C33070mpX.AYXKKw(C13754dXa.FragmentManager.dNCPSb));
    }

    public final java.lang.Throwable EZpvd(java.lang.String str) {
        C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.GENERATE_JWT_ERROR, str, 0, 4, null);
        return C11619cUz.OLrzqt("GenerateWalletJwtUseCase", str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
    }

    public final java.lang.Throwable KWHzl() {
        C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.GENERATE_JWT_ERROR, "Signed message is empty", 0, 4, null);
        return C11619cUz.OLrzqt("GenerateWalletJwtUseCase", "Signed message is empty", C33070mpX.AYXKKw(C13754dXa.FragmentManager.DRGLNw));
    }
}
