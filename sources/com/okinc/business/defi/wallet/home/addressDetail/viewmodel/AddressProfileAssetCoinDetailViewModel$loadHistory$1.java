package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWW;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetCoinDetailViewModel$loadHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ long $chainId;
    final /* synthetic */ boolean $loadMore;
    final /* synthetic */ String $tokenAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ AddressProfileAssetCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetCoinDetailViewModel$loadHistory$1(AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel, boolean z, String str, long j, String str2, Continuation<? super AddressProfileAssetCoinDetailViewModel$loadHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetCoinDetailViewModel;
        this.$loadMore = z;
        this.$address = str;
        this.$chainId = j;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetCoinDetailViewModel$loadHistory$1(this.this$0, this.$loadMore, this.$address, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetCoinDetailViewModel$loadHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel;
        AbstractC43419rot abstractC43419rot2;
        AddressCoinHistoryResponse addressCoinHistoryResponse;
        AddressCoinHistoryResponse addressCoinHistoryResponse2;
        AbstractC43419rot abstractC43419rot3;
        AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel2;
        AbstractC43419rot abstractC43419rot4;
        List<AddressCoinHistoryDetail> content;
        AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel3;
        AbstractC43419rot abstractC43419rot5;
        MutableStateFlow<Boolean> mutableStateFlowEZpvd;
        Boolean boolKWHzl;
        AddressCoinHistoryDetail addressCoinHistoryDetail;
        AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel4;
        MutableSharedFlow<Boolean> mutableSharedFlowAhwBna;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow<Boolean> mutableStateFlowEZpvd2 = this.this$0.EZpvd();
                Boolean boolKWHzl3 = C56443yFo.KWHzl(this.$loadMore);
                this.label = 1;
                if (mutableStateFlowEZpvd2.emit(boolKWHzl3, this) == objCopydefault) {
                    return objCopydefault;
                }
                eWW eww = this.this$0.KWHzl;
                String str = this.$address;
                long j = this.$chainId;
                String str2 = this.$tokenAddress;
                String str3 = this.this$0.gEmmrt;
                this.label = 2;
                obj = eww.EZpvd(str, j, str2, str3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) obj;
                addressProfileAssetCoinDetailViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    addressCoinHistoryResponse = (AddressCoinHistoryResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    addressProfileAssetCoinDetailViewModel.djBIcL++;
                    List<AddressCoinHistoryDetail> content2 = addressCoinHistoryResponse.getContent();
                    if (content2 == null || content2.isEmpty()) {
                        MutableSharedFlow<List<AddressCoinHistoryDetail>> mutableSharedFlowOLrzqt = addressProfileAssetCoinDetailViewModel.OLrzqt();
                        List<AddressCoinHistoryDetail> listAhwBna = yDY.AhwBna();
                        this.L$0 = abstractC43419rot;
                        this.L$1 = addressProfileAssetCoinDetailViewModel;
                        this.L$2 = abstractC43419rot;
                        this.L$3 = addressCoinHistoryResponse;
                        this.label = 3;
                        if (mutableSharedFlowOLrzqt.emit(listAhwBna, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        addressCoinHistoryResponse2 = addressCoinHistoryResponse;
                        abstractC43419rot3 = abstractC43419rot;
                        addressProfileAssetCoinDetailViewModel2 = addressProfileAssetCoinDetailViewModel;
                        abstractC43419rot4 = abstractC43419rot3;
                        addressProfileAssetCoinDetailViewModel3 = addressProfileAssetCoinDetailViewModel2;
                        abstractC43419rot = abstractC43419rot3;
                        addressCoinHistoryResponse = addressCoinHistoryResponse2;
                        mutableStateFlowEZpvd = addressProfileAssetCoinDetailViewModel3.EZpvd();
                        Boolean hasViewMore = addressCoinHistoryResponse.getHasViewMore();
                        boolKWHzl = C56443yFo.KWHzl(hasViewMore != null && hasViewMore.booleanValue() && addressProfileAssetCoinDetailViewModel3.djBIcL < 50);
                        this.L$0 = abstractC43419rot4;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 5;
                        if (mutableStateFlowEZpvd.emit(boolKWHzl, this) != objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC43419rot2 = abstractC43419rot4;
                        addressProfileAssetCoinDetailViewModel4 = this.this$0;
                        if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                            pUU.copydefault("AddressProfileAssetCoinDetailViewModel", "error message:" + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl()).getMessage());
                            MutableStateFlow<Boolean> mutableStateFlowEZpvd3 = addressProfileAssetCoinDetailViewModel4.EZpvd();
                            Boolean boolKWHzl4 = C56443yFo.KWHzl(false);
                            this.L$0 = addressProfileAssetCoinDetailViewModel4;
                            this.L$1 = abstractC43419rot2;
                            this.label = 6;
                            if (mutableStateFlowEZpvd3.emit(boolKWHzl4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlowAhwBna = addressProfileAssetCoinDetailViewModel4.AhwBna();
                            boolKWHzl2 = C56443yFo.KWHzl(false);
                            this.L$0 = abstractC43419rot2;
                            this.L$1 = null;
                            this.label = 7;
                            if (mutableSharedFlowAhwBna.emit(boolKWHzl2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    content = addressCoinHistoryResponse.getContent();
                    if (content != null) {
                        MutableSharedFlow<List<AddressCoinHistoryDetail>> mutableSharedFlowOLrzqt2 = addressProfileAssetCoinDetailViewModel.OLrzqt();
                        this.L$0 = abstractC43419rot;
                        this.L$1 = addressProfileAssetCoinDetailViewModel;
                        this.L$2 = abstractC43419rot;
                        this.L$3 = addressCoinHistoryResponse;
                        this.L$4 = content;
                        this.L$5 = content;
                        this.label = 4;
                        if (mutableSharedFlowOLrzqt2.emit(content, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC43419rot5 = abstractC43419rot;
                        addressCoinHistoryDetail = (AddressCoinHistoryDetail) CollectionsKt___CollectionsKt.wlaJM(content);
                        if (addressCoinHistoryDetail != null || (rowId = addressCoinHistoryDetail.getRowId()) == null) {
                            String rowId = "";
                        }
                        addressProfileAssetCoinDetailViewModel.gEmmrt = rowId;
                        addressProfileAssetCoinDetailViewModel3 = addressProfileAssetCoinDetailViewModel;
                        abstractC43419rot4 = abstractC43419rot5;
                        mutableStateFlowEZpvd = addressProfileAssetCoinDetailViewModel3.EZpvd();
                        Boolean hasViewMore2 = addressCoinHistoryResponse.getHasViewMore();
                        if (hasViewMore2 != null) {
                            boolKWHzl = C56443yFo.KWHzl(hasViewMore2 != null && hasViewMore2.booleanValue() && addressProfileAssetCoinDetailViewModel3.djBIcL < 50);
                            this.L$0 = abstractC43419rot4;
                            this.L$1 = abstractC43419rot;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 5;
                            if (mutableStateFlowEZpvd.emit(boolKWHzl, this) != objCopydefault) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    addressProfileAssetCoinDetailViewModel3 = addressProfileAssetCoinDetailViewModel;
                    abstractC43419rot4 = abstractC43419rot;
                    mutableStateFlowEZpvd = addressProfileAssetCoinDetailViewModel3.EZpvd();
                    Boolean hasViewMore22 = addressCoinHistoryResponse.getHasViewMore();
                    return Unit.INSTANCE;
                }
                abstractC43419rot2 = abstractC43419rot;
                addressProfileAssetCoinDetailViewModel4 = this.this$0;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                eWW eww2 = this.this$0.KWHzl;
                String str4 = this.$address;
                long j2 = this.$chainId;
                String str22 = this.$tokenAddress;
                String str32 = this.this$0.gEmmrt;
                this.label = 2;
                obj = eww2.EZpvd(str4, j2, str22, str32, this);
                if (obj == objCopydefault) {
                }
                abstractC43419rot = (AbstractC43419rot) obj;
                addressProfileAssetCoinDetailViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                addressProfileAssetCoinDetailViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                break;
            case 3:
                addressCoinHistoryResponse2 = (AddressCoinHistoryResponse) this.L$3;
                abstractC43419rot3 = (AbstractC43419rot) this.L$2;
                addressProfileAssetCoinDetailViewModel2 = (AddressProfileAssetCoinDetailViewModel) this.L$1;
                abstractC43419rot4 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressProfileAssetCoinDetailViewModel3 = addressProfileAssetCoinDetailViewModel2;
                abstractC43419rot = abstractC43419rot3;
                addressCoinHistoryResponse = addressCoinHistoryResponse2;
                mutableStateFlowEZpvd = addressProfileAssetCoinDetailViewModel3.EZpvd();
                Boolean hasViewMore222 = addressCoinHistoryResponse.getHasViewMore();
                return Unit.INSTANCE;
            case 4:
                content = (List) this.L$5;
                addressCoinHistoryResponse = (AddressCoinHistoryResponse) this.L$3;
                abstractC43419rot = (AbstractC43419rot) this.L$2;
                addressProfileAssetCoinDetailViewModel = (AddressProfileAssetCoinDetailViewModel) this.L$1;
                abstractC43419rot5 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressCoinHistoryDetail = (AddressCoinHistoryDetail) CollectionsKt___CollectionsKt.wlaJM(content);
                if (addressCoinHistoryDetail != null) {
                    String rowId2 = "";
                    addressProfileAssetCoinDetailViewModel.gEmmrt = rowId2;
                    addressProfileAssetCoinDetailViewModel3 = addressProfileAssetCoinDetailViewModel;
                    abstractC43419rot4 = abstractC43419rot5;
                    mutableStateFlowEZpvd = addressProfileAssetCoinDetailViewModel3.EZpvd();
                    Boolean hasViewMore2222 = addressCoinHistoryResponse.getHasViewMore();
                }
                return Unit.INSTANCE;
            case 5:
                abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressProfileAssetCoinDetailViewModel4 = this.this$0;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 6:
                abstractC43419rot2 = (AbstractC43419rot) this.L$1;
                addressProfileAssetCoinDetailViewModel4 = (AddressProfileAssetCoinDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlowAhwBna = addressProfileAssetCoinDetailViewModel4.AhwBna();
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = abstractC43419rot2;
                this.L$1 = null;
                this.label = 7;
                if (mutableSharedFlowAhwBna.emit(boolKWHzl2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
