package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28701kfj;
import o.InterfaceC28912kji;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$updateTabFilter$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $blacklistRefresh;
    final /* synthetic */ String $chainId;
    final /* synthetic */ MemeFilter $localFilter;
    final /* synthetic */ List<String> $protocolIdList;
    final /* synthetic */ int $tabIndex;
    final /* synthetic */ String $walletAddress;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$updateTabFilter$2(MemePumpUseCase memePumpUseCase, int i, String str, List<String> list, String str2, MemeFilter memeFilter, boolean z, Continuation<? super MemePumpUseCase$updateTabFilter$2> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
        this.$tabIndex = i;
        this.$chainId = str;
        this.$protocolIdList = list;
        this.$walletAddress = str2;
        this.$localFilter = memeFilter;
        this.$blacklistRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$updateTabFilter$2(this.this$0, this.$tabIndex, this.$chainId, this.$protocolIdList, this.$walletAddress, this.$localFilter, this.$blacklistRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$updateTabFilter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strEZpvd;
        String str;
        MemePumpUseCase.StateListAnimator stateListAnimator;
        MemePumpUseCase.StateListAnimator stateListAnimator2;
        MemePumpUseCase memePumpUseCase;
        int i;
        MemeFilter memeFilterCopydefault;
        String str2;
        InterfaceC28701kfj interfaceC28701kfj;
        String strAEQbTJ;
        String str3;
        List<String> list;
        Integer numAEQbTJ;
        MemeFilter memeFilterCopydefault2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MemePumpUseCase.StateListAnimator stateListAnimator3 = (MemePumpUseCase.StateListAnimator) this.this$0.sSMYrx.get(C56443yFo.AEQbTJ(this.$tabIndex));
            if (stateListAnimator3 == null) {
                return Unit.INSTANCE;
            }
            String strAEQbTJ2 = this.$chainId;
            if (strAEQbTJ2 == null) {
                strAEQbTJ2 = stateListAnimator3.AEQbTJ();
            }
            List<String> listOLrzqt = this.$protocolIdList;
            if (listOLrzqt == null) {
                listOLrzqt = stateListAnimator3.OLrzqt();
            }
            String strKWHzl = this.$walletAddress;
            if (strKWHzl == null) {
                strKWHzl = stateListAnimator3.KWHzl();
            }
            MemeFilter memeFilterCopydefault3 = this.$localFilter;
            if (memeFilterCopydefault3 == null) {
                memeFilterCopydefault3 = stateListAnimator3.copydefault();
            }
            MemePumpUseCase.StateListAnimator stateListAnimatorAEQbTJ = stateListAnimator3.AEQbTJ(strAEQbTJ2, listOLrzqt, strKWHzl, memeFilterCopydefault3);
            this.this$0.sSMYrx.put(C56443yFo.AEQbTJ(this.$tabIndex), stateListAnimatorAEQbTJ);
            int i3 = this.$tabIndex;
            if (i3 == 0) {
                this.this$0.EZpvd.setValue(InterfaceC28912kji.StateListAnimator.copydefault);
            } else if (i3 == 1) {
                this.this$0.OLrzqt.setValue(InterfaceC28912kji.StateListAnimator.copydefault);
            } else if (i3 == 2) {
                this.this$0.copydefault.setValue(InterfaceC28912kji.StateListAnimator.copydefault);
            }
            strEZpvd = this.this$0.EZpvd(this.$tabIndex);
            if (this.$blacklistRefresh) {
                MemePumpUseCase memePumpUseCase2 = this.this$0;
                this.L$0 = stateListAnimatorAEQbTJ;
                this.L$1 = strEZpvd;
                this.label = 1;
                if (memePumpUseCase2.AEQbTJ(true, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator2 = stateListAnimatorAEQbTJ;
            } else {
                str = strEZpvd;
                stateListAnimator = stateListAnimatorAEQbTJ;
                memePumpUseCase = this.this$0;
                i = this.$tabIndex;
                memeFilterCopydefault = stateListAnimator.copydefault();
                this.L$0 = stateListAnimator;
                this.L$1 = null;
                this.label = 2;
                if (memePumpUseCase.AEQbTJ(i, str, (12 & 4) != 0, (12 & 8) != 0 ? new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null) : memeFilterCopydefault, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (this.$protocolIdList != null) {
                    this.this$0.uzCIH.copydefault();
                    interfaceC28701kfj = this.this$0.uzCIH;
                    strAEQbTJ = stateListAnimator.AEQbTJ();
                    str3 = this.$walletAddress;
                    list = this.$protocolIdList;
                    numAEQbTJ = C56443yFo.AEQbTJ(this.$tabIndex);
                    memeFilterCopydefault2 = stateListAnimator.copydefault();
                    this.L$0 = null;
                    this.label = 3;
                    if (interfaceC28701kfj.OLrzqt(strAEQbTJ, str3, list, numAEQbTJ, memeFilterCopydefault2, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                stateListAnimator = (MemePumpUseCase.StateListAnimator) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (this.$protocolIdList != null && (str2 = this.$walletAddress) != null && str2.length() > 0) {
                    this.this$0.uzCIH.copydefault();
                    interfaceC28701kfj = this.this$0.uzCIH;
                    strAEQbTJ = stateListAnimator.AEQbTJ();
                    str3 = this.$walletAddress;
                    list = this.$protocolIdList;
                    numAEQbTJ = C56443yFo.AEQbTJ(this.$tabIndex);
                    memeFilterCopydefault2 = stateListAnimator.copydefault();
                    this.L$0 = null;
                    this.label = 3;
                    if (interfaceC28701kfj.OLrzqt(strAEQbTJ, str3, list, numAEQbTJ, memeFilterCopydefault2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            strEZpvd = (String) this.L$1;
            stateListAnimator2 = (MemePumpUseCase.StateListAnimator) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        str = strEZpvd;
        stateListAnimator = stateListAnimator2;
        memePumpUseCase = this.this$0;
        i = this.$tabIndex;
        memeFilterCopydefault = stateListAnimator.copydefault();
        this.L$0 = stateListAnimator;
        this.L$1 = null;
        this.label = 2;
        if (memePumpUseCase.AEQbTJ(i, str, (12 & 4) != 0, (12 & 8) != 0 ? new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null) : memeFilterCopydefault, this) == objCopydefault) {
        }
        if (this.$protocolIdList != null) {
        }
        return Unit.INSTANCE;
    }
}
