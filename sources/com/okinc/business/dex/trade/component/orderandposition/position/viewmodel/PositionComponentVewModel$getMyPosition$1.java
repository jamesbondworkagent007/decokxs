package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28182kRy;
import o.C30765lhN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gQS;
import o.kKG;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionComponentVewModel$getMyPosition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoading;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PositionComponentVewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionComponentVewModel$getMyPosition$1(boolean z, PositionComponentVewModel positionComponentVewModel, Continuation<? super PositionComponentVewModel$getMyPosition$1> continuation) {
        super(2, continuation);
        this.$isLoading = z;
        this.this$0 = positionComponentVewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionComponentVewModel$getMyPosition$1(this.$isLoading, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionComponentVewModel$getMyPosition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C28182kRy c28182kRy;
        String str;
        C28182kRy c28182kRy2;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isLoading) {
                this.this$0.EZpvd.setValue(gQS.ActionBar.copydefault);
            }
            C28182kRy c28182kRy3 = this.this$0.gEmmrt;
            kKG kkg = this.this$0.ejfBZ;
            this.L$0 = c28182kRy3;
            this.label = 1;
            Object objCopydefault2 = kkg.copydefault(this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c28182kRy = c28182kRy3;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    String str2 = (String) this.L$1;
                    C28182kRy c28182kRy4 = (C28182kRy) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = str2;
                    c28182kRy2 = c28182kRy4;
                    String str3 = (String) obj;
                    String strFetchVPNInfo = this.this$0.fetchVPNInfo();
                    List<DexMultiTokenInfoBean> list = !this.this$0.AYXKKw ? this.this$0.djBIcL : null;
                    AdvancedAssetsFilter advancedAssetsFilterEZpvd = this.this$0.EZpvd();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objAEQbTJ = c28182kRy2.AEQbTJ(str, str3, strFetchVPNInfo, list, advancedAssetsFilterEZpvd, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    PositionComponentVewModel positionComponentVewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    }
                    PositionComponentVewModel positionComponentVewModel2 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                PositionComponentVewModel positionComponentVewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    List listAEQbTJ = positionComponentVewModel3.AEQbTJ((List<C30765lhN>) positionComponentVewModel3.copydefault.OLrzqt((List) objAEQbTJ));
                    positionComponentVewModel3.EZpvd.setValue(new gQS.Application(listAEQbTJ));
                    MutableStateFlow mutableStateFlow = positionComponentVewModel3.AEQbTJ;
                    if ((listAEQbTJ instanceof Collection) && listAEQbTJ.isEmpty()) {
                        z = false;
                        mutableStateFlow.setValue(C56443yFo.KWHzl(z));
                    } else {
                        Iterator it = listAEQbTJ.iterator();
                        while (it.hasNext()) {
                            if (((C30765lhN) it.next()).isConnected()) {
                                break;
                            }
                        }
                        z = false;
                        mutableStateFlow.setValue(C56443yFo.KWHzl(z));
                    }
                }
                PositionComponentVewModel positionComponentVewModel22 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    positionComponentVewModel22.EZpvd.setValue(gQS.TaskDescription.EZpvd);
                    positionComponentVewModel22.AEQbTJ.setValue(C56443yFo.KWHzl(false));
                }
                return Unit.INSTANCE;
            }
            c28182kRy = (C28182kRy) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str4 = (String) obj;
        kKG kkg2 = this.this$0.ejfBZ;
        this.L$0 = c28182kRy;
        this.L$1 = str4;
        this.label = 2;
        Object objAEQbTJ2 = kkg2.AEQbTJ(this);
        if (objAEQbTJ2 == objCopydefault) {
            return objCopydefault;
        }
        str = str4;
        c28182kRy2 = c28182kRy;
        obj = objAEQbTJ2;
        String str32 = (String) obj;
        String strFetchVPNInfo2 = this.this$0.fetchVPNInfo();
        if (!this.this$0.AYXKKw) {
        }
        AdvancedAssetsFilter advancedAssetsFilterEZpvd2 = this.this$0.EZpvd();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        objAEQbTJ = c28182kRy2.AEQbTJ(str, str32, strFetchVPNInfo2, list, advancedAssetsFilterEZpvd2, this);
        if (objAEQbTJ == objCopydefault) {
        }
        PositionComponentVewModel positionComponentVewModel32 = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
        }
        PositionComponentVewModel positionComponentVewModel222 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
        }
        return Unit.INSTANCE;
    }
}
