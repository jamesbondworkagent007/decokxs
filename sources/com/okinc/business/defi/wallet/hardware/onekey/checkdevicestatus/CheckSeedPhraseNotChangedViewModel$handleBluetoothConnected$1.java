package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C15406eHd;
import o.C15438eIi;
import o.C15443eIn;
import o.C15448eIs;
import o.C15450eIu;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckSeedPhraseNotChangedViewModel$handleBluetoothConnected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CheckSeedPhraseNotChangedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckSeedPhraseNotChangedViewModel$handleBluetoothConnected$1(CheckSeedPhraseNotChangedViewModel checkSeedPhraseNotChangedViewModel, Continuation<? super CheckSeedPhraseNotChangedViewModel$handleBluetoothConnected$1> continuation) {
        super(2, continuation);
        this.this$0 = checkSeedPhraseNotChangedViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckSeedPhraseNotChangedViewModel$handleBluetoothConnected$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CheckSeedPhraseNotChangedViewModel$handleBluetoothConnected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[Catch: all -> 0x003b, CancellationException -> 0x00d3, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00d3, all -> 0x003b, blocks: (B:7:0x001e, B:28:0x00a3, B:30:0x00b3, B:20:0x0060, B:24:0x007e, B:31:0x00b9, B:12:0x0037), top: B:40:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: all -> 0x003b, CancellationException -> 0x00d3, TryCatch #2 {CancellationException -> 0x00d3, all -> 0x003b, blocks: (B:7:0x001e, B:28:0x00a3, B:30:0x00b3, B:20:0x0060, B:24:0x007e, B:31:0x00b9, B:12:0x0037), top: B:40:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[Catch: all -> 0x003b, CancellationException -> 0x00d3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d3, all -> 0x003b, blocks: (B:7:0x001e, B:28:0x00a3, B:30:0x00b3, B:20:0x0060, B:24:0x007e, B:31:0x00b9, B:12:0x0037), top: B:40:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:34:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a0 -> B:28:0x00a3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        MutableStateFlow mutableStateFlow;
        CheckSeedPhraseNotChangedViewModel checkSeedPhraseNotChangedViewModel;
        Object value;
        int i;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("CheckSeedPhraseNotChangedViewModel", "handleBluetoothConnected: ", th);
            objEZpvd = C15406eHd.EZpvd(th);
            if (mutableStateFlow.compareAndSet(value, objEZpvd)) {
            }
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutableStateFlow = this.this$0.AhwBna;
            checkSeedPhraseNotChangedViewModel = this.this$0;
            value = mutableStateFlow.getValue();
            if (checkSeedPhraseNotChangedViewModel.gEmmrt != null) {
            }
        } else if (i2 == 1) {
            i = this.I$0;
            value = this.L$2;
            checkSeedPhraseNotChangedViewModel = (CheckSeedPhraseNotChangedViewModel) this.L$1;
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C15448eIs c15448eIs = (C15448eIs) obj;
            String strKWHzl = c15448eIs.KWHzl();
            String strCopydefault = c15448eIs.copydefault();
            checkSeedPhraseNotChangedViewModel.AEQbTJ = strKWHzl;
            C15438eIi c15438eIi = checkSeedPhraseNotChangedViewModel.copydefault;
            this.L$0 = mutableStateFlow;
            this.L$1 = checkSeedPhraseNotChangedViewModel;
            this.L$2 = value;
            this.L$3 = strCopydefault;
            this.label = 2;
            objAEQbTJ = c15438eIi.AEQbTJ(strKWHzl, i, this);
            if (objAEQbTJ != objCopydefault) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) this.L$3;
            value = this.L$2;
            checkSeedPhraseNotChangedViewModel = (CheckSeedPhraseNotChangedViewModel) this.L$1;
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C15450eIu c15450eIu = (C15450eIu) obj;
            OneKeyConnectedDevice oneKeyConnectedDeviceCopydefault = c15450eIu.copydefault();
            if (!C59449zhJ.gEmmrt(str, c15450eIu.KWHzl(), true)) {
                objEZpvd = new OneKeyConnectEvent.Activity(oneKeyConnectedDeviceCopydefault);
            } else {
                pUU.copydefault("CheckSeedPhraseNotChangedViewModel", "handleBluetoothConnected: address not matched");
                objEZpvd = OneKeyConnectEvent.ShowNotification.AddressNotMatched;
            }
            if (mutableStateFlow.compareAndSet(value, objEZpvd)) {
                return Unit.INSTANCE;
            }
            value = mutableStateFlow.getValue();
            if (checkSeedPhraseNotChangedViewModel.gEmmrt != null) {
                pUU.copydefault("CheckSeedPhraseNotChangedViewModel", "handleBluetoothConnected: rootWalletId is null");
                objEZpvd = OneKeyConnectEvent.ShowNotification.GeneralError;
                if (mutableStateFlow.compareAndSet(value, objEZpvd)) {
                }
                value = mutableStateFlow.getValue();
                if (checkSeedPhraseNotChangedViewModel.gEmmrt != null) {
                    C15443eIn c15443eIn = checkSeedPhraseNotChangedViewModel.KWHzl;
                    String str2 = checkSeedPhraseNotChangedViewModel.gEmmrt;
                    this.L$0 = mutableStateFlow;
                    this.L$1 = checkSeedPhraseNotChangedViewModel;
                    this.L$2 = value;
                    this.L$3 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = c15443eIn.copydefault(str2, 0, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    i = 0;
                    C15448eIs c15448eIs2 = (C15448eIs) obj;
                    String strKWHzl2 = c15448eIs2.KWHzl();
                    String strCopydefault2 = c15448eIs2.copydefault();
                    checkSeedPhraseNotChangedViewModel.AEQbTJ = strKWHzl2;
                    C15438eIi c15438eIi2 = checkSeedPhraseNotChangedViewModel.copydefault;
                    this.L$0 = mutableStateFlow;
                    this.L$1 = checkSeedPhraseNotChangedViewModel;
                    this.L$2 = value;
                    this.L$3 = strCopydefault2;
                    this.label = 2;
                    objAEQbTJ = c15438eIi2.AEQbTJ(strKWHzl2, i, this);
                    if (objAEQbTJ != objCopydefault) {
                        return objCopydefault;
                    }
                    str = strCopydefault2;
                    obj = objAEQbTJ;
                    C15450eIu c15450eIu2 = (C15450eIu) obj;
                    OneKeyConnectedDevice oneKeyConnectedDeviceCopydefault2 = c15450eIu2.copydefault();
                    if (!C59449zhJ.gEmmrt(str, c15450eIu2.KWHzl(), true)) {
                    }
                    if (mutableStateFlow.compareAndSet(value, objEZpvd)) {
                    }
                    value = mutableStateFlow.getValue();
                    if (checkSeedPhraseNotChangedViewModel.gEmmrt != null) {
                    }
                }
            }
        }
    }
}
