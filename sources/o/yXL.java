package o;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import o.yXJ;
import o.yXK;
import o.yXL.Activity;
import o.yXQ;

/* JADX INFO: loaded from: classes13.dex */
public final class yXL<FieldDescriptorType extends Activity<FieldDescriptorType>> {
    public static final yXL copydefault = new yXL(true);
    public boolean EZpvd;
    public boolean OLrzqt = false;
    public final yXU<FieldDescriptorType, java.lang.Object> KWHzl = yXU.copydefault(16);

    public interface Activity<T extends Activity<T>> extends java.lang.Comparable<T> {
        WireFormat.JavaType AEQbTJ();

        int EZpvd();

        boolean KWHzl();

        WireFormat.FieldType OLrzqt();

        yXQ.StateListAnimator copydefault(yXQ.StateListAnimator stateListAnimator, yXQ yxq);

        boolean copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T extends Activity<T>> yXL<T> AEQbTJ() {
        return copydefault;
    }

    private yXL() {
    }

    public yXL(boolean z) {
        djBIcL();
    }

    public static <T extends Activity<T>> yXL<T> KWHzl() {
        return new yXL<>();
    }

    public void djBIcL() {
        if (this.EZpvd) {
            return;
        }
        this.KWHzl.valueOf();
        this.EZpvd = true;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yXL<FieldDescriptorType> clone() {
        yXL<FieldDescriptorType> yxlKWHzl = KWHzl();
        for (int i = 0; i < this.KWHzl.copydefault(); i++) {
            Map.Entry<K, java.lang.Object> entryEZpvd = this.KWHzl.EZpvd(i);
            yxlKWHzl.copydefault((Activity) entryEZpvd.getKey(), entryEZpvd.getValue());
        }
        java.util.Iterator it = this.KWHzl.KWHzl().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            yxlKWHzl.copydefault((Activity) entry.getKey(), entry.getValue());
        }
        yxlKWHzl.OLrzqt = this.OLrzqt;
        return yxlKWHzl;
    }

    public java.util.Iterator<Map.Entry<FieldDescriptorType, java.lang.Object>> gEmmrt() {
        if (this.OLrzqt) {
            return new yXK.StateListAnimator(this.KWHzl.entrySet().iterator());
        }
        return this.KWHzl.entrySet().iterator();
    }

    public boolean copydefault(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.KWHzl()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.KWHzl.get(fielddescriptortype) != null;
    }

    public java.lang.Object OLrzqt(FieldDescriptorType fielddescriptortype) {
        java.lang.Object obj = this.KWHzl.get(fielddescriptortype);
        return obj instanceof yXK ? ((yXK) obj).EZpvd() : obj;
    }

    public void copydefault(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        if (fielddescriptortype.KWHzl()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EZpvd(fielddescriptortype.OLrzqt(), it.next());
            }
            obj = arrayList;
        } else {
            EZpvd(fielddescriptortype.OLrzqt(), obj);
        }
        if (obj instanceof yXK) {
            this.OLrzqt = true;
        }
        this.KWHzl.put(fielddescriptortype, obj);
    }

    public int AEQbTJ(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.KWHzl()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object objOLrzqt = OLrzqt((Activity) fielddescriptortype);
        if (objOLrzqt == null) {
            return 0;
        }
        return ((java.util.List) objOLrzqt).size();
    }

