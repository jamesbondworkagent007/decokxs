package com.reown.android.utils.cacao;

import com.ibm.icu.text.DateFormat;
import com.reown.android.cacao.SignatureInterface;
import com.reown.android.cacao.signature.ISignatureType;
import com.reown.android.cacao.signature.SignatureType;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.eip191.EIP191Signer;
import com.reown.android.internal.common.signing.signature.SignatureKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.text.Charsets;
import o.C56524yIo;
import o.C60088zvK;
import o.InterfaceC56555yJs;
import o.yDY;
import o.yHE;
import o.yJI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class CacaoSignerUtil {
    public static final /* synthetic */ <CoreSignature extends SignatureInterface, SDKSignature extends CoreSignature> CoreSignature sign(CacaoSignerInterface<CoreSignature> cacaoSignerInterface, String str, byte[] bArr, ISignatureType iSignatureType) throws Throwable {
        Intrinsics.checkNotNullParameter(cacaoSignerInterface, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iSignatureType, "");
        String header = iSignatureType.getHeader();
        if (Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP191.getHeader()) || Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP1271.getHeader())) {
            String header2 = iSignatureType.getHeader();
            EIP191Signer eIP191Signer = EIP191Signer.INSTANCE;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Cacao.Signature signature = new Cacao.Signature(header2, SignatureKt.toCacaoSignature(eIP191Signer.sign(bytes, bArr)), null, 4, null);
            Intrinsics.KWHzl(4, "SDKSignature");
            for (InterfaceC56555yJs interfaceC56555yJs : C56524yIo.AEQbTJ(SignatureInterface.class).AhwBna()) {
                if (hasCorrectOrderedParametersInConstructor(interfaceC56555yJs)) {
                    return (CoreSignature) interfaceC56555yJs.call(signature.getT(), signature.getS(), signature.getM());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new Throwable("SignatureType not recognized");
    }

    public static final /* synthetic */ <CoreSignature extends SignatureInterface, SDKSignature extends CoreSignature> CoreSignature signHex(CacaoSignerInterface<CoreSignature> cacaoSignerInterface, String str, byte[] bArr, ISignatureType iSignatureType) throws Throwable {
        Intrinsics.checkNotNullParameter(cacaoSignerInterface, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iSignatureType, "");
        String header = iSignatureType.getHeader();
        if (Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP191.getHeader()) || Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP1271.getHeader())) {
            String header2 = iSignatureType.getHeader();
            EIP191Signer eIP191Signer = EIP191Signer.INSTANCE;
            byte[] bArrCopydefault = C60088zvK.copydefault(str);
            Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
            Cacao.Signature signature = new Cacao.Signature(header2, SignatureKt.toCacaoSignature(eIP191Signer.sign(bArrCopydefault, bArr)), null, 4, null);
            Intrinsics.KWHzl(4, "SDKSignature");
            for (InterfaceC56555yJs interfaceC56555yJs : C56524yIo.AEQbTJ(SignatureInterface.class).AhwBna()) {
                if (hasCorrectOrderedParametersInConstructor(interfaceC56555yJs)) {
                    return (CoreSignature) interfaceC56555yJs.call(signature.getT(), signature.getS(), signature.getM());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new Throwable("SignatureType not recognized");
    }

    public static final <T extends SignatureInterface> T sign(@NotNull Class<T> cls, @NotNull String str, @NotNull byte[] bArr, @NotNull ISignatureType iSignatureType) throws Throwable {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iSignatureType, "");
        String header = iSignatureType.getHeader();
        if (Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP191.getHeader()) || Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP1271.getHeader())) {
            String header2 = iSignatureType.getHeader();
            EIP191Signer eIP191Signer = EIP191Signer.INSTANCE;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Cacao.Signature signature = new Cacao.Signature(header2, SignatureKt.toCacaoSignature(eIP191Signer.sign(bytes, bArr)), null, 4, null);
            for (InterfaceC56555yJs interfaceC56555yJs : yHE.KWHzl(cls).AhwBna()) {
                if (hasCorrectOrderedParametersInConstructor(interfaceC56555yJs)) {
                    return (T) interfaceC56555yJs.call(signature.getT(), signature.getS(), signature.getM());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new Throwable("SignatureType not recognized");
    }

    public static final <T extends SignatureInterface> T signHex(@NotNull Class<T> cls, @NotNull String str, @NotNull byte[] bArr, @NotNull ISignatureType iSignatureType) throws Throwable {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iSignatureType, "");
        String header = iSignatureType.getHeader();
        if (Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP191.getHeader()) || Intrinsics.EZpvd((Object) header, (Object) SignatureType.EIP1271.getHeader())) {
            String header2 = iSignatureType.getHeader();
            EIP191Signer eIP191Signer = EIP191Signer.INSTANCE;
            byte[] bArrCopydefault = C60088zvK.copydefault(str);
            Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
            Cacao.Signature signature = new Cacao.Signature(header2, SignatureKt.toCacaoSignature(eIP191Signer.sign(bArrCopydefault, bArr)), null, 4, null);
            for (InterfaceC56555yJs interfaceC56555yJs : yHE.KWHzl(cls).AhwBna()) {
                if (hasCorrectOrderedParametersInConstructor(interfaceC56555yJs)) {
                    return (T) interfaceC56555yJs.call(signature.getT(), signature.getS(), signature.getM());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new Throwable("SignatureType not recognized");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends SignatureInterface> boolean hasCorrectOrderedParametersInConstructor(@NotNull InterfaceC56555yJs<? extends T> interfaceC56555yJs) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(interfaceC56555yJs, "");
        List<KParameter> parameters = interfaceC56555yJs.getParameters();
        if (parameters.size() != 3) {
            parameters = null;
        }
        if (parameters == null) {
            return false;
        }
        Class<?> cls = yJI.createType$default(C56524yIo.AEQbTJ(String.class), null, false, null, 5, null).getClass();
        Class<?> cls2 = yJI.createType$default(C56524yIo.AEQbTJ(String.class), null, true, null, 5, null).getClass();
        KParameter kParameter = (KParameter) CollectionsKt___CollectionsKt.AkhnZx(parameters, 0);
        if (kParameter == null || !Intrinsics.EZpvd(kParameter.copydefault().getClass(), cls)) {
            z = false;
        } else {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) yDY.gEmmrt("t", "arg0")), kParameter.KWHzl())) {
                z = true;
            }
        }
        KParameter kParameter2 = (KParameter) CollectionsKt___CollectionsKt.AkhnZx(parameters, 1);
        if (kParameter2 == null || !Intrinsics.EZpvd(kParameter2.copydefault().getClass(), cls)) {
            z2 = false;
        } else {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) yDY.gEmmrt(DateFormat.SECOND, "arg1")), kParameter2.KWHzl())) {
                z2 = true;
            }
        }
        KParameter kParameter3 = (KParameter) CollectionsKt___CollectionsKt.AkhnZx(parameters, 2);
        if (kParameter3 == null || !Intrinsics.EZpvd(kParameter3.copydefault().getClass(), cls2)) {
            z3 = false;
        } else {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) yDY.gEmmrt(DateFormat.MINUTE, "arg2")), kParameter3.KWHzl())) {
                z3 = true;
            }
        }
        return z && z2 && z3;
    }
}
