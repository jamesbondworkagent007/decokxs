package com.okinc.unify_trade.module.trade;

import androidx.lifecycle.MutableLiveData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54472xJr;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes12.dex */
public final class TokenBusinessViewModel$initBiz$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C54472xJr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenBusinessViewModel$initBiz$1(C54472xJr c54472xJr, Continuation<? super TokenBusinessViewModel$initBiz$1> continuation) {
        super(2, continuation);
        this.this$0 = c54472xJr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenBusinessViewModel$initBiz$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenBusinessViewModel$initBiz$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        C54472xJr c54472xJr;
        MutableLiveData mutableLiveDataDbNXlk;
        InterfaceC54581xNr interfaceC54581xNr;
        MutableLiveData mutableLiveDataValues;
        MutableLiveData mutableLiveDataFetchVPNInfo;
        MutableLiveData mutableLiveDataAkhnZx;
        Object objEZpvd;
        MutableLiveData mutableLiveData;
        C54472xJr c54472xJr2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                this.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
                    if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
                        objM8790ensureInitialize0E7RQCE$default = null;
                    }
                    InterfaceC54581xNr interfaceC54581xNr2 = (InterfaceC54581xNr) objM8790ensureInitialize0E7RQCE$default;
                    if (interfaceC54581xNr2 != null) {
                        c54472xJr = this.this$0;
                        c54472xJr.isConnected = interfaceC54581xNr2;
                        mutableLiveDataDbNXlk = c54472xJr.DbNXlk();
                        this.L$0 = c54472xJr;
                        this.L$1 = interfaceC54581xNr2;
                        this.L$2 = mutableLiveDataDbNXlk;
                        this.label = 2;
                        Object objEZpvd2 = interfaceC54581xNr2.EZpvd("SPOT", this);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        interfaceC54581xNr = interfaceC54581xNr2;
                        obj = objEZpvd2;
                        mutableLiveDataDbNXlk.postValue(obj);
                        if (c54472xJr.DbNXlk().hasObservers()) {
                            c54472xJr.DbNXlk().removeObserver(c54472xJr.gEmmrt);
                        }
                        c54472xJr.DbNXlk().observeForever(c54472xJr.gEmmrt);
                        mutableLiveDataValues = c54472xJr.values();
                        this.L$0 = c54472xJr;
                        this.L$1 = interfaceC54581xNr;
                        this.L$2 = mutableLiveDataValues;
                        this.label = 3;
                        obj = interfaceC54581xNr.EZpvd("MARGIN", this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableLiveDataValues.postValue(obj);
                        if (c54472xJr.values().hasObservers()) {
                            c54472xJr.values().removeObserver(c54472xJr.gEmmrt);
                        }
                        c54472xJr.values().observeForever(c54472xJr.gEmmrt);
                        mutableLiveDataFetchVPNInfo = c54472xJr.fetchVPNInfo();
                        this.L$0 = c54472xJr;
                        this.L$1 = interfaceC54581xNr;
                        this.L$2 = mutableLiveDataFetchVPNInfo;
                        this.label = 4;
                        obj = interfaceC54581xNr.EZpvd("SWAP", this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableLiveDataFetchVPNInfo.postValue(obj);
                        if (c54472xJr.fetchVPNInfo().hasObservers()) {
                            c54472xJr.fetchVPNInfo().removeObserver(c54472xJr.gEmmrt);
                        }
                        c54472xJr.fetchVPNInfo().observeForever(c54472xJr.gEmmrt);
                        mutableLiveDataAkhnZx = c54472xJr.AkhnZx();
                        this.L$0 = c54472xJr;
                        this.L$1 = interfaceC54581xNr;
                        this.L$2 = mutableLiveDataAkhnZx;
                        this.label = 5;
                        obj = interfaceC54581xNr.EZpvd("FUTURES", this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableLiveDataAkhnZx.postValue(obj);
                        if (c54472xJr.AkhnZx().hasObservers()) {
                            c54472xJr.AkhnZx().removeObserver(c54472xJr.gEmmrt);
                        }
                        c54472xJr.AkhnZx().observeForever(c54472xJr.gEmmrt);
                        MutableLiveData mutableLiveDataIsConnected = c54472xJr.isConnected();
                        this.L$0 = c54472xJr;
                        this.L$1 = mutableLiveDataIsConnected;
                        this.L$2 = null;
                        this.label = 6;
                        objEZpvd = interfaceC54581xNr.EZpvd("OPTION", this);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableLiveData = mutableLiveDataIsConnected;
                        obj = objEZpvd;
                        c54472xJr2 = c54472xJr;
                        mutableLiveData.postValue(obj);
                        if (c54472xJr2.isConnected().hasObservers()) {
                            c54472xJr2.isConnected().removeObserver(c54472xJr2.gEmmrt);
                        }
                        c54472xJr2.isConnected().observeForever(c54472xJr2.gEmmrt);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
                }
                return Unit.INSTANCE;
            case 2:
                mutableLiveDataDbNXlk = (MutableLiveData) this.L$2;
                interfaceC54581xNr = (InterfaceC54581xNr) this.L$1;
                c54472xJr = (C54472xJr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveDataDbNXlk.postValue(obj);
                if (c54472xJr.DbNXlk().hasObservers()) {
                }
                c54472xJr.DbNXlk().observeForever(c54472xJr.gEmmrt);
                mutableLiveDataValues = c54472xJr.values();
                this.L$0 = c54472xJr;
                this.L$1 = interfaceC54581xNr;
                this.L$2 = mutableLiveDataValues;
                this.label = 3;
                obj = interfaceC54581xNr.EZpvd("MARGIN", this);
                if (obj == objCopydefault) {
                }
                mutableLiveDataValues.postValue(obj);
                if (c54472xJr.values().hasObservers()) {
                }
                c54472xJr.values().observeForever(c54472xJr.gEmmrt);
                mutableLiveDataFetchVPNInfo = c54472xJr.fetchVPNInfo();
                this.L$0 = c54472xJr;
                this.L$1 = interfaceC54581xNr;
                this.L$2 = mutableLiveDataFetchVPNInfo;
                this.label = 4;
                obj = interfaceC54581xNr.EZpvd("SWAP", this);
                if (obj == objCopydefault) {
                }
                mutableLiveDataFetchVPNInfo.postValue(obj);
                if (c54472xJr.fetchVPNInfo().hasObservers()) {
                }
                c54472xJr.fetchVPNInfo().observeForever(c54472xJr.gEmmrt);
                mutableLiveDataAkhnZx = c54472xJr.AkhnZx();
                this.L$0 = c54472xJr;
                this.L$1 = interfaceC54581xNr;
                this.L$2 = mutableLiveDataAkhnZx;
                this.label = 5;
                obj = interfaceC54581xNr.EZpvd("FUTURES", this);
                if (obj == objCopydefault) {
                }
                mutableLiveDataAkhnZx.postValue(obj);
                if (c54472xJr.AkhnZx().hasObservers()) {
                }
                c54472xJr.AkhnZx().observeForever(c54472xJr.gEmmrt);
                MutableLiveData mutableLiveDataIsConnected2 = c54472xJr.isConnected();
                this.L$0 = c54472xJr;
                this.L$1 = mutableLiveDataIsConnected2;
                this.L$2 = null;
                this.label = 6;
                objEZpvd = interfaceC54581xNr.EZpvd("OPTION", this);
                if (objEZpvd == objCopydefault) {
                }
                break;
            case 3:
                mutableLiveDataValues = (MutableLiveData) this.L$2;
                interfaceC54581xNr = (InterfaceC54581xNr) this.L$1;
                c54472xJr = (C54472xJr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveDataValues.postValue(obj);
                if (c54472xJr.values().hasObservers()) {
                }
                c54472xJr.values().observeForever(c54472xJr.gEmmrt);
                mutableLiveDataFetchVPNInfo = c54472xJr.fetchVPNInfo();
                this.L$0 = c54472xJr;
                this.L$1 = interfaceC54581xNr;
                this.L$2 = mutableLiveDataFetchVPNInfo;
                this.label = 4;
                obj = interfaceC54581xNr.EZpvd("SWAP", this);
                if (obj == objCopydefault) {
                }
                mutableLiveDataFetchVPNInfo.postValue(obj);
                if (c54472xJr.fetchVPNInfo().hasObservers()) {
                }
                c54472xJr.fetchVPNInfo().observeForever(c54472xJr.gEmmrt);
                mutableLiveDataAkhnZx = c54472xJr.AkhnZx();
                this.L$0 = c54472xJr;
                this.L$1 = interfaceC54581xNr;
                this.L$2 = mutableLiveDataAkhnZx;
                this.label = 5;
                obj = interfaceC54581xNr.EZpvd("FUTURES", this);
                if (obj == objCopydefault) {
                }
                mutableLiveDataAkhnZx.postValue(obj);
                if (c54472xJr.AkhnZx().hasObservers()) {
                }
                c54472xJr.AkhnZx().observeForever(c54472xJr.gEmmrt);
                MutableLiveData mutableLiveDataIsConnected22 = c54472xJr.isConnected();
                this.L$0 = c54472xJr;
                this.L$1 = mutableLiveDataIsConnected22;
                this.L$2 = null;
                this.label = 6;
                objEZpvd = interfaceC54581xNr.EZpvd("OPTION", this);
                if (objEZpvd == objCopydefault) {
                }
                break;
            case 4:
                mutableLiveDataFetchVPNInfo = (MutableLiveData) this.L$2;
                interfaceC54581xNr = (InterfaceC54581xNr) this.L$1;
                c54472xJr = (C54472xJr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveDataFetchVPNInfo.postValue(obj);
                if (c54472xJr.fetchVPNInfo().hasObservers()) {
                }
                c54472xJr.fetchVPNInfo().observeForever(c54472xJr.gEmmrt);
                mutableLiveDataAkhnZx = c54472xJr.AkhnZx();
                this.L$0 = c54472xJr;
                this.L$1 = interfaceC54581xNr;
                this.L$2 = mutableLiveDataAkhnZx;
                this.label = 5;
                obj = interfaceC54581xNr.EZpvd("FUTURES", this);
                if (obj == objCopydefault) {
                }
                mutableLiveDataAkhnZx.postValue(obj);
                if (c54472xJr.AkhnZx().hasObservers()) {
                }
                c54472xJr.AkhnZx().observeForever(c54472xJr.gEmmrt);
                MutableLiveData mutableLiveDataIsConnected222 = c54472xJr.isConnected();
                this.L$0 = c54472xJr;
                this.L$1 = mutableLiveDataIsConnected222;
                this.L$2 = null;
                this.label = 6;
                objEZpvd = interfaceC54581xNr.EZpvd("OPTION", this);
                if (objEZpvd == objCopydefault) {
                }
                break;
            case 5:
                mutableLiveDataAkhnZx = (MutableLiveData) this.L$2;
                interfaceC54581xNr = (InterfaceC54581xNr) this.L$1;
                c54472xJr = (C54472xJr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveDataAkhnZx.postValue(obj);
                if (c54472xJr.AkhnZx().hasObservers()) {
                }
                c54472xJr.AkhnZx().observeForever(c54472xJr.gEmmrt);
                MutableLiveData mutableLiveDataIsConnected2222 = c54472xJr.isConnected();
                this.L$0 = c54472xJr;
                this.L$1 = mutableLiveDataIsConnected2222;
                this.L$2 = null;
                this.label = 6;
                objEZpvd = interfaceC54581xNr.EZpvd("OPTION", this);
                if (objEZpvd == objCopydefault) {
                }
                break;
            case 6:
                mutableLiveData = (MutableLiveData) this.L$1;
                c54472xJr2 = (C54472xJr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveData.postValue(obj);
                if (c54472xJr2.isConnected().hasObservers()) {
                }
                c54472xJr2.isConnected().observeForever(c54472xJr2.gEmmrt);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
