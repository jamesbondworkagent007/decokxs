package o;

import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.ReminderInfo;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$callRustApi$1;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$callRustApi$result$1$1;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$callRustApi$result$1$2;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$callRustApi$result$1$3;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$callRustApi$result$1$4;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$fallbackToNative$1;
import com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata.RustBridgeApproveDataUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUF {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final C23237huT KWHzl;

    @yCM
    public kUF(@NotNull C23237huT c23237huT) {
        Intrinsics.checkNotNullParameter(c23237huT, "");
        this.KWHzl = c23237huT;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kUF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super ApproveUnsignedData> continuation) throws java.lang.Throwable {
        RustBridgeApproveDataUseCase$invoke$1 rustBridgeApproveDataUseCase$invoke$1;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        kUF kuf;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof RustBridgeApproveDataUseCase$invoke$1) {
            rustBridgeApproveDataUseCase$invoke$1 = (RustBridgeApproveDataUseCase$invoke$1) continuation;
            int i = rustBridgeApproveDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustBridgeApproveDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                rustBridgeApproveDataUseCase$invoke$1 = new RustBridgeApproveDataUseCase$invoke$1(this, continuation);
            }
        }
        RustBridgeApproveDataUseCase$invoke$1 rustBridgeApproveDataUseCase$invoke$12 = rustBridgeApproveDataUseCase$invoke$1;
        java.lang.Object objEZpvd = rustBridgeApproveDataUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustBridgeApproveDataUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                rustBridgeApproveDataUseCase$invoke$12.L$0 = this;
                str6 = str;
            } catch (java.lang.Throwable th) {
                th = th;
                str6 = str;
            }
            try {
                rustBridgeApproveDataUseCase$invoke$12.L$1 = str6;
                str7 = str2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                str7 = str2;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                kuf = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            try {
                rustBridgeApproveDataUseCase$invoke$12.L$2 = str7;
                str8 = str3;
                try {
                    rustBridgeApproveDataUseCase$invoke$12.L$3 = str8;
                    str9 = str4;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str9 = str4;
                    str10 = str5;
                    kuf = this;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl == null) {
                    }
                }
                try {
                    rustBridgeApproveDataUseCase$invoke$12.L$4 = str9;
                    rustBridgeApproveDataUseCase$invoke$12.L$5 = str5;
                    rustBridgeApproveDataUseCase$invoke$12.label = 1;
                    objEZpvd = EZpvd(str, str2, str3, str4, str5, rustBridgeApproveDataUseCase$invoke$12);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str10 = str5;
                    kuf = this;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl == null) {
                    }
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                kuf = this;
                Result.Application application2222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str10 = str5;
            kuf = this;
            objM7377constructorimpl = Result.m7377constructorimpl((ApproveUnsignedData) objEZpvd);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        } else if (i2 == 1) {
            str10 = (java.lang.String) rustBridgeApproveDataUseCase$invoke$12.L$5;
            java.lang.String str11 = (java.lang.String) rustBridgeApproveDataUseCase$invoke$12.L$4;
            java.lang.String str12 = (java.lang.String) rustBridgeApproveDataUseCase$invoke$12.L$3;
            java.lang.String str13 = (java.lang.String) rustBridgeApproveDataUseCase$invoke$12.L$2;
            java.lang.String str14 = (java.lang.String) rustBridgeApproveDataUseCase$invoke$12.L$1;
            kuf = (kUF) rustBridgeApproveDataUseCase$invoke$12.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                str9 = str11;
                str8 = str12;
                str7 = str13;
                str6 = str14;
                try {
                    objM7377constructorimpl = Result.m7377constructorimpl((ApproveUnsignedData) objEZpvd);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    Result.Application application22222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str9 = str11;
                str8 = str12;
                str7 = str13;
                str6 = str14;
                Result.Application application222222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                ApproveUnsignedData approveUnsignedData = (ApproveUnsignedData) objM7377constructorimpl;
                pUU.KWHzl("RustBridgeApproveData", "bridgeApproveData success: id=" + (approveUnsignedData != null ? approveUnsignedData.getId() : null));
                return approveUnsignedData;
            }
            pUU.AEQbTJ("RustBridgeApproveData", "bridgeApproveData failed, fallback to native", thM7380exceptionOrNullimpl);
            rustBridgeApproveDataUseCase$invoke$12.L$0 = null;
            rustBridgeApproveDataUseCase$invoke$12.L$1 = null;
            rustBridgeApproveDataUseCase$invoke$12.L$2 = null;
            rustBridgeApproveDataUseCase$invoke$12.L$3 = null;
            rustBridgeApproveDataUseCase$invoke$12.L$4 = null;
            rustBridgeApproveDataUseCase$invoke$12.L$5 = null;
            rustBridgeApproveDataUseCase$invoke$12.label = 2;
            objEZpvd = kuf.copydefault(str6, str7, str8, str9, str10, rustBridgeApproveDataUseCase$invoke$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return (ApproveUnsignedData) objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation<? super ApproveUnsignedData> continuation) throws java.lang.Throwable {
        RustBridgeApproveDataUseCase$callRustApi$1 rustBridgeApproveDataUseCase$callRustApi$1;
        java.lang.Object objAEQbTJ;
        kUF kuf;
        if (continuation instanceof RustBridgeApproveDataUseCase$callRustApi$1) {
            rustBridgeApproveDataUseCase$callRustApi$1 = (RustBridgeApproveDataUseCase$callRustApi$1) continuation;
            int i = rustBridgeApproveDataUseCase$callRustApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustBridgeApproveDataUseCase$callRustApi$1.label = i - Integer.MIN_VALUE;
            } else {
                rustBridgeApproveDataUseCase$callRustApi$1 = new RustBridgeApproveDataUseCase$callRustApi$1(this, continuation);
            }
        }
        java.lang.Object obj = rustBridgeApproveDataUseCase$callRustApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustBridgeApproveDataUseCase$callRustApi$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C2242AEf c2242AEfBridgeApproveData = AAL.bridgeApproveData(new C4179Azv(str, str2, str3, str5 == null ? "" : str5, str4.length() == 0 ? null : str4));
            C33077mpe c33077mpe = new C33077mpe(new RustBridgeApproveDataUseCase$callRustApi$result$1$1(c2242AEfBridgeApproveData), new RustBridgeApproveDataUseCase$callRustApi$result$1$2(c2242AEfBridgeApproveData), new RustBridgeApproveDataUseCase$callRustApi$result$1$3(c2242AEfBridgeApproveData), new RustBridgeApproveDataUseCase$callRustApi$result$1$4(c2242AEfBridgeApproveData), null, 16, null);
            rustBridgeApproveDataUseCase$callRustApi$1.L$0 = this;
            rustBridgeApproveDataUseCase$callRustApi$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(rustBridgeApproveDataUseCase$callRustApi$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            kuf = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kuf = (kUF) rustBridgeApproveDataUseCase$callRustApi$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        C4180Azw c4180Azw = (C4180Azw) objAEQbTJ;
        if (c4180Azw != null) {
            return kuf.KWHzl(c4180Azw);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation<? super ApproveUnsignedData> continuation) throws java.lang.Throwable {
        RustBridgeApproveDataUseCase$fallbackToNative$1 rustBridgeApproveDataUseCase$fallbackToNative$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof RustBridgeApproveDataUseCase$fallbackToNative$1) {
            rustBridgeApproveDataUseCase$fallbackToNative$1 = (RustBridgeApproveDataUseCase$fallbackToNative$1) continuation;
            int i = rustBridgeApproveDataUseCase$fallbackToNative$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustBridgeApproveDataUseCase$fallbackToNative$1.label = i - Integer.MIN_VALUE;
            } else {
                rustBridgeApproveDataUseCase$fallbackToNative$1 = new RustBridgeApproveDataUseCase$fallbackToNative$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = rustBridgeApproveDataUseCase$fallbackToNative$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustBridgeApproveDataUseCase$fallbackToNative$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                Result.Application application = Result.Companion;
                AbstractC58185ywX<ApproveUnsignedData> abstractC58185ywXEZpvd = this.KWHzl.EZpvd(str, str2, str3, str4, str5);
                rustBridgeApproveDataUseCase$fallbackToNative$1.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, rustBridgeApproveDataUseCase$fallbackToNative$1);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwaitFirst);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ApproveUnsignedData) objAwaitFirst);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            ApproveUnsignedData approveUnsignedData = (ApproveUnsignedData) objM7377constructorimpl;
            pUU.KWHzl("RustBridgeApproveData", "fallbackToNative success: id=" + approveUnsignedData.getId());
            return approveUnsignedData;
        }
        pUU.AEQbTJ("RustBridgeApproveData", "fallbackToNative also failed", thM7380exceptionOrNullimpl);
        return null;
    }

    public final ApproveUnsignedData KWHzl(C4180Azw c4180Azw) {
        return new ApproveUnsignedData(c4180Azw.AEQbTJ(), c4180Azw.copydefault(), c4180Azw.OLrzqt(), c4180Azw.djBIcL(), c4180Azw.gEmmrt(), c4180Azw.KWHzl(), c4180Azw.AYXKKw(), (java.lang.String) null, c4180Azw.EZpvd(), (ReminderInfo) null, (java.lang.String) null, 1664, (DefaultConstructorMarker) null);
    }
}
