package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* JADX INFO: renamed from: o.Uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5511Uo extends TokenFilter {
    public final JsonPointer OLrzqt;

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter EZpvd() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter KWHzl() {
        return this;
    }

    public C5511Uo(java.lang.String str) {
        this(JsonPointer.compile(str));
    }

    public C5511Uo(JsonPointer jsonPointer) {
        this.OLrzqt = jsonPointer;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter AEQbTJ(int i) {
        JsonPointer jsonPointerMatchElement = this.OLrzqt.matchElement(i);
        if (jsonPointerMatchElement == null) {
            return null;
        }
        return jsonPointerMatchElement.matches() ? TokenFilter.KWHzl : new C5511Uo(jsonPointerMatchElement);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter AEQbTJ(java.lang.String str) {
        JsonPointer jsonPointerMatchProperty = this.OLrzqt.matchProperty(str);
        if (jsonPointerMatchProperty == null) {
            return null;
        }
        return jsonPointerMatchProperty.matches() ? TokenFilter.KWHzl : new C5511Uo(jsonPointerMatchProperty);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public boolean AEQbTJ() {
        return this.OLrzqt.matches();
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public java.lang.String toString() {
        return "[JsonPointerFilter at: " + this.OLrzqt + "]";
    }
}
