package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import o.AbstractC5507Uk;

/* JADX INFO: renamed from: o.Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5507Uk<F extends JsonFactory, B extends AbstractC5507Uk<F, B>> {
    public static final int AEQbTJ = JsonFactory.Feature.collectDefaults();
    public static final int AYXKKw = JsonParser.Feature.collectDefaults();
    public static final int djBIcL = JsonGenerator.Feature.collectDefaults();
    public OutputDecorator AhwBna;
    public int AkhnZx;
    public int DbNXlk;
    public InputDecorator gEmmrt;
    public int valueOf;

    public AbstractC5507Uk() {
        this.valueOf = AEQbTJ;
        this.DbNXlk = AYXKKw;
        this.AkhnZx = djBIcL;
        this.gEmmrt = null;
        this.AhwBna = null;
    }

    public AbstractC5507Uk(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    public AbstractC5507Uk(int i, int i2, int i3) {
        this.valueOf = i;
        this.DbNXlk = i2;
        this.AkhnZx = i3;
    }
}
