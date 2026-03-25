package com.okinc.auth.impl.util;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SimpleCBOREncoder {
    public static final SimpleCBOREncoder OLrzqt = new SimpleCBOREncoder();

    private SimpleCBOREncoder() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class CBORMajorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CBORMajorType[] $VALUES;
        private final byte value;
        public static final CBORMajorType UNSIGNED = new CBORMajorType("UNSIGNED", 0, (byte) 0);
        public static final CBORMajorType NEGATIVE = new CBORMajorType("NEGATIVE", 1, (byte) 1);
        public static final CBORMajorType BYTE_STRING = new CBORMajorType("BYTE_STRING", 2, (byte) 2);
        public static final CBORMajorType TEXT_STRING = new CBORMajorType("TEXT_STRING", 3, (byte) 3);
        public static final CBORMajorType ARRAY = new CBORMajorType("ARRAY", 4, (byte) 4);
        public static final CBORMajorType MAP = new CBORMajorType("MAP", 5, (byte) 5);
        public static final CBORMajorType TAG = new CBORMajorType("TAG", 6, (byte) 6);
        public static final CBORMajorType SIMPLE = new CBORMajorType("SIMPLE", 7, (byte) 7);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CBORMajorType[] $values() {
            return new CBORMajorType[]{UNSIGNED, NEGATIVE, BYTE_STRING, TEXT_STRING, ARRAY, MAP, TAG, SIMPLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CBORMajorType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte asByte() {
            return (byte) (this.value << 5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte getValue() {
            return this.value;
        }

        private CBORMajorType(String str, int i, byte b) {
            this.value = b;
        }

        static {
            CBORMajorType[] cBORMajorTypeArr$values = $values();
            $VALUES = cBORMajorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cBORMajorTypeArr$values);
        }

        public static CBORMajorType valueOf(String str) {
            return (CBORMajorType) Enum.valueOf(CBORMajorType.class, str);
        }

        public static CBORMajorType[] values() {
            return (CBORMajorType[]) $VALUES.clone();
        }
    }

    public final byte[] KWHzl(@NotNull Map<String, ? extends Object> map) throws Exception {
        Intrinsics.checkNotNullParameter(map, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        KWHzl(map, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }

    public final byte[] EZpvd(@NotNull Map<Integer, ? extends Object> map) throws Exception {
        Intrinsics.checkNotNullParameter(map, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        EZpvd(map, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }

    public final void copydefault(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws Exception {
        if (obj == null) {
            copydefault(byteArrayOutputStream);
            return;
        }
        if (obj instanceof String) {
            EZpvd((String) obj, byteArrayOutputStream);
            return;
        }
        if (obj instanceof Integer) {
            copydefault(((Number) obj).intValue(), byteArrayOutputStream);
            return;
        }
        if (obj instanceof Long) {
            copydefault((int) ((Number) obj).longValue(), byteArrayOutputStream);
            return;
        }
        if (obj instanceof Boolean) {
            EZpvd(((Boolean) obj).booleanValue(), byteArrayOutputStream);
            return;
        }
        if (obj instanceof byte[]) {
            AEQbTJ((byte[]) obj, byteArrayOutputStream);
            return;
        }
        if (obj instanceof Map) {
            Map<Integer, ? extends Object> map = (Map) obj;
            Set<Integer> setKeySet = map.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof String)) {
                        Set<Integer> setKeySet2 = map.keySet();
                        if (!(setKeySet2 instanceof Collection) || !setKeySet2.isEmpty()) {
                            Iterator<T> it2 = setKeySet2.iterator();
                            while (it2.hasNext()) {
                                if (!(it2.next() instanceof Integer)) {
                                    throw new IllegalArgumentException("Map keys must be all Strings or all Ints");
                                }
                            }
                        }
                        Intrinsics.copydefault(obj, "");
                        EZpvd(map, byteArrayOutputStream);
                        return;
                    }
                }
            }
            Intrinsics.copydefault(obj, "");
            KWHzl((Map<String, ? extends Object>) map, byteArrayOutputStream);
            return;
        }
        if (obj instanceof List) {
            EZpvd((List<?>) obj, byteArrayOutputStream);
            return;
        }
        if (obj instanceof Object[]) {
            EZpvd(yDV.AwvSrB((Object[]) obj), byteArrayOutputStream);
            return;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    public final void EZpvd(List<?> list, ByteArrayOutputStream byteArrayOutputStream) throws Exception {
        EZpvd(list.size(), CBORMajorType.ARRAY, byteArrayOutputStream);
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            copydefault(it.next(), byteArrayOutputStream);
        }
    }

    public final void KWHzl(Map<String, ? extends Object> map, ByteArrayOutputStream byteArrayOutputStream) throws Exception {
        EZpvd(map.size(), CBORMajorType.MAP, byteArrayOutputStream);
        for (String str : CollectionsKt___CollectionsKt.AxsJAYaxsJAY(map.keySet())) {
            EZpvd(str, byteArrayOutputStream);
            copydefault(map.get(str), byteArrayOutputStream);
        }
    }

    public final void EZpvd(Map<Integer, ? extends Object> map, ByteArrayOutputStream byteArrayOutputStream) throws Exception {
        EZpvd(map.size(), CBORMajorType.MAP, byteArrayOutputStream);
        Iterator it = CollectionsKt___CollectionsKt.AxsJAYaxsJAY(map.keySet()).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            copydefault(iIntValue, byteArrayOutputStream);
            copydefault(map.get(Integer.valueOf(iIntValue)), byteArrayOutputStream);
        }
    }

    public final void EZpvd(long j, CBORMajorType cBORMajorType, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (j <= 23) {
            byteArrayOutputStream.write((byte) (((byte) j) | cBORMajorType.asByte()));
            return;
        }
        if (j <= 127) {
            byteArrayOutputStream.write((byte) (cBORMajorType.asByte() | Ascii.CAN));
            byteArrayOutputStream.write((byte) j);
        } else if (j <= 32767) {
            byteArrayOutputStream.write((byte) (cBORMajorType.asByte() | Ascii.EM));
            OLrzqt((short) j, byteArrayOutputStream);
        } else if (j <= 2147483647L) {
            byteArrayOutputStream.write((byte) (cBORMajorType.asByte() | Ascii.SUB));
            AEQbTJ((int) j, byteArrayOutputStream);
        } else {
            byteArrayOutputStream.write((byte) (cBORMajorType.asByte() | Ascii.ESC));
            KWHzl(j, byteArrayOutputStream);
        }
    }

    public final void copydefault(int i, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (i >= 0) {
            EZpvd(i, CBORMajorType.UNSIGNED, byteArrayOutputStream);
        } else {
            EZpvd((-i) - 1, CBORMajorType.NEGATIVE, byteArrayOutputStream);
        }
    }

    public final void EZpvd(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        EZpvd(bytes.length, CBORMajorType.TEXT_STRING, byteArrayOutputStream);
        byteArrayOutputStream.write(bytes);
    }

    public final void AEQbTJ(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        EZpvd(bArr.length, CBORMajorType.BYTE_STRING, byteArrayOutputStream);
        byteArrayOutputStream.write(bArr);
    }

    public final void EZpvd(boolean z, ByteArrayOutputStream byteArrayOutputStream) {
        if (z) {
            byteArrayOutputStream.write((byte) (CBORMajorType.SIMPLE.asByte() | Ascii.NAK));
        } else {
            byteArrayOutputStream.write((byte) (CBORMajorType.SIMPLE.asByte() | Ascii.DC4));
        }
    }

    public final void copydefault(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write((byte) (CBORMajorType.SIMPLE.asByte() | Ascii.SYN));
    }

    public final void OLrzqt(short s, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN).putShort(s).array());
    }

    public final void AEQbTJ(int i, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(i).array());
    }

    public final void KWHzl(long j, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN).putLong(j).array());
    }
}
