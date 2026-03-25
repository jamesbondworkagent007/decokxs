package o;

import androidx.camera.video.AudioStats;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: renamed from: o.yqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57864yqU {
    public static float[] copydefault(@androidx.annotation.NonNull float[] fArr, int i, int i2) {
        int i3 = i2 - i;
        int iMin = java.lang.Math.min(i3, fArr.length - i);
        float[] fArr2 = new float[i3];
        java.lang.System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static java.util.List<android.graphics.Path> KWHzl(float f, float f2, java.util.List<android.graphics.Path> list, java.util.List<java.lang.String> list2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f, f2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.graphics.Path path : list) {
            android.graphics.Path path2 = new android.graphics.Path();
            path.transform(matrix, path2);
            arrayList.add(path2);
        }
        return arrayList;
    }

    public static android.graphics.Path copydefault(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        TaskDescription[] taskDescriptionArrEZpvd = EZpvd(str);
        if (taskDescriptionArrEZpvd == null) {
            return null;
        }
        try {
            TaskDescription.AEQbTJ(taskDescriptionArrEZpvd, path);
            return path;
        } catch (java.lang.RuntimeException e) {
            throw new java.lang.RuntimeException("Error in parsing " + str, e);
        }
    }

    public static TaskDescription[] EZpvd(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int iCopydefault = copydefault(str, i);
            java.lang.String strTrim = str.substring(i2, iCopydefault).trim();
            if (strTrim.length() > 0) {
                copydefault(arrayList, strTrim.charAt(0), OLrzqt(strTrim));
            }
            i2 = iCopydefault;
            i = iCopydefault + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            copydefault(arrayList, str.charAt(i2), new float[0]);
        }
        return (TaskDescription[]) arrayList.toArray(new TaskDescription[0]);
    }

    public static int copydefault(java.lang.String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void copydefault(java.util.List<TaskDescription> list, char c, float[] fArr) {
        list.add(new TaskDescription(c, fArr));
    }

    /* JADX INFO: renamed from: o.yqU$StateListAnimator */
    public static class StateListAnimator {
        public int AEQbTJ;
        public boolean KWHzl;

        private StateListAnimator() {
        }
    }

    public static float[] OLrzqt(java.lang.String str) {
        int i = 1;
        if ((str.charAt(0) == 'z') || (str.charAt(0) == 'Z')) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            StateListAnimator stateListAnimator = new StateListAnimator();
            int length = str.length();
            int i2 = 0;
            while (i < length) {
                KWHzl(str, i, stateListAnimator);
                int i3 = stateListAnimator.AEQbTJ;
                if (i < i3) {
                    fArr[i2] = java.lang.Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = stateListAnimator.KWHzl ? i3 : i3 + 1;
            }
            return copydefault(fArr, 0, i2);
        } catch (java.lang.NumberFormatException e) {
            throw new java.lang.RuntimeException("error in parsing \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void KWHzl(java.lang.String str, int i, StateListAnimator stateListAnimator) {
        stateListAnimator.KWHzl = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z2 = false;
                z3 = true;
                if (z3) {
                }
            } else {
                if (cCharAt != 'E' && cCharAt != 'e') {
                    switch (cCharAt) {
                        case ',':
                            break;
                        case '-':
                            if (i2 == i || z2) {
                                z2 = false;
                            } else {
                                stateListAnimator.KWHzl = true;
                                z2 = false;
                                z3 = true;
                            }
                            break;
                        case '.':
                            if (z) {
                                stateListAnimator.KWHzl = true;
                                z2 = false;
                                z3 = true;
                            } else {
                                z2 = false;
                                z = true;
                            }
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                } else {
                    z2 = true;
                }
                if (z3) {
                }
            }
            stateListAnimator.AEQbTJ = i2;
        }
        stateListAnimator.AEQbTJ = i2;
    }

    /* JADX INFO: renamed from: o.yqU$TaskDescription */
    public static class TaskDescription {
        public float[] EZpvd;
        public char copydefault;

        public TaskDescription(char c, float[] fArr) {
            this.copydefault = c;
            this.EZpvd = fArr;
        }

        public static void AEQbTJ(TaskDescription[] taskDescriptionArr, android.graphics.Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (TaskDescription taskDescription : taskDescriptionArr) {
                copydefault(path, fArr, c, taskDescription.copydefault, taskDescription.EZpvd);
                c = taskDescription.copydefault;
            }
        }

        public static void copydefault(android.graphics.Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            char c3 = c2;
            boolean z = false;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i = i2;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f13;
            float f20 = f16;
            float f21 = f17;
            int i4 = 0;
            char c4 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f18 = fArr2[i7];
                        float f22 = fArr2[i8];
                        float f23 = fArr2[i5];
                        float f24 = fArr2[i6];
                        f19 = f22;
                        f15 = f24;
                        f14 = f23;
                    } else if (c3 == 'H') {
                        i3 = i4;
                        path.lineTo(fArr2[i3], f19);
                        f18 = fArr2[i3];
                    } else if (c3 == 'Q') {
                        i3 = i4;
                        int i9 = i3 + 1;
                        int i10 = i3 + 2;
                        int i11 = i3 + 3;
                        path.quadTo(fArr2[i3], fArr2[i9], fArr2[i10], fArr2[i11]);
                        float f25 = fArr2[i3];
                        float f26 = fArr2[i9];
                        f18 = fArr2[i10];
                        f19 = fArr2[i11];
                        f14 = f25;
                        f15 = f26;
                    } else if (c3 == 'V') {
                        i3 = i4;
                        path.lineTo(f18, fArr2[i3]);
                        f19 = fArr2[i3];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                path.rLineTo(fArr2[i4], 0.0f);
                                f18 += fArr2[i4];
                            } else if (c3 != 'q') {
                                if (c3 != 'v') {
                                    if (c3 != 'L') {
                                        if (c3 == 'M') {
                                            f6 = fArr2[i4];
                                            f7 = fArr2[i4 + 1];
                                            if (i4 > 0) {
                                                path.lineTo(f6, f7);
                                            } else {
                                                path.moveTo(f6, f7);
                                                f18 = f6;
                                                f19 = f7;
                                            }
                                        } else if (c3 == 'S') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f18 = (f18 * 2.0f) - f14;
                                                f19 = (f19 * 2.0f) - f15;
                                            }
                                            float f27 = f18;
                                            int i12 = i4 + 1;
                                            int i13 = i4 + 2;
                                            int i14 = i4 + 3;
                                            path.cubicTo(f27, f19, fArr2[i4], fArr2[i12], fArr2[i13], fArr2[i14]);
                                            f = fArr2[i4];
                                            f2 = fArr2[i12];
                                            float f28 = fArr2[i13];
                                            f4 = fArr2[i14];
                                            f18 = f28;
                                            f14 = f;
                                            float f29 = f4;
                                            f15 = f2;
                                            f19 = f29;
                                        } else if (c3 == 'T') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f18 = (f18 * 2.0f) - f14;
                                                f19 = (f19 * 2.0f) - f15;
                                            }
                                            int i15 = i4 + 1;
                                            path.quadTo(f18, f19, fArr2[i4], fArr2[i15]);
                                            i3 = i4;
                                            f15 = f19;
                                            f14 = f18;
                                            f18 = fArr2[i4];
                                            f19 = fArr2[i15];
                                        } else if (c3 == 'l') {
                                            int i16 = i4 + 1;
                                            path.rLineTo(fArr2[i4], fArr2[i16]);
                                            f18 += fArr2[i4];
                                            f5 = fArr2[i16];
                                        } else if (c3 == 'm') {
                                            float f30 = fArr2[i4];
                                            f18 += f30;
                                            float f31 = fArr2[i4 + 1];
                                            f19 += f31;
                                            if (i4 > 0) {
                                                path.rLineTo(f30, f31);
                                            } else {
                                                path.rMoveTo(f30, f31);
                                            }
                                        } else if (c3 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f8 = f18 - f14;
                                                f9 = f19 - f15;
                                            } else {
                                                f8 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i17 = i4 + 1;
                                            int i18 = i4 + 2;
                                            int i19 = i4 + 3;
                                            path.rCubicTo(f8, f9, fArr2[i4], fArr2[i17], fArr2[i18], fArr2[i19]);
                                            f = fArr2[i4] + f18;
                                            f2 = fArr2[i17] + f19;
                                            f18 += fArr2[i18];
                                            f3 = fArr2[i19];
                                        } else if (c3 == 't') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f10 = f18 - f14;
                                                f11 = f19 - f15;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i20 = i4 + 1;
                                            path.rQuadTo(f10, f11, fArr2[i4], fArr2[i20]);
                                            f15 = f11 + f19;
                                            float f32 = f10 + f18;
                                            f18 = fArr2[i4] + f18;
                                            f19 = fArr2[i20] + f19;
                                            f14 = f32;
                                        }
                                        i3 = i4;
                                        f21 = f19;
                                        f20 = f18;
                                    } else {
                                        int i21 = i4 + 1;
                                        path.lineTo(fArr2[i4], fArr2[i21]);
                                        f6 = fArr2[i4];
                                        f7 = fArr2[i21];
                                    }
                                    f18 = f6;
                                    f19 = f7;
                                } else {
                                    path.rLineTo(0.0f, fArr2[i4]);
                                    f5 = fArr2[i4];
                                }
                                f19 += f5;
                            } else {
                                int i22 = i4 + 1;
                                int i23 = i4 + 2;
                                int i24 = i4 + 3;
                                path.rQuadTo(fArr2[i4], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i4] + f18;
                                f2 = fArr2[i22] + f19;
                                f18 += fArr2[i23];
                                f3 = fArr2[i24];
                            }
                            i3 = i4;
                        } else {
                            int i25 = i4 + 2;
                            int i26 = i4 + 3;
                            int i27 = i4 + 4;
                            int i28 = i4 + 5;
                            path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                            f = fArr2[i25] + f18;
                            f2 = fArr2[i26] + f19;
                            f18 += fArr2[i27];
                            f3 = fArr2[i28];
                        }
                        f4 = f19 + f3;
                        f14 = f;
                        float f292 = f4;
                        f15 = f2;
                        f19 = f292;
                        i3 = i4;
                    } else {
                        int i29 = i4 + 5;
                        int i30 = i4 + 6;
                        i3 = i4;
                        KWHzl(path, f18, f19, fArr2[i29] + f18, fArr2[i30] + f19, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f18 += fArr2[i29];
                        f19 += fArr2[i30];
                    }
                    i4 = i3 + i;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    i3 = i4;
                    int i31 = i3 + 5;
                    int i32 = i3 + 6;
                    KWHzl(path, f18, f19, fArr2[i31], fArr2[i32], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f18 = fArr2[i31];
                    f19 = fArr2[i32];
                }
                f15 = f19;
                f14 = f18;
                i4 = i3 + i;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f18;
            fArr[1] = f19;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f20;
            fArr[5] = f21;
        }

        public static void KWHzl(android.graphics.Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = java.lang.Math.toRadians(f7);
            double dCos = java.lang.Math.cos(radians);
            double dSin = java.lang.Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d3 * dCos) + (d4 * dSin)) / d5;
            double d7 = f6;
            double d8 = ((((double) (-f)) * dSin) + (d4 * dCos)) / d7;
            double d9 = f4;
            double d10 = ((((double) f3) * dCos) + (d9 * dSin)) / d5;
            double d11 = ((((double) (-f3)) * dSin) + (d9 * dCos)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d12 * d12) + (d13 * d13);
            if (d16 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                float fSqrt = (float) (java.lang.Math.sqrt(d16) / 1.99999d);
                KWHzl(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = java.lang.Math.sqrt(d17);
            double d18 = d12 * dSqrt;
            double d19 = dSqrt * d13;
            if (z == z2) {
                d = d14 - d19;
                d2 = d15 + d18;
            } else {
                d = d14 + d19;
                d2 = d15 - d18;
            }
            double dAtan2 = java.lang.Math.atan2(d8 - d2, d6 - d);
            double dAtan22 = java.lang.Math.atan2(d11 - d2, d10 - d) - dAtan2;
            if (z2 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                dAtan22 = dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d20 = d * d5;
            double d21 = d2 * d7;
            AEQbTJ(path, (d20 * dCos) - (d21 * dSin), (d20 * dSin) + (d21 * dCos), d5, d7, d3, d4, radians, dAtan2, dAtan22);
        }

        public static void AEQbTJ(android.graphics.Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) java.lang.Math.ceil(java.lang.Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = java.lang.Math.cos(d7);
            double dSin = java.lang.Math.sin(d7);
            double dCos2 = java.lang.Math.cos(d8);
            double dSin2 = java.lang.Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = d11 * dSin;
            double d15 = d4 * dCos;
            double d16 = d9 / ((double) iCeil);
            double d17 = d6;
            double d18 = (dSin2 * d12) - (dCos2 * d13);
            double d19 = (dSin2 * d14) + (dCos2 * d15);
            double d20 = d8;
            int i = 0;
            double d21 = d5;
            while (i < iCeil) {
                double d22 = d20 + d16;
                double dSin3 = java.lang.Math.sin(d22);
                double dCos3 = java.lang.Math.cos(d22);
                double d23 = d16;
                double d24 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d25 = d2 + (d10 * dSin * dCos3) + (d15 * dSin3);
                double d26 = (d12 * dSin3) - (d13 * dCos3);
                double d27 = (dSin3 * d14) + (dCos3 * d15);
                double d28 = d22 - d20;
                double dTan = java.lang.Math.tan(d28 / 2.0d);
                double dSin4 = (java.lang.Math.sin(d28) * (java.lang.Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d21 + (d18 * dSin4)), (float) (d17 + (d19 * dSin4)), (float) (d24 - (dSin4 * d26)), (float) (d25 - (dSin4 * d27)), (float) d24, (float) d25);
                i++;
                d17 = d25;
                d21 = d24;
                dSin = dSin;
                d20 = d22;
                d19 = d27;
                iCeil = iCeil;
                d18 = d26;
                dCos = dCos;
                d10 = d3;
                d16 = d23;
            }
        }
    }
}
