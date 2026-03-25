package com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36329oXt;
import o.C56391yDq;
import o.C56442yFn;
import o.mTF;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class KlineContainerFragment$showFlashNewDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ String $queryName;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ mTF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineContainerFragment$showFlashNewDialog$1(mTF mtf, String str, String str2, String str3, FragmentManager fragmentManager, Continuation<? super KlineContainerFragment$showFlashNewDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = mtf;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$queryName = str3;
        this.$fm = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineContainerFragment$showFlashNewDialog$1(this.this$0, this.$chainId, this.$tokenAddress, this.$queryName, this.$fm, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineContainerFragment$showFlashNewDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketCoinDetailViewModel marketCoinDetailViewModelIsConnected = this.this$0.isConnected();
                String str = this.$chainId;
                String str2 = this.$tokenAddress;
                String str3 = this.$queryName;
                this.label = 1;
                obj = marketCoinDetailViewModelIsConnected.OLrzqt(str, str2, str3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) obj;
            FragmentManager fragmentManager = this.$fm;
            String str4 = this.$queryName;
            try {
                Result.Application application = Result.Companion;
                C36329oXt c36329oXtKWHzl = C36329oXt.Companion.KWHzl();
                Bundle bundle = new Bundle();
                bundle.putString("key.request_flash_key", "flash");
                bundle.putString("key_kline_flash_instrument_id", str4);
                bundle.putString("key_kline_flash_instrument_type", "CEDEFI");
                bundle.putParcelableArrayList("key.get_flash_list_data", new ArrayList<>(list));
                c36329oXtKWHzl.setArguments(bundle);
                c36329oXtKWHzl.show(fragmentManager, C36329oXt.class.getName());
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            mTF mtf = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(mtf.getTAG(), "showFlashNewDialog error: " + thM7380exceptionOrNullimpl.getMessage());
            }
        } catch (Exception e) {
            pUU.copydefault(this.this$0.getTAG(), "showFlashNewDialog error: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
