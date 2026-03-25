package com.okinc.okmarket.home;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C35047nnu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27808kEb;
import o.qZH;
import o.sZU;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$addTabClickEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $tag;
    Object L$0;
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$addTabClickEvent$1(Integer num, MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$addTabClickEvent$1> continuation) {
        super(2, continuation);
        this.$tag = num;
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$addTabClickEvent$1(this.$tag, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$addTabClickEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        Object objM7377constructorimpl;
        String strWlaJM;
        String str3;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = this.$tag;
            int i2 = qZH.PendingIntent.QKVWgx;
            if (num != null && num.intValue() == i2) {
                str = "favorite";
            } else {
                int i3 = qZH.PendingIntent.UeEOUB;
                if (num != null && num.intValue() == i3) {
                    str = "hot";
                } else {
                    int i4 = qZH.PendingIntent.RKDWNf;
                    if (num != null && num.intValue() == i4) {
                        str = "gainers";
                    } else {
                        int i5 = qZH.PendingIntent.RcXXUw;
                        if (num != null && num.intValue() == i5) {
                            str = OtpEventTracker.OTP_EVENT_VALUE_NEW;
                        } else {
                            int i6 = qZH.PendingIntent.DKtBnz;
                            if (num != null && num.intValue() == i6) {
                                str = "cedefi";
                            } else {
                                str = (num != null && num.intValue() == qZH.PendingIntent.GqbzPL) ? "stocks" : "";
                            }
                        }
                    }
                }
            }
            Integer num2 = this.$tag;
            int i7 = qZH.PendingIntent.QKVWgx;
            if (num2 != null && num2.intValue() == i7) {
                MarketHomeV2ViewModel marketHomeV2ViewModelAubY = this.this$0.AubY();
                this.L$0 = str;
                this.label = 1;
                Object objAEQbTJ = marketHomeV2ViewModelAubY.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str;
                obj = objAEQbTJ;
            } else {
                int i8 = qZH.PendingIntent.RcXXUw;
                if (num2 != null && num2.intValue() == i8) {
                    MarketHomeV2Fragment marketHomeV2Fragment = this.this$0;
                    try {
                        Result.Application application = Result.Companion;
                        FragmentStateAdapter fragmentStateAdapter = marketHomeV2Fragment.isConnected;
                        sZU szu = fragmentStateAdapter instanceof sZU ? (sZU) fragmentStateAdapter : null;
                        Fragment fragmentCopydefault = szu != null ? szu.copydefault(3) : null;
                        C35047nnu c35047nnu = fragmentCopydefault instanceof C35047nnu ? (C35047nnu) fragmentCopydefault : null;
                        if (c35047nnu == null || (strWlaJM = c35047nnu.wlaJM()) == null) {
                            strWlaJM = "spot";
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(strWlaJM);
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    str2 = (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                } else {
                    str2 = null;
                }
                interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
                if (interfaceC27808kEbEZpvd != null) {
                    interfaceC27808kEbEZpvd.EZpvd(str, str2);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str4 = str3;
        str2 = (String) obj;
        str = str4;
        interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
        if (interfaceC27808kEbEZpvd != null) {
        }
        return Unit.INSTANCE;
    }
}
