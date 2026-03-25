package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.NostrSignType;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import com.okinc.business.defi.jwt.GetSignMessageResponse;
import com.okinc.business.defi.jwt.domain.GenerateSignArgsUseCase$generateSignArgs$1;
import com.okinc.business.defi.jwt.domain.GenerateSignArgsUseCase$getWalletId$2;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13600dRi {
    public final C12827cuN AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C10948byA KWHzl;
    public final C13601dRj OLrzqt;
    public final InterfaceC13914dba copydefault;

    @yCM
    public C13600dRi(@NotNull InterfaceC13914dba interfaceC13914dba, @NotNull C12827cuN c12827cuN, @NotNull C13601dRj c13601dRj, @NotNull C10948byA c10948byA, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC13914dba, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c13601dRj, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC13914dba;
        this.AEQbTJ = c12827cuN;
        this.OLrzqt = c13601dRj;
        this.KWHzl = c10948byA;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GenerateSignArgsUseCase$getWalletId$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x0140, CancellationException -> 0x014c, TRY_ENTER, TryCatch #2 {CancellationException -> 0x014c, all -> 0x0140, blocks: (B:14:0x0047, B:48:0x0103, B:19:0x0066, B:33:0x00bf, B:43:0x00e2, B:44:0x00e4, B:22:0x007a, B:29:0x009c, B:25:0x0084), top: B:55:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<DappSignArgs>> continuation) throws java.lang.Throwable {
        GenerateSignArgsUseCase$generateSignArgs$1 generateSignArgsUseCase$generateSignArgs$1;
        long j2;
        java.lang.String str2;
        C13600dRi c13600dRi;
        C13600dRi c13600dRi2;
        GetSignMessageResponse getSignMessageResponse;
        java.lang.Object objM7386unboximpl;
        long j3;
        java.lang.Object objOLrzqt;
        java.lang.String str3;
        java.lang.String str4;
        PlatformItem platformItem;
        TronSignMethodVersion tronSignMethodVersion;
        GetSignMessageResponse getSignMessageResponse2;
        if (continuation instanceof GenerateSignArgsUseCase$generateSignArgs$1) {
            generateSignArgsUseCase$generateSignArgs$1 = (GenerateSignArgsUseCase$generateSignArgs$1) continuation;
            int i = generateSignArgsUseCase$generateSignArgs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateSignArgsUseCase$generateSignArgs$1.label = i - Integer.MIN_VALUE;
            } else {
                generateSignArgsUseCase$generateSignArgs$1 = new GenerateSignArgsUseCase$generateSignArgs$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = generateSignArgsUseCase$generateSignArgs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateSignArgsUseCase$generateSignArgs$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.copydefault;
                generateSignArgsUseCase$generateSignArgs$1.L$0 = this;
                generateSignArgsUseCase$generateSignArgs$1.L$1 = str;
                generateSignArgsUseCase$generateSignArgs$1.J$0 = j;
                generateSignArgsUseCase$generateSignArgs$1.label = 1;
                objAEQbTJ = interfaceC13914dba.AEQbTJ(str, generateSignArgsUseCase$generateSignArgs$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                j2 = j;
                str2 = str;
                c13600dRi = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = generateSignArgsUseCase$generateSignArgs$1.J$0;
                        TronSignMethodVersion tronSignMethodVersion2 = (TronSignMethodVersion) generateSignArgsUseCase$generateSignArgs$1.L$4;
                        java.lang.String str5 = (java.lang.String) generateSignArgsUseCase$generateSignArgs$1.L$3;
                        java.lang.String str6 = (java.lang.String) generateSignArgsUseCase$generateSignArgs$1.L$2;
                        PlatformItem platformItem2 = (PlatformItem) generateSignArgsUseCase$generateSignArgs$1.L$1;
                        getSignMessageResponse2 = (GetSignMessageResponse) generateSignArgsUseCase$generateSignArgs$1.L$0;
                        C56391yDq.AEQbTJ(objAEQbTJ);
                        tronSignMethodVersion = tronSignMethodVersion2;
                        str3 = str5;
                        str4 = str6;
                        platformItem = platformItem2;
                        return Result.m7377constructorimpl(new DappSignArgs((java.lang.String) objAEQbTJ, java.lang.String.valueOf(j3), platformItem, str4, MpcSignType.NORMAL, true, C56443yFo.AEQbTJ(1), null, null, null, false, false, str3, null, null, getSignMessageResponse2.KWHzl(), null, tronSignMethodVersion, true, NostrSignType.MESSAGE, "V4", C56443yFo.KWHzl(false), 128, null));
                    }
                    j3 = generateSignArgsUseCase$generateSignArgs$1.J$0;
                    getSignMessageResponse = (GetSignMessageResponse) generateSignArgsUseCase$generateSignArgs$1.L$1;
                    c13600dRi2 = (C13600dRi) generateSignArgsUseCase$generateSignArgs$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    objM7386unboximpl = ((Result) objAEQbTJ).m7386unboximpl();
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    java.lang.String str7 = (java.lang.String) objM7386unboximpl;
                    PlatformItem platformItemAEQbTJ = c13600dRi2.AEQbTJ(j3);
                    java.lang.String str8 = (j3 != 0 || j3 == 70000061) ? "btc_message" : null;
                    TronSignMethodVersion tronSignMethodVersion3 = j3 == 195 ? TronSignMethodVersion.V1 : null;
                    generateSignArgsUseCase$generateSignArgs$1.L$0 = getSignMessageResponse;
                    generateSignArgsUseCase$generateSignArgs$1.L$1 = platformItemAEQbTJ;
                    generateSignArgsUseCase$generateSignArgs$1.L$2 = str7;
                    generateSignArgsUseCase$generateSignArgs$1.L$3 = str8;
                    generateSignArgsUseCase$generateSignArgs$1.L$4 = tronSignMethodVersion3;
                    generateSignArgsUseCase$generateSignArgs$1.J$0 = j3;
                    generateSignArgsUseCase$generateSignArgs$1.label = 3;
                    objOLrzqt = c13600dRi2.OLrzqt(generateSignArgsUseCase$generateSignArgs$1);
                    if (objOLrzqt != objCopydefault) {
                        return objCopydefault;
                    }
                    str3 = str8;
                    objAEQbTJ = objOLrzqt;
                    str4 = str7;
                    platformItem = platformItemAEQbTJ;
                    tronSignMethodVersion = tronSignMethodVersion3;
                    getSignMessageResponse2 = getSignMessageResponse;
                    return Result.m7377constructorimpl(new DappSignArgs((java.lang.String) objAEQbTJ, java.lang.String.valueOf(j3), platformItem, str4, MpcSignType.NORMAL, true, C56443yFo.AEQbTJ(1), null, null, null, false, false, str3, null, null, getSignMessageResponse2.KWHzl(), null, tronSignMethodVersion, true, NostrSignType.MESSAGE, "V4", C56443yFo.KWHzl(false), 128, null));
                }
                long j4 = generateSignArgsUseCase$generateSignArgs$1.J$0;
                java.lang.String str9 = (java.lang.String) generateSignArgsUseCase$generateSignArgs$1.L$1;
                C13600dRi c13600dRi3 = (C13600dRi) generateSignArgsUseCase$generateSignArgs$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                j2 = j4;
                str2 = str9;
                c13600dRi = c13600dRi3;
            }
            java.lang.Object data = ((ResponseData) objAEQbTJ).getData();
            Intrinsics.copydefault(data);
            GetSignMessageResponse getSignMessageResponse3 = (GetSignMessageResponse) data;
            C13601dRj c13601dRj = c13600dRi.OLrzqt;
            generateSignArgsUseCase$generateSignArgs$1.L$0 = c13600dRi;
            generateSignArgsUseCase$generateSignArgs$1.L$1 = getSignMessageResponse3;
            generateSignArgsUseCase$generateSignArgs$1.J$0 = j2;
            generateSignArgsUseCase$generateSignArgs$1.label = 2;
            java.lang.Object objOLrzqt2 = c13601dRj.OLrzqt(getSignMessageResponse3, str2, j2, generateSignArgsUseCase$generateSignArgs$1);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            c13600dRi2 = c13600dRi;
            getSignMessageResponse = getSignMessageResponse3;
            objM7386unboximpl = objOLrzqt2;
            j3 = j2;
            C56391yDq.AEQbTJ(objM7386unboximpl);
            java.lang.String str72 = (java.lang.String) objM7386unboximpl;
            PlatformItem platformItemAEQbTJ2 = c13600dRi2.AEQbTJ(j3);
            if (j3 != 0) {
                if (j3 == 195) {
                }
                generateSignArgsUseCase$generateSignArgs$1.L$0 = getSignMessageResponse;
                generateSignArgsUseCase$generateSignArgs$1.L$1 = platformItemAEQbTJ2;
                generateSignArgsUseCase$generateSignArgs$1.L$2 = str72;
                generateSignArgsUseCase$generateSignArgs$1.L$3 = str8;
                generateSignArgsUseCase$generateSignArgs$1.L$4 = tronSignMethodVersion3;
                generateSignArgsUseCase$generateSignArgs$1.J$0 = j3;
                generateSignArgsUseCase$generateSignArgs$1.label = 3;
                objOLrzqt = c13600dRi2.OLrzqt(generateSignArgsUseCase$generateSignArgs$1);
                if (objOLrzqt != objCopydefault) {
                }
            }
            return Result.m7377constructorimpl(new DappSignArgs((java.lang.String) objAEQbTJ, java.lang.String.valueOf(j3), platformItem, str4, MpcSignType.NORMAL, true, C56443yFo.AEQbTJ(1), null, null, null, false, false, str3, null, null, getSignMessageResponse2.KWHzl(), null, tronSignMethodVersion, true, NostrSignType.MESSAGE, "V4", C56443yFo.KWHzl(false), 128, null));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final PlatformItem AEQbTJ(long j) {
        java.lang.String str = null;
        PlatformItem platformItem = new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, str, str, 16383, (DefaultConstructorMarker) null);
        platformItem.setPlatform("PLATFORM_WALLET");
        java.lang.Object objKWHzl = KWHzl(j);
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        java.lang.String str2 = (java.lang.String) objKWHzl;
        if (str2 == null) {
            str2 = "";
        }
        platformItem.setNetwork(str2);
        return platformItem;
    }

    public final java.lang.Object KWHzl(long j) {
        java.lang.String strDjBIcL;
        try {
            Result.Application application = Result.Companion;
            C10854bwM c10854bwMCopydefault = this.KWHzl.copydefault(j);
            if (c10854bwMCopydefault != null) {
                strDjBIcL = c10854bwMCopydefault.djBIcL();
            } else {
                strDjBIcL = j == 1 ? "Ethereum" : j == 56 ? "BSC" : "OKExChain";
            }
            return Result.m7377constructorimpl(strDjBIcL);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
