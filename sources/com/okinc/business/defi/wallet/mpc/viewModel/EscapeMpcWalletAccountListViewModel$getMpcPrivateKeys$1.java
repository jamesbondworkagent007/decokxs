package com.okinc.business.defi.wallet.mpc.viewModel;

import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C10964byQ;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static int AEQbTJ;
    public static int EZpvd;
    final /* synthetic */ int $addressIndex;
    final /* synthetic */ String $password;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EscapeMpcWalletAccountListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1(EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel, int i, String str, Continuation<? super EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1> continuation) {
        super(2, continuation);
        this.this$0 = escapeMpcWalletAccountListViewModel;
        this.$addressIndex = i;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1(this.this$0, this.$addressIndex, this.$password, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel.AhwBna(com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel):java.lang.String */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel;
        String str;
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
            EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel2 = this.this$0;
            int i2 = this.$addressIndex;
            String str2 = this.$password;
            Result.Application application2 = Result.Companion;
            escapeMpcWalletAccountListViewModel2.AEQbTJ(i2);
            AbstractC58260yxt<String> abstractC58260yxtAhwBna = escapeMpcWalletAccountListViewModel2.OLrzqt.AhwBna(str2);
            this.L$0 = escapeMpcWalletAccountListViewModel2;
            this.L$1 = str2;
            this.label = 1;
            Object objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            escapeMpcWalletAccountListViewModel = escapeMpcWalletAccountListViewModel2;
            obj = objAwait;
            str = str2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault(escapeMpcWalletAccountListViewModel3.valueOf, "getMpcPrivateKeys error message =" + thM7380exceptionOrNullimpl.getMessage());
                    Channel channel = escapeMpcWalletAccountListViewModel3.AEQbTJ;
                    ArrayList arrayList = new ArrayList();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 3;
                    if (channel.send(arrayList, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$1;
            escapeMpcWalletAccountListViewModel = (EscapeMpcWalletAccountListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = (String) obj;
        Intrinsics.copydefault((Object) str3);
        AbstractC12784ctX abstractC12784ctXAhwBna = escapeMpcWalletAccountListViewModel.AhwBna();
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctXAhwBna != null ? abstractC12784ctXAhwBna.isConnected() : null;
        Intrinsics.copydefault(mpcWalletEncodeInfoIsConnected);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str3, mpcWalletEncodeInfoIsConnected);
        if (mpcWalletDecodeInfoOLrzqt.getEcdsaShare3().length() == 0 || mpcWalletDecodeInfoOLrzqt.getEd25519Share3().length() == 0) {
            escapeMpcWalletAccountListViewModel.KWHzl(new EscapeMpcWalletAccountListViewModel.Application(mpcWalletDecodeInfoOLrzqt, str, str3));
            Channel channel2 = escapeMpcWalletAccountListViewModel.AEQbTJ;
            ArrayList arrayList2 = new ArrayList();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (channel2.send(arrayList2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            escapeMpcWalletAccountListViewModel.AEQbTJ(mpcWalletDecodeInfoOLrzqt);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static int AEQbTJ() {
        int i = EZpvd;
        int i2 = i % 6351582;
        EZpvd = i + 1;
        if (i2 != 0) {
            return AEQbTJ;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        AEQbTJ = iMaxMemory;
        return iMaxMemory;
    }
}
