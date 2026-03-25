package com.okinc.business.invest_biz.ui.screens.history;

import android.widget.LinearLayout;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC26384jbM;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestHistoryActivity$initView$2$1 extends FunctionReferenceImpl implements yHO<LinearLayout, List<? extends InvestTokenWithAmount>, Integer, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestHistoryActivity$initView$2$1(Object obj) {
        super(3, obj, ActivityC26384jbM.class, "setupSubVerticalListView", "setupSubVerticalListView(Landroid/widget/LinearLayout;Ljava/util/List;I)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ Unit invoke(LinearLayout linearLayout, List<? extends InvestTokenWithAmount> list, Integer num) {
        invoke(linearLayout, (List<InvestTokenWithAmount>) list, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LinearLayout linearLayout, List<InvestTokenWithAmount> list, int i) {
        Intrinsics.checkNotNullParameter(linearLayout, "");
        Intrinsics.checkNotNullParameter(list, "");
        ((ActivityC26384jbM) this.receiver).AEQbTJ(linearLayout, list, i);
    }
}
