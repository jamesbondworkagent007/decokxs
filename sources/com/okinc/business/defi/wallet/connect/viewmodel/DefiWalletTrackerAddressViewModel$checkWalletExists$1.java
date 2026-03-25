package com.okinc.business.defi.wallet.connect.viewmodel;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.C13092czN;
import o.C16103edc;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressViewModel$checkWalletExists$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ long $chainId;
    Object L$0;
    int label;
    final /* synthetic */ C16103edc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressViewModel$checkWalletExists$1(C16103edc c16103edc, long j, String str, Continuation<? super DefiWalletTrackerAddressViewModel$checkWalletExists$1> continuation) {
        super(2, continuation);
        this.this$0 = c16103edc;
        this.$chainId = j;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressViewModel$checkWalletExists$1(this.this$0, this.$chainId, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTrackerAddressViewModel$checkWalletExists$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Channel channel;
        C16103edc.TaskDescription.C0839TaskDescription c0839TaskDescription;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16103edc c16103edc = this.this$0;
            long j = this.$chainId;
            Result.Application application2 = Result.Companion;
            C13092czN c13092czN = c16103edc.AEQbTJ;
            List<Long> listEZpvd = C56402yEa.EZpvd(C56443yFo.KWHzl(j));
            this.label = 1;
            obj = c13092czN.KWHzl(listEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                C16103edc c16103edc2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl("DefiWalletTrackerAddressViewModel", "checkWalletExists", thM7380exceptionOrNullimpl);
                    Channel channel2 = c16103edc2.KWHzl;
                    C16103edc.TaskDescription.Activity activity = new C16103edc.TaskDescription.Activity(thM7380exceptionOrNullimpl);
                    this.L$0 = obj2;
                    this.label = 4;
                    if (channel2.send(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Map) obj);
        obj2 = objM7377constructorimpl;
        long j2 = this.$chainId;
        C16103edc c16103edc3 = this.this$0;
        String str = this.$address;
        if (Result.m7384isSuccessimpl(obj2)) {
            List list = (List) ((Map) obj2).get(C56443yFo.KWHzl(j2));
            if (list == null || list.isEmpty()) {
                channel = c16103edc3.KWHzl;
                c0839TaskDescription = new C16103edc.TaskDescription.C0839TaskDescription(j2, str);
                this.L$0 = obj2;
                this.label = 3;
                if (channel.send(c0839TaskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (C59449zhJ.gEmmrt((String) it.next(), str, true)) {
                        Channel channel3 = c16103edc3.KWHzl;
                        C16103edc.TaskDescription.StateListAnimator stateListAnimator = C16103edc.TaskDescription.StateListAnimator.EZpvd;
                        this.L$0 = obj2;
                        this.label = 2;
                        if (channel3.send(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                channel = c16103edc3.KWHzl;
                c0839TaskDescription = new C16103edc.TaskDescription.C0839TaskDescription(j2, str);
                this.L$0 = obj2;
                this.label = 3;
                if (channel.send(c0839TaskDescription, this) == objCopydefault) {
                }
            }
            return Unit.INSTANCE;
        }
        C16103edc c16103edc22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
