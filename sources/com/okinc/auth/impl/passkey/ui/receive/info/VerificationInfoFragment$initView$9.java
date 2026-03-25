package com.okinc.auth.impl.passkey.ui.receive.info;

import android.widget.TextView;
import com.okinc.auth.api.passkey.TargetDeviceVerificationInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C6227aLP;
import o.C8206ayP;
import o.C8279azj;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationInfoFragment$initView$9 extends SuspendLambda implements Function2<TargetDeviceVerificationInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6227aLP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoFragment$initView$9(C6227aLP c6227aLP, Continuation<? super VerificationInfoFragment$initView$9> continuation) {
        super(2, continuation);
        this.this$0 = c6227aLP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationInfoFragment$initView$9 verificationInfoFragment$initView$9 = new VerificationInfoFragment$initView$9(this.this$0, continuation);
        verificationInfoFragment$initView$9.L$0 = obj;
        return verificationInfoFragment$initView$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TargetDeviceVerificationInfo targetDeviceVerificationInfo, Continuation<? super Unit> continuation) {
        return ((VerificationInfoFragment$initView$9) create(targetDeviceVerificationInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TargetDeviceVerificationInfo targetDeviceVerificationInfo = (TargetDeviceVerificationInfo) this.L$0;
            if (targetDeviceVerificationInfo != null) {
                C8279azj c8279azj = this.this$0.valueOf;
                if (c8279azj != null && (textView5 = c8279azj.valueOf) != null) {
                    C6227aLP c6227aLP = this.this$0;
                    int i = C8206ayP.Dialog.DUUtXg;
                    String strKWHzl = targetDeviceVerificationInfo.KWHzl();
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    textView5.setText(C33069mpW.copydefault(c6227aLP, i, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("scenario", strKWHzl))));
                }
                C8279azj c8279azj2 = this.this$0.valueOf;
                if (c8279azj2 != null && (textView4 = c8279azj2.djBIcL) != null) {
                    VerificationInfoViewModel verificationInfoViewModelGEmmrt = this.this$0.gEmmrt();
                    String strAEQbTJ = targetDeviceVerificationInfo.AEQbTJ();
                    textView4.setText(verificationInfoViewModelGEmmrt.EZpvd(strAEQbTJ != null ? StringsKt__StringNumberConversionsKt.getFieldNames(strAEQbTJ) : null));
                }
                C8279azj c8279azj3 = this.this$0.valueOf;
                if (c8279azj3 != null && (textView3 = c8279azj3.KWHzl) != null) {
                    String strCopydefault = targetDeviceVerificationInfo.copydefault();
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    textView3.setText(strCopydefault);
                }
                C8279azj c8279azj4 = this.this$0.valueOf;
                if (c8279azj4 != null && (textView2 = c8279azj4.EZpvd) != null) {
                    String strEZpvd = targetDeviceVerificationInfo.EZpvd();
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    textView2.setText(strEZpvd);
                }
                C8279azj c8279azj5 = this.this$0.valueOf;
                if (c8279azj5 != null && (textView = c8279azj5.AEQbTJ) != null) {
                    String strOLrzqt = targetDeviceVerificationInfo.OLrzqt();
                    textView.setText(strOLrzqt != null ? strOLrzqt : "");
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
