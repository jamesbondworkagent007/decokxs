package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C18914frR;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetViewModel$loadChainIndexListInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ ArrayList<Long> $chainIndexes;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AddressProfileAssetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetViewModel$loadChainIndexListInformation$1(ArrayList<Long> arrayList, AddressProfileAssetViewModel addressProfileAssetViewModel, String str, Continuation<? super AddressProfileAssetViewModel$loadChainIndexListInformation$1> continuation) {
        super(2, continuation);
        this.$chainIndexes = arrayList;
        this.this$0 = addressProfileAssetViewModel;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetViewModel$loadChainIndexListInformation$1(this.$chainIndexes, this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetViewModel$loadChainIndexListInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[Catch: all -> 0x0050, CancellationException -> 0x0053, TryCatch #2 {CancellationException -> 0x0053, all -> 0x0050, blocks: (B:8:0x0027, B:53:0x010f, B:55:0x0126, B:11:0x003c, B:48:0x00e8, B:50:0x00ec, B:14:0x0047, B:38:0x00af, B:40:0x00b5, B:42:0x00c6, B:44:0x00cc, B:16:0x004c, B:34:0x009b, B:23:0x005e, B:31:0x0083, B:26:0x006b, B:28:0x0073, B:35:0x009f), top: B:68:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        ArrayList<Long> arrayList;
        AddressProfileAssetViewModel addressProfileAssetViewModel;
        MutableSharedFlow mutableSharedFlow;
        Object obj2;
        AddressProfileAssetViewModel addressProfileAssetViewModel2;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        AddressProfileAssetViewModel addressProfileAssetViewModel3;
        SearchAddressResponse searchAddressResponse;
        ArrayList<Long> chainIndexes;
        MutableSharedFlow mutableSharedFlow2;
        OKServerException oKServerException;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                arrayList = this.$chainIndexes;
                addressProfileAssetViewModel = this.this$0;
                String str = this.$address;
                Result.Application application2 = Result.Companion;
                if (!C33129mqd.KWHzl((Collection) arrayList)) {
                    C18914frR c18914frR = addressProfileAssetViewModel.getFieldNames;
                    this.L$0 = addressProfileAssetViewModel;
                    this.label = 3;
                    obj = c18914frR.copydefault(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    addressProfileAssetViewModel2 = addressProfileAssetViewModel;
                    abstractC43419rot = (AbstractC43419rot) obj;
                    if ((abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) && (searchAddressResponse = (SearchAddressResponse) CollectionsKt___CollectionsKt.firstOrNull((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl())) != null && (chainIndexes = searchAddressResponse.getChainIndexes()) != null) {
                        addressProfileAssetViewModel2.AEQbTJ(chainIndexes);
                        mutableSharedFlow2 = addressProfileAssetViewModel2.KWHzl;
                        this.L$0 = addressProfileAssetViewModel2;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = abstractC43419rot;
                        this.L$3 = chainIndexes;
                        this.label = 4;
                        if (mutableSharedFlow2.emit(chainIndexes, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    abstractC43419rot2 = abstractC43419rot;
                    addressProfileAssetViewModel3 = addressProfileAssetViewModel2;
                    if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                        oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl();
                        MutableSharedFlow mutableSharedFlow3 = addressProfileAssetViewModel3.KWHzl;
                        List listAhwBna = yDY.AhwBna();
                        this.L$0 = abstractC43419rot2;
                        this.L$1 = oKServerException;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        if (mutableSharedFlow3.emit(listAhwBna, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        pUU.copydefault("AddressProfileAssetViewModel", "AddressProfileAssetViewModel getSearchAddressProfile error message = " + oKServerException.getMessage());
                    }
                    obj2 = abstractC43419rot2;
                    objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                    AddressProfileAssetViewModel addressProfileAssetViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = arrayList;
                this.L$1 = addressProfileAssetViewModel;
                this.label = 1;
                if (DelayKt.delay(100L, this) == objCopydefault) {
                    return objCopydefault;
                }
                addressProfileAssetViewModel.AEQbTJ(arrayList);
                mutableSharedFlow = addressProfileAssetViewModel.KWHzl;
                Intrinsics.copydefault(arrayList);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                AddressProfileAssetViewModel addressProfileAssetViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow4 = addressProfileAssetViewModel42.KWHzl;
                    List listAhwBna2 = yDY.AhwBna();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = thM7380exceptionOrNullimpl;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 6;
                    if (mutableSharedFlow4.emit(listAhwBna2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault("AddressProfileAssetViewModel", "AddressProfileAssetViewModel getSearchAddressProfile error message = " + th.getMessage());
                }
                return Unit.INSTANCE;
            case 1:
                addressProfileAssetViewModel = (AddressProfileAssetViewModel) this.L$1;
                arrayList = (ArrayList) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressProfileAssetViewModel.AEQbTJ(arrayList);
                mutableSharedFlow = addressProfileAssetViewModel.KWHzl;
                Intrinsics.copydefault(arrayList);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(arrayList, this) == objCopydefault) {
                }
                obj2 = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                AddressProfileAssetViewModel addressProfileAssetViewModel422 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                obj2 = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                AddressProfileAssetViewModel addressProfileAssetViewModel4222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                addressProfileAssetViewModel = (AddressProfileAssetViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressProfileAssetViewModel2 = addressProfileAssetViewModel;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    addressProfileAssetViewModel2.AEQbTJ(chainIndexes);
                    mutableSharedFlow2 = addressProfileAssetViewModel2.KWHzl;
                    this.L$0 = addressProfileAssetViewModel2;
                    this.L$1 = abstractC43419rot;
                    this.L$2 = abstractC43419rot;
                    this.L$3 = chainIndexes;
                    this.label = 4;
                    if (mutableSharedFlow2.emit(chainIndexes, this) == objCopydefault) {
                    }
                }
                abstractC43419rot2 = abstractC43419rot;
                addressProfileAssetViewModel3 = addressProfileAssetViewModel2;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                obj2 = abstractC43419rot2;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                AddressProfileAssetViewModel addressProfileAssetViewModel42222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC43419rot abstractC43419rot3 = (AbstractC43419rot) this.L$1;
                AddressProfileAssetViewModel addressProfileAssetViewModel5 = (AddressProfileAssetViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressProfileAssetViewModel3 = addressProfileAssetViewModel5;
                abstractC43419rot2 = abstractC43419rot3;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                obj2 = abstractC43419rot2;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                AddressProfileAssetViewModel addressProfileAssetViewModel422222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                oKServerException = (OKServerException) this.L$1;
                abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("AddressProfileAssetViewModel", "AddressProfileAssetViewModel getSearchAddressProfile error message = " + oKServerException.getMessage());
                obj2 = abstractC43419rot2;
                objM7377constructorimpl = Result.m7377constructorimpl(obj2);
                AddressProfileAssetViewModel addressProfileAssetViewModel4222222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                th = (Throwable) this.L$1;
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("AddressProfileAssetViewModel", "AddressProfileAssetViewModel getSearchAddressProfile error message = " + th.getMessage());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
