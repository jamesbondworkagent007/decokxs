package com.okinc.business.market.features.position.domain;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29123knh;
import o.C29123knh.Application;
import o.C31256lqb;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29133knr;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PnLDetailsUiModel>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $customAddress$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    int label;
    final /* synthetic */ C29123knh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, C29123knh c29123knh, String str2, String str3) {
        super(2, continuation);
        this.$customAddress$inlined = str;
        this.this$0 = c29123knh;
        this.$chainId$inlined = str2;
        this.$tokenAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$customAddress$inlined, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PnLDetailsUiModel>> continuation) {
        return ((GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe A[Catch: all -> 0x013d, CancellationException -> 0x0154, TryCatch #2 {CancellationException -> 0x0154, all -> 0x013d, blocks: (B:6:0x0010, B:33:0x00f0, B:35:0x00fe, B:37:0x0129, B:10:0x001d, B:18:0x0050, B:20:0x007e, B:22:0x008e, B:24:0x0096, B:26:0x00aa, B:28:0x00b3, B:30:0x00e1, B:36:0x0123, B:27:0x00af, B:13:0x0026, B:15:0x003d, B:38:0x012e, B:39:0x013c), top: B:46:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        PnLDetailsUiModel value;
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
            String strKWHzl = C31256lqb.KWHzl(this.$customAddress$inlined, this.this$0.new Application(this.$chainId$inlined));
            if (strKWHzl.length() == 0) {
                throw new OKServerException(6, "wallet is not supported", null, null, 12, null);
            }
            InterfaceC29133knr interfaceC29133knr = this.this$0.valueOf;
            String str = this.$chainId$inlined;
            String str2 = this.$tokenAddress$inlined;
            this.label = 1;
            objEZpvd = interfaceC29133knr.EZpvd(strKWHzl, str, str2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                value = this.this$0.copydefault().getValue();
                if (value == null) {
                    value = new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(value);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        PnLDetailsUiModel pnLDetailsUiModelCopydefault = this.this$0.djBIcL.copydefault(this.this$0.djBIcL.AEQbTJ((LatestPnLData) ((AbstractC43419rot) objEZpvd).AEQbTJ()));
        PnLDetailsUiModel pnLDetailsUiModel = (Intrinsics.EZpvd((Object) this.this$0.OLrzqt.djBIcL(), (Object) this.$tokenAddress$inlined) && C33129mqd.OLrzqt((CharSequence) this.this$0.OLrzqt.AuCTel())) ? this.this$0.OLrzqt : pnLDetailsUiModelCopydefault;
        this.this$0.OLrzqt = pnLDetailsUiModelCopydefault.OLrzqt((393215 & 1) != 0 ? pnLDetailsUiModelCopydefault.AYXKKw : false, (393215 & 2) != 0 ? pnLDetailsUiModelCopydefault.DbNXlk : null, (393215 & 4) != 0 ? pnLDetailsUiModelCopydefault.isConnected : null, (393215 & 8) != 0 ? pnLDetailsUiModelCopydefault.AkhnZx : null, (393215 & 16) != 0 ? pnLDetailsUiModelCopydefault.KWHzl : null, (393215 & 32) != 0 ? pnLDetailsUiModelCopydefault.valueOf : null, (393215 & 64) != 0 ? pnLDetailsUiModelCopydefault.fJNWhG : null, (393215 & 128) != 0 ? pnLDetailsUiModelCopydefault.AuCTel : null, (393215 & 256) != 0 ? pnLDetailsUiModelCopydefault.AhwBna : null, (393215 & 512) != 0 ? pnLDetailsUiModelCopydefault.djBIcL : null, (393215 & 1024) != 0 ? pnLDetailsUiModelCopydefault.copydefault : null, (393215 & 2048) != 0 ? pnLDetailsUiModelCopydefault.EZpvd : null, (393215 & 4096) != 0 ? pnLDetailsUiModelCopydefault.fetchVPNInfo : null, (393215 & 8192) != 0 ? pnLDetailsUiModelCopydefault.fIwbmz : null, (393215 & 16384) != 0 ? pnLDetailsUiModelCopydefault.fARcdN : pnLDetailsUiModel.AuCTel(), (393215 & 32768) != 0 ? pnLDetailsUiModelCopydefault.values : this.$tokenAddress$inlined, (393215 & 65536) != 0 ? pnLDetailsUiModelCopydefault.gEmmrt : null, (393215 & 131072) != 0 ? pnLDetailsUiModelCopydefault.AEQbTJ : pnLDetailsUiModel.AEQbTJ().length() > 0 ? pnLDetailsUiModel.AEQbTJ() : pnLDetailsUiModelCopydefault.AEQbTJ(), (393215 & 262144) != 0 ? pnLDetailsUiModelCopydefault.OLrzqt : pnLDetailsUiModel.copydefault());
        if (this.$customAddress$inlined.length() != 0) {
            value = this.this$0.OLrzqt;
            objM7377constructorimpl = Result.m7377constructorimpl(value);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        C29123knh c29123knh = this.this$0;
        String str3 = this.$chainId$inlined;
        String str4 = this.$tokenAddress$inlined;
        this.label = 2;
        if (c29123knh.AEQbTJ(str3, str4, this) == objCopydefault) {
            return objCopydefault;
        }
        value = this.this$0.copydefault().getValue();
        if (value == null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(value);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
