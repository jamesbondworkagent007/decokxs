package com.okinc.business.trade.features.home.autoconfirm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.QuotaInfoBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C19700gMb;
import o.C56391yDq;
import o.C56442yFn;
import o.kTU;
import o.kTW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoConfirmViewModel extends ViewModel {
    public QuotaInfoBean AEQbTJ;
    public final MutableStateFlow<kTU> EZpvd;
    public AutoConfirmEntryType KWHzl;
    public final kTW OLrzqt;
    public final C19700gMb copydefault;
    public final StateFlow<kTU> gEmmrt;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AutoConfirmEntryType.values().length];
            try {
                iArr[AutoConfirmEntryType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoConfirmEntryType.STRATEGY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<kTU> KWHzl() {
        return this.gEmmrt;
    }

    @yCM
    public AutoConfirmViewModel(@NotNull kTW ktw, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(ktw, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.OLrzqt = ktw;
        this.copydefault = c19700gMb;
        MutableStateFlow<kTU> MutableStateFlow = StateFlowKt.MutableStateFlow(kTU.ActionBar.copydefault);
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = MutableStateFlow;
        this.KWHzl = AutoConfirmEntryType.MARKET;
    }

    public final void KWHzl(@NotNull AutoConfirmEntryType autoConfirmEntryType) {
        Intrinsics.checkNotNullParameter(autoConfirmEntryType, "");
        this.KWHzl = autoConfirmEntryType;
        OLrzqt();
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AutoConfirmViewModel$computeViewState$1(this, null), 3, null);
    }

    public final boolean copydefault() {
        return this.copydefault.djBIcL();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Unit> continuation) throws Throwable {
        AutoConfirmViewModel$fetchQuotaInfo$1 autoConfirmViewModel$fetchQuotaInfo$1;
        AutoConfirmViewModel autoConfirmViewModel;
        QuotaInfoBean quotaInfoBean;
        if (continuation instanceof AutoConfirmViewModel$fetchQuotaInfo$1) {
            autoConfirmViewModel$fetchQuotaInfo$1 = (AutoConfirmViewModel$fetchQuotaInfo$1) continuation;
            int i = autoConfirmViewModel$fetchQuotaInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                autoConfirmViewModel$fetchQuotaInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                autoConfirmViewModel$fetchQuotaInfo$1 = new AutoConfirmViewModel$fetchQuotaInfo$1(this, continuation);
            }
        }
        Object objEZpvd = autoConfirmViewModel$fetchQuotaInfo$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = autoConfirmViewModel$fetchQuotaInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (this.AEQbTJ != null) {
                return Unit.INSTANCE;
            }
            int i3 = Application.KWHzl[this.KWHzl.ordinal()];
            if (i3 == 1) {
                kTW ktw = this.OLrzqt;
                autoConfirmViewModel$fetchQuotaInfo$1.L$0 = this;
                autoConfirmViewModel$fetchQuotaInfo$1.label = 1;
                objEZpvd = ktw.EZpvd(autoConfirmViewModel$fetchQuotaInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                autoConfirmViewModel = this;
                quotaInfoBean = (QuotaInfoBean) objEZpvd;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kTW ktw2 = this.OLrzqt;
                autoConfirmViewModel$fetchQuotaInfo$1.L$0 = this;
                autoConfirmViewModel$fetchQuotaInfo$1.label = 2;
                objEZpvd = ktw2.copydefault(autoConfirmViewModel$fetchQuotaInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                autoConfirmViewModel = this;
                quotaInfoBean = (QuotaInfoBean) objEZpvd;
            }
        } else if (i2 == 1) {
            autoConfirmViewModel = (AutoConfirmViewModel) autoConfirmViewModel$fetchQuotaInfo$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            quotaInfoBean = (QuotaInfoBean) objEZpvd;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoConfirmViewModel = (AutoConfirmViewModel) autoConfirmViewModel$fetchQuotaInfo$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            quotaInfoBean = (QuotaInfoBean) objEZpvd;
        }
        autoConfirmViewModel.AEQbTJ = quotaInfoBean;
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AutoConfirmViewModel$onActionButtonClicked$1(this, null), 3, null);
    }
}
