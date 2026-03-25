package com.reown.android.internal.common.signing.cacao;

import com.reown.android.internal.common.signing.cacao.Cacao;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class CacaoType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ CacaoType[] $VALUES;
    public final String header;
    public static final CacaoType EIP4361 = new CacaoType("EIP4361", 0, "eip4361");
    public static final CacaoType CAIP222 = new CacaoType("CAIP222", 1, "caip222");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ CacaoType[] $values() {
        return new CacaoType[]{EIP4361, CAIP222};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CacaoType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static CacaoType valueOf(String str) {
        return (CacaoType) Enum.valueOf(CacaoType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static CacaoType[] values() {
        return (CacaoType[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeader() {
        return this.header;
    }

    public CacaoType(String str, int i, String str2) {
        this.header = str2;
    }

    static {
        CacaoType[] cacaoTypeArr$values = $values();
        $VALUES = cacaoTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cacaoTypeArr$values);
    }

    public final Cacao.Header toHeader() {
        return new Cacao.Header(this.header);
    }
}
