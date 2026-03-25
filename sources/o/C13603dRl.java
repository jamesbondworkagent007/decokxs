package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.jwt.AddressLoginRequest;
import com.okinc.business.defi.jwt.domain.GenerateAddressLoginRequestUseCase$generateRequest$1;
import com.okinc.business.defi.jwt.domain.GenerateAddressLoginRequestUseCase$isAAWallet$2;
import com.okinc.business.defi.jwt.domain.GenerateAddressLoginRequestUseCase$isWalletExist$1;
import com.okinc.business.defi.jwt.model.TonProof;
import com.okinc.business.defi.jwt.model.TronSignature;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13603dRl {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C10948byA AEQbTJ;
    public final xYW AhwBna;
    public final C12827cuN EZpvd;
    public final Json KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C13603dRl(@NotNull C12827cuN c12827cuN, @NotNull xYW xyw, @NotNull C10948byA c10948byA, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(xyw, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.EZpvd = c12827cuN;
        this.AhwBna = xyw;
        this.AEQbTJ = c10948byA;
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = json;
    }

    /* JADX INFO: renamed from: o.dRl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dRl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<java.lang.Boolean> KWHzl() {
        return FlowKt.m7441catch(C11607cUn.copydefault((AbstractC58260yxt) this.EZpvd.OLrzqt(false)), new GenerateAddressLoginRequestUseCase$isWalletExist$1(null));
    }

    public final Flow<InterfaceC9738bbJ> AEQbTJ() {
        return C11607cUn.OLrzqt(this.EZpvd.KWHzl());
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GenerateAddressLoginRequestUseCase$isAAWallet$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<AddressLoginRequest>> continuation) throws java.lang.Throwable {
        GenerateAddressLoginRequestUseCase$generateRequest$1 generateAddressLoginRequestUseCase$generateRequest$1;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        long j2;
        C13603dRl c13603dRl;
        AddressLoginRequest addressLoginRequestEZpvd;
        if (continuation instanceof GenerateAddressLoginRequestUseCase$generateRequest$1) {
            generateAddressLoginRequestUseCase$generateRequest$1 = (GenerateAddressLoginRequestUseCase$generateRequest$1) continuation;
            int i = generateAddressLoginRequestUseCase$generateRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateAddressLoginRequestUseCase$generateRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                generateAddressLoginRequestUseCase$generateRequest$1 = new GenerateAddressLoginRequestUseCase$generateRequest$1(this, continuation);
            }
        }
        java.lang.Object obj = generateAddressLoginRequestUseCase$generateRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateAddressLoginRequestUseCase$generateRequest$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C10854bwM c10854bwMCopydefault = this.AEQbTJ.copydefault(j);
                if (c10854bwMCopydefault != null && c10854bwMCopydefault.fARcdN()) {
                    addressLoginRequestEZpvd = AEQbTJ(str, str2, j);
                } else if (c10854bwMCopydefault != null && c10854bwMCopydefault.ixgjPv()) {
                    addressLoginRequestEZpvd = copydefault(str, str2, j);
                } else if (c10854bwMCopydefault != null && c10854bwMCopydefault.DCUTEIdCUTEI()) {
                    addressLoginRequestEZpvd = OLrzqt(str, str2, j);
                } else if (c10854bwMCopydefault != null && c10854bwMCopydefault.fIwbmz()) {
                    addressLoginRequestEZpvd = AEQbTJ(str, str2, j, str3);
                } else if (c10854bwMCopydefault != null && c10854bwMCopydefault.DGOPHZ()) {
                    addressLoginRequestEZpvd = OLrzqt(str, str2, j, str3);
                } else if (c10854bwMCopydefault != null && c10854bwMCopydefault.iRxXKY()) {
                    addressLoginRequestEZpvd = copydefault(str, str2, j, str3);
                } else if (c10854bwMCopydefault != null && c10854bwMCopydefault.run()) {
                    addressLoginRequestEZpvd = EZpvd(str, str2, j, str3);
                } else {
                    generateAddressLoginRequestUseCase$generateRequest$1.L$0 = this;
                    generateAddressLoginRequestUseCase$generateRequest$1.L$1 = str;
                    generateAddressLoginRequestUseCase$generateRequest$1.L$2 = str2;
                    generateAddressLoginRequestUseCase$generateRequest$1.L$3 = str3;
                    generateAddressLoginRequestUseCase$generateRequest$1.J$0 = j;
                    generateAddressLoginRequestUseCase$generateRequest$1.label = 1;
                    java.lang.Object objKWHzl = KWHzl(generateAddressLoginRequestUseCase$generateRequest$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str;
                    str5 = str3;
                    obj = objKWHzl;
                    str6 = str2;
                    j2 = j;
                    c13603dRl = this;
                }
                return Result.m7377constructorimpl(addressLoginRequestEZpvd);
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = generateAddressLoginRequestUseCase$generateRequest$1.J$0;
            str5 = (java.lang.String) generateAddressLoginRequestUseCase$generateRequest$1.L$3;
            java.lang.String str7 = (java.lang.String) generateAddressLoginRequestUseCase$generateRequest$1.L$2;
            java.lang.String str8 = (java.lang.String) generateAddressLoginRequestUseCase$generateRequest$1.L$1;
            c13603dRl = (C13603dRl) generateAddressLoginRequestUseCase$generateRequest$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str6 = str7;
            str4 = str8;
            if (((java.lang.Boolean) obj).booleanValue()) {
                addressLoginRequestEZpvd = c13603dRl.KWHzl(str4, str6, j2, str5);
            } else {
                addressLoginRequestEZpvd = new AddressLoginRequest(str4, str6, C56443yFo.KWHzl(j2), (java.lang.Integer) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 248, (DefaultConstructorMarker) null);
            }
            return Result.m7377constructorimpl(addressLoginRequestEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final AddressLoginRequest AEQbTJ(java.lang.String str, java.lang.String str2, long j) {
        java.lang.String strEZpvd = EZpvd(str2);
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        return new AddressLoginRequest(str, strEZpvd, java.lang.Long.valueOf(j), (java.lang.Integer) 2, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest copydefault(java.lang.String str, java.lang.String str2, long j) {
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 4, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest AEQbTJ(java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 2, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest OLrzqt(java.lang.String str, java.lang.String str2, long j) {
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 248, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest copydefault(java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 5, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest KWHzl(java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 3, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String strKWHzl = this.AhwBna.KWHzl(str);
            if (strKWHzl.length() == 0) {
                return null;
            }
            return strKWHzl;
        } catch (java.lang.Exception e) {
            C10856bwO.copydefault("GenerateAddressLoginRequestUseCase", 0, "decodeBase58ToHex: " + e.getMessage());
            return null;
        }
    }

    public final AddressLoginRequest EZpvd(java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
        Json json = this.KWHzl;
        json.getSerializersModule();
        return new AddressLoginRequest(str, StringsKt__StringsKt.KWHzl((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(((TronSignature) json.decodeFromString(TronSignature.Companion.serializer(), str2)).getSignature()), (java.lang.CharSequence) EIP1271Verifier.hexPrefix), java.lang.Long.valueOf(j), (java.lang.Integer) null, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 232, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest OLrzqt(java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
        Json json = this.KWHzl;
        json.getSerializersModule();
        return new AddressLoginRequest(str, ((TonProof) json.decodeFromString(TonProof.Companion.serializer(), str2)).getProof().getSignature(), java.lang.Long.valueOf(j), (java.lang.Integer) 7, str3, java.lang.Long.valueOf(r1.getProof().getTimestamp()), (java.lang.String) null, (java.lang.String) null, 192, (DefaultConstructorMarker) null);
    }
}
