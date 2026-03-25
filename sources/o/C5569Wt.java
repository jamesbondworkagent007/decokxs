package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.BitSet;
import o.AbstractC5566Wq;

/* JADX INFO: renamed from: o.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5569Wt {
    public final ObjectIdReader AEQbTJ;
    public final JsonParser AYXKKw;
    public int AhwBna;
    public final DeserializationContext EZpvd;
    public AbstractC5566Wq KWHzl;
    public java.lang.Object OLrzqt;
    public final java.lang.Object[] copydefault;
    public final BitSet djBIcL;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5566Wq copydefault() {
        return this.KWHzl;
    }

    public C5569Wt(JsonParser jsonParser, DeserializationContext deserializationContext, int i, ObjectIdReader objectIdReader) {
        this.AYXKKw = jsonParser;
        this.EZpvd = deserializationContext;
        this.AhwBna = i;
        this.AEQbTJ = objectIdReader;
        this.copydefault = new java.lang.Object[i];
        if (i < 32) {
            this.djBIcL = null;
        } else {
            this.djBIcL = new BitSet();
        }
    }

    public java.lang.Object[] OLrzqt(SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (this.AhwBna > 0) {
            if (this.djBIcL == null) {
                int i = this.gEmmrt;
                int length = this.copydefault.length;
                int i2 = 0;
                while (i2 < length) {
                    if ((i & 1) == 0) {
                        this.copydefault[i2] = KWHzl(settableBeanPropertyArr[i2]);
                    }
                    i2++;
                    i >>= 1;
                }
            } else {
                int length2 = this.copydefault.length;
                int i3 = 0;
                while (true) {
                    int iNextClearBit = this.djBIcL.nextClearBit(i3);
                    if (iNextClearBit >= length2) {
                        break;
                    }
                    this.copydefault[iNextClearBit] = KWHzl(settableBeanPropertyArr[iNextClearBit]);
                    i3 = iNextClearBit + 1;
                }
            }
        }
        if (this.EZpvd.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i4 = 0; i4 < settableBeanPropertyArr.length; i4++) {
                if (this.copydefault[i4] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    this.EZpvd.reportInputMismatch(settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), java.lang.Integer.valueOf(settableBeanPropertyArr[i4].getCreatorIndex()));
                }
            }
        }
        return this.copydefault;
    }

    public java.lang.Object KWHzl(SettableBeanProperty settableBeanProperty) throws DatabindException {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this.EZpvd.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
        }
        if (settableBeanProperty.isRequired()) {
            this.EZpvd.reportInputMismatch(settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.getName(), java.lang.Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this.EZpvd.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.EZpvd.reportInputMismatch(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), java.lang.Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        try {
            java.lang.Object absentValue = settableBeanProperty.getNullValueProvider().getAbsentValue(this.EZpvd);
            return absentValue != null ? absentValue : settableBeanProperty.getValueDeserializer().getAbsentValue(this.EZpvd);
        } catch (DatabindException e) {
            AnnotatedMember member = settableBeanProperty.getMember();
            if (member != null) {
                e.prependPath(member.getDeclaringClass(), settableBeanProperty.getName());
            }
            throw e;
        }
    }

    public boolean AEQbTJ(java.lang.String str) throws java.io.IOException {
        ObjectIdReader objectIdReader = this.AEQbTJ;
        if (objectIdReader == null || !str.equals(objectIdReader.propertyName.getSimpleName())) {
            return false;
        }
        this.OLrzqt = this.AEQbTJ.readObjectReference(this.AYXKKw, this.EZpvd);
        return true;
    }

    public java.lang.Object EZpvd(DeserializationContext deserializationContext, java.lang.Object obj) throws java.io.IOException {
        ObjectIdReader objectIdReader = this.AEQbTJ;
        if (objectIdReader != null) {
            java.lang.Object obj2 = this.OLrzqt;
            if (obj2 != null) {
                deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).AEQbTJ(obj);
                SettableBeanProperty settableBeanProperty = this.AEQbTJ.idProperty;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this.OLrzqt);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(objectIdReader, obj);
            }
        }
        return obj;
    }

    public boolean EZpvd(SettableBeanProperty settableBeanProperty, java.lang.Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this.copydefault[creatorIndex] = obj;
        BitSet bitSet = this.djBIcL;
        if (bitSet == null) {
            int i = this.gEmmrt;
            int i2 = (1 << creatorIndex) | i;
            if (i != i2) {
                this.gEmmrt = i2;
                int i3 = this.AhwBna - 1;
                this.AhwBna = i3;
                if (i3 <= 0) {
                    return this.AEQbTJ == null || this.OLrzqt != null;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this.djBIcL.set(creatorIndex);
            this.AhwBna--;
        }
        return false;
    }

    public void OLrzqt(SettableBeanProperty settableBeanProperty, java.lang.Object obj) {
        this.KWHzl = new AbstractC5566Wq.ActionBar(this.KWHzl, obj, settableBeanProperty);
    }

    public void AEQbTJ(SettableAnyProperty settableAnyProperty, java.lang.String str, java.lang.Object obj) {
        this.KWHzl = new AbstractC5566Wq.Application(this.KWHzl, obj, settableAnyProperty, str);
    }

    public void KWHzl(java.lang.Object obj, java.lang.Object obj2) {
        this.KWHzl = new AbstractC5566Wq.Activity(this.KWHzl, obj2, obj);
    }
}
