package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class PathParser implements ValueParser<PointF> {
    public static final PathParser INSTANCE = new PathParser();

    private PathParser() {
    }

    /* JADX DEBUG: Method merged with bridge method: parse(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public PointF parse(JsonReader jsonReader, float f) throws IOException {
        return JsonUtils.jsonToPoint(jsonReader, f);
    }
}
