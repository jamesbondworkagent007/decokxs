package o;

import com.okinc.buysell.domain.ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1;
import com.okinc.buysell.domain.ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$2;
import com.okinc.buysell.domain.ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.lyF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyG {
    public final InterfaceC31764mDa EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final lyF copydefault;

    @yCM
    public lyG(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull lyF lyf, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(lyf, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = lyf;
        this.EZpvd = interfaceC31764mDa;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0114 -> B:38:0x0117). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull TradeType tradeType, java.lang.Integer num, boolean z, boolean z2, java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>, OKServerException>> continuation) throws java.lang.Throwable {
        ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1 channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1;
        lyG lyg;
        AbstractC43419rot abstractC43419rot;
        lyG lyg2;
        java.util.Collection arrayList;
        java.util.Iterator it;
        if (continuation instanceof ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1) {
            channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1 = (ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1) continuation;
            int i = channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1.label = i - Integer.MIN_VALUE;
            } else {
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1 = new ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1(this, continuation);
            }
        }
        ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1 channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12 = channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$1;
        java.lang.Object objWithContext = channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            boolean zAYXKKw = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw();
            if (z2) {
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$2 channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$2 = new ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$2(this, tradeType, z, str, str2, str3, str4, num, str5, str6, zAYXKKw, null);
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$0 = this;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$2, channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12);
                objCopydefault = objCopydefault;
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                lyg = this;
                abstractC43419rot = (AbstractC43419rot) objWithContext;
            } else {
                CoroutineDispatcher coroutineDispatcher2 = this.KWHzl;
                ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3 channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3 = new ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3(this, tradeType, z, str, str2, str3, str4, num, zAYXKKw, null);
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$0 = this;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.label = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3, channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                lyg = this;
                abstractC43419rot = (AbstractC43419rot) objWithContext;
            }
        } else if (i2 == 1) {
            lyg = (lyG) channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            abstractC43419rot = (AbstractC43419rot) objWithContext;
        } else if (i2 == 2) {
            lyg = (lyG) channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            abstractC43419rot = (AbstractC43419rot) objWithContext;
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$3;
            it = (java.util.Iterator) channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$2;
            arrayList = (java.util.Collection) channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$1;
            lyg2 = (lyG) channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            lyF.TaskDescription taskDescription = (lyF.TaskDescription) objWithContext;
            if (!Intrinsics.EZpvd(taskDescription, lyF.TaskDescription.C0873TaskDescription.KWHzl)) {
                if (Intrinsics.EZpvd(taskDescription, lyF.TaskDescription.Application.OLrzqt)) {
                    channel.setGooglePayReadyToUse(true);
                } else if (Intrinsics.EZpvd(taskDescription, lyF.TaskDescription.Activity.copydefault)) {
                    channel.setGooglePaySupportedButNotSetup(true);
                } else {
                    if (!(taskDescription instanceof lyF.TaskDescription.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    channel = null;
                }
            }
            if (channel != null) {
                arrayList.add(channel);
            }
            if (it.hasNext()) {
                channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) it.next();
                lyF lyf = lyg2.copydefault;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$0 = lyg2;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$1 = arrayList;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$2 = it;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.L$3 = channel;
                channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12.label = 3;
                objWithContext = lyf.OLrzqt(channel, channelPaymentMethodUseCase$getBuySellChannelPaymentMethods$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                lyF.TaskDescription taskDescription2 = (lyF.TaskDescription) objWithContext;
                if (!Intrinsics.EZpvd(taskDescription2, lyF.TaskDescription.C0873TaskDescription.KWHzl)) {
                }
                if (channel != null) {
                }
                if (it.hasNext()) {
                    return new AbstractC43419rot.StateListAnimator((java.util.List) arrayList);
                }
            }
        }
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            java.util.List list = (java.util.List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            lyg2 = lyg;
            arrayList = new java.util.ArrayList();
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
