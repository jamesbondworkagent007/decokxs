package o;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.ProjectId;
import com.okinc.business.web3pay.lib.core.model.TransactionAlertType;
import com.okinc.business.web3pay.lib.features.convert.ConvertRepositoryImpl$createConvertUop$1;
import com.okinc.business.web3pay.lib.features.convert.ConvertRepositoryImpl$getCurrencyList$1;
import com.okinc.business.web3pay.lib.features.convert.ConvertRepositoryImpl$getCurrencyPairInfo$1;
import com.okinc.business.web3pay.lib.features.convert.ConvertRepositoryImpl$getQuote$1;
import com.okinc.business.web3pay.lib.features.convert.model.CurrencyList;
import com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo;
import com.okinc.business.web3pay.lib.features.convert.model.Quote;
import com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31316lri;
import o.AbstractC31324lrq;
import o.AbstractC43419rot;
import o.InterfaceC31319lrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31315lrh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final InterfaceC31319lrl AEQbTJ;
    public final InterfaceC31347lsM KWHzl;

    /* JADX INFO: renamed from: o.lrh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:22:0x0066, B:24:0x006e, B:26:0x0074, B:27:0x0081, B:19:0x0055), top: B:41:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Result<CurrencyPairInfo>> continuation) throws java.lang.Throwable {
        ConvertRepositoryImpl$getCurrencyPairInfo$1 convertRepositoryImpl$getCurrencyPairInfo$1;
        java.lang.String str4;
        java.lang.String str5;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        java.lang.String str6 = str;
        java.lang.String str7 = str2;
        java.lang.String str8 = str3;
        if (continuation instanceof ConvertRepositoryImpl$getCurrencyPairInfo$1) {
            convertRepositoryImpl$getCurrencyPairInfo$1 = (ConvertRepositoryImpl$getCurrencyPairInfo$1) continuation;
            int i = convertRepositoryImpl$getCurrencyPairInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertRepositoryImpl$getCurrencyPairInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                convertRepositoryImpl$getCurrencyPairInfo$1 = new ConvertRepositoryImpl$getCurrencyPairInfo$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = convertRepositoryImpl$getCurrencyPairInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = convertRepositoryImpl$getCurrencyPairInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                InterfaceC31319lrl interfaceC31319lrl = this.AEQbTJ;
                convertRepositoryImpl$getCurrencyPairInfo$1.L$0 = str6;
                convertRepositoryImpl$getCurrencyPairInfo$1.L$1 = str7;
                convertRepositoryImpl$getCurrencyPairInfo$1.L$2 = str8;
                convertRepositoryImpl$getCurrencyPairInfo$1.label = 1;
                objEZpvd = interfaceC31319lrl.EZpvd(str6, str7, str8, convertRepositoryImpl$getCurrencyPairInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                th = th;
                str4 = str6;
                str5 = str8;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                java.lang.String str9 = str4;
                str8 = str5;
                str6 = str9;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (java.lang.String) convertRepositoryImpl$getCurrencyPairInfo$1.L$2;
            str7 = (java.lang.String) convertRepositoryImpl$getCurrencyPairInfo$1.L$1;
            str4 = (java.lang.String) convertRepositoryImpl$getCurrencyPairInfo$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                str8 = str5;
                str6 = str4;
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                java.lang.String str92 = str4;
                str8 = str5;
                str6 = str92;
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("ConvertRepositoryImpl", "getCurrencyPairInfo(" + str6 + ", " + str7 + ", " + str8 + ")", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull AbstractC31324lrq abstractC31324lrq, @NotNull Continuation<? super Result<CurrencyList>> continuation) throws java.lang.Throwable {
        ConvertRepositoryImpl$getCurrencyList$1 convertRepositoryImpl$getCurrencyList$1;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        AbstractC31324lrq abstractC31324lrq2 = abstractC31324lrq;
        if (continuation instanceof ConvertRepositoryImpl$getCurrencyList$1) {
            convertRepositoryImpl$getCurrencyList$1 = (ConvertRepositoryImpl$getCurrencyList$1) continuation;
            int i = convertRepositoryImpl$getCurrencyList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertRepositoryImpl$getCurrencyList$1.label = i - Integer.MIN_VALUE;
            } else {
                convertRepositoryImpl$getCurrencyList$1 = new ConvertRepositoryImpl$getCurrencyList$1(this, continuation);
            }
        }
        ConvertRepositoryImpl$getCurrencyList$1 convertRepositoryImpl$getCurrencyList$12 = convertRepositoryImpl$getCurrencyList$1;
        java.lang.Object objKWHzl = convertRepositoryImpl$getCurrencyList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = convertRepositoryImpl$getCurrencyList$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                if (Intrinsics.EZpvd(abstractC31324lrq2, AbstractC31324lrq.Application.AEQbTJ)) {
                    InterfaceC31319lrl interfaceC31319lrl = this.AEQbTJ;
                    convertRepositoryImpl$getCurrencyList$12.L$0 = abstractC31324lrq2;
                    convertRepositoryImpl$getCurrencyList$12.label = 1;
                    objKWHzl = InterfaceC31319lrl.ActionBar.getCurrencyList$default(interfaceC31319lrl, 0, null, convertRepositoryImpl$getCurrencyList$12, 2, null);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) objKWHzl;
                } else {
                    if (!(abstractC31324lrq2 instanceof AbstractC31324lrq.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC31319lrl interfaceC31319lrl2 = this.AEQbTJ;
                    java.lang.String strAEQbTJ = ((AbstractC31324lrq.StateListAnimator) abstractC31324lrq2).AEQbTJ();
                    convertRepositoryImpl$getCurrencyList$12.L$0 = abstractC31324lrq2;
                    convertRepositoryImpl$getCurrencyList$12.label = 2;
                    objKWHzl = interfaceC31319lrl2.KWHzl(1, strAEQbTJ, convertRepositoryImpl$getCurrencyList$12);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) objKWHzl;
                }
            } else if (i2 == 1) {
                abstractC31324lrq2 = (AbstractC31324lrq) convertRepositoryImpl$getCurrencyList$12.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                responseData = (ResponseData) objKWHzl;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC31324lrq2 = (AbstractC31324lrq) convertRepositoryImpl$getCurrencyList$12.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                responseData = (ResponseData) objKWHzl;
            }
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("ConvertRepositoryImpl", "getCurrencyList(" + abstractC31324lrq2 + ")", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #2 {all -> 0x00c5, blocks: (B:30:0x0079, B:32:0x0081, B:34:0x0087, B:35:0x0094, B:27:0x0066), top: B:61:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull Continuation<? super Result<Quote>> continuation) throws java.lang.Throwable {
        ConvertRepositoryImpl$getQuote$1 convertRepositoryImpl$getQuote$1;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int i2;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof ConvertRepositoryImpl$getQuote$1) {
            convertRepositoryImpl$getQuote$1 = (ConvertRepositoryImpl$getQuote$1) continuation;
            int i3 = convertRepositoryImpl$getQuote$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                convertRepositoryImpl$getQuote$1.label = i3 - Integer.MIN_VALUE;
            } else {
                convertRepositoryImpl$getQuote$1 = new ConvertRepositoryImpl$getQuote$1(this, continuation);
            }
        }
        ConvertRepositoryImpl$getQuote$1 convertRepositoryImpl$getQuote$12 = convertRepositoryImpl$getQuote$1;
        java.lang.Object objKWHzl = convertRepositoryImpl$getQuote$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = convertRepositoryImpl$getQuote$12.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            try {
                InterfaceC31319lrl interfaceC31319lrl = this.AEQbTJ;
                str4 = str;
                try {
                    convertRepositoryImpl$getQuote$12.L$0 = str4;
                    str5 = str2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str5 = str2;
                    str6 = str3;
                    i2 = i;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
                try {
                    convertRepositoryImpl$getQuote$12.L$1 = str5;
                    str6 = str3;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    str6 = str3;
                    i2 = i;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
                try {
                    convertRepositoryImpl$getQuote$12.L$2 = str6;
                    i2 = i;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    i2 = i;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
                try {
                    convertRepositoryImpl$getQuote$12.I$0 = i2;
                    convertRepositoryImpl$getQuote$12.label = 1;
                    objKWHzl = interfaceC31319lrl.KWHzl(str, str2, str3, i, convertRepositoryImpl$getQuote$12);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) objKWHzl;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                str4 = str;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = convertRepositoryImpl$getQuote$12.I$0;
            java.lang.String str7 = (java.lang.String) convertRepositoryImpl$getQuote$12.L$2;
            java.lang.String str8 = (java.lang.String) convertRepositoryImpl$getQuote$12.L$1;
            java.lang.String str9 = (java.lang.String) convertRepositoryImpl$getQuote$12.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
                i2 = i5;
                str6 = str7;
                str5 = str8;
                str4 = str9;
                responseData = (ResponseData) objKWHzl;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                i2 = i5;
                str6 = str7;
                str5 = str8;
                str4 = str9;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("ConvertRepositoryImpl", "getQuote(" + str4 + ", " + str5 + ", " + str6 + ", " + i2 + ")", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #10 {all -> 0x012d, blocks: (B:41:0x00d4, B:43:0x00dc, B:45:0x00e2, B:46:0x00f0), top: B:105:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, int i, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, @NotNull ProjectId projectId, java.lang.String str9, java.lang.String str10, @NotNull Continuation<? super AbstractC31316lri> continuation) throws java.lang.Throwable {
        ConvertRepositoryImpl$createConvertUop$1 convertRepositoryImpl$createConvertUop$1;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        GasToken gasToken2;
        GasLimit gasLimit2;
        GasPrice gasPrice2;
        GasPrice gasPrice3;
        java.lang.String str17;
        java.lang.String str18;
        GasToken gasToken3;
        InterfaceC31347lsM interfaceC31347lsM;
        CreateConvertUopRequest createConvertUopRequest;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof ConvertRepositoryImpl$createConvertUop$1) {
            convertRepositoryImpl$createConvertUop$1 = (ConvertRepositoryImpl$createConvertUop$1) continuation;
            int i2 = convertRepositoryImpl$createConvertUop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                convertRepositoryImpl$createConvertUop$1.label = i2 - Integer.MIN_VALUE;
            } else {
                convertRepositoryImpl$createConvertUop$1 = new ConvertRepositoryImpl$createConvertUop$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = convertRepositoryImpl$createConvertUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = convertRepositoryImpl$createConvertUop$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            try {
                interfaceC31347lsM = this.KWHzl;
                createConvertUopRequest = new CreateConvertUopRequest(str, projectId.getValue(), str2, str3, str4, str5, str6, str7, str8, i, gasToken, gasLimit, gasPrice, str9, str10);
                str11 = str;
                try {
                    convertRepositoryImpl$createConvertUop$1.L$0 = str11;
                    str12 = str2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str12 = str2;
                    str13 = str3;
                    str14 = str4;
                    str15 = str5;
                    str16 = str6;
                    gasToken2 = gasToken;
                    gasLimit2 = gasLimit;
                    gasPrice2 = gasPrice;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    convertRepositoryImpl$createConvertUop$1.L$1 = str12;
                    str13 = str3;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    str13 = str3;
                    str14 = str4;
                    str15 = str5;
                    str16 = str6;
                    gasToken2 = gasToken;
                    gasLimit2 = gasLimit;
                    gasPrice2 = gasPrice;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    convertRepositoryImpl$createConvertUop$1.L$2 = str13;
                    str14 = str4;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str14 = str4;
                    str15 = str5;
                    str16 = str6;
                    gasToken2 = gasToken;
                    gasLimit2 = gasLimit;
                    gasPrice2 = gasPrice;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                str11 = str;
            }
            try {
                convertRepositoryImpl$createConvertUop$1.L$3 = str14;
                str15 = str5;
                try {
                    convertRepositoryImpl$createConvertUop$1.L$4 = str15;
                    str16 = str6;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    str16 = str6;
                    gasToken2 = gasToken;
                    gasLimit2 = gasLimit;
                    gasPrice2 = gasPrice;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    convertRepositoryImpl$createConvertUop$1.L$5 = str16;
                    gasToken2 = gasToken;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    gasToken2 = gasToken;
                    gasLimit2 = gasLimit;
                    gasPrice2 = gasPrice;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    convertRepositoryImpl$createConvertUop$1.L$6 = gasToken2;
                    gasLimit2 = gasLimit;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    gasLimit2 = gasLimit;
                    gasPrice2 = gasPrice;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                str15 = str5;
                str16 = str6;
                gasToken2 = gasToken;
                gasLimit2 = gasLimit;
                gasPrice2 = gasPrice;
                gasPrice3 = gasPrice2;
                str17 = str11;
                str18 = str16;
                gasToken3 = gasToken2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            try {
                convertRepositoryImpl$createConvertUop$1.L$7 = gasLimit2;
                gasPrice2 = gasPrice;
                try {
                    convertRepositoryImpl$createConvertUop$1.L$8 = gasPrice2;
                    convertRepositoryImpl$createConvertUop$1.label = 1;
                    objKWHzl = interfaceC31347lsM.KWHzl(createConvertUopRequest, convertRepositoryImpl$createConvertUop$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    responseData = (ResponseData) objKWHzl;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    gasPrice3 = gasPrice2;
                    str17 = str11;
                    str18 = str16;
                    gasToken3 = gasToken2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                gasPrice2 = gasPrice;
                gasPrice3 = gasPrice2;
                str17 = str11;
                str18 = str16;
                gasToken3 = gasToken2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gasPrice3 = (GasPrice) convertRepositoryImpl$createConvertUop$1.L$8;
            GasLimit gasLimit3 = (GasLimit) convertRepositoryImpl$createConvertUop$1.L$7;
            gasToken3 = (GasToken) convertRepositoryImpl$createConvertUop$1.L$6;
            str18 = (java.lang.String) convertRepositoryImpl$createConvertUop$1.L$5;
            java.lang.String str19 = (java.lang.String) convertRepositoryImpl$createConvertUop$1.L$4;
            java.lang.String str20 = (java.lang.String) convertRepositoryImpl$createConvertUop$1.L$3;
            java.lang.String str21 = (java.lang.String) convertRepositoryImpl$createConvertUop$1.L$2;
            java.lang.String str22 = (java.lang.String) convertRepositoryImpl$createConvertUop$1.L$1;
            str17 = (java.lang.String) convertRepositoryImpl$createConvertUop$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
                gasLimit2 = gasLimit3;
                str15 = str19;
                str12 = str22;
                str14 = str20;
                str13 = str21;
                try {
                    responseData = (ResponseData) objKWHzl;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                gasLimit2 = gasLimit3;
                str15 = str19;
                str12 = str22;
                str14 = str20;
                str13 = str21;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) actionBar;
            pUU.KWHzl("ConvertRepositoryImpl", "createConvertUop: " + stateListAnimator.KWHzl());
            return new AbstractC31316lri.ActionBar(C31346lsL.copydefault((CreateConvertUopResponse) stateListAnimator.KWHzl()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("ConvertRepositoryImpl", "createConvertUop(" + str17 + ", " + str12 + ", " + str13 + ", " + str14 + ", " + str15 + ", " + str18 + ", " + gasToken3 + ", " + gasLimit2 + ", " + gasPrice3 + ")", (java.lang.Throwable) actionBar2.KWHzl());
        TransactionAlertType transactionAlertTypeEZpvd = TransactionAlertType.Companion.EZpvd(((OKServerException) actionBar2.KWHzl()).getCode());
        if (transactionAlertTypeEZpvd != null) {
            return new AbstractC31316lri.TaskDescription(transactionAlertTypeEZpvd);
        }
        return new AbstractC31316lri.Application((java.lang.Throwable) actionBar2.KWHzl());
    }
}
