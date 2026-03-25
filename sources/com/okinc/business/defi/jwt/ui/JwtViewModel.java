package com.okinc.business.defi.jwt.ui;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.jwt.AddressLoginRequest;
import com.okinc.business.defi.jwt.AddressLoginResponse;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C10954byG;
import o.C12827cuN;
import o.C13594dRc;
import o.C13599dRh;
import o.C13600dRi;
import o.C13602dRk;
import o.C13603dRl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9854bdT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class JwtViewModel extends ViewModel {
    public final C13600dRi AEQbTJ;
    public final InterfaceC9854bdT AYXKKw;
    public final AbstractC12782ctV AhwBna;
    public final C13603dRl EZpvd;
    public final long KWHzl;
    public final C13599dRh OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C13602dRk djBIcL;
    public final C13594dRc gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9854bdT EZpvd() {
        return this.AYXKKw;
    }

    @yCM
    public JwtViewModel(@NotNull C12827cuN c12827cuN, @NotNull InterfaceC9854bdT interfaceC9854bdT, @NotNull C13600dRi c13600dRi, @NotNull C13603dRl c13603dRl, @NotNull C13602dRk c13602dRk, @NotNull C13599dRh c13599dRh, @NotNull C13594dRc c13594dRc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC9854bdT, "");
        Intrinsics.checkNotNullParameter(c13600dRi, "");
        Intrinsics.checkNotNullParameter(c13603dRl, "");
        Intrinsics.checkNotNullParameter(c13602dRk, "");
        Intrinsics.checkNotNullParameter(c13599dRh, "");
        Intrinsics.checkNotNullParameter(c13594dRc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = interfaceC9854bdT;
        this.AEQbTJ = c13600dRi;
        this.EZpvd = c13603dRl;
        this.djBIcL = c13602dRk;
        this.OLrzqt = c13599dRh;
        this.gEmmrt = c13594dRc;
        this.copydefault = coroutineDispatcher;
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        this.KWHzl = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : 0L;
        this.AhwBna = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AkhnZx(c12827cuN.copydefault(), 0);
    }

    public final String copydefault() {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        Set<String> setCopydefault;
        AbstractC12782ctV abstractC12782ctV3 = this.AhwBna;
        if ((abstractC12782ctV3 != null && abstractC12782ctV3.ORxRYg()) || (((abstractC12782ctV = this.AhwBna) != null && abstractC12782ctV.gHZMYf()) || ((abstractC12782ctV2 = this.AhwBna) != null && abstractC12782ctV2.AubY()))) {
            String strEZpvd = this.AhwBna.EZpvd(C33129mqd.valueOf(Long.valueOf(this.KWHzl)));
            if (strEZpvd != null && strEZpvd.length() != 0) {
                return strEZpvd;
            }
        } else {
            AbstractC12782ctV abstractC12782ctV4 = this.AhwBna;
            String strGEmmrt = C33129mqd.gEmmrt((abstractC12782ctV4 == null || (setCopydefault = abstractC12782ctV4.copydefault()) == null) ? null : (String) CollectionsKt___CollectionsKt.RcXXUw(setCopydefault));
            if (strGEmmrt != null && strGEmmrt.length() != 0) {
                return strGEmmrt;
            }
        }
        return "";
    }

    public final String KWHzl() {
        AbstractC12782ctV abstractC12782ctV = this.AhwBna;
        String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        return (strDbNXlk == null || strDbNXlk.length() == 0) ? "" : strDbNXlk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(long j, @NotNull Continuation<? super Result<DappSignArgs>> continuation) {
        JwtViewModel$generateSignMessage$1 jwtViewModel$generateSignMessage$1;
        Object objKWHzl;
        if (continuation instanceof JwtViewModel$generateSignMessage$1) {
            jwtViewModel$generateSignMessage$1 = (JwtViewModel$generateSignMessage$1) continuation;
            int i = jwtViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwtViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                jwtViewModel$generateSignMessage$1 = new JwtViewModel$generateSignMessage$1(this, continuation);
            }
        }
        Object obj = jwtViewModel$generateSignMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = jwtViewModel$generateSignMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                String strCopydefault = copydefault();
                C13600dRi c13600dRi = this.AEQbTJ;
                jwtViewModel$generateSignMessage$1.label = 1;
                objKWHzl = c13600dRi.KWHzl(strCopydefault, j, jwtViewModel$generateSignMessage$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objKWHzl);
            return Result.m7377constructorimpl((DappSignArgs) objKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Bundle bundle, long j, @NotNull Continuation<? super Result<Boolean>> continuation) {
        JwtViewModel$login$1 jwtViewModel$login$1;
        Object objKWHzl;
        JwtViewModel jwtViewModel;
        Object objKWHzl2;
        if (continuation instanceof JwtViewModel$login$1) {
            jwtViewModel$login$1 = (JwtViewModel$login$1) continuation;
            int i = jwtViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwtViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                jwtViewModel$login$1 = new JwtViewModel$login$1(this, continuation);
            }
        }
        Object obj = jwtViewModel$login$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = jwtViewModel$login$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                Object objCopydefault2 = this.djBIcL.copydefault(bundle);
                C56391yDq.AEQbTJ(objCopydefault2);
                String str = (String) objCopydefault2;
                String strCopydefault = copydefault();
                if (strCopydefault == null || strCopydefault.length() == 0) {
                    strCopydefault = "";
                }
                String string = bundle != null ? bundle.getString("publicKey") : null;
                C13603dRl c13603dRl = this.EZpvd;
                String str2 = string == null ? "" : string;
                jwtViewModel$login$1.L$0 = this;
                jwtViewModel$login$1.label = 1;
                objKWHzl = c13603dRl.KWHzl(strCopydefault, j, str, str2, jwtViewModel$login$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                jwtViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl2 = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objKWHzl2);
                    return Result.m7377constructorimpl((Boolean) objKWHzl2);
                }
                jwtViewModel = (JwtViewModel) jwtViewModel$login$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objKWHzl);
            C13599dRh c13599dRh = jwtViewModel.OLrzqt;
            jwtViewModel$login$1.L$0 = null;
            jwtViewModel$login$1.label = 2;
            objKWHzl2 = c13599dRh.KWHzl((AddressLoginRequest) objKWHzl, jwtViewModel$login$1);
            if (objKWHzl2 == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objKWHzl2);
            return Result.m7377constructorimpl((Boolean) objKWHzl2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final Object copydefault(@NotNull Continuation<? super Boolean> continuation) {
        String strCopydefault = copydefault();
        if (strCopydefault == null || strCopydefault.length() == 0) {
            strCopydefault = "";
        }
        Object objCopydefault = this.gEmmrt.copydefault(strCopydefault);
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        AddressLoginResponse addressLoginResponse = (AddressLoginResponse) objCopydefault;
        return C56443yFo.KWHzl(C33129mqd.OLrzqt((CharSequence) (addressLoginResponse != null ? addressLoginResponse.EZpvd() : null)));
    }
}
