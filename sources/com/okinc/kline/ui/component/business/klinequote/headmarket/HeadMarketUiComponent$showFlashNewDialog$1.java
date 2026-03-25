package com.okinc.kline.ui.component.business.klinequote.headmarket;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C36329oXt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.InterfaceC54581xNr;
import o.pUU;
import o.pWO;

/* JADX INFO: loaded from: classes8.dex */
public final class HeadMarketUiComponent$showFlashNewDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ String $insId;
    final /* synthetic */ String $insType;
    int label;
    final /* synthetic */ HeadMarketUiComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadMarketUiComponent$showFlashNewDialog$1(String str, String str2, HeadMarketUiComponent headMarketUiComponent, FragmentManager fragmentManager, Continuation<? super HeadMarketUiComponent$showFlashNewDialog$1> continuation) {
        super(2, continuation);
        this.$insType = str;
        this.$insId = str2;
        this.this$0 = headMarketUiComponent;
        this.$fm = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeadMarketUiComponent$showFlashNewDialog$1(this.$insType, this.$insId, this.this$0, this.$fm, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HeadMarketUiComponent$showFlashNewDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:5)(2:6|7))(6:8|(1:17)(1:16)|18|(1:27)(1:26)|28|(2:30|(1:32))(8:34|35|45|36|40|(1:42)|43|44))|33|35|45|36|40|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        r0 = kotlin.Result.Companion;
        r13 = kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList<? extends Parcelable> arrayList;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        String quoteSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        String tradeSymbol;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            String str = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(this.$insType)) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(this.$insId)) == null || (tradeSymbol = bizInstrumentValueOf2.getTradeSymbol()) == null) ? "" : tradeSymbol;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
            String str2 = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(this.$insType)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.$insId)) == null || (quoteSymbol = bizInstrumentValueOf.getQuoteSymbol()) == null) ? "" : quoteSymbol;
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.this$0.EZpvd().uzCIH();
            if (stateListAnimatorUzCIH == null) {
                arrayList = null;
                FragmentManager fragmentManager = this.$fm;
                String str3 = this.$insId;
                String str4 = this.$insType;
                Result.Application application = Result.Companion;
                C36329oXt c36329oXtKWHzl = C36329oXt.Companion.KWHzl();
                Bundle bundle = new Bundle();
                bundle.putString("key.request_flash_key", "flash");
                bundle.putString("key_kline_flash_instrument_id", str3);
                bundle.putString("key_kline_flash_instrument_type", str4);
                bundle.putParcelableArrayList("key.get_flash_list_data", arrayList);
                c36329oXtKWHzl.setArguments(bundle);
                c36329oXtKWHzl.show(fragmentManager, C36329oXt.class.getName());
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    pUU.copydefault("displayFeedNewsLayout", "Fragment has not been attached yet.");
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = InterfaceC39563puh.StateListAnimator.TaskDescription.getKlineContentFlashData$default(stateListAnimatorUzCIH, str2, str, true, null, null, this, 24, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        arrayList = (ArrayList) obj;
        FragmentManager fragmentManager2 = this.$fm;
        String str32 = this.$insId;
        String str42 = this.$insType;
        Result.Application application2 = Result.Companion;
        C36329oXt c36329oXtKWHzl2 = C36329oXt.Companion.KWHzl();
        Bundle bundle2 = new Bundle();
        bundle2.putString("key.request_flash_key", "flash");
        bundle2.putString("key_kline_flash_instrument_id", str32);
        bundle2.putString("key_kline_flash_instrument_type", str42);
        bundle2.putParcelableArrayList("key.get_flash_list_data", arrayList);
        c36329oXtKWHzl2.setArguments(bundle2);
        c36329oXtKWHzl2.show(fragmentManager2, C36329oXt.class.getName());
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
