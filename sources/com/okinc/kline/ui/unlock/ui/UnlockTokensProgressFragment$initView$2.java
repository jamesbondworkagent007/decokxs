package com.okinc.kline.ui.unlock.ui;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C33129mqd;
import o.C35964oKf;
import o.C36096oPc;
import o.C39706pxR;
import o.C39707pxS;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.pTB;
import o.rVN;
import o.yII;

/* JADX INFO: loaded from: classes23.dex */
public final class UnlockTokensProgressFragment$initView$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C39706pxR>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C39707pxS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokensProgressFragment$initView$2(C39707pxS c39707pxS, Continuation<? super UnlockTokensProgressFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c39707pxS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnlockTokensProgressFragment$initView$2 unlockTokensProgressFragment$initView$2 = new UnlockTokensProgressFragment$initView$2(this.this$0, continuation);
        unlockTokensProgressFragment$initView$2.L$0 = obj;
        return unlockTokensProgressFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C39706pxR> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<C39706pxR>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<C39706pxR> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((UnlockTokensProgressFragment$initView$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                C39706pxR c39706pxR = (C39706pxR) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
                C36096oPc c36096oPcKWHzl = this.this$0.KWHzl();
                if (c36096oPcKWHzl != null) {
                    c36096oPcKWHzl.AYXKKw.KWHzl.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.OtRJxF));
                    c36096oPcKWHzl.AYXKKw.EZpvd.setText(c39706pxR.OLrzqt().OLrzqt());
                    AppCompatTextView appCompatTextView = c36096oPcKWHzl.AYXKKw.copydefault;
                    Float fOLrzqt = C56443yFo.OLrzqt(c39706pxR.OLrzqt().EZpvd());
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    appCompatTextView.setText(pTB.formatICUPercent$default(fOLrzqt, roundingMode, null, null, null, null, 30, null));
                    c36096oPcKWHzl.AYXKKw.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.DQzvGN));
                    c36096oPcKWHzl.gEmmrt.KWHzl.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QBiWsm));
                    c36096oPcKWHzl.gEmmrt.EZpvd.setText(c39706pxR.EZpvd().OLrzqt());
                    c36096oPcKWHzl.gEmmrt.copydefault.setText(pTB.formatICUPercent$default(C56443yFo.OLrzqt(c39706pxR.EZpvd().EZpvd()), roundingMode, null, null, null, null, 30, null));
                    c36096oPcKWHzl.gEmmrt.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.DcMfJK));
                    c36096oPcKWHzl.djBIcL.KWHzl.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DjWNei));
                    c36096oPcKWHzl.djBIcL.EZpvd.setText(c39706pxR.AEQbTJ().OLrzqt());
                    c36096oPcKWHzl.djBIcL.copydefault.setText(pTB.formatICUPercent$default(C56443yFo.OLrzqt(c39706pxR.AEQbTJ().EZpvd()), roundingMode, null, null, null, null, 30, null));
                    c36096oPcKWHzl.djBIcL.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
                    c36096oPcKWHzl.KWHzl.setMax(100);
                    c36096oPcKWHzl.KWHzl.setProgress(yII.EZpvd(C33129mqd.djBIcL(C56443yFo.OLrzqt(c39706pxR.EZpvd().EZpvd()))));
                    c36096oPcKWHzl.KWHzl.setSecondaryProgress(yII.EZpvd(C33129mqd.djBIcL(C56443yFo.OLrzqt(c39706pxR.OLrzqt().EZpvd()))) + c36096oPcKWHzl.KWHzl.getProgress());
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                C36096oPc c36096oPcKWHzl2 = this.this$0.KWHzl();
                if (c36096oPcKWHzl2 != null) {
                    c36096oPcKWHzl2.AYXKKw.KWHzl.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.OtRJxF));
                    c36096oPcKWHzl2.AYXKKw.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.DQzvGN));
                    c36096oPcKWHzl2.gEmmrt.KWHzl.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QBiWsm));
                    c36096oPcKWHzl2.gEmmrt.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.DcMfJK));
                    c36096oPcKWHzl2.djBIcL.KWHzl.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DjWNei));
                    c36096oPcKWHzl2.djBIcL.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
                    c36096oPcKWHzl2.KWHzl.setMax(100);
                    c36096oPcKWHzl2.KWHzl.setProgress(0);
                    c36096oPcKWHzl2.KWHzl.setSecondaryProgress(0);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
