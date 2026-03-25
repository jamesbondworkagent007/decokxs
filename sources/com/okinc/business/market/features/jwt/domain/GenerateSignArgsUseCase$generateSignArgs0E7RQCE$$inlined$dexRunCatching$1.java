package com.okinc.business.market.features.jwt.domain;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.NostrSignType;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import com.okinc.business.market.data.model.GetSignMessageResponse;
import com.okinc.business.market.data.model.StarkNetSignData;
import com.okinc.business.market.data.model.TonSignData;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C28601kdp;
import o.C28602kdq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27595jyE;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.GenerateSignArgsUseCase$generateSignArgs-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DappSignArgs>>, Object> {
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ long $chainId$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C28601kdp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C28601kdp c28601kdp, String str, long j) {
        super(2, continuation);
        this.this$0 = c28601kdp;
        this.$address$inlined = str;
        this.$chainId$inlined = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$address$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DappSignArgs>> continuation) {
        return ((GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[Catch: all -> 0x0140, CancellationException -> 0x0157, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0157, all -> 0x0140, blocks: (B:9:0x002a, B:51:0x0105, B:14:0x0047, B:35:0x00c3, B:45:0x00e1, B:47:0x00e5, B:18:0x0053, B:32:0x00ad, B:19:0x005f, B:25:0x007b, B:27:0x0085, B:28:0x0093, B:22:0x0068), top: B:59:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault;
        GetSignMessageResponse getSignMessageResponse;
        String str;
        Object objCopydefault2;
        Object objAEQbTJ;
        PlatformItem platformItem;
        String str2;
        String str3;
        TronSignMethodVersion tronSignMethodVersion;
        GetSignMessageResponse getSignMessageResponse2;
        Object objCopydefault3 = C56442yFn.copydefault();
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
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.AEQbTJ;
            String str4 = this.$address$inlined;
            this.label = 1;
            objEZpvd = interfaceC27595jyE.EZpvd(str4, this);
            if (objEZpvd == objCopydefault3) {
                return objCopydefault3;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    getSignMessageResponse = (GetSignMessageResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objCopydefault);
                    str = (String) objCopydefault;
                    C28601kdp c28601kdp = this.this$0;
                    long j = this.$chainId$inlined;
                    this.L$0 = str;
                    this.L$1 = getSignMessageResponse;
                    this.label = 3;
                    objCopydefault2 = c28601kdp.copydefault(j, this);
                    if (objCopydefault2 == objCopydefault3) {
                        return objCopydefault3;
                    }
                    String str5 = str;
                    PlatformItem platformItem2 = (PlatformItem) objCopydefault2;
                    long j2 = this.$chainId$inlined;
                    if (j2 == 0) {
                        if (j2 != 195) {
                        }
                        kKG kkg = this.this$0.copydefault;
                        this.L$0 = str5;
                        this.L$1 = getSignMessageResponse;
                        this.L$2 = platformItem2;
                        this.L$3 = str;
                        this.L$4 = tronSignMethodVersion;
                        this.label = 4;
                        objAEQbTJ = kkg.AEQbTJ(this);
                        if (objAEQbTJ != objCopydefault3) {
                        }
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    TronSignMethodVersion tronSignMethodVersion2 = (TronSignMethodVersion) this.L$4;
                    String str6 = (String) this.L$3;
                    PlatformItem platformItem3 = (PlatformItem) this.L$2;
                    getSignMessageResponse2 = (GetSignMessageResponse) this.L$1;
                    String str7 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj;
                    tronSignMethodVersion = tronSignMethodVersion2;
                    str2 = str6;
                    platformItem = platformItem3;
                    str3 = str7;
                    objM7377constructorimpl = Result.m7377constructorimpl(new DappSignArgs((String) objAEQbTJ, String.valueOf(this.$chainId$inlined), platformItem, str3, MpcSignType.NORMAL, true, C56443yFo.AEQbTJ(3), "dex", null, null, false, false, str2, null, null, getSignMessageResponse2.KWHzl(), null, tronSignMethodVersion, true, NostrSignType.MESSAGE, "V4", C56443yFo.KWHzl(false)));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                getSignMessageResponse = (GetSignMessageResponse) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault2 = obj;
                String str52 = str;
                PlatformItem platformItem22 = (PlatformItem) objCopydefault2;
                long j22 = this.$chainId$inlined;
                String str8 = (j22 == 0 || j22 == 70000061) ? "btc_message" : null;
                TronSignMethodVersion tronSignMethodVersion3 = j22 != 195 ? TronSignMethodVersion.V1 : null;
                kKG kkg2 = this.this$0.copydefault;
                this.L$0 = str52;
                this.L$1 = getSignMessageResponse;
                this.L$2 = platformItem22;
                this.L$3 = str8;
                this.L$4 = tronSignMethodVersion3;
                this.label = 4;
                objAEQbTJ = kkg2.AEQbTJ(this);
                if (objAEQbTJ != objCopydefault3) {
                    return objCopydefault3;
                }
                platformItem = platformItem22;
                str2 = str8;
                str3 = str52;
                tronSignMethodVersion = tronSignMethodVersion3;
                getSignMessageResponse2 = getSignMessageResponse;
                objM7377constructorimpl = Result.m7377constructorimpl(new DappSignArgs((String) objAEQbTJ, String.valueOf(this.$chainId$inlined), platformItem, str3, MpcSignType.NORMAL, true, C56443yFo.AEQbTJ(3), "dex", null, null, false, false, str2, null, null, getSignMessageResponse2.KWHzl(), null, tronSignMethodVersion, true, NostrSignType.MESSAGE, "V4", C56443yFo.KWHzl(false)));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        GetSignMessageResponse getSignMessageResponse3 = (GetSignMessageResponse) ((ResponseData) objEZpvd).getData();
        if (getSignMessageResponse3 == null) {
            getSignMessageResponse3 = new GetSignMessageResponse((String) null, (TonSignData) null, (StarkNetSignData) null, (String) null, 15, (DefaultConstructorMarker) null);
        }
        GetSignMessageResponse getSignMessageResponse4 = getSignMessageResponse3;
        C28602kdq c28602kdq = this.this$0.KWHzl;
        String str9 = this.$address$inlined;
        long j3 = this.$chainId$inlined;
        this.L$0 = getSignMessageResponse4;
        this.label = 2;
        objCopydefault = c28602kdq.copydefault(getSignMessageResponse4, str9, j3, this);
        if (objCopydefault == objCopydefault3) {
            return objCopydefault3;
        }
        getSignMessageResponse = getSignMessageResponse4;
        C56391yDq.AEQbTJ(objCopydefault);
        str = (String) objCopydefault;
        C28601kdp c28601kdp2 = this.this$0;
        long j4 = this.$chainId$inlined;
        this.L$0 = str;
        this.L$1 = getSignMessageResponse;
        this.label = 3;
        objCopydefault2 = c28601kdp2.copydefault(j4, this);
        if (objCopydefault2 == objCopydefault3) {
        }
        String str522 = str;
        PlatformItem platformItem222 = (PlatformItem) objCopydefault2;
        long j222 = this.$chainId$inlined;
        if (j222 == 0) {
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
