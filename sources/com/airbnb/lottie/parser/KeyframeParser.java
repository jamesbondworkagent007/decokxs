package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.ibm.icu.text.DateFormat;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class KeyframeParser {
    private static final float MAX_CP_VALUE = 100.0f;
    private static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.Options NAMES = JsonReader.Options.of("t", DateFormat.SECOND, "e", "o", "i", "h", "to", "ti");
    static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.of("x", DateFormat.YEAR);

    private static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new SparseArrayCompat<>();
        }
        return pathInterpolatorCache;
    }

    private static WeakReference<Interpolator> getInterpolator(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            weakReference = pathInterpolatorCache().get(i);
        }
        return weakReference;
    }

    private static void putInterpolator(int i, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.put(i, weakReference);
        }
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f, valueParser);
        }
        if (z) {
            return parseKeyframe(lottieComposition, jsonReader, f, valueParser);
        }
        return parseStaticValue(jsonReader, f, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolatorInterpolatorFor;
        T t;
        jsonReader.beginObject();
        PointF pointFJsonToPoint = null;
        T t2 = null;
        T t3 = null;
        PointF pointFJsonToPoint2 = null;
        PointF pointFJsonToPoint3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFJsonToPoint4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t3 = valueParser.parse(jsonReader, f);
                    break;
                case 2:
                    t2 = valueParser.parse(jsonReader, f);
                    break;
                case 3:
                    pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                case 7:
                    pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            t = t3;
        } else {
            interpolatorInterpolatorFor = (pointFJsonToPoint == null || pointFJsonToPoint4 == null) ? LINEAR_INTERPOLATOR : interpolatorFor(pointFJsonToPoint, pointFJsonToPoint4);
            t = t2;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t3, t, interpolatorInterpolatorFor, fNextDouble, null);
        keyframe.pathCp1 = pointFJsonToPoint3;
        keyframe.pathCp2 = pointFJsonToPoint2;
        return keyframe;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolatorInterpolatorFor;
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        T t2;
        Keyframe<T> keyframe;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f2;
        jsonReader.beginObject();
        PointF pointFJsonToPoint = null;
        PointF pointFJsonToPoint2 = null;
        boolean z = false;
        PointF pointFJsonToPoint3 = null;
        PointF pointFJsonToPoint4 = null;
        PointF pointF5 = null;
        T t3 = null;
        PointF pointF6 = null;
        T t4 = null;
        PointF pointF7 = null;
        float fNextDouble = 0.0f;
        PointF pointF8 = null;
        while (jsonReader.hasNext()) {
            T t5 = t4;
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    pointF = pointFJsonToPoint;
                    pointF2 = pointFJsonToPoint2;
                    fNextDouble = (float) jsonReader.nextDouble();
                    t4 = t5;
                    pointFJsonToPoint = pointF;
                    pointFJsonToPoint2 = pointF2;
                    break;
                case 1:
                    pointF = pointFJsonToPoint;
                    pointF2 = pointFJsonToPoint2;
                    t3 = valueParser.parse(jsonReader, f);
                    t4 = t5;
                    pointFJsonToPoint = pointF;
                    pointFJsonToPoint2 = pointF2;
                    break;
                case 2:
                    pointF = pointFJsonToPoint;
                    pointF2 = pointFJsonToPoint2;
                    t4 = valueParser.parse(jsonReader, f);
                    pointFJsonToPoint = pointF;
                    pointFJsonToPoint2 = pointF2;
                    break;
                case 3:
                    pointF = pointFJsonToPoint;
                    pointF2 = pointFJsonToPoint2;
                    float f3 = fNextDouble;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName == 0) {
                                pointF3 = pointF8;
                                JsonReader.Token tokenPeek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenPeek == token) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (iSelectName == 1) {
                                JsonReader.Token tokenPeek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenPeek2 == token2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    pointF3 = pointF8;
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointF8 = pointF3;
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        PointF pointF10 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                        t4 = t5;
                        fNextDouble = f3;
                        pointFJsonToPoint = pointF;
                        pointFJsonToPoint2 = pointF2;
                    } else {
                        fNextDouble = f3;
                        pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f);
                        t4 = t5;
                        pointFJsonToPoint = pointF;
                        pointFJsonToPoint2 = pointF2;
                    }
                    break;
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF11 = pointFJsonToPoint;
                            int iSelectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName2 != 0) {
                                pointF4 = pointFJsonToPoint2;
                                if (iSelectName2 == 1) {
                                    JsonReader.Token tokenPeek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenPeek3 == token3) {
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        fNextDouble9 = fNextDouble7;
                                    } else {
                                        jsonReader.beginArray();
                                        f2 = fNextDouble;
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        fNextDouble9 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                        jsonReader.endArray();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                f2 = fNextDouble;
                            } else {
                                pointF4 = pointFJsonToPoint2;
                                f2 = fNextDouble;
                                JsonReader.Token tokenPeek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenPeek4 == token4) {
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = fNextDouble6;
                                } else {
                                    jsonReader.beginArray();
                                    float fNextDouble10 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == token4 ? (float) jsonReader.nextDouble() : fNextDouble10;
                                    jsonReader.endArray();
                                    fNextDouble6 = fNextDouble10;
                                }
                            }
                            fNextDouble = f2;
                            pointFJsonToPoint = pointF11;
                            pointFJsonToPoint2 = pointF4;
                        }
                        pointF = pointFJsonToPoint;
                        pointF2 = pointFJsonToPoint2;
                        PointF pointF12 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF13 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF7 = pointF12;
                        pointF8 = pointF13;
                    } else {
                        pointF = pointFJsonToPoint;
                        pointF2 = pointFJsonToPoint2;
                        pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, f);
                    }
                    t4 = t5;
                    pointFJsonToPoint = pointF;
                    pointFJsonToPoint2 = pointF2;
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        t4 = t5;
                        z = false;
                    } else {
                        z = true;
                        t4 = t5;
                    }
                    break;
                case 6:
                    pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f);
                    t4 = t5;
                    break;
                case 7:
                    pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, f);
                    t4 = t5;
                    break;
                default:
                    jsonReader.skipValue();
                    t4 = t5;
                    pointFJsonToPoint = pointFJsonToPoint;
                    break;
            }
        }
        PointF pointF14 = pointFJsonToPoint;
        PointF pointF15 = pointFJsonToPoint2;
        T t6 = t4;
        float f4 = fNextDouble;
        PointF pointF16 = pointF8;
        jsonReader.endObject();
        if (z) {
            interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            t2 = t3;
        } else {
            if (pointFJsonToPoint3 == null || pointFJsonToPoint4 == null) {
                if (pointF5 != null && pointF6 != null && pointF7 != null && pointF16 != null) {
                    Interpolator interpolatorInterpolatorFor2 = interpolatorFor(pointF5, pointF7);
                    Interpolator interpolatorInterpolatorFor3 = interpolatorFor(pointF6, pointF16);
                    interpolator = interpolatorInterpolatorFor2;
                    interpolator2 = interpolatorInterpolatorFor3;
                    t = t6;
                    interpolatorInterpolatorFor = null;
                    if (interpolator == null && interpolator2 != null) {
                        keyframe = new Keyframe<>(lottieComposition, t3, t, interpolator, interpolator2, f4, null);
                    } else {
                        keyframe = new Keyframe<>(lottieComposition, t3, t, interpolatorInterpolatorFor, f4, null);
                    }
                    keyframe.pathCp1 = pointF15;
                    keyframe.pathCp2 = pointF14;
                    return keyframe;
                }
                interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            } else {
                interpolatorInterpolatorFor = interpolatorFor(pointFJsonToPoint3, pointFJsonToPoint4);
            }
            t2 = t6;
        }
        t = t2;
        interpolator = null;
        interpolator2 = null;
        if (interpolator == null) {
            keyframe = new Keyframe<>(lottieComposition, t3, t, interpolatorInterpolatorFor, f4, null);
        }
        keyframe.pathCp1 = pointF15;
        keyframe.pathCp2 = pointF14;
        return keyframe;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference<Interpolator> interpolator = L.getDisablePathInterpolatorCache() ? null : getInterpolator(iHashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator == null || interpolator2 == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator2 = linearInterpolator;
            if (!L.getDisablePathInterpolatorCache()) {
                try {
                    putInterpolator(iHashFor, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator2;
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        return new Keyframe<>(valueParser.parse(jsonReader, f));
    }
}
