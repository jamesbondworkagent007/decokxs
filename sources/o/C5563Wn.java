package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import java.util.LinkedList;

/* JADX INFO: renamed from: o.Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5563Wn {
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ;
    public final YA[] EZpvd;
    public final java.lang.String[] KWHzl;
    public final JavaType OLrzqt;
    public final StateListAnimator[] copydefault;

    public C5563Wn(JavaType javaType, StateListAnimator[] stateListAnimatorArr, java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String[] strArr, YA[] yaArr) {
        this.OLrzqt = javaType;
        this.copydefault = stateListAnimatorArr;
        this.AEQbTJ = map;
        this.KWHzl = strArr;
        this.EZpvd = yaArr;
    }

    public C5563Wn(C5563Wn c5563Wn) {
        this.OLrzqt = c5563Wn.OLrzqt;
        StateListAnimator[] stateListAnimatorArr = c5563Wn.copydefault;
        this.copydefault = stateListAnimatorArr;
        this.AEQbTJ = c5563Wn.AEQbTJ;
        int length = stateListAnimatorArr.length;
        this.KWHzl = new java.lang.String[length];
        this.EZpvd = new YA[length];
    }

    public static TaskDescription copydefault(JavaType javaType) {
        return new TaskDescription(javaType);
    }

    public C5563Wn AEQbTJ() {
        return new C5563Wn(this);
    }

    public boolean AEQbTJ(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        java.lang.Object obj2 = this.AEQbTJ.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        java.lang.String strZLjUOn = jsonParser.zLjUOn();
        if (obj2 instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj2).iterator();
            while (it.hasNext()) {
                if (OLrzqt(jsonParser, deserializationContext, str, obj, strZLjUOn, ((java.lang.Integer) it.next()).intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return OLrzqt(jsonParser, deserializationContext, str, obj, strZLjUOn, ((java.lang.Integer) obj2).intValue());
    }

    public final boolean OLrzqt(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i) throws java.io.IOException {
        if (!this.copydefault[i].AEQbTJ(str)) {
            return false;
        }
        if (obj != null && this.EZpvd[i] != null) {
            KWHzl(jsonParser, deserializationContext, obj, i, str2);
            this.EZpvd[i] = null;
            return true;
        }
        this.KWHzl[i] = str2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean EZpvd(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        java.lang.Object obj2 = this.AEQbTJ.get(str);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj2).iterator();
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (this.copydefault[num.intValue()].AEQbTJ(str)) {
                java.lang.String strZLjUOn = jsonParser.zLjUOn();
                jsonParser.UeEOUB();
                this.KWHzl[num.intValue()] = strZLjUOn;
                while (it.hasNext()) {
                    this.KWHzl[((java.lang.Integer) it.next()).intValue()] = strZLjUOn;
                }
            } else {
                YA yaBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                this.EZpvd[num.intValue()] = yaBufferAsCopyOfValue;
                while (it.hasNext()) {
                    this.EZpvd[((java.lang.Integer) it.next()).intValue()] = yaBufferAsCopyOfValue;
                }
            }
            return true;
        }
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        if (this.copydefault[iIntValue].AEQbTJ(str)) {
            this.KWHzl[iIntValue] = jsonParser.QKVWgx();
            jsonParser.UeEOUB();
            if (obj != null && this.EZpvd[iIntValue] != null) {
                java.lang.String[] strArr = this.KWHzl;
                java.lang.String str2 = strArr[iIntValue];
                strArr[iIntValue] = null;
                KWHzl(jsonParser, deserializationContext, obj, iIntValue, str2);
                this.EZpvd[iIntValue] = null;
            }
        } else {
            this.EZpvd[iIntValue] = deserializationContext.bufferAsCopyOfValue(jsonParser);
            if (obj != null && this.KWHzl[iIntValue] != null) {
            }
        }
        return true;
    }

    public java.lang.Object EZpvd(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.Object obj) throws java.io.IOException {
        int length = this.copydefault.length;
        for (int i = 0; i < length; i++) {
            java.lang.String strKWHzl = this.KWHzl[i];
            StateListAnimator stateListAnimator = this.copydefault[i];
            if (strKWHzl == null) {
                YA ya = this.EZpvd[i];
                if (ya != null) {
                    if (ya.AuCTel().isScalarValue()) {
                        JsonParser jsonParserGEmmrt = ya.gEmmrt(jsonParser);
                        jsonParserGEmmrt.RcXXUw();
                        SettableBeanProperty settableBeanPropertyAEQbTJ = stateListAnimator.AEQbTJ();
                        java.lang.Object objDeserializeIfNatural = AbstractC5597Xv.deserializeIfNatural(jsonParserGEmmrt, deserializationContext, settableBeanPropertyAEQbTJ.getType());
                        if (objDeserializeIfNatural != null) {
                            settableBeanPropertyAEQbTJ.set(obj, objDeserializeIfNatural);
                        }
                    }
                    if (!stateListAnimator.copydefault()) {
                        deserializationContext.reportPropertyInputMismatch(this.OLrzqt, stateListAnimator.AEQbTJ().getName(), "Missing external type id property '%s' (and no 'defaultImpl' specified)", stateListAnimator.OLrzqt());
                    } else {
                        strKWHzl = stateListAnimator.KWHzl();
                        if (strKWHzl == null) {
                            deserializationContext.reportPropertyInputMismatch(this.OLrzqt, stateListAnimator.AEQbTJ().getName(), "Invalid default type id for property '%s': `null` returned by TypeIdResolver", stateListAnimator.OLrzqt());
                        }
                    }
                }
            } else if (this.EZpvd[i] == null) {
                SettableBeanProperty settableBeanPropertyAEQbTJ2 = stateListAnimator.AEQbTJ();
                if (settableBeanPropertyAEQbTJ2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportPropertyInputMismatch(obj.getClass(), settableBeanPropertyAEQbTJ2.getName(), "Missing property '%s' for external type id '%s'", settableBeanPropertyAEQbTJ2.getName(), stateListAnimator.OLrzqt());
                }
                return obj;
            }
            KWHzl(jsonParser, deserializationContext, obj, i, strKWHzl);
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(JsonParser jsonParser, DeserializationContext deserializationContext, C5569Wt c5569Wt, PropertyBasedCreator propertyBasedCreator) throws java.io.IOException {
        SettableBeanProperty settableBeanPropertyAEQbTJ;
        int length = this.copydefault.length;
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < length; i++) {
            java.lang.String str = this.KWHzl[i];
            StateListAnimator stateListAnimator = this.copydefault[i];
            java.lang.String strKWHzl = str;
            if (str == null) {
                YA ya = this.EZpvd[i];
                if (ya != null && ya.AuCTel() != com.fasterxml.jackson.core.JsonToken.VALUE_NULL) {
                    if (!stateListAnimator.copydefault()) {
                        deserializationContext.reportPropertyInputMismatch(this.OLrzqt, stateListAnimator.AEQbTJ().getName(), "Missing external type id property '%s'", stateListAnimator.OLrzqt());
                        strKWHzl = str;
                    } else {
                        strKWHzl = stateListAnimator.KWHzl();
                    }
                    if (this.EZpvd[i] == null) {
                    }
                    settableBeanPropertyAEQbTJ = stateListAnimator.AEQbTJ();
                    if (settableBeanPropertyAEQbTJ.getCreatorIndex() < 0) {
                    }
                }
            } else {
                if (this.EZpvd[i] == null) {
                    objArr[i] = KWHzl(jsonParser, deserializationContext, i, strKWHzl);
                } else {
                    if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        SettableBeanProperty settableBeanPropertyAEQbTJ2 = stateListAnimator.AEQbTJ();
                        deserializationContext.reportPropertyInputMismatch(this.OLrzqt, settableBeanPropertyAEQbTJ2.getName(), "Missing property '%s' for external type id '%s'", settableBeanPropertyAEQbTJ2.getName(), this.copydefault[i].OLrzqt());
                    }
                    objArr[i] = AEQbTJ(jsonParser, deserializationContext, i, strKWHzl);
                }
                settableBeanPropertyAEQbTJ = stateListAnimator.AEQbTJ();
                if (settableBeanPropertyAEQbTJ.getCreatorIndex() < 0) {
                    c5569Wt.EZpvd(settableBeanPropertyAEQbTJ, objArr[i]);
                    SettableBeanProperty settableBeanPropertyEZpvd = stateListAnimator.EZpvd();
                    if (settableBeanPropertyEZpvd != null && settableBeanPropertyEZpvd.getCreatorIndex() >= 0) {
                        java.lang.Object obj = strKWHzl;
                        if (!settableBeanPropertyEZpvd.getType().hasRawClass(java.lang.String.class)) {
                            YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
                            yaBufferForInputBuffering.AhwBna(strKWHzl);
                            java.lang.Object objDeserialize = settableBeanPropertyEZpvd.getValueDeserializer().deserialize(yaBufferForInputBuffering.fARcdN(), deserializationContext);
                            yaBufferForInputBuffering.close();
                            obj = objDeserialize;
                        }
                        c5569Wt.EZpvd(settableBeanPropertyEZpvd, obj);
                    }
                }
            }
        }
        java.lang.Object objEZpvd = propertyBasedCreator.EZpvd(deserializationContext, c5569Wt);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanPropertyAEQbTJ3 = this.copydefault[i2].AEQbTJ();
            if (settableBeanPropertyAEQbTJ3.getCreatorIndex() < 0) {
                settableBeanPropertyAEQbTJ3.set(objEZpvd, objArr[i2]);
            }
        }
        return objEZpvd;
    }

    public final java.lang.Object KWHzl(JsonParser jsonParser, DeserializationContext deserializationContext, int i, java.lang.String str) throws java.io.IOException {
        JsonParser jsonParserGEmmrt = this.EZpvd[i].gEmmrt(jsonParser);
        if (jsonParserGEmmrt.RcXXUw() == com.fasterxml.jackson.core.JsonToken.VALUE_NULL) {
            return null;
        }
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.values();
        yaBufferForInputBuffering.AhwBna(str);
        yaBufferForInputBuffering.EZpvd(jsonParserGEmmrt);
        yaBufferForInputBuffering.fetchVPNInfo();
        JsonParser jsonParserGEmmrt2 = yaBufferForInputBuffering.gEmmrt(jsonParser);
        jsonParserGEmmrt2.RcXXUw();
        return this.copydefault[i].AEQbTJ().deserialize(jsonParserGEmmrt2, deserializationContext);
    }

    public final java.lang.Object AEQbTJ(JsonParser jsonParser, DeserializationContext deserializationContext, int i, java.lang.String str) throws java.io.IOException {
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.values();
        yaBufferForInputBuffering.AhwBna(str);
        yaBufferForInputBuffering.fetchVPNInfo();
        JsonParser jsonParserGEmmrt = yaBufferForInputBuffering.gEmmrt(jsonParser);
        jsonParserGEmmrt.RcXXUw();
        return this.copydefault[i].AEQbTJ().deserialize(jsonParserGEmmrt, deserializationContext);
    }

    public final void KWHzl(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.Object obj, int i, java.lang.String str) throws java.io.IOException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this.OLrzqt, "Internal error in external Type Id handling: `null` type id passed", new java.lang.Object[0]);
        }
        JsonParser jsonParserGEmmrt = this.EZpvd[i].gEmmrt(jsonParser);
        if (jsonParserGEmmrt.RcXXUw() == com.fasterxml.jackson.core.JsonToken.VALUE_NULL) {
            this.copydefault[i].AEQbTJ().set(obj, null);
            return;
        }
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.values();
        yaBufferForInputBuffering.AhwBna(str);
        yaBufferForInputBuffering.EZpvd(jsonParserGEmmrt);
        yaBufferForInputBuffering.fetchVPNInfo();
        JsonParser jsonParserGEmmrt2 = yaBufferForInputBuffering.gEmmrt(jsonParser);
        jsonParserGEmmrt2.RcXXUw();
        this.copydefault[i].AEQbTJ().deserializeAndSet(jsonParserGEmmrt2, deserializationContext, obj);
    }

    /* JADX INFO: renamed from: o.Wn$TaskDescription */
    public static class TaskDescription {
        public final JavaType KWHzl;
        public final java.util.List<StateListAnimator> OLrzqt = new java.util.ArrayList();
        public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ = new java.util.HashMap();

        public TaskDescription(JavaType javaType) {
            this.KWHzl = javaType;
        }

        public void copydefault(SettableBeanProperty settableBeanProperty, AbstractC5597Xv abstractC5597Xv) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.OLrzqt.size());
            this.OLrzqt.add(new StateListAnimator(settableBeanProperty, abstractC5597Xv));
            EZpvd(settableBeanProperty.getName(), numValueOf);
            EZpvd(abstractC5597Xv.getPropertyName(), numValueOf);
        }

        public final void EZpvd(java.lang.String str, java.lang.Integer num) {
            java.lang.Object obj = this.AEQbTJ.get(str);
            if (obj == null) {
                this.AEQbTJ.put(str, num);
                return;
            }
            if (obj instanceof java.util.List) {
                ((java.util.List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this.AEQbTJ.put(str, linkedList);
        }

        public C5563Wn AEQbTJ(BeanPropertyMap beanPropertyMap) {
            int size = this.OLrzqt.size();
            StateListAnimator[] stateListAnimatorArr = new StateListAnimator[size];
            for (int i = 0; i < size; i++) {
                StateListAnimator stateListAnimator = this.OLrzqt.get(i);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(stateListAnimator.OLrzqt());
                if (settableBeanPropertyFind != null) {
                    stateListAnimator.EZpvd(settableBeanPropertyFind);
                }
                stateListAnimatorArr[i] = stateListAnimator;
            }
            return new C5563Wn(this.KWHzl, stateListAnimatorArr, this.AEQbTJ, null, null);
        }
    }

    /* JADX INFO: renamed from: o.Wn$StateListAnimator */
    public static final class StateListAnimator {
        public SettableBeanProperty AEQbTJ;
        public final AbstractC5597Xv KWHzl;
        public final java.lang.String OLrzqt;
        public final SettableBeanProperty copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SettableBeanProperty AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SettableBeanProperty EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(SettableBeanProperty settableBeanProperty) {
            this.AEQbTJ = settableBeanProperty;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        public StateListAnimator(SettableBeanProperty settableBeanProperty, AbstractC5597Xv abstractC5597Xv) {
            this.copydefault = settableBeanProperty;
            this.KWHzl = abstractC5597Xv;
            this.OLrzqt = abstractC5597Xv.getPropertyName();
        }

        public boolean AEQbTJ(java.lang.String str) {
            return str.equals(this.OLrzqt);
        }

        public boolean copydefault() {
            return this.KWHzl.hasDefaultImpl();
        }

        public java.lang.String KWHzl() {
            java.lang.Class<?> defaultImpl = this.KWHzl.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this.KWHzl.getTypeIdResolver().KWHzl((java.lang.Object) null, defaultImpl);
        }
    }
}
