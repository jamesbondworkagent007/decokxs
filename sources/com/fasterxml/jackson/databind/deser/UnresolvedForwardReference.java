package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C5558Wi;
import o.C5565Wp;

/* JADX INFO: loaded from: classes21.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;
    private C5565Wp _roid;
    private List<C5558Wi> _unresolvedIds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5565Wp getRoid() {
        return this._roid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<C5558Wi> getUnresolvedIds() {
        return this._unresolvedIds;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, C5565Wp c5565Wp) {
        super(jsonParser, str, jsonLocation);
        this._roid = c5565Wp;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this._unresolvedIds = new ArrayList();
    }

    public Object getUnresolvedId() {
        return this._roid.EZpvd().key;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._unresolvedIds.add(new C5558Wi(obj, cls, jsonLocation));
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._unresolvedIds == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<C5558Wi> it = this._unresolvedIds.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: fillInStackTrace()Ljava/lang/Throwable; */
    @Override // java.lang.Throwable
    public UnresolvedForwardReference fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    public UnresolvedForwardReference withStackTrace() {
        super.fillInStackTrace();
        return this;
    }
}
