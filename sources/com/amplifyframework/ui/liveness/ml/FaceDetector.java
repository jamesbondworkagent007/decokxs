package com.amplifyframework.ui.liveness.ml;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.RectF;
import com.amplifyframework.predictions.aws.models.FaceTargetChallenge;
import com.amplifyframework.predictions.aws.models.FaceTargetMatchingParameters;
import com.amplifyframework.ui.liveness.R;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.amplifyframework.ui.liveness.state.LivenessState;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.YG;
import o.pUU;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceDetector {
    private static final float ALPHA = 2.0f;
    private static final float ANCHOR_OFFSET_X = 0.5f;
    private static final float ANCHOR_OFFSET_Y = 0.5f;
    private static final int ASPECT_RATIOS_SIZE = 1;
    private static final float GAMMA = 1.8f;
    private static final float GOLDEN_RATIO = 1.618f;
    public static final float H_SCALE = 128.0f;
    public static final float INITIAL_FACE_DISTANCE_THRESHOLD = 0.32f;
    private static final int INPUT_SIZE_HEIGHT = 128;
    private static final int INPUT_SIZE_WIDTH = 128;
    private static final float MAX_SCALE = 0.75f;
    private static final float MIN_SCALE = 0.1484375f;
    private static final float MIN_SCORE_THRESHOLD = 0.7f;
    private static final float MIN_SUPPRESSION_THRESHOLD = 0.3f;
    public static final int NUM_BOXES = 896;
    public static final int NUM_COORDS = 16;
    public static final float W_SCALE = 128.0f;
    public static final float X_SCALE = 128.0f;
    public static final float Y_SCALE = 128.0f;
    private final List<Anchor> anchors;
    private final LivenessState livenessState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<Integer> strides = yDY.gEmmrt(8, 16, 16, 16);

    private final float calculateScale(float f, float f2, int i, int i2) {
        return f + ((((f2 - f) * 1.0f) * i) / (i2 - 1.0f));
    }

    public FaceDetector(@NotNull LivenessState livenessState) {
        Intrinsics.checkNotNullParameter(livenessState, "");
        this.livenessState = livenessState;
        this.anchors = generateAnchors();
    }

    public final List<Detection> getBoundingBoxes(@NotNull float[][][] fArr, @NotNull float[][][] fArr2) {
        int i;
        ArrayList arrayList;
        FaceDetector faceDetector = this;
        float[][][] fArr3 = fArr;
        float[][][] fArr4 = fArr2;
        Intrinsics.checkNotNullParameter(fArr3, "");
        Intrinsics.checkNotNullParameter(fArr4, "");
        ArrayList arrayList2 = new ArrayList();
        char c = 0;
        int i2 = 0;
        while (i2 < 896) {
            float fComputeSigmoid = faceDetector.computeSigmoid(fArr4[c][i2][c]);
            if (fComputeSigmoid < 0.7f) {
                arrayList = arrayList2;
                i = i2;
            } else {
                float[] fArr5 = fArr3[c][i2];
                float f = fArr5[c];
                float f2 = fArr5[1];
                float f3 = fArr5[2];
                float f4 = fArr5[3];
                float f5 = fArr5[4];
                float f6 = fArr5[5];
                float f7 = fArr5[6];
                float f8 = fArr5[7];
                float f9 = fArr5[8];
                float f10 = fArr5[9];
                float f11 = fArr5[10];
                float f12 = fArr5[11];
                float f13 = fArr5[12];
                float f14 = fArr5[13];
                float f15 = fArr5[14];
                float f16 = fArr5[15];
                float w = ((f / 128.0f) * faceDetector.anchors.get(i2).getW()) + faceDetector.anchors.get(i2).getXCenter();
                float h = ((f2 / 128.0f) * faceDetector.anchors.get(i2).getH()) + faceDetector.anchors.get(i2).getYCenter();
                float h2 = faceDetector.anchors.get(i2).getH();
                float w2 = faceDetector.anchors.get(i2).getW();
                float f17 = ((f4 / 128.0f) * h2) / ALPHA;
                float f18 = ((f3 / 128.0f) * w2) / ALPHA;
                float w3 = faceDetector.anchors.get(i2).getW();
                float xCenter = faceDetector.anchors.get(i2).getXCenter();
                float h3 = faceDetector.anchors.get(i2).getH();
                float yCenter = faceDetector.anchors.get(i2).getYCenter();
                ArrayList arrayList3 = arrayList2;
                float w4 = faceDetector.anchors.get(i2).getW();
                float xCenter2 = faceDetector.anchors.get(i2).getXCenter();
                float f19 = f8 / 128.0f;
                float h4 = faceDetector.anchors.get(i2).getH();
                float yCenter2 = faceDetector.anchors.get(i2).getYCenter();
                float w5 = faceDetector.anchors.get(i2).getW();
                float xCenter3 = faceDetector.anchors.get(i2).getXCenter();
                float h5 = faceDetector.anchors.get(i2).getH();
                float yCenter3 = faceDetector.anchors.get(i2).getYCenter();
                float w6 = faceDetector.anchors.get(i2).getW();
                float xCenter4 = faceDetector.anchors.get(i2).getXCenter();
                float h6 = faceDetector.anchors.get(i2).getH();
                float yCenter4 = faceDetector.anchors.get(i2).getYCenter();
                float w7 = faceDetector.anchors.get(i2).getW();
                float xCenter5 = faceDetector.anchors.get(i2).getXCenter();
                float f20 = f16 / 128.0f;
                float h7 = faceDetector.anchors.get(i2).getH();
                float yCenter5 = faceDetector.anchors.get(i2).getYCenter();
                float w8 = faceDetector.anchors.get(i2).getW();
                i = i2;
                Detection detection = new Detection(new RectF(w - f18, h - f17, w + f18, h + f17), new Landmark(((f5 / 128.0f) * w3) + xCenter, ((f6 / 128.0f) * h3) + yCenter), new Landmark(((f7 / 128.0f) * w4) + xCenter2, (f19 * h4) + yCenter2), new Landmark(((f9 / 128.0f) * w5) + xCenter3, ((f10 / 128.0f) * h5) + yCenter3), new Landmark(((f11 / 128.0f) * w6) + xCenter4, ((f12 / 128.0f) * h6) + yCenter4), new Landmark(((f15 / 128.0f) * w7) + xCenter5, (f20 * h7) + yCenter5), new Landmark(((f13 / 128.0f) * w8) + faceDetector.anchors.get(i2).getXCenter(), ((f14 / 128.0f) * faceDetector.anchors.get(i2).getH()) + faceDetector.anchors.get(i2).getYCenter()), fComputeSigmoid);
                arrayList = arrayList3;
                arrayList.add(detection);
            }
            i2 = i + 1;
            c = 0;
            faceDetector = this;
            fArr4 = fArr2;
            arrayList2 = arrayList;
            fArr3 = fArr;
        }
        ArrayList arrayList4 = arrayList2;
        if (arrayList4.isEmpty()) {
            return yDY.AhwBna();
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList4.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList5.add(new IndexedScore(i3, arrayList4.get(i3).getScore()));
        }
        List<Detection> listWeightedNonMaxSuppression = weightedNonMaxSuppression(CollectionsKt___CollectionsKt.EZpvd(arrayList5, new Comparator() { // from class: com.amplifyframework.ui.liveness.ml.FaceDetector$getBoundingBoxes$$inlined$sortedBy$1
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl(Float.valueOf(((FaceDetector.IndexedScore) t).getScore()), Float.valueOf(((FaceDetector.IndexedScore) t2).getScore()));
            }
        }), arrayList4);
        ArrayList arrayList6 = new ArrayList();
        for (Detection detection2 : listWeightedNonMaxSuppression) {
            float f21 = detection2.getLocation().bottom / 128.0f;
            float f22 = LivenessCoordinator.TARGET_HEIGHT;
            float x = detection2.getLeftEye().getX() / 128.0f;
            float f23 = LivenessCoordinator.TARGET_WIDTH;
            float y = detection2.getLeftEye().getY() / 128.0f;
            float x2 = detection2.getRightEye().getX() / 128.0f;
            float y2 = detection2.getRightEye().getY() / 128.0f;
            float x3 = detection2.getNose().getX() / 128.0f;
            float y3 = detection2.getNose().getY() / 128.0f;
            float x4 = detection2.getMouth().getX() / 128.0f;
            float y4 = detection2.getMouth().getY() / 128.0f;
            float x5 = detection2.getLeftEar().getX() / 128.0f;
            float y5 = detection2.getLeftEar().getY() / 128.0f;
            float x6 = detection2.getRightEar().getX() / 128.0f;
            float y6 = detection2.getRightEar().getY() / 128.0f;
            Landmark landmark = new Landmark(x * f23, y * f22);
            Landmark landmark2 = new Landmark(x2 * f23, y2 * f22);
            Landmark landmark3 = new Landmark(x3 * f23, y3 * f22);
            Landmark landmark4 = new Landmark(x4 * f23, y4 * f22);
            Landmark landmark5 = new Landmark(x5 * f23, y5 * f22);
            Landmark landmark6 = new Landmark(f23 * x6, f22 * y6);
            arrayList6.add(new Detection(generateBoundingBoxFromLandmarks(f22 * f21, landmark, landmark2, landmark3, landmark4, landmark5, landmark6), landmark, landmark2, landmark3, landmark4, landmark5, landmark6, detection2.getScore()));
        }
        return arrayList6;
    }

    public final RectF generateBoundingBoxFromLandmarks(float f, @NotNull Landmark landmark, @NotNull Landmark landmark2, @NotNull Landmark landmark3, @NotNull Landmark landmark4, @NotNull Landmark landmark5, @NotNull Landmark landmark6) {
        Intrinsics.checkNotNullParameter(landmark, "");
        Intrinsics.checkNotNullParameter(landmark2, "");
        Intrinsics.checkNotNullParameter(landmark3, "");
        Intrinsics.checkNotNullParameter(landmark4, "");
        Intrinsics.checkNotNullParameter(landmark5, "");
        Intrinsics.checkNotNullParameter(landmark6, "");
        Companion companion = Companion;
        float fCalculatePupilDistance$OKCompliance_ok_compliance_dynamic_aws_impl = companion.calculatePupilDistance$OKCompliance_ok_compliance_dynamic_aws_impl(landmark, landmark2);
        float fCalculateFaceHeight$OKCompliance_ok_compliance_dynamic_aws_impl = companion.calculateFaceHeight$OKCompliance_ok_compliance_dynamic_aws_impl(landmark, landmark2, landmark4);
        float f2 = 2;
        float f3 = ((fCalculatePupilDistance$OKCompliance_ok_compliance_dynamic_aws_impl * ALPHA) + (fCalculateFaceHeight$OKCompliance_ok_compliance_dynamic_aws_impl * GAMMA)) / f2;
        float x = (landmark.getX() + landmark2.getX()) / f2;
        float y = (landmark.getY() + landmark2.getY()) / f2;
        FaceTargetChallenge faceTargetChallenge = this.livenessState.getFaceTargetChallenge();
        if (faceTargetChallenge != null && y <= faceTargetChallenge.getTargetCenterY() / f2) {
            x = (x + landmark3.getX()) / f2;
        }
        float f4 = f3 / f2;
        return new RectF(Math.min(x - f4, landmark6.getX()), f - (f3 * GOLDEN_RATIO), Math.max(x + f4, landmark5.getX()), f);
    }

    private final List<Anchor> generateAnchors() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < strides.size()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int i2 = i;
            while (true) {
                List<Integer> list = strides;
                if (i2 >= list.size() || list.get(i2).intValue() != list.get(i).intValue()) {
                    break;
                }
                float fCalculateScale = calculateScale(MIN_SCALE, 0.75f, i2, list.size());
                arrayList4.add(Float.valueOf(1.0f));
                arrayList5.add(Float.valueOf(fCalculateScale));
                float fCalculateScale2 = i2 == list.size() - 1 ? 1.0f : calculateScale(MIN_SCALE, 0.75f, i2 + 1, list.size());
                arrayList5.add(Float.valueOf((float) Math.sqrt(fCalculateScale * fCalculateScale2)));
                arrayList4.add(Float.valueOf(1.0f));
                i2++;
            }
            int size = arrayList4.size();
            for (int i3 = 0; i3 < size; i3++) {
                float fSqrt = (float) Math.sqrt(((Number) arrayList4.get(i3)).floatValue());
                arrayList2.add(Float.valueOf(((Number) arrayList5.get(i3)).floatValue() / fSqrt));
                arrayList3.add(Float.valueOf(((Number) arrayList5.get(i3)).floatValue() * fSqrt));
            }
            double dIntValue = 128.0f / strides.get(i).intValue();
            int iCeil = (int) Math.ceil(dIntValue);
            int iCeil2 = (int) Math.ceil(dIntValue);
            for (int i4 = 0; i4 < iCeil; i4++) {
                for (int i5 = 0; i5 < iCeil2; i5++) {
                    int size2 = arrayList2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        arrayList.add(new Anchor(((i5 + 0.5f) * 1.0f) / iCeil2, ((i4 + 0.5f) * 1.0f) / iCeil, 1.0f, 1.0f));
                    }
                }
            }
            i = i2;
        }
        return arrayList;
    }

    private final float computeSigmoid(float f) {
        return 1.0f / (((float) Math.exp(Math.min(Math.max(f, -100.0f), 100.0f) * (-1))) + 1.0f);
    }

    private final List<Detection> weightedNonMaxSuppression(List<IndexedScore> list, List<Detection> list2) {
        List list3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Detection detection;
        Landmark landmark;
        Landmark landmark2;
        Landmark landmark3;
        Landmark landmark4;
        Landmark landmark5;
        Landmark landmark6;
        List<Detection> list4 = list2;
        List<IndexedScore> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) list);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        while (!listFJNWhG.isEmpty()) {
            Detection detection2 = list4.get(((IndexedScore) listFJNWhG.get(0)).getIndex());
            if (detection2.getScore() < -1.0f) {
                break;
            }
            arrayList4.clear();
            arrayList5.clear();
            RectF rectF = new RectF(detection2.getLocation());
            for (IndexedScore indexedScore : listFJNWhG) {
                if (overlapSimilarity(new RectF(list4.get(indexedScore.getIndex()).getLocation()), rectF) > MIN_SUPPRESSION_THRESHOLD) {
                    arrayList5.add(indexedScore);
                } else {
                    arrayList4.add(indexedScore);
                }
            }
            RectF rectF2 = new RectF(detection2.getLocation());
            Landmark leftEye = detection2.getLeftEye();
            Landmark rightEye = detection2.getRightEye();
            Landmark nose = detection2.getNose();
            Landmark mouth = detection2.getMouth();
            Landmark leftEar = detection2.getLeftEar();
            Landmark rightEar = detection2.getRightEar();
            if (!arrayList5.isEmpty()) {
                Iterator it = arrayList5.iterator();
                float score = 0.0f;
                float f = 0.0f;
                float score2 = 0.0f;
                float score3 = 0.0f;
                float score4 = 0.0f;
                float x = 0.0f;
                float y = 0.0f;
                float x2 = 0.0f;
                float y2 = 0.0f;
                float x3 = 0.0f;
                float y3 = 0.0f;
                float x4 = 0.0f;
                float y4 = 0.0f;
                float x5 = 0.0f;
                float y5 = 0.0f;
                float x6 = 0.0f;
                float y6 = 0.0f;
                while (it.hasNext()) {
                    IndexedScore indexedScore2 = (IndexedScore) it.next();
                    float score5 = indexedScore2.getScore();
                    ArrayList arrayList7 = arrayList5;
                    RectF location = list4.get(indexedScore2.getIndex()).getLocation();
                    Iterator it2 = it;
                    Landmark leftEye2 = list4.get(indexedScore2.getIndex()).getLeftEye();
                    Landmark rightEye2 = list4.get(indexedScore2.getIndex()).getRightEye();
                    ArrayList arrayList8 = arrayList6;
                    Landmark nose2 = list4.get(indexedScore2.getIndex()).getNose();
                    Detection detection3 = detection2;
                    Landmark mouth2 = list4.get(indexedScore2.getIndex()).getMouth();
                    ArrayList arrayList9 = arrayList4;
                    Landmark leftEar2 = list4.get(indexedScore2.getIndex()).getLeftEar();
                    List list5 = listFJNWhG;
                    Landmark rightEar2 = list4.get(indexedScore2.getIndex()).getRightEar();
                    score += location.left * indexedScore2.getScore();
                    score2 += location.top * indexedScore2.getScore();
                    score3 += location.right * indexedScore2.getScore();
                    score4 += location.bottom * indexedScore2.getScore();
                    x += leftEye2.getX() * indexedScore2.getScore();
                    y += leftEye2.getY() * indexedScore2.getScore();
                    x2 += rightEye2.getX() * indexedScore2.getScore();
                    y2 += rightEye2.getY() * indexedScore2.getScore();
                    x3 += nose2.getX() * indexedScore2.getScore();
                    y3 += nose2.getY() * indexedScore2.getScore();
                    x4 += mouth2.getX() * indexedScore2.getScore();
                    y4 += mouth2.getY() * indexedScore2.getScore();
                    x5 += leftEar2.getX() * indexedScore2.getScore();
                    y5 += leftEar2.getY() * indexedScore2.getScore();
                    x6 += rightEar2.getX() * indexedScore2.getScore();
                    y6 += rightEar2.getY() * indexedScore2.getScore();
                    f += score5;
                    arrayList5 = arrayList7;
                    list4 = list2;
                    it = it2;
                    arrayList6 = arrayList8;
                    detection2 = detection3;
                    arrayList4 = arrayList9;
                    listFJNWhG = list5;
                }
                list3 = listFJNWhG;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
                detection = detection2;
                float f2 = 128;
                rectF2.left = (score / f) * f2;
                rectF2.top = (score2 / f) * f2;
                rectF2.right = (score3 / f) * f2;
                rectF2.bottom = (score4 / f) * f2;
                Landmark landmark7 = new Landmark((x / f) * f2, (y / f) * f2);
                Landmark landmark8 = new Landmark((x2 / f) * f2, (y2 / f) * f2);
                Landmark landmark9 = new Landmark((x3 / f) * f2, (y3 / f) * f2);
                landmark6 = landmark7;
                landmark = landmark8;
                landmark2 = landmark9;
                landmark3 = new Landmark((x4 / f) * f2, (y4 / f) * f2);
                landmark4 = new Landmark((x5 / f) * f2, (y5 / f) * f2);
                landmark5 = new Landmark((x6 / f) * f2, f2 * (y6 / f));
            } else {
                list3 = listFJNWhG;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
                detection = detection2;
                landmark = rightEye;
                landmark2 = nose;
                landmark3 = mouth;
                landmark4 = leftEar;
                landmark5 = rightEar;
                landmark6 = leftEye;
            }
            list3.clear();
            ArrayList arrayList10 = arrayList;
            List list6 = list3;
            list6.addAll(arrayList10);
            ArrayList arrayList11 = arrayList3;
            arrayList11.add(new Detection(rectF2, landmark6, landmark, landmark2, landmark3, landmark4, landmark5, detection.getScore()));
            arrayList4 = arrayList10;
            arrayList6 = arrayList11;
            arrayList5 = arrayList2;
            listFJNWhG = list6;
            list4 = list2;
        }
        return arrayList6;
    }

    private final float overlapSimilarity(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return 0.0f;
        }
        RectF rectF3 = new RectF();
        rectF3.setIntersect(rectF, rectF2);
        float fHeight = rectF3.height() * rectF3.width();
        float fHeight2 = ((rectF.height() * rectF.width()) + (rectF2.height() * rectF2.width())) - fHeight;
        if (fHeight2 > 0.0f) {
            return fHeight / fHeight2;
        }
        return 0.0f;
    }

    public static final class Anchor {
        private final float h;
        private final float w;
        private final float xCenter;
        private final float yCenter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getH() {
            return this.h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getW() {
            return this.w;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getXCenter() {
            return this.xCenter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getYCenter() {
            return this.yCenter;
        }

        public Anchor(float f, float f2, float f3, float f4) {
            this.xCenter = f;
            this.yCenter = f2;
            this.h = f3;
            this.w = f4;
        }
    }

    public static final class Landmark {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getX() {
            return this.x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getY() {
            return this.y;
        }

        public Landmark(float f, float f2) {
            this.x = f;
            this.y = f2;
        }
    }

    public static final class Detection {
        public static final int $stable = 8;
        private final Landmark leftEar;
        private final Landmark leftEye;
        private final RectF location;
        private final Landmark mouth;
        private final Landmark nose;
        private final Landmark rightEar;
        private final Landmark rightEye;
        private final float score;

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
        public final Landmark getNose() {
            return this.nose;
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

        public Detection(@NotNull RectF rectF, @NotNull Landmark landmark, @NotNull Landmark landmark2, @NotNull Landmark landmark3, @NotNull Landmark landmark4, @NotNull Landmark landmark5, @NotNull Landmark landmark6, float f) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(landmark, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            Intrinsics.checkNotNullParameter(landmark3, "");
            Intrinsics.checkNotNullParameter(landmark4, "");
            Intrinsics.checkNotNullParameter(landmark5, "");
            Intrinsics.checkNotNullParameter(landmark6, "");
            this.location = rectF;
            this.leftEye = landmark;
            this.rightEye = landmark2;
            this.nose = landmark3;
            this.mouth = landmark4;
            this.leftEar = landmark5;
            this.rightEar = landmark6;
            this.score = f;
        }
    }

    public static final class IndexedScore {
        private final int index;
        private final float score;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIndex() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getScore() {
            return this.score;
        }

        public IndexedScore(int i, float f) {
            this.index = i;
            this.score = f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FaceOvalPosition {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FaceOvalPosition[] $VALUES;
        private final int colorType;
        private final int instructionStringRes;
        public static final FaceOvalPosition MATCHED = new FaceOvalPosition("MATCHED", 0, R.string.pr_compliance_sdk_liveness_text_hold_still, 0, 2, null);
        public static final FaceOvalPosition TOO_FAR_LEFT = new FaceOvalPosition("TOO_FAR_LEFT", 1, R.string.pr_compliance_sdk_liveness_text_move_closer, 1);
        public static final FaceOvalPosition TOO_FAR_RIGHT = new FaceOvalPosition("TOO_FAR_RIGHT", 2, R.string.pr_compliance_sdk_liveness_text_move_closer, 1);
        public static final FaceOvalPosition TOO_CLOSE = new FaceOvalPosition("TOO_CLOSE", 3, R.string.pr_compliance_sdk_liveness_text_move_back, 2);
        public static final FaceOvalPosition TOO_FAR = new FaceOvalPosition("TOO_FAR", 4, R.string.pr_compliance_sdk_liveness_text_move_closer, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FaceOvalPosition[] $values() {
            return new FaceOvalPosition[]{MATCHED, TOO_FAR_LEFT, TOO_FAR_RIGHT, TOO_CLOSE, TOO_FAR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FaceOvalPosition> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getColorType() {
            return this.colorType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getInstructionStringRes() {
            return this.instructionStringRes;
        }

        private FaceOvalPosition(String str, int i, int i2, int i3) {
            this.instructionStringRes = i2;
            this.colorType = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, int, int, int):void (m)] (LINE:448) call: com.amplifyframework.ui.liveness.ml.FaceDetector.FaceOvalPosition.<init>(java.lang.String, int, int, int):void type: THIS */
        public /* synthetic */ FaceOvalPosition(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i4 & 2) != 0 ? 0 : i3);
        }

        static {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.ml.FaceDetector.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float getStaticOvalWidth(float f, float f2, int i) {
            float f3 = i;
            if (f > f2) {
                f = 0.75f * f2;
            }
            return f3 * 0.8f * f;
        }

        private Companion() {
        }

        public final Interpreter loadModel(@NotNull Context context) throws IOException {
            Intrinsics.checkNotNullParameter(context, "");
            try {
                TensorFlowLite.init();
            } catch (Exception e) {
                pUU.copydefault("FaceDetector", "TensorFlowLite init exception->" + e.getMessage());
            } catch (UnsatisfiedLinkError e2) {
                pUU.copydefault("FaceDetector", "TensorFlowLite init error->" + e2.getMessage());
                try {
                    YG.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), "tensorflowlite_jni");
                } catch (Exception e3) {
                    pUU.copydefault("FaceDetector", "ReLinker TensorFlowLite init exception->" + e3.getMessage());
                } catch (UnsatisfiedLinkError e4) {
                    pUU.copydefault("FaceDetector", "ReLinker TensorFlowLite init error->" + e4.getMessage());
                }
            }
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd("face_detection_short_range.tflite");
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "");
            return new Interpreter(new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength()));
        }

        public final FaceOvalPosition calculateFaceOvalPosition(@NotNull RectF rectF, @NotNull RectF rectF2, @NotNull FaceTargetMatchingParameters faceTargetMatchingParameters) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(rectF2, "");
            Intrinsics.checkNotNullParameter(faceTargetMatchingParameters, "");
            float fIntersectionOverUnion = intersectionOverUnion(rectF, rectF2);
            float fWidth = rectF2.width() * faceTargetMatchingParameters.getTargetIouWidthThreshold();
            float fHeight = rectF2.height();
            float targetIouHeightThreshold = faceTargetMatchingParameters.getTargetIouHeightThreshold();
            float fWidth2 = rectF2.width() * faceTargetMatchingParameters.getFaceIouWidthThreshold();
            float fHeight2 = rectF2.height() * faceTargetMatchingParameters.getFaceIouHeightThreshold();
            if (fIntersectionOverUnion > faceTargetMatchingParameters.getTargetIouThreshold() && Math.abs(rectF2.left - rectF.left) < fWidth && Math.abs(rectF2.right - rectF.right) < fWidth && Math.abs(rectF2.bottom - rectF.bottom) < fHeight * targetIouHeightThreshold) {
                return FaceOvalPosition.MATCHED;
            }
            float f = rectF2.left;
            float f2 = rectF.left;
            if (f > f2 && rectF2.right > rectF.right) {
                return FaceOvalPosition.TOO_FAR_LEFT;
            }
            if (f2 > f && rectF.right > rectF2.right) {
                return FaceOvalPosition.TOO_FAR_RIGHT;
            }
            if (rectF2.top - rectF.top > fHeight2 || rectF.bottom - rectF2.bottom > fHeight2 || (f - f2 > fWidth2 && rectF.right - rectF2.right > fWidth2)) {
                return FaceOvalPosition.TOO_CLOSE;
            }
            return FaceOvalPosition.TOO_FAR;
        }

        public final float calculateFaceMatchPercentage(@NotNull RectF rectF, @NotNull RectF rectF2, @NotNull FaceTargetMatchingParameters faceTargetMatchingParameters, float f) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(rectF2, "");
            Intrinsics.checkNotNullParameter(faceTargetMatchingParameters, "");
            return Math.max(Math.min(1.0f, (((intersectionOverUnion(rectF, rectF2) - f) * 0.75f) / (faceTargetMatchingParameters.getTargetIouThreshold() - f)) + 0.25f), 0.0f);
        }

        public final float calculateFaceDistance(@NotNull Landmark landmark, @NotNull Landmark landmark2, @NotNull Landmark landmark3, int i, int i2) {
            Intrinsics.checkNotNullParameter(landmark, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            Intrinsics.checkNotNullParameter(landmark3, "");
            return ((((calculatePupilDistance$OKCompliance_ok_compliance_dynamic_aws_impl(landmark, landmark2) * FaceDetector.ALPHA) + (calculateFaceHeight$OKCompliance_ok_compliance_dynamic_aws_impl(landmark, landmark2, landmark3) * FaceDetector.GAMMA)) / FaceDetector.ALPHA) / FaceDetector.ALPHA) / getStaticOvalWidth$default(this, i, i2, 0, 4, null);
        }

        public final float calculatePupilDistance$OKCompliance_ok_compliance_dynamic_aws_impl(@NotNull Landmark landmark, @NotNull Landmark landmark2) {
            Intrinsics.checkNotNullParameter(landmark, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            double d = 2;
            return (float) Math.sqrt(((float) Math.pow(landmark.getX() - landmark2.getX(), d)) + ((float) Math.pow(landmark.getY() - landmark2.getY(), d)));
        }

        public final float calculateFaceHeight$OKCompliance_ok_compliance_dynamic_aws_impl(@NotNull Landmark landmark, @NotNull Landmark landmark2, @NotNull Landmark landmark3) {
            Intrinsics.checkNotNullParameter(landmark, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            Intrinsics.checkNotNullParameter(landmark3, "");
            float f = 2;
            double d = 2;
            return (float) Math.sqrt(((float) Math.pow(((landmark.getX() + landmark2.getX()) / f) - landmark3.getX(), d)) + ((float) Math.pow(((landmark.getY() + landmark2.getY()) / f) - landmark3.getY(), d)));
        }

        public static /* synthetic */ float getStaticOvalWidth$default(Companion companion, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 1;
            }
            return companion.getStaticOvalWidth(f, f2, i);
        }

        public final float intersectionOverUnion(@NotNull RectF rectF, @NotNull RectF rectF2) {
            Intrinsics.checkNotNullParameter(rectF, "");
            Intrinsics.checkNotNullParameter(rectF2, "");
            float fMax = Math.max(rectF.left, rectF2.left);
            float fMax2 = Math.max(rectF.top, rectF2.top);
            float fMax3 = Math.max(0.0f, Math.min(rectF.right, rectF2.right) - fMax) * Math.max(0.0f, Math.min(rectF.bottom, rectF2.bottom) - fMax2);
            if (fMax3 == 0.0f) {
                return 0.0f;
            }
            return fMax3 / ((Math.abs((rectF.bottom - rectF.top) * (rectF.right - rectF.left)) + Math.abs((rectF2.bottom - rectF2.top) * (rectF2.right - rectF2.left))) - fMax3);
        }
    }
}
