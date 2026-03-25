package com.okinc.business.market.features.smart_money.signal.ui.overview;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C21600hFj;
import o.C23274hvD;
import o.C29652kxg;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.kMM;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalSingleOverviewDetailFragment$fetchTrendAddresses$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SignalUiModel $signalTrend;
    final /* synthetic */ C21600hFj $this_fetchTrendAddresses;
    Object L$0;
    int label;
    final /* synthetic */ C29652kxg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalSingleOverviewDetailFragment$fetchTrendAddresses$1(C29652kxg c29652kxg, C21600hFj c21600hFj, SignalUiModel signalUiModel, Context context, Continuation<? super SignalSingleOverviewDetailFragment$fetchTrendAddresses$1> continuation) {
        super(2, continuation);
        this.this$0 = c29652kxg;
        this.$this_fetchTrendAddresses = c21600hFj;
        this.$signalTrend = signalUiModel;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalSingleOverviewDetailFragment$fetchTrendAddresses$1(this.this$0, this.$this_fetchTrendAddresses, this.$signalTrend, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalSingleOverviewDetailFragment$fetchTrendAddresses$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C29652kxg c29652kxg;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c29652kxg = this.this$0;
            SignalSingleOverviewViewModel signalSingleOverviewViewModelDjBIcL = c29652kxg.djBIcL();
            this.L$0 = c29652kxg;
            this.label = 1;
            obj = signalSingleOverviewViewModelDjBIcL.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                C55113xdn c55113xdn = this.$this_fetchTrendAddresses.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
                C29652kxg c29652kxg2 = this.this$0;
                C21600hFj c21600hFj = this.$this_fetchTrendAddresses;
                Context context = this.$context;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                    List list = (List) objEZpvd;
                    if (true ^ list.isEmpty()) {
                        kMM.setData$default(c29652kxg2.OLrzqt(), list, null, 2, null);
                        RecyclerView recyclerView = c21600hFj.AubY;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                        recyclerView.setVisibility(0);
                    } else {
                        c21600hFj.AEQbTJ.setEmptyTypeImage(7);
                        C55173xeu c55173xeu = c21600hFj.AEQbTJ;
                        String string = context.getString(C23274hvD.Fragment.isConnected);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        c55173xeu.setSubTitle((CharSequence) string);
                        C55173xeu c55173xeu2 = c21600hFj.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                        c55173xeu2.setVisibility(0);
                    }
                }
                C21600hFj c21600hFj2 = this.$this_fetchTrendAddresses;
                Context context2 = this.$context;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    c21600hFj2.AEQbTJ.setEmptyTypeImage(2);
                    C55173xeu c55173xeu3 = c21600hFj2.AEQbTJ;
                    String string2 = context2.getString(C23274hvD.Fragment.RbMRq);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c55173xeu3.setSubTitle((CharSequence) string2);
                    C55173xeu c55173xeu4 = c21600hFj2.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                    c55173xeu4.setVisibility(0);
                }
                return Unit.INSTANCE;
            }
            c29652kxg = (C29652kxg) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c29652kxg.DbNXlk = ((Boolean) obj).booleanValue();
        C55113xdn c55113xdn2 = this.$this_fetchTrendAddresses.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        c55113xdn2.setVisibility(0);
        RecyclerView recyclerView2 = this.$this_fetchTrendAddresses.AubY;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setVisibility(8);
        C55173xeu c55173xeu5 = this.$this_fetchTrendAddresses.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu5, "");
        c55173xeu5.setVisibility(8);
        SignalSingleOverviewViewModel signalSingleOverviewViewModelDjBIcL2 = this.this$0.djBIcL();
        SignalUiModel signalUiModel = this.$signalTrend;
        this.L$0 = null;
        this.label = 2;
        objEZpvd = signalSingleOverviewViewModelDjBIcL2.EZpvd(signalUiModel, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        C55113xdn c55113xdn3 = this.$this_fetchTrendAddresses.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
        c55113xdn3.setVisibility(8);
        C29652kxg c29652kxg22 = this.this$0;
        C21600hFj c21600hFj3 = this.$this_fetchTrendAddresses;
        Context context3 = this.$context;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
        }
        C21600hFj c21600hFj22 = this.$this_fetchTrendAddresses;
        Context context22 = this.$context;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }
}
