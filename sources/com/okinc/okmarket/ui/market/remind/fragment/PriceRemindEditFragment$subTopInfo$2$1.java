package com.okinc.okmarket.ui.market.remind.fragment;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C37936pGe;
import o.C46825teV;
import o.C54536xML;
import o.C55390xiz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.pTB;
import o.pWO;
import o.xMJ;
import o.xMS;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$subTopInfo$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instrumentId;
    final /* synthetic */ String $instrumentType;
    final /* synthetic */ C55390xiz $mTvPrice;
    final /* synthetic */ C37936pGe $t;
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$subTopInfo$2$1(String str, String str2, C46825teV c46825teV, C37936pGe c37936pGe, C55390xiz c55390xiz, Continuation<? super PriceRemindEditFragment$subTopInfo$2$1> continuation) {
        super(2, continuation);
        this.$instrumentType = str;
        this.$instrumentId = str2;
        this.this$0 = c46825teV;
        this.$t = c37936pGe;
        this.$mTvPrice = c55390xiz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$subTopInfo$2$1(this.$instrumentType, this.$instrumentId, this.this$0, this.$t, this.$mTvPrice, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$subTopInfo$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        BizInstrument bizInstrumentValueOf;
        String strAYXKKw;
        String strAYXKKw2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(this.$instrumentType) : null;
            if (abstractC54531xLwOLrzqt != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.$instrumentId)) != null) {
                String str = this.$instrumentType;
                C46825teV c46825teV = this.this$0;
                C37936pGe c37936pGe = this.$t;
                C55390xiz c55390xiz = this.$mTvPrice;
                String instFamily = bizInstrumentValueOf.getInstFamily();
                String str2 = "";
                switch (str.hashCode()) {
                    case -2027980370:
                        if (str.equals("MARGIN")) {
                            xMJ.Application applicationKWHzl = c37936pGe.KWHzl();
                            c46825teV.AhwBna(C33129mqd.OLrzqt((Object) (applicationKWHzl != null ? applicationKWHzl.AYXKKw() : null)));
                            if (c55390xiz != null) {
                                xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
                                xMJ.Application applicationKWHzl2 = c37936pGe.KWHzl();
                                if (applicationKWHzl2 != null && (strAYXKKw = applicationKWHzl2.AYXKKw()) != null) {
                                    str2 = strAYXKKw;
                                }
                                c55390xiz.setText(C54536xML.toSafeString$default(xmsGEmmrt.AYXKKw(str2).djBIcL().AEQbTJ(true), false, 1, null));
                            }
                        }
                        break;
                    case 2552066:
                        if (str.equals("SPOT")) {
                        }
                        break;
                    case 2558355:
                        if (str.equals("SWAP")) {
                            if (Intrinsics.EZpvd((Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (Object) "linear")) {
                                xMJ.Application applicationKWHzl3 = c37936pGe.KWHzl();
                                c46825teV.AhwBna(C33129mqd.OLrzqt((Object) (applicationKWHzl3 != null ? applicationKWHzl3.AYXKKw() : null)));
                                if (c55390xiz != null) {
                                    xMS xmsGEmmrt2 = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
                                    xMJ.Application applicationKWHzl4 = c37936pGe.KWHzl();
                                    if (applicationKWHzl4 != null && (strAYXKKw2 = applicationKWHzl4.AYXKKw()) != null) {
                                        str2 = strAYXKKw2;
                                    }
                                    c55390xiz.setText(C54536xML.toSafeString$default(xmsGEmmrt2.AYXKKw(str2).djBIcL().AEQbTJ(true), false, 1, null));
                                }
                            } else {
                                xMJ.Application applicationKWHzl5 = c37936pGe.KWHzl();
                                c46825teV.AhwBna(C33129mqd.OLrzqt((Object) (applicationKWHzl5 != null ? applicationKWHzl5.AYXKKw() : null)));
                                if (c55390xiz != null) {
                                    xMJ.Application applicationKWHzl6 = c37936pGe.KWHzl();
                                    c55390xiz.setText(pTB.formatRoundToMax$default(pTB.OLrzqt((Object) (applicationKWHzl6 != null ? applicationKWHzl6.AYXKKw() : null)), 0, null, 3, null));
                                }
                            }
                        }
                        break;
                    case 214415088:
                        if (str.equals("FUTURES")) {
                        }
                        break;
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
