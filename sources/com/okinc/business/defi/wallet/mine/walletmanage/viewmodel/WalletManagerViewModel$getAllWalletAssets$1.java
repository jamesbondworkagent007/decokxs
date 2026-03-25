package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.C10546bqW;
import o.C13912dbY;
import o.C14090der;
import o.C17413fEk;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9735bbG;
import o.fDL;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManagerViewModel$getAllWalletAssets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needRefresh;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C17413fEk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManagerViewModel$getAllWalletAssets$1(C17413fEk c17413fEk, boolean z, Continuation<? super WalletManagerViewModel$getAllWalletAssets$1> continuation) {
        super(2, continuation);
        this.this$0 = c17413fEk;
        this.$needRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManagerViewModel$getAllWalletAssets$1(this.this$0, this.$needRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletManagerViewModel$getAllWalletAssets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: all -> 0x01a6, CancellationException -> 0x01d8, TryCatch #2 {CancellationException -> 0x01d8, all -> 0x01a6, blocks: (B:9:0x0027, B:48:0x00ea, B:49:0x00f7, B:51:0x00fd, B:53:0x010b, B:55:0x0127, B:57:0x012f, B:58:0x013c, B:60:0x0142, B:62:0x0151, B:64:0x0159, B:66:0x0161, B:67:0x0165, B:68:0x016b, B:54:0x0115, B:69:0x0175, B:70:0x019f, B:14:0x0040, B:41:0x00bf, B:44:0x00c6, B:17:0x0051, B:34:0x0096, B:36:0x009e, B:37:0x00ab, B:18:0x0057, B:21:0x0063, B:23:0x006d, B:25:0x0073, B:28:0x007f, B:31:0x0087), top: B:81:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x01a6, CancellationException -> 0x01d8, TryCatch #2 {CancellationException -> 0x01d8, all -> 0x01a6, blocks: (B:9:0x0027, B:48:0x00ea, B:49:0x00f7, B:51:0x00fd, B:53:0x010b, B:55:0x0127, B:57:0x012f, B:58:0x013c, B:60:0x0142, B:62:0x0151, B:64:0x0159, B:66:0x0161, B:67:0x0165, B:68:0x016b, B:54:0x0115, B:69:0x0175, B:70:0x019f, B:14:0x0040, B:41:0x00bf, B:44:0x00c6, B:17:0x0051, B:34:0x0096, B:36:0x009e, B:37:0x00ab, B:18:0x0057, B:21:0x0063, B:23:0x006d, B:25:0x0073, B:28:0x007f, B:31:0x0087), top: B:81:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: all -> 0x01a6, CancellationException -> 0x01d8, TryCatch #2 {CancellationException -> 0x01d8, all -> 0x01a6, blocks: (B:9:0x0027, B:48:0x00ea, B:49:0x00f7, B:51:0x00fd, B:53:0x010b, B:55:0x0127, B:57:0x012f, B:58:0x013c, B:60:0x0142, B:62:0x0151, B:64:0x0159, B:66:0x0161, B:67:0x0165, B:68:0x016b, B:54:0x0115, B:69:0x0175, B:70:0x019f, B:14:0x0040, B:41:0x00bf, B:44:0x00c6, B:17:0x0051, B:34:0x0096, B:36:0x009e, B:37:0x00ab, B:18:0x0057, B:21:0x0063, B:23:0x006d, B:25:0x0073, B:28:0x007f, B:31:0x0087), top: B:81:0x000d }] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C17413fEk c17413fEk;
        Object objOLrzqt;
        List<? extends InterfaceC9735bbG> list;
        C17413fEk c17413fEk2;
        List<? extends InterfaceC9735bbG> list2;
        Object objM7386unboximpl;
        Object objCopydefault;
        C17413fEk c17413fEk3;
        MutableLiveData mutableLiveData;
        List<? extends InterfaceC9735bbG> list3;
        Ref.ObjectRef objectRef;
        Iterator<T> it;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        int size = 0;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                c17413fEk = this.this$0;
                boolean z = this.$needRefresh;
                Result.Application application = Result.Companion;
                if (C13912dbY.copydefault.fetchVPNInfo() && !c17413fEk.AhwBna()) {
                    c17413fEk.EZpvd(true);
                    this.label = 1;
                    if (c17413fEk.OLrzqt((Continuation<? super Unit>) this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else if (!c17413fEk.AhwBna()) {
                    C10546bqW c10546bqW = c17413fEk.OLrzqt;
                    this.L$0 = c17413fEk;
                    this.label = 2;
                    objOLrzqt = c10546bqW.OLrzqt(z, this);
                    if (objOLrzqt == objCopydefault2) {
                        return objCopydefault2;
                    }
                    list = (List) objOLrzqt;
                    if (!list.isEmpty()) {
                    }
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
            } else if (i == 2) {
                c17413fEk = (C17413fEk) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                list = (List) objOLrzqt;
                if (!list.isEmpty()) {
                    c17413fEk.djBIcL().setValue(C56443yFo.KWHzl(true));
                } else {
                    c17413fEk.AEQbTJ(false);
                    this.L$0 = c17413fEk;
                    this.L$1 = list;
                    this.label = 3;
                    Object objCopydefault3 = c17413fEk.copydefault(list, this);
                    if (objCopydefault3 == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c17413fEk2 = c17413fEk;
                    list2 = list;
                    objM7386unboximpl = objCopydefault3;
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = "";
                    MutableLiveData<List<fDL<Object>>> mutableLiveDataOLrzqt = c17413fEk2.OLrzqt();
                    this.L$0 = c17413fEk2;
                    this.L$1 = list2;
                    this.L$2 = objectRef2;
                    this.L$3 = mutableLiveDataOLrzqt;
                    this.label = 4;
                    objCopydefault = c17413fEk2.copydefault(list2, (Map) objM7386unboximpl, this);
                    if (objCopydefault != objCopydefault2) {
                    }
                }
            } else if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$3;
                objectRef = (Ref.ObjectRef) this.L$2;
                List<? extends InterfaceC9735bbG> list4 = (List) this.L$1;
                C17413fEk c17413fEk4 = (C17413fEk) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c17413fEk3 = c17413fEk4;
                list3 = list4;
                objCopydefault = obj;
                mutableLiveData.setValue(objCopydefault);
                Ref.IntRef intRef = new Ref.IntRef();
                it = list3.iterator();
                int size2 = 0;
                while (it.hasNext()) {
                    AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
                    if (abstractC12784ctX.fJNWhG() == WalletType.TrackingWallet) {
                        size += abstractC12784ctX.fIwbmz().size();
                    } else {
                        objectRef.element = C33129mqd.addS$default(objectRef.element, abstractC12784ctX.ejfBZ(), null, null, null, 14, null);
                    }
                    if (abstractC12784ctX.fJNWhG() == WalletType.KeyWallet) {
                        List<AbstractC12782ctV> listFIwbmz = abstractC12784ctX.fIwbmz();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listFIwbmz) {
                            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj2;
                            if (C14090der.OLrzqt.AEQbTJ(abstractC12782ctV) && abstractC12782ctV.getPostValueLengthLimit() == IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE && abstractC12782ctV.hBpjJd() == IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT) {
                                arrayList.add(obj2);
                            }
                        }
                        intRef.element = arrayList.size();
                    }
                    size2 += abstractC12784ctX.fIwbmz().size();
                }
                c17413fEk3.values().setValue(C56443yFo.AEQbTJ(size));
                c17413fEk3.DbNXlk().setValue(objectRef.element);
                c17413fEk3.copydefault(intRef.element);
                int i2 = size2 - intRef.element;
                c17413fEk3.OLrzqt(i2);
                c17413fEk3.fetchVPNInfo().setValue(C56443yFo.AEQbTJ(i2));
            } else {
                list2 = (List) this.L$1;
                c17413fEk2 = (C17413fEk) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                objectRef22.element = "";
                MutableLiveData<List<fDL<Object>>> mutableLiveDataOLrzqt2 = c17413fEk2.OLrzqt();
                this.L$0 = c17413fEk2;
                this.L$1 = list2;
                this.L$2 = objectRef22;
                this.L$3 = mutableLiveDataOLrzqt2;
                this.label = 4;
                objCopydefault = c17413fEk2.copydefault(list2, (Map) objM7386unboximpl, this);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                c17413fEk3 = c17413fEk2;
                mutableLiveData = mutableLiveDataOLrzqt2;
                list3 = list2;
                objectRef = objectRef22;
                mutableLiveData.setValue(objCopydefault);
                Ref.IntRef intRef2 = new Ref.IntRef();
                it = list3.iterator();
                int size22 = 0;
                while (it.hasNext()) {
                }
                c17413fEk3.values().setValue(C56443yFo.AEQbTJ(size));
                c17413fEk3.DbNXlk().setValue(objectRef.element);
                c17413fEk3.copydefault(intRef2.element);
                int i22 = size22 - intRef2.element;
                c17413fEk3.OLrzqt(i22);
                c17413fEk3.fetchVPNInfo().setValue(C56443yFo.AEQbTJ(i22));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C17413fEk c17413fEk5 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c17413fEk5.values, "getAllWalletAssets error message :" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
