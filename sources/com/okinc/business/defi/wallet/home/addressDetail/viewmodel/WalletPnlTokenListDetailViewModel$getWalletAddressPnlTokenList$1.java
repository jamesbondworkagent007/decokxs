package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C15835eXa;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.eYV;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlTokenListDetailViewModel$getWalletAddressPnlTokenList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Long $chainIndex;
    final /* synthetic */ boolean $isAsc;
    final /* synthetic */ int $limit;
    final /* synthetic */ boolean $loadMore;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $sortType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ WalletPnlTokenListDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlTokenListDetailViewModel$getWalletAddressPnlTokenList$1(WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel, String str, Long l, int i, boolean z, int i2, int i3, boolean z2, Continuation<? super WalletPnlTokenListDetailViewModel$getWalletAddressPnlTokenList$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPnlTokenListDetailViewModel;
        this.$address = str;
        this.$chainIndex = l;
        this.$sortType = i;
        this.$isAsc = z;
        this.$offset = i2;
        this.$limit = i3;
        this.$loadMore = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlTokenListDetailViewModel$getWalletAddressPnlTokenList$1(this.this$0, this.$address, this.$chainIndex, this.$sortType, this.$isAsc, this.$offset, this.$limit, this.$loadMore, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPnlTokenListDetailViewModel$getWalletAddressPnlTokenList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[Catch: all -> 0x020c, CancellationException -> 0x0273, TryCatch #2 {CancellationException -> 0x0273, all -> 0x020c, blocks: (B:8:0x0027, B:76:0x01f1, B:77:0x0207, B:11:0x003e, B:65:0x01b5, B:67:0x01b9, B:69:0x01c4, B:72:0x01da, B:14:0x005d, B:42:0x0129, B:44:0x0133, B:45:0x0140, B:47:0x0146, B:49:0x0155, B:52:0x016d, B:54:0x0177, B:55:0x0184, B:57:0x018a, B:59:0x0199, B:17:0x007e, B:35:0x00fb, B:37:0x0101, B:20:0x0089, B:27:0x00be, B:29:0x00c5, B:31:0x00d4, B:23:0x00a1), top: B:96:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101 A[Catch: all -> 0x020c, CancellationException -> 0x0273, TryCatch #2 {CancellationException -> 0x0273, all -> 0x020c, blocks: (B:8:0x0027, B:76:0x01f1, B:77:0x0207, B:11:0x003e, B:65:0x01b5, B:67:0x01b9, B:69:0x01c4, B:72:0x01da, B:14:0x005d, B:42:0x0129, B:44:0x0133, B:45:0x0140, B:47:0x0146, B:49:0x0155, B:52:0x016d, B:54:0x0177, B:55:0x0184, B:57:0x018a, B:59:0x0199, B:17:0x007e, B:35:0x00fb, B:37:0x0101, B:20:0x0089, B:27:0x00be, B:29:0x00c5, B:31:0x00d4, B:23:0x00a1), top: B:96:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129 A[Catch: all -> 0x020c, CancellationException -> 0x0273, TryCatch #2 {CancellationException -> 0x0273, all -> 0x020c, blocks: (B:8:0x0027, B:76:0x01f1, B:77:0x0207, B:11:0x003e, B:65:0x01b5, B:67:0x01b9, B:69:0x01c4, B:72:0x01da, B:14:0x005d, B:42:0x0129, B:44:0x0133, B:45:0x0140, B:47:0x0146, B:49:0x0155, B:52:0x016d, B:54:0x0177, B:55:0x0184, B:57:0x018a, B:59:0x0199, B:17:0x007e, B:35:0x00fb, B:37:0x0101, B:20:0x0089, B:27:0x00be, B:29:0x00c5, B:31:0x00d4, B:23:0x00a1), top: B:96:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d A[Catch: all -> 0x020c, CancellationException -> 0x0273, TryCatch #2 {CancellationException -> 0x0273, all -> 0x020c, blocks: (B:8:0x0027, B:76:0x01f1, B:77:0x0207, B:11:0x003e, B:65:0x01b5, B:67:0x01b9, B:69:0x01c4, B:72:0x01da, B:14:0x005d, B:42:0x0129, B:44:0x0133, B:45:0x0140, B:47:0x0146, B:49:0x0155, B:52:0x016d, B:54:0x0177, B:55:0x0184, B:57:0x018a, B:59:0x0199, B:17:0x007e, B:35:0x00fb, B:37:0x0101, B:20:0x0089, B:27:0x00be, B:29:0x00c5, B:31:0x00d4, B:23:0x00a1), top: B:96:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9 A[Catch: all -> 0x020c, CancellationException -> 0x0273, TryCatch #2 {CancellationException -> 0x0273, all -> 0x020c, blocks: (B:8:0x0027, B:76:0x01f1, B:77:0x0207, B:11:0x003e, B:65:0x01b5, B:67:0x01b9, B:69:0x01c4, B:72:0x01da, B:14:0x005d, B:42:0x0129, B:44:0x0133, B:45:0x0140, B:47:0x0146, B:49:0x0155, B:52:0x016d, B:54:0x0177, B:55:0x0184, B:57:0x018a, B:59:0x0199, B:17:0x007e, B:35:0x00fb, B:37:0x0101, B:20:0x0089, B:27:0x00be, B:29:0x00c5, B:31:0x00d4, B:23:0x00a1), top: B:96:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        boolean z;
        WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        WalletPnlTokenListResponse walletPnlTokenListResponse;
        WalletPnlTokenListResponse walletPnlTokenListResponse2;
        AbstractC43419rot abstractC43419rot3;
        Boolean hasNext;
        WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel2;
        ArrayList arrayList;
        ArrayList arrayList2;
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
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel3 = this.this$0;
                String str = this.$address;
                Long l = this.$chainIndex;
                int i = this.$sortType;
                boolean z2 = this.$isAsc;
                int i2 = this.$offset;
                int i3 = this.$limit;
                z = this.$loadMore;
                Result.Application application2 = Result.Companion;
                C15835eXa c15835eXa = walletPnlTokenListDetailViewModel3.djBIcL;
                boolean zKWHzl = eYV.Companion.KWHzl();
                this.L$0 = walletPnlTokenListDetailViewModel3;
                this.Z$0 = z;
                this.label = 1;
                Object objAEQbTJ = c15835eXa.AEQbTJ(str, l, i, z2, i2, i3, zKWHzl, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                walletPnlTokenListDetailViewModel = walletPnlTokenListDetailViewModel3;
                obj = objAEQbTJ;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    WalletPnlTokenListResponse walletPnlTokenListResponse3 = (WalletPnlTokenListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    Integer offset = walletPnlTokenListResponse3.getOffset();
                    if (offset != null) {
                        int iIntValue = offset.intValue();
                        MutableSharedFlow mutableSharedFlow = walletPnlTokenListDetailViewModel.copydefault;
                        Integer numAEQbTJ = C56443yFo.AEQbTJ(iIntValue);
                        this.L$0 = walletPnlTokenListDetailViewModel;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = abstractC43419rot;
                        this.L$3 = walletPnlTokenListResponse3;
                        this.L$4 = walletPnlTokenListResponse3;
                        this.L$5 = offset;
                        this.Z$0 = z;
                        this.label = 2;
                        if (mutableSharedFlow.emit(numAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    walletPnlTokenListResponse = walletPnlTokenListResponse3;
                    walletPnlTokenListResponse2 = walletPnlTokenListResponse;
                    abstractC43419rot3 = abstractC43419rot;
                    hasNext = walletPnlTokenListResponse.getHasNext();
                    if (hasNext != null) {
                        boolean zBooleanValue = hasNext.booleanValue();
                        MutableSharedFlow mutableSharedFlow2 = walletPnlTokenListDetailViewModel.KWHzl;
                        Boolean boolKWHzl = C56443yFo.KWHzl(zBooleanValue);
                        this.L$0 = walletPnlTokenListDetailViewModel;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = abstractC43419rot3;
                        this.L$3 = walletPnlTokenListResponse2;
                        this.L$4 = walletPnlTokenListResponse;
                        this.L$5 = hasNext;
                        this.Z$0 = z;
                        this.label = 3;
                        if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    WalletPnlTokenListResponse walletPnlTokenListResponse4 = walletPnlTokenListResponse2;
                    walletPnlTokenListDetailViewModel2 = walletPnlTokenListDetailViewModel;
                    if (z) {
                        MutableSharedFlow mutableSharedFlow3 = walletPnlTokenListDetailViewModel2.EZpvd;
                        List<WalletPnlTokenBean> tokenList = walletPnlTokenListResponse.getTokenList();
                        if (tokenList != null) {
                            arrayList2 = new ArrayList(C56403yEb.AYXKKw(tokenList, 10));
                            Iterator<T> it = tokenList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(walletPnlTokenListDetailViewModel2.EZpvd((WalletPnlTokenBean) it.next()));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        this.L$0 = walletPnlTokenListDetailViewModel2;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = abstractC43419rot3;
                        this.L$3 = walletPnlTokenListResponse4;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.Z$0 = z;
                        this.label = 4;
                        if (mutableSharedFlow3.emit(arrayList2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow4 = walletPnlTokenListDetailViewModel2.OLrzqt;
                        List<WalletPnlTokenBean> tokenList2 = walletPnlTokenListResponse.getTokenList();
                        if (tokenList2 != null) {
                            arrayList = new ArrayList(C56403yEb.AYXKKw(tokenList2, 10));
                            Iterator<T> it2 = tokenList2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(walletPnlTokenListDetailViewModel2.EZpvd((WalletPnlTokenBean) it2.next()));
                            }
                        } else {
                            arrayList = null;
                        }
                        this.L$0 = walletPnlTokenListDetailViewModel2;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = abstractC43419rot3;
                        this.L$3 = walletPnlTokenListResponse4;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.Z$0 = z;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(arrayList, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    abstractC43419rot2 = abstractC43419rot;
                    walletPnlTokenListDetailViewModel = walletPnlTokenListDetailViewModel2;
                    if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                        OKServerException oKServerException2 = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl();
                        if (z) {
                            MutableSharedFlow mutableSharedFlow5 = walletPnlTokenListDetailViewModel.EZpvd;
                            this.L$0 = abstractC43419rot2;
                            this.L$1 = oKServerException2;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 6;
                            if (mutableSharedFlow5.emit(null, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow6 = walletPnlTokenListDetailViewModel.OLrzqt;
                            this.L$0 = abstractC43419rot2;
                            this.L$1 = oKServerException2;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 7;
                            if (mutableSharedFlow6.emit(null, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        oKServerException = oKServerException2;
                        pUU.copydefault("WalletPnlTokenListDetailViewModel", "WalletPnlTokenListDetailViewModel getWalletAddressPnlTokenList error message = " + oKServerException.getMessage());
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot2);
                    boolean z3 = this.$loadMore;
                    WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        if (z3) {
                            MutableSharedFlow mutableSharedFlow7 = walletPnlTokenListDetailViewModel4.EZpvd;
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = thM7380exceptionOrNullimpl;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 8;
                            if (mutableSharedFlow7.emit(null, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow8 = walletPnlTokenListDetailViewModel4.OLrzqt;
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = thM7380exceptionOrNullimpl;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 9;
                            if (mutableSharedFlow8.emit(null, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        th = thM7380exceptionOrNullimpl;
                        pUU.copydefault("WalletPnlTokenListDetailViewModel", "WalletPnlTokenListDetailViewModel getWalletAddressPnlTokenList error message = " + th.getMessage());
                    }
                    return Unit.INSTANCE;
                }
                abstractC43419rot2 = abstractC43419rot;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot2);
                boolean z32 = this.$loadMore;
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                z = this.Z$0;
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel5 = (WalletPnlTokenListDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletPnlTokenListDetailViewModel = walletPnlTokenListDetailViewModel5;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                }
                break;
            case 2:
                z = this.Z$0;
                walletPnlTokenListResponse = (WalletPnlTokenListResponse) this.L$4;
                walletPnlTokenListResponse2 = (WalletPnlTokenListResponse) this.L$3;
                abstractC43419rot3 = (AbstractC43419rot) this.L$2;
                abstractC43419rot = (AbstractC43419rot) this.L$1;
                walletPnlTokenListDetailViewModel = (WalletPnlTokenListDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                hasNext = walletPnlTokenListResponse.getHasNext();
                if (hasNext != null) {
                }
                WalletPnlTokenListResponse walletPnlTokenListResponse42 = walletPnlTokenListResponse2;
                walletPnlTokenListDetailViewModel2 = walletPnlTokenListDetailViewModel;
                if (z) {
                }
                abstractC43419rot2 = abstractC43419rot;
                walletPnlTokenListDetailViewModel = walletPnlTokenListDetailViewModel2;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot2);
                boolean z322 = this.$loadMore;
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel422 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                z = this.Z$0;
                walletPnlTokenListResponse = (WalletPnlTokenListResponse) this.L$4;
                walletPnlTokenListResponse2 = (WalletPnlTokenListResponse) this.L$3;
                abstractC43419rot3 = (AbstractC43419rot) this.L$2;
                abstractC43419rot = (AbstractC43419rot) this.L$1;
                walletPnlTokenListDetailViewModel = (WalletPnlTokenListDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                WalletPnlTokenListResponse walletPnlTokenListResponse422 = walletPnlTokenListResponse2;
                walletPnlTokenListDetailViewModel2 = walletPnlTokenListDetailViewModel;
                if (z) {
                }
                abstractC43419rot2 = abstractC43419rot;
                walletPnlTokenListDetailViewModel = walletPnlTokenListDetailViewModel2;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot2);
                boolean z3222 = this.$loadMore;
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel4222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                z = this.Z$0;
                abstractC43419rot2 = (AbstractC43419rot) this.L$1;
                walletPnlTokenListDetailViewModel2 = (WalletPnlTokenListDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletPnlTokenListDetailViewModel = walletPnlTokenListDetailViewModel2;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot2);
                boolean z32222 = this.$loadMore;
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel42222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
                oKServerException = (OKServerException) this.L$1;
                abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("WalletPnlTokenListDetailViewModel", "WalletPnlTokenListDetailViewModel getWalletAddressPnlTokenList error message = " + oKServerException.getMessage());
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot2);
                boolean z322222 = this.$loadMore;
                WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel422222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 8:
            case 9:
                th = (Throwable) this.L$1;
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("WalletPnlTokenListDetailViewModel", "WalletPnlTokenListDetailViewModel getWalletAddressPnlTokenList error message = " + th.getMessage());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
