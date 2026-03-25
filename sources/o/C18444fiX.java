package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletJwtInfoEntity;
import com.okinc.business.defi.wallet.jwt.WalletJwtRepositoryImpl$getJwt$1;
import com.okinc.business.defi.wallet.jwt.WalletJwtRepositoryImpl$saveJwt$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18444fiX implements InterfaceC18439fiS {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final C18440fiT KWHzl;
    public final InterfaceC11435cOc OLrzqt;

    public C18444fiX(@NotNull C18440fiT c18440fiT, @NotNull InterfaceC11435cOc interfaceC11435cOc) {
        Intrinsics.checkNotNullParameter(c18440fiT, "");
        Intrinsics.checkNotNullParameter(interfaceC11435cOc, "");
        this.KWHzl = c18440fiT;
        this.OLrzqt = interfaceC11435cOc;
    }

    /* JADX INFO: renamed from: o.fiX$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fiX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC18439fiS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        WalletJwtRepositoryImpl$getJwt$1 walletJwtRepositoryImpl$getJwt$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.String str2;
        C18444fiX c18444fiX;
        java.lang.String strEZpvd;
        if (continuation instanceof WalletJwtRepositoryImpl$getJwt$1) {
            walletJwtRepositoryImpl$getJwt$1 = (WalletJwtRepositoryImpl$getJwt$1) continuation;
            int i = walletJwtRepositoryImpl$getJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletJwtRepositoryImpl$getJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                walletJwtRepositoryImpl$getJwt$1 = new WalletJwtRepositoryImpl$getJwt$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletJwtRepositoryImpl$getJwt$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletJwtRepositoryImpl$getJwt$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                java.lang.String strOLrzqt = this.KWHzl.OLrzqt(str);
                if (strOLrzqt != null && strOLrzqt.length() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt))) {
                    return strOLrzqt;
                }
                InterfaceC11435cOc interfaceC11435cOc = this.OLrzqt;
                walletJwtRepositoryImpl$getJwt$1.L$0 = str;
                walletJwtRepositoryImpl$getJwt$1.L$1 = this;
                walletJwtRepositoryImpl$getJwt$1.label = 1;
                objCopydefault = interfaceC11435cOc.copydefault(str, walletJwtRepositoryImpl$getJwt$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                str2 = str;
                c18444fiX = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c18444fiX = (C18444fiX) walletJwtRepositoryImpl$getJwt$1.L$1;
                str2 = (java.lang.String) walletJwtRepositoryImpl$getJwt$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            java.lang.String str3 = (java.lang.String) objCopydefault;
            if (str3 == null || str3.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) || (strEZpvd = C18442fiV.AEQbTJ.EZpvd(str3)) == null || strEZpvd.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd))) {
                strEZpvd = null;
            } else {
                c18444fiX.KWHzl.KWHzl(str2, strEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ("WalletJwtRepositoryImpl", "getJwt failed", thM7380exceptionOrNullimpl);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC18439fiS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletJwtRepositoryImpl$saveJwt$1 walletJwtRepositoryImpl$saveJwt$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.String str3;
        C18444fiX c18444fiX;
        if (continuation instanceof WalletJwtRepositoryImpl$saveJwt$1) {
            walletJwtRepositoryImpl$saveJwt$1 = (WalletJwtRepositoryImpl$saveJwt$1) continuation;
            int i = walletJwtRepositoryImpl$saveJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletJwtRepositoryImpl$saveJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                walletJwtRepositoryImpl$saveJwt$1 = new WalletJwtRepositoryImpl$saveJwt$1(this, continuation);
            }
        }
        java.lang.Object obj = walletJwtRepositoryImpl$saveJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletJwtRepositoryImpl$saveJwt$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC11435cOc interfaceC11435cOc = this.OLrzqt;
                WalletJwtInfoEntity walletJwtInfoEntity = new WalletJwtInfoEntity(str, C18442fiV.AEQbTJ.KWHzl(str2));
                walletJwtRepositoryImpl$saveJwt$1.L$0 = str;
                walletJwtRepositoryImpl$saveJwt$1.L$1 = str2;
                walletJwtRepositoryImpl$saveJwt$1.L$2 = this;
                walletJwtRepositoryImpl$saveJwt$1.label = 1;
                if (interfaceC11435cOc.EZpvd(walletJwtInfoEntity, walletJwtRepositoryImpl$saveJwt$1) == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str;
                c18444fiX = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c18444fiX = (C18444fiX) walletJwtRepositoryImpl$saveJwt$1.L$2;
                str2 = (java.lang.String) walletJwtRepositoryImpl$saveJwt$1.L$1;
                str3 = (java.lang.String) walletJwtRepositoryImpl$saveJwt$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            c18444fiX.KWHzl.KWHzl(str3, str2);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletJwtRepositoryImpl", "saveJwt failed", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
