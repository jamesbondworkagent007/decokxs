package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.ibm.icu.text.DateFormat;
import com.okinc.p2p.api.OtcExtraKeys;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class MaskParser {
    private MaskParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Mask parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        byte b;
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        AnimatableShapeValue shapeData = null;
        AnimatableIntegerValue integer = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iHashCode = strNextName.hashCode();
            byte b2 = -1;
            if (iHashCode != 111) {
                if (iHashCode != 3588) {
                    if (iHashCode != 104433) {
                        b = (iHashCode == 3357091 && strNextName.equals(OtcExtraKeys.MODE)) ? (byte) 3 : (byte) -1;
                    } else if (strNextName.equals("inv")) {
                        b = 2;
                    }
                } else if (strNextName.equals("pt")) {
                    b = 1;
                }
            } else if (strNextName.equals("o")) {
                b = 0;
            }
            if (b == 0) {
                integer = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
            } else if (b == 1) {
                shapeData = AnimatableValueParser.parseShapeData(jsonReader, lottieComposition);
            } else if (b == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (b == 3) {
                String strNextString = jsonReader.nextString();
                strNextString.hashCode();
                int iHashCode2 = strNextString.hashCode();
                if (iHashCode2 != 97) {
                    if (iHashCode2 != 105) {
                        if (iHashCode2 != 110) {
                            if (iHashCode2 == 115 && strNextString.equals(DateFormat.SECOND)) {
                                b2 = 3;
                            }
                        } else if (strNextString.equals("n")) {
                            b2 = 2;
                        }
                    } else if (strNextString.equals("i")) {
                        b2 = 1;
                    }
                } else if (strNextString.equals(IEncryptorType.DEFAULT_ENCRYPTOR)) {
                    b2 = 0;
                }
                if (b2 == 0) {
                    maskMode = Mask.MaskMode.MASK_MODE_ADD;
                } else if (b2 == 1) {
                    lottieComposition.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                    maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                } else if (b2 == 2) {
                    maskMode = Mask.MaskMode.MASK_MODE_NONE;
                } else if (b2 == 3) {
                    maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                } else {
                    Logger.warning("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                    maskMode = Mask.MaskMode.MASK_MODE_ADD;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, shapeData, integer, zNextBoolean);
    }
}
