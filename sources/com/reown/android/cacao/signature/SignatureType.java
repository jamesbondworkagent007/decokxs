package com.reown.android.cacao.signature;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SignatureType implements ISignatureType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ SignatureType[] $VALUES;
    public static final Companion Companion;
    public final String header;
    public static final SignatureType EIP191 = new SignatureType("EIP191", 0, "eip191");
    public static final SignatureType EIP1271 = new SignatureType("EIP1271", 1, "eip1271");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ SignatureType[] $values() {
        return new SignatureType[]{EIP191, EIP1271};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignatureType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SignatureType valueOf(String str) {
        return (SignatureType) Enum.valueOf(SignatureType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SignatureType[] values() {
        return (SignatureType[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.cacao.signature.ISignatureType
    public String getHeader() {
        return this.header;
    }

    public SignatureType(String str, int i, String str2) {
        this.header = str2;
    }

    static {
        SignatureType[] signatureTypeArr$values = $values();
        $VALUES = signatureTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signatureTypeArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.cacao.signature.SignatureType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final SignatureType headerOf(@NotNull String str) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            SignatureType signatureType = SignatureType.EIP191;
            if (!Intrinsics.EZpvd((Object) str, (Object) signatureType.getHeader())) {
                signatureType = SignatureType.EIP1271;
                if (!Intrinsics.EZpvd((Object) str, (Object) signatureType.getHeader())) {
                    throw new Throwable("Header not supported");
                }
            }
            return signatureType;
        }
    }
}
