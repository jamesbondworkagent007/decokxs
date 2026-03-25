package o;

import com.okinc.business.invest_biz.data.usecase.CheckRedeemAllowedUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.CheckRedeemAllowedUseCaseImpl$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFE implements InterfaceC23693iFv {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final iNQ AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23916iOb OLrzqt;

    @yCM
    public iFE(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iNQ inq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(inq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23916iOb;
        this.AEQbTJ = inq;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final InterfaceC9738bbJ AEQbTJ() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(this.OLrzqt.gEmmrt().copydefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23693iFv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull java.lang.String str, int i, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        CheckRedeemAllowedUseCaseImpl$invoke$1 checkRedeemAllowedUseCaseImpl$invoke$1;
        if (continuation instanceof CheckRedeemAllowedUseCaseImpl$invoke$1) {
            checkRedeemAllowedUseCaseImpl$invoke$1 = (CheckRedeemAllowedUseCaseImpl$invoke$1) continuation;
            int i2 = checkRedeemAllowedUseCaseImpl$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkRedeemAllowedUseCaseImpl$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                checkRedeemAllowedUseCaseImpl$invoke$1 = new CheckRedeemAllowedUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = checkRedeemAllowedUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = checkRedeemAllowedUseCaseImpl$invoke$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        CheckRedeemAllowedUseCaseImpl$invoke$2 checkRedeemAllowedUseCaseImpl$invoke$2 = new CheckRedeemAllowedUseCaseImpl$invoke$2(transactionConfig, i, this, str, null);
        checkRedeemAllowedUseCaseImpl$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, checkRedeemAllowedUseCaseImpl$invoke$2, checkRedeemAllowedUseCaseImpl$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
