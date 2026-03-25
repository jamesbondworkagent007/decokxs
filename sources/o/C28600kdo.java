package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.business.market.data.model.position_pnl.AddressLoginRequest;
import com.okinc.business.market.features.jwt.domain.GenerateAddressLoginRequestUseCase$generateRequest$1;
import com.okinc.business.market.features.jwt.domain.GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.jwt.domain.model.TonProof;
import com.okinc.business.market.features.jwt.domain.model.TronSignature;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28600kdo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C28599kdn EZpvd;
    public final kKG KWHzl;
    public final Json copydefault;

    @yCM
    public C28600kdo(@NotNull kKG kkg, @NotNull C28599kdn c28599kdn, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28599kdn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.KWHzl = kkg;
        this.EZpvd = c28599kdn;
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = json;
    }

    /* JADX INFO: renamed from: o.kdo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kdo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<AddressLoginRequest>> continuation) throws java.lang.Throwable {
        GenerateAddressLoginRequestUseCase$generateRequest$1 generateAddressLoginRequestUseCase$generateRequest$1;
        if (continuation instanceof GenerateAddressLoginRequestUseCase$generateRequest$1) {
            generateAddressLoginRequestUseCase$generateRequest$1 = (GenerateAddressLoginRequestUseCase$generateRequest$1) continuation;
            int i = generateAddressLoginRequestUseCase$generateRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateAddressLoginRequestUseCase$generateRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                generateAddressLoginRequestUseCase$generateRequest$1 = new GenerateAddressLoginRequestUseCase$generateRequest$1(this, continuation);
            }
        }
        GenerateAddressLoginRequestUseCase$generateRequest$1 generateAddressLoginRequestUseCase$generateRequest$12 = generateAddressLoginRequestUseCase$generateRequest$1;
        java.lang.Object objWithContext = generateAddressLoginRequestUseCase$generateRequest$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateAddressLoginRequestUseCase$generateRequest$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1 generateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1 = new GenerateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1(null, this, j, str, str2, str3);
            generateAddressLoginRequestUseCase$generateRequest$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, generateAddressLoginRequestUseCase$generateRequestyxL6bBk$$inlined$dexRunCatching$1, generateAddressLoginRequestUseCase$generateRequest$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final AddressLoginRequest EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ = AEQbTJ(str2);
        return new AddressLoginRequest(str, strAEQbTJ == null ? "" : strAEQbTJ, java.lang.Long.valueOf(j), (java.lang.Integer) 2, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 4, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 2, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 248, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 5, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressLoginRequest(str, str2, java.lang.Long.valueOf(j), (java.lang.Integer) 3, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrCopydefault = this.EZpvd.copydefault(str);
        if (bArrCopydefault == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArrCopydefault) {
            java.lang.String str2 = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(b & UnsignedBytes.MAX_VALUE)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            sb.append(str2);
        }
        return EIP1271Verifier.hexPrefix + ((java.lang.Object) sb);
    }

    public final AddressLoginRequest AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Json json = this.copydefault;
        json.getSerializersModule();
        TonProof tonProof = (TonProof) json.decodeFromString(TonProof.Companion.serializer(), str2);
        return new AddressLoginRequest(str, tonProof.getProof().getSignature(), java.lang.Long.valueOf(j), (java.lang.Integer) 7, str3, java.lang.Long.valueOf(C33129mqd.valueOf(java.lang.Integer.valueOf(tonProof.getProof().getTimestamp()))), (java.lang.String) null, (java.lang.String) null, 192, (DefaultConstructorMarker) null);
    }

    public final AddressLoginRequest copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Json json = this.copydefault;
        json.getSerializersModule();
        return new AddressLoginRequest(str, StringsKt__StringsKt.KWHzl((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(((TronSignature) json.decodeFromString(TronSignature.Companion.serializer(), str2)).getSignature()), (java.lang.CharSequence) EIP1271Verifier.hexPrefix), java.lang.Long.valueOf(j), (java.lang.Integer) null, str3, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 232, (DefaultConstructorMarker) null);
    }
}
