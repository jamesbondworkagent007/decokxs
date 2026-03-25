package com.okinc.business.defi.wallet.hardware.keystone;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13458dMb;
import o.C13758dXe;
import o.C14140dfo;
import o.C14458dlo;
import o.C14459dlp;
import o.C56391yDq;
import o.C56442yFn;
import o.C9678baC;
import o.InterfaceC14457dln;

/* JADX INFO: loaded from: classes5.dex */
public final class KeystoneSelectAccountViewModel$createKeystoneWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KeystoneSelectAccountViewModel.KeystoneAccountInfo $accountInfo;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function1<AbstractC12782ctV, Unit> $callback;
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ int $mode;
    Object L$0;
    int label;
    final /* synthetic */ KeystoneSelectAccountViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KeystoneSelectAccountViewModel$createKeystoneWallet$1(KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo, KeystoneSelectAccountViewModel keystoneSelectAccountViewModel, int i, Activity activity, FragmentManager fragmentManager, Function1<? super AbstractC12782ctV, Unit> function1, Continuation<? super KeystoneSelectAccountViewModel$createKeystoneWallet$1> continuation) {
        super(2, continuation);
        this.$accountInfo = keystoneAccountInfo;
        this.this$0 = keystoneSelectAccountViewModel;
        this.$mode = i;
        this.$activity = activity;
        this.$fm = fragmentManager;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeystoneSelectAccountViewModel$createKeystoneWallet$1(this.$accountInfo, this.this$0, this.$mode, this.$activity, this.$fm, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeystoneSelectAccountViewModel$createKeystoneWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        InterfaceC14457dln c14458dlo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            list = list2;
        } else {
            C56391yDq.AEQbTJ(obj);
            List<KeystoneAddressInfo> addressList = this.$accountInfo.getAddressList();
            KeystoneSelectAccountViewModel keystoneSelectAccountViewModel = this.this$0;
            KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo = this.$accountInfo;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : addressList) {
                if (keystoneSelectAccountViewModel.KWHzl((KeystoneAddressInfo) obj2, keystoneAccountInfo)) {
                    arrayList.add(obj2);
                }
            }
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).isConnected();
            KeystoneAddressInfo keystoneAddressInfo = (KeystoneAddressInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            this.L$0 = arrayList;
            this.label = 1;
            obj = c13758dXeIsConnected.KWHzl(keystoneAddressInfo, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.KWHzl();
        } else {
            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
            KeystoneMultiAccount keystoneMultiAccount = this.this$0.EZpvd;
            if (keystoneMultiAccount == null) {
                return Unit.INSTANCE;
            }
            int index = this.$accountInfo.getIndex();
            if (this.$mode == 1) {
                c14458dlo = new C14459dlp(this.$activity, false, 2, null);
            } else {
                c14458dlo = new C14458dlo(this.$activity);
            }
            this.this$0.call().AEQbTJ(instance$default.OLrzqt(keystoneMultiAccount, index, (List<KeystoneAddressInfo>) list, c14458dlo, this.$fm, (Function1<? super AbstractC12782ctV, Unit>) ((32 & 32) != 0 ? null : null), (Function1<? super AbstractC12782ctV, Unit>) this.$callback));
        }
        return Unit.INSTANCE;
    }
}
