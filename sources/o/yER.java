package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yER extends yES {
    public static java.util.List<C56396yDv> OLrzqt(@NotNull long[] jArr, @NotNull kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRange.isEmpty() ? yDY.AhwBna() : yES.OLrzqt(C56394yDt.OLrzqt(yDT.AEQbTJ(jArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1)));
    }

    public static java.lang.String AEQbTJ(int[] iArr) {
        java.lang.String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(C56397yDw.copydefault(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    public static java.lang.String KWHzl(long[] jArr) {
        java.lang.String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(C56394yDt.EZpvd(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    public static java.lang.String KWHzl(byte[] bArr) {
        java.lang.String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(C56398yDx.KWHzl(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    public static java.lang.String KWHzl(short[] sArr) {
        java.lang.String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(yDA.EZpvd(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    /* JADX INFO: renamed from: copyInto-sIZ3KeM$default, reason: not valid java name */
    public static /* synthetic */ int[] m8796copyIntosIZ3KeM$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C56397yDw.KWHzl(iArr);
        }
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        yDT.copydefault(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    /* JADX INFO: renamed from: copyInto--B0-L2c$default, reason: not valid java name */
    public static /* synthetic */ long[] m8793copyIntoB0L2c$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C56394yDt.copydefault(jArr);
        }
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        yDT.AEQbTJ(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    /* JADX INFO: renamed from: copyInto-FUQE5sA$default, reason: not valid java name */
    public static /* synthetic */ byte[] m8795copyIntoFUQE5sA$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C56398yDx.OLrzqt(bArr);
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        yDT.copydefault(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* JADX INFO: renamed from: copyInto-9-ak10g$default, reason: not valid java name */
    public static /* synthetic */ short[] m8794copyInto9ak10g$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = yDA.OLrzqt(sArr);
        }
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(sArr2, "");
        yDT.copydefault(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m8797fill2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C56397yDw.KWHzl(iArr);
        }
        AEQbTJ(iArr, i, i2, i3);
    }

    public static final void AEQbTJ(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        yDT.EZpvd(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m8799fillK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C56394yDt.copydefault(jArr);
        }
        AEQbTJ(jArr, j, i, i2);
    }

    public static final void AEQbTJ(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        yDT.AEQbTJ(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m8800fillWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C56398yDx.OLrzqt(bArr);
        }
        KWHzl(bArr, b, i, i2);
    }

    public static final void KWHzl(@NotNull byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        yDT.EZpvd(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m8798fillEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = yDA.OLrzqt(sArr);
        }
        copydefault(sArr, s, i, i2);
    }

    public static final void copydefault(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        yDT.EZpvd(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m8804sortoBK06Vg$default(int[] iArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C56397yDw.KWHzl(iArr);
        }
        OLrzqt(iArr, i, i2);
    }

    public static final void OLrzqt(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        yDG.Companion.copydefault(i, i2, C56397yDw.KWHzl(iArr));
        if (i < i2 - 1) {
            yEG.AEQbTJ(iArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m8801sortnroSd4$default(long[] jArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C56394yDt.copydefault(jArr);
        }
        EZpvd(jArr, i, i2);
    }

    public static final void EZpvd(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        yDG.Companion.copydefault(i, i2, C56394yDt.copydefault(jArr));
        if (i < i2 - 1) {
            yEG.OLrzqt(jArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m8802sort4UcCI2c$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C56398yDx.OLrzqt(bArr);
        }
        copydefault(bArr, i, i2);
    }

    public static final void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        yDG.Companion.copydefault(i, i2, C56398yDx.OLrzqt(bArr));
        if (i < i2 - 1) {
            yEG.AEQbTJ(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m8803sortAa5vz7o$default(short[] sArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = yDA.OLrzqt(sArr);
        }
        KWHzl(sArr, i, i2);
    }

    public static final void KWHzl(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        yDG.Companion.copydefault(i, i2, yDA.OLrzqt(sArr));
        if (i < i2 - 1) {
            yEG.OLrzqt(sArr, i, i2);
        }
    }
}
