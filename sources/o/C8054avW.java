package o;

import com.lzf.easyfloat.enums.SidePattern;

/* JADX INFO: renamed from: o.avW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C8054avW {
    public static final /* synthetic */ int[] AEQbTJ;
    public static final /* synthetic */ int[] EZpvd;
    public static final /* synthetic */ int[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int[] iArr = new int[SidePattern.values().length];
        AEQbTJ = iArr;
        iArr[SidePattern.LEFT.ordinal()] = 1;
        iArr[SidePattern.RIGHT.ordinal()] = 2;
        iArr[SidePattern.TOP.ordinal()] = 3;
        iArr[SidePattern.BOTTOM.ordinal()] = 4;
        iArr[SidePattern.AUTO_HORIZONTAL.ordinal()] = 5;
        iArr[SidePattern.AUTO_VERTICAL.ordinal()] = 6;
        iArr[SidePattern.AUTO_SIDE.ordinal()] = 7;
        int[] iArr2 = new int[SidePattern.values().length];
        copydefault = iArr2;
        SidePattern sidePattern = SidePattern.RESULT_LEFT;
        iArr2[sidePattern.ordinal()] = 1;
        SidePattern sidePattern2 = SidePattern.RESULT_RIGHT;
        iArr2[sidePattern2.ordinal()] = 2;
        SidePattern sidePattern3 = SidePattern.RESULT_TOP;
        iArr2[sidePattern3.ordinal()] = 3;
        SidePattern sidePattern4 = SidePattern.RESULT_BOTTOM;
        iArr2[sidePattern4.ordinal()] = 4;
        SidePattern sidePattern5 = SidePattern.RESULT_HORIZONTAL;
        iArr2[sidePattern5.ordinal()] = 5;
        SidePattern sidePattern6 = SidePattern.RESULT_VERTICAL;
        iArr2[sidePattern6.ordinal()] = 6;
        SidePattern sidePattern7 = SidePattern.RESULT_SIDE;
        iArr2[sidePattern7.ordinal()] = 7;
        int[] iArr3 = new int[SidePattern.values().length];
        EZpvd = iArr3;
        iArr3[sidePattern.ordinal()] = 1;
        iArr3[sidePattern2.ordinal()] = 2;
        iArr3[sidePattern5.ordinal()] = 3;
        iArr3[sidePattern3.ordinal()] = 4;
        iArr3[sidePattern4.ordinal()] = 5;
        iArr3[sidePattern6.ordinal()] = 6;
        iArr3[sidePattern7.ordinal()] = 7;
    }
}
