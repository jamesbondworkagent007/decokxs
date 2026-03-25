package com.okinc.business.defi.wallet.mine.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.mine.viewmodel.DefiWalletBatchCreateAccountAnimationModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC12782ctV;
import o.AbstractC33073mpa;
import o.AbstractC56429yFa;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.InterfaceC58217yxC;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationModel extends AbstractC33073mpa {
    public int AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public int AkhnZx;
    public int DbNXlk;
    public boolean copydefault;
    public boolean fARcdN;
    public int fetchVPNInfo;
    public final String ejfBZ = DefiWalletBatchCreateAccountAnimationModel.class.getName();
    public final int OLrzqt = 10;
    public final Channel<CreateResultStatus> gEmmrt = ChannelKt.Channel$default(0, null, null, 7, null);
    public final Channel<Integer> isConnected = ChannelKt.Channel$default(0, null, null, 7, null);
    public int values = 1;
    public int fIwbmz = 1;
    public String AuCTel = "";
    public String fJNWhG = "";
    public int djBIcL = 1;
    public int iwGUEr = WalletType.HDWallet.ordinal();
    public final LinkedBlockingDeque<AbstractC12782ctV> KWHzl = new LinkedBlockingDeque<>();
    public final AtomicInteger AEQbTJ = new AtomicInteger();
    public final CoroutineExceptionHandler EZpvd = new TaskDescription(CoroutineExceptionHandler.Key, this);
    public Function1<? super AbstractC12782ctV, Unit> valueOf = new Function1() { // from class: o.fyj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefiWalletBatchCreateAccountAnimationModel.KWHzl(this.AEQbTJ, (AbstractC12782ctV) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit>, kotlin.jvm.functions.Function1<o.ctV, kotlin.Unit> */
    public final Function1<AbstractC12782ctV, Unit> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.AYXKKw = 0;
        this.copydefault = false;
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str, int i, int i2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AuCTel = str;
        this.values = i;
        this.fIwbmz = i;
        this.djBIcL = i2;
        this.iwGUEr = i3;
        this.fJNWhG = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.fetchVPNInfo;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CreateResultStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CreateResultStatus[] $VALUES;
        public static final CreateResultStatus FAILED = new CreateResultStatus(CardSyncResponse.FAILED, 0);
        public static final CreateResultStatus PART_SUCCESS = new CreateResultStatus("PART_SUCCESS", 1);
        public static final CreateResultStatus ALL_SUCCESS = new CreateResultStatus("ALL_SUCCESS", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CreateResultStatus[] $values() {
            return new CreateResultStatus[]{FAILED, PART_SUCCESS, ALL_SUCCESS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CreateResultStatus> getEntries() {
            return $ENTRIES;
        }

        private CreateResultStatus(String str, int i) {
        }

        static {
            CreateResultStatus[] createResultStatusArr$values = $values();
            $VALUES = createResultStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(createResultStatusArr$values);
        }

        public static CreateResultStatus valueOf(String str) {
            return (CreateResultStatus) Enum.valueOf(CreateResultStatus.class, str);
        }

        public static CreateResultStatus[] values() {
            return (CreateResultStatus[]) $VALUES.clone();
        }
    }

    public final Flow<CreateResultStatus> AhwBna() {
        return FlowKt.receiveAsFlow(this.gEmmrt);
    }

    public final Flow<Integer> djBIcL() {
        return FlowKt.receiveAsFlow(this.isConnected);
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel) {
            super(key);
            this.EZpvd = defiWalletBatchCreateAccountAnimationModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            pUU.AEQbTJ(this.EZpvd.ejfBZ, th);
        }
    }

    public static final Unit KWHzl(DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, AbstractC12782ctV abstractC12782ctV) {
        defiWalletBatchCreateAccountAnimationModel.copydefault(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        this.copydefault = false;
        if (this.djBIcL == 1) {
            KWHzl();
        } else {
            EZpvd();
        }
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiWalletBatchCreateAccountAnimationModel$addCountAndHandleAsync$1(this, null), 3, null);
        int i = this.AYXKKw;
        int i2 = this.OLrzqt;
        if (i % i2 == 0) {
            EZpvd(i2);
        } else if (i == this.values) {
            EZpvd(this.KWHzl.size());
        }
    }

    public final void EZpvd(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1(this, i, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(ArrayList<AbstractC12782ctV> arrayList, Continuation<? super Unit> continuation) throws Throwable {
        DefiWalletBatchCreateAccountAnimationModel$async2Server$1 defiWalletBatchCreateAccountAnimationModel$async2Server$1;
        Object objM7377constructorimpl;
        if (continuation instanceof DefiWalletBatchCreateAccountAnimationModel$async2Server$1) {
            defiWalletBatchCreateAccountAnimationModel$async2Server$1 = (DefiWalletBatchCreateAccountAnimationModel$async2Server$1) continuation;
            int i = defiWalletBatchCreateAccountAnimationModel$async2Server$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defiWalletBatchCreateAccountAnimationModel$async2Server$1.label = i - Integer.MIN_VALUE;
            } else {
                defiWalletBatchCreateAccountAnimationModel$async2Server$1 = new DefiWalletBatchCreateAccountAnimationModel$async2Server$1(this, continuation);
            }
        }
        Object obj = defiWalletBatchCreateAccountAnimationModel$async2Server$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = defiWalletBatchCreateAccountAnimationModel$async2Server$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                this.AEQbTJ.incrementAndGet();
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1 defiWalletBatchCreateAccountAnimationModel$async2Server$2$1 = new DefiWalletBatchCreateAccountAnimationModel$async2Server$2$1(arrayList, this, null);
                defiWalletBatchCreateAccountAnimationModel$async2Server$1.label = 1;
                if (BuildersKt.withContext(io2, defiWalletBatchCreateAccountAnimationModel$async2Server$2$1, defiWalletBatchCreateAccountAnimationModel$async2Server$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        if (this.KWHzl.isEmpty() && this.AEQbTJ.get() == 0 && this.AYXKKw == this.values && !this.fARcdN) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiWalletBatchCreateAccountAnimationModel$judgeShowCompleteResult$1(this, null), 3, null);
        }
    }

    public final void isConnected() {
        this.copydefault = true;
        fARcdN();
        fetchVPNInfo();
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiWalletBatchCreateAccountAnimationModel$judgeCreateResultStatus$1(this, null), 3, null);
    }

    public final void KWHzl() {
        this.AYXKKw++;
        this.AkhnZx++;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new DefiWalletBatchCreateAccountAnimationModel$createNormalAccount$1(this, null), 2, null);
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            this.AYXKKw--;
            this.AkhnZx--;
            fARcdN();
            return;
        }
        this.KWHzl.add(abstractC12782ctV);
        copydefault();
        if (this.AYXKKw >= this.values || this.copydefault) {
            if ((!this.KWHzl.isEmpty()) && this.copydefault) {
                fetchVPNInfo();
                return;
            }
            return;
        }
        if (this.djBIcL == 1) {
            KWHzl();
        } else {
            EZpvd();
        }
    }

    public final void EZpvd() {
        this.AYXKKw++;
        this.AkhnZx++;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new DefiWalletBatchCreateAccountAnimationModel$createSmartAccount$1(this, null), 2, null);
    }

    public final void fetchVPNInfo() {
        pUU.copydefault(this.ejfBZ, "handleSyncLastData size = " + this.KWHzl.size());
        EZpvd(this.KWHzl.size());
        AuCTel();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void AuCTel() {
        C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).bO_();
    }
}
