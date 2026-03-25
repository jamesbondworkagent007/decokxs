package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import o.C5619Yr;
import o.InterfaceC5501Ue;

/* JADX INFO: loaded from: classes21.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private transient EnumMap<?, InterfaceC5501Ue> _asMap;
    private final Class<Enum<?>> _enumClass;
    private final InterfaceC5501Ue[] _textual;
    private final Enum<?>[] _values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    private EnumValues(Class<Enum<?>> cls, InterfaceC5501Ue[] interfaceC5501UeArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = interfaceC5501UeArr;
    }

    public static EnumValues construct(SerializationConfig serializationConfig, Class<Enum<?>> cls) {
        if (serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            return constructFromToString(serializationConfig, cls);
        }
        return constructFromName(serializationConfig, cls);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsKWHzl = C5619Yr.KWHzl((Class<?>) cls);
        Enum<?>[] enumArr = (Enum[]) clsKWHzl.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] strArrFindEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(clsKWHzl, enumArr, new String[enumArr.length]);
        InterfaceC5501Ue[] interfaceC5501UeArr = new InterfaceC5501Ue[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r5 = enumArr[i];
            String strName = strArrFindEnumValues[i];
            if (strName == null) {
                strName = r5.name();
            }
            interfaceC5501UeArr[r5.ordinal()] = mapperConfig.compileString(strName);
        }
        return construct(cls, interfaceC5501UeArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) C5619Yr.KWHzl((Class<?>) cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r0 : enumArr) {
            arrayList.add(r0.toString());
        }
        return construct(mapperConfig, cls, arrayList);
    }

    public static EnumValues construct(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        InterfaceC5501Ue[] interfaceC5501UeArr = new InterfaceC5501Ue[size];
        for (int i = 0; i < size; i++) {
            interfaceC5501UeArr[i] = mapperConfig.compileString(list.get(i));
        }
        return construct(cls, interfaceC5501UeArr);
    }

    public static EnumValues construct(Class<Enum<?>> cls, InterfaceC5501Ue[] interfaceC5501UeArr) {
        return new EnumValues(cls, interfaceC5501UeArr);
    }

    public InterfaceC5501Ue serializedValueFor(Enum<?> r2) {
        return this._textual[r2.ordinal()];
    }

    public Collection<InterfaceC5501Ue> values() {
        return Arrays.asList(this._textual);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public EnumMap<?, InterfaceC5501Ue> internalMap() {
        EnumMap<?, InterfaceC5501Ue> enumMap = this._asMap;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> r4 : this._values) {
            linkedHashMap.put(r4, this._textual[r4.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }
}
