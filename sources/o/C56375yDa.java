package o;

import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: o.yDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56375yDa {
    public static android.graphics.Bitmap OLrzqt(android.graphics.Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        int i2 = i;
        android.graphics.Bitmap bitmapCopy = z ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[java.lang.Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            android.graphics.Bitmap bitmap2 = bitmapCopy;
            int i16 = height;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = -i2;
            int i26 = 0;
            while (i25 <= i2) {
                int i27 = i5;
                int[] iArr9 = iArr6;
                int i28 = iArr2[i14 + java.lang.Math.min(i4, java.lang.Math.max(i25, 0))];
                int[] iArr10 = iArr8[i25 + i2];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & 65280) >> 8;
                iArr10[2] = i28 & 255;
                int iAbs = i12 - java.lang.Math.abs(i25);
                int i29 = iArr10[0];
                i26 += i29 * iAbs;
                int i30 = iArr10[1];
                i21 += i30 * iAbs;
                int i31 = iArr10[2];
                i20 += iAbs * i31;
                if (i25 > 0) {
                    i19 += i29;
                    i18 += i30;
                    i17 += i31;
                } else {
                    i22 += i29;
                    i23 += i30;
                    i24 += i31;
                }
                i25++;
                i5 = i27;
                iArr6 = iArr9;
            }
            int i32 = i5;
            int[] iArr11 = iArr6;
            int i33 = i2;
            int i34 = i26;
            int i35 = 0;
            while (i35 < width) {
                iArr3[i14] = iArr7[i34];
                iArr4[i14] = iArr7[i21];
                iArr5[i14] = iArr7[i20];
                int[] iArr12 = iArr8[((i33 - i2) + i7) % i7];
                int i36 = iArr12[0];
                int i37 = iArr12[1];
                int i38 = iArr12[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr11[i35] = java.lang.Math.min(i35 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i39 = iArr2[i15 + iArr11[i35]];
                int i40 = (i39 & 16711680) >> 16;
                iArr12[0] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr12[1] = i41;
                int i42 = i39 & 255;
                iArr12[2] = i42;
                int i43 = i19 + i40;
                int i44 = i18 + i41;
                int i45 = i17 + i42;
                i34 = (i34 - i22) + i43;
                i21 = (i21 - i23) + i44;
                i20 = (i20 - i24) + i45;
                i33 = (i33 + 1) % i7;
                int[] iArr13 = iArr8[i33 % i7];
                int i46 = iArr13[0];
                i22 = (i22 - i36) + i46;
                int i47 = iArr13[1];
                i23 = (i23 - i37) + i47;
                int i48 = iArr13[2];
                i24 = (i24 - i38) + i48;
                i19 = i43 - i46;
                i18 = i44 - i47;
                i17 = i45 - i48;
                i14++;
                i35++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            bitmapCopy = bitmap2;
            height = i16;
            i5 = i32;
            iArr6 = iArr11;
        }
        android.graphics.Bitmap bitmap3 = bitmapCopy;
        int i49 = i5;
        int[] iArr14 = iArr6;
        int i50 = height;
        int[] iArr15 = iArr7;
        int i51 = 0;
        while (i51 < width) {
            int i52 = -i2;
            int i53 = i7;
            int[] iArr16 = iArr2;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = i52;
            int i62 = i52 * width;
            int i63 = 0;
            int i64 = 0;
            while (i61 <= i2) {
                int i65 = width;
                int iMax = java.lang.Math.max(0, i62) + i51;
                int[] iArr17 = iArr8[i61 + i2];
                iArr17[0] = iArr3[iMax];
                iArr17[1] = iArr4[iMax];
                iArr17[2] = iArr5[iMax];
                int iAbs2 = i12 - java.lang.Math.abs(i61);
                i64 += iArr3[iMax] * iAbs2;
                i54 += iArr4[iMax] * iAbs2;
                i55 += iArr5[iMax] * iAbs2;
                if (i61 > 0) {
                    i59 += iArr17[0];
                    i60 += iArr17[1];
                    i63 += iArr17[2];
                } else {
                    i56 += iArr17[0];
                    i57 += iArr17[1];
                    i58 += iArr17[2];
                }
                int i66 = i49;
                if (i61 < i66) {
                    i62 += i65;
                }
                i61++;
                i49 = i66;
                width = i65;
            }
            int i67 = width;
            int i68 = i49;
            int i69 = i2;
            int i70 = i51;
            int i71 = i50;
            int i72 = 0;
            while (i72 < i71) {
                iArr16[i70] = (iArr16[i70] & ViewCompat.MEASURED_STATE_MASK) | (iArr15[i64] << 16) | (iArr15[i54] << 8) | iArr15[i55];
                int[] iArr18 = iArr8[((i69 - i2) + i53) % i53];
                int i73 = iArr18[0];
                int i74 = iArr18[1];
                int i75 = iArr18[2];
                if (i51 == 0) {
                    iArr14[i72] = java.lang.Math.min(i72 + i12, i68) * i67;
                }
                int i76 = iArr14[i72] + i51;
                int i77 = iArr3[i76];
                iArr18[0] = i77;
                int i78 = iArr4[i76];
                iArr18[1] = i78;
                int i79 = iArr5[i76];
                iArr18[2] = i79;
                int i80 = i59 + i77;
                int i81 = i60 + i78;
                int i82 = i63 + i79;
                i64 = (i64 - i56) + i80;
                i54 = (i54 - i57) + i81;
                i55 = (i55 - i58) + i82;
                i69 = (i69 + 1) % i53;
                int[] iArr19 = iArr8[i69];
                int i83 = iArr19[0];
                i56 = (i56 - i73) + i83;
                int i84 = iArr19[1];
                i57 = (i57 - i74) + i84;
                int i85 = iArr19[2];
                i58 = (i58 - i75) + i85;
                i59 = i80 - i83;
                i60 = i81 - i84;
                i63 = i82 - i85;
                i70 += i67;
                i72++;
                i2 = i;
            }
            i51++;
            i2 = i;
            i49 = i68;
            i50 = i71;
            i7 = i53;
            iArr2 = iArr16;
            width = i67;
        }
        int i86 = width;
        bitmap3.setPixels(iArr2, 0, i86, 0, 0, i86, i50);
        return bitmap3;
    }
}
