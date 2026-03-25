package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ibm.icu.text.DateFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowEffectParser {
    private static final JsonReader.Options DROP_SHADOW_EFFECT_NAMES = JsonReader.Options.of("ef");
    private static final JsonReader.Options INNER_EFFECT_NAMES = JsonReader.Options.of("nm", DateFormat.ABBR_GENERIC_TZ);
    private AnimatableColorValue color;
    private AnimatableFloatValue direction;
    private AnimatableFloatValue distance;
    private AnimatableFloatValue opacity;
    private AnimatableFloatValue radius;

    public DropShadowEffect parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(DROP_SHADOW_EFFECT_NAMES) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    maybeParseInnerEffect(jsonReader, lottieComposition);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        AnimatableColorValue animatableColorValue = this.color;
        if (animatableColorValue == null || (animatableFloatValue = this.opacity) == null || (animatableFloatValue2 = this.direction) == null || (animatableFloatValue3 = this.distance) == null || (animatableFloatValue4 = this.radius) == null) {
            return null;
        }
        return new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeParseInnerEffect(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        byte b;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(INNER_EFFECT_NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                strNextString.hashCode();
                switch (strNextString.hashCode()) {
                    case 353103893:
                        b = !strNextString.equals("Distance") ? (byte) -1 : (byte) 0;
                        break;
                    case 397447147:
                        if (strNextString.equals("Opacity")) {
                            b = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (strNextString.equals("Direction")) {
                            b = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (strNextString.equals("Shadow Color")) {
                            b = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (strNextString.equals("Softness")) {
                            b = 4;
                            break;
                        }
                        break;
                }
                if (b == 0) {
                    this.distance = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                } else if (b == 1) {
                    this.opacity = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                } else if (b == 2) {
                    this.direction = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                } else if (b == 3) {
                    this.color = AnimatableValueParser.parseColor(jsonReader, lottieComposition);
                } else if (b == 4) {
                    this.radius = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                } else {
                    jsonReader.skipValue();
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
