package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.ibm.icu.text.DateFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class ShapeStrokeParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("nm", "c", "w", "o", "lc", "lj", "ml", "hd", DateFormat.DAY);
    private static final JsonReader.Options DASH_PATTERN_NAMES = JsonReader.Options.of("n", DateFormat.ABBR_GENERIC_TZ);

    private ShapeStrokeParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ShapeStroke parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        byte b;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableColorValue color = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        boolean zNextBoolean = false;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        while (true) {
            int i = 100;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(NAMES)) {
                    case 0:
                        strNextString = jsonReader.nextString();
                        break;
                    case 1:
                        color = AnimatableValueParser.parseColor(jsonReader, lottieComposition);
                        break;
                    case 2:
                        animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                        break;
                    case 3:
                        animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                        break;
                    case 4:
                        lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                        break;
                    case 5:
                        lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                        break;
                    case 6:
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    case 7:
                        zNextBoolean = jsonReader.nextBoolean();
                        break;
                    case 8:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            AnimatableFloatValue animatableFloatValue3 = null;
                            String strNextString2 = null;
                            while (jsonReader.hasNext()) {
                                int iSelectName = jsonReader.selectName(DASH_PATTERN_NAMES);
                                if (iSelectName == 0) {
                                    strNextString2 = jsonReader.nextString();
                                } else if (iSelectName == 1) {
                                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                } else {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            strNextString2.hashCode();
                            int iHashCode = strNextString2.hashCode();
                            if (iHashCode != i) {
                                if (iHashCode != 103) {
                                    b = (iHashCode == 111 && strNextString2.equals("o")) ? (byte) 2 : (byte) -1;
                                } else if (strNextString2.equals("g")) {
                                    b = 1;
                                }
                            } else if (strNextString2.equals(DateFormat.DAY)) {
                                b = 0;
                            }
                            if (b == 0 || b == 1) {
                                lottieComposition.setHasDashPattern(true);
                                arrayList.add(animatableFloatValue3);
                            } else if (b == 2) {
                                animatableFloatValue = animatableFloatValue3;
                            }
                            i = 100;
                        }
                        jsonReader.endArray();
                        if (arrayList.size() == 1) {
                            arrayList.add((AnimatableFloatValue) arrayList.get(0));
                        }
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                if (animatableIntegerValue == null) {
                    animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
                }
                if (lineCapType == null) {
                    lineCapType = ShapeStroke.LineCapType.BUTT;
                }
                if (lineJoinType == null) {
                    lineJoinType = ShapeStroke.LineJoinType.MITER;
                }
                return new ShapeStroke(strNextString, animatableFloatValue, arrayList, color, animatableIntegerValue, animatableFloatValue2, lineCapType, lineJoinType, fNextDouble, zNextBoolean);
            }
        }
    }
}