    public java.lang.Object AEQbTJ(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.KWHzl()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object objOLrzqt = OLrzqt((Activity) fielddescriptortype);
        if (objOLrzqt == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return ((java.util.List) objOLrzqt).get(i);
    }

    public void EZpvd(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        java.util.List arrayList;
        if (!fielddescriptortype.KWHzl()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        EZpvd(fielddescriptortype.OLrzqt(), obj);
        java.lang.Object objOLrzqt = OLrzqt((Activity) fielddescriptortype);
        if (objOLrzqt == null) {
            arrayList = new java.util.ArrayList();
            this.KWHzl.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (java.util.List) objOLrzqt;
        }
        arrayList.add(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void EZpvd(WireFormat.FieldType fieldType, java.lang.Object obj) {
        boolean z;
        obj.getClass();
        switch (AnonymousClass3.EZpvd[fieldType.getJavaType().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 2:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 3:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 4:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 5:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 6:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 7:
                if ((obj instanceof yXD) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof yXJ.Activity)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 9:
                if ((obj instanceof yXQ) || (obj instanceof yXK)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public boolean EZpvd() {
        for (int i = 0; i < this.KWHzl.copydefault(); i++) {
            if (!OLrzqt((Map.Entry) this.KWHzl.EZpvd(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.KWHzl.KWHzl().iterator();
        while (it.hasNext()) {
            if (!OLrzqt((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean OLrzqt(Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.AEQbTJ() == WireFormat.JavaType.MESSAGE) {
            if (key.KWHzl()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((yXQ) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof yXQ) {
                    if (!((yXQ) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof yXK) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static int EZpvd(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public void AEQbTJ(yXL<FieldDescriptorType> yxl) {
        for (int i = 0; i < yxl.KWHzl.copydefault(); i++) {
            copydefault(yxl.KWHzl.EZpvd(i));
        }
        java.util.Iterator it = yxl.KWHzl.KWHzl().iterator();
        while (it.hasNext()) {
            copydefault((Map.Entry) it.next());
        }
    }

    public final java.lang.Object OLrzqt(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final void copydefault(Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof yXK) {
            value = ((yXK) value).EZpvd();
        }
        if (key.KWHzl()) {
            java.lang.Object objOLrzqt = OLrzqt((Activity) key);
            if (objOLrzqt == null) {
                objOLrzqt = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) objOLrzqt).add(OLrzqt(it.next()));
            }
            this.KWHzl.put(key, objOLrzqt);
            return;
        }
        if (key.AEQbTJ() == WireFormat.JavaType.MESSAGE) {
            java.lang.Object objOLrzqt2 = OLrzqt((Activity) key);
            if (objOLrzqt2 == null) {
                this.KWHzl.put(key, OLrzqt(value));
                return;
            } else {
                this.KWHzl.put(key, key.copydefault(((yXQ) objOLrzqt2).toBuilder(), (yXQ) value).OLrzqt());
                return;
            }
        }
        this.KWHzl.put(key, OLrzqt(value));
    }

    /* JADX INFO: renamed from: o.yXL$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            KWHzl = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                KWHzl[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                KWHzl[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                KWHzl[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                KWHzl[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                KWHzl[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                KWHzl[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                KWHzl[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                KWHzl[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                KWHzl[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                KWHzl[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                KWHzl[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                KWHzl[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                KWHzl[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                KWHzl[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            EZpvd = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                EZpvd[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                EZpvd[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                EZpvd[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                EZpvd[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                EZpvd[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                EZpvd[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                EZpvd[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                EZpvd[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    public static java.lang.Object copydefault(yXG yxg, WireFormat.FieldType fieldType, boolean z) throws java.io.IOException {
        switch (AnonymousClass3.KWHzl[fieldType.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(yxg.EZpvd());
            case 2:
                return java.lang.Float.valueOf(yxg.valueOf());
            case 3:
                return java.lang.Long.valueOf(yxg.values());
            case 4:
                return java.lang.Long.valueOf(yxg.zLjUOn());
            case 5:
                return java.lang.Integer.valueOf(yxg.AhwBna());
            case 6:
                return java.lang.Long.valueOf(yxg.gEmmrt());
            case 7:
                return java.lang.Integer.valueOf(yxg.djBIcL());
            case 8:
                return java.lang.Boolean.valueOf(yxg.copydefault());
            case 9:
                if (z) {
                    return yxg.iwGUEr();
                }
                return yxg.uzCIH();
            case 10:
                return yxg.KWHzl();
            case 11:
                return java.lang.Integer.valueOf(yxg.getFieldNames());
            case 12:
                return java.lang.Integer.valueOf(yxg.ejfBZ());
            case 13:
                return java.lang.Long.valueOf(yxg.fARcdN());
            case 14:
                return java.lang.Integer.valueOf(yxg.AuCTel());
            case 15:
                return java.lang.Long.valueOf(yxg.getNewProxyInstance());
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void copydefault(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, java.lang.Object obj) throws java.io.IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.KWHzl(i, (yXQ) obj);
        } else {
            codedOutputStream.AEQbTJ(i, EZpvd(fieldType, false));
            copydefault(codedOutputStream, fieldType, obj);
        }
    }

    public static void copydefault(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (AnonymousClass3.KWHzl[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.KWHzl(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.copydefault(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.gEmmrt(((java.lang.Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.AkhnZx(((java.lang.Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.isConnected(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.AYXKKw(((java.lang.Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.AkhnZx(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.OLrzqt((java.lang.String) obj);
                break;
            case 10:
                if (obj instanceof yXD) {
                    codedOutputStream.EZpvd((yXD) obj);
                } else {
                    codedOutputStream.AEQbTJ((byte[]) obj);
                }
                break;
            case 11:
                codedOutputStream.AuCTel(((java.lang.Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.fJNWhG(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.isConnected(((java.lang.Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.fARcdN(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.DbNXlk(((java.lang.Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.KWHzl((yXQ) obj);
                break;
            case 17:
                codedOutputStream.EZpvd((yXQ) obj);
                break;
            case 18:
                if (obj instanceof yXJ.Activity) {
                    codedOutputStream.DbNXlk(((yXJ.Activity) obj).getNumber());
                } else {
                    codedOutputStream.DbNXlk(((java.lang.Integer) obj).intValue());
                }
                break;
        }
    }

    public static void AEQbTJ(Activity<?> activity, java.lang.Object obj, CodedOutputStream codedOutputStream) throws java.io.IOException {
        WireFormat.FieldType fieldTypeOLrzqt = activity.OLrzqt();
        int iEZpvd = activity.EZpvd();
        if (activity.KWHzl()) {
            java.util.List list = (java.util.List) obj;
            if (activity.copydefault()) {
                codedOutputStream.AEQbTJ(iEZpvd, 2);
                java.util.Iterator it = list.iterator();
                int iCopydefault = 0;
                while (it.hasNext()) {
                    iCopydefault += copydefault(fieldTypeOLrzqt, it.next());
                }
                codedOutputStream.ejfBZ(iCopydefault);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    copydefault(codedOutputStream, fieldTypeOLrzqt, it2.next());
                }
                return;
            }
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                copydefault(codedOutputStream, fieldTypeOLrzqt, iEZpvd, it3.next());
            }
            return;
        }
        if (obj instanceof yXK) {
            copydefault(codedOutputStream, fieldTypeOLrzqt, iEZpvd, ((yXK) obj).EZpvd());
        } else {
            copydefault(codedOutputStream, fieldTypeOLrzqt, iEZpvd, obj);
        }
    }

    public int OLrzqt() {
        int iAEQbTJ = 0;
        for (int i = 0; i < this.KWHzl.copydefault(); i++) {
            Map.Entry<K, java.lang.Object> entryEZpvd = this.KWHzl.EZpvd(i);
            iAEQbTJ += AEQbTJ((Activity<?>) entryEZpvd.getKey(), entryEZpvd.getValue());
        }
        java.util.Iterator it = this.KWHzl.KWHzl().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iAEQbTJ += AEQbTJ((Activity<?>) entry.getKey(), entry.getValue());
        }
        return iAEQbTJ;
    }

    public static int KWHzl(WireFormat.FieldType fieldType, int i, java.lang.Object obj) {
        int iAhwBna = CodedOutputStream.AhwBna(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iAhwBna *= 2;
        }
        return iAhwBna + copydefault(fieldType, obj);
    }

    public static int copydefault(WireFormat.FieldType fieldType, java.lang.Object obj) {
        switch (AnonymousClass3.KWHzl[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.EZpvd(((java.lang.Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.OLrzqt(((java.lang.Float) obj).floatValue());
            case 3:
                return CodedOutputStream.EZpvd(((java.lang.Long) obj).longValue());
            case 4:
                return CodedOutputStream.djBIcL(((java.lang.Long) obj).longValue());
            case 5:
                return CodedOutputStream.EZpvd(((java.lang.Integer) obj).intValue());
            case 6:
                return CodedOutputStream.AEQbTJ(((java.lang.Long) obj).longValue());
            case 7:
                return CodedOutputStream.AEQbTJ(((java.lang.Integer) obj).intValue());
            case 8:
                return CodedOutputStream.copydefault(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.AEQbTJ((java.lang.String) obj);
            case 10:
                if (obj instanceof yXD) {
                    return CodedOutputStream.copydefault((yXD) obj);
                }
                return CodedOutputStream.EZpvd((byte[]) obj);
            case 11:
                return CodedOutputStream.valueOf(((java.lang.Integer) obj).intValue());
            case 12:
                return CodedOutputStream.djBIcL(((java.lang.Integer) obj).intValue());
            case 13:
                return CodedOutputStream.OLrzqt(((java.lang.Long) obj).longValue());
            case 14:
                return CodedOutputStream.AYXKKw(((java.lang.Integer) obj).intValue());
            case 15:
                return CodedOutputStream.copydefault(((java.lang.Long) obj).longValue());
            case 16:
                return CodedOutputStream.copydefault((yXQ) obj);
            case 17:
                if (obj instanceof yXK) {
                    return CodedOutputStream.EZpvd((yXK) obj);
                }
                return CodedOutputStream.AEQbTJ((yXQ) obj);
            case 18:
                if (obj instanceof yXJ.Activity) {
                    return CodedOutputStream.KWHzl(((yXJ.Activity) obj).getNumber());
                }
                return CodedOutputStream.KWHzl(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int AEQbTJ(Activity<?> activity, java.lang.Object obj) {
        WireFormat.FieldType fieldTypeOLrzqt = activity.OLrzqt();
        int iEZpvd = activity.EZpvd();
        if (activity.KWHzl()) {
            int iKWHzl = 0;
            if (activity.copydefault()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    iKWHzl += copydefault(fieldTypeOLrzqt, it.next());
                }
                return CodedOutputStream.AhwBna(iEZpvd) + iKWHzl + CodedOutputStream.OLrzqt(iKWHzl);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                iKWHzl += KWHzl(fieldTypeOLrzqt, iEZpvd, it2.next());
            }
            return iKWHzl;
        }
        return KWHzl(fieldTypeOLrzqt, iEZpvd, obj);
    }
}
