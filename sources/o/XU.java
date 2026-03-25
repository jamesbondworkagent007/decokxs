package o;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public class XU {
    public static final BeanPropertyWriter[] KWHzl = new BeanPropertyWriter[0];
    public XN AEQbTJ;
    public C5606Ye AYXKKw;
    public java.util.List<BeanPropertyWriter> AhwBna = Collections.emptyList();
    public java.lang.Object EZpvd;
    public SerializationConfig OLrzqt;
    public final AbstractC5549Vz copydefault;
    public BeanPropertyWriter[] djBIcL;
    public AnnotatedMember valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(SerializationConfig serializationConfig) {
        this.OLrzqt = serializationConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5606Ye AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.util.List<BeanPropertyWriter> list) {
        this.AhwBna = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(XN xn) {
        this.AEQbTJ = xn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.Object obj) {
        this.EZpvd = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5549Vz OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XN copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(C5606Ye c5606Ye) {
        this.AYXKKw = c5606Ye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnotatedMember gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<BeanPropertyWriter> valueOf() {
        return this.AhwBna;
    }

    public XU(AbstractC5549Vz abstractC5549Vz) {
        this.copydefault = abstractC5549Vz;
    }

    public void copydefault(BeanPropertyWriter[] beanPropertyWriterArr) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == this.AhwBna.size()) {
            this.djBIcL = beanPropertyWriterArr;
        } else {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", java.lang.Integer.valueOf(beanPropertyWriterArr.length), java.lang.Integer.valueOf(this.AhwBna.size())));
        }
    }

    public void EZpvd(AnnotatedMember annotatedMember) {
        if (this.valueOf == null) {
            this.valueOf = annotatedMember;
            return;
        }
        throw new java.lang.IllegalArgumentException("Multiple type ids specified with " + this.valueOf + " and " + annotatedMember);
    }

    public VD<?> KWHzl() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this.valueOf != null && this.OLrzqt.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.valueOf.fixAccess(this.OLrzqt.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        XN xn = this.AEQbTJ;
        if (xn != null) {
            xn.OLrzqt(this.OLrzqt);
        }
        java.util.List<BeanPropertyWriter> list = this.AhwBna;
        if (list == null || list.isEmpty()) {
            if (this.AEQbTJ == null && this.AYXKKw == null) {
                return null;
            }
            beanPropertyWriterArr = KWHzl;
        } else {
            java.util.List<BeanPropertyWriter> list2 = this.AhwBna;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.OLrzqt.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                    beanPropertyWriter.fixAccess(this.OLrzqt);
                }
            }
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.djBIcL;
        if (beanPropertyWriterArr2 != null && beanPropertyWriterArr2.length != this.AhwBna.size()) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", java.lang.Integer.valueOf(this.AhwBna.size()), java.lang.Integer.valueOf(this.djBIcL.length)));
        }
        return new BeanSerializer(this.copydefault.getNewProxyInstance(), this, beanPropertyWriterArr, this.djBIcL);
    }

    public BeanSerializer EZpvd() {
        return BeanSerializer.createDummy(this.copydefault.getNewProxyInstance(), this);
    }
}
