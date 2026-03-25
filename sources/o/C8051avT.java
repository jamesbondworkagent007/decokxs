package o;

import com.lzf.easyfloat.enums.SidePattern;

/* JADX INFO: renamed from: o.avT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C8051avT {
    public static final /* synthetic */ int[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int[] iArr = new int[SidePattern.values().length];
        copydefault = iArr;
        iArr[SidePattern.LEFT.ordinal()] = 1;
        iArr[SidePattern.RESULT_LEFT.ordinal()] = 2;
        iArr[SidePattern.RIGHT.ordinal()] = 3;
        iArr[SidePattern.RESULT_RIGHT.ordinal()] = 4;
        iArr[SidePattern.TOP.ordinal()] = 5;
        iArr[SidePattern.RESULT_TOP.ordinal()] = 6;
        iArr[SidePattern.BOTTOM.ordinal()] = 7;
        iArr[SidePattern.RESULT_BOTTOM.ordinal()] = 8;
        iArr[SidePattern.DEFAULT.ordinal()] = 9;
        iArr[SidePattern.AUTO_HORIZONTAL.ordinal()] = 10;
        iArr[SidePattern.RESULT_HORIZONTAL.ordinal()] = 11;
        iArr[SidePattern.AUTO_VERTICAL.ordinal()] = 12;
        iArr[SidePattern.RESULT_VERTICAL.ordinal()] = 13;
    }
}
