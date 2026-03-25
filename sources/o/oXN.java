package o;

import android.graphics.RectF;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.oXR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXN {
    public static final oXN KWHzl = new oXN();
    public static final float EZpvd = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuBGHE);
    public static final int AEQbTJ = 191;
    public static final int copydefault = 102;
    public static final int OLrzqt = 255;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return OLrzqt;
    }

    private oXN() {
    }

    public static /* synthetic */ void drawLineBackGround$default(oXN oxn, android.graphics.Canvas canvas, oXP oxp, oXH oxh, oXK oxk, java.lang.Integer num, int i, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        Intrinsics.checkNotNullParameter(oxk, "");
        canvas.save();
        android.graphics.Path pathDjBIcL = oxh != null ? oxh.djBIcL() : null;
        if (pathDjBIcL != null) {
            canvas.clipPath(pathDjBIcL);
        }
        try {
            float[] fArrWlaJM = oxp.wlaJM();
            if (fArrWlaJM != null) {
                canvas.drawLines(fArrWlaJM, oxk.gEmmrt());
            }
            float[] fArrAYXKKw = oxp.AYXKKw();
            if (fArrAYXKKw != null) {
                canvas.drawLines(fArrAYXKKw, oxk.AhwBna());
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        canvas.restore();
    }

    public static /* synthetic */ void drawBoxBackGround$default(oXN oxn, android.graphics.Canvas canvas, oXP oxp, oXH oxh, android.graphics.Paint paint, java.lang.Integer num, int i, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        Intrinsics.checkNotNullParameter(paint, "");
        canvas.save();
        android.graphics.Path pathEZpvd = oxh != null ? oxh.EZpvd() : null;
        if (pathEZpvd != null) {
            canvas.clipPath(pathEZpvd);
        }
        try {
            try {
                float[] fArrDjBIcL = oxp.djBIcL();
                if (fArrDjBIcL != null) {
                    canvas.drawLines(fArrDjBIcL, paint);
                }
                C56518yIi.KWHzl(1);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                C56518yIi.KWHzl(1);
            }
            canvas.restore();
            C56518yIi.copydefault(1);
        } catch (java.lang.Throwable th) {
            C56518yIi.KWHzl(1);
            canvas.restore();
            C56518yIi.copydefault(1);
            throw th;
        }
    }

    public static /* synthetic */ void drawPixelContent$default(oXN oxn, android.graphics.Canvas canvas, oXH oxh, oXP oxp, oXR.TaskDescription taskDescription, oXK oxk, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            num = null;
        }
        oxn.EZpvd(canvas, oxh, oxp, taskDescription, oxk, num);
    }

    public final void EZpvd(@NotNull android.graphics.Canvas canvas, oXH<?> oxh, @NotNull oXP oxp, oXR.TaskDescription taskDescription, @NotNull oXK oxk, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        Intrinsics.checkNotNullParameter(oxk, "");
        try {
            Result.Application application = Result.Companion;
            if (oxh != null && oxh.fJNWhG()) {
                java.lang.Float fOLrzqt = taskDescription != null ? taskDescription.OLrzqt() : null;
                if (fOLrzqt == null) {
                    if (num != null && num.intValue() < 700) {
                        android.graphics.Paint paintDbNXlk = oxk.DbNXlk();
                        int i = OLrzqt;
                        paintDbNXlk.setAlpha(i);
                        oxk.OLrzqt().setAlpha(i);
                        for (C36343oYg c36343oYg : oxh.copydefault()) {
                            canvas.drawRoundRect(c36343oYg.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.DbNXlk());
                            canvas.drawRoundRect(c36343oYg.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.OLrzqt());
                        }
                        android.graphics.Paint paintDbNXlk2 = oxk.DbNXlk();
                        int i2 = AEQbTJ;
                        paintDbNXlk2.setAlpha(i2);
                        oxk.OLrzqt().setAlpha(i2);
                        for (C36343oYg c36343oYg2 : oxh.AEQbTJ()) {
                            canvas.drawRoundRect(c36343oYg2.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.DbNXlk());
                            canvas.drawRoundRect(c36343oYg2.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.OLrzqt());
                        }
                        android.graphics.Paint paintDbNXlk3 = oxk.DbNXlk();
                        int i3 = copydefault;
                        paintDbNXlk3.setAlpha(i3);
                        oxk.OLrzqt().setAlpha(i3);
                        for (C36343oYg c36343oYg3 : oxh.KWHzl()) {
                            canvas.drawRoundRect(c36343oYg3.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.DbNXlk());
                            canvas.drawRoundRect(c36343oYg3.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.OLrzqt());
                        }
                    } else {
                        android.graphics.Paint paintDbNXlk4 = oxk.DbNXlk();
                        int i4 = OLrzqt;
                        paintDbNXlk4.setAlpha(i4);
                        oxk.OLrzqt().setAlpha(i4);
                        for (C36343oYg c36343oYg4 : oxh.AhwBna()) {
                            canvas.drawRoundRect(c36343oYg4.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.DbNXlk());
                            canvas.drawRoundRect(c36343oYg4.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.OLrzqt());
                        }
                    }
                } else {
                    android.graphics.Paint paintDbNXlk5 = oxk.DbNXlk();
                    int i5 = OLrzqt;
                    paintDbNXlk5.setAlpha(i5);
                    oxk.OLrzqt().setAlpha(i5);
                    for (C36343oYg c36343oYg5 : oxh.AhwBna()) {
                        float fEZpvd = c36343oYg5.EZpvd();
                        Intrinsics.copydefault(fOLrzqt);
                        if (fEZpvd <= fOLrzqt.floatValue()) {
                            canvas.drawRoundRect(c36343oYg5.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.DbNXlk());
                            canvas.drawRoundRect(c36343oYg5.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.OLrzqt());
                            canvas.drawRoundRect(c36343oYg5.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.valueOf());
                        } else {
                            canvas.drawRoundRect(c36343oYg5.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.EZpvd());
                            canvas.drawRoundRect(c36343oYg5.AEQbTJ(), oxk.djBIcL(), oxk.djBIcL(), oxk.fetchVPNInfo());
                        }
                    }
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void OLrzqt(@NotNull android.graphics.Canvas canvas, oXH<?> oxh, @NotNull oXP oxp, oXR.TaskDescription taskDescription, @NotNull oXK oxk) {
        java.lang.Number numberValueOf;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        Intrinsics.checkNotNullParameter(oxk, "");
        java.lang.String strAEQbTJ = null;
        java.lang.Float fOLrzqt = taskDescription != null ? taskDescription.OLrzqt() : null;
        if (fOLrzqt != null) {
            if (fOLrzqt != null) {
                float fFloatValue = fOLrzqt.floatValue();
                if (oxh != null) {
                    oXL<?> oxlEZpvd = taskDescription.EZpvd();
                    strAEQbTJ = oxh.AEQbTJ(oxlEZpvd != null ? oxlEZpvd.KWHzl() : null);
                }
                if (strAEQbTJ != null && strAEQbTJ.length() > 0) {
                    float fMeasureText = oxk.isConnected().measureText(strAEQbTJ);
                    float f = 2;
                    float f2 = fMeasureText / f;
                    float f3 = fFloatValue - f2;
                    if (f3 < 0.0f || fFloatValue < oxp.iwGUEr()) {
                        numberValueOf = java.lang.Integer.valueOf(oxp.iwGUEr());
                    } else if (f3 > 0.0f && fFloatValue + f2 < oxp.AkhnZx()) {
                        numberValueOf = java.lang.Float.valueOf(f3);
                    } else if (f2 + fFloatValue >= oxp.AkhnZx()) {
                        numberValueOf = java.lang.Float.valueOf(oxp.AkhnZx() - fMeasureText);
                    } else {
                        numberValueOf = java.lang.Float.valueOf(fFloatValue);
                    }
                    float fFloatValue2 = numberValueOf.floatValue();
                    float f4 = EZpvd;
                    canvas.drawText(strAEQbTJ, C56548yJl.valueOf(C56548yJl.copydefault(f4, fFloatValue2), (oxp.AkhnZx() - f4) - fMeasureText), oxp.AhwBna() - f, oxk.isConnected());
                }
            }
            Intrinsics.copydefault(fOLrzqt);
            canvas.drawLine(fOLrzqt.floatValue(), oxp.AhwBna(), fOLrzqt.floatValue(), oxp.gEmmrt(), oxk.AEQbTJ());
            RectF rectFKWHzl = taskDescription.KWHzl();
            if (rectFKWHzl != null) {
                canvas.drawRect(rectFKWHzl, oxk.DbNXlk());
                canvas.drawRect(rectFKWHzl, oxk.OLrzqt());
            }
        }
    }

    public final void KWHzl(@NotNull android.graphics.Canvas canvas, oXH<?> oxh, @NotNull oXP oxp, oXR.TaskDescription taskDescription, @NotNull oXK oxk) {
        java.lang.Float fValueOf;
        java.lang.String strValues;
        java.lang.String strDbNXlk;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        Intrinsics.checkNotNullParameter(oxk, "");
        java.lang.Float fValueOf2 = null;
        boolean z = (taskDescription != null ? taskDescription.OLrzqt() : null) != null;
        java.lang.Float fFARcdN = oxp.fARcdN();
        if (z) {
            return;
        }
        java.lang.Float fIsConnected = oxp.isConnected();
        if (fIsConnected != null) {
            float fFloatValue = fIsConnected.floatValue();
            float f = EZpvd;
            fValueOf = java.lang.Float.valueOf(C56548yJl.valueOf(C56548yJl.copydefault(f, fFloatValue), (oxp.AkhnZx() - f) - oxp.fetchVPNInfo()));
        } else {
            fValueOf = null;
        }
        java.lang.Float fDbNXlk = oxp.DbNXlk();
        java.lang.Float fAuCTel = oxp.AuCTel();
        if (fAuCTel != null) {
            float fFloatValue2 = fAuCTel.floatValue();
            float f2 = EZpvd;
            fValueOf2 = java.lang.Float.valueOf(C56548yJl.valueOf(C56548yJl.copydefault(f2, fFloatValue2), (oxp.AkhnZx() - f2) - oxp.values()));
        }
        if (fValueOf != null && fDbNXlk != null) {
            float fFloatValue3 = fDbNXlk.floatValue();
            if (oxh == null || (strDbNXlk = oxh.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            canvas.drawText(strDbNXlk, fValueOf.floatValue(), fFloatValue3, oxk.AYXKKw());
        }
        if (fValueOf2 == null || fFARcdN == null) {
            return;
        }
        float fFloatValue4 = fFARcdN.floatValue();
        if (oxh != null && (strValues = oxh.values()) != null) {
            str = strValues;
        }
        canvas.drawText(str, fValueOf2.floatValue(), fFloatValue4, oxk.AYXKKw());
    }
}
