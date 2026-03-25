package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class UW extends AbstractC5510Un {
    public boolean AkhnZx;
    public int[] AuCTel;
    public boolean DbNXlk;
    public InterfaceC5501Ue ejfBZ;
    public int fARcdN;
    public final C5517Ut fJNWhG;
    public CharacterEscapes isConnected;
    public static final int[] values = C5521Ux.OLrzqt();
    public static final C5541Vr<StreamWriteCapability> fetchVPNInfo = JsonGenerator.EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator EZpvd(int i) {
        if (i < 0) {
            i = 0;
        }
        this.fARcdN = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator KWHzl(InterfaceC5501Ue interfaceC5501Ue) {
        this.ejfBZ = interfaceC5501Ue;
        return this;
    }

    public UW(C5517Ut c5517Ut, int i, AbstractC5505Ui abstractC5505Ui) {
        super(i, abstractC5505Ui);
        this.AuCTel = values;
        this.ejfBZ = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.fJNWhG = c5517Ut;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this.fARcdN = 127;
        }
        this.DbNXlk = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.enabledIn(i);
        this.AkhnZx = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator KWHzl(JsonGenerator.Feature feature) {
        super.KWHzl(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.AkhnZx = true;
        } else if (feature == JsonGenerator.Feature.WRITE_HEX_UPPER_CASE) {
            this.DbNXlk = false;
        }
        return this;
    }

    @Override // o.AbstractC5510Un
    public void KWHzl(int i, int i2) {
        super.KWHzl(i, i2);
        this.AkhnZx = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
        this.DbNXlk = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator copydefault(CharacterEscapes characterEscapes) {
        this.isConnected = characterEscapes;
        if (characterEscapes == null) {
            this.AuCTel = values;
        } else {
            this.AuCTel = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    public void OLrzqt(java.lang.String str, int i) throws java.io.IOException {
        if (i == 0) {
            if (this.djBIcL.valueOf()) {
                this.copydefault.beforeArrayValues(this);
                return;
            } else {
                if (this.djBIcL.djBIcL()) {
                    this.copydefault.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            this.copydefault.writeArrayValueSeparator(this);
            return;
        }
        if (i == 2) {
            this.copydefault.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i == 3) {
            this.copydefault.writeRootValueSeparator(this);
        } else if (i == 5) {
            valueOf(str);
        } else {
            KWHzl();
        }
    }

    public void valueOf(java.lang.String str) throws java.io.IOException {
        AEQbTJ(java.lang.String.format("Can not %s, expecting field name (context: %s)", str, this.djBIcL.DbNXlk()));
    }
}
