package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.io.CharacterEscapes;

/* JADX INFO: renamed from: o.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5502Uf extends AbstractC5507Uk<JsonFactory, C5502Uf> {
    public char EZpvd;
    public int KWHzl;
    public CharacterEscapes OLrzqt;
    public InterfaceC5501Ue copydefault;

    public C5502Uf() {
        this.EZpvd = '\"';
        this.copydefault = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.KWHzl = 0;
    }

    public C5502Uf(JsonFactory jsonFactory) {
        super(jsonFactory);
        this.EZpvd = '\"';
        this.OLrzqt = jsonFactory.getCharacterEscapes();
        this.copydefault = jsonFactory._rootValueSeparator;
        this.KWHzl = jsonFactory._maximumNonEscapedChar;
    }
}
