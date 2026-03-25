package com.okinc.buysell.ui.bsc.bottomsheet;

import android.content.Context;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class SelectPaymentMethodFragmentV3$launchPayPalFlow$1 extends FunctionReferenceImpl implements yHO<Context, String, Boolean, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectPaymentMethodFragmentV3$launchPayPalFlow$1(Object obj) {
        super(3, obj, PaymentMethodSelectionViewModel.class, "startPayPalFlow", "startPayPalFlow(Landroid/content/Context;Ljava/lang/String;Z)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ Unit invoke(Context context, String str, Boolean bool) {
        invoke(context, str, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Context context, String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((PaymentMethodSelectionViewModel) this.receiver).KWHzl(context, str, z);
    }
}
