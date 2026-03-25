package o;

import com.fasterxml.jackson.core.JsonParser;

/* JADX INFO: renamed from: o.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5543Vt extends C5545Vv {
    public int AYXKKw;
    public boolean KWHzl;
    public final boolean OLrzqt;
    public final JsonParser[] valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5543Vt(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.OLrzqt = z;
        if (z && this.AkhnZx.QOLQEE()) {
            z2 = true;
        }
        this.KWHzl = z2;
        this.valueOf = jsonParserArr;
        this.AYXKKw = 1;
    }

    public static C5543Vt copydefault(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof C5543Vt;
        if (!z2 && !(jsonParser2 instanceof C5543Vt)) {
            return new C5543Vt(z, new JsonParser[]{jsonParser, jsonParser2});
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z2) {
            ((C5543Vt) jsonParser).AEQbTJ(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof C5543Vt) {
            ((C5543Vt) jsonParser2).AEQbTJ(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new C5543Vt(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    public void AEQbTJ(java.util.List<JsonParser> list) {
        int length = this.valueOf.length;
        for (int i = this.AYXKKw - 1; i < length; i++) {
            JsonParser jsonParser = this.valueOf[i];
            if (jsonParser instanceof C5543Vt) {
                ((C5543Vt) jsonParser).AEQbTJ(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        do {
            this.AkhnZx.close();
        } while (dxcTrN());
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        JsonParser jsonParser = this.AkhnZx;
        if (jsonParser == null) {
            return null;
        }
        if (this.KWHzl) {
            this.KWHzl = false;
            return jsonParser.djBIcL();
        }
        com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        return jsonTokenRcXXUw == null ? djSkpj() : jsonTokenRcXXUw;
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public JsonParser UeEOUB() throws java.io.IOException {
        if (this.AkhnZx.djBIcL() != com.fasterxml.jackson.core.JsonToken.START_OBJECT && this.AkhnZx.djBIcL() != com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = RcXXUw();
            if (jsonTokenRcXXUw == null) {
                return this;
            }
            if (jsonTokenRcXXUw.isStructStart()) {
                i++;
            } else if (jsonTokenRcXXUw.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    public boolean dxcTrN() {
        int i = this.AYXKKw;
        JsonParser[] jsonParserArr = this.valueOf;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this.AYXKKw = i + 1;
        this.AkhnZx = jsonParserArr[i];
        return true;
    }

    public com.fasterxml.jackson.core.JsonToken djSkpj() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw;
        do {
            int i = this.AYXKKw;
            JsonParser[] jsonParserArr = this.valueOf;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.AYXKKw = i + 1;
            JsonParser jsonParser = jsonParserArr[i];
            this.AkhnZx = jsonParser;
            if (this.OLrzqt && jsonParser.QOLQEE()) {
                return this.AkhnZx.DbNXlk();
            }
            jsonTokenRcXXUw = this.AkhnZx.RcXXUw();
        } while (jsonTokenRcXXUw == null);
        return jsonTokenRcXXUw;
    }
}
