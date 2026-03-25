package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.google.common.base.Ascii;
import com.ibm.icu.text.DateFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ContentModelParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("ty", DateFormat.DAY);

    private ContentModelParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ContentModel parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ContentModel contentModel;
        String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            contentModel = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jsonReader.selectName(NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iSelectName == 1) {
                iNextInt = jsonReader.nextInt();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (strNextString == null) {
            return null;
        }
        int iHashCode = strNextString.hashCode();
        if (iHashCode != 3239) {
            if (iHashCode != 3270) {
                if (iHashCode != 3295) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3646) {
                            if (iHashCode != 3669) {
                                if (iHashCode != 3679) {
                                    if (iHashCode != 3681) {
                                        if (iHashCode != 3705) {
                                            if (iHashCode != 3710) {
                                                if (iHashCode != 3307) {
                                                    if (iHashCode != 3308) {
                                                        if (iHashCode != 3633) {
                                                            b = (iHashCode == 3634 && strNextString.equals("rd")) ? (byte) 7 : (byte) -1;
                                                        } else if (strNextString.equals("rc")) {
                                                            b = 6;
                                                        }
                                                    } else if (strNextString.equals("gs")) {
                                                        b = 4;
                                                    }
                                                } else if (strNextString.equals("gr")) {
                                                    b = 3;
                                                }
                                            } else if (strNextString.equals("tr")) {
                                                b = Ascii.CR;
                                            }
                                        } else if (strNextString.equals("tm")) {
                                            b = Ascii.FF;
                                        }
                                    } else if (strNextString.equals("st")) {
                                        b = Ascii.VT;
                                    }
                                } else if (strNextString.equals("sr")) {
                                    b = 10;
                                }
                            } else if (strNextString.equals("sh")) {
                                b = 9;
                            }
                        } else if (strNextString.equals("rp")) {
                            b = 8;
                        }
                    } else if (strNextString.equals("mm")) {
                        b = 5;
                    }
                } else if (!strNextString.equals("gf")) {
                }
            } else if (strNextString.equals("fl")) {
                b = 1;
            }
        } else if (strNextString.equals("el")) {
            b = 0;
        }
        switch (b) {
            case 0:
                contentModel = CircleShapeParser.parse(jsonReader, lottieComposition, iNextInt);
                break;
            case 1:
                contentModel = ShapeFillParser.parse(jsonReader, lottieComposition);
                break;
            case 2:
                contentModel = GradientFillParser.parse(jsonReader, lottieComposition);
                break;
            case 3:
                contentModel = ShapeGroupParser.parse(jsonReader, lottieComposition);
                break;
            case 4:
                contentModel = GradientStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case 5:
                contentModel = MergePathsParser.parse(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModel = RectangleShapeParser.parse(jsonReader, lottieComposition);
                break;
            case 7:
                contentModel = RoundedCornersParser.parse(jsonReader, lottieComposition);
                break;
            case 8:
                contentModel = RepeaterParser.parse(jsonReader, lottieComposition);
                break;
            case 9:
                contentModel = ShapePathParser.parse(jsonReader, lottieComposition);
                break;
            case 10:
                contentModel = PolystarShapeParser.parse(jsonReader, lottieComposition, iNextInt);
                break;
            case 11:
                contentModel = ShapeStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case 12:
                contentModel = ShapeTrimPathParser.parse(jsonReader, lottieComposition);
                break;
            case 13:
                contentModel = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type " + strNextString);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModel;
    }
}
