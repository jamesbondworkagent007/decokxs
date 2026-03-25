package com.okinc.kline.ui.view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C33129mqd;
import o.C39797pzC;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39510pth;
import o.pTB;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineTipsViewTradePos$formatDataInBackground$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C39797pzC.TaskDescription>, Object> {
    final /* synthetic */ InterfaceC39510pth $dataBean;
    int label;
    final /* synthetic */ C39797pzC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineTipsViewTradePos$formatDataInBackground$2(C39797pzC c39797pzC, InterfaceC39510pth interfaceC39510pth, Continuation<? super KlineTipsViewTradePos$formatDataInBackground$2> continuation) {
        super(2, continuation);
        this.this$0 = c39797pzC;
        this.$dataBean = interfaceC39510pth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineTipsViewTradePos$formatDataInBackground$2(this.this$0, this.$dataBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C39797pzC.TaskDescription> continuation) {
        return ((KlineTipsViewTradePos$formatDataInBackground$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        int iCopydefault;
        int iCopydefault2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strOLrzqt = this.this$0.OLrzqt(this.$dataBean.getUpl(), this.$dataBean.getUplSign());
            BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((Object) this.$dataBean.getUplRatio());
            if (Intrinsics.EZpvd(this.this$0.djBIcL, bigDecimalOLrzqt) && this.this$0.KWHzl != null) {
                String str3 = this.this$0.KWHzl;
                Intrinsics.copydefault((Object) str3);
                str = str3;
            } else {
                String percentWithSymbol$default = pTB.formatPercentWithSymbol$default(bigDecimalOLrzqt, 2, 2, RoundingMode.DOWN, null, 8, null);
                this.this$0.djBIcL = bigDecimalOLrzqt;
                this.this$0.KWHzl = percentWithSymbol$default;
                str = percentWithSymbol$default;
            }
            if (Intrinsics.EZpvd((Object) this.$dataBean.getMgnMode(), (Object) this.this$0.EZpvd)) {
                str2 = this.$dataBean.getImr() + " " + this.$dataBean.getImrSign();
            } else {
                str2 = this.$dataBean.getMargin() + " " + this.$dataBean.getMarginSign();
            }
            String str4 = str2;
            String downToFixed$default = this.$dataBean.getLiqPx().length() == 0 ? this.this$0.AEQbTJ : pTB.formatDownToFixed$default(pTB.OLrzqt((Object) this.$dataBean.getLiqPx()), this.this$0.DbNXlk, null, 2, null);
            if (C33129mqd.AEQbTJ(this.$dataBean.getUpl(), C56443yFo.AEQbTJ(0))) {
                iCopydefault = this.this$0.fetchVPNInfo;
            } else {
                iCopydefault = C33129mqd.gEmmrt(this.$dataBean.getUpl(), C56443yFo.AEQbTJ(0)) ? this.this$0.isConnected : C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
            }
            int i = iCopydefault;
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (Object) null)) {
                iCopydefault2 = this.this$0.fetchVPNInfo;
            } else {
                iCopydefault2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null) ? this.this$0.isConnected : C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
            }
            return new C39797pzC.TaskDescription(strOLrzqt, str, str4, downToFixed$default, i, iCopydefault2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
