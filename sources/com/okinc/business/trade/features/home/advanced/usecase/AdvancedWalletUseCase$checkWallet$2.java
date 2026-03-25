package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.trade.features.home.ui.cefi.common.WalletType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC30595leC;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedWalletUseCase$checkWallet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC30595leC>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $needSmartWallet;
    int label;
    final /* synthetic */ C28196kSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedWalletUseCase$checkWallet$2(C28196kSl c28196kSl, boolean z, String str, Continuation<? super AdvancedWalletUseCase$checkWallet$2> continuation) {
        super(2, continuation);
        this.this$0 = c28196kSl;
        this.$needSmartWallet = z;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedWalletUseCase$checkWallet$2(this.this$0, this.$needSmartWallet, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC30595leC> continuation) {
        return ((AdvancedWalletUseCase$checkWallet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28196kSl c28196kSl = this.this$0;
            this.label = 1;
            obj = c28196kSl.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (Intrinsics.EZpvd(obj, C56443yFo.KWHzl(false))) {
                    this.this$0.KWHzl();
                    this.this$0.EZpvd();
                    return null;
                }
                return new InterfaceC30595leC.ContentResolver(WalletType.UNSUPPORTED, null, null, 6, null);
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        if (interfaceC9738bbJ == null || interfaceC9738bbJ.zsXlph()) {
            return new InterfaceC30595leC.Application(this.$needSmartWallet);
        }
        if (interfaceC9738bbJ.ORxRYg()) {
            return new InterfaceC30595leC.ContentResolver(WalletType.MPC, null, null, 6, null);
        }
        if (interfaceC9738bbJ.getFieldNames()) {
            return new InterfaceC30595leC.ContentResolver(WalletType.AA, null, null, 6, null);
        }
        if (interfaceC9738bbJ.QfsBiF()) {
            return new InterfaceC30595leC.ContentResolver(WalletType.TRACKING, null, null, 6, null);
        }
        C28196kSl c28196kSl2 = this.this$0;
        String str = this.$chainId;
        this.label = 2;
        obj = c28196kSl2.EZpvd(str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        if (Intrinsics.EZpvd(obj, C56443yFo.KWHzl(false))) {
        }
    }
}
