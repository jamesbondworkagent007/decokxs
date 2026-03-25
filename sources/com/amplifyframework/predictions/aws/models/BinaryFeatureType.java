package com.amplifyframework.predictions.aws.models;

/* JADX INFO: loaded from: classes21.dex */
public enum BinaryFeatureType {
    BEARD("Beard"),
    SUNGLASSES("Sunglasses"),
    SMILE("Smile"),
    EYE_GLASSES("EyeGlasses"),
    MUSTACHE("Mustache"),
    MOUTH_OPEN("MouthOpen"),
    EYES_OPEN("EyesOpen");

    private final String typeAlias;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAlias() {
        return this.typeAlias;
    }

    BinaryFeatureType(String str) {
        this.typeAlias = str;
    }
}
