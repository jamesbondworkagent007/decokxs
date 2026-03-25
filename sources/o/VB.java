package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes21.dex */
public class VB<T> implements java.util.Iterator<T>, java.io.Closeable {
    public static final VB<?> copydefault = new VB<>(null, null, null, null, false, null);
    public final boolean AEQbTJ;
    public int AYXKKw;
    public final JsonParser EZpvd;
    public final DeserializationContext KWHzl;
    public final AbstractC5548Vy<T> OLrzqt;
    public final T djBIcL;
    public final AbstractC5503Ug gEmmrt;
    public final JavaType valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.Vy<?> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public VB(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5548Vy<?> abstractC5548Vy, boolean z, java.lang.Object obj) {
        this.valueOf = javaType;
        this.EZpvd = jsonParser;
        this.KWHzl = deserializationContext;
        this.OLrzqt = abstractC5548Vy;
        this.AEQbTJ = z;
        if (obj == 0) {
            this.djBIcL = null;
        } else {
            this.djBIcL = obj;
        }
        if (jsonParser == null) {
            this.gEmmrt = null;
            this.AYXKKw = 0;
            return;
        }
        AbstractC5503Ug abstractC5503UgWlaJM = jsonParser.wlaJM();
        if (z && jsonParser.RJOkX()) {
            jsonParser.OLrzqt();
        } else {
            com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.START_OBJECT || jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
                abstractC5503UgWlaJM = abstractC5503UgWlaJM.AEQbTJ();
            }
        }
        this.gEmmrt = abstractC5503UgWlaJM;
        this.AYXKKw = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return OLrzqt();
        } catch (JsonMappingException e) {
            return ((java.lang.Boolean) AEQbTJ(e)).booleanValue();
        } catch (java.io.IOException e2) {
            return ((java.lang.Boolean) copydefault(e2)).booleanValue();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return EZpvd();
        } catch (JsonMappingException e) {
            return (T) AEQbTJ(e);
        } catch (java.io.IOException e2) {
            return (T) copydefault(e2);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.AYXKKw != 0) {
            this.AYXKKw = 0;
            JsonParser jsonParser = this.EZpvd;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public boolean OLrzqt() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw;
        int i = this.AYXKKw;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            AEQbTJ();
        } else if (i != 2) {
            return true;
        }
        JsonParser jsonParser = this.EZpvd;
        if (jsonParser == null) {
            return false;
        }
        if (jsonParser.djBIcL() != null || ((jsonTokenRcXXUw = this.EZpvd.RcXXUw()) != null && jsonTokenRcXXUw != com.fasterxml.jackson.core.JsonToken.END_ARRAY)) {
            this.AYXKKw = 3;
            return true;
        }
        this.AYXKKw = 0;
        if (this.AEQbTJ) {
            this.EZpvd.close();
        }
        return false;
    }

    public T EZpvd() throws java.io.IOException {
        T tDeserialize;
        int i = this.AYXKKw;
        if (i == 0) {
            return (T) copydefault();
        }
        if ((i == 1 || i == 2) && !OLrzqt()) {
            return (T) copydefault();
        }
        try {
            T t = this.djBIcL;
            if (t == null) {
                tDeserialize = this.OLrzqt.deserialize(this.EZpvd, this.KWHzl);
            } else {
                this.OLrzqt.deserialize(this.EZpvd, this.KWHzl, t);
                tDeserialize = this.djBIcL;
            }
            this.AYXKKw = 2;
            this.EZpvd.OLrzqt();
            return tDeserialize;
        } catch (java.lang.Throwable th) {
            this.AYXKKw = 1;
            this.EZpvd.OLrzqt();
            throw th;
        }
    }

    public void AEQbTJ() throws java.io.IOException {
        JsonParser jsonParser = this.EZpvd;
        if (jsonParser.wlaJM() == this.gEmmrt) {
            return;
        }
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.END_ARRAY || jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.END_OBJECT) {
                if (jsonParser.wlaJM() == this.gEmmrt) {
                    jsonParser.OLrzqt();
                    return;
                }
            } else if (jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.START_ARRAY || jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
                jsonParser.UeEOUB();
            } else if (jsonTokenRcXXUw == null) {
                return;
            }
        }
    }

    public <R> R copydefault() {
        throw new NoSuchElementException();
    }

    public <R> R AEQbTJ(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    public <R> R copydefault(java.io.IOException iOException) {
        throw new java.lang.RuntimeException(iOException.getMessage(), iOException);
    }
}
