package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.meme.data.MemeSearchBean;
import com.okinc.business.trade.features.home.ui.uistate.SearchMemeUiState;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.kVU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$searchMemeModeTokenByPaste$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $inputContent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$searchMemeModeTokenByPaste$1(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, Continuation<? super MemeModeTransactionViewModel$searchMemeModeTokenByPaste$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$inputContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$searchMemeModeTokenByPaste$1(this.this$0, this.$inputContent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$searchMemeModeTokenByPaste$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        kVU kvu;
        String str;
        Object objAEQbTJ;
        String str2;
        String str3;
        kVU kvu2;
        Object objAEQbTJ2;
        Object objM7386unboximpl;
        Throwable thM7380exceptionOrNullimpl;
        String strAYXKKw;
        Throwable origin;
        List<DexMultiTokenInfoBean> memeUnsupportList;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.values().setValue(new SearchMemeUiState(true, null, null, null, false, null, 62, null));
            kVU kvu3 = this.this$0.AubY;
            String str4 = this.$inputContent;
            kKG kkg = this.this$0.QfsBiF;
            this.L$0 = kvu3;
            this.L$1 = str4;
            this.label = 1;
            objCopydefault = kkg.copydefault(this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            kvu = kvu3;
            str = str4;
        } else {
            if (i != 1) {
                if (i == 2) {
                    str3 = (String) this.L$2;
                    String str5 = (String) this.L$1;
                    kVU kvu4 = (kVU) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    kvu2 = kvu4;
                    str2 = str5;
                    objAEQbTJ = obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objAEQbTJ2 = kvu2.AEQbTJ(str2, str3, (String) objAEQbTJ, this);
                    if (objAEQbTJ2 != objCopydefault2) {
                        return objCopydefault2;
                    }
                    objM7386unboximpl = objAEQbTJ2;
                    MemeModeTransactionViewModel memeModeTransactionViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    }
                    MemeModeTransactionViewModel memeModeTransactionViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                MemeModeTransactionViewModel memeModeTransactionViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    MemeSearchBean memeSearchBean = (MemeSearchBean) objM7386unboximpl;
                    List<DexMultiTokenInfoBean> memeList = memeSearchBean.getMemeList();
                    if (memeList != null && memeList.isEmpty()) {
                        memeModeTransactionViewModel3.values().postValue(new SearchMemeUiState(false, null, null, null, true, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatBuilder), 15, null));
                    } else {
                        List<DexMultiTokenInfoBean> memeList2 = memeSearchBean.getMemeList();
                        if (memeList2 != null && !memeList2.isEmpty() && (memeUnsupportList = memeSearchBean.getMemeUnsupportList()) != null && memeUnsupportList.isEmpty()) {
                            memeModeTransactionViewModel3.values().postValue(new SearchMemeUiState(false, null, memeSearchBean.getMemeList(), null, false, null, 59, null));
                        }
                    }
                }
                MemeModeTransactionViewModel memeModeTransactionViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    if (!(thM7380exceptionOrNullimpl instanceof OKServerException) || (origin = ((OKServerException) thM7380exceptionOrNullimpl).getOrigin()) == null || (strAYXKKw = origin.getMessage()) == null) {
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatBuilder);
                    }
                    memeModeTransactionViewModel22.values().postValue(new SearchMemeUiState(false, null, null, null, true, strAYXKKw, 15, null));
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$1;
            kvu = (kVU) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        String str6 = (String) objCopydefault;
        kKG kkg2 = this.this$0.QfsBiF;
        this.L$0 = kvu;
        this.L$1 = str;
        this.L$2 = str6;
        this.label = 2;
        objAEQbTJ = kkg2.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        kVU kvu5 = kvu;
        str2 = str;
        str3 = str6;
        kvu2 = kvu5;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        objAEQbTJ2 = kvu2.AEQbTJ(str2, str3, (String) objAEQbTJ, this);
        if (objAEQbTJ2 != objCopydefault2) {
        }
    }
}
