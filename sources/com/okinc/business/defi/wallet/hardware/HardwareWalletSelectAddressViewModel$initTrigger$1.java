package com.okinc.business.defi.wallet.hardware;

import com.okinc.wallet.api.bean.AddressType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C10854bwM;
import o.C56391yDq;
import o.C56442yFn;
import o.C8322bAY;
import o.InterfaceC15373eFy;
import o.eEX;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectAddressViewModel$initTrigger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ eEX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressViewModel$initTrigger$1(eEX eex, Continuation<? super HardwareWalletSelectAddressViewModel$initTrigger$1> continuation) {
        super(2, continuation);
        this.this$0 = eex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressViewModel$initTrigger$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressViewModel$initTrigger$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        C10854bwM c10854bwM;
        eEX eex;
        Object objAEQbTJ;
        C10854bwM c10854bwM2;
        Ref.ObjectRef objectRef;
        AddressType addressType;
        Ref.ObjectRef objectRef2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC15373eFy interfaceC15373eFy = this.this$0.OLrzqt;
            long jAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            objKWHzl = interfaceC15373eFy.KWHzl(jAEQbTJ, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    pUU.OLrzqt(">>>ledger initTrigger on thread:" + Thread.currentThread() + " derivationPathSelected:" + objectRef2.element + " ");
                    return Unit.INSTANCE;
                }
                c10854bwM = (C10854bwM) this.L$2;
                eEX eex2 = (eEX) this.L$1;
                C10854bwM c10854bwM3 = (C10854bwM) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c10854bwM2 = c10854bwM3;
                eex = eex2;
                objAEQbTJ = obj;
                ArrayList arrayList = (ArrayList) objAEQbTJ;
                objectRef = new Ref.ObjectRef();
                int i2 = 0;
                if (!c10854bwM.ejfBZ()) {
                    if (arrayList.size() > 0) {
                        objectRef.element = arrayList.get(0);
                    }
                } else if (c10854bwM.fdOvFl()) {
                    if (arrayList.size() > 0) {
                        objectRef.element = arrayList.get(0);
                    }
                } else {
                    int iKWHzl = C8322bAY.KWHzl.KWHzl(c10854bwM2.fetchVPNInfo(), false);
                    AddressType[] addressTypeArrValues = AddressType.values();
                    int length = addressTypeArrValues.length;
                    while (true) {
                        if (i2 >= length) {
                            addressType = null;
                            break;
                        }
                        addressType = addressTypeArrValues[i2];
                        if (addressType.getValue() == iKWHzl) {
                            break;
                        }
                        i2++;
                    }
                    if (addressType == null) {
                        addressType = AddressType.Legacy;
                    }
                    objectRef.element = new HardwareWalletDerivationPath(0, (String) null, (String) null, addressType, 7, (DefaultConstructorMarker) null);
                }
                if (((HardwareWalletDerivationPath) objectRef.element) != null) {
                    MutableSharedFlow mutableSharedFlow = eex.copydefault;
                    T t = objectRef.element;
                    this.L$0 = objectRef;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (mutableSharedFlow.emit(t, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                objectRef2 = objectRef;
                pUU.OLrzqt(">>>ledger initTrigger on thread:" + Thread.currentThread() + " derivationPathSelected:" + objectRef2.element + " ");
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        c10854bwM = (C10854bwM) objKWHzl;
        if (c10854bwM != null) {
            eex = this.this$0;
            InterfaceC15373eFy interfaceC15373eFy2 = eex.OLrzqt;
            this.L$0 = c10854bwM;
            this.L$1 = eex;
            this.L$2 = c10854bwM;
            this.label = 2;
            objAEQbTJ = interfaceC15373eFy2.AEQbTJ(c10854bwM, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c10854bwM2 = c10854bwM;
            ArrayList arrayList2 = (ArrayList) objAEQbTJ;
            objectRef = new Ref.ObjectRef();
            int i22 = 0;
            if (!c10854bwM.ejfBZ()) {
            }
            if (((HardwareWalletDerivationPath) objectRef.element) != null) {
            }
            objectRef2 = objectRef;
            pUU.OLrzqt(">>>ledger initTrigger on thread:" + Thread.currentThread() + " derivationPathSelected:" + objectRef2.element + " ");
        }
        return Unit.INSTANCE;
    }
}
