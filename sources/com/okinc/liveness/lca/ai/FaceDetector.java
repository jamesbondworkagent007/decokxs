package com.okinc.liveness.lca.ai;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import com.okinc.liveness.lca.exception.LcaJniDetectionFailException;
import com.okinc.liveness.lca.exception.LcaJniFaceDetectionLoadFailException;
import com.okinc.liveness.lca.exception.LcaJniFaceQcLoadFailException;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45697sut;
import o.C56391yDq;
import o.C56392yDr;
import o.C56444yFp;
import o.C6777aVl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FaceDetector {
    public static final String LOG_TAG = "lca_face_detector";
    public final Context context;
    public final boolean enableQC;
    public final float fcScoreThreshold;
    public final float freshnessQcBlockScoreThreshold;
    public final float freshnessQcBlurScoreThreshold;
    public final float freshnessQcBrightScoreThreshold;
    public final float freshnessQcDarkScoreThreshold;
    public final float freshnessQcOkScoreThreshold;
    public final InterfaceC56387yDm lcaOknn$delegate;
    public final float qcBlockScoreThreshold;
    public final float qcBlurScoreThreshold;
    public final float qcBrightScoreThreshold;
    public final float qcDarkScoreThreshold;
    public final float qcOkScoreThreshold;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FaceDetector(@NotNull Context context, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        this.enableQC = z;
        this.fcScoreThreshold = f;
        this.qcOkScoreThreshold = f2;
        this.qcBlurScoreThreshold = f3;
        this.qcBlockScoreThreshold = f4;
        this.qcBrightScoreThreshold = f5;
        this.qcDarkScoreThreshold = f6;
        this.freshnessQcOkScoreThreshold = f7;
        this.freshnessQcBlurScoreThreshold = f8;
        this.freshnessQcBlockScoreThreshold = f9;
        this.freshnessQcBrightScoreThreshold = f10;
        this.freshnessQcDarkScoreThreshold = f11;
        this.lcaOknn$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.liveness.lca.ai.FaceDetector$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetector.lcaOknn_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final LcaOknn getLcaOknn() {
        return (LcaOknn) this.lcaOknn$delegate.getValue();
    }

    public static final LcaOknn lcaOknn_delegate$lambda$1(FaceDetector faceDetector) throws LcaJniFaceDetectionLoadFailException, LcaJniFaceQcLoadFailException {
        LcaOknn lcaOknn = new LcaOknn();
        try {
            AssetManager assets = faceDetector.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "");
            lcaOknn.loadModel(assets);
            pUU.KWHzl(LOG_TAG, "Success load face detection model");
            if (faceDetector.enableQC) {
                try {
                    AssetManager assets2 = faceDetector.context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets2, "");
                    lcaOknn.loadQCModel(assets2);
                    pUU.KWHzl(LOG_TAG, "Success load face qc model");
                } catch (Exception e) {
                    pUU.AEQbTJ(LOG_TAG, "Failed to load face qc model", e);
                    LcaJniFaceQcLoadFailException lcaJniFaceQcLoadFailException = new LcaJniFaceQcLoadFailException(e.getMessage(), e.getCause());
                    C6777aVl.Companion.EZpvd(lcaJniFaceQcLoadFailException);
                    throw lcaJniFaceQcLoadFailException;
                }
            }
            return lcaOknn;
        } catch (Exception e2) {
            pUU.AEQbTJ(LOG_TAG, "Failed to load face detection model", e2);
            LcaJniFaceDetectionLoadFailException lcaJniFaceDetectionLoadFailException = new LcaJniFaceDetectionLoadFailException(e2.getMessage(), e2.getCause());
            C6777aVl.Companion.EZpvd(lcaJniFaceDetectionLoadFailException);
            throw lcaJniFaceDetectionLoadFailException;
        }
    }

    public final List<Detection> getBoundingBoxes(@NotNull Bitmap bitmap, boolean z, boolean z2) {
        FaceInfo[] faceInfoArrDetectFromBitmap;
        Object objM7377constructorimpl;
        QCLabel qCLabel;
        Intrinsics.checkNotNullParameter(bitmap, "");
        float f = !z ? this.qcOkScoreThreshold : this.freshnessQcOkScoreThreshold;
        float f2 = !z ? this.qcBlurScoreThreshold : this.freshnessQcBlurScoreThreshold;
        float f3 = !z ? this.qcBlockScoreThreshold : this.freshnessQcBlockScoreThreshold;
        float f4 = !z ? this.qcBrightScoreThreshold : this.freshnessQcBrightScoreThreshold;
        float f5 = !z ? this.qcDarkScoreThreshold : this.freshnessQcDarkScoreThreshold;
        if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.KWHzl(LOG_TAG, "getBoundingBoxes, fcScoreThreshold=" + this.fcScoreThreshold + " runQc=" + z2 + " qcOk=" + f + " qcBlur=" + f2 + " qcBlock=" + f3 + " qcBright=" + f4 + " qcDark=" + f5);
        }
        try {
            faceInfoArrDetectFromBitmap = getLcaOknn().detectFromBitmap(this.enableQC, bitmap, this.fcScoreThreshold, f, f2, f3, f4, f5);
        } catch (LcaJniFaceDetectionLoadFailException e) {
            pUU.AEQbTJ(LOG_TAG, "Failed to detect face", e);
            faceInfoArrDetectFromBitmap = new FaceInfo[0];
        } catch (LcaJniFaceQcLoadFailException e2) {
            pUU.AEQbTJ(LOG_TAG, "Failed to detect qc", e2);
            faceInfoArrDetectFromBitmap = getLcaOknn().detectFromBitmap(false, bitmap, this.fcScoreThreshold, this.qcOkScoreThreshold, this.qcBlurScoreThreshold, this.qcBlockScoreThreshold, this.qcBrightScoreThreshold, this.qcDarkScoreThreshold);
        } catch (Throwable th) {
            pUU.AEQbTJ(LOG_TAG, "Failed to detect from bitmap", th);
            C6777aVl.Companion.EZpvd(new LcaJniDetectionFailException(th.getMessage(), th.getCause()));
            faceInfoArrDetectFromBitmap = new FaceInfo[0];
        }
        FaceInfo[] faceInfoArr = faceInfoArrDetectFromBitmap;
        ArrayList arrayList = new ArrayList(faceInfoArr.length);
        for (FaceInfo faceInfo : faceInfoArr) {
            if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(LOG_TAG, faceInfo.toString());
            }
            Landmark landmark = new Landmark(faceInfo.getLandmarks()[0], faceInfo.getLandmarks()[1]);
            Landmark landmark2 = new Landmark(faceInfo.getLandmarks()[2], faceInfo.getLandmarks()[3]);
            Landmark landmark3 = new Landmark(faceInfo.getLandmarks()[4], faceInfo.getLandmarks()[5]);
            float f6 = 2;
            Landmark landmark4 = new Landmark((faceInfo.getLandmarks()[6] + faceInfo.getLandmarks()[8]) / f6, (faceInfo.getLandmarks()[7] + faceInfo.getLandmarks()[9]) / f6);
            Landmark landmarkCalculateLeftEar = calculateLeftEar(landmark, landmark2, landmark3);
            Landmark landmarkCalculateRightEar = calculateRightEar(landmark, landmark2, landmark3);
            RectF rect = faceInfo.getRect();
            float probability = faceInfo.getProbability();
            if (faceInfo.getQcLabel().length() > 0) {
                try {
                    Result.Application application = Result.Companion;
                    String qcLabel = faceInfo.getQcLabel();
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String upperCase = qcLabel.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    objM7377constructorimpl = Result.m7377constructorimpl(QCLabel.valueOf(upperCase));
                } catch (Throwable th2) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                QCLabel qCLabel2 = QCLabel.UNKNOWN;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = qCLabel2;
                }
                qCLabel = (QCLabel) objM7377constructorimpl;
            } else {
                qCLabel = QCLabel.NO_QC;
            }
            arrayList.add(new Detection(rect, landmark2, landmark, landmark3, landmark4, landmarkCalculateLeftEar, landmarkCalculateRightEar, probability, qCLabel, faceInfo.getQcScore(), f < 0.01f));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Detection) obj).getScore() >= this.fcScoreThreshold) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final Landmark calculateLeftEar(Landmark landmark, Landmark landmark2, Landmark landmark3) {
        float x = landmark2.getX();
        float x2 = landmark.getX();
        float y = (landmark.getY() + landmark2.getY()) / 2;
        return new Landmark(landmark.getX() - ((x - x2) * 0.8f), y + ((landmark3.getY() - y) * 0.3f));
    }

    public final Landmark calculateRightEar(Landmark landmark, Landmark landmark2, Landmark landmark3) {
        float x = landmark2.getX();
        float x2 = landmark.getX();
        float y = (landmark.getY() + landmark2.getY()) / 2;
        return new Landmark(landmark2.getX() + ((x - x2) * 0.8f), y + ((landmark3.getY() - y) * 0.3f));
    }

    public static final class Landmark {
        public static final int $stable = 0;
        public final float x;
        public final float y;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Landmark copy$default(Landmark landmark, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = landmark.x;
            }
            if ((i & 2) != 0) {
                f2 = landmark.y;
            }
            return landmark.copy(f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float component1() {
            return this.x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float component2() {
            return this.y;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark copy(float f, float f2) {
            return new Landmark(f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Landmark)) {
                return false;
            }
            Landmark landmark = (Landmark) obj;
            return Float.compare(this.x, landmark.x) == 0 && Float.compare(this.y, landmark.y) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getX() {
            return this.x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getY() {
            return this.y;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Landmark(x=" + this.x + ", y=" + this.y + ")";
        }

        public Landmark(float f, float f2) {
            this.x = f;
            this.y = f2;
        }
    }

    public static final class Detection {
        public static final int $stable = 8;
        public final Landmark leftEar;
        public final Landmark leftEye;
        public final RectF location;
        public final Landmark mouth;
        public final boolean noQcCheck;
        public final Landmark nose;
        public final QCLabel qcLabel;
        public final float qcScore;
        public final Landmark rightEar;
        public final Landmark rightEye;
        public final float score;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RectF component1() {
            return this.location;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float component10() {
            return this.qcScore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component11() {
            return this.noQcCheck;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark component2() {
            return this.leftEye;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark component3() {
            return this.rightEye;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark component4() {
            return this.nose;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark component5() {
            return this.mouth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark component6() {
            return this.leftEar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark component7() {
            return this.rightEar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float component8() {
            return this.score;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final QCLabel component9() {
            return this.qcLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Detection copy(@NotNull RectF rectF, @NotNull Landmark landmark, @NotNull Landmark landmark2, @NotNull Landmark landmark3, @NotNull Landmark landmark4, @NotNull Landmark landmark5, @NotNull Landmark landmark6, float f, @NotNull QCLabel qCLabel, float f2, boolean z) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(landmark, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            Intrinsics.checkNotNullParameter(landmark3, "");
            Intrinsics.checkNotNullParameter(landmark4, "");
            Intrinsics.checkNotNullParameter(landmark5, "");
            Intrinsics.checkNotNullParameter(landmark6, "");
            Intrinsics.checkNotNullParameter(qCLabel, "");
            return new Detection(rectF, landmark, landmark2, landmark3, landmark4, landmark5, landmark6, f, qCLabel, f2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detection)) {
                return false;
            }
            Detection detection = (Detection) obj;
            return Intrinsics.EZpvd(this.location, detection.location) && Intrinsics.EZpvd(this.leftEye, detection.leftEye) && Intrinsics.EZpvd(this.rightEye, detection.rightEye) && Intrinsics.EZpvd(this.nose, detection.nose) && Intrinsics.EZpvd(this.mouth, detection.mouth) && Intrinsics.EZpvd(this.leftEar, detection.leftEar) && Intrinsics.EZpvd(this.rightEar, detection.rightEar) && Float.compare(this.score, detection.score) == 0 && this.qcLabel == detection.qcLabel && Float.compare(this.qcScore, detection.qcScore) == 0 && this.noQcCheck == detection.noQcCheck;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark getLeftEar() {
            return this.leftEar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark getLeftEye() {
            return this.leftEye;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RectF getLocation() {
            return this.location;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark getMouth() {
            return this.mouth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getNoQcCheck() {
            return this.noQcCheck;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark getNose() {
            return this.nose;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final QCLabel getQcLabel() {
            return this.qcLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getQcScore() {
            return this.qcScore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark getRightEar() {
            return this.rightEar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Landmark getRightEye() {
            return this.rightEye;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getScore() {
            return this.score;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((this.location.hashCode() * 31) + this.leftEye.hashCode()) * 31) + this.rightEye.hashCode()) * 31) + this.nose.hashCode()) * 31) + this.mouth.hashCode()) * 31) + this.leftEar.hashCode()) * 31) + this.rightEar.hashCode()) * 31) + Float.hashCode(this.score)) * 31) + this.qcLabel.hashCode()) * 31) + Float.hashCode(this.qcScore)) * 31) + Boolean.hashCode(this.noQcCheck);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Detection(location=" + this.location + ", leftEye=" + this.leftEye + ", rightEye=" + this.rightEye + ", nose=" + this.nose + ", mouth=" + this.mouth + ", leftEar=" + this.leftEar + ", rightEar=" + this.rightEar + ", score=" + this.score + ", qcLabel=" + this.qcLabel + ", qcScore=" + this.qcScore + ", noQcCheck=" + this.noQcCheck + ")";
        }

        public Detection(@NotNull RectF rectF, @NotNull Landmark landmark, @NotNull Landmark landmark2, @NotNull Landmark landmark3, @NotNull Landmark landmark4, @NotNull Landmark landmark5, @NotNull Landmark landmark6, float f, @NotNull QCLabel qCLabel, float f2, boolean z) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(landmark, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            Intrinsics.checkNotNullParameter(landmark3, "");
            Intrinsics.checkNotNullParameter(landmark4, "");
            Intrinsics.checkNotNullParameter(landmark5, "");
            Intrinsics.checkNotNullParameter(landmark6, "");
            Intrinsics.checkNotNullParameter(qCLabel, "");
            this.location = rectF;
            this.leftEye = landmark;
            this.rightEye = landmark2;
            this.nose = landmark3;
            this.mouth = landmark4;
            this.leftEar = landmark5;
            this.rightEar = landmark6;
            this.score = f;
            this.qcLabel = qCLabel;
            this.qcScore = f2;
            this.noQcCheck = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QCLabel {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ QCLabel[] $VALUES;
        public static final QCLabel NO_QC = new QCLabel("NO_QC", 0);
        public static final QCLabel OK = new QCLabel("OK", 1);
        public static final QCLabel BLUR = new QCLabel("BLUR", 2);
        public static final QCLabel BLOCK = new QCLabel("BLOCK", 3);
        public static final QCLabel BRIGHT = new QCLabel("BRIGHT", 4);
        public static final QCLabel DARK = new QCLabel("DARK", 5);
        public static final QCLabel UNKNOWN = new QCLabel("UNKNOWN", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ QCLabel[] $values() {
            return new QCLabel[]{NO_QC, OK, BLUR, BLOCK, BRIGHT, DARK, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<QCLabel> getEntries() {
            return $ENTRIES;
        }

        private QCLabel(String str, int i) {
        }

        static {
            QCLabel[] qCLabelArr$values = $values();
            $VALUES = qCLabelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(qCLabelArr$values);
        }

        public static QCLabel valueOf(String str) {
            return (QCLabel) Enum.valueOf(QCLabel.class, str);
        }

        public static QCLabel[] values() {
            return (QCLabel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FaceOvalPosition {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FaceOvalPosition[] $VALUES;
        public static final FaceOvalPosition BLOCK;
        public static final FaceOvalPosition DARK;
        public static final FaceOvalPosition TOO_FAR_BOTTOM;
        public static final FaceOvalPosition TOO_FAR_LEFT;
        public static final FaceOvalPosition TOO_FAR_RIGHT;
        public static final FaceOvalPosition TOO_FAR_TOP;
        private final int instructionColorType;
        private final int instructionStringRes;
        private final int ovalColorType;
        public static final FaceOvalPosition MATCHED = new FaceOvalPosition("MATCHED", 0, C45697sut.Application.valueOf, 0, 0, 4, null);
        public static final FaceOvalPosition TOO_CLOSE = new FaceOvalPosition("TOO_CLOSE", 5, C45697sut.Application.DbNXlk, 1, 1);
        public static final FaceOvalPosition TOO_FAR = new FaceOvalPosition("TOO_FAR", 6, C45697sut.Application.fIwbmz, 1, 1);
        public static final FaceOvalPosition NOT_FRONTAL = new FaceOvalPosition("NOT_FRONTAL", 7, C45697sut.Application.AhwBna, 1, 0, 4, null);
        public static final FaceOvalPosition BLUR = new FaceOvalPosition("BLUR", 8, C45697sut.Application.ejfBZ, 2, 0, 4, null);
        public static final FaceOvalPosition BRIGHT = new FaceOvalPosition("BRIGHT", 10, C45697sut.Application.isConnected, 2, 0, 4, null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FaceOvalPosition[] $values() {
            return new FaceOvalPosition[]{MATCHED, TOO_FAR_LEFT, TOO_FAR_RIGHT, TOO_FAR_TOP, TOO_FAR_BOTTOM, TOO_CLOSE, TOO_FAR, NOT_FRONTAL, BLUR, BLOCK, BRIGHT, DARK};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FaceOvalPosition> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getInstructionColorType() {
            return this.instructionColorType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getInstructionStringRes() {
            return this.instructionStringRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getOvalColorType() {
            return this.ovalColorType;
        }

        private FaceOvalPosition(String str, int i, int i2, int i3, int i4) {
            this.instructionStringRes = i2;
            this.ovalColorType = i3;
            this.instructionColorType = i4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(java.lang.String, int, int, int, int):void (m)] (LINE:188) call: com.okinc.liveness.lca.ai.FaceDetector.FaceOvalPosition.<init>(java.lang.String, int, int, int, int):void type: THIS */
        public /* synthetic */ FaceOvalPosition(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4);
        }

        static {
            int i = 1;
            int i2 = 0;
            int i3 = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            TOO_FAR_LEFT = new FaceOvalPosition("TOO_FAR_LEFT", 1, C45697sut.Application.fetchVPNInfo, i, i2, i3, defaultConstructorMarker);
            int i4 = 1;
            int i5 = 0;
            int i6 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            TOO_FAR_RIGHT = new FaceOvalPosition("TOO_FAR_RIGHT", 2, C45697sut.Application.fetchVPNInfo, i4, i5, i6, defaultConstructorMarker2);
            TOO_FAR_TOP = new FaceOvalPosition("TOO_FAR_TOP", 3, C45697sut.Application.fetchVPNInfo, i, i2, i3, defaultConstructorMarker);
            TOO_FAR_BOTTOM = new FaceOvalPosition("TOO_FAR_BOTTOM", 4, C45697sut.Application.fetchVPNInfo, i4, i5, i6, defaultConstructorMarker2);
            int i7 = 2;
            int i8 = 0;
            int i9 = 4;
            DefaultConstructorMarker defaultConstructorMarker3 = null;
            BLOCK = new FaceOvalPosition("BLOCK", 9, C45697sut.Application.djBIcL, i7, i8, i9, defaultConstructorMarker3);
            DARK = new FaceOvalPosition("DARK", 11, C45697sut.Application.AuCTel, i7, i8, i9, defaultConstructorMarker3);
            FaceOvalPosition[] faceOvalPositionArr$values = $values();
            $VALUES = faceOvalPositionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(faceOvalPositionArr$values);
        }

        public static FaceOvalPosition valueOf(String str) {
            return (FaceOvalPosition) Enum.valueOf(FaceOvalPosition.class, str);
        }

        public static FaceOvalPosition[] values() {
            return (FaceOvalPosition[]) $VALUES.clone();
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.ai.FaceDetector.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FaceOvalPosition calculateFaceOvalPosition(@NotNull RectF rectF, @NotNull RectF rectF2, @NotNull LcaSdkLivenessConfig lcaSdkLivenessConfig, @NotNull PointF pointF, @NotNull PointF pointF2, @NotNull PointF pointF3, @NotNull PointF pointF4, @NotNull QCLabel qCLabel, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(rectF2, "");
            Intrinsics.checkNotNullParameter(lcaSdkLivenessConfig, "");
            Intrinsics.checkNotNullParameter(pointF, "");
            Intrinsics.checkNotNullParameter(pointF2, "");
            Intrinsics.checkNotNullParameter(pointF3, "");
            Intrinsics.checkNotNullParameter(pointF4, "");
            Intrinsics.checkNotNullParameter(qCLabel, "");
            float fCalculateFaceDistanceByFaceRect = calculateFaceDistanceByFaceRect(rectF, rectF2);
            if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(FaceDetector.LOG_TAG, "isFarFace=" + z + " isOnHold=" + z2 + " faceRatio=" + fCalculateFaceDistanceByFaceRect + " ovalRect=" + rectF2 + " face=" + rectF + ", leftEye=" + pointF2 + ", rightEye=" + pointF + ", nose=" + pointF3 + ", mouth=" + pointF4);
            }
            Float onHoldThresholdMinRatio = lcaSdkLivenessConfig.getFaceDetectionConfig().getOnHoldThresholdMinRatio();
            float fFloatValue = onHoldThresholdMinRatio != null ? onHoldThresholdMinRatio.floatValue() : 1.1f;
            Float onHoldThresholdMaxRatio = lcaSdkLivenessConfig.getFaceDetectionConfig().getOnHoldThresholdMaxRatio();
            float fFloatValue2 = onHoldThresholdMaxRatio != null ? onHoldThresholdMaxRatio.floatValue() : 0.85f;
            Float positionTopThreshold = lcaSdkLivenessConfig.getFaceDetectionConfig().getPositionTopThreshold();
            float fFloatValue3 = positionTopThreshold != null ? positionTopThreshold.floatValue() : 0.08f;
            Float positionBottomThreshold = lcaSdkLivenessConfig.getFaceDetectionConfig().getPositionBottomThreshold();
            float fFloatValue4 = positionBottomThreshold != null ? positionBottomThreshold.floatValue() : 0.05f;
            Float notFrontalFaceHeadTiltAngelThreshold = lcaSdkLivenessConfig.getFaceDetectionConfig().getNotFrontalFaceHeadTiltAngelThreshold();
            float fFloatValue5 = notFrontalFaceHeadTiltAngelThreshold != null ? notFrontalFaceHeadTiltAngelThreshold.floatValue() : 30.0f;
            Float notFrontalFaceHeadPitchAngelThreshold = lcaSdkLivenessConfig.getFaceDetectionConfig().getNotFrontalFaceHeadPitchAngelThreshold();
            float fFloatValue6 = notFrontalFaceHeadPitchAngelThreshold != null ? notFrontalFaceHeadPitchAngelThreshold.floatValue() : 35.0f;
            Float notFrontalFaceEyeDistanceRatioThreshold = lcaSdkLivenessConfig.getFaceDetectionConfig().getNotFrontalFaceEyeDistanceRatioThreshold();
            float fFloatValue7 = notFrontalFaceEyeDistanceRatioThreshold != null ? notFrontalFaceEyeDistanceRatioThreshold.floatValue() : 0.1f;
            LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig = lcaSdkLivenessConfig.getFaceDetectionConfig();
            Float freshFaceDistanceThresholdMin = !z ? faceDetectionConfig.getFreshFaceDistanceThresholdMin() : faceDetectionConfig.getInitialFaceDistanceThresholdMin();
            Intrinsics.copydefault(freshFaceDistanceThresholdMin);
            float fFloatValue8 = freshFaceDistanceThresholdMin.floatValue();
            if (!z2) {
                fFloatValue = 1.0f;
            }
            float f = fFloatValue8 * fFloatValue;
            Float freshFaceDistanceThresholdMax = !z ? lcaSdkLivenessConfig.getFaceDetectionConfig().getFreshFaceDistanceThresholdMax() : lcaSdkLivenessConfig.getFaceDetectionConfig().getInitialFaceDistanceThresholdMax();
            Intrinsics.copydefault(freshFaceDistanceThresholdMax);
            float fFloatValue9 = freshFaceDistanceThresholdMax.floatValue();
            if (!z2) {
                fFloatValue2 = 1.0f;
            }
            float f2 = fFloatValue9 * fFloatValue2;
            if (fCalculateFaceDistanceByFaceRect > f) {
                return FaceOvalPosition.TOO_CLOSE;
            }
            if (fCalculateFaceDistanceByFaceRect < f2) {
                return FaceOvalPosition.TOO_FAR;
            }
            if (rectF.left < rectF2.left) {
                return FaceOvalPosition.TOO_FAR_LEFT;
            }
            if (rectF.right > rectF2.right) {
                return FaceOvalPosition.TOO_FAR_RIGHT;
            }
            if (rectF.top - rectF2.top < rectF2.height() * fFloatValue3) {
                return FaceOvalPosition.TOO_FAR_TOP;
            }
            float f3 = rectF.bottom;
            float f4 = rectF2.bottom;
            if (f3 > f4 && f3 - f4 > rectF2.height() * fFloatValue4) {
                return FaceOvalPosition.TOO_FAR_BOTTOM;
            }
            if (!isFrontal(rectF, pointF2, pointF, pointF3, pointF4, fFloatValue5, fFloatValue6, fFloatValue7)) {
                return FaceOvalPosition.NOT_FRONTAL;
            }
            if (fCalculateFaceDistanceByFaceRect > f2 && fCalculateFaceDistanceByFaceRect < f) {
                if (qCLabel == QCLabel.BLUR) {
                    return FaceOvalPosition.BLUR;
                }
                if (qCLabel == QCLabel.BLOCK) {
                    return FaceOvalPosition.BLOCK;
                }
                if (qCLabel == QCLabel.BRIGHT) {
                    return FaceOvalPosition.BRIGHT;
                }
                if (qCLabel == QCLabel.DARK) {
                    return FaceOvalPosition.DARK;
                }
                return FaceOvalPosition.MATCHED;
            }
            return FaceOvalPosition.TOO_FAR;
        }

        public final float calculateFaceOvalDistancePercentage(@NotNull RectF rectF, @NotNull RectF rectF2, @NotNull LcaSdkLivenessConfig lcaSdkLivenessConfig, boolean z) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(rectF2, "");
            Intrinsics.checkNotNullParameter(lcaSdkLivenessConfig, "");
            float fCalculateFaceDistanceByFaceRect = calculateFaceDistanceByFaceRect(rectF, rectF2);
            LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig = lcaSdkLivenessConfig.getFaceDetectionConfig();
            Float freshFaceDistanceThresholdMin = !z ? faceDetectionConfig.getFreshFaceDistanceThresholdMin() : faceDetectionConfig.getInitialFaceDistanceThresholdMin();
            Intrinsics.copydefault(freshFaceDistanceThresholdMin);
            float fFloatValue = freshFaceDistanceThresholdMin.floatValue();
            LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig2 = lcaSdkLivenessConfig.getFaceDetectionConfig();
            Float freshFaceDistanceThresholdMax = !z ? faceDetectionConfig2.getFreshFaceDistanceThresholdMax() : faceDetectionConfig2.getInitialFaceDistanceThresholdMax();
            Intrinsics.copydefault(freshFaceDistanceThresholdMax);
            float fFloatValue2 = freshFaceDistanceThresholdMax.floatValue();
            if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(FaceDetector.LOG_TAG, "faceRatio=" + fCalculateFaceDistanceByFaceRect + " farMaxDistanceThreshold=" + fFloatValue + " farMinDistanceThreshold=" + fFloatValue2);
            }
            if (fCalculateFaceDistanceByFaceRect >= fFloatValue) {
                return fFloatValue / fCalculateFaceDistanceByFaceRect;
            }
            float f = fCalculateFaceDistanceByFaceRect / fFloatValue2;
            if (f <= 0.05d) {
                return 0.05f;
            }
            return f;
        }

        public final boolean isFrontal(RectF rectF, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, float f, float f2, float f3) {
            float fCalculateAngle = calculateAngle(pointF2, pointF);
            LcaSdkManager.Companion companion = LcaSdkManager.Companion;
            if (companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(FaceDetector.LOG_TAG, "eyeAngle=" + fCalculateAngle + " notFrontalFaceHeadTiltAngelThreshold=" + f);
            }
            if (Math.abs(fCalculateAngle) > f) {
                return false;
            }
            float fCalculatePitchAngle = calculatePitchAngle(pointF, pointF2, pointF3, pointF4);
            if (companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(FaceDetector.LOG_TAG, "pitchAngle=" + fCalculatePitchAngle + " notFrontalFaceHeadPitchAngelThreshold=" + f2);
            }
            if (Math.abs(fCalculatePitchAngle) > f2) {
                return false;
            }
            float fCalculateDistance = calculateDistance(pointF, pointF2) / rectF.width();
            if (companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(FaceDetector.LOG_TAG, "eyeDistanceRatio=" + fCalculateDistance + " notFrontalFaceEyeDistanceRatioThreshold=" + f3);
            }
            return fCalculateDistance >= f3;
        }

        public final float calculatePitchAngle(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            PointF pointF5 = new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
            return (((calculateDistance(pointF5, pointF3) / calculateDistance(pointF3, pointF4)) - 1.0f) * 45.0f) + (calculateVerticalAngle(pointF3, pointF4) - calculateVerticalAngle(pointF5, pointF3));
        }

        public final float calculateVerticalAngle(PointF pointF, PointF pointF2) {
            return (float) Math.toDegrees(Math.atan2(pointF2.x - pointF.x, pointF2.y - pointF.y));
        }

        public final float calculateAngle(PointF pointF, PointF pointF2) {
            return (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x));
        }

        public final float calculateDistance(PointF pointF, PointF pointF2) {
            float f = pointF2.x - pointF.x;
            float f2 = pointF2.y - pointF.y;
            return (float) Math.sqrt((f * f) + (f2 * f2));
        }

        public final float calculateFaceDistanceByFaceRect(@NotNull RectF rectF, @NotNull RectF rectF2) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(rectF2, "");
            return Math.abs(rectF.left - rectF.right) / Math.abs(rectF2.left - rectF2.right);
        }
    }
}
