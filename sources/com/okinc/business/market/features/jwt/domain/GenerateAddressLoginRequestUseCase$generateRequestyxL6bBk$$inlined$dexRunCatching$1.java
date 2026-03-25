package com.okinc.business.market.features.jwt.domain;

import com.okinc.business.market.data.model.position_pnl.AddressLoginRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C28600kdo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9731bbC;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.GenerateAddressLoginRequestUseCase$generateRequest-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AddressLoginRequest>>, Object> {
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ long $chainId$inlined;
    final /* synthetic */ String $publicKey$inlined;
    final /* synthetic */ String $signingResult$inlined;
    int label;
    final /* synthetic */ C28600kdo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C28600kdo c28600kdo, long j, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c28600kdo;
        this.$chainId$inlined = j;
        this.$address$inlined = str;
        this.$signingResult$inlined = str2;
        this.$publicKey$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$address$inlined, this.$signingResult$inlined, this.$publicKey$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AddressLoginRequest>> continuation) {
        return ((GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da A[Catch: all -> 0x0120, CancellationException -> 0x0137, TryCatch #2 {CancellationException -> 0x0137, all -> 0x0120, blocks: (B:6:0x000e, B:49:0x00d2, B:51:0x00da, B:55:0x011b, B:52:0x00e9, B:10:0x001b, B:16:0x003b, B:19:0x0042, B:21:0x0046, B:23:0x004c, B:24:0x005a, B:26:0x0062, B:29:0x0074, B:37:0x0094, B:45:0x00b6, B:46:0x00c3, B:53:0x0102, B:54:0x010f, B:13:0x0028), top: B:63:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9 A[Catch: all -> 0x0120, CancellationException -> 0x0137, TryCatch #2 {CancellationException -> 0x0137, all -> 0x0120, blocks: (B:6:0x000e, B:49:0x00d2, B:51:0x00da, B:55:0x011b, B:52:0x00e9, B:10:0x001b, B:16:0x003b, B:19:0x0042, B:21:0x0046, B:23:0x004c, B:24:0x005a, B:26:0x0062, B:29:0x0074, B:37:0x0094, B:45:0x00b6, B:46:0x00c3, B:53:0x0102, B:54:0x010f, B:13:0x0028), top: B:63:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        AddressLoginRequest addressLoginRequestEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            kKG kkg = this.this$0.KWHzl;
            long j = this.$chainId$inlined;
            this.label = 1;
            objAEQbTJ = kkg.AEQbTJ(j, true, (Continuation<? super Result<? extends InterfaceC9731bbC>>) this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                addressLoginRequestEZpvd = !((Boolean) obj).booleanValue() ? this.this$0.OLrzqt(this.$address$inlined, this.$signingResult$inlined, this.$chainId$inlined, this.$publicKey$inlined) : new AddressLoginRequest(this.$address$inlined, this.$signingResult$inlined, C56443yFo.KWHzl(this.$chainId$inlined), (Integer) null, (String) null, (Long) null, (String) null, (String) null, 248, (DefaultConstructorMarker) null);
                objM7377constructorimpl = Result.m7377constructorimpl(addressLoginRequestEZpvd);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        InterfaceC9731bbC interfaceC9731bbC = (InterfaceC9731bbC) objAEQbTJ;
        if (interfaceC9731bbC == null || !interfaceC9731bbC.fARcdN()) {
            long j2 = this.$chainId$inlined;
            if (j2 == 784) {
                addressLoginRequestEZpvd = this.this$0.AEQbTJ(this.$address$inlined, this.$signingResult$inlined, j2);
            } else if (j2 == 9004) {
                addressLoginRequestEZpvd = this.this$0.OLrzqt(this.$address$inlined, this.$signingResult$inlined, j2);
            } else if (j2 == 637 || j2 == -2003) {
                addressLoginRequestEZpvd = this.this$0.EZpvd(this.$address$inlined, this.$signingResult$inlined, j2, this.$publicKey$inlined);
            } else if (j2 == 607) {
                addressLoginRequestEZpvd = this.this$0.AEQbTJ(this.$address$inlined, this.$signingResult$inlined, j2, this.$publicKey$inlined);
            } else if (j2 == 0 || j2 == 70000061) {
                addressLoginRequestEZpvd = this.this$0.KWHzl(this.$address$inlined, this.$signingResult$inlined, j2, this.$publicKey$inlined);
            } else if (j2 == 195) {
                addressLoginRequestEZpvd = this.this$0.copydefault(this.$address$inlined, this.$signingResult$inlined, j2, this.$publicKey$inlined);
            } else {
                kKG kkg2 = this.this$0.KWHzl;
                this.label = 2;
                obj = kkg2.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            addressLoginRequestEZpvd = this.this$0.EZpvd(this.$address$inlined, this.$signingResult$inlined, this.$chainId$inlined);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(addressLoginRequestEZpvd);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
