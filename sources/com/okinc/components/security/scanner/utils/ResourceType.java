package com.okinc.components.security.scanner.utils;

import androidx.core.view.InputDeviceCompat;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ResourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ResourceType[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final ResourceType NULL_TYPE = new ResourceType("NULL_TYPE", 0, 0);
    public static final ResourceType STRING_POOL = new ResourceType("STRING_POOL", 1, 1);
    public static final ResourceType TABLE = new ResourceType("TABLE", 2, 2);
    public static final ResourceType XML = new ResourceType("XML", 3, 3);
    public static final ResourceType XML_START_NAMESPACE = new ResourceType("XML_START_NAMESPACE", 4, 256);
    public static final ResourceType XML_END_NAMESPACE = new ResourceType("XML_END_NAMESPACE", 5, 257);
    public static final ResourceType XML_START_ELEMENT = new ResourceType("XML_START_ELEMENT", 6, 258);
    public static final ResourceType XML_END_ELEMENT = new ResourceType("XML_END_ELEMENT", 7, 259);
    public static final ResourceType XML_CDATA = new ResourceType("XML_CDATA", 8, 260);
    public static final ResourceType XML_LAST_CHUNK = new ResourceType("XML_LAST_CHUNK", 9, 383);
    public static final ResourceType XML_RESOURCE_MAP = new ResourceType("XML_RESOURCE_MAP", 10, MLKEMEngine.KyberPolyBytes);
    public static final ResourceType TABLE_PACKAGE = new ResourceType("TABLE_PACKAGE", 11, 512);
    public static final ResourceType TABLE_TYPE = new ResourceType("TABLE_TYPE", 12, InputDeviceCompat.SOURCE_DPAD);
    public static final ResourceType TABLE_TYPE_SPEC = new ResourceType("TABLE_TYPE_SPEC", 13, 514);
    public static final ResourceType TABLE_LIBRARY = new ResourceType("TABLE_LIBRARY", 14, 515);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ResourceType[] $values() {
        return new ResourceType[]{NULL_TYPE, STRING_POOL, TABLE, XML, XML_START_NAMESPACE, XML_END_NAMESPACE, XML_START_ELEMENT, XML_END_ELEMENT, XML_CDATA, XML_LAST_CHUNK, XML_RESOURCE_MAP, TABLE_PACKAGE, TABLE_TYPE, TABLE_TYPE_SPEC, TABLE_LIBRARY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ResourceType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ResourceType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ResourceType[] resourceTypeArr$values = $values();
        $VALUES = resourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(resourceTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.security.scanner.utils.ResourceType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ResourceType OLrzqt(int i) {
            for (ResourceType resourceType : ResourceType.values()) {
                if (resourceType.getValue() == i) {
                    return resourceType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static ResourceType valueOf(String str) {
        return (ResourceType) Enum.valueOf(ResourceType.class, str);
    }

    public static ResourceType[] values() {
        return (ResourceType[]) $VALUES.clone();
    }
}
