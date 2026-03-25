package com.okinc.business.dexui.chain_picker;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C23407hxe;
import o.C23408hxf;
import o.C23459hyd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class ChainPickerBottomSheet$onFilterByChainName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $term;
    int label;
    final /* synthetic */ C23407hxe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainPickerBottomSheet$onFilterByChainName$1(C23407hxe c23407hxe, String str, Continuation<? super ChainPickerBottomSheet$onFilterByChainName$1> continuation) {
        super(2, continuation);
        this.this$0 = c23407hxe;
        this.$term = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChainPickerBottomSheet$onFilterByChainName$1(this.this$0, this.$term, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChainPickerBottomSheet$onFilterByChainName$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        OKAnchorSelection oKAnchorSelection;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ChainPickerViewModel chainPickerViewModelEZpvd = this.this$0.EZpvd();
            String str = this.$term;
            this.label = 1;
            Object objCopydefault2 = chainPickerViewModelEZpvd.copydefault(str, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        C23407hxe c23407hxe = this.this$0;
        String str2 = this.$term;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            List<MarketChainBean> list = (List) objM7386unboximpl;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MarketChainBean marketChainBean : list) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new C23408hxf(marketChainBean.getChainId(), marketChainBean.getChainName(), marketChainBean.getChainLogo(), null, Intrinsics.EZpvd((Object) c23407hxe.KWHzl().AEQbTJ(), (Object) marketChainBean.getChainId()), str2, null, 72, null));
                arrayList2 = arrayList3;
            }
            arrayList.addAll(arrayList2);
            C23408hxf c23408hxfAEQbTJ = c23407hxe.AEQbTJ();
            if (StringsKt__StringsKt.AhwBna((CharSequence) c23408hxfAEQbTJ.AYXKKw(), (CharSequence) str2, true)) {
                arrayList.add(0, C23408hxf.copy$default(c23408hxfAEQbTJ, null, null, null, null, false, str2, null, 95, null));
            }
            C23459hyd c23459hyd = c23407hxe.OLrzqt;
            if (c23459hyd != null && (oKAnchorSelection = c23459hyd.EZpvd) != null) {
                oKAnchorSelection.setSearchResultList(arrayList);
            }
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
